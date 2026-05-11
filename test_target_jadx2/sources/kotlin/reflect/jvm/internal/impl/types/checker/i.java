package kotlin.reflect.jvm.internal.impl.types.checker;

import Kc.f0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yd.M;
import yd.a0;
import yd.i0;
import yd.t0;

/* loaded from: classes3.dex */
public final class i extends M implements Ad.d {

    /* renamed from: b, reason: collision with root package name */
    private final Ad.b f36676b;

    /* renamed from: c, reason: collision with root package name */
    private final j f36677c;

    /* renamed from: d, reason: collision with root package name */
    private final t0 f36678d;

    /* renamed from: e, reason: collision with root package name */
    private final a0 f36679e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f36680f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f36681g;

    public /* synthetic */ i(Ad.b bVar, j jVar, t0 t0Var, a0 a0Var, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, jVar, t0Var, (i10 & 8) != 0 ? a0.f45478b.i() : a0Var, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }

    @Override // yd.AbstractC5197E
    public List U0() {
        return CollectionsKt.j();
    }

    @Override // yd.AbstractC5197E
    public a0 V0() {
        return this.f36679e;
    }

    @Override // yd.AbstractC5197E
    public boolean X0() {
        return this.f36680f;
    }

    @Override // yd.t0
    /* renamed from: e1 */
    public M c1(a0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new i(this.f36676b, W0(), this.f36678d, newAttributes, X0(), this.f36681g);
    }

    public final Ad.b f1() {
        return this.f36676b;
    }

    @Override // yd.AbstractC5197E
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public j W0() {
        return this.f36677c;
    }

    public final t0 h1() {
        return this.f36678d;
    }

    public final boolean i1() {
        return this.f36681g;
    }

    @Override // yd.M
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public i a1(boolean z10) {
        return new i(this.f36676b, W0(), this.f36678d, V0(), z10, false, 32, null);
    }

    @Override // yd.t0
    /* renamed from: k1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public i g1(g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Ad.b bVar = this.f36676b;
        j b10 = W0().b(kotlinTypeRefiner);
        t0 t0Var = this.f36678d;
        return new i(bVar, b10, t0Var != null ? kotlinTypeRefiner.a(t0Var).Z0() : null, V0(), X0(), false, 32, null);
    }

    @Override // yd.AbstractC5197E
    public rd.h w() {
        return kotlin.reflect.jvm.internal.impl.types.error.k.a(kotlin.reflect.jvm.internal.impl.types.error.g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public i(Ad.b captureStatus, j constructor, t0 t0Var, a0 attributes, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f36676b = captureStatus;
        this.f36677c = constructor;
        this.f36678d = t0Var;
        this.f36679e = attributes;
        this.f36680f = z10;
        this.f36681g = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(Ad.b captureStatus, t0 t0Var, i0 projection, f0 typeParameter) {
        this(captureStatus, new j(projection, null, null, typeParameter, 6, null), t0Var, r5, r6, r7, 56, null);
        Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        a0 a0Var = null;
        boolean z10 = false;
        boolean z11 = false;
    }
}
