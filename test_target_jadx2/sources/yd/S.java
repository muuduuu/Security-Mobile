package yd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class S extends j0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5197E f45461a;

    public S(Hc.g kotlinBuiltIns) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns, "kotlinBuiltIns");
        M I10 = kotlinBuiltIns.I();
        Intrinsics.checkNotNullExpressionValue(I10, "getNullableAnyType(...)");
        this.f45461a = I10;
    }

    @Override // yd.i0
    public u0 a() {
        return u0.OUT_VARIANCE;
    }

    @Override // yd.i0
    public i0 b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // yd.i0
    public boolean c() {
        return true;
    }

    @Override // yd.i0
    public AbstractC5197E getType() {
        return this.f45461a;
    }
}
