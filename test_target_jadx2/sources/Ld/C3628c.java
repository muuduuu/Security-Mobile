package ld;

import Kc.InterfaceC0936h;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.j;
import yd.AbstractC5197E;
import yd.i0;
import yd.u0;

/* renamed from: ld.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3628c implements InterfaceC3627b {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f37155a;

    /* renamed from: b, reason: collision with root package name */
    private j f37156b;

    public C3628c(i0 projection) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.f37155a = projection;
        f().a();
        u0 u0Var = u0.INVARIANT;
    }

    @Override // yd.e0
    public Collection a() {
        AbstractC5197E type = f().a() == u0.OUT_VARIANCE ? f().getType() : v().I();
        Intrinsics.d(type);
        return CollectionsKt.e(type);
    }

    @Override // yd.e0
    public List c() {
        return CollectionsKt.j();
    }

    @Override // yd.e0
    public /* bridge */ /* synthetic */ InterfaceC0936h d() {
        return (InterfaceC0936h) g();
    }

    @Override // yd.e0
    public boolean e() {
        return false;
    }

    @Override // ld.InterfaceC3627b
    public i0 f() {
        return this.f37155a;
    }

    public Void g() {
        return null;
    }

    public final j h() {
        return this.f37156b;
    }

    @Override // yd.e0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C3628c b(g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        i0 b10 = f().b(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(b10, "refine(...)");
        return new C3628c(b10);
    }

    public final void j(j jVar) {
        this.f37156b = jVar;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + f() + ')';
    }

    @Override // yd.e0
    public Hc.g v() {
        Hc.g v10 = f().getType().W0().v();
        Intrinsics.checkNotNullExpressionValue(v10, "getBuiltIns(...)");
        return v10;
    }
}
