package com.shopify.reactnative.skia;

import android.view.View;
import com.facebook.react.uimanager.F0;
import h5.c1;
import h5.d1;

/* loaded from: classes2.dex */
public class SkiaPictureViewManager extends SkiaBaseViewManager<SkiaPictureView> implements d1 {
    protected c1 mDelegate = new c1(this);

    SkiaPictureViewManager() {
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SkiaPictureView";
    }

    @Override // h5.d1
    @Z4.a(name = "debug")
    public /* bridge */ /* synthetic */ void setDebug(View view, boolean z10) {
        super.setDebug((SkiaPictureViewManager) view, z10);
    }

    @Override // h5.d1
    @Z4.a(name = "mode")
    public /* bridge */ /* synthetic */ void setMode(View view, String str) {
        super.setMode((SkiaPictureViewManager) view, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate */
    public c1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public SkiaPictureView createViewInstance(F0 f02) {
        return new SkiaPictureView(f02);
    }
}
