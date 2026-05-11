package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;

/* loaded from: classes2.dex */
final class Z6 {

    /* renamed from: a, reason: collision with root package name */
    private final b7 f25758a;

    /* renamed from: b, reason: collision with root package name */
    private int f25759b = 1;

    /* renamed from: c, reason: collision with root package name */
    private long f25760c = d();

    public Z6(b7 b7Var) {
        this.f25758a = b7Var;
    }

    private final long d() {
        b7 b7Var = this.f25758a;
        AbstractC1287s.m(b7Var);
        long longValue = ((Long) AbstractC2671f2.f26041v.b(null)).longValue();
        long longValue2 = ((Long) AbstractC2671f2.f26043w.b(null)).longValue();
        for (int i10 = 1; i10 < this.f25759b; i10++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        return b7Var.f().a() + Math.min(longValue, longValue2);
    }

    public final void a() {
        this.f25759b++;
        this.f25760c = d();
    }

    public final boolean b() {
        return this.f25758a.f().a() >= this.f25760c;
    }

    final /* synthetic */ long c() {
        return this.f25760c;
    }
}
