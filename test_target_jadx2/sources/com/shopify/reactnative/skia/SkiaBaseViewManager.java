package com.shopify.reactnative.skia;

import com.facebook.react.views.view.ReactViewManager;
import com.shopify.reactnative.skia.i;

/* loaded from: classes2.dex */
public abstract class SkiaBaseViewManager<T extends i> extends ReactViewManager {
    @Z4.a(name = "debug")
    public void setDebug(T t10, boolean z10) {
        t10.setDebugMode(z10);
    }

    @Z4.a(name = "mode")
    public void setMode(T t10, String str) {
        t10.setMode(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(com.facebook.react.views.view.j jVar) {
        super.onDropViewInstance((SkiaBaseViewManager<T>) jVar);
        ((i) jVar).s();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    public void setNativeId(com.facebook.react.views.view.j jVar, String str) {
        super.setNativeId((SkiaBaseViewManager<T>) jVar, str);
        ((i) jVar).registerView(Integer.parseInt(str));
    }
}
