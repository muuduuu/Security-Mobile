package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ThreadFactoryC2259i1 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f24529a;

    ThreadFactoryC2259i1(C2411z1 c2411z1) {
        Objects.requireNonNull(c2411z1);
        this.f24529a = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f24529a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
