package net.withrage.arphexbopintegration.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.List;

public class ArphexBopConfig {
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.BooleanValue ENABLE_BOP_INTEGRATION;
    public static final ForgeConfigSpec.BooleanValue USE_ARPHEX_SPAWNRATE_MULTIPLIER;
    public static final ForgeConfigSpec.BooleanValue LOG_MISSING_BIOMES;

    public static final MobSpawnConfig SPIDER_SNATCHER;
    public static final MobSpawnConfig JUMPING_SPIDER;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.push("General");

        ENABLE_BOP_INTEGRATION = builder
                .comment("Enable ArPhEx Biomes O' Plenty spawn integration.")
                .define("Enable BOP Integration", true);

        USE_ARPHEX_SPAWNRATE_MULTIPLIER = builder
                .comment("If true, this addon will attempt to scale spawn weights using ArPhEx's global biome-specific spawnrate config.")
                .define("Use ArPhEx Global Spawnrate Multiplier", true);

        LOG_MISSING_BIOMES = builder
                .comment("Logs warnings when a configured biome ID does not exist.")
                .define("Log Missing Biomes", true);

        builder.pop();

        SPEC = builder.build();

        builder.push("MobSpecificSpawns");

        SPIDER_SNATCHER = new MobSpawnConfig(
                builder,
                "spider_snatcher",
                List.of(
                        "biomesoplenty:rainforest",
                        "biomesoplenty:ominous_woods"
                ),
                10,
                1,
                1
        );

        JUMPING_SPIDER = new MobSpawnConfig(
                builder,
                "jumping_spider",
                List.of(
                        "biomesoplenty:rainforest",
                        "biomesoplenty:ominous_woods"
                ),
                10,
                1,
                1
        );

        builder.pop();
    }
}