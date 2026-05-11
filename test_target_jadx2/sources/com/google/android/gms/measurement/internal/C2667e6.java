package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import b7.C1653b;
import com.google.android.gms.common.AbstractC2022n;
import com.google.android.gms.internal.measurement.InterfaceC2401y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.e6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2667e6 extends AbstractC2687h2 {

    /* renamed from: c, reason: collision with root package name */
    private final Y5 f25916c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC2703j2 f25917d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f25918e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC2827z f25919f;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledExecutorService f25920g;

    /* renamed from: h, reason: collision with root package name */
    private final A6 f25921h;

    /* renamed from: i, reason: collision with root package name */
    private final List f25922i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC2827z f25923j;

    protected C2667e6(C2760q3 c2760q3) {
        super(c2760q3);
        this.f25922i = new ArrayList();
        this.f25921h = new A6(c2760q3.f());
        this.f25916c = new Y5(this);
        this.f25919f = new E5(this, c2760q3);
        this.f25923j = new I5(this, c2760q3);
    }

    private final boolean R() {
        this.f25694a.c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J() {
        h();
        this.f25921h.a();
        this.f25694a.w();
        this.f25919f.b(((Long) AbstractC2671f2.f25985Z.b(null)).longValue());
    }

    private final void T(Runnable runnable) {
        h();
        if (W()) {
            runnable.run();
            return;
        }
        List list = this.f25922i;
        long size = list.size();
        C2760q3 c2760q3 = this.f25694a;
        c2760q3.w();
        if (size >= 1000) {
            c2760q3.a().o().a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f25923j.b(60000L);
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void L() {
        h();
        A2 w10 = this.f25694a.a().w();
        List list = this.f25922i;
        w10.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.f25694a.a().o().b("Task exception while flushing queue", e10);
            }
        }
        this.f25922i.clear();
        this.f25923j.d();
    }

    private final n7 V(boolean z10) {
        Pair b10;
        C2760q3 c2760q3 = this.f25694a;
        c2760q3.c();
        C2759q2 L10 = this.f25694a.L();
        String str = null;
        if (z10) {
            C2760q3 c2760q32 = c2760q3.a().f25694a;
            if (c2760q32.x().f25632e != null && (b10 = c2760q32.x().f25632e.b()) != null && b10 != Q2.f25629A) {
                String valueOf = String.valueOf(b10.second);
                String str2 = (String) b10.first;
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                sb2.append(valueOf);
                sb2.append(":");
                sb2.append(str2);
                str = sb2.toString();
            }
        }
        return L10.o(str);
    }

    public final void A() {
        h();
        j();
        Y5 y52 = this.f25916c;
        y52.b();
        try {
            C1653b.b().c(this.f25694a.e(), y52);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f25917d = null;
    }

    public final void B(InterfaceC2401y0 interfaceC2401y0, I i10, String str) {
        h();
        j();
        C2760q3 c2760q3 = this.f25694a;
        if (c2760q3.C().X(AbstractC2022n.f23510a) == 0) {
            T(new H5(this, i10, str, interfaceC2401y0));
        } else {
            c2760q3.a().r().a("Not bundling data. Service unavailable or out of date");
            c2760q3.C().d0(interfaceC2401y0, new byte[0]);
        }
    }

    final boolean C() {
        h();
        j();
        return !y() || this.f25694a.C().W() >= ((Integer) AbstractC2671f2.f25956K0.b(null)).intValue();
    }

    final boolean D() {
        h();
        j();
        return !y() || this.f25694a.C().W() >= 241200;
    }

    final /* synthetic */ void E() {
        InterfaceC2703j2 interfaceC2703j2 = this.f25917d;
        if (interfaceC2703j2 == null) {
            this.f25694a.a().o().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            n7 V10 = V(false);
            AbstractC1287s.m(V10);
            interfaceC2703j2.M(V10);
            J();
        } catch (RemoteException e10) {
            this.f25694a.a().o().b("Failed to send storage consent settings to the service", e10);
        }
    }

    final /* synthetic */ void F() {
        InterfaceC2703j2 interfaceC2703j2 = this.f25917d;
        if (interfaceC2703j2 == null) {
            this.f25694a.a().o().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            n7 V10 = V(false);
            AbstractC1287s.m(V10);
            interfaceC2703j2.Y(V10);
            J();
        } catch (RemoteException e10) {
            this.f25694a.a().o().b("Failed to send Dma consent settings to the service", e10);
        }
    }

    final /* synthetic */ void G(AtomicReference atomicReference, n7 n7Var, Bundle bundle) {
        InterfaceC2703j2 interfaceC2703j2;
        synchronized (atomicReference) {
            try {
                interfaceC2703j2 = this.f25917d;
            } catch (RemoteException e10) {
                this.f25694a.a().o().b("Failed to request trigger URIs; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC2703j2 == null) {
                this.f25694a.a().o().a("Failed to request trigger URIs; not connected to service");
                return;
            }
            AbstractC1287s.m(n7Var);
            interfaceC2703j2.R(n7Var, bundle, new BinderC2809w5(this, atomicReference));
            J();
        }
    }

    final /* synthetic */ void H(AtomicReference atomicReference, n7 n7Var, I6 i62) {
        InterfaceC2703j2 interfaceC2703j2;
        synchronized (atomicReference) {
            try {
                interfaceC2703j2 = this.f25917d;
            } catch (RemoteException e10) {
                this.f25694a.a().o().b("[sgtm] Failed to get upload batches; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC2703j2 == null) {
                this.f25694a.a().o().a("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            AbstractC1287s.m(n7Var);
            interfaceC2703j2.d(n7Var, i62, new BinderC2817x5(this, atomicReference));
            J();
        }
    }

    final /* synthetic */ void I(n7 n7Var, C2676g c2676g) {
        InterfaceC2703j2 interfaceC2703j2 = this.f25917d;
        if (interfaceC2703j2 == null) {
            this.f25694a.a().o().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            interfaceC2703j2.d0(n7Var, c2676g);
            J();
        } catch (RemoteException e10) {
            this.f25694a.a().o().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(c2676g.f26062a), e10);
        }
    }

    final /* synthetic */ void K(ComponentName componentName) {
        h();
        if (this.f25917d != null) {
            this.f25917d = null;
            this.f25694a.a().w().b("Disconnected from device MeasurementService", componentName);
            h();
            w();
        }
    }

    final /* synthetic */ Y5 M() {
        return this.f25916c;
    }

    final /* synthetic */ InterfaceC2703j2 N() {
        return this.f25917d;
    }

    final /* synthetic */ void O(InterfaceC2703j2 interfaceC2703j2) {
        this.f25917d = null;
    }

    final /* synthetic */ ScheduledExecutorService P() {
        return this.f25920g;
    }

    final /* synthetic */ void Q(ScheduledExecutorService scheduledExecutorService) {
        this.f25920g = scheduledExecutorService;
    }

    public final boolean W() {
        h();
        j();
        return this.f25917d != null;
    }

    protected final void X() {
        h();
        j();
        T(new J5(this, V(true)));
    }

    protected final void Y(boolean z10) {
        h();
        j();
        if (C()) {
            T(new K5(this, V(false)));
        }
    }

    protected final void Z(boolean z10) {
        h();
        j();
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.d6
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                C2667e6.this.E();
            }
        });
    }

    protected final void a0() {
        h();
        j();
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.Z5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                C2667e6.this.F();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void b0(InterfaceC2703j2 interfaceC2703j2, W6.a aVar, n7 n7Var) {
        int i10;
        String str;
        long j10;
        long j11;
        long j12;
        h();
        j();
        R();
        C2760q3 c2760q3 = this.f25694a;
        c2760q3.w();
        n7 n7Var2 = n7Var;
        int i11 = 100;
        int i12 = 0;
        for (int i13 = 100; i12 < 1001 && i11 == i13; i13 = 100) {
            C2760q3 c2760q32 = this.f25694a;
            ArrayList arrayList = new ArrayList();
            List t10 = c2760q32.E().t(i13);
            if (t10 != null) {
                arrayList.addAll(t10);
                i11 = t10.size();
            } else {
                i11 = 0;
            }
            if (aVar != null && i11 < i13) {
                arrayList.add(new C2774s2(aVar, n7Var2.f26199c, n7Var2.f26206j));
            }
            String str2 = null;
            boolean H10 = c2760q3.w().H(null, AbstractC2671f2.f25966P0);
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                C2774s2 c2774s2 = (C2774s2) arrayList.get(i14);
                W6.a aVar2 = c2774s2.f26325a;
                C2724m w10 = c2760q3.w();
                C2663e2 c2663e2 = AbstractC2671f2.f25995c1;
                if (w10.H(str2, c2663e2)) {
                    String str3 = c2774s2.f26326b;
                    if (!TextUtils.isEmpty(str3)) {
                        i10 = i14;
                        n7Var2 = new n7(n7Var2.f26197a, n7Var2.f26198b, str3, c2774s2.f26327c, n7Var2.f26200d, n7Var2.f26201e, n7Var2.f26202f, n7Var2.f26203g, n7Var2.f26204h, n7Var2.f26205i, n7Var2.f26207k, n7Var2.f26208l, n7Var2.f26209m, n7Var2.f26210n, n7Var2.f26211o, n7Var2.f26212p, n7Var2.f26213q, n7Var2.f26214r, n7Var2.f26215s, n7Var2.f26216t, n7Var2.f26217u, n7Var2.f26218v, n7Var2.f26219w, n7Var2.f26220x, n7Var2.f26221y, n7Var2.f26222z, n7Var2.f26192A, n7Var2.f26193B, n7Var2.f26194C, n7Var2.f26195D, n7Var2.f26196E);
                        n7 n7Var3 = n7Var2;
                        if (!(aVar2 instanceof I)) {
                            if (H10) {
                                try {
                                    C2760q3 c2760q33 = this.f25694a;
                                    long a10 = c2760q33.f().a();
                                    try {
                                        j12 = a10;
                                        j11 = c2760q33.f().c();
                                    } catch (RemoteException e10) {
                                        e = e10;
                                        j11 = 0;
                                        j10 = a10;
                                        this.f25694a.a().o().b("Failed to send event to the service", e);
                                        if (H10 && j10 != 0) {
                                            C2760q3 c2760q34 = this.f25694a;
                                            C2822y2.a(c2760q34).b(36301, 13, j10, c2760q34.f().a(), (int) (c2760q34.f().c() - j11));
                                        }
                                        str = null;
                                        str2 = str;
                                        i14 = i10 + 1;
                                        n7Var2 = n7Var3;
                                    }
                                } catch (RemoteException e11) {
                                    e = e11;
                                    j10 = 0;
                                    j11 = 0;
                                }
                            } else {
                                j12 = 0;
                                j11 = 0;
                            }
                            try {
                                interfaceC2703j2.W((I) aVar2, n7Var3);
                                if (H10) {
                                    c2760q3.a().w().a("Logging telemetry for logEvent from database");
                                    C2760q3 c2760q35 = this.f25694a;
                                    C2822y2.a(c2760q35).b(36301, 0, j12, c2760q35.f().a(), (int) (c2760q35.f().c() - j11));
                                }
                            } catch (RemoteException e12) {
                                e = e12;
                                j10 = j12;
                                this.f25694a.a().o().b("Failed to send event to the service", e);
                                if (H10) {
                                    C2760q3 c2760q342 = this.f25694a;
                                    C2822y2.a(c2760q342).b(36301, 13, j10, c2760q342.f().a(), (int) (c2760q342.f().c() - j11));
                                }
                                str = null;
                                str2 = str;
                                i14 = i10 + 1;
                                n7Var2 = n7Var3;
                            }
                        } else if (aVar2 instanceof h7) {
                            try {
                                interfaceC2703j2.j0((h7) aVar2, n7Var3);
                            } catch (RemoteException e13) {
                                this.f25694a.a().o().b("Failed to send user property to the service", e13);
                            }
                        } else if (aVar2 instanceof C2692i) {
                            try {
                                interfaceC2703j2.l((C2692i) aVar2, n7Var3);
                            } catch (RemoteException e14) {
                                this.f25694a.a().o().b("Failed to send conditional user property to the service", e14);
                            }
                        } else {
                            C2760q3 c2760q36 = this.f25694a;
                            str = null;
                            if (c2760q36.w().H(null, c2663e2) && (aVar2 instanceof G)) {
                                try {
                                    interfaceC2703j2.m0(((G) aVar2).Z0(), n7Var3);
                                } catch (RemoteException e15) {
                                    this.f25694a.a().o().b("Failed to send default event parameters to the service", e15);
                                }
                            } else {
                                c2760q36.a().o().a("Discarding data. Unrecognized parcel type.");
                            }
                            str2 = str;
                            i14 = i10 + 1;
                            n7Var2 = n7Var3;
                        }
                        str = null;
                        str2 = str;
                        i14 = i10 + 1;
                        n7Var2 = n7Var3;
                    }
                }
                i10 = i14;
                n7 n7Var32 = n7Var2;
                if (!(aVar2 instanceof I)) {
                }
                str = null;
                str2 = str;
                i14 = i10 + 1;
                n7Var2 = n7Var32;
            }
            i12++;
        }
    }

    protected final void c0(I i10, String str) {
        AbstractC1287s.m(i10);
        h();
        j();
        R();
        T(new L5(this, true, V(true), this.f25694a.E().p(i10), i10, str));
    }

    protected final void d0(C2692i c2692i) {
        AbstractC1287s.m(c2692i);
        h();
        j();
        this.f25694a.c();
        T(new M5(this, true, V(true), this.f25694a.E().r(c2692i), new C2692i(c2692i), c2692i));
    }

    protected final void e0(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        j();
        T(new N5(this, atomicReference, null, str2, str3, V(false)));
    }

    protected final void f0(InterfaceC2401y0 interfaceC2401y0, String str, String str2) {
        h();
        j();
        T(new O5(this, str, str2, V(false), interfaceC2401y0));
    }

    protected final void g0(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        h();
        j();
        T(new P5(this, atomicReference, null, str2, str3, V(false), z10));
    }

    protected final void h0(InterfaceC2401y0 interfaceC2401y0, String str, String str2, boolean z10) {
        h();
        j();
        T(new RunnableC2801v5(this, str, str2, V(false), z10, interfaceC2401y0));
    }

    protected final void i0(final AtomicReference atomicReference, final Bundle bundle) {
        h();
        j();
        final n7 V10 = V(false);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.a6
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                C2667e6.this.G(atomicReference, V10, bundle);
            }
        });
    }

    protected final void j0(final AtomicReference atomicReference, final I6 i62) {
        h();
        j();
        final n7 V10 = V(false);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.b6
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                C2667e6.this.H(atomicReference, V10, i62);
            }
        });
    }

    protected final void k0(final C2676g c2676g) {
        h();
        j();
        final n7 V10 = V(true);
        AbstractC1287s.m(V10);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.c6
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                C2667e6.this.I(V10, c2676g);
            }
        });
    }

    protected final C2748p l0() {
        h();
        j();
        InterfaceC2703j2 interfaceC2703j2 = this.f25917d;
        if (interfaceC2703j2 == null) {
            w();
            this.f25694a.a().v().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        n7 V10 = V(false);
        AbstractC1287s.m(V10);
        try {
            C2748p k02 = interfaceC2703j2.k0(V10);
            J();
            return k02;
        } catch (RemoteException e10) {
            this.f25694a.a().o().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2687h2
    protected final boolean m() {
        return false;
    }

    protected final void o(h7 h7Var) {
        h();
        j();
        R();
        T(new RunnableC2825y5(this, V(true), this.f25694a.E().q(h7Var), h7Var));
    }

    protected final void p() {
        h();
        j();
        n7 V10 = V(false);
        R();
        this.f25694a.E().o();
        T(new RunnableC2833z5(this, V10));
    }

    public final void q(AtomicReference atomicReference) {
        h();
        j();
        T(new A5(this, atomicReference, V(false)));
    }

    public final void r(InterfaceC2401y0 interfaceC2401y0) {
        h();
        j();
        T(new B5(this, V(false), interfaceC2401y0));
    }

    protected final void s() {
        h();
        j();
        n7 V10 = V(true);
        R();
        this.f25694a.w().H(null, AbstractC2671f2.f25995c1);
        this.f25694a.E().u();
        T(new C5(this, V10, true));
    }

    protected final void t() {
        h();
        j();
        T(new D5(this, V(true)));
    }

    protected final void u(C2730m5 c2730m5) {
        h();
        j();
        T(new F5(this, c2730m5));
    }

    public final void v(Bundle bundle) {
        h();
        j();
        G g10 = new G(bundle);
        R();
        T(new G5(this, true, V(false), this.f25694a.w().H(null, AbstractC2671f2.f25995c1) && this.f25694a.E().s(g10), g10, bundle));
    }

    final void w() {
        h();
        j();
        if (W()) {
            return;
        }
        if (y()) {
            this.f25916c.c();
            return;
        }
        C2760q3 c2760q3 = this.f25694a;
        if (c2760q3.w().m()) {
            return;
        }
        c2760q3.c();
        List<ResolveInfo> queryIntentServices = c2760q3.e().getPackageManager().queryIntentServices(new Intent().setClassName(c2760q3.e(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            c2760q3.a().o().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context e10 = c2760q3.e();
        c2760q3.c();
        intent.setComponent(new ComponentName(e10, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f25916c.a(intent);
    }

    final Boolean x() {
        return this.f25918e;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean y() {
        h();
        j();
        if (this.f25918e == null) {
            h();
            j();
            C2760q3 c2760q3 = this.f25694a;
            Q2 x10 = c2760q3.x();
            x10.h();
            boolean z10 = false;
            Boolean valueOf = !x10.p().contains("use_service") ? null : Boolean.valueOf(x10.p().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                c2760q3.c();
                if (this.f25694a.L().v() != 1) {
                    c2760q3.a().w().a("Checking service availability");
                    int X10 = c2760q3.C().X(AbstractC2022n.f23510a);
                    if (X10 != 0) {
                        if (X10 == 1) {
                            c2760q3.a().w().a("Service missing");
                        } else if (X10 != 2) {
                            if (X10 == 3) {
                                c2760q3.a().r().a("Service disabled");
                            } else if (X10 == 9) {
                                c2760q3.a().r().a("Service invalid");
                            } else if (X10 != 18) {
                                c2760q3.a().r().b("Unexpected service status", Integer.valueOf(X10));
                            } else {
                                c2760q3.a().r().a("Service updating");
                            }
                            r2 = false;
                        } else {
                            c2760q3.a().v().a("Service container out of date");
                            if (c2760q3.C().W() >= 17443) {
                                z10 = valueOf == null;
                                r2 = false;
                            }
                        }
                        if (z10 && c2760q3.w().m()) {
                            c2760q3.a().o().a("No way to upload. Consider using the full version of Analytics");
                        } else if (r2) {
                            Q2 x11 = c2760q3.x();
                            x11.h();
                            SharedPreferences.Editor edit = x11.p().edit();
                            edit.putBoolean("use_service", z10);
                            edit.apply();
                        }
                        r2 = z10;
                    } else {
                        c2760q3.a().w().a("Service available");
                    }
                }
                z10 = true;
                if (z10) {
                }
                if (r2) {
                }
                r2 = z10;
            }
            this.f25918e = Boolean.valueOf(r2);
        }
        return this.f25918e.booleanValue();
    }

    protected final void z(InterfaceC2703j2 interfaceC2703j2) {
        h();
        AbstractC1287s.m(interfaceC2703j2);
        this.f25917d = interfaceC2703j2;
        J();
        L();
    }
}
