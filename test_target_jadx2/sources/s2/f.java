package S2;

import androidx.lifecycle.S;
import androidx.lifecycle.V;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends V.d {

    /* renamed from: e, reason: collision with root package name */
    private final long f8703e;

    public f(long j10) {
        this.f8703e = j10;
    }

    @Override // androidx.lifecycle.V.d, androidx.lifecycle.V.c
    public S a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (Intrinsics.b(modelClass, e.class)) {
            return new e(this.f8703e);
        }
        throw new IllegalArgumentException(Intrinsics.m("Cannot create ", modelClass).toString());
    }
}
