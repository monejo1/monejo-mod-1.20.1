package com.monejo.monejomod.world.biome;

import com.monejo.monejomod.MonejoMod;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModBiomes {

    public static final RegistryKey<Biome> YELLOWBIRCH_FOREST = register("yellowbirch_forest");

    private static RegistryKey<Biome> register(String name)
    {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(MonejoMod.MOD_ID, name));
    }


}
