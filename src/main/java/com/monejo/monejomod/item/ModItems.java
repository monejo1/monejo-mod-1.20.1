package com.monejo.monejomod.item;

import com.monejo.monejomod.MonejoMod;
import com.monejo.monejomod.block.ModBlocks;
import com.monejo.monejomod.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;


public class ModItems {

    public static final Item DWARF_TORCH = registerItem("dwarf_torch_item", new VerticallyAttachableBlockItem(ModBlocks.DWARF_TORCH, ModBlocks.DWARF_WALL_TORCH, new Item.Settings(), Direction.DOWN));

    public static final Item BlueSlime = registerItem("blueslime", new Item(new FabricItemSettings()));
    public static final Item RawAmber = registerItem("raw_amber", new Item(new FabricItemSettings()));
    public static final Item RainDropSlime_SpawnEgg = registerItem("raindrop_slime_spawn_egg",
            new SpawnEggItem(ModEntities.RAINDROP_SLIME, 0x049AFF, 0x0C71BD, new FabricItemSettings()));
    public static final Item DWARF_SpawnEgg = registerItem("dwarf_spawn_egg",
            new SpawnEggItem(ModEntities.DWARF, 0xA77F52, 0XF0B674, new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(BlueSlime);
        entries.add(RawAmber);
        entries.add(ModBlocks.blue_slime_bricks);
        entries.add(ModBlocks.RAW_AMBER_BLOCK);
        entries.add(ModBlocks.AMBER_ORE);
        entries.add(ModBlocks.RAINDROP_SLIME_BLOCK);
        entries.add(ModItems.RainDropSlime_SpawnEgg);
        entries.add(ModBlocks.BLUE_SLIME_BRICKS_SLAB);
        entries.add(ModBlocks.BLUE_SLIME_BRICKS_STAIRS);
        entries.add(ModBlocks.BLUE_SLIME_BRICKS_WALL);
        entries.add(ModBlocks.SLIME_BRICKS);
        entries.add(ModBlocks.WEIRWOOD_LEAVES);
        entries.add(ModBlocks.WEIRWOOD_PLANKS);
        entries.add(ModBlocks.WEIRWOOD_WOOD);
        entries.add(ModBlocks.WEIRWOOD_LOG);
        entries.add(ModBlocks.WEIRWOOD_SAPLING);
        entries.add(ModBlocks.STRIPPED_WEIRWOOD_LOG);
        entries.add(ModBlocks.STRIPPED_WEIRWOOD_WOOD);
        entries.add(ModBlocks.YELLOW_LEAVES);
        entries.add(ModBlocks.CARNATION);
        entries.add(ModBlocks.DWARFSTONE_BRICKS);
        entries.add(ModBlocks.DWARFSTONE_BRICKS_SLAB);
        entries.add(ModBlocks.DWARFSTONE_BRICKS_STAIRS);
        entries.add(ModBlocks.DWARFSTONE_BRICKS_WALL);
        entries.add(ModBlocks.POLISHED_DWARFSTONE);
        entries.add(ModBlocks.POLISHED_DWARFSTONE_SLAB);
        entries.add(ModBlocks.POLISHED_DWARFSTONE_WALL);
        entries.add(ModBlocks.POLISHED_DWARFSTONE_STAIRS);
        entries.add(ModBlocks.DWARFSTONE_STAIRS);
        entries.add(ModBlocks.DWARFSTONE);
        entries.add(ModBlocks.DWARFSTONE_SLAB);
        entries.add(ModBlocks.DWARFSTONE_WALL);
        entries.add(ModBlocks.DWARF_CAMPFIRE);
        entries.add(ModBlocks.DWARF_LANTERN);
        entries.add(DWARF_TORCH);
        entries.add(DWARF_SpawnEgg);
    }

    private static void addItemsToBuildingTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.blue_slime_bricks);
        entries.add(ModBlocks.RAW_AMBER_BLOCK);
        entries.add(ModBlocks.AMBER_ORE);
        entries.add(ModBlocks.RAINDROP_SLIME_BLOCK);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MonejoMod.MOD_ID, name), item);
    }



    public static void registerModItems() {
        MonejoMod.LOGGER.info("Registering Mod Items for " + MonejoMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingTabItemGroup);
    }
}
