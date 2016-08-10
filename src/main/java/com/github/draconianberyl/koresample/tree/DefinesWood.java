package com.github.draconianberyl.koresample.tree;

import com.github.draconianberyl.koresample.tree.block.WoodBlock;

public interface DefinesWood
{
    void assignWoodBlock(WoodBlock block);

    void assignWoodSubBlockIndex(int index);

    WoodBlock woodBlock();

    int woodSubBlockIndex();

    String speciesName();
}
