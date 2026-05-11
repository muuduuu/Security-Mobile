package com.google.android.gms.internal.measurement;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2231f0 {

    /* renamed from: a, reason: collision with root package name */
    static final AbstractC2231f0 f24499a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24500b = 0;

    static {
        X x10 = new X();
        x10.e(BuildConfig.FLAVOR);
        x10.a(false);
        x10.c(1);
        x10.d(1);
        x10.b();
        X x11 = new X();
        x11.e(BuildConfig.FLAVOR);
        x11.a(false);
        x11.c(4);
        x11.d(1);
        f24499a = x11.b();
        X x12 = new X();
        x12.e(BuildConfig.FLAVOR);
        x12.a(false);
        x12.c(2);
        x12.d(1);
        x12.b();
    }

    public abstract String a();

    public abstract boolean b();

    public abstract V c();

    public abstract W d();

    public abstract int e();

    public abstract int f();
}
