package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.AbstractC2664e3;
import com.google.android.gms.measurement.internal.AbstractC2722l5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y7.C5178a;

/* renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2411z1 {

    /* renamed from: j, reason: collision with root package name */
    private static volatile C2411z1 f24705j;

    /* renamed from: a, reason: collision with root package name */
    private final String f24706a = "FA";

    /* renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.util.f f24707b = com.google.android.gms.common.util.i.d();

    /* renamed from: c, reason: collision with root package name */
    protected final ExecutorService f24708c;

    /* renamed from: d, reason: collision with root package name */
    private final C5178a f24709d;

    /* renamed from: e, reason: collision with root package name */
    private final List f24710e;

    /* renamed from: f, reason: collision with root package name */
    private int f24711f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24712g;

    /* renamed from: h, reason: collision with root package name */
    private final String f24713h;

    /* renamed from: i, reason: collision with root package name */
    private volatile InterfaceC2374v0 f24714i;

    protected C2411z1(Context context, Bundle bundle) {
        AbstractC2330q0.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2259i1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f24708c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f24709d = new C5178a(this);
        this.f24710e = new ArrayList();
        try {
            if (AbstractC2722l5.a(context, "google_app_id", AbstractC2664e3.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C2411z1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f24713h = null;
                    this.f24712g = true;
                    Log.w(this.f24706a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f24713h = "fa";
        j(new V0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f24706a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C2402y1(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void j(AbstractRunnableC2322p1 abstractRunnableC2322p1) {
        this.f24708c.execute(abstractRunnableC2322p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void k(Exception exc, boolean z10, boolean z11) {
        this.f24712g |= z10;
        if (z10) {
            Log.w(this.f24706a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            d(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f24706a, "Error with data collection. Data lost.", exc);
    }

    private final void r(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        j(new C2313o1(this, l10, str, str2, bundle, z10, z11));
    }

    public static C2411z1 s(Context context, Bundle bundle) {
        AbstractC1287s.m(context);
        if (f24705j == null) {
            synchronized (C2411z1.class) {
                try {
                    if (f24705j == null) {
                        f24705j = new C2411z1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f24705j;
    }

    public final List A(String str, String str2) {
        BinderC2347s0 binderC2347s0 = new BinderC2347s0();
        j(new O0(this, str, str2, binderC2347s0));
        List list = (List) BinderC2347s0.n1(binderC2347s0.m1(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final void B(String str) {
        j(new P0(this, str));
    }

    public final void C(J0 j02, String str, String str2) {
        j(new Q0(this, j02, str, str2));
    }

    public final void D(Boolean bool) {
        j(new R0(this, bool));
    }

    public final void E(Bundle bundle) {
        j(new S0(this, bundle));
    }

    public final void F() {
        j(new T0(this));
    }

    public final void G(long j10) {
        j(new U0(this, j10));
    }

    public final void H(String str) {
        j(new W0(this, str));
    }

    public final void I(String str) {
        j(new X0(this, str));
    }

    public final void J(Runnable runnable) {
        j(new Z0(this, runnable));
    }

    public final String K() {
        BinderC2347s0 binderC2347s0 = new BinderC2347s0();
        j(new C2187a1(this, binderC2347s0));
        return binderC2347s0.k1(500L);
    }

    public final String L() {
        BinderC2347s0 binderC2347s0 = new BinderC2347s0();
        j(new C2196b1(this, binderC2347s0));
        return binderC2347s0.k1(50L);
    }

    public final long M() {
        BinderC2347s0 binderC2347s0 = new BinderC2347s0();
        j(new C2205c1(this, binderC2347s0));
        Long l12 = binderC2347s0.l1(500L);
        if (l12 != null) {
            return l12.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f24707b.a()).nextLong();
        int i10 = this.f24711f + 1;
        this.f24711f = i10;
        return nextLong + i10;
    }

    public final String a() {
        BinderC2347s0 binderC2347s0 = new BinderC2347s0();
        j(new C2214d1(this, binderC2347s0));
        return binderC2347s0.k1(500L);
    }

    public final String b() {
        BinderC2347s0 binderC2347s0 = new BinderC2347s0();
        j(new C2232f1(this, binderC2347s0));
        return binderC2347s0.k1(500L);
    }

    public final Map c(String str, String str2, boolean z10) {
        BinderC2347s0 binderC2347s0 = new BinderC2347s0();
        j(new C2241g1(this, str, str2, z10, binderC2347s0));
        Bundle m12 = binderC2347s0.m1(5000L);
        if (m12 == null || m12.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(m12.size());
        for (String str3 : m12.keySet()) {
            Object obj = m12.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void d(int i10, String str, Object obj, Object obj2, Object obj3) {
        j(new C2250h1(this, false, 5, str, obj, null, null));
    }

    public final int e(String str) {
        BinderC2347s0 binderC2347s0 = new BinderC2347s0();
        j(new C2268j1(this, str, binderC2347s0));
        Integer num = (Integer) BinderC2347s0.n1(binderC2347s0.m1(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String f() {
        BinderC2347s0 binderC2347s0 = new BinderC2347s0();
        j(new C2277k1(this, binderC2347s0));
        return binderC2347s0.k1(120000L);
    }

    public final Long g() {
        BinderC2347s0 binderC2347s0 = new BinderC2347s0();
        j(new C2286l1(this, binderC2347s0));
        return binderC2347s0.l1(120000L);
    }

    public final void h(boolean z10) {
        j(new C2295m1(this, z10));
    }

    public final void i(Bundle bundle) {
        j(new C2304n1(this, bundle));
    }

    final /* synthetic */ String l() {
        return this.f24706a;
    }

    final /* synthetic */ boolean m() {
        return this.f24712g;
    }

    final /* synthetic */ InterfaceC2374v0 n() {
        return this.f24714i;
    }

    final /* synthetic */ void o(InterfaceC2374v0 interfaceC2374v0) {
        this.f24714i = interfaceC2374v0;
    }

    public final C5178a t() {
        return this.f24709d;
    }

    protected final InterfaceC2374v0 u(Context context, boolean z10) {
        try {
            return AbstractBinderC2365u0.asInterface(DynamiteModule.d(context, z10 ? DynamiteModule.f23556e : DynamiteModule.f23554c, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e10) {
            k(e10, true, false);
            return null;
        }
    }

    public final void v(String str, Bundle bundle) {
        r(null, str, bundle, false, true, null);
    }

    public final void w(String str, String str2, Bundle bundle) {
        r(str, str2, bundle, true, true, null);
    }

    public final void x(String str, String str2, Object obj, boolean z10) {
        j(new L0(this, str, str2, obj, z10));
    }

    public final void y(Bundle bundle) {
        j(new M0(this, bundle));
    }

    public final void z(String str, String str2, Bundle bundle) {
        j(new N0(this, str, str2, bundle));
    }
}
