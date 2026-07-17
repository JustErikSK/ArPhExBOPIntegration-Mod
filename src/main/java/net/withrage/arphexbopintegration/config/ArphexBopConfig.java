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
                .comment("Enables all configured ArPhEx modded biome spawns.")
                .define("Enable Integration", true);

        builder.pop();

        builder.push("Mob Specific Spawns");

        builder.comment(
                " You can use basically any modded world generation with this config, just add new lines with biomes from the mod you're using.",
                " Has to look like this -> modId:biomeId -> so for example biomesoplenty:wasteland",
                " You can easily find the modId and biomeId using the in-game /locate command",
                "",
                " Some info for each config section:",
                " Enabled: Whether biome-specific spawning is enabled for this mob.",
                " Allowed Biomes: Biome IDs where this mob may spawn. Biome IDs from other mods may also be used.",
                " Spawn Weight: The mob's spawn weight. Higher values make the mob more common relative to other mobs.",
                " Min Count: Minimum group size.",
                " Max Count: Maximum group size.",
                "",
                " Lastly, I recommend using CTRL+F to find the mob you want as this config file is quite long.",
                ""
        );

        // Ant Arsonist
        addMob(
                builder,
                "ant_arsonist",
                List.of(
                        "biomesoplenty:wasteland",
                        "biomesoplenty:wasteland_steppe",
                        "biomesoplenty:dryland",
                        "biomesoplenty:dune_beach",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:woodland",
                        "biomesoplenty:forested_field"
                ),
                8,
                2,
                25
        );

        // Beetle Bulwark
        addMob(
                builder,
                "beetle_bulwark",
                List.of(
                        "biomesoplenty:crystalline_chasm",
                        "biomesoplenty:glowing_grotto",
                        "biomesoplenty:fungal_jungle",
                        "biomesoplenty:withered_abyss",
                        "biomesoplenty:ominous_woods",
                        "biomesoplenty:fir_clearing",
                        "biomesoplenty:snowblossom_grove",
                        "biomesoplenty:highland",
                        "biomesoplenty:rainforest"
                ),
                128,
                1,
                2
        );

        // Beetle Tick Mite
        addMob(
                builder,
                "beetle_tick_mite",
                List.of(
                        "biomesoplenty:crystalline_chasm",
                        "biomesoplenty:glowing_grotto",
                        "biomesoplenty:fungal_jungle",
                        "biomesoplenty:withered_abyss",
                        "biomesoplenty:ominous_woods",
                        "biomesoplenty:fir_clearing",
                        "biomesoplenty:snowblossom_grove",
                        "biomesoplenty:highland",
                        "biomesoplenty:rainforest"
                ),
                16,
                1,
                20
        );

        // Bloodworm
        addMob(
                builder,
                "blood_worm",
                List.of(
                        "biomesoplenty:bog",
                        "biomesoplenty:marsh",
                        "biomesoplenty:muskeg",
                        "biomesoplenty:wetland",
                        "biomesoplenty:visceral_heap"
                ),
                24,
                2,
                6
        );

        // Butterfly Bewitcher
        addMob(
                builder,
                "butterfly_bewitcher",
                List.of(
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:woodland",
                        "biomesoplenty:forested_field",
                        "biomesoplenty:seasonal_forest",
                        "biomesoplenty:ominous_woods",
                        "biomesoplenty:old_growth_dead_forest",
                        "biomesoplenty:spider_nest"
                ),
                16,
                1,
                10
        );

        // Butterfly Bewitcher Giant
        addMob(
                builder,
                "butterfly_bewitcher_giant",
                List.of(
                        "biomesoplenty:auroral_garden",
                        "biomesoplenty:lavender_forest",
                        "biomesoplenty:mystic_grove",
                        "biomesoplenty:rainforest"
                ),
                4,
                1,
                1
        );

        // Centipede Evictor
        addMob(
                builder,
                "centipede_evictor",
                List.of(
                        "biomesoplenty:fungal_jungle",
                        "biomesoplenty:glowing_grotto",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:wetland"
                ),
                8,
                1,
                1
        );

        // Centipede Evictor Larvae
        addMob(
                builder,
                "centipede_evictor_larvae",
                List.of(
                        "biomesoplenty:dune_beach",
                        "biomesoplenty:woodland",
                        "biomesoplenty:forested_field",
                        "biomesoplenty:seasonal_forest",
                        "biomesoplenty:visceral_heap",
                        "biomesoplenty:erupting_inferno",
                        "biomesoplenty:withered_abyss",
                        "biomesoplenty:volcanic_plains",
                        "biomesoplenty:ominous_woods"
                ),
                32,
                1,
                1
        );

        // Centipede Stalker
        addMob(
                builder,
                "centipede_stalker",
                List.of(
                        "biomesoplenty:wasteland",
                        "biomesoplenty:wasteland_steppe",
                        "biomesoplenty:dryland",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:volcano",
                        "biomesoplenty:volcanic_plains",
                        "biomesoplenty:crystalline_chasm"
                ),
                16,
                1,
                1
        );

        // Crab Constrictor
        addMob(
                builder,
                "crab_constrictor",
                List.of(
                        "biomesoplenty:bayou",
                        "biomesoplenty:dune_beach",
                        "biomesoplenty:floodplain",
                        "biomesoplenty:marsh",
                        "biomesoplenty:wetland"
                ),
                16,
                1,
                3
        );

        // Dragonfly Dreadnought
        addMob(
                builder,
                "dragonfly_dreadnought",
                List.of(
                        "biomesoplenty:bayou",
                        "biomesoplenty:floodplain",
                        "biomesoplenty:marsh",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:wetland"
                ),
                8,
                1,
                2
        );

        // Fly Festerer
        addMob(
                builder,
                "fly_festerer",
                List.of(
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:volcano",
                        "biomesoplenty:volcanic_plains",
                        "biomesoplenty:crystalline_chasm",
                        "biomesoplenty:dune_beach",
                        "biomesoplenty:woodland",
                        "biomesoplenty:forested_field"
                ),
                48,
                4,
                7
        );

        // Hornet Harbinger
        addMob(
                builder,
                "hornet_harbinger",
                List.of(
                        "biomesoplenty:wasteland",
                        "biomesoplenty:wasteland_steppe",
                        "biomesoplenty:dryland",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:dune_beach",
                        "biomesoplenty:woodland",
                        "biomesoplenty:forested_field"
                ),
                8,
                1,
                4
        );

        // Hornet Harbinger Giant
        addMob(
                builder,
                "hornet_harbinger_giant",
                List.of(
                        "biomesoplenty:wasteland",
                        "biomesoplenty:wasteland_steppe",
                        "biomesoplenty:dryland",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:dune_beach",
                        "biomesoplenty:cold_desert",
                        "biomesoplenty:lush_desert"
                ),
                16,
                1,
                1
        );

        // Invisible Stalker
        addMob(
                builder,
                "invisible_stalker",
                List.of(
                        "biomesoplenty:wasteland",
                        "biomesoplenty:wasteland_steppe",
                        "biomesoplenty:dryland",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:dune_beach",
                        "biomesoplenty:woodland",
                        "biomesoplenty:forested_field"
                ),
                2,
                1,
                1
        );

        // Locust Landscourge
        addMob(
                builder,
                "locust_landscourge",
                List.of(
                        "biomesoplenty:dryland",
                        "biomesoplenty:grassland",
                        "biomesoplenty:lush_savanna",
                        "biomesoplenty:prairie",
                        "biomesoplenty:wasteland_steppe"
                ),
                16,
                5,
                40
        );

        // Long Legs
        addMob(
                builder,
                "long_legs",
                List.of(
                        "biomesoplenty:crystalline_chasm",
                        "biomesoplenty:glowing_grotto",
                        "biomesoplenty:fungal_jungle",
                        "biomesoplenty:withered_abyss",
                        "biomesoplenty:ominous_woods",
                        "biomesoplenty:fir_clearing",
                        "biomesoplenty:snowblossom_grove",
                        "biomesoplenty:highland",
                        "biomesoplenty:rainforest"
                ),
                48,
                1,
                20
        );

        // Long Legs Fly
        addMob(
                builder,
                "long_legs_fly",
                List.of(
                        "biomesoplenty:dune_beach",
                        "biomesoplenty:woodland",
                        "biomesoplenty:forested_field",
                        "biomesoplenty:seasonal_forest",
                        "biomesoplenty:visceral_heap",
                        "biomesoplenty:erupting_inferno",
                        "biomesoplenty:ominous_woods",
                        "biomesoplenty:old_growth_dead_forest",
                        "biomesoplenty:spider_nest"
                ),
                32,
                1,
                1
        );

        // Maggot Larvae
        addMob(
                builder,
                "maggot_larvae",
                List.of(
                        "biomesoplenty:withered_abyss",
                        "biomesoplenty:ominous_woods",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:rocky_rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:lush_savanna",
                        "biomesoplenty:scrubland",
                        "biomesoplenty:glowing_grotto",
                        "biomesoplenty:fungal_jungle"
                ),
                16,
                4,
                40
        );

        // Mantis Mutilator
        addMob(
                builder,
                "mantis_mutilator",
                List.of(
                        "biomesoplenty:rainforest",
                        "biomesoplenty:rocky_rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth"
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
                        "biomesoplenty:wasteland",
                        "biomesoplenty:wasteland_steppe",
                        "biomesoplenty:dryland",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:woodland",
                        "biomesoplenty:forested_field",
                        "biomesoplenty:seasonal_forest"
                ),
                32,
                1,
                1
        );

        // Mosquito Morbidity
        addMob(
                builder,
                "mosquito_morbidity",
                List.of(
                        "biomesoplenty:wasteland",
                        "biomesoplenty:wasteland_steppe",
                        "biomesoplenty:dryland",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:volcano",
                        "biomesoplenty:volcanic_plains",
                        "biomesoplenty:crystalline_chasm"
                ),
                32,
                1,
                1
        );

        // Moth Moontracker
        addMob(
                builder,
                "moth_moontracker",
                List.of(
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:volcano",
                        "biomesoplenty:volcanic_plains",
                        "biomesoplenty:crystalline_chasm",
                        "biomesoplenty:dune_beach",
                        "biomesoplenty:woodland",
                        "biomesoplenty:forested_field"
                ),
                8,
                1,
                4
        );

        // Roach Riverspawn
        addMob(
                builder,
                "roach_riverspawn",
                List.of(
                        "biomesoplenty:crystalline_chasm",
                        "biomesoplenty:glowing_grotto",
                        "biomesoplenty:fungal_jungle",
                        "biomesoplenty:withered_abyss",
                        "biomesoplenty:ominous_woods",
                        "biomesoplenty:fir_clearing",
                        "biomesoplenty:snowblossom_grove",
                        "biomesoplenty:highland",
                        "biomesoplenty:rainforest"
                ),
                16,
                1,
                10
        );

        // Scorpion Striker
        addMob(
                builder,
                "scorpion_striker",
                List.of(
                        "biomesoplenty:cold_desert",
                        "biomesoplenty:lush_desert",
                        "biomesoplenty:dryland",
                        "biomesoplenty:volcano",
                        "biomesoplenty:volcanic_plains",
                        "biomesoplenty:crystalline_chasm",
                        "biomesoplenty:wasteland",
                        "biomesoplenty:wasteland_steppe",
                        "biomesoplenty:dune_beach"
                ),
                16,
                1,
                2
        );

        // Silverfish Spectre
        addMob(
                builder,
                "silverfish_spectre",
                List.of(
                        "biomesoplenty:wasteland",
                        "biomesoplenty:wasteland_steppe",
                        "biomesoplenty:dryland",
                        "biomesoplenty:dune_beach",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:volcano",
                        "biomesoplenty:volcanic_plains"
                ),
                32,
                1,
                4
        );

        // Sky Stalker
        addMob(
                builder,
                "sky_stalker",
                List.of(
                        "biomesoplenty:field",
                        "biomesoplenty:grassland",
                        "biomesoplenty:pasture",
                        "biomesoplenty:prairie",
                        "biomesoplenty:lush_savanna",
                        "biomesoplenty:dryland",
                        "biomesoplenty:cold_desert",
                        "biomesoplenty:lush_desert",
                        "biomesoplenty:dune_beach"
                ),
                4,
                1,
                1
        );

        // Solifuge Skulker
        addMob(
                builder,
                "solifuge_skulker",
                List.of(
                        "biomesoplenty:cold_desert",
                        "biomesoplenty:dryland",
                        "biomesoplenty:lush_desert",
                        "biomesoplenty:wasteland",
                        "biomesoplenty:wasteland_steppe"
                ),
                32,
                1,
                1
        );

        // Spider Ambusher
        addMob(
                builder,
                "spider_ambusher",
                List.of(
                        "biomesoplenty:spider_nest",
                        "biomesoplenty:ominous_woods",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:rainforest"
                ),
                10,
                1,
                1
        );

        // Spider Brood
        addMob(
                builder,
                "spider_brood",
                List.of(
                        "biomesoplenty:wasteland",
                        "biomesoplenty:wasteland_steppe",
                        "biomesoplenty:dryland",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:dune_beach",
                        "biomesoplenty:woodland",
                        "biomesoplenty:forested_field"
                ),
                16,
                1,
                2
        );

        // Spider Flat
        addMob(
                builder,
                "spider_flat",
                List.of(
                        "biomesoplenty:lush_savanna",
                        "biomesoplenty:dryland",
                        "biomesoplenty:grassland",
                        "biomesoplenty:highland",
                        "biomesoplenty:rocky_shrubland",
                        "biomesoplenty:withered_abyss",
                        "biomesoplenty:ominous_woods",
                        "biomesoplenty:visceral_heap",
                        "biomesoplenty:erupting_inferno"
                ),
                8,
                1,
                1
        );

        // Spider Funnel
        addMob(
                builder,
                "spider_funnel",
                List.of(
                        "biomesoplenty:spider_nest",
                        "biomesoplenty:dryland",
                        "biomesoplenty:scrubland",
                        "biomesoplenty:wasteland_steppe"
                ),
                16,
                1,
                2
        );

        // Spider Goliath
        addMob(
                builder,
                "spider_goliath",
                List.of(
                        "biomesoplenty:spider_nest",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:rocky_rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:lush_savanna",
                        "biomesoplenty:scrubland",
                        "biomesoplenty:glowing_grotto",
                        "biomesoplenty:fungal_jungle"
                ),
                16,
                1,
                1
        );

        // Spider Infestor
        addMob(
                builder,
                "spider_infestor",
                List.of(
                        "biomesoplenty:spider_nest",
                        "biomesoplenty:ominous_woods",
                        "biomesoplenty:old_growth_dead_forest"
                ),
                8,
                1,
                1
        );

        // Spider Jump
        addMob(
                builder,
                "spider_jump",
                List.of(
                        "biomesoplenty:rainforest",
                        "biomesoplenty:rocky_rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:lush_savanna",
                        "biomesoplenty:coniferous_forest"
                ),
                8,
                1,
                1
        );

        // Spider Larvae
        addMob(
                builder,
                "spider_larvae",
                List.of(
                        "biomesoplenty:wasteland",
                        "biomesoplenty:wasteland_steppe",
                        "biomesoplenty:dryland",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:volcano",
                        "biomesoplenty:volcanic_plains",
                        "biomesoplenty:crystalline_chasm"
                ),
                32,
                2,
                7
        );

        // Spider Lunger
        addMob(
                builder,
                "spider_lunger",
                List.of(
                        "biomesoplenty:wasteland",
                        "biomesoplenty:wasteland_steppe",
                        "biomesoplenty:dryland",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:dune_beach",
                        "biomesoplenty:woodland",
                        "biomesoplenty:forested_field"
                ),
                24,
                1,
                4
        );

        // Spider Lurker
        addMob(
                builder,
                "spider_lurker",
                List.of(
                        "biomesoplenty:spider_nest",
                        "biomesoplenty:ominous_woods",
                        "biomesoplenty:glowing_grotto",
                        "biomesoplenty:undergrowth"
                ),
                12,
                1,
                1
        );

        // Spider Obstructer
        addMob(
                builder,
                "spider_obstructer",
                List.of(
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:woodland",
                        "biomesoplenty:forested_field",
                        "biomesoplenty:seasonal_forest",
                        "biomesoplenty:ominous_woods",
                        "biomesoplenty:old_growth_dead_forest",
                        "biomesoplenty:spider_nest"
                ),
                24,
                1,
                1
        );

        // Spider Prowler
        addMob(
                builder,
                "spider_prowler",
                List.of(
                        "biomesoplenty:spider_nest",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:rocky_rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:lush_savanna",
                        "biomesoplenty:scrubland",
                        "biomesoplenty:glowing_grotto",
                        "biomesoplenty:fungal_jungle"
                ),
                16,
                1,
                1
        );

        // Spider Reaper
        addMob(
                builder,
                "spider_reaper",
                List.of(
                        "biomesoplenty:spider_nest",
                        "biomesoplenty:woodland",
                        "biomesoplenty:seasonal_forest",
                        "biomesoplenty:maple_woods",
                        "biomesoplenty:forested_field"
                ),
                16,
                1,
                1
        );

        // Spider Recluse
        addMob(
                builder,
                "spider_recluse",
                List.of(
                        "biomesoplenty:wasteland",
                        "biomesoplenty:wasteland_steppe",
                        "biomesoplenty:dryland",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:tropics",
                        "biomesoplenty:undergrowth",
                        "biomesoplenty:dune_beach",
                        "biomesoplenty:woodland",
                        "biomesoplenty:forested_field"
                ),
                64,
                1,
                4
        );

        // Spider Sinker
        addMob(
                builder,
                "spider_sinker",
                List.of(
                        "biomesoplenty:dune_beach",
                        "biomesoplenty:woodland",
                        "biomesoplenty:forested_field",
                        "biomesoplenty:seasonal_forest",
                        "biomesoplenty:ominous_woods",
                        "biomesoplenty:old_growth_dead_forest",
                        "biomesoplenty:spider_nest",
                        "biomesoplenty:lavender_forest",
                        "biomesoplenty:mystic_grove"
                ),
                24,
                1,
                4
        );

        // Spider Snatcher
        addMob(
                builder,
                "spider_snatcher",
                List.of(
                        "biomesoplenty:ominous_woods",
                        "biomesoplenty:old_growth_dead_forest",
                        "biomesoplenty:spider_nest",
                        "biomesoplenty:withered_abyss"
                ),
                32,
                1,
                1
        );

        // Termite Tunneler Worker
        addMob(
                builder,
                "termite_tunneler_worker",
                List.of(
                        "biomesoplenty:dryland",
                        "biomesoplenty:scrubland",
                        "biomesoplenty:wasteland_steppe",
                        "biomesoplenty:woodland"
                ),
                24,
                3,
                10
        );

        // Venus Flytrap
        addMob(
                builder,
                "venus_flytrap",
                List.of(
                        "biomesoplenty:bayou",
                        "biomesoplenty:bog",
                        "biomesoplenty:fungal_jungle",
                        "biomesoplenty:rainforest",
                        "biomesoplenty:wetland"
                ),
                12,
                1,
                3
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