package com.monejo.monejomod.entity.client;

import com.monejo.monejomod.entity.custom.RaindropSlimeEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

@Environment(value=EnvType.CLIENT)
public class RainDropSlimeEntityRenderer
        extends MobEntityRenderer<RaindropSlimeEntity, RainDropSlimeEntityModel<RaindropSlimeEntity>> {
    private static final Identifier TEXTURE = new Identifier("monejomod:textures/entity/raindrop_slime.png");

    public RainDropSlimeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new RainDropSlimeEntityModel(context.getPart(EntityModelLayers.SLIME)), 0.25f);
        this.addFeature(new RainDropSlimeOverlayFeatureRenderer<RaindropSlimeEntity>(this, context.getModelLoader()));
    }

    @Override
    public void render(RaindropSlimeEntity slimeEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        this.shadowRadius = 0.25f * (float)slimeEntity.getSize();
        super.render(slimeEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    protected void scale(RaindropSlimeEntity slimeEntity, MatrixStack matrixStack, float f) {
        matrixStack.scale(0.999f, 0.999f, 0.999f);
        matrixStack.translate(0.0f, 0.001f, 0.0f);
        float h = slimeEntity.getSize();
        float i = MathHelper.lerp(f, slimeEntity.lastStretch, slimeEntity.stretch) / (h * 0.5f + 1.0f);
        float j = 1.0f / (i + 1.0f);
        matrixStack.scale(j * h, 1.0f / j * h, j * h);
    }

    @Override
    public Identifier getTexture(RaindropSlimeEntity slimeEntity) {
        return TEXTURE;
    }
}
