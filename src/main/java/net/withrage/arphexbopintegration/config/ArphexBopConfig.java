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

        // Ant Arsonist
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Beetle Bulwark
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Beetle Tick Mite
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Bloodworm
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Butterfly Bewitcher
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Butterfly Bewitcher Giant
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Centipede Evictor
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Centipede Evictor Larvae
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Centipede Stalker
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Crab Constrictor
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Dragonfly Dreadnought
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Fly Festerer
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Hornet Harbinger
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Hornet Harbinger Giant
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Invisible Stalker
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Locust Landscourge
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Long Legs
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Long Legs Fly
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Maggot Larvae
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Mantis Mutilator
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Millipede Marauder
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Mosquito Morbidity
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Moth Moontracker
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Roach Riverspawn
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Scorpion Striker
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Silverfish Spectre
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Sky Stalker
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Solifuge Skulker
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Ambusher
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Brood
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Flat
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Funnel
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Goliath
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Infestor
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Jump
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Larvae
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Lunger
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Lurker
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Obstructer
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Prowler
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Reaper
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Recluse
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Sinker
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Spider Snatcher
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Termite Tunneler Worker
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
        );

        // Venus Flytrap
        addMob(
                builder,
                "",
                List.of(
                        ""
                ),
                1,
                1,
                1
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