package com.github.draconianberyl.dendrology.item;

import com.github.draconianberyl.dendrology.block.ModSaplingBlock;
import com.github.draconianberyl.koresample.tree.item.SaplingItem;
import com.google.common.base.Objects;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public final class ModSaplingItem extends SaplingItem
{
    private final ModSaplingBlock sapling;

    public ModSaplingItem(Block block, ModSaplingBlock sapling, String[] names)
    {
        super(block, sapling, names);
        this.sapling = sapling;
    }

    @Override
    public String getPotionEffect(ItemStack itemStack)
    {
        return sapling.getPotionEffect(itemStack);
    }

    @Override
    public String toString()
    {
        return Objects.toStringHelper(this).add("sapling", sapling).toString();
    }
}
