package com.github.draconianberyl.dendrology.world.gen.feature.cerasu;

import static com.github.draconianberyl.dendrology.content.overworld.OverworldTreeSpecies.CERASU;

import com.github.draconianberyl.dendrology.world.gen.feature.vanilla.AbstractLargeVanillaTree;

public class LargeCerasuTree extends AbstractLargeVanillaTree
{
    public LargeCerasuTree(boolean fromSapling) { super(fromSapling); }

    @Override
    protected int getUnmaskedLogMeta() { return CERASU.logSubBlockIndex(); }
}
