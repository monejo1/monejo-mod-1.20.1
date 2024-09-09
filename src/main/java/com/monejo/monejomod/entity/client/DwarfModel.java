package com.monejo.monejomod.entity.client;

import com.monejo.monejomod.MonejoMod;
import com.monejo.monejomod.entity.custom.DwarfEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class DwarfModel extends GeoModel<DwarfEntity> {
    @Override
    public Identifier getModelResource(DwarfEntity animatable) {
        return new Identifier(MonejoMod.MOD_ID, "geo/dwarf.geo.json");
    }

    @Override
    public Identifier getTextureResource(DwarfEntity object) {
        return DwarfRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public Identifier getAnimationResource(DwarfEntity animatable) {
        return new Identifier(MonejoMod.MOD_ID, "animations/dwarf.animation.json");
    }

    @Override
    public void setCustomAnimations(DwarfEntity animatable, long instanceId, AnimationState<DwarfEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
