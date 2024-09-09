package com.monejo.monejomod.util;

import com.monejo.monejomod.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.WEIRWOOD_LOG, ModBlocks.STRIPPED_WEIRWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.WEIRWOOD_WOOD, ModBlocks.STRIPPED_WEIRWOOD_WOOD);
    }
}
