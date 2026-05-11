package yd;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5193A extends AbstractC5222y implements r0 {

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5222y f45421d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5197E f45422e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5193A(AbstractC5222y origin, AbstractC5197E enhancement) {
        super(origin.e1(), origin.f1());
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.f45421d = origin;
        this.f45422e = enhancement;
    }

    @Override // yd.r0
    public AbstractC5197E N() {
        return this.f45422e;
    }

    @Override // yd.t0
    public t0 a1(boolean z10) {
        return s0.d(N0().a1(z10), N().Z0().a1(z10));
    }

    @Override // yd.t0
    public t0 c1(a0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return s0.d(N0().c1(newAttributes), N());
    }

    @Override // yd.AbstractC5222y
    public M d1() {
        return N0().d1();
    }

    @Override // yd.AbstractC5222y
    public String g1(kotlin.reflect.jvm.internal.impl.renderer.c renderer, kotlin.reflect.jvm.internal.impl.renderer.f options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        return options.f() ? renderer.w(N()) : N0().g1(renderer, options);
    }

    @Override // yd.r0
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public AbstractC5222y N0() {
        return this.f45421d;
    }

    @Override // yd.t0
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public C5193A g1(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC5197E a10 = kotlinTypeRefiner.a(N0());
        Intrinsics.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new C5193A((AbstractC5222y) a10, kotlinTypeRefiner.a(N()));
    }

    @Override // yd.AbstractC5222y
    public String toString() {
        return "[@EnhancedForWarnings(" + N() + ")] " + N0();
    }
}
