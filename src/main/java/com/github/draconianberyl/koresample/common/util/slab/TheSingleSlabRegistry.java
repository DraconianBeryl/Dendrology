package com.github.draconianberyl.koresample.common.util.slab;

import com.github.draconianberyl.koresample.common.block.SlabBlock;
import com.google.common.base.Objects;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import java.util.Set;

import static com.google.common.base.Preconditions.*;

@SuppressWarnings({ "NonSerializableFieldInSerializableClass", "WeakerAccess" })
public enum TheSingleSlabRegistry
{
    REFERENCE;

    private final Set<Block> slabBlocks = Sets.newHashSet();

    public void add(SlabBlock slabBlock) { slabBlocks.add(checkNotNull(slabBlock)); }

    public boolean isSingleSlab(Block block) { return slabBlocks.contains(block); }

    public boolean isSingleSlab(Item item) { return isSingleSlab(Block.getBlockFromItem(item)); }

    @Override
    public String toString()
    {
        return Objects.toStringHelper(this).add("slabBlocks", slabBlocks).toString();
    }
}
