package com.github.draconianberyl.dendrology.world.gen.feature;

import com.github.draconianberyl.dendrology.world.gen.feature.ewcaly.LargeEwcalyTree;
import com.github.draconianberyl.dendrology.world.gen.feature.ewcaly.NormalEwcalyTree;
import com.github.draconianberyl.koresample.tree.DefinesTree;
import com.google.common.base.Objects;

import net.minecraft.world.World;
import java.util.Random;

public class EwcalyTree extends AbstractTree
{
    private final AbstractTree treeGen;
    private final AbstractTree largeTreeGen;

    public EwcalyTree(boolean fromSapling)
    {
        super(fromSapling);
        treeGen = new NormalEwcalyTree(fromSapling);
        largeTreeGen = new LargeEwcalyTree(fromSapling);
    }

    public EwcalyTree() { this(true); }

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
        if (rand.nextInt(7) > 1) return treeGen.generate(world, rand, x, y, z);

        return largeTreeGen.generate(world, rand, x, y, z);
    }
}
