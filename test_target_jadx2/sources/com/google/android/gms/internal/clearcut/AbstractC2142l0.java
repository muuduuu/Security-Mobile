package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2142l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2142l0 f24081a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2142l0 f24082b;

    static {
        AbstractC2145m0 abstractC2145m0 = null;
        f24081a = new C2148n0();
        f24082b = new C2151o0();
    }

    private AbstractC2142l0() {
    }

    static AbstractC2142l0 c() {
        return f24081a;
    }

    static AbstractC2142l0 d() {
        return f24082b;
    }

    abstract void a(Object obj, long j10);

    abstract void b(Object obj, Object obj2, long j10);
}
