package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: com.facebook.react.uimanager.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1944g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1944g0 f22418a = new C1944g0();

    private C1944g0() {
    }

    public static final float c() {
        return C1978y.d().density;
    }

    public static final float e(float f10) {
        if (Float.isNaN(f10)) {
            return Float.NaN;
        }
        return f10 / C1978y.d().density;
    }

    public static final float f(double d10) {
        return g((float) d10);
    }

    public static final float g(float f10) {
        if (Float.isNaN(f10)) {
            return Float.NaN;
        }
        return TypedValue.applyDimension(1, f10, C1978y.d());
    }

    public static final float h(double d10) {
        return k((float) d10, 0.0f, 2, null);
    }

    public static final float i(float f10) {
        return k(f10, 0.0f, 2, null);
    }

    public static final float j(float f10, float f11) {
        if (Float.isNaN(f10)) {
            return Float.NaN;
        }
        DisplayMetrics d10 = C1978y.d();
        float applyDimension = TypedValue.applyDimension(2, f10, d10);
        return f11 >= 1.0f ? Math.min(applyDimension, f10 * d10.density * f11) : applyDimension;
    }

    public static /* synthetic */ float k(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return j(f10, f11);
    }

    public final float a(double d10) {
        return f(d10);
    }

    public final float b(float f10) {
        return g(f10);
    }

    public final float d(float f10) {
        return e(f10);
    }
}
