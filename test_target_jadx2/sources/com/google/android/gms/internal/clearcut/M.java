package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC2109a0;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class M implements InterfaceC2166t1 {

    /* renamed from: a, reason: collision with root package name */
    private final K f23863a;

    private M(K k10) {
        K k11 = (K) AbstractC2115c0.e(k10, "output");
        this.f23863a = k11;
        k11.f23844a = this;
    }

    public static M b(K k10) {
        M m10 = k10.f23844a;
        return m10 != null ? m10 : new M(k10);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final int B() {
        return AbstractC2109a0.c.f24004l;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void C(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f23863a.k(i10, (AbstractC2179y) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void D(int i10, int i11) {
        this.f23863a.V(i10, i11);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void E(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f23863a.i(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f23863a.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += K.v(((Float) list.get(i13)).floatValue());
        }
        this.f23863a.s0(i12);
        while (i11 < list.size()) {
            this.f23863a.g(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void F(int i10, int i11) {
        this.f23863a.Z(i10, i11);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void G(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof InterfaceC2139k0)) {
            while (i11 < list.size()) {
                this.f23863a.n(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC2139k0 interfaceC2139k0 = (InterfaceC2139k0) list;
        while (i11 < list.size()) {
            Object s10 = interfaceC2139k0.s(i11);
            if (s10 instanceof String) {
                this.f23863a.n(i10, (String) s10);
            } else {
                this.f23863a.k(i10, (AbstractC2179y) s10);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void H(int i10, List list, R0 r02) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            P(i10, list.get(i11), r02);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void I(int i10, List list, R0 r02) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), r02);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void J(int i10) {
        this.f23863a.D(i10, 4);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void K(int i10, long j10) {
        this.f23863a.j(i10, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void L(int i10, int i11) {
        this.f23863a.Q(i10, i11);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void M(int i10, AbstractC2179y abstractC2179y) {
        this.f23863a.k(i10, abstractC2179y);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void N(int i10, Object obj, R0 r02) {
        this.f23863a.m(i10, (B0) obj, r02);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void O(int i10) {
        this.f23863a.D(i10, 3);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void P(int i10, Object obj, R0 r02) {
        K k10 = this.f23863a;
        k10.D(i10, 3);
        r02.e((B0) obj, k10.f23844a);
        k10.D(i10, 4);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void Q(int i10, AbstractC2168u0 abstractC2168u0, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f23863a.D(i10, 2);
            this.f23863a.s0(AbstractC2165t0.a(abstractC2168u0, entry.getKey(), entry.getValue()));
            AbstractC2165t0.b(this.f23863a, abstractC2168u0, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void R(int i10, int i11) {
        this.f23863a.c0(i10, i11);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void a(int i10, long j10) {
        this.f23863a.R(i10, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f23863a.j(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f23863a.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += K.Y(((Long) list.get(i13)).longValue());
        }
        this.f23863a.s0(i12);
        while (i11 < list.size()) {
            this.f23863a.I(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void d(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f23863a.R(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f23863a.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += K.m0(((Long) list.get(i13)).longValue());
        }
        this.f23863a.s0(i12);
        while (i11 < list.size()) {
            this.f23863a.W(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void e(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f23863a.V(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f23863a.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += K.x0(((Integer) list.get(i13)).intValue());
        }
        this.f23863a.s0(i12);
        while (i11 < list.size()) {
            this.f23863a.s0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f23863a.E(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f23863a.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += K.f0(((Long) list.get(i13)).longValue());
        }
        this.f23863a.s0(i12);
        while (i11 < list.size()) {
            this.f23863a.S(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f23863a.h(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f23863a.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += K.u(((Double) list.get(i13)).doubleValue());
        }
        this.f23863a.s0(i12);
        while (i11 < list.size()) {
            this.f23863a.f(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void h(int i10, long j10) {
        this.f23863a.R(i10, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f23863a.H(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f23863a.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += K.C(((Boolean) list.get(i13)).booleanValue());
        }
        this.f23863a.s0(i12);
        while (i11 < list.size()) {
            this.f23863a.r(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void j(int i10, long j10) {
        this.f23863a.E(i10, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f23863a.Q(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f23863a.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += K.w0(((Integer) list.get(i13)).intValue());
        }
        this.f23863a.s0(i12);
        while (i11 < list.size()) {
            this.f23863a.r0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f23863a.Q(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f23863a.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += K.B0(((Integer) list.get(i13)).intValue());
        }
        this.f23863a.s0(i12);
        while (i11 < list.size()) {
            this.f23863a.r0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void n(int i10, boolean z10) {
        this.f23863a.H(i10, z10);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void o(int i10, int i11) {
        this.f23863a.Q(i10, i11);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void p(int i10, Object obj) {
        if (obj instanceof AbstractC2179y) {
            this.f23863a.F(i10, (AbstractC2179y) obj);
        } else {
            this.f23863a.G(i10, (B0) obj);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f23863a.c0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f23863a.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += K.z0(((Integer) list.get(i13)).intValue());
        }
        this.f23863a.s0(i12);
        while (i11 < list.size()) {
            this.f23863a.u0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void r(int i10, String str) {
        this.f23863a.n(i10, str);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void s(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f23863a.c0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f23863a.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += K.A0(((Integer) list.get(i13)).intValue());
        }
        this.f23863a.s0(i12);
        while (i11 < list.size()) {
            this.f23863a.u0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void t(int i10, long j10) {
        this.f23863a.j(i10, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void u(int i10, double d10) {
        this.f23863a.h(i10, d10);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void v(int i10, float f10) {
        this.f23863a.i(i10, f10);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void w(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f23863a.R(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f23863a.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += K.j0(((Long) list.get(i13)).longValue());
        }
        this.f23863a.s0(i12);
        while (i11 < list.size()) {
            this.f23863a.W(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void x(int i10, int i11) {
        this.f23863a.c0(i10, i11);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f23863a.j(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f23863a.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += K.b0(((Long) list.get(i13)).longValue());
        }
        this.f23863a.s0(i12);
        while (i11 < list.size()) {
            this.f23863a.I(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2166t1
    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f23863a.Z(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f23863a.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += K.y0(((Integer) list.get(i13)).intValue());
        }
        this.f23863a.s0(i12);
        while (i11 < list.size()) {
            this.f23863a.t0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }
}
