package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.w5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class BinderC2809w5 extends AbstractBinderC2719l2 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AtomicReference f26440f;

    BinderC2809w5(C2667e6 c2667e6, AtomicReference atomicReference) {
        this.f26440f = atomicReference;
        Objects.requireNonNull(c2667e6);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2727m2
    public final void P0(List list) {
        AtomicReference atomicReference = this.f26440f;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
