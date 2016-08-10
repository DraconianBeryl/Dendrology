package com.github.draconianberyl.dendrology.proxy.render;

import com.github.draconianberyl.dendrology.world.AcemusColorizer;
import com.github.draconianberyl.dendrology.world.CerasuColorizer;
import com.github.draconianberyl.dendrology.world.KulistColorizer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.client.resources.IResourceManager;

public final class ClientRenderProxy extends RenderProxy
{
    @Override
    public void postInit()
    {
        final IResourceManager resourceManager = Minecraft.getMinecraft().getResourceManager();
        if (resourceManager instanceof IReloadableResourceManager)
        {
            // These casts are bad, but we don't have another way to do this.
            ((IReloadableResourceManager) resourceManager).registerReloadListener(AcemusColorizer.INSTANCE);
            ((IReloadableResourceManager) resourceManager).registerReloadListener(CerasuColorizer.INSTANCE);
            ((IReloadableResourceManager) resourceManager).registerReloadListener(KulistColorizer.INSTANCE);
        }
    }
}
