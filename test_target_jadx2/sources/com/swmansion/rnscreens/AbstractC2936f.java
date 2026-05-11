package com.swmansion.rnscreens;

import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.E0;

/* renamed from: com.swmansion.rnscreens.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2936f extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private E0 f29953a;

    /* renamed from: b, reason: collision with root package name */
    private float f29954b;

    /* renamed from: c, reason: collision with root package name */
    private float f29955c;

    public AbstractC2936f(ReactContext reactContext) {
        super(reactContext);
    }

    protected final void b(int i10, int i11, int i12) {
        c(i10, i11, i12);
    }

    public final void c(int i10, int i11, int i12) {
        float e10 = C1944g0.e(i10);
        float e11 = C1944g0.e(i11);
        float e12 = C1944g0.e(i12);
        if (Math.abs(this.f29954b - e10) >= 0.9f || Math.abs(this.f29955c - e11) >= 0.9f) {
            this.f29954b = e10;
            this.f29955c = e11;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", e10);
            writableNativeMap.putDouble("frameHeight", e11);
            writableNativeMap.putDouble("contentOffsetX", 0.0d);
            writableNativeMap.putDouble("contentOffsetY", e12);
            E0 e02 = this.f29953a;
            if (e02 != null) {
                e02.updateState(writableNativeMap);
            }
        }
    }

    public final void setStateWrapper(E0 e02) {
        this.f29953a = e02;
    }
}
