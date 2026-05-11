package com.facebook.react.uimanager;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final M f22178a = new M();

    private M() {
    }

    public static final boolean a(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            if (!Float.isNaN(f10) || !Float.isNaN(f11)) {
                return false;
            }
        } else if (Math.abs(f11 - f10) >= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static final boolean b(Float f10, Float f11) {
        if (f10 == null) {
            return f11 == null;
        }
        if (f11 == null) {
            return false;
        }
        return a(f10.floatValue(), f11.floatValue());
    }
}
