package com.github.draconianberyl.dendrology.compat.gardencollection;

import com.github.draconianberyl.dendrology.TheMod;
import com.github.draconianberyl.dendrology.config.Settings;
import com.github.draconianberyl.dendrology.content.overworld.OverworldTreeSpecies;
import com.github.draconianberyl.koresample.compat.Integrator;
import com.github.draconianberyl.koresample.tree.block.LogBlock;
import com.jaquadro.minecraft.gardencore.api.SaplingRegistry;
import com.jaquadro.minecraft.gardencore.api.WoodRegistry;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.LoaderState.ModState;
import cpw.mods.fml.common.Optional.Method;
import net.minecraft.item.Item;

public final class GardenCoreMod extends Integrator
{
    private static final String MOD_ID = "GardenCore";
    private static final String MOD_NAME = MOD_ID;

    @Method(modid = MOD_ID)
    private static void registerWood()
    {
        TheMod.logger().info("Registering wood with GardenCore.");

        final WoodRegistry woodReg = WoodRegistry.instance();
        final SaplingRegistry saplingReg = SaplingRegistry.instance();

        for (final OverworldTreeSpecies tree : OverworldTreeSpecies.values())
        {
            final LogBlock logBlock = tree.logBlock();
            final int logMeta = tree.logSubBlockIndex();
            woodReg.registerWoodType(logBlock, logMeta);
            saplingReg
                    .registerSapling(Item.getItemFromBlock(tree.saplingBlock()), tree.saplingSubBlockIndex(), logBlock,
                            logMeta, tree.leavesBlock(), tree.leavesSubBlockIndex());
        }
    }

    @Override
    public void doIntegration(ModState modState)
    {
        if (Loader.isModLoaded(MOD_ID) && Settings.INSTANCE.integrateGardenStuff() && modState == ModState.INITIALIZED)
            registerWood();
    }

    @Override
    protected String modID() { return MOD_ID; }

    @Override
    protected String modName() { return MOD_NAME; }
}
