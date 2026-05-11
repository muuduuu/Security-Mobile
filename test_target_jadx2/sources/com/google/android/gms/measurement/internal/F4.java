package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class F4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f25401a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2642b5 f25402b;

    F4(C2642b5 c2642b5, AtomicReference atomicReference) {
        this.f25401a = atomicReference;
        Objects.requireNonNull(c2642b5);
        this.f25402b = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f25401a;
        synchronized (atomicReference) {
            try {
                try {
                    C2642b5 c2642b5 = this.f25402b;
                    atomicReference.set(Integer.valueOf(c2642b5.f25694a.w().E(c2642b5.f25694a.L().q(), AbstractC2671f2.f26000e0)));
                } finally {
                    this.f25401a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
