package net.withrage.arphexbopintegration.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.List;

public class MobSpawnConfig {
    public final ForgeConfigSpec.BooleanValue enabled;
    public final ForgeConfigSpec.ConfigValue<List<? extends String>> allowedBiomes;
    public final ForgeConfigSpec.IntValue spawnWeight;
    public final ForgeConfigSpec.IntValue minCount;
    public final ForgeConfigSpec.IntValue maxCount;

    public MobSpawnConfig(ForgeConfigSpec.Builder builder,
                          String mobId,
                          List<String> defaultBiomes,
                          int defaultWeight,
                          int defaultMin,
                          int defaultMax) {

        builder.push(mobId);

        enabled = builder
                .comment("Enable biome-specific spawning for this mob.")
                .define("Enabled", true);

        allowedBiomes = builder
                .comment("List of biome IDs where this mob can spawn.")
                .defineListAllowEmpty(
                        List.of("Allowed Biomes"),
                        defaultBiomes,
                        obj -> obj instanceof String
                );

        spawnWeight = builder
                .comment("Spawn weight.")
                .defineInRange("Spawn Weight", defaultWeight, 1, Integer.MAX_VALUE);

        minCount = builder
                .comment("Minimum group size.")
                .defineInRange("Min Count", defaultMin, 1, Integer.MAX_VALUE);

        maxCount = builder
                .comment("Maximum group size.")
                .defineInRange("Max Count", defaultMax, 1, Integer.MAX_VALUE);

        builder.pop();
    }
}
