package com.monejo.monejomod.data;

import com.monejo.monejomod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //BlockStateModelGenerator.BlockTexturePool DwarfBrickpool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DWARFSTONE_BRICKS);
        //DwarfBrickpool.stairs(ModBlocks.DWARFSTONE_BRICKS_STAIRS);
        //DwarfBrickpool.slab(ModBlocks.DWARFSTONE_BRICKS_SLAB);
        //DwarfBrickpool.wall(ModBlocks.DWARFSTONE_BRICKS_WALL);
        //BlockStateModelGenerator.BlockTexturePool DwarfBrickpool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DWARFSTONE);
        //DwarfBrickpool.stairs(ModBlocks.DWARFSTONE_STAIRS);
        //DwarfBrickpool.slab(ModBlocks.DWARFSTONE_SLAB);
        //DwarfBrickpool.wall(ModBlocks.DWARFSTONE_WALL);
        //blockStateModelGenerator.registerCampfire(ModBlocks.DWARF_CAMPFIRE);
        blockStateModelGenerator.registerLantern(ModBlocks.DWARF_LANTERN);




    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {


    }
}
