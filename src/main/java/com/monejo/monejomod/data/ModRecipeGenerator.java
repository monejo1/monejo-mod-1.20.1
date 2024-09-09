package com.monejo.monejomod.data;

import com.monejo.monejomod.block.ModBlocks;
import com.monejo.monejomod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //offerCompactingRecipe(exporter, RecipeCategory.REDSTONE, ModBlocks.RAINDROP_SLIME_BLOCK, ModItems.BlueSlime);
        //offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.BlueSlime, RecipeCategory.REDSTONE, ModBlocks.RAINDROP_SLIME_BLOCK);

    }
}
