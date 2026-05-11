package com.facebook.react.uimanager;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public static final U f22289a = new U();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22290a;

        static {
            int[] iArr = new int[com.facebook.yoga.h.values().length];
            try {
                iArr[com.facebook.yoga.h.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.facebook.yoga.h.RTL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22290a = iArr;
        }
    }

    private U() {
    }

    public static final int a(com.facebook.yoga.h direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i10 = a.f22290a[direction.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? 2 : 1;
        }
        return 0;
    }
}
