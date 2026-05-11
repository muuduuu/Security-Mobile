package com.google.protobuf;

import com.google.protobuf.G;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2880k implements p0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2879j f28765a;

    /* renamed from: com.google.protobuf.k$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28766a;

        static {
            int[] iArr = new int[o0.b.values().length];
            f28766a = iArr;
            try {
                iArr[o0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28766a[o0.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28766a[o0.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28766a[o0.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28766a[o0.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28766a[o0.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28766a[o0.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28766a[o0.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28766a[o0.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28766a[o0.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28766a[o0.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28766a[o0.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C2880k(AbstractC2879j abstractC2879j) {
        AbstractC2879j abstractC2879j2 = (AbstractC2879j) AbstractC2893y.b(abstractC2879j, "output");
        this.f28765a = abstractC2879j2;
        abstractC2879j2.f28753a = this;
    }

    public static C2880k P(AbstractC2879j abstractC2879j) {
        C2880k c2880k = abstractC2879j.f28753a;
        return c2880k != null ? c2880k : new C2880k(abstractC2879j);
    }

    private void Q(int i10, G.a aVar, Map map) {
        int[] iArr = a.f28766a;
        throw null;
    }

    private void R(int i10, Object obj) {
        if (obj instanceof String) {
            this.f28765a.C0(i10, (String) obj);
        } else {
            this.f28765a.a0(i10, (AbstractC2877h) obj);
        }
    }

    @Override // com.google.protobuf.p0
    public void A(int i10, float f10) {
        this.f28765a.j0(i10, f10);
    }

    @Override // com.google.protobuf.p0
    public void B(int i10) {
        this.f28765a.D0(i10, 4);
    }

    @Override // com.google.protobuf.p0
    public void C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f28765a.y0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f28765a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2879j.G(((Integer) list.get(i13)).intValue());
        }
        this.f28765a.F0(i12);
        while (i11 < list.size()) {
            this.f28765a.z0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.p0
    public void D(int i10, int i11) {
        this.f28765a.d0(i10, i11);
    }

    @Override // com.google.protobuf.p0
    public void E(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f28765a.p0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f28765a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2879j.w(((Long) list.get(i13)).longValue());
        }
        this.f28765a.F0(i12);
        while (i11 < list.size()) {
            this.f28765a.q0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.p0
    public void F(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f28765a.d0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f28765a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2879j.k(((Integer) list.get(i13)).intValue());
        }
        this.f28765a.F0(i12);
        while (i11 < list.size()) {
            this.f28765a.e0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.p0
    public void G(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f28765a.b0(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f28765a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2879j.i(((Double) list.get(i13)).doubleValue());
        }
        this.f28765a.F0(i12);
        while (i11 < list.size()) {
            this.f28765a.c0(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.p0
    public void H(int i10, int i11) {
        this.f28765a.y0(i10, i11);
    }

    @Override // com.google.protobuf.p0
    public void I(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f28765a.a0(i10, (AbstractC2877h) list.get(i11));
        }
    }

    @Override // com.google.protobuf.p0
    public void J(int i10, List list, c0 c0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            L(i10, list.get(i11), c0Var);
        }
    }

    @Override // com.google.protobuf.p0
    public void K(int i10, List list, c0 c0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            M(i10, list.get(i11), c0Var);
        }
    }

    @Override // com.google.protobuf.p0
    public void L(int i10, Object obj, c0 c0Var) {
        this.f28765a.r0(i10, (N) obj, c0Var);
    }

    @Override // com.google.protobuf.p0
    public void M(int i10, Object obj, c0 c0Var) {
        this.f28765a.l0(i10, (N) obj, c0Var);
    }

    @Override // com.google.protobuf.p0
    public void N(int i10, AbstractC2877h abstractC2877h) {
        this.f28765a.a0(i10, abstractC2877h);
    }

    @Override // com.google.protobuf.p0
    public void O(int i10, G.a aVar, Map map) {
        if (this.f28765a.T()) {
            Q(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f28765a.D0(i10, 2);
            this.f28765a.F0(G.a(aVar, entry.getKey(), entry.getValue()));
            G.b(this.f28765a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.p0
    public void a(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f28765a.j0(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f28765a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2879j.q(((Float) list.get(i13)).floatValue());
        }
        this.f28765a.F0(i12);
        while (i11 < list.size()) {
            this.f28765a.k0(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.p0
    public void b(int i10, int i11) {
        this.f28765a.E0(i10, i11);
    }

    @Override // com.google.protobuf.p0
    public final void c(int i10, Object obj) {
        if (obj instanceof AbstractC2877h) {
            this.f28765a.t0(i10, (AbstractC2877h) obj);
        } else {
            this.f28765a.s0(i10, (N) obj);
        }
    }

    @Override // com.google.protobuf.p0
    public void d(int i10, int i11) {
        this.f28765a.f0(i10, i11);
    }

    @Override // com.google.protobuf.p0
    public void e(int i10, double d10) {
        this.f28765a.b0(i10, d10);
    }

    @Override // com.google.protobuf.p0
    public void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f28765a.w0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f28765a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2879j.E(((Long) list.get(i13)).longValue());
        }
        this.f28765a.F0(i12);
        while (i11 < list.size()) {
            this.f28765a.x0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.p0
    public void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f28765a.G0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f28765a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2879j.P(((Long) list.get(i13)).longValue());
        }
        this.f28765a.F0(i12);
        while (i11 < list.size()) {
            this.f28765a.H0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.p0
    public void h(int i10, long j10) {
        this.f28765a.h0(i10, j10);
    }

    @Override // com.google.protobuf.p0
    public p0.a i() {
        return p0.a.ASCENDING;
    }

    @Override // com.google.protobuf.p0
    public void j(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof C)) {
            while (i11 < list.size()) {
                this.f28765a.C0(i10, (String) list.get(i11));
                i11++;
            }
        } else {
            C c10 = (C) list;
            while (i11 < list.size()) {
                R(i10, c10.s(i11));
                i11++;
            }
        }
    }

    @Override // com.google.protobuf.p0
    public void k(int i10, String str) {
        this.f28765a.C0(i10, str);
    }

    @Override // com.google.protobuf.p0
    public void l(int i10, long j10) {
        this.f28765a.G0(i10, j10);
    }

    @Override // com.google.protobuf.p0
    public void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f28765a.n0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f28765a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2879j.u(((Integer) list.get(i13)).intValue());
        }
        this.f28765a.F0(i12);
        while (i11 < list.size()) {
            this.f28765a.o0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.p0
    public void n(int i10, long j10) {
        this.f28765a.p0(i10, j10);
    }

    @Override // com.google.protobuf.p0
    public void o(int i10, boolean z10) {
        this.f28765a.Y(i10, z10);
    }

    @Override // com.google.protobuf.p0
    public void p(int i10, int i11) {
        this.f28765a.u0(i10, i11);
    }

    @Override // com.google.protobuf.p0
    public void q(int i10) {
        this.f28765a.D0(i10, 3);
    }

    @Override // com.google.protobuf.p0
    public void r(int i10, int i11) {
        this.f28765a.n0(i10, i11);
    }

    @Override // com.google.protobuf.p0
    public void s(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f28765a.h0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f28765a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2879j.o(((Long) list.get(i13)).longValue());
        }
        this.f28765a.F0(i12);
        while (i11 < list.size()) {
            this.f28765a.i0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.p0
    public void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f28765a.u0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f28765a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2879j.C(((Integer) list.get(i13)).intValue());
        }
        this.f28765a.F0(i12);
        while (i11 < list.size()) {
            this.f28765a.v0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.p0
    public void u(int i10, long j10) {
        this.f28765a.w0(i10, j10);
    }

    @Override // com.google.protobuf.p0
    public void v(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f28765a.f0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f28765a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2879j.m(((Integer) list.get(i13)).intValue());
        }
        this.f28765a.F0(i12);
        while (i11 < list.size()) {
            this.f28765a.g0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.p0
    public void w(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f28765a.Y(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f28765a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2879j.e(((Boolean) list.get(i13)).booleanValue());
        }
        this.f28765a.F0(i12);
        while (i11 < list.size()) {
            this.f28765a.Z(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.p0
    public void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f28765a.E0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f28765a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2879j.N(((Integer) list.get(i13)).intValue());
        }
        this.f28765a.F0(i12);
        while (i11 < list.size()) {
            this.f28765a.F0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.p0
    public void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f28765a.A0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f28765a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2879j.I(((Long) list.get(i13)).longValue());
        }
        this.f28765a.F0(i12);
        while (i11 < list.size()) {
            this.f28765a.B0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.p0
    public void z(int i10, long j10) {
        this.f28765a.A0(i10, j10);
    }
}
