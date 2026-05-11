package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.w4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2808w4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f26438a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2642b5 f26439b;

    RunnableC2808w4(C2642b5 c2642b5, long j10) {
        this.f26438a = j10;
        Objects.requireNonNull(c2642b5);
        this.f26439b = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2642b5 c2642b5 = this.f26439b;
        c2642b5.h();
        c2642b5.j();
        C2760q3 c2760q3 = c2642b5.f25694a;
        c2760q3.a().v().a("Resetting analytics data (FE)");
        C2760q3 c2760q32 = c2642b5.f25694a;
        C2810w6 z10 = c2760q32.z();
        z10.h();
        z10.f26444f.c();
        c2760q32.L().p();
        boolean z11 = !c2642b5.f25694a.g();
        Q2 x10 = c2760q3.x();
        x10.f25633f.b(this.f26438a);
        C2760q3 c2760q33 = x10.f25694a;
        if (!TextUtils.isEmpty(c2760q33.x().f25650w.a())) {
            x10.f25650w.b(null);
        }
        x10.f25644q.b(0L);
        x10.f25645r.b(0L);
        if (!c2760q33.w().L()) {
            x10.y(z11);
        }
        x10.f25651x.b(null);
        x10.f25652y.b(0L);
        x10.f25653z.b(null);
        c2760q32.J().p();
        c2760q32.z().f26443e.a();
        c2642b5.f25803s = z11;
        c2760q32.J().q(new AtomicReference());
    }
}
