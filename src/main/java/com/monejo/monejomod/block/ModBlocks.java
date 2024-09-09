package com.monejo.monejomod.block;

import com.monejo.monejomod.MonejoMod;
import com.monejo.monejomod.block.custom.DwarfCampfireBlock;
import com.monejo.monejomod.block.custom.DwarfFireBlock;
import com.monejo.monejomod.block.custom.LeafPileBlock;
import com.monejo.monejomod.block.custom.YellowBirchLeavesBlock;
import com.monejo.monejomod.particle.ModParticles;
import com.monejo.monejomod.world.feature.tree.WeirwoodSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.block.MapColor;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SlimeBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;

public class ModBlocks {

    public void onInitialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(blue_slime_bricks);
        });
    }
    public static final Block blue_slime_bricks = registerBlock("blueslime_bricks", new Block(FabricBlockSettings.create().mapColor(MapColor.BLUE).instrument(Instrument.BASEDRUM).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block RAW_AMBER_BLOCK = registerBlock("raw_amber_block", new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK)));
    public static final Block AMBER_ORE = registerBlock("amber_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE), UniformIntProvider.create(3, 7)));
    public static final Block RAINDROP_SLIME_BLOCK = registerBlock("raindrop_slime_block", new SlimeBlock(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK).mapColor(MapColor.BLUE).nonOpaque()));
    public static final Block BLUE_SLIME_BRICKS_SLAB = registerBlock("blueslime_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_SLAB)));
    public static final Block BLUE_SLIME_BRICKS_STAIRS = registerBlock("blueslime_bricks_stairs", new StairsBlock(ModBlocks.blue_slime_bricks.getDefaultState(), FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_STAIRS)));
    public static final Block BLUE_SLIME_BRICKS_WALL = registerBlock("blueslime_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_WALL)));
    public static final Block SLIME_BRICKS = registerBlock("slime_bricks", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block WEIRWOOD_LOG = registerBlock("weirwood_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block WEIRWOOD_WOOD = registerBlock("weirwood_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_WEIRWOOD_LOG = registerBlock("stripped_weirwood_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_WEIRWOOD_WOOD = registerBlock("stripped_weirwood_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block WEIRWOOD_PLANKS = registerBlock("weirwood_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WEIRWOOD_LEAVES = registerBlock("weirwood_leaves", new YellowBirchLeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES)));
    public static final Block WEIRWOOD_SAPLING = registerBlock("weirwood_sapling", new SaplingBlock(new WeirwoodSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block YELLOW_LEAVES = registerBlock("yellow_leaves", new LeafPileBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS)));
    public static final Block CARNATION = registerBlock("carnation", new FlowerBlock(StatusEffects.BLINDNESS, 7, FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY)));
    public static final Block ROCK_PATH = registerBlock("rock_path", new DirtPathBlock(FabricBlockSettings.copyOf(Blocks.DIRT_PATH).sounds(BlockSoundGroup.STONE)));
    public static final Block DWARFSTONE_BRICKS = registerBlock("dwarfstone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_DWARFSTONE = registerBlock("polished_dwarfstone", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block DWARFSTONE = registerBlock("dwarfstone", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block DWARFSTONE_BRICKS_SLAB = registerBlock("dwarfstone_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block DWARFSTONE_SLAB = registerBlock("dwarfstone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_DWARFSTONE_SLAB = registerBlock("polished_dwarfstone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block DWARFSTONE_BRICKS_STAIRS = registerBlock("dwarfstone_bricks_stairs", new StairsBlock(ModBlocks.DWARFSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block DWARFSTONE_STAIRS = registerBlock("dwarfstone_stairs", new StairsBlock(ModBlocks.DWARFSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_DWARFSTONE_STAIRS = registerBlock("polished_dwarfstone_stairs", new StairsBlock(ModBlocks.POLISHED_DWARFSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block DWARFSTONE_BRICKS_WALL = registerBlock("dwarfstone_bricks_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_DWARFSTONE_WALL = registerBlock("polished_dwarfstone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block DWARFSTONE_WALL = registerBlock("dwarfstone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block DWARF_FIRE = registerBlock("dwarf_fire", new DwarfFireBlock(AbstractBlock.Settings.create().mapColor(MapColor.EMERALD_GREEN).replaceable().noCollision().breakInstantly().luminance(state -> 10).sounds(BlockSoundGroup.WOOL).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DWARF_TORCH = registerBlock("dwarf_torch", new TorchBlock(AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 10).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY), ModParticles.DWARF_FIRE_FLAME));
    public static final Block DWARF_WALL_TORCH = registerBlock("dwarf_wall_torch", new WallTorchBlock(AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 10).sounds(BlockSoundGroup.WOOD).dropsLike(DWARF_TORCH).pistonBehavior(PistonBehavior.DESTROY), ModParticles.DWARF_FIRE_FLAME));
    public static final Block DWARF_CAMPFIRE = registerBlock("dwarf_campfire", new DwarfCampfireBlock(false, 2, AbstractBlock.Settings.create().mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD).luminance(Blocks.createLightLevelFromLitBlockState(10)).nonOpaque().burnable()));
    public static final Block DWARF_LANTERN = registerBlock("dwarf_lantern", new LanternBlock(FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MonejoMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MonejoMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks() {
        MonejoMod.LOGGER.info("Registering ModBlocks for " + MonejoMod.MOD_ID);
    }

    public static Block register(String id, Block block) {
        return Registry.register(Registries.BLOCK, id, block);
    }


}


