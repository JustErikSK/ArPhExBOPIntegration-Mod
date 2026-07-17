package net.withrage.arphexbopintegration;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.withrage.arphexbopintegration.config.NetherSpawnConfig;
import net.withrage.arphexbopintegration.config.OverworldSpawnConfig;
import net.withrage.arphexbopintegration.world.ModBiomeModifiers;
import org.slf4j.Logger;

@Mod(ArphexBopIntegration.MOD_ID)
public class ArphexBopIntegration {
    public static final String MOD_ID = "arphexbopintegration";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ArphexBopIntegration() {
        IEventBus modEventBus =
                FMLJavaModLoadingContext.get().getModEventBus();

        ModBiomeModifiers.SERIALIZERS.register(modEventBus);

        ModLoadingContext.get().registerConfig(
                ModConfig.Type.COMMON,
                OverworldSpawnConfig.SPEC,
                "arphex_bop_integration-overworld.toml"
        );

        ModLoadingContext.get().registerConfig(
                ModConfig.Type.COMMON,
                NetherSpawnConfig.SPEC,
                "arphex_bop_integration-nether.toml"
        );
    }
}