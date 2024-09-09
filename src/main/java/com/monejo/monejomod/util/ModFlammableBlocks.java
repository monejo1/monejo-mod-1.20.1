package com.monejo.monejomod.util;

import com.monejo.monejomod.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;


public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.WEIRWOOD_LOG, 5, 5);
        registry.add(ModBlocks.WEIRWOOD_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_WEIRWOOD_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_WEIRWOOD_WOOD, 5, 5);

        registry.add(ModBlocks.WEIRWOOD_PLANKS, 5, 20);
        registry.add(ModBlocks.WEIRWOOD_LEAVES, 30, 60);
    }
}
