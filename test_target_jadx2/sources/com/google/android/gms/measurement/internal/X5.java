package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.C2010b;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class X5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2010b f25732a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y5 f25733b;

    X5(Y5 y52, C2010b c2010b) {
        this.f25732a = c2010b;
        Objects.requireNonNull(y52);
        this.f25733b = y52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2667e6 c2667e6 = this.f25733b.f25747c;
        c2667e6.O(null);
        if (this.f25732a.u() != 7777) {
            c2667e6.L();
            return;
        }
        if (c2667e6.P() == null) {
            c2667e6.Q(Executors.newScheduledThreadPool(1));
        }
        c2667e6.P().schedule(new Runnable() { // from class: com.google.android.gms.measurement.internal.V5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final C2667e6 c2667e62 = X5.this.f25733b.f25747c;
                c2667e62.f25694a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.W5
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C2667e6.this.w();
                    }
                });
            }
        }, ((Long) AbstractC2671f2.f25988a0.b(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
