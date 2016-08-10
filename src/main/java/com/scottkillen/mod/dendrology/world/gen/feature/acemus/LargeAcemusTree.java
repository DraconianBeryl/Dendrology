package com.github.draconianberyl.dendrology.world.gen.feature.acemus;

import static com.github.draconianberyl.dendrology.content.overworld.OverworldTreeSpecies.ACEMUS;

import com.github.draconianberyl.dendrology.world.gen.feature.vanilla.AbstractLargeVanillaTree;

public class LargeAcemusTree extends AbstractLargeVanillaTree
{
    public LargeAcemusTree(boolean fromSapling) { super(fromSapling); }

    @Override
    protected int getUnmaskedLogMeta() { return ACEMUS.logSubBlockIndex(); }
}
