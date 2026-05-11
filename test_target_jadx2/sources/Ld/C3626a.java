package ld;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.error.k;
import org.conscrypt.BuildConfig;
import rd.h;
import yd.M;
import yd.a0;
import yd.i0;

/* renamed from: ld.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3626a extends M implements Ad.d {

    /* renamed from: b, reason: collision with root package name */
    private final i0 f37151b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3627b f37152c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37153d;

    /* renamed from: e, reason: collision with root package name */
    private final a0 f37154e;

    public /* synthetic */ C3626a(i0 i0Var, InterfaceC3627b interfaceC3627b, boolean z10, a0 a0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, (i10 & 2) != 0 ? new C3628c(i0Var) : interfaceC3627b, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? a0.f45478b.i() : a0Var);
    }

    @Override // yd.AbstractC5197E
    public List U0() {
        return CollectionsKt.j();
    }

    @Override // yd.AbstractC5197E
    public a0 V0() {
        return this.f37154e;
    }

    @Override // yd.AbstractC5197E
    public boolean X0() {
        return this.f37153d;
    }

    @Override // yd.t0
    /* renamed from: e1 */
    public M c1(a0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new C3626a(this.f37151b, W0(), X0(), newAttributes);
    }

    @Override // yd.AbstractC5197E
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public InterfaceC3627b W0() {
        return this.f37152c;
    }

    @Override // yd.M
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public C3626a a1(boolean z10) {
        return z10 == X0() ? this : new C3626a(this.f37151b, W0(), z10, V0());
    }

    @Override // yd.t0
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public C3626a g1(g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        i0 b10 = this.f37151b.b(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(b10, "refine(...)");
        return new C3626a(b10, W0(), X0(), V0());
    }

    @Override // yd.M
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f37151b);
        sb2.append(')');
        sb2.append(X0() ? "?" : BuildConfig.FLAVOR);
        return sb2.toString();
    }

    @Override // yd.AbstractC5197E
    public h w() {
        return k.a(kotlin.reflect.jvm.internal.impl.types.error.g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public C3626a(i0 typeProjection, InterfaceC3627b constructor, boolean z10, a0 attributes) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f37151b = typeProjection;
        this.f37152c = constructor;
        this.f37153d = z10;
        this.f37154e = attributes;
    }
}
