package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import com.google.android.gms.internal.measurement.C2225e3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
final class X6 {

    /* renamed from: a, reason: collision with root package name */
    C2225e3 f25734a;

    /* renamed from: b, reason: collision with root package name */
    List f25735b;

    /* renamed from: c, reason: collision with root package name */
    List f25736c;

    /* renamed from: d, reason: collision with root package name */
    long f25737d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b7 f25738e;

    /* synthetic */ X6(b7 b7Var, byte[] bArr) {
        Objects.requireNonNull(b7Var);
        this.f25738e = b7Var;
    }

    private static final long b(com.google.android.gms.internal.measurement.S2 s22) {
        return ((s22.H() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, com.google.android.gms.internal.measurement.S2 s22) {
        AbstractC1287s.m(s22);
        if (this.f25736c == null) {
            this.f25736c = new ArrayList();
        }
        if (this.f25735b == null) {
            this.f25735b = new ArrayList();
        }
        if (!this.f25736c.isEmpty() && b((com.google.android.gms.internal.measurement.S2) this.f25736c.get(0)) != b(s22)) {
            return false;
        }
        long a10 = this.f25737d + s22.a();
        b7 b7Var = this.f25738e;
        if (!b7Var.B0().H(null, AbstractC2671f2.f26001e1)) {
            b7Var.B0();
            if (a10 >= C2724m.o()) {
                return false;
            }
        } else if (!this.f25736c.isEmpty()) {
            b7Var.B0();
            if (a10 >= C2724m.o()) {
                return false;
            }
        }
        this.f25737d = a10;
        this.f25736c.add(s22);
        this.f25735b.add(Long.valueOf(j10));
        int size = this.f25736c.size();
        b7Var.B0();
        return size < Math.max(1, ((Integer) AbstractC2671f2.f26017k.b(null)).intValue());
    }
}
