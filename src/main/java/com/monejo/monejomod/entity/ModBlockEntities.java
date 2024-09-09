package com.monejo.monejomod.entity;

import com.monejo.monejomod.MonejoMod;
import com.monejo.monejomod.block.ModBlocks;
import com.monejo.monejomod.entity.custom.DwarfCampfireBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.CampfireBlockEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<DwarfCampfireBlockEntity> DWARF_CAMPFIRE_ENTITY;
    public static void registerBlockEntities() {
        DWARF_CAMPFIRE_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(MonejoMod.MOD_ID, "dwarf_campfire_entity"),
                FabricBlockEntityTypeBuilder.create(DwarfCampfireBlockEntity::new,
                        ModBlocks.DWARF_CAMPFIRE).build());
    }
}
