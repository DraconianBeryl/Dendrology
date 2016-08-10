package com.github.draconianberyl.dendrology.block;

import com.github.draconianberyl.dendrology.TheMod;
import com.github.draconianberyl.dendrology.content.ProvidesPotionEffect;
import com.github.draconianberyl.koresample.tree.DefinesSapling;
import com.github.draconianberyl.koresample.tree.block.SaplingBlock;
import com.google.common.collect.ImmutableList;

import net.minecraft.item.ItemStack;
import java.util.List;

public final class ModSaplingBlock extends SaplingBlock
{
    public ModSaplingBlock(Iterable<? extends DefinesSapling> subBlocks)
    {
        super(ImmutableList.copyOf(subBlocks));
        setCreativeTab(TheMod.INSTANCE.creativeTab());
        setHardness(0.0F);
        setStepSound(soundTypeGrass);
    }

    @Override
    protected String resourcePrefix() { return TheMod.getResourcePrefix(); }

    @SuppressWarnings("ReturnOfNull")
    public String getPotionEffect(ItemStack itemStack)
    {
        final List<DefinesSapling> subBlocks = subBlocks();
        final int itemDamage = itemStack.getItemDamage();
        if (itemDamage < 0 || itemDamage >= subBlocks.size()) return null;

        final DefinesSapling subBlock = subBlocks.get(itemDamage);
        return subBlock instanceof ProvidesPotionEffect ? ((ProvidesPotionEffect) subBlock).potionEffect() : null;
    }
}
