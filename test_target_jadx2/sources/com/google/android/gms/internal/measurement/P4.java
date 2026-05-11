package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class P4 implements InterfaceC2336q6 {

    /* renamed from: a, reason: collision with root package name */
    private final O4 f24327a;

    private P4(O4 o42) {
        byte[] bArr = AbstractC2308n5.f24582b;
        this.f24327a = o42;
        o42.f24320a = this;
    }

    public static P4 b(O4 o42) {
        P4 p42 = o42.f24320a;
        return p42 != null ? p42 : new P4(o42);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void A(int i10, long j10) {
        this.f24327a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void B(int i10, J4 j42) {
        this.f24327a.q(i10, j42);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2379v5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f24327a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            O4 o42 = this.f24327a;
            o42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += O4.a(((Long) list.get(i13)).longValue());
            }
            o42.x(i12);
            while (i11 < list.size()) {
                o42.z(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C2379v5 c2379v5 = (C2379v5) list;
        if (!z10) {
            while (i11 < c2379v5.size()) {
                this.f24327a.m(i10, c2379v5.O0(i11));
                i11++;
            }
            return;
        }
        O4 o43 = this.f24327a;
        o43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2379v5.size(); i15++) {
            i14 += O4.a(c2379v5.O0(i15));
        }
        o43.x(i14);
        while (i11 < c2379v5.size()) {
            o43.z(c2379v5.O0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void D(int i10, C2415z5 c2415z5, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            O4 o42 = this.f24327a;
            o42.i(i10, 2);
            o42.x(A5.c(c2415z5, entry.getKey(), entry.getValue()));
            A5.b(o42, c2415z5, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void E(int i10, Object obj, S5 s52) {
        this.f24327a.t(i10, (H5) obj, s52);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void F(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2254h5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f24327a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            O4 o42 = this.f24327a;
            o42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            o42.x(i12);
            while (i11 < list.size()) {
                o42.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2254h5 c2254h5 = (C2254h5) list;
        if (!z10) {
            while (i11 < c2254h5.size()) {
                this.f24327a.l(i10, c2254h5.h(i11));
                i11++;
            }
            return;
        }
        O4 o43 = this.f24327a;
        o43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2254h5.size(); i15++) {
            c2254h5.h(i15);
            i14 += 4;
        }
        o43.x(i14);
        while (i11 < c2254h5.size()) {
            o43.y(c2254h5.h(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void G(int i10, long j10) {
        this.f24327a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void H(int i10, long j10) {
        this.f24327a.m(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void I(int i10) {
        this.f24327a.i(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void J(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2254h5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f24327a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            O4 o42 = this.f24327a;
            o42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += O4.E(((Integer) list.get(i13)).intValue());
            }
            o42.x(i12);
            while (i11 < list.size()) {
                o42.x(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2254h5 c2254h5 = (C2254h5) list;
        if (!z10) {
            while (i11 < c2254h5.size()) {
                this.f24327a.k(i10, c2254h5.h(i11));
                i11++;
            }
            return;
        }
        O4 o43 = this.f24327a;
        o43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2254h5.size(); i15++) {
            i14 += O4.E(c2254h5.h(i15));
        }
        o43.x(i14);
        while (i11 < c2254h5.size()) {
            o43.x(c2254h5.h(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void K(int i10) {
        this.f24327a.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void L(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f24327a.q(i10, (J4) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void M(int i10, String str) {
        this.f24327a.p(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void N(int i10, List list, boolean z10) {
        if (list instanceof AbstractC2191a5) {
            android.support.v4.media.session.b.a(list);
            if (!z10) {
                throw null;
            }
            this.f24327a.i(i10, 2);
            throw null;
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24327a.l(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        O4 o42 = this.f24327a;
        o42.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            i12 += 4;
        }
        o42.x(i12);
        while (i11 < list.size()) {
            o42.y(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void O(int i10, int i11) {
        this.f24327a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void P(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof InterfaceC2343r5)) {
            while (i11 < list.size()) {
                this.f24327a.p(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC2343r5 interfaceC2343r5 = (InterfaceC2343r5) list;
        while (i11 < list.size()) {
            Object a10 = interfaceC2343r5.a();
            if (a10 instanceof String) {
                this.f24327a.p(i10, (String) a10);
            } else {
                this.f24327a.q(i10, (J4) a10);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void Q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2254h5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    O4 o42 = this.f24327a;
                    int intValue = ((Integer) list.get(i11)).intValue();
                    o42.k(i10, (intValue >> 31) ^ (intValue + intValue));
                    i11++;
                }
                return;
            }
            O4 o43 = this.f24327a;
            o43.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue2 = ((Integer) list.get(i13)).intValue();
                i12 += O4.E((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            o43.x(i12);
            while (i11 < list.size()) {
                int intValue3 = ((Integer) list.get(i11)).intValue();
                o43.x((intValue3 >> 31) ^ (intValue3 + intValue3));
                i11++;
            }
            return;
        }
        C2254h5 c2254h5 = (C2254h5) list;
        if (!z10) {
            while (i11 < c2254h5.size()) {
                O4 o44 = this.f24327a;
                int h10 = c2254h5.h(i11);
                o44.k(i10, (h10 >> 31) ^ (h10 + h10));
                i11++;
            }
            return;
        }
        O4 o45 = this.f24327a;
        o45.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2254h5.size(); i15++) {
            int h11 = c2254h5.h(i15);
            i14 += O4.E((h11 >> 31) ^ (h11 + h11));
        }
        o45.x(i14);
        while (i11 < c2254h5.size()) {
            int h12 = c2254h5.h(i11);
            o45.x((h12 >> 31) ^ (h12 + h12));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void R(int i10, int i11) {
        this.f24327a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void S(int i10, int i11) {
        this.f24327a.k(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void T(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2254h5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f24327a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            O4 o42 = this.f24327a;
            o42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            o42.x(i12);
            while (i11 < list.size()) {
                o42.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2254h5 c2254h5 = (C2254h5) list;
        if (!z10) {
            while (i11 < c2254h5.size()) {
                this.f24327a.l(i10, c2254h5.h(i11));
                i11++;
            }
            return;
        }
        O4 o43 = this.f24327a;
        o43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2254h5.size(); i15++) {
            c2254h5.h(i15);
            i14 += 4;
        }
        o43.x(i14);
        while (i11 < c2254h5.size()) {
            o43.y(c2254h5.h(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void U(int i10, Object obj, S5 s52) {
        O4 o42 = this.f24327a;
        o42.i(i10, 3);
        s52.h((H5) obj, o42.f24320a);
        o42.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void V(int i10, boolean z10) {
        this.f24327a.o(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void W(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2254h5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f24327a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            O4 o42 = this.f24327a;
            o42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += O4.a(((Integer) list.get(i13)).intValue());
            }
            o42.x(i12);
            while (i11 < list.size()) {
                o42.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2254h5 c2254h5 = (C2254h5) list;
        if (!z10) {
            while (i11 < c2254h5.size()) {
                this.f24327a.j(i10, c2254h5.h(i11));
                i11++;
            }
            return;
        }
        O4 o43 = this.f24327a;
        o43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2254h5.size(); i15++) {
            i14 += O4.a(c2254h5.h(i15));
        }
        o43.x(i14);
        while (i11 < c2254h5.size()) {
            o43.w(c2254h5.h(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void X(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2254h5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f24327a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            O4 o42 = this.f24327a;
            o42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += O4.a(((Integer) list.get(i13)).intValue());
            }
            o42.x(i12);
            while (i11 < list.size()) {
                o42.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2254h5 c2254h5 = (C2254h5) list;
        if (!z10) {
            while (i11 < c2254h5.size()) {
                this.f24327a.j(i10, c2254h5.h(i11));
                i11++;
            }
            return;
        }
        O4 o43 = this.f24327a;
        o43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2254h5.size(); i15++) {
            i14 += O4.a(c2254h5.h(i15));
        }
        o43.x(i14);
        while (i11 < c2254h5.size()) {
            o43.w(c2254h5.h(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void Y(int i10, float f10) {
        this.f24327a.l(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void a(int i10, long j10) {
        this.f24327a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void h(int i10, long j10) {
        this.f24327a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void k(int i10, int i11) {
        this.f24327a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2379v5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f24327a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            O4 o42 = this.f24327a;
            o42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += O4.a(((Long) list.get(i13)).longValue());
            }
            o42.x(i12);
            while (i11 < list.size()) {
                o42.z(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C2379v5 c2379v5 = (C2379v5) list;
        if (!z10) {
            while (i11 < c2379v5.size()) {
                this.f24327a.m(i10, c2379v5.O0(i11));
                i11++;
            }
            return;
        }
        O4 o43 = this.f24327a;
        o43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2379v5.size(); i15++) {
            i14 += O4.a(c2379v5.O0(i15));
        }
        o43.x(i14);
        while (i11 < c2379v5.size()) {
            o43.z(c2379v5.O0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void m(int i10, int i11) {
        this.f24327a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void o(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2379v5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f24327a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            O4 o42 = this.f24327a;
            o42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            o42.x(i12);
            while (i11 < list.size()) {
                o42.A(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C2379v5 c2379v5 = (C2379v5) list;
        if (!z10) {
            while (i11 < c2379v5.size()) {
                this.f24327a.n(i10, c2379v5.O0(i11));
                i11++;
            }
            return;
        }
        O4 o43 = this.f24327a;
        o43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2379v5.size(); i15++) {
            c2379v5.O0(i15);
            i14 += 8;
        }
        o43.x(i14);
        while (i11 < c2379v5.size()) {
            o43.A(c2379v5.O0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void p(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2379v5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f24327a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            O4 o42 = this.f24327a;
            o42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            o42.x(i12);
            while (i11 < list.size()) {
                o42.A(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C2379v5 c2379v5 = (C2379v5) list;
        if (!z10) {
            while (i11 < c2379v5.size()) {
                this.f24327a.n(i10, c2379v5.O0(i11));
                i11++;
            }
            return;
        }
        O4 o43 = this.f24327a;
        o43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2379v5.size(); i15++) {
            c2379v5.O0(i15);
            i14 += 8;
        }
        o43.x(i14);
        while (i11 < c2379v5.size()) {
            o43.A(c2379v5.O0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void q(int i10, int i11) {
        this.f24327a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void r(int i10, List list, boolean z10) {
        if (list instanceof Q4) {
            android.support.v4.media.session.b.a(list);
            if (!z10) {
                throw null;
            }
            this.f24327a.i(i10, 2);
            throw null;
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24327a.n(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        O4 o42 = this.f24327a;
        o42.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            i12 += 8;
        }
        o42.x(i12);
        while (i11 < list.size()) {
            o42.A(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void s(int i10, double d10) {
        this.f24327a.n(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2379v5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    O4 o42 = this.f24327a;
                    long longValue = ((Long) list.get(i11)).longValue();
                    o42.m(i10, (longValue >> 63) ^ (longValue + longValue));
                    i11++;
                }
                return;
            }
            O4 o43 = this.f24327a;
            o43.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue2 = ((Long) list.get(i13)).longValue();
                i12 += O4.a((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            o43.x(i12);
            while (i11 < list.size()) {
                long longValue3 = ((Long) list.get(i11)).longValue();
                o43.z((longValue3 >> 63) ^ (longValue3 + longValue3));
                i11++;
            }
            return;
        }
        C2379v5 c2379v5 = (C2379v5) list;
        if (!z10) {
            while (i11 < c2379v5.size()) {
                O4 o44 = this.f24327a;
                long O02 = c2379v5.O0(i11);
                o44.m(i10, (O02 >> 63) ^ (O02 + O02));
                i11++;
            }
            return;
        }
        O4 o45 = this.f24327a;
        o45.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2379v5.size(); i15++) {
            long O03 = c2379v5.O0(i15);
            i14 += O4.a((O03 >> 63) ^ (O03 + O03));
        }
        o45.x(i14);
        while (i11 < c2379v5.size()) {
            long O04 = c2379v5.O0(i11);
            o45.z((O04 >> 63) ^ (O04 + O04));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2336q6
    public final void u(int i10, List list, boolean z10) {
        if (list instanceof AbstractC2414z4) {
            android.support.v4.media.session.b.a(list);
            if (!z10) {
                throw null;
            }
            this.f24327a.i(i10, 2);
            throw null;
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f24327a.o(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        O4 o42 = this.f24327a;
        o42.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            i12++;
        }
        o42.x(i12);
        while (i11 < list.size()) {
            o42.v(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }
}
