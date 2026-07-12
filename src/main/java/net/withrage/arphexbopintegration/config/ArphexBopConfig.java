package net.withrage.arphexbopintegration.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ArphexBopConfig {
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.BooleanValue ENABLE_INTEGRATION;

    public static final Map<String, MobSpawnConfig> MOB_CONFIGS =
            new LinkedHashMap<>();

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.push("General");

        ENABLE_INTEGRATION = builder
                .comment("Enables all configured ArPhEx biome spawns.")
                .define("Enable Integration", true);

        builder.pop();

        builder.push("Mob Specific Spawns");

        addMob(
                builder,
                "spider_snatcher",
                List.of(
                        "biomesoplenty:ominous_woods"
                ),
                32
        );

        addMob(
                builder,
                "spider_jump",
                List.of(
                        "biomesoplenty:rainforest"
                ),
                8
        );

        builder.pop();

        SPEC = builder.build();
    }

    private static void addMob(
            ForgeConfigSpec.Builder builder,
            String mobId,
            List<String> defaultBiomes,
            int defaultWeight
    ) {
        MOB_CONFIGS.put(
                mobId,
                new MobSpawnConfig(
                        builder,
                        mobId,
                        defaultBiomes,
                        defaultWeight
                )
        );
    }
}