package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.K1;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.android.core.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3378h {

    /* renamed from: a, reason: collision with root package name */
    private FrameMetricsAggregator f34846a;

    /* renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f34847b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f34848c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f34849d;

    /* renamed from: e, reason: collision with root package name */
    private final c0 f34850e;

    /* renamed from: io.sentry.android.core.h$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f34851a;

        /* renamed from: b, reason: collision with root package name */
        private final int f34852b;

        /* renamed from: c, reason: collision with root package name */
        private final int f34853c;

        private b(int i10, int i11, int i12) {
            this.f34851a = i10;
            this.f34852b = i11;
            this.f34853c = i12;
        }
    }

    public C3378h(b0 b0Var, SentryAndroidOptions sentryAndroidOptions, c0 c0Var) {
        this.f34846a = null;
        this.f34848c = new ConcurrentHashMap();
        this.f34849d = new WeakHashMap();
        if (b0Var.a("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger())) {
            this.f34846a = new FrameMetricsAggregator();
        }
        this.f34847b = sentryAndroidOptions;
        this.f34850e = c0Var;
    }

    private b f() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        if (!h() || (frameMetricsAggregator = this.f34846a) == null) {
            return null;
        }
        SparseIntArray[] b10 = frameMetricsAggregator.b();
        int i12 = 0;
        if (b10 == null || b10.length <= 0 || (sparseIntArray = b10[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                int valueAt = sparseIntArray.valueAt(i12);
                i13 += valueAt;
                if (keyAt > 700) {
                    i11 += valueAt;
                } else if (keyAt > 16) {
                    i10 += valueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new b(i12, i10, i11);
    }

    private b g(Activity activity) {
        b f10;
        b bVar = (b) this.f34849d.remove(activity);
        if (bVar == null || (f10 = f()) == null) {
            return null;
        }
        return new b(f10.f34851a - bVar.f34851a, f10.f34852b - bVar.f34852b, f10.f34853c - bVar.f34853c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Activity activity) {
        this.f34846a.a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                this.f34847b.getLogger().c(K1.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Activity activity) {
        this.f34846a.c(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f34846a.e();
    }

    private void m(final Runnable runnable, final String str) {
        try {
            if (io.sentry.android.core.internal.util.b.e().d()) {
                runnable.run();
            } else {
                this.f34850e.b(new Runnable() { // from class: io.sentry.android.core.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3378h.this.j(runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f34847b.getLogger().c(K1.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    private void o(Activity activity) {
        b f10 = f();
        if (f10 != null) {
            this.f34849d.put(activity, f10);
        }
    }

    public synchronized void e(final Activity activity) {
        if (h()) {
            m(new Runnable() { // from class: io.sentry.android.core.d
                @Override // java.lang.Runnable
                public final void run() {
                    C3378h.this.i(activity);
                }
            }, "FrameMetricsAggregator.add");
            o(activity);
        }
    }

    public boolean h() {
        return this.f34846a != null && this.f34847b.isEnableFramesTracking();
    }

    public synchronized void n(final Activity activity, io.sentry.protocol.r rVar) {
        try {
            if (h()) {
                m(new Runnable() { // from class: io.sentry.android.core.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3378h.this.k(activity);
                    }
                }, null);
                b g10 = g(activity);
                if (g10 != null && (g10.f34851a != 0 || g10.f34852b != 0 || g10.f34853c != 0)) {
                    io.sentry.protocol.i iVar = new io.sentry.protocol.i(Integer.valueOf(g10.f34851a), "none");
                    io.sentry.protocol.i iVar2 = new io.sentry.protocol.i(Integer.valueOf(g10.f34852b), "none");
                    io.sentry.protocol.i iVar3 = new io.sentry.protocol.i(Integer.valueOf(g10.f34853c), "none");
                    HashMap hashMap = new HashMap();
                    hashMap.put("frames_total", iVar);
                    hashMap.put("frames_slow", iVar2);
                    hashMap.put("frames_frozen", iVar3);
                    this.f34848c.put(rVar, hashMap);
                }
            }
        } finally {
        }
    }

    public synchronized void p() {
        try {
            if (h()) {
                m(new Runnable() { // from class: io.sentry.android.core.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3378h.this.l();
                    }
                }, "FrameMetricsAggregator.stop");
                this.f34846a.d();
            }
            this.f34848c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Map q(io.sentry.protocol.r rVar) {
        if (!h()) {
            return null;
        }
        Map map = (Map) this.f34848c.get(rVar);
        this.f34848c.remove(rVar);
        return map;
    }

    public C3378h(b0 b0Var, SentryAndroidOptions sentryAndroidOptions) {
        this(b0Var, sentryAndroidOptions, new c0());
    }
}
