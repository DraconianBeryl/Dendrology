package com.github.draconianberyl.dendrology.proxy;

import com.github.draconianberyl.dendrology.proxy.render.RenderProxy;

import cpw.mods.fml.common.SidedProxy;

@SuppressWarnings({ "StaticNonFinalField", "PublicField" })
public enum Proxy
{
    ;
    private static final String CLIENT_RENDER_PROXY_CLASS =
            "com.github.draconianberyl.dendrology.proxy.render.ClientRenderProxy";
    private static final String RENDER_PROXY_CLASS = "com.github.draconianberyl.dendrology.proxy.render.RenderProxy";

    @SidedProxy(clientSide = CLIENT_RENDER_PROXY_CLASS, serverSide = RENDER_PROXY_CLASS)
    public static RenderProxy render;
}
