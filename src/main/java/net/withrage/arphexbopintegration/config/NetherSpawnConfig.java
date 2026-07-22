package net.withrage.arphexbopintegration.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NetherSpawnConfig {
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.BooleanValue ENABLE_INTEGRATION;

    public static final Map<String, MobSpawnConfig> MOB_CONFIGS =
            new LinkedHashMap<>();

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.push("General");

        ENABLE_INTEGRATION = builder
                .comment("Enables all configured ArPhEx modded biome spawns for the Nether.")
                .define("Enable Integration", true);

        builder.pop();

        builder.push("Mob Specific Spawns");

        builder.comment(
                "THE NETHER",
                "",
                " You can use basically any modded world generation with this config, just add new lines with biomes from the mod you're using.",
                " Has to look like this -> modId:biomeId -> so for example biomesoplenty:undergrowth",
                " You can easily find the modId and biomeId using the in-game /locate command",
                "",
                " Some info for each config section:",
                " Enabled: Whether biome-specific spawning is enabled for this mob.",
                " Allowed Biomes: Biome IDs where this mob may spawn. Biome IDs from other mods may also be used.",
                " Spawn Weight: The mob's spawn weight. Higher values make the mob more common relative to other mobs.",
                " Min Count: Minimum group size.",
                " Max Count: Maximum group size.",
                ""
        );

        // Ant Arsonist
        addMob(
                builder,
                "ant_arsonist",
                List.of(
                        "biomesoplenty:undergrowth"
                ),
                4,
                1,
                2
        );

        // Centipede Evictor Larvae
        addMob(
                builder,
                "centipede_evictor_larvae",
                List.of(
                        "biomesoplenty:visceral_heap",
                        "biomesoplenty:erupting_inferno",
                        "biomesoplenty:withered_abyss"
                ),
                6,
                1,
                1
        );

        // Centipede Stalker
        addMob(
                builder,
                "centipede_stalker",
                List.of(
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:crystalline_chasm"
                ),
                6,
                1,
                1
        );

        // Fly Festerer
        addMob(
                builder,
                "fly_festerer",
                List.of(
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:crystalline_chasm"
                ),
                24,
                1,
                2
        );

        // Long Legs
        addMob(
                builder,
                "long_legs",
                List.of(
                        "biomesoplenty:crystalline_chasm",
                        "biomesoplenty:withered_abyss"
                ),
                24,
                1,
                2
        );

        // Maggot Larvae
        addMob(
                builder,
                "maggot_larvae",
                List.of(
                        "biomesoplenty:withered_abyss"
                ),
                8,
                1,
                2
        );

        // Millipede Marauder
        addMob(
                builder,
                "millipede_marauder",
                List.of(
                        "biomesoplenty:undergrowth"
                ),
                16,
                1,
                1
        );

        // Mosquito Morbidity
        addMob(
                builder,
                "mosquito_morbidity",
                List.of(
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:crystalline_chasm"
                ),
                16,
                1,
                1
        );

        // Moth Moontracker
        addMob(
                builder,
                "moth_moontracker",
                List.of(
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:crystalline_chasm"
                ),
                4,
                1,
                2
        );

        // Roach Riverspawn
        addMob(
                builder,
                "roach_riverspawn",
                List.of(
                        "biomesoplenty:crystalline_chasm",
                        "biomesoplenty:withered_abyss"
                ),
                8,
                1,
                2
        );

        // Scorpion Striker
        addMob(
                builder,
                "scorpion_striker",
                List.of(
                        "biomesoplenty:crystalline_chasm"
                ),
                8,
                1,
                1
        );

        // Silverfish Spectre
        addMob(
                builder,
                "silverfish_spectre",
                List.of(
                        "biomesoplenty:undergrowth"
                ),
                16,
                1,
                4
        );

        // Spider Flat
        addMob(
                builder,
                "spider_flat",
                List.of(
                        "biomesoplenty:withered_abyss",
                        "biomesoplenty:visceral_heap",
                        "biomesoplenty:erupting_inferno"
                ),
                4,
                1,
                1
        );

        // Spider Larvae
        addMob(
                builder,
                "spider_larvae",
                List.of(
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:crystalline_chasm"
                ),
                16,
                1,
                2
        );

        builder.pop();

        SPEC = builder.build();
    }

    private static void addMob(
            ForgeConfigSpec.Builder builder,
            String mobId,
            List<String> defaultBiomes,
            int defaultWeight,
            int defaultMinCount,
            int defaultMaxCount
    ) {
        MOB_CONFIGS.put(
                mobId,
                new MobSpawnConfig(
                        builder,
                        mobId,
                        defaultBiomes,
                        defaultWeight,
                        defaultMinCount,
                        defaultMaxCount
                )
        );
    }
}