package com.google.android.gms.internal.measurement;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class A5 {

    /* renamed from: a, reason: collision with root package name */
    private final C2415z5 f24117a;

    private A5(EnumC2318o6 enumC2318o6, Object obj, EnumC2318o6 enumC2318o62, Object obj2) {
        this.f24117a = new C2415z5(enumC2318o6, BuildConfig.FLAVOR, enumC2318o62, BuildConfig.FLAVOR);
    }

    public static A5 a(EnumC2318o6 enumC2318o6, Object obj, EnumC2318o6 enumC2318o62, Object obj2) {
        return new A5(enumC2318o6, BuildConfig.FLAVOR, enumC2318o62, BuildConfig.FLAVOR);
    }

    static void b(O4 o42, C2415z5 c2415z5, Object obj, Object obj2) {
        Y4.c(o42, c2415z5.f24715a, 1, obj);
        Y4.c(o42, c2415z5.f24717c, 2, obj2);
    }

    static int c(C2415z5 c2415z5, Object obj, Object obj2) {
        return Y4.d(c2415z5.f24715a, 1, obj) + Y4.d(c2415z5.f24717c, 2, obj2);
    }

    public final int d(int i10, Object obj, Object obj2) {
        C2415z5 c2415z5 = this.f24117a;
        int E10 = O4.E(i10 << 3);
        int c10 = c(c2415z5, obj, obj2);
        return E10 + O4.E(c10) + c10;
    }

    final C2415z5 e() {
        return this.f24117a;
    }
}
