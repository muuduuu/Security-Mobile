package yd;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5199a extends AbstractC5215q {

    /* renamed from: b, reason: collision with root package name */
    private final M f45476b;

    /* renamed from: c, reason: collision with root package name */
    private final M f45477c;

    public C5199a(M delegate, M abbreviation) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(abbreviation, "abbreviation");
        this.f45476b = delegate;
        this.f45477c = abbreviation;
    }

    public final M b0() {
        return f1();
    }

    @Override // yd.t0
    /* renamed from: e1 */
    public M c1(a0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new C5199a(f1().c1(newAttributes), this.f45477c);
    }

    @Override // yd.AbstractC5215q
    protected M f1() {
        return this.f45476b;
    }

    public final M i1() {
        return this.f45477c;
    }

    @Override // yd.M
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public C5199a a1(boolean z10) {
        return new C5199a(f1().a1(z10), this.f45477c.a1(z10));
    }

    @Override // yd.AbstractC5215q
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public C5199a g1(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC5197E a10 = kotlinTypeRefiner.a(f1());
        Intrinsics.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC5197E a11 = kotlinTypeRefiner.a(this.f45477c);
        Intrinsics.e(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C5199a((M) a10, (M) a11);
    }

    @Override // yd.AbstractC5215q
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public C5199a h1(M delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new C5199a(delegate, this.f45477c);
    }
}
