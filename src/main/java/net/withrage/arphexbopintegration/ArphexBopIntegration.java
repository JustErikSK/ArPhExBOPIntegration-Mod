package net.withrage.arphexbopintegration;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.withrage.arphexbopintegration.config.ArphexBopConfig;
import net.withrage.arphexbopintegration.world.ModBiomeModifiers;
import org.slf4j.Logger;

@Mod(ArphexBopIntegration.MOD_ID)
public class ArphexBopIntegration {
    public static final String MOD_ID = "arphex_bop_integration";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ArphexBopIntegration() {
        IEventBus modEventBus =
                FMLJavaModLoadingContext.get().getModEventBus();

        ModBiomeModifiers.SERIALIZERS.register(modEventBus);

        ModLoadingContext.get().registerConfig(
                ModConfig.Type.COMMON,
                ArphexBopConfig.SPEC,
                "arphex_bop_integration.toml"
        );
    }
}