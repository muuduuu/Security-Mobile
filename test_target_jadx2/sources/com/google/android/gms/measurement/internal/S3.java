package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.AbstractC2022n;
import com.google.android.gms.internal.measurement.C2194b;
import com.google.android.gms.internal.measurement.C2207c3;
import com.google.android.gms.internal.measurement.C2216d3;
import com.google.android.gms.internal.measurement.C2222e0;
import com.google.android.gms.internal.measurement.C2326p5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class S3 extends AbstractBinderC2695i2 {

    /* renamed from: f, reason: collision with root package name */
    private final b7 f25682f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f25683g;

    /* renamed from: h, reason: collision with root package name */
    private String f25684h;

    public S3(b7 b7Var, String str) {
        AbstractC1287s.m(b7Var);
        this.f25682f = b7Var;
        this.f25684h = null;
    }

    private final void s1(I i10, n7 n7Var) {
        b7 b7Var = this.f25682f;
        b7Var.E();
        b7Var.k(i10, n7Var);
    }

    private final void t1(n7 n7Var, boolean z10) {
        AbstractC1287s.m(n7Var);
        String str = n7Var.f26197a;
        AbstractC1287s.g(str);
        u1(str, false);
        this.f25682f.N0().o(n7Var.f26198b);
    }

    private final void u1(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            this.f25682f.a().o().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f25683g == null) {
                    boolean z11 = true;
                    if (!"com.google.android.gms".equals(this.f25684h)) {
                        b7 b7Var = this.f25682f;
                        if (!com.google.android.gms.common.util.r.a(b7Var.e(), Binder.getCallingUid()) && !com.google.android.gms.common.r.a(b7Var.e()).c(Binder.getCallingUid())) {
                            z11 = false;
                        }
                    }
                    this.f25683g = Boolean.valueOf(z11);
                }
                if (this.f25683g.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f25682f.a().o().b("Measurement Service called with invalid calling package. appId", C2.x(str));
                throw e10;
            }
        }
        if (this.f25684h == null && AbstractC2022n.m(this.f25682f.e(), Binder.getCallingUid(), str)) {
            this.f25684h = str;
        }
        if (str.equals(this.f25684h)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void B(n7 n7Var) {
        String str = n7Var.f26197a;
        AbstractC1287s.g(str);
        u1(str, false);
        x1(new C3(this, n7Var));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void E0(n7 n7Var) {
        t1(n7Var, false);
        x1(new RunnableC2775s3(this, n7Var));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final List G(String str, String str2, String str3) {
        u1(str, true);
        try {
            return (List) this.f25682f.b().r(new A3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f25682f.a().o().b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void M(final n7 n7Var) {
        AbstractC1287s.g(n7Var.f26197a);
        AbstractC1287s.m(n7Var.f26215s);
        k1(new Runnable() { // from class: com.google.android.gms.measurement.internal.R3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                S3.this.l1(n7Var);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void N0(n7 n7Var) {
        t1(n7Var, false);
        x1(new RunnableC2783t3(this, n7Var));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final List P(n7 n7Var, Bundle bundle) {
        t1(n7Var, false);
        AbstractC1287s.m(n7Var.f26197a);
        b7 b7Var = this.f25682f;
        if (!b7Var.B0().H(null, AbstractC2671f2.f25986Z0)) {
            try {
                return (List) this.f25682f.b().r(new K3(this, n7Var, bundle)).get();
            } catch (InterruptedException | ExecutionException e10) {
                this.f25682f.a().o().c("Failed to get trigger URIs. appId", C2.x(n7Var.f26197a), e10);
                return Collections.emptyList();
            }
        }
        try {
            return (List) b7Var.b().s(new J3(this, n7Var, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            this.f25682f.a().o().c("Failed to get trigger URIs. appId", C2.x(n7Var.f26197a), e11);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final List Q0(String str, String str2, boolean z10, n7 n7Var) {
        t1(n7Var, false);
        String str3 = n7Var.f26197a;
        AbstractC1287s.m(str3);
        try {
            List<j7> list = (List) this.f25682f.b().r(new CallableC2815x3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (j7 j7Var : list) {
                if (!z10 && l7.N(j7Var.f26136c)) {
                }
                arrayList.add(new h7(j7Var));
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f25682f.a().o().c("Failed to query user properties. appId", C2.x(n7Var.f26197a), e);
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            this.f25682f.a().o().c("Failed to query user properties. appId", C2.x(n7Var.f26197a), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void R(final n7 n7Var, final Bundle bundle, final InterfaceC2727m2 interfaceC2727m2) {
        t1(n7Var, false);
        final String str = (String) AbstractC1287s.m(n7Var.f26197a);
        this.f25682f.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.M3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                S3.this.n1(n7Var, bundle, interfaceC2727m2, str);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final String V0(n7 n7Var) {
        t1(n7Var, false);
        return this.f25682f.p0(n7Var);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void W(I i10, n7 n7Var) {
        AbstractC1287s.m(i10);
        t1(n7Var, false);
        x1(new F3(this, i10, n7Var));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final List W0(String str, String str2, n7 n7Var) {
        t1(n7Var, false);
        String str3 = n7Var.f26197a;
        AbstractC1287s.m(str3);
        try {
            return (List) this.f25682f.b().r(new CallableC2831z3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f25682f.a().o().b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void X(n7 n7Var) {
        t1(n7Var, false);
        x1(new B3(this, n7Var));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void Y(final n7 n7Var) {
        AbstractC1287s.g(n7Var.f26197a);
        AbstractC1287s.m(n7Var.f26215s);
        k1(new Runnable() { // from class: com.google.android.gms.measurement.internal.L3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                S3.this.m1(n7Var);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void d(n7 n7Var, final I6 i62, final InterfaceC2751p2 interfaceC2751p2) {
        t1(n7Var, false);
        final String str = (String) AbstractC1287s.m(n7Var.f26197a);
        this.f25682f.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.N3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                S3.this.o1(str, i62, interfaceC2751p2);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void d0(final n7 n7Var, final C2676g c2676g) {
        t1(n7Var, false);
        x1(new Runnable() { // from class: com.google.android.gms.measurement.internal.P3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                S3.this.p1(n7Var, c2676g);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final List e(String str, String str2, String str3, boolean z10) {
        u1(str, true);
        try {
            List<j7> list = (List) this.f25682f.b().r(new CallableC2823y3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (j7 j7Var : list) {
                if (!z10 && l7.N(j7Var.f26136c)) {
                }
                arrayList.add(new h7(j7Var));
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f25682f.a().o().c("Failed to get user properties as. appId", C2.x(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            this.f25682f.a().o().c("Failed to get user properties as. appId", C2.x(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final byte[] e0(I i10, String str) {
        AbstractC1287s.g(str);
        AbstractC1287s.m(i10);
        u1(str, true);
        b7 b7Var = this.f25682f;
        A2 v10 = b7Var.a().v();
        C2798v2 M02 = b7Var.M0();
        String str2 = i10.f25442a;
        v10.b("Log and bundle. event", M02.a(str2));
        long b10 = b7Var.f().b() / 1000000;
        try {
            byte[] bArr = (byte[]) b7Var.b().s(new H3(this, i10, str)).get();
            if (bArr == null) {
                b7Var.a().o().b("Log and bundle returned null. appId", C2.x(str));
                bArr = new byte[0];
            }
            b7Var.a().v().d("Log and bundle processed. event, size, time_ms", b7Var.M0().a(str2), Integer.valueOf(bArr.length), Long.valueOf((b7Var.f().b() / 1000000) - b10));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            b7 b7Var2 = this.f25682f;
            b7Var2.a().o().d("Failed to log and bundle. appId, event, error", C2.x(str), b7Var2.M0().a(i10.f25442a), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            b7 b7Var22 = this.f25682f;
            b7Var22.a().o().d("Failed to log and bundle. appId, event, error", C2.x(str), b7Var22.M0().a(i10.f25442a), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void e1(n7 n7Var) {
        AbstractC1287s.g(n7Var.f26197a);
        AbstractC1287s.m(n7Var.f26215s);
        k1(new D3(this, n7Var));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final List f1(n7 n7Var, boolean z10) {
        t1(n7Var, false);
        String str = n7Var.f26197a;
        AbstractC1287s.m(str);
        try {
            List<j7> list = (List) this.f25682f.b().r(new CallableC2767r3(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (j7 j7Var : list) {
                if (!z10 && l7.N(j7Var.f26136c)) {
                }
                arrayList.add(new h7(j7Var));
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f25682f.a().o().c("Failed to get user properties. appId", C2.x(n7Var.f26197a), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f25682f.a().o().c("Failed to get user properties. appId", C2.x(n7Var.f26197a), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void g0(C2692i c2692i) {
        AbstractC1287s.m(c2692i);
        AbstractC1287s.m(c2692i.f26104c);
        AbstractC1287s.g(c2692i.f26102a);
        u1(c2692i.f26102a, true);
        x1(new RunnableC2807w3(this, new C2692i(c2692i)));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void j0(h7 h7Var, n7 n7Var) {
        AbstractC1287s.m(h7Var);
        t1(n7Var, false);
        x1(new I3(this, h7Var, n7Var));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final C2748p k0(n7 n7Var) {
        t1(n7Var, false);
        AbstractC1287s.g(n7Var.f26197a);
        try {
            return (C2748p) this.f25682f.b().s(new E3(this, n7Var)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f25682f.a().o().c("Failed to get consent. appId", C2.x(n7Var.f26197a), e10);
            return new C2748p(null);
        }
    }

    final void k1(Runnable runnable) {
        AbstractC1287s.m(runnable);
        b7 b7Var = this.f25682f;
        if (b7Var.b().p()) {
            runnable.run();
        } else {
            b7Var.b().v(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void l(C2692i c2692i, n7 n7Var) {
        AbstractC1287s.m(c2692i);
        AbstractC1287s.m(c2692i.f26104c);
        t1(n7Var, false);
        C2692i c2692i2 = new C2692i(c2692i);
        c2692i2.f26102a = n7Var.f26197a;
        x1(new RunnableC2799v3(this, c2692i2, n7Var));
    }

    final /* synthetic */ void l1(n7 n7Var) {
        b7 b7Var = this.f25682f;
        b7Var.E();
        b7Var.P0(n7Var);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void m0(final Bundle bundle, final n7 n7Var) {
        t1(n7Var, false);
        final String str = n7Var.f26197a;
        AbstractC1287s.m(str);
        x1(new Runnable() { // from class: com.google.android.gms.measurement.internal.Q3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                S3.this.q1(bundle, str, n7Var);
            }
        });
    }

    final /* synthetic */ void m1(n7 n7Var) {
        b7 b7Var = this.f25682f;
        b7Var.E();
        b7Var.Q0(n7Var);
    }

    final /* synthetic */ void n1(n7 n7Var, Bundle bundle, InterfaceC2727m2 interfaceC2727m2, String str) {
        b7 b7Var = this.f25682f;
        b7Var.E();
        try {
            interfaceC2727m2.P0(b7Var.q0(n7Var, bundle));
        } catch (RemoteException e10) {
            this.f25682f.a().o().c("Failed to return trigger URIs for app", str, e10);
        }
    }

    final /* synthetic */ void o1(String str, I6 i62, InterfaceC2751p2 interfaceC2751p2) {
        b7 b7Var = this.f25682f;
        b7Var.E();
        b7Var.b().h();
        b7Var.O0();
        List<e7> o10 = b7Var.F0().o(str, i62, ((Integer) AbstractC2671f2.f25937B.b(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (e7 e7Var : o10) {
            if (b7Var.t(str, e7Var.e())) {
                int i10 = e7Var.i();
                if (i10 > 0) {
                    if (i10 <= ((Integer) AbstractC2671f2.f26049z.b(null)).intValue()) {
                        if (b7Var.f().a() >= e7Var.h() + Math.min(((Long) AbstractC2671f2.f26045x.b(null)).longValue() * (1 << (i10 - 1)), ((Long) AbstractC2671f2.f26047y.b(null)).longValue())) {
                        }
                    }
                    b7Var.a().w().d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(e7Var.c()), Long.valueOf(e7Var.h()));
                }
                G6 b10 = e7Var.b();
                try {
                    com.google.android.gms.internal.measurement.Z2 z22 = (com.google.android.gms.internal.measurement.Z2) g7.W(C2207c3.J(), b10.f25425b);
                    for (int i11 = 0; i11 < z22.z(); i11++) {
                        C2216d3 c2216d3 = (C2216d3) z22.A(i11).p();
                        c2216d3.q1(b7Var.f().a());
                        z22.B(i11, c2216d3);
                    }
                    b10.f25425b = ((C2207c3) z22.v()).c();
                    if (Log.isLoggable(b7Var.a().z(), 2)) {
                        b10.f25430g = b7Var.K0().K((C2207c3) z22.v());
                    }
                    arrayList.add(b10);
                } catch (C2326p5 unused) {
                    b7Var.a().r().b("Failed to parse queued batch. appId", str);
                }
            } else {
                b7Var.a().w().d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(e7Var.c()), e7Var.e());
            }
        }
        K6 k62 = new K6(arrayList);
        try {
            interfaceC2751p2.G0(k62);
            this.f25682f.a().w().c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(k62.f25528a.size()));
        } catch (RemoteException e10) {
            this.f25682f.a().o().c("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }

    final /* synthetic */ void p1(n7 n7Var, C2676g c2676g) {
        b7 b7Var = this.f25682f;
        b7Var.E();
        b7Var.r0((String) AbstractC1287s.m(n7Var.f26197a), c2676g);
    }

    final /* synthetic */ void q1(Bundle bundle, String str, n7 n7Var) {
        b7 b7Var = this.f25682f;
        boolean H10 = b7Var.B0().H(null, AbstractC2671f2.f25980W0);
        if (bundle.isEmpty() && H10) {
            C2803w F02 = this.f25682f.F0();
            F02.h();
            F02.j();
            try {
                F02.u0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e10) {
                F02.f25694a.a().o().b("Error clearing default event params", e10);
                return;
            }
        }
        C2803w F03 = b7Var.F0();
        F03.h();
        F03.j();
        byte[] c10 = F03.f25405b.K0().J(new D(F03.f25694a, BuildConfig.FLAVOR, str, "dep", 0L, 0L, bundle)).c();
        C2760q3 c2760q3 = F03.f25694a;
        c2760q3.a().w().c("Saving default event parameters, appId, data size", str, Integer.valueOf(c10.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", c10);
        try {
            if (F03.u0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                c2760q3.a().o().b("Failed to insert default event parameters (got -1). appId", C2.x(str));
            }
        } catch (SQLiteException e11) {
            F03.f25694a.a().o().c("Error storing default event parameters. appId", C2.x(str), e11);
        }
        b7 b7Var2 = this.f25682f;
        C2803w F04 = b7Var2.F0();
        long j10 = n7Var.f26195D;
        if (F04.H(str, j10)) {
            b7Var2.F0().I(str, Long.valueOf(j10), null, bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void r(I i10, String str, String str2) {
        AbstractC1287s.m(i10);
        AbstractC1287s.g(str);
        u1(str, true);
        x1(new G3(this, i10, str));
    }

    final /* synthetic */ b7 r1() {
        return this.f25682f;
    }

    final void v1(I i10, n7 n7Var) {
        b7 b7Var = this.f25682f;
        C2656d3 D02 = b7Var.D0();
        String str = n7Var.f26197a;
        C2222e0 c2222e0 = TextUtils.isEmpty(str) ? null : (C2222e0) D02.f25880j.c(str);
        if (c2222e0 == null) {
            this.f25682f.a().w().b("EES not loaded for", n7Var.f26197a);
            s1(i10, n7Var);
            return;
        }
        try {
            Map Z10 = b7Var.K0().Z(i10.f25443b.Z0(), true);
            String str2 = i10.f25442a;
            String a10 = AbstractC2641b4.a(str2);
            if (a10 != null) {
                str2 = a10;
            }
            if (c2222e0.b(new C2194b(str2, i10.f25445d, Z10))) {
                if (c2222e0.c()) {
                    b7 b7Var2 = this.f25682f;
                    b7Var2.a().w().b("EES edited event", i10.f25442a);
                    s1(b7Var2.K0().m(c2222e0.e().c()), n7Var);
                } else {
                    s1(i10, n7Var);
                }
                if (c2222e0.d()) {
                    for (C2194b c2194b : c2222e0.e().f()) {
                        b7 b7Var3 = this.f25682f;
                        b7Var3.a().w().b("EES logging created event", c2194b.b());
                        s1(b7Var3.K0().m(c2194b), n7Var);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.D0 unused) {
            this.f25682f.a().o().c("EES error. appId, eventName", n7Var.f26198b, i10.f25442a);
        }
        this.f25682f.a().w().b("EES was not applied to event", i10.f25442a);
        s1(i10, n7Var);
    }

    final I w1(I i10, n7 n7Var) {
        G g10;
        if ("_cmp".equals(i10.f25442a) && (g10 = i10.f25443b) != null && g10.y0() != 0) {
            String I10 = g10.I("_cis");
            if ("referrer broadcast".equals(I10) || "referrer API".equals(I10)) {
                this.f25682f.a().u().b("Event has been filtered ", i10.toString());
                return new I("_cmpx", g10, i10.f25444c, i10.f25445d);
            }
        }
        return i10;
    }

    final void x1(Runnable runnable) {
        AbstractC1287s.m(runnable);
        b7 b7Var = this.f25682f;
        if (b7Var.b().p()) {
            runnable.run();
        } else {
            b7Var.b().t(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void z(long j10, String str, String str2, String str3) {
        x1(new RunnableC2791u3(this, str2, str3, str, j10));
    }
}
