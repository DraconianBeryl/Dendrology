package com.github.draconianberyl.dendrology.block;

import com.github.draconianberyl.dendrology.TheMod;
import com.google.common.collect.ImmutableList;
import com.scottkillen.mod.koresample.tree.DefinesLog;
import com.scottkillen.mod.koresample.tree.block.LogBlock;

public final class ModLogBlock extends LogBlock
{
    public ModLogBlock(Iterable<? extends DefinesLog> subBlocks)
    {
        super(ImmutableList.copyOf(subBlocks));
        setCreativeTab(TheMod.INSTANCE.creativeTab());
    }

    @Override
    protected String resourcePrefix() { return TheMod.getResourcePrefix(); }
}
