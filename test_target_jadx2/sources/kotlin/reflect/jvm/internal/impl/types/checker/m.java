package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import yd.AbstractC5197E;
import yd.C5203e;
import yd.d0;
import yd.t0;

/* loaded from: classes3.dex */
public final class m implements l {

    /* renamed from: c, reason: collision with root package name */
    private final g f36695c;

    /* renamed from: d, reason: collision with root package name */
    private final f f36696d;

    /* renamed from: e, reason: collision with root package name */
    private final kd.l f36697e;

    public m(g kotlinTypeRefiner, f kotlinTypePreparator) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        this.f36695c = kotlinTypeRefiner;
        this.f36696d = kotlinTypePreparator;
        kd.l m10 = kd.l.m(d());
        Intrinsics.checkNotNullExpressionValue(m10, "createWithTypeRefiner(...)");
        this.f36697e = m10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.l
    public kd.l a() {
        return this.f36697e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
    public boolean b(AbstractC5197E a10, AbstractC5197E b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return e(a.b(false, false, null, f(), d(), 6, null), a10.Z0(), b10.Z0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
    public boolean c(AbstractC5197E subtype, AbstractC5197E supertype) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        return g(a.b(true, false, null, f(), d(), 6, null), subtype.Z0(), supertype.Z0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.l
    public g d() {
        return this.f36695c;
    }

    public final boolean e(d0 d0Var, t0 a10, t0 b10) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return C5203e.f45496a.k(d0Var, a10, b10);
    }

    public f f() {
        return this.f36696d;
    }

    public final boolean g(d0 d0Var, t0 subType, t0 superType) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return C5203e.t(C5203e.f45496a, d0Var, subType, superType, false, 8, null);
    }

    public /* synthetic */ m(g gVar, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i10 & 2) != 0 ? f.a.f36673a : fVar);
    }
}
