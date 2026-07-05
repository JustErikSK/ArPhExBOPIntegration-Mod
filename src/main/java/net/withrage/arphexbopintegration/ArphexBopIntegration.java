package net.withrage.arphexbopintegration;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.withrage.arphexbopintegration.config.ArphexBopConfig;

@Mod(ArphexBopIntegration.MOD_ID)
public class ArphexBopIntegration {
    public static final String MOD_ID = "arphex_bop_integration";

    public ArphexBopIntegration() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ArphexBopConfig.SPEC);
    }
}