package com.monejo.monejomod.particle;

import com.monejo.monejomod.MonejoMod;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final DefaultParticleType RAINDROP_SLIME_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType YELLOW_BIRCH_LEAVES = FabricParticleTypes.simple();
    public static final DefaultParticleType DWARF_FIRE_FLAME = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(MonejoMod.MOD_ID, "raindrop_slime_particle"),
                RAINDROP_SLIME_PARTICLE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(MonejoMod.MOD_ID, "yellow_birch_leaves"), YELLOW_BIRCH_LEAVES);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(MonejoMod.MOD_ID, "dwarf_fire_flame"), DWARF_FIRE_FLAME);
    }
}
