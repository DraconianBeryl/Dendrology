package com.github.draconianberyl.koresample.tree;

import com.github.draconianberyl.koresample.common.block.DefinesSlab;
import com.github.draconianberyl.koresample.common.block.DefinesStairs;
import com.github.draconianberyl.koresample.tree.DefinesLeaves;

public interface TreeTaxonomy
{
    Iterable<? extends DefinesLeaves> leavesDefinitions();

    Iterable<? extends DefinesLog> logDefinitions();

    Iterable<? extends DefinesSapling> saplingDefinitions();

    Iterable<? extends DefinesSlab> slabDefinitions();

    Iterable<? extends DefinesStairs> stairsDefinitions();

    Iterable<? extends DefinesWood> woodDefinitions();
}
