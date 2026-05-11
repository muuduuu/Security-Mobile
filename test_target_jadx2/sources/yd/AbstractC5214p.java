package yd;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5214p extends l0 {

    /* renamed from: c, reason: collision with root package name */
    private final l0 f45558c;

    public AbstractC5214p(l0 substitution) {
        Intrinsics.checkNotNullParameter(substitution, "substitution");
        this.f45558c = substitution;
    }

    @Override // yd.l0
    public boolean a() {
        return this.f45558c.a();
    }

    @Override // yd.l0
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.f45558c.d(annotations);
    }

    @Override // yd.l0
    public i0 e(AbstractC5197E key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f45558c.e(key);
    }

    @Override // yd.l0
    public boolean f() {
        return this.f45558c.f();
    }

    @Override // yd.l0
    public AbstractC5197E g(AbstractC5197E topLevelType, u0 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.f45558c.g(topLevelType, position);
    }
}
