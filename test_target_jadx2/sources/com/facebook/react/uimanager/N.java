package com.facebook.react.uimanager;

import android.view.Choreographer;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class N implements Choreographer.FrameCallback {
    private final ReactContext reactContext;

    protected N(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        try {
            doFrameGuarded(j10);
        } catch (RuntimeException e10) {
            this.reactContext.handleException(e10);
        }
    }

    protected abstract void doFrameGuarded(long j10);
}
