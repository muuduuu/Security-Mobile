package com.rssignaturecapture;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

/* loaded from: classes2.dex */
public class RSSignatureCaptureContextModule extends ReactContextBaseJavaModule {
    public RSSignatureCaptureContextModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RSSignatureContextModule";
    }
}
