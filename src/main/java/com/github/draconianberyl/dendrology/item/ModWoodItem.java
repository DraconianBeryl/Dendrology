package com.github.draconianberyl.dendrology.item;

import com.github.draconianberyl.dendrology.block.ModWoodBlock;
import com.scottkillen.mod.koresample.tree.item.WoodItem;
import net.minecraft.block.Block;

public final class ModWoodItem extends WoodItem
{
    public ModWoodItem(Block block, ModWoodBlock log, String[] names)
    {
        super(block, log, names);
    }
}
