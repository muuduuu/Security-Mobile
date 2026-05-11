package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.ViewManager;

@K4.a(name = ReactRawTextManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class ReactRawTextManager extends ViewManager<View, e> {
    public static final String REACT_CLASS = "RCTRawText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends e> getShadowNodeClass() {
        return e.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected View prepareToRecycleView(F0 f02, View view) {
        throw new IllegalStateException("Attempt to recycle a native view for RCTRawText");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public e createShadowNodeInstance() {
        return new e();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(F0 f02) {
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }
}
