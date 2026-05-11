package com.shopify.reactnative.skia;

import android.view.View;
import com.facebook.react.uimanager.F0;
import h5.a1;
import h5.b1;

/* loaded from: classes2.dex */
public class SkiaDomViewManager extends SkiaBaseViewManager<SkiaDomView> implements b1 {
    protected a1 mDelegate = new a1(this);

    SkiaDomViewManager() {
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SkiaDomView";
    }

    @Override // h5.b1
    @Z4.a(name = "debug")
    public /* bridge */ /* synthetic */ void setDebug(View view, boolean z10) {
        super.setDebug((SkiaDomViewManager) view, z10);
    }

    @Override // h5.b1
    @Z4.a(name = "mode")
    public /* bridge */ /* synthetic */ void setMode(View view, String str) {
        super.setMode((SkiaDomViewManager) view, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate */
    public a1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public SkiaDomView createViewInstance(F0 f02) {
        return new SkiaDomView(f02);
    }
}
