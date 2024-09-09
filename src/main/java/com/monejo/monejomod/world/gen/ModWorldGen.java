package com.monejo.monejomod.world.gen;

public class ModWorldGen {
    public static void generateWorldGen() {

        ModEntityGeneration.addEntitySpawn();
        ModTreeGeneration.generateTrees();
        ModFlowerGeneration.generateFlowers();
    }
}
