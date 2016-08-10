package com.github.draconianberyl.dendrology.world.gen.feature;

import com.github.draconianberyl.dendrology.world.gen.feature.acemus.LargeAcemusTree;
import com.github.draconianberyl.dendrology.world.gen.feature.vanilla.VanillaTree;
import com.github.draconianberyl.koresample.tree.DefinesTree;
import com.google.common.base.Objects;

import net.minecraft.world.World;
import java.util.Random;

public class AcemusTree extends AbstractTree
{
    private final AbstractTree treeGen;
    private final AbstractTree largeTreeGen;

    public AcemusTree(boolean fromSapling)
    {
        super(fromSapling);
        treeGen = new VanillaTree(fromSapling);
        largeTreeGen = new LargeAcemusTree(fromSapling);
    }

    public AcemusTree() { this(true); }

    @Override
    public void setTree(DefinesTree tree)
    {
        treeGen.setTree(tree);
        largeTreeGen.setTree(tree);
    }

    @Override
    public String toString()
    {
        return Objects.toStringHelper(this).add("treeGen", treeGen).add("largeTreeGen", largeTreeGen).toString();
    }

    @Override
    public boolean generate(World world, Random rand, int x, int y, int z)
    {
        if (rand.nextInt(10) < 9) return treeGen.generate(world, rand, x, y, z);

        return largeTreeGen.generate(world, rand, x, y, z);
    }
}
