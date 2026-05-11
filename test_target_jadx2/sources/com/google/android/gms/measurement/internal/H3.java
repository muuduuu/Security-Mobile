package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C2207c3;
import com.google.android.gms.internal.measurement.C2216d3;
import com.google.android.gms.internal.measurement.C2225e3;
import com.google.android.gms.internal.measurement.C2234f3;
import com.google.android.gms.internal.measurement.C2252h3;
import com.google.android.gms.internal.measurement.C2368u3;
import com.google.android.gms.internal.measurement.C2377v3;
import com.google.android.gms.internal.measurement.z7;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class H3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ I f25433a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f25434b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ S3 f25435c;

    H3(S3 s32, I i10, String str) {
        this.f25433a = i10;
        this.f25434b = str;
        Objects.requireNonNull(s32);
        this.f25435c = s32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C2690h5 c2690h5;
        byte[] bArr;
        b7 b7Var;
        j7 j7Var;
        b7 b7Var2;
        I2 i22;
        com.google.android.gms.internal.measurement.Z2 z22;
        Bundle bundle;
        String str;
        C2760q3 c2760q3;
        C2216d3 c2216d3;
        String str2;
        Object obj;
        E a10;
        long j10;
        C2803w F02;
        S3 s32 = this.f25435c;
        s32.r1().E();
        C2690h5 J02 = s32.r1().J0();
        J02.h();
        C2760q3 c2760q32 = J02.f25694a;
        C2760q3.q();
        I i10 = this.f25433a;
        AbstractC1287s.m(i10);
        String str3 = this.f25434b;
        AbstractC1287s.g(str3);
        String str4 = i10.f25442a;
        if (!"_iap".equals(str4) && !"_iapx".equals(str4)) {
            J02.f25694a.a().v().c("Generating a payload for this event is not available. package_name, event_name", str3, str4);
            return null;
        }
        b7 b7Var3 = J02.f25405b;
        com.google.android.gms.internal.measurement.Z2 J10 = C2207c3.J();
        b7Var3.F0().r0();
        try {
            I2 J03 = b7Var3.F0().J0(str3);
            if (J03 == null) {
                J02.f25694a.a().v().b("Log and bundle not available. package_name", str3);
                bArr = new byte[0];
            } else if (J03.d()) {
                C2216d3 h02 = C2225e3.h0();
                h02.a0(1);
                h02.A("android");
                if (!TextUtils.isEmpty(J03.o0())) {
                    h02.L(J03.o0());
                }
                if (!TextUtils.isEmpty(J03.H0())) {
                    h02.J((String) AbstractC1287s.m(J03.H0()));
                }
                if (!TextUtils.isEmpty(J03.D0())) {
                    h02.M((String) AbstractC1287s.m(J03.D0()));
                }
                if (J03.F0() != -2147483648L) {
                    h02.C0((int) J03.F0());
                }
                h02.N(J03.J0());
                h02.K0(J03.b());
                String r02 = J03.r0();
                if (!TextUtils.isEmpty(r02)) {
                    h02.v0(r02);
                }
                h02.R0(J03.X());
                C2633a4 g10 = J02.f25405b.g(str3);
                h02.Y(J03.L0());
                if (c2760q32.g() && J02.f25694a.w().k(h02.K()) && g10.o(Z3.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                    h02.F0(null);
                }
                h02.M0(g10.k());
                if (g10.o(Z3.AD_STORAGE) && J03.P()) {
                    Pair m10 = b7Var3.L0().m(J03.o0(), g10);
                    if (J03.P() && !TextUtils.isEmpty((CharSequence) m10.first)) {
                        try {
                            h02.Q(C2690h5.m((String) m10.first, Long.toString(i10.f25445d)));
                            Object obj2 = m10.second;
                            if (obj2 != null) {
                                h02.T(((Boolean) obj2).booleanValue());
                            }
                        } catch (SecurityException e10) {
                            J02.f25694a.a().v().b("Resettable device id encryption failed", e10.getMessage());
                            bArr = new byte[0];
                            b7Var = J02.f25405b;
                            F02 = b7Var.F0();
                            F02.t0();
                            return bArr;
                        }
                    }
                }
                C2760q3 c2760q33 = J02.f25694a;
                c2760q33.K().l();
                h02.D(Build.MODEL);
                c2760q33.K().l();
                h02.C(Build.VERSION.RELEASE);
                h02.H((int) c2760q33.K().o());
                h02.G(c2760q33.K().p());
                try {
                    try {
                        if (g10.o(Z3.ANALYTICS_STORAGE) && J03.p0() != null) {
                            h02.W(C2690h5.m((String) AbstractC1287s.m(J03.p0()), Long.toString(i10.f25445d)));
                        }
                        if (!TextUtils.isEmpty(J03.x0())) {
                            h02.A0((String) AbstractC1287s.m(J03.x0()));
                        }
                        String o02 = J03.o0();
                        b7 b7Var4 = J02.f25405b;
                        List C02 = b7Var4.F0().C0(o02);
                        Iterator it = C02.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                j7Var = null;
                                break;
                            }
                            j7Var = (j7) it.next();
                            if ("_lte".equals(j7Var.f26136c)) {
                                break;
                            }
                        }
                        if (j7Var == null || j7Var.f26138e == null) {
                            j7 j7Var2 = new j7(o02, "auto", "_lte", J02.f25694a.f().a(), 0L);
                            C02.add(j7Var2);
                            b7Var4.F0().A0(j7Var2);
                        }
                        C2377v3[] c2377v3Arr = new C2377v3[C02.size()];
                        for (int i11 = 0; i11 < C02.size(); i11++) {
                            C2368u3 N10 = C2377v3.N();
                            N10.z(((j7) C02.get(i11)).f26136c);
                            N10.y(((j7) C02.get(i11)).f26137d);
                            b7Var4.K0().G(N10, ((j7) C02.get(i11)).f26138e);
                            c2377v3Arr[i11] = (C2377v3) N10.v();
                        }
                        h02.n1(Arrays.asList(c2377v3Arr));
                        b7 b7Var5 = J02.f25405b;
                        b7Var5.n(J03, h02);
                        b7Var5.o(J03, h02);
                        D2 a11 = D2.a(i10);
                        C2760q3 c2760q34 = J02.f25694a;
                        l7 C10 = c2760q34.C();
                        Bundle bundle2 = a11.f25357d;
                        C10.w(bundle2, b7Var4.F0().G(str3));
                        c2760q34.C().u(a11, c2760q34.w().w(str3));
                        try {
                            bundle2.putLong("_c", 1L);
                            c2760q34.a().v().a("Marking in-app purchase as real-time");
                            bundle2.putLong("_r", 1L);
                            String str5 = i10.f25444c;
                            bundle2.putString("_o", str5);
                            if (c2760q34.C().P(h02.K(), J03.l0())) {
                                c2760q34.C().A(bundle2, "_dbg", 1L);
                                c2760q34.C().A(bundle2, "_r", 1L);
                            }
                            C2803w F03 = b7Var4.F0();
                            String str6 = i10.f25442a;
                            E v02 = F03.v0(str3, str6);
                            if (v02 == null) {
                                bundle = bundle2;
                                str = str5;
                                c2760q3 = c2760q34;
                                c2216d3 = h02;
                                b7Var2 = b7Var4;
                                z22 = J10;
                                str2 = str3;
                                i22 = J03;
                                obj = null;
                                a10 = new E(str3, str6, 0L, 0L, 0L, i10.f25445d, 0L, null, null, null, null);
                                j10 = 0;
                            } else {
                                b7Var2 = b7Var4;
                                i22 = J03;
                                z22 = J10;
                                bundle = bundle2;
                                str = str5;
                                c2760q3 = c2760q34;
                                c2216d3 = h02;
                                str2 = str3;
                                obj = null;
                                long j11 = v02.f25370f;
                                a10 = v02.a(i10.f25445d);
                                j10 = j11;
                            }
                            b7Var2.F0().w0(a10);
                            try {
                                D d10 = new D(J02.f25694a, str, str2, str6, i10.f25445d, j10, bundle);
                                com.google.android.gms.internal.measurement.R2 M10 = com.google.android.gms.internal.measurement.S2.M();
                                M10.O(d10.f25349d);
                                M10.L(d10.f25347b);
                                M10.Q(d10.f25350e);
                                G g11 = d10.f25351f;
                                F f10 = new F(g11);
                                while (f10.hasNext()) {
                                    String next = f10.next();
                                    com.google.android.gms.internal.measurement.V2 O10 = com.google.android.gms.internal.measurement.W2.O();
                                    O10.z(next);
                                    Object j12 = g11.j(next);
                                    if (j12 != null) {
                                        b7Var2.K0().H(O10, j12);
                                        M10.E(O10);
                                    }
                                }
                                c2216d3.Y0(M10);
                                C2234f3 C11 = C2252h3.C();
                                com.google.android.gms.internal.measurement.T2 C12 = com.google.android.gms.internal.measurement.U2.C();
                                C12.z(a10.f25367c);
                                C12.y(str6);
                                C11.y(C12);
                                c2216d3.I0(C11);
                                c2216d3.x0(b7Var2.I0().m(i22.o0(), Collections.emptyList(), c2216d3.e1(), Long.valueOf(M10.N()), Long.valueOf(M10.N()), false));
                                if (M10.M()) {
                                    c2216d3.u1(M10.N());
                                    c2216d3.x1(M10.N());
                                }
                                long B02 = i22.B0();
                                if (B02 != 0) {
                                    c2216d3.y(B02);
                                }
                                long z02 = i22.z0();
                                if (z02 != 0) {
                                    c2216d3.y1(z02);
                                } else if (B02 != 0) {
                                    c2216d3.y1(B02);
                                }
                                String t02 = i22.t0();
                                z7.a();
                                String str7 = str2;
                                if (c2760q3.w().H(str7, AbstractC2671f2.f25962N0) && t02 != null) {
                                    c2216d3.N0(t02);
                                }
                                i22.l();
                                c2216d3.Z((int) i22.g());
                                c2760q3.w().A();
                                c2216d3.O(133005L);
                                c2216d3.q1(c2760q3.f().a());
                                c2216d3.w0(true);
                                b7Var5.x(c2216d3.K(), c2216d3);
                                com.google.android.gms.internal.measurement.Z2 z23 = z22;
                                z23.C(c2216d3);
                                I2 i23 = i22;
                                i23.A0(c2216d3.s1());
                                i23.C0(c2216d3.w1());
                                b7Var2.F0().K0(i23, false, false);
                                b7Var2.F0().s0();
                                b7Var2.F0().t0();
                                try {
                                    return b7Var2.K0().V(((C2207c3) z23.v()).c());
                                } catch (IOException e11) {
                                    J02.f25694a.a().o().c("Data loss. Failed to bundle and serialize. appId", C2.x(str7), e11);
                                    return obj;
                                }
                            } catch (Throwable th) {
                                th = th;
                                c2690h5 = J02;
                                c2690h5.f25405b.F0().t0();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c2690h5 = J02;
                        }
                    } catch (SecurityException e12) {
                        J02.f25694a.a().v().b("app instance id encryption failed", e12.getMessage());
                        bArr = new byte[0];
                        b7Var = J02.f25405b;
                        F02 = b7Var.F0();
                        F02.t0();
                        return bArr;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c2690h5 = i10;
                }
            } else {
                J02.f25694a.a().v().b("Log and bundle disabled. package_name", str3);
                bArr = new byte[0];
            }
            F02 = b7Var3.F0();
            F02.t0();
            return bArr;
        } catch (Throwable th4) {
            th = th4;
            c2690h5 = J02;
            c2690h5.f25405b.F0().t0();
            throw th;
        }
    }
}
