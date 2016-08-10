package com.github.draconianberyl.dendrology.content.overworld;

import com.github.draconianberyl.dendrology.block.ModBlocks;
import com.github.draconianberyl.dendrology.block.ModLeavesBlock;
import com.github.draconianberyl.dendrology.block.ModLogBlock;
import com.github.draconianberyl.dendrology.block.ModSaplingBlock;
import com.github.draconianberyl.dendrology.block.ModSlabBlock;
import com.github.draconianberyl.dendrology.block.ModStairsBlock;
import com.github.draconianberyl.dendrology.block.ModWoodBlock;
import com.github.draconianberyl.koresample.common.block.DefinesSlab;
import com.github.draconianberyl.koresample.common.block.DefinesStairs;
import com.github.draconianberyl.koresample.common.block.SlabBlock;
import com.github.draconianberyl.koresample.common.block.StairsBlock;
import com.github.draconianberyl.koresample.common.util.slab.SingleDoubleSlab;
import com.github.draconianberyl.koresample.tree.DefinesLeaves;
import com.github.draconianberyl.koresample.tree.DefinesLog;
import com.github.draconianberyl.koresample.tree.DefinesSapling;
import com.github.draconianberyl.koresample.tree.DefinesWood;
import com.github.draconianberyl.koresample.tree.TreeBlockFactory;
import com.github.draconianberyl.koresample.tree.block.LeavesBlock;
import com.github.draconianberyl.koresample.tree.block.LogBlock;
import com.github.draconianberyl.koresample.tree.block.SaplingBlock;
import com.github.draconianberyl.koresample.tree.block.WoodBlock;

public final class OverworldTreeBlockFactory implements TreeBlockFactory
{

    @Override
    public LeavesBlock createLeavesBlock(Iterable<DefinesLeaves> subBlocks)
    {
        final LeavesBlock block = new ModLeavesBlock(subBlocks);
        for (final DefinesLeaves subBlock : subBlocks)
            subBlock.assignLeavesBlock(block);

        ModBlocks.registerBlock(block);
        return block;
    }

    @Override
    public LogBlock createLogBlock(Iterable<DefinesLog> subBlocks)
    {
        final LogBlock block = new ModLogBlock(subBlocks);
        for (final DefinesLog subBlock : subBlocks)
            subBlock.assignLogBlock(block);

        ModBlocks.registerBlock(block);
        return block;
    }

    @Override
    public SaplingBlock createSaplingBlock(Iterable<DefinesSapling> subBlocks)
    {
        final SaplingBlock block = new ModSaplingBlock(subBlocks);
        for (final DefinesSapling subBlock : subBlocks)
            subBlock.assignSaplingBlock(block);

        ModBlocks.registerBlock(block);
        return block;
    }

    @Override
    public SingleDoubleSlab createSlabBlocks(Iterable<DefinesSlab> subBlocks)
    {
        final SlabBlock singleSlabBlock = new ModSlabBlock(false, subBlocks);
        final SlabBlock doubleSlabBlock = new ModSlabBlock(true, subBlocks);

        for (final DefinesSlab subBlock : subBlocks)
        {
            subBlock.assignSingleSlabBlock(singleSlabBlock);
            subBlock.assignDoubleSlabBlock(doubleSlabBlock);
        }

        ModBlocks.registerBlock(singleSlabBlock, doubleSlabBlock);
        return new SingleDoubleSlab(singleSlabBlock, doubleSlabBlock);
    }

    @Override
    public StairsBlock createStairsBlock(DefinesStairs definition)
    {
        final StairsBlock block = new ModStairsBlock(definition);
        block.setBlockName(String.format("stairs.%s", definition.stairsName()));

        definition.assignStairsBlock(block);

        ModBlocks.registerBlock(block);
        return block;
    }

    @Override
    public WoodBlock createWoodBlock(Iterable<DefinesWood> subBlocks)
    {
        final WoodBlock block = new ModWoodBlock(subBlocks);
        for (final DefinesWood subBlock : subBlocks)
            subBlock.assignWoodBlock(block);

        ModBlocks.registerBlock(block);
        return block;
    }
}
