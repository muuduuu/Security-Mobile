package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2556c1 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2556c1 f25113a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2556c1 f25114b;

    static {
        AbstractC2568f1 abstractC2568f1 = null;
        f25113a = new C2564e1();
        f25114b = new C2574h1();
    }

    private AbstractC2556c1() {
    }

    static AbstractC2556c1 a() {
        return f25113a;
    }

    static AbstractC2556c1 c() {
        return f25114b;
    }

    abstract void b(Object obj, Object obj2, long j10);

    abstract void d(Object obj, long j10);
}
