package com.monejo.monejomod.entity;

import com.monejo.monejomod.MonejoMod;
import com.monejo.monejomod.entity.custom.DwarfEntity;
import com.monejo.monejomod.entity.custom.RaindropSlimeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.client.render.entity.SlimeEntityRenderer;
import net.minecraft.client.render.entity.MagmaCubeEntityRenderer;

public class ModEntities {
    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> type) {
        return Registry.register(Registries.ENTITY_TYPE, id, type.build(id));
    }
    public static final EntityType<RaindropSlimeEntity> RAINDROP_SLIME = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(MonejoMod.MOD_ID, "raindrop_slime"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, RaindropSlimeEntity::new)
                    .dimensions(EntityDimensions.changing(2.04f, 2.04f)).build());
    public static final EntityType<DwarfEntity> DWARF = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MonejoMod.MOD_ID, "dwarf"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,
                    DwarfEntity::new).dimensions(EntityDimensions.fixed(0.51f, 1.7f)).build());

}
