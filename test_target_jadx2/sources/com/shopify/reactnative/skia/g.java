package com.shopify.reactnative.skia;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.RuntimeExecutor;

/* loaded from: classes2.dex */
abstract class g {
    public static RuntimeExecutor a(ReactContext reactContext) {
        return reactContext.getCatalystInstance().getRuntimeExecutor();
    }
}
