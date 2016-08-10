package com.github.draconianberyl.koresample.tree;

import com.github.draconianberyl.koresample.tree.block.LeavesBlock;

public interface DefinesLeaves extends ProvidesColor
{
    void assignLeavesBlock(LeavesBlock block);

    void assignLeavesSubBlockIndex(int index);

    LeavesBlock leavesBlock();

    int leavesSubBlockIndex();

    DefinesSapling saplingDefinition();

    String speciesName();
}
