package androidx.work.impl;

import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class O implements N {

    /* renamed from: a, reason: collision with root package name */
    private final C1634u f18172a;

    /* renamed from: b, reason: collision with root package name */
    private final E1.b f18173b;

    public O(C1634u processor, E1.b workTaskExecutor) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        this.f18172a = processor;
        this.f18173b = workTaskExecutor;
    }

    @Override // androidx.work.impl.N
    public void a(A workSpecId, WorkerParameters.a aVar) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f18173b.d(new D1.t(this.f18172a, workSpecId, aVar));
    }

    @Override // androidx.work.impl.N
    public void c(A workSpecId, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f18173b.d(new D1.v(this.f18172a, workSpecId, false, i10));
    }
}
