package net.withrage.arphexbopintegration.world;

import com.mojang.serialization.Codec;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.minecraftforge.registries.ForgeRegistries;
import net.withrage.arphexbopintegration.ArphexBopIntegration;
import net.withrage.arphexbopintegration.config.MobSpawnConfig;
import net.withrage.arphexbopintegration.config.NetherSpawnConfig;
import net.withrage.arphexbopintegration.config.OverworldSpawnConfig;

import java.util.List;
import java.util.Map;

public class ConfiguredArphexSpawnsBiomeModifier implements BiomeModifier {

    public static final Codec<ConfiguredArphexSpawnsBiomeModifier> CODEC =
            Codec.unit(ConfiguredArphexSpawnsBiomeModifier::new);

    @Override
    public void modify(
            Holder<Biome> biome,
            Phase phase,
            ModifiableBiomeInfo.BiomeInfo.Builder builder
    ) {
        if (phase != Phase.ADD) {
            return;
        }

        ResourceLocation biomeId = biome.unwrapKey()
                .map(key -> key.location())
                .orElse(null);

        if (biomeId == null) {
            return;
        }

        if (OverworldSpawnConfig.ENABLE_INTEGRATION.get()) {
            applySpawnConfigs(
                    biomeId,
                    builder,
                    OverworldSpawnConfig.MOB_CONFIGS
            );
        }

        if (NetherSpawnConfig.ENABLE_INTEGRATION.get()) {
            applySpawnConfigs(
                    biomeId,
                    builder,
                    NetherSpawnConfig.MOB_CONFIGS
            );
        }
    }

    private static void applySpawnConfigs(
            ResourceLocation biomeId,
            ModifiableBiomeInfo.BiomeInfo.Builder builder,
            Map<String, MobSpawnConfig> mobConfigs
    ) {
        for (Map.Entry<String, MobSpawnConfig> entry : mobConfigs.entrySet()) {
            String mobPath = entry.getKey();
            MobSpawnConfig config = entry.getValue();

            if (!config.enabled.get()) {
                continue;
            }

            if (!containsBiome(config.allowedBiomes.get(), biomeId)) {
                continue;
            }

            ResourceLocation entityId =
                    ResourceLocation.fromNamespaceAndPath("arphex", mobPath);

            EntityType<?> entityType =
                    ForgeRegistries.ENTITY_TYPES.getValue(entityId);

            if (entityType == null) {
                ArphexBopIntegration.LOGGER.warn(
                        "Could not find ArPhEx entity '{}'. Skipping its biome spawns.",
                        entityId
                );
                continue;
            }

            builder.getMobSpawnSettings().addSpawn(
                    MobCategory.MONSTER,
                    new MobSpawnSettings.SpawnerData(
                            entityType,
                            config.spawnWeight.get(),
                            config.minCount.get(),
                            config.maxCount.get()
                    )
            );
        }
    }

    private static boolean containsBiome(
            List<? extends String> configuredBiomes,
            ResourceLocation currentBiome
    ) {
        String currentBiomeId = currentBiome.toString();

        for (String configuredBiome : configuredBiomes) {
            if (currentBiomeId.equals(configuredBiome)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Codec<? extends BiomeModifier> codec() {
        return ModBiomeModifiers.CONFIGURED_ARPHEX_SPAWNS.get();
    }
}