package com.facebook.imagepipeline.producers;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class B implements p0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f20747a;

    public B(Executor executor) {
        if (executor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f20747a = executor;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f20747a.execute(runnable);
    }
}
