package com.github.draconianberyl.koresample.common.block;

import net.minecraft.block.Block;

public interface DefinesStairs
{
    void assignStairsBlock(StairsBlock block);

    StairsBlock stairsBlock();

    Block stairsModelBlock();

    int stairsModelSubBlockIndex();

    String stairsName();
}
