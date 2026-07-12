package net.withrage.arphexbopintegration.world;

import com.mojang.serialization.Codec;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.withrage.arphexbopintegration.ArphexBopIntegration;

public class ModBiomeModifiers {
    public static final DeferredRegister<Codec<? extends BiomeModifier>> SERIALIZERS =
            DeferredRegister.create(
                    ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS,
                    ArphexBopIntegration.MOD_ID
            );

    public static final RegistryObject<Codec<ConfiguredArphexSpawnsBiomeModifier>>
            CONFIGURED_ARPHEX_SPAWNS = SERIALIZERS.register(
            "configured_arphex_spawns",
            () -> ConfiguredArphexSpawnsBiomeModifier.CODEC
    );

    private ModBiomeModifiers() {
    }
}