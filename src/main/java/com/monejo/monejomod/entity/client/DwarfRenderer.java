package com.monejo.monejomod.entity.client;

import com.google.common.collect.Maps;
import com.monejo.monejomod.MonejoMod;
import com.monejo.monejomod.entity.custom.DwarfEntity;
import com.monejo.monejomod.entity.variant.DwarfVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;

public class DwarfRenderer extends GeoEntityRenderer<DwarfEntity> {
    public static final Map<DwarfVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(DwarfVariant.class), (map) -> {
                map.put(DwarfVariant.DEFAULT,
                        new Identifier(MonejoMod.MOD_ID, "textures/entity/dwarf/dwarf.png"));
                map.put(DwarfVariant.DWARF_1,
                        new Identifier(MonejoMod.MOD_ID, "textures/entity/dwarf/dwarf1.png"));
                map.put(DwarfVariant.DWARF_2,
                        new Identifier(MonejoMod.MOD_ID, "textures/entity/dwarf/dwarf2.png"));
                map.put(DwarfVariant.DWARF_3,
                        new Identifier(MonejoMod.MOD_ID, "textures/entity/dwarf/dwarf3.png"));
            });

    public DwarfRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new DwarfModel());
    }
    @Override
    public Identifier getTextureLocation(DwarfEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }
    @Override
    public void render(DwarfEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        poseStack.scale(0.8f, 0.8f, 0.8f);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
