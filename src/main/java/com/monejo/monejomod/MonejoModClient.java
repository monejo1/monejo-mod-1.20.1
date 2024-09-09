package com.monejo.monejomod;

import com.monejo.monejomod.block.ModBlocks;
import com.monejo.monejomod.entity.ModBlockEntities;
import com.monejo.monejomod.entity.ModEntities;
import com.monejo.monejomod.entity.client.DwarfCampfireBlockEntityRenderer;
import com.monejo.monejomod.entity.client.DwarfRenderer;
import com.monejo.monejomod.entity.client.RainDropSlimeEntityRenderer;
import com.monejo.monejomod.particle.custom.YellowBirchLeavesParticle;
import com.monejo.monejomod.particle.ModParticles;
import com.monejo.monejomod.particle.custom.RainDropParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.render.RenderLayer;

public class MonejoModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RAINDROP_SLIME_BLOCK, RenderLayer.getTranslucent());
        EntityRendererRegistry.register(ModEntities.RAINDROP_SLIME, RainDropSlimeEntityRenderer::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.RAINDROP_SLIME_PARTICLE, RainDropParticle.Factory::new);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WEIRWOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WEIRWOOD_SAPLING, RenderLayer.getCutout());
        ParticleFactoryRegistry.getInstance().register(ModParticles.YELLOW_BIRCH_LEAVES, YellowBirchLeavesParticle.Factory::new);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CARNATION, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DWARF_FIRE, RenderLayer.getCutout());
        ParticleFactoryRegistry.getInstance().register(ModParticles.DWARF_FIRE_FLAME, FlameParticle.Factory::new);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DWARF_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DWARF_WALL_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DWARF_CAMPFIRE, RenderLayer.getCutout());
        BlockEntityRendererRegistry.register(ModBlockEntities.DWARF_CAMPFIRE_ENTITY, DwarfCampfireBlockEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.DWARF, DwarfRenderer::new);

    }
}
