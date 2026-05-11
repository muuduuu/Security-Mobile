package com.facebook.react.views.text.frescosupport;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.F0;
import r3.c;
import v3.AbstractC4922b;

@K4.a(name = FrescoBasedReactTextInlineImageViewManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class FrescoBasedReactTextInlineImageViewManager extends BaseViewManager<View, a> {
    public static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object mCallerContext;
    private final AbstractC4922b mDraweeControllerBuilder;

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(F0 f02) {
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<a> getShadowNodeClass() {
        return a.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    public FrescoBasedReactTextInlineImageViewManager(AbstractC4922b abstractC4922b, Object obj) {
        this.mDraweeControllerBuilder = abstractC4922b;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createShadowNodeInstance() {
        AbstractC4922b abstractC4922b = this.mDraweeControllerBuilder;
        if (abstractC4922b == null) {
            abstractC4922b = c.g();
        }
        return new a(abstractC4922b, this.mCallerContext);
    }
}
