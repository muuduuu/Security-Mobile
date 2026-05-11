package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class G4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f25417a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2642b5 f25418b;

    G4(C2642b5 c2642b5, AtomicReference atomicReference) {
        this.f25417a = atomicReference;
        Objects.requireNonNull(c2642b5);
        this.f25418b = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f25417a;
        synchronized (atomicReference) {
            try {
                try {
                    C2642b5 c2642b5 = this.f25418b;
                    atomicReference.set(Double.valueOf(c2642b5.f25694a.w().G(c2642b5.f25694a.L().q(), AbstractC2671f2.f26003f0)));
                } finally {
                    this.f25417a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
