package T2;

import androidx.lifecycle.S;
import androidx.lifecycle.V;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v extends V.d {

    /* renamed from: e, reason: collision with root package name */
    private final long f9241e;

    public /* synthetic */ v(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10);
    }

    @Override // androidx.lifecycle.V.d, androidx.lifecycle.V.c
    public S a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (Intrinsics.b(modelClass, u.class)) {
            return new u(this.f9241e);
        }
        throw new IllegalArgumentException(Intrinsics.m("Cannot create ", modelClass).toString());
    }

    public v(long j10) {
        this.f9241e = j10;
    }
}
