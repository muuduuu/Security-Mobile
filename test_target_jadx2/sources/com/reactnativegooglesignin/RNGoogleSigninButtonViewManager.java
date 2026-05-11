package com.reactnativegooglesignin;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.c1;
import com.google.android.gms.common.ViewOnClickListenerC2027t;
import h5.H;
import java.util.HashMap;
import java.util.Map;
import v4.AbstractC4929e;

/* loaded from: classes2.dex */
public class RNGoogleSigninButtonViewManager extends SimpleViewManager<ViewOnClickListenerC2027t> implements H {
    public static final String MODULE_NAME = "RNGoogleSigninButton";
    private static final View.OnClickListener mOnClickListener = new View.OnClickListener() { // from class: com.reactnativegooglesignin.e
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RNGoogleSigninButtonViewManager.lambda$static$0(view);
        }
    };
    private final c1 mDelegate = new d(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(View view) {
        ReactContext reactContext = (ReactContext) view.getContext();
        int id2 = view.getId();
        L0.c(reactContext, id2).c(new n(L0.e(reactContext), id2));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected c1 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.put("topPress", AbstractC4929e.d("phasedRegistrationNames", AbstractC4929e.d("bubbled", "onPress")));
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(F0 f02, ViewOnClickListenerC2027t viewOnClickListenerC2027t) {
        viewOnClickListenerC2027t.setOnClickListener(mOnClickListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewOnClickListenerC2027t createViewInstance(F0 f02) {
        return new ViewOnClickListenerC2027t(f02);
    }

    @Override // h5.H
    @Z4.a(name = "color")
    public void setColor(ViewOnClickListenerC2027t viewOnClickListenerC2027t, String str) {
        if (str == null) {
            viewOnClickListenerC2027t.setColorScheme(2);
        } else {
            viewOnClickListenerC2027t.setColorScheme(!"dark".equals(str) ? 1 : 0);
        }
    }

    @Override // h5.H
    @Z4.a(name = "disabled")
    public void setDisabled(ViewOnClickListenerC2027t viewOnClickListenerC2027t, boolean z10) {
        viewOnClickListenerC2027t.setEnabled(!z10);
    }

    @Override // h5.H
    @Z4.a(name = "size")
    public void setSize(ViewOnClickListenerC2027t viewOnClickListenerC2027t, int i10) {
        viewOnClickListenerC2027t.setSize(i10);
    }
}
