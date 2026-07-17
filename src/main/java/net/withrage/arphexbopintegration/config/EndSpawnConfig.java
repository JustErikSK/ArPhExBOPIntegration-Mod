package net.withrage.arphexbopintegration.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EndSpawnConfig {
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.BooleanValue ENABLE_INTEGRATION;

    public static final Map<String, MobSpawnConfig> MOB_CONFIGS =
            new LinkedHashMap<>();

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.push("General");

        ENABLE_INTEGRATION = builder
                .comment("Enables all configured ArPhEx modded biome spawns for the End.")
                .define("Enable Integration", true);

        builder.pop();

        builder.push("Mob Specific Spawns");

        builder.comment(
                "THE END",
                "",
                " You can use basically any modded world generation with this config, just add new lines with biomes from the mod you're using.",
                " Has to look like this -> modId:biomeId -> so for example biomesoplenty:end_reef",
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

        // Bloodworm
        addMob(
                builder,
                "blood_worm",
                List.of(
                        "biomesoplenty:end_wilds"
                ),
                8,
                1,
                4
        );

        // Silverfish Spectre
        addMob(
                builder,
                "silverfish_spectre",
                List.of(
                        "biomesoplenty:end_reef",
                        "biomesoplenty:end_wilds"
                ),
                8,
                1,
                4
        );

        // Wasp Nemesis
        addMob(
                builder,
                "wasp_nemesis",
                List.of(
                        "biomesoplenty:end_reef",
                        "biomesoplenty:end_wilds"
                ),
                2,
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