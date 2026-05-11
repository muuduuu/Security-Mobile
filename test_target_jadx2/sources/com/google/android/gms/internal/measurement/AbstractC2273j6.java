package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.j6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2273j6 {

    /* renamed from: a, reason: collision with root package name */
    final Unsafe f24540a;

    AbstractC2273j6(Unsafe unsafe) {
        this.f24540a = unsafe;
    }

    public abstract void a(Object obj, long j10, byte b10);

    public abstract boolean b(Object obj, long j10);

    public abstract void c(Object obj, long j10, boolean z10);

    public abstract float d(Object obj, long j10);

    public abstract void e(Object obj, long j10, float f10);

    public abstract double f(Object obj, long j10);

    public abstract void g(Object obj, long j10, double d10);
}
