package com.github.draconianberyl.dendrology.item;

import com.github.draconianberyl.dendrology.block.ModSlabBlock;
import com.scottkillen.mod.koresample.tree.item.SlabItem;
import net.minecraft.block.Block;

public final class ModSlabItem extends SlabItem
{
    public ModSlabItem(Block block, ModSlabBlock singleSlab, ModSlabBlock doubleSlab, Boolean isDouble)
    {
        super(block, singleSlab, doubleSlab, isDouble);
    }
}
