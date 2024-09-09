package com.monejo.monejomod.world.gen;

import com.monejo.monejomod.entity.ModEntities;
import com.monejo.monejomod.entity.custom.RaindropSlimeEntity;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntityGeneration {
    public static void addEntitySpawn() {
        BiomeModifications.addSpawn(BiomeSelectors.foundInOverworld(), SpawnGroup.MONSTER, ModEntities.RAINDROP_SLIME, 50, 1, 2);
        SpawnRestriction.register(ModEntities.RAINDROP_SLIME, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, RaindropSlimeEntity::canSpawn);
    }
}
