package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.u4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2792u4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f26375a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2642b5 f26376b;

    RunnableC2792u4(C2642b5 c2642b5, AtomicReference atomicReference) {
        this.f26375a = atomicReference;
        Objects.requireNonNull(c2642b5);
        this.f26376b = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f26375a;
        synchronized (atomicReference) {
            try {
                try {
                    C2642b5 c2642b5 = this.f26376b;
                    atomicReference.set(Boolean.valueOf(c2642b5.f25694a.w().H(c2642b5.f25694a.L().q(), AbstractC2671f2.f25991b0)));
                } finally {
                    this.f26375a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
