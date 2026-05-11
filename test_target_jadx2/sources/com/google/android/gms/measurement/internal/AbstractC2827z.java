package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC2338r0;

/* renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2827z {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f26477d;

    /* renamed from: a, reason: collision with root package name */
    private final V3 f26478a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f26479b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f26480c;

    AbstractC2827z(V3 v32) {
        AbstractC1287s.m(v32);
        this.f26478a = v32;
        this.f26479b = new RunnableC2819y(this, v32);
    }

    private final Handler f() {
        Handler handler;
        if (f26477d != null) {
            return f26477d;
        }
        synchronized (AbstractC2827z.class) {
            try {
                if (f26477d == null) {
                    f26477d = new HandlerC2338r0(this.f26478a.e().getMainLooper());
                }
                handler = f26477d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public abstract void a();

    public final void b(long j10) {
        d();
        if (j10 >= 0) {
            V3 v32 = this.f26478a;
            this.f26480c = v32.f().a();
            if (f().postDelayed(this.f26479b, j10)) {
                return;
            }
            v32.a().o().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean c() {
        return this.f26480c != 0;
    }

    final void d() {
        this.f26480c = 0L;
        f().removeCallbacks(this.f26479b);
    }

    final /* synthetic */ void e(long j10) {
        this.f26480c = 0L;
    }
}
