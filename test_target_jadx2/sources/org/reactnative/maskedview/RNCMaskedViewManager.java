package org.reactnative.maskedview;

import android.view.View;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.ViewGroupManager;

/* loaded from: classes3.dex */
public class RNCMaskedViewManager extends ViewGroupManager<a> {
    private static final String REACT_CLASS = "RNCMaskedView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Z4.a(name = "androidRenderingMode")
    public void setAndroidRenderingMode(a aVar, String str) {
        if (str != null) {
            aVar.setRenderingMode(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(F0 f02) {
        return new a(f02);
    }
}
