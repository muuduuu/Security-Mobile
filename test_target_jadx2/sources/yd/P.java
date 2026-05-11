package yd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class P extends AbstractC5215q implements r0 {

    /* renamed from: b, reason: collision with root package name */
    private final M f45459b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5197E f45460c;

    public P(M delegate, AbstractC5197E enhancement) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.f45459b = delegate;
        this.f45460c = enhancement;
    }

    @Override // yd.r0
    public AbstractC5197E N() {
        return this.f45460c;
    }

    @Override // yd.t0
    /* renamed from: d1 */
    public M a1(boolean z10) {
        t0 d10 = s0.d(N0().a1(z10), N().Z0().a1(z10));
        Intrinsics.e(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (M) d10;
    }

    @Override // yd.t0
    /* renamed from: e1 */
    public M c1(a0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        t0 d10 = s0.d(N0().c1(newAttributes), N());
        Intrinsics.e(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (M) d10;
    }

    @Override // yd.AbstractC5215q
    protected M f1() {
        return this.f45459b;
    }

    @Override // yd.r0
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public M N0() {
        return f1();
    }

    @Override // yd.AbstractC5215q
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public P g1(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC5197E a10 = kotlinTypeRefiner.a(f1());
        Intrinsics.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new P((M) a10, kotlinTypeRefiner.a(N()));
    }

    @Override // yd.AbstractC5215q
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public P h1(M delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new P(delegate, N());
    }

    @Override // yd.M
    public String toString() {
        return "[@EnhancedForWarnings(" + N() + ")] " + N0();
    }
}
