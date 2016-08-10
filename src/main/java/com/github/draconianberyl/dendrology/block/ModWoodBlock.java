package com.github.draconianberyl.dendrology.block;

import com.github.draconianberyl.dendrology.TheMod;
import com.github.draconianberyl.koresample.tree.DefinesWood;
import com.github.draconianberyl.koresample.tree.block.WoodBlock;
import com.google.common.collect.ImmutableList;

public final class ModWoodBlock extends WoodBlock
{
    public ModWoodBlock(Iterable<? extends DefinesWood> subBlocks)
    {
        super(ImmutableList.copyOf(subBlocks));
        setCreativeTab(TheMod.INSTANCE.creativeTab());

        setHardness(2.0f);
        setResistance(5.0f);
        setStepSound(soundTypeWood);
    }

    @Override
    protected String resourcePrefix() { return TheMod.getResourcePrefix(); }
}
