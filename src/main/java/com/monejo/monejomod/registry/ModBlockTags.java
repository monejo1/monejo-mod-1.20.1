package com.monejo.monejomod.registry;

import com.mojang.datafixers.types.templates.Tag;
import com.monejo.monejomod.MonejoMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class ModBlockTags {
    public static class Blocks {
        public static final TagKey<Block> DWARF_FIRE_BASE_BLOCKS =
                createTag("dwarf_fire_base_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(MonejoMod.MOD_ID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(MonejoMod.MOD_ID, name));
        }
    }
}

