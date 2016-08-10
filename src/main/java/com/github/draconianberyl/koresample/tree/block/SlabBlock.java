package com.github.draconianberyl.koresample.tree.block;

import java.util.Collection;

import com.github.draconianberyl.koresample.common.block.DefinesSlab;

// Use com.github.draconianberyl.koresample.common.block.SlabBlock instead
// This is left to honor the api contract
@SuppressWarnings({ "WeakerAccess", "ClassNameSameAsAncestorName" })
@Deprecated
public abstract class SlabBlock extends com.github.draconianberyl.koresample.common.block.SlabBlock
{
    protected SlabBlock(boolean isDouble, Collection<? extends DefinesSlab> subBlocks)
    {
        super(isDouble, subBlocks);
    }
}
