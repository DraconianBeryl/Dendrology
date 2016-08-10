package com.github.draconianberyl.dendrology.block;

import com.github.draconianberyl.dendrology.TheMod;
import com.github.draconianberyl.koresample.tree.DefinesLog;
import com.github.draconianberyl.koresample.tree.block.LogBlock;
import com.google.common.collect.ImmutableList;

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
