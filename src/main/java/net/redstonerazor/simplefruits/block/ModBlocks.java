package net.redstonerazor.simplefruits.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redstonerazor.simplefruits.SimpleFruits;

public class ModBlocks {
    public static final Block APPLE_CRATE = registerBlock("apple_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.RED)));
    public static final Block BANANA_CRATE = registerBlock("banana_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.YELLOW)));
    public static final Block ORANGE_CRATE = registerBlock("orange_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.ORANGE)));
    public static final Block PEAR_CRATE = registerBlock("pear_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.GREEN)));
    public static final Block FIG_CRATE = registerBlock("fig_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.BLUE)));
    public static final Block PLUM_CRATE = registerBlock("plum_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.PURPLE)));
    public static final Block CHERRY_BAG = registerBlock("cherry_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).mapColor(MapColor.RED)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SimpleFruits.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SimpleFruits.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        SimpleFruits.LOGGER.info("Registering blocks for " + SimpleFruits.MOD_ID);
    }
}
