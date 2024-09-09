package com.monejo.monejomod;

import com.monejo.monejomod.block.ModBlocks;
import com.monejo.monejomod.entity.ModBlockEntities;
import com.monejo.monejomod.entity.ModEntities;
import com.monejo.monejomod.entity.custom.DwarfEntity;
import com.monejo.monejomod.entity.custom.RaindropSlimeEntity;
import com.monejo.monejomod.item.ModItems;
import com.monejo.monejomod.particle.ModParticles;
import com.monejo.monejomod.util.ModFlammableBlocks;
import com.monejo.monejomod.util.ModStrippableBlocks;
import com.monejo.monejomod.world.biome.OverworldRegion1;
import com.monejo.monejomod.world.feature.ModConfiguredFeatures;
import com.monejo.monejomod.world.gen.ModEntityGeneration;
import com.monejo.monejomod.world.gen.ModTreeGeneration;
import com.monejo.monejomod.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.RegionType;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class MonejoMod implements ModInitializer, TerraBlenderApi {
	public static final String MOD_ID = "monejomod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onTerraBlenderInitialized() {
		Regions.register(new OverworldRegion1(new Identifier(MonejoMod.MOD_ID, "overworld_1"), RegionType.OVERWORLD, 2));
	}

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		FabricDefaultAttributeRegistry.register(ModEntities.RAINDROP_SLIME, RaindropSlimeEntity.createRainDropSlimeAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.DWARF, DwarfEntity.setAttributes());
		ModWorldGen.generateWorldGen();
		ModParticles.registerParticles();
		ModFlammableBlocks.registerFlammableBlocks();
		ModStrippableBlocks.registerStrippables();
		ModBlockEntities.registerBlockEntities();


		LOGGER.info("Hello Fabric world!");
	}
}