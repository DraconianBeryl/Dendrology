package com.github.draconianberyl.dendrology.block;

import com.scottkillen.mod.koresample.common.block.StairsBlock;
import com.github.draconianberyl.dendrology.TheMod;
import com.scottkillen.mod.koresample.common.block.DefinesStairs;

public final class ModStairsBlock extends StairsBlock
{
    public ModStairsBlock(DefinesStairs definition)
    {
        super(definition);
        setCreativeTab(TheMod.INSTANCE.creativeTab());
    }

    @Override
    protected String resourcePrefix()
    {
        return TheMod.getResourcePrefix();
    }
}
