package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.x5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class BinderC2817x5 extends AbstractBinderC2743o2 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AtomicReference f26456f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C2667e6 f26457g;

    BinderC2817x5(C2667e6 c2667e6, AtomicReference atomicReference) {
        this.f26456f = atomicReference;
        Objects.requireNonNull(c2667e6);
        this.f26457g = c2667e6;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2751p2
    public final void G0(K6 k62) {
        AtomicReference atomicReference = this.f26456f;
        synchronized (atomicReference) {
            this.f26457g.f25694a.a().w().b("[sgtm] Got upload batches from service. count", Integer.valueOf(k62.f25528a.size()));
            atomicReference.set(k62);
            atomicReference.notifyAll();
        }
    }
}
