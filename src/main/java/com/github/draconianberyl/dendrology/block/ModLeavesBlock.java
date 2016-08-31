package com.github.draconianberyl.dendrology.block;

import com.github.draconianberyl.dendrology.TheMod;
import com.github.draconianberyl.dendrology.config.Settings;
import com.github.draconianberyl.koresample.tree.DefinesLeaves;
import com.github.draconianberyl.koresample.tree.block.LeavesBlock;
import com.google.common.collect.ImmutableList;
import com.github.draconianberyl.koresample.common.util.log.Logger;

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
        Logger myLogger = Logger.forMod( TheMod.MOD_ID );

        if( rarity == 0 ) {
            myLogger.info( "saplings disabled" );
            return 0;
        }
        else {
            int roll = random.nextInt(rarity);
            myLogger.info( "sapling roll: %d/%d", roll, rarity );
            return roll != 0 ? 0 : 1;
        }
    }

    @Override
    protected String resourcePrefix() { return TheMod.getResourcePrefix(); }
}
