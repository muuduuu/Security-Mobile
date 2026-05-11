package com.airbnb.android.react.lottie;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements P {
    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.j();
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.e(new LottieAnimationViewManager());
    }
}
