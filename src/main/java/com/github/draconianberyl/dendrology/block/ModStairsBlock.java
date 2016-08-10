package com.github.draconianberyl.dendrology.block;

import com.github.draconianberyl.dendrology.TheMod;
import com.github.draconianberyl.koresample.common.block.DefinesStairs;
import com.github.draconianberyl.koresample.common.block.StairsBlock;

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
