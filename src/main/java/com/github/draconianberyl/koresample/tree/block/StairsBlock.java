package com.github.draconianberyl.koresample.tree.block;

import com.github.draconianberyl.koresample.common.block.DefinesStairs;

// Use com.github.draconianberyl.koresample.common.block.StairsBlock instead
// This is left to honor the api contract
@SuppressWarnings({ "WeakerAccess", "ClassNameSameAsAncestorName" })
@Deprecated
public abstract class StairsBlock extends com.github.draconianberyl.koresample.common.block.StairsBlock
{
    protected StairsBlock(DefinesStairs model)
    {
        super(model);
    }
}
