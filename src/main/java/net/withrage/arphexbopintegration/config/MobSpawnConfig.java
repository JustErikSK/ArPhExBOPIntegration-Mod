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
                .define("Enabled", true);

        allowedBiomes = builder
                .defineListAllowEmpty(
                        List.of("Allowed Biomes"),
                        defaultBiomes,
                        value -> value instanceof String
                );

        spawnWeight = builder
                .defineInRange("Spawn Weight", defaultWeight, 1, 1000);

        minCount = builder
                .defineInRange("Min Count", defaultMinCount, 1, 100);

        maxCount = builder
                .defineInRange("Max Count", defaultMaxCount, 1, 100);

        builder.pop();
    }
}