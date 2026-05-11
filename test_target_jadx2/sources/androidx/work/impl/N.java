package androidx.work.impl;

import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface N {
    void a(A a10, WorkerParameters.a aVar);

    default void b(A workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        a(workSpecId, null);
    }

    void c(A a10, int i10);

    default void d(A workSpecId, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        c(workSpecId, i10);
    }

    default void e(A workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        c(workSpecId, -512);
    }
}
