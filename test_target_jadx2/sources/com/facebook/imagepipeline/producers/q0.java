package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f21008a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21009b;

    /* renamed from: c, reason: collision with root package name */
    private final Deque f21010c;

    public q0(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f21008a = executor;
        this.f21010c = new ArrayDeque();
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f21010c.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized void b(Runnable runnable) {
        try {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (this.f21009b) {
                this.f21010c.add(runnable);
            } else {
                this.f21008a.execute(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
