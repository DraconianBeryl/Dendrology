package com.github.draconianberyl.dendrology.content.overworld;

import com.github.draconianberyl.koresample.common.block.DefinesSlab;
import com.github.draconianberyl.koresample.common.block.DefinesStairs;
import com.github.draconianberyl.koresample.tree.DefinesLeaves;
import com.github.draconianberyl.koresample.tree.DefinesLog;
import com.github.draconianberyl.koresample.tree.DefinesSapling;
import com.github.draconianberyl.koresample.tree.DefinesWood;
import com.github.draconianberyl.koresample.tree.TreeTaxonomy;
import com.google.common.collect.ImmutableList;

public final class OverworldTreeTaxonomy implements TreeTaxonomy
{
    @Override
    public Iterable<? extends DefinesLeaves> leavesDefinitions()
    {
        return ImmutableList.copyOf(OverworldTreeSpecies.values());
    }

    @Override
    public Iterable<? extends DefinesLog> logDefinitions()
    {
        return ImmutableList.copyOf(OverworldTreeSpecies.values());
    }

    @Override
    public Iterable<? extends DefinesSapling> saplingDefinitions()
    {
        return ImmutableList.copyOf(OverworldTreeSpecies.values());
    }

    @Override
    public Iterable<? extends DefinesSlab> slabDefinitions()
    {
        return ImmutableList.copyOf(OverworldTreeSpecies.values());
    }

    @Override
    public Iterable<? extends DefinesStairs> stairsDefinitions()
    {
        return ImmutableList.copyOf(OverworldTreeSpecies.values());
    }

    @Override
    public Iterable<? extends DefinesWood> woodDefinitions()
    {
        return ImmutableList.copyOf(OverworldTreeSpecies.values());
    }
}
