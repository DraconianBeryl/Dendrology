package com.github.draconianberyl.dendrology.world.gen.feature.porffor;

import static com.github.draconianberyl.dendrology.content.overworld.OverworldTreeSpecies.PORFFOR;

import com.github.draconianberyl.dendrology.world.gen.feature.vanilla.AbstractLargeVanillaTree;

public class LargePorfforTree extends AbstractLargeVanillaTree
{
    public LargePorfforTree(boolean fromSapling) { super(fromSapling); }

    @Override
    protected int getUnmaskedLogMeta() { return PORFFOR.logSubBlockIndex(); }
}
