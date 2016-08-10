package com.github.draconianberyl.dendrology.block;

import com.github.draconianberyl.dendrology.TheMod;
import com.github.draconianberyl.dendrology.config.Settings;
import com.google.common.collect.ImmutableList;
import com.scottkillen.mod.koresample.tree.DefinesLeaves;
import com.scottkillen.mod.koresample.tree.block.LeavesBlock;
import java.util.Random;

public final class ModLeavesBlock extends LeavesBlock
{
    public ModLeavesBlock(Iterable<? extends DefinesLeaves> subBlocks)
    {
        super(ImmutableList.copyOf(subBlocks));
        setCreativeTab(TheMod.INSTANCE.creativeTab());
    }

    @Override
    public int quantityDropped(Random random)
    {
        final int rarity = Settings.INSTANCE.saplingDropRarity();
        return rarity == 0 || random.nextInt(rarity) != 0 ? 0 : 1;
    }

    @Override
    protected String resourcePrefix() { return TheMod.getResourcePrefix(); }
}
