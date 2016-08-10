package com.github.draconianberyl.koresample.tree;

import com.github.draconianberyl.koresample.common.block.DefinesSlab;
import com.github.draconianberyl.koresample.common.block.DefinesStairs;
import com.github.draconianberyl.koresample.common.block.StairsBlock;
import com.github.draconianberyl.koresample.common.util.slab.SingleDoubleSlab;
import com.github.draconianberyl.koresample.tree.block.LeavesBlock;
import com.github.draconianberyl.koresample.tree.block.LogBlock;
import com.github.draconianberyl.koresample.tree.block.SaplingBlock;
import com.github.draconianberyl.koresample.tree.block.WoodBlock;

public interface TreeBlockFactory
{
    LeavesBlock createLeavesBlock(Iterable<DefinesLeaves> subBlocks);

    LogBlock createLogBlock(Iterable<DefinesLog> subBlocks);

    SaplingBlock createSaplingBlock(Iterable<DefinesSapling> subBlocks);

    SingleDoubleSlab createSlabBlocks(Iterable<DefinesSlab> subBlocks);

    StairsBlock createStairsBlock(DefinesStairs definition);

    WoodBlock createWoodBlock(Iterable<DefinesWood> subBlocks);
}
