package com.google.android.gms.internal.vision;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2620x0 implements y2 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2614v0 f25201a;

    private C2620x0(AbstractC2614v0 abstractC2614v0) {
        AbstractC2614v0 abstractC2614v02 = (AbstractC2614v0) R0.f(abstractC2614v0, "output");
        this.f25201a = abstractC2614v02;
        abstractC2614v02.f25196a = this;
    }

    public static C2620x0 O(AbstractC2614v0 abstractC2614v0) {
        C2620x0 c2620x0 = abstractC2614v0.f25196a;
        return c2620x0 != null ? c2620x0 : new C2620x0(abstractC2614v0);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void A(int i10, long j10) {
        this.f25201a.U(i10, j10);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void B(int i10, boolean z10) {
        this.f25201a.q(i10, z10);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void C(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f25201a.m(i10, (AbstractC2570g0) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void D(int i10, int i11) {
        this.f25201a.f0(i10, i11);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void E(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f25201a.j(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f25201a.k(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2614v0.y(((Float) list.get(i13)).floatValue());
        }
        this.f25201a.K(i12);
        while (i11 < list.size()) {
            this.f25201a.g(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void F(int i10, int i11) {
        this.f25201a.T(i10, i11);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void G(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof InterfaceC2560d1)) {
            while (i11 < list.size()) {
                this.f25201a.p(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC2560d1 interfaceC2560d1 = (InterfaceC2560d1) list;
        while (i11 < list.size()) {
            Object n10 = interfaceC2560d1.n(i11);
            if (n10 instanceof String) {
                this.f25201a.p(i10, (String) n10);
            } else {
                this.f25201a.m(i10, (AbstractC2570g0) n10);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void H(int i10, AbstractC2570g0 abstractC2570g0) {
        this.f25201a.m(i10, abstractC2570g0);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void I(int i10, AbstractC2595o1 abstractC2595o1, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f25201a.k(i10, 2);
            this.f25201a.K(AbstractC2586l1.a(abstractC2595o1, entry.getKey(), entry.getValue()));
            AbstractC2586l1.b(this.f25201a, abstractC2595o1, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void J(int i10, List list, K1 k12) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            M(i10, list.get(i11), k12);
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void K(int i10, Object obj, K1 k12) {
        this.f25201a.o(i10, (InterfaceC2609t1) obj, k12);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void L(int i10, long j10) {
        this.f25201a.M(i10, j10);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void M(int i10, Object obj, K1 k12) {
        AbstractC2614v0 abstractC2614v0 = this.f25201a;
        abstractC2614v0.k(i10, 3);
        k12.c((InterfaceC2609t1) obj, abstractC2614v0.f25196a);
        abstractC2614v0.k(i10, 4);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void N(int i10, List list, K1 k12) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            K(i10, list.get(i11), k12);
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void a(int i10, long j10) {
        this.f25201a.l(i10, j10);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void b(int i10) {
        this.f25201a.k(i10, 3);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f25201a.l(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f25201a.k(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2614v0.Z(((Long) list.get(i13)).longValue());
        }
        this.f25201a.K(i12);
        while (i11 < list.size()) {
            this.f25201a.r(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void d(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f25201a.U(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f25201a.k(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2614v0.r0(((Long) list.get(i13)).longValue());
        }
        this.f25201a.K(i12);
        while (i11 < list.size()) {
            this.f25201a.V(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void e(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f25201a.T(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f25201a.k(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2614v0.k0(((Integer) list.get(i13)).intValue());
        }
        this.f25201a.K(i12);
        while (i11 < list.size()) {
            this.f25201a.K(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f25201a.M(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f25201a.k(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2614v0.j0(((Long) list.get(i13)).longValue());
        }
        this.f25201a.K(i12);
        while (i11 < list.size()) {
            this.f25201a.O(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f25201a.i(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f25201a.k(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2614v0.x(((Double) list.get(i13)).doubleValue());
        }
        this.f25201a.K(i12);
        while (i11 < list.size()) {
            this.f25201a.f(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void h(int i10, int i11) {
        this.f25201a.f0(i10, i11);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f25201a.q(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f25201a.k(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2614v0.H(((Boolean) list.get(i13)).booleanValue());
        }
        this.f25201a.K(i12);
        while (i11 < list.size()) {
            this.f25201a.w(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void j(int i10, long j10) {
        this.f25201a.U(i10, j10);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void k(int i10, int i11) {
        this.f25201a.L(i10, i11);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f25201a.L(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f25201a.k(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2614v0.g0(((Integer) list.get(i13)).intValue());
        }
        this.f25201a.K(i12);
        while (i11 < list.size()) {
            this.f25201a.h(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f25201a.L(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f25201a.k(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2614v0.x0(((Integer) list.get(i13)).intValue());
        }
        this.f25201a.K(i12);
        while (i11 < list.size()) {
            this.f25201a.h(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void n(int i10) {
        this.f25201a.k(i10, 4);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void o(int i10, int i11) {
        this.f25201a.L(i10, i11);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void p(int i10, Object obj) {
        if (obj instanceof AbstractC2570g0) {
            this.f25201a.N(i10, (AbstractC2570g0) obj);
        } else {
            this.f25201a.n(i10, (InterfaceC2609t1) obj);
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f25201a.f0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f25201a.k(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2614v0.s0(((Integer) list.get(i13)).intValue());
        }
        this.f25201a.K(i12);
        while (i11 < list.size()) {
            this.f25201a.a0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void r(int i10, String str) {
        this.f25201a.p(i10, str);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void s(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f25201a.f0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f25201a.k(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2614v0.v0(((Integer) list.get(i13)).intValue());
        }
        this.f25201a.K(i12);
        while (i11 < list.size()) {
            this.f25201a.a0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void t(int i10, long j10) {
        this.f25201a.l(i10, j10);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void u(int i10, double d10) {
        this.f25201a.i(i10, d10);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void v(int i10, float f10) {
        this.f25201a.j(i10, f10);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void w(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f25201a.U(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f25201a.k(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2614v0.n0(((Long) list.get(i13)).longValue());
        }
        this.f25201a.K(i12);
        while (i11 < list.size()) {
            this.f25201a.V(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void x(int i10, int i11) {
        this.f25201a.b0(i10, i11);
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f25201a.l(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f25201a.k(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2614v0.e0(((Long) list.get(i13)).longValue());
        }
        this.f25201a.K(i12);
        while (i11 < list.size()) {
            this.f25201a.r(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f25201a.b0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f25201a.k(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2614v0.o0(((Integer) list.get(i13)).intValue());
        }
        this.f25201a.K(i12);
        while (i11 < list.size()) {
            this.f25201a.S(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.y2
    public final int zza() {
        return x2.f25221a;
    }
}
