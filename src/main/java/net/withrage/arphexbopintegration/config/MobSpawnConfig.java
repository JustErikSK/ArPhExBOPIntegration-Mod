package net.withrage.arphexbopintegration.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.List;

public class MobSpawnConfig {
    public final ForgeConfigSpec.BooleanValue enabled;
    public final ForgeConfigSpec.ConfigValue<List<? extends String>> allowedBiomes;
    public final ForgeConfigSpec.IntValue spawnWeight;
    public final ForgeConfigSpec.IntValue minCount;
    public final ForgeConfigSpec.IntValue maxCount;

    public MobSpawnConfig(
            ForgeConfigSpec.Builder builder,
            String sectionName,
            List<String> defaultBiomes,
            int defaultWeight,
            int defaultMinCount,
            int defaultMaxCount
    ) {
        builder.push(sectionName);

        enabled = builder
                .comment("Whether biome-specific spawning is enabled for this mob.")
                .define("Enabled", true);

        allowedBiomes = builder
                .comment(
                        "Biome IDs where this mob may spawn.",
                        "Biome IDs from other mods may also be used."
                )
                .defineListAllowEmpty(
                        List.of("Allowed Biomes"),
                        defaultBiomes,
                        value -> value instanceof String
                );

        spawnWeight = builder
                .comment(
                        "The mob's spawn weight.",
                        "Higher values make the mob more common relative to other mobs."
                )
                .defineInRange("Spawn Weight", defaultWeight, 1, 1000);

        minCount = builder
                .comment("Minimum group size.")
                .defineInRange("Min Count", defaultMinCount, 1, 100);

        maxCount = builder
                .comment("Maximum group size.")
                .defineInRange("Max Count", defaultMaxCount, 1, 100);

        builder.pop();
    }
}