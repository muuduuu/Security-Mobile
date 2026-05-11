package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class E4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f25382a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2642b5 f25383b;

    E4(C2642b5 c2642b5, AtomicReference atomicReference) {
        this.f25382a = atomicReference;
        Objects.requireNonNull(c2642b5);
        this.f25383b = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f25382a;
        synchronized (atomicReference) {
            try {
                try {
                    C2642b5 c2642b5 = this.f25383b;
                    atomicReference.set(Long.valueOf(c2642b5.f25694a.w().D(c2642b5.f25694a.L().q(), AbstractC2671f2.f25997d0)));
                } finally {
                    this.f25382a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
