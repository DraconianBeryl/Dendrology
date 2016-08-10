package com.github.draconianberyl.dendrology.block;

import com.github.draconianberyl.dendrology.TheMod;
import com.github.draconianberyl.koresample.common.block.DefinesSlab;
import com.github.draconianberyl.koresample.common.block.SlabBlock;
import com.google.common.collect.ImmutableList;

public final class ModSlabBlock extends SlabBlock
{
    public ModSlabBlock(boolean isDouble, Iterable<? extends DefinesSlab> subBlocks)
    {
        super(isDouble, ImmutableList.copyOf(subBlocks));
        setCreativeTab(TheMod.INSTANCE.creativeTab());
        setHardness(2.0F);
        setResistance(5.0F);
        setStepSound(soundTypeWood);
    }

    @Override
    protected String resourcePrefix() { return TheMod.getResourcePrefix(); }
}
