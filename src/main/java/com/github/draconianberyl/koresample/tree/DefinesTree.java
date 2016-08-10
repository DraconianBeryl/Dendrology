package com.github.draconianberyl.koresample.tree;

import com.github.draconianberyl.koresample.tree.block.LeavesBlock;
import com.github.draconianberyl.koresample.tree.block.LogBlock;
import com.github.draconianberyl.koresample.tree.block.SaplingBlock;

import net.minecraft.world.gen.feature.WorldGenerator;

@SuppressWarnings("InterfaceNeverImplemented")
public interface DefinesTree
{
    LeavesBlock leavesBlock();

    int leavesSubBlockIndex();

    LogBlock logBlock();

    int logSubBlockIndex();

    SaplingBlock saplingBlock();

    int saplingSubBlockIndex();

    WorldGenerator saplingTreeGenerator();

    WorldGenerator worldTreeGenerator();
}
