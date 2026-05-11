package com.facebook.react.uimanager;

/* renamed from: com.facebook.react.uimanager.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1967s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1967s0 f22469a = new C1967s0();

    /* renamed from: b, reason: collision with root package name */
    private static int f22470b = 1;

    private C1967s0() {
    }

    public static final synchronized int a() {
        int i10;
        synchronized (C1967s0.class) {
            i10 = f22470b;
            f22470b = i10 + 10;
        }
        return i10;
    }
}
