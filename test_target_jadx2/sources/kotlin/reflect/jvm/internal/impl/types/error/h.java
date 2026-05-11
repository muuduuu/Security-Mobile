package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xc.C5146G;
import yd.M;
import yd.a0;
import yd.e0;

/* loaded from: classes3.dex */
public final class h extends M {

    /* renamed from: b, reason: collision with root package name */
    private final e0 f36716b;

    /* renamed from: c, reason: collision with root package name */
    private final rd.h f36717c;

    /* renamed from: d, reason: collision with root package name */
    private final j f36718d;

    /* renamed from: e, reason: collision with root package name */
    private final List f36719e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f36720f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f36721g;

    /* renamed from: h, reason: collision with root package name */
    private final String f36722h;

    public /* synthetic */ h(e0 e0Var, rd.h hVar, j jVar, List list, boolean z10, String[] strArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e0Var, hVar, jVar, (i10 & 8) != 0 ? CollectionsKt.j() : list, (i10 & 16) != 0 ? false : z10, strArr);
    }

    @Override // yd.AbstractC5197E
    public List U0() {
        return this.f36719e;
    }

    @Override // yd.AbstractC5197E
    public a0 V0() {
        return a0.f45478b.i();
    }

    @Override // yd.AbstractC5197E
    public e0 W0() {
        return this.f36716b;
    }

    @Override // yd.AbstractC5197E
    public boolean X0() {
        return this.f36720f;
    }

    @Override // yd.t0
    /* renamed from: d1 */
    public M a1(boolean z10) {
        e0 W02 = W0();
        rd.h w10 = w();
        j jVar = this.f36718d;
        List U02 = U0();
        String[] strArr = this.f36721g;
        return new h(W02, w10, jVar, U02, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // yd.t0
    /* renamed from: e1 */
    public M c1(a0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    public final String f1() {
        return this.f36722h;
    }

    public final j g1() {
        return this.f36718d;
    }

    @Override // yd.t0
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public h g1(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public final h i1(List newArguments) {
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        e0 W02 = W0();
        rd.h w10 = w();
        j jVar = this.f36718d;
        boolean X02 = X0();
        String[] strArr = this.f36721g;
        return new h(W02, w10, jVar, newArguments, X02, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // yd.AbstractC5197E
    public rd.h w() {
        return this.f36717c;
    }

    public h(e0 constructor, rd.h memberScope, j kind, List arguments, boolean z10, String... formatParams) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f36716b = constructor;
        this.f36717c = memberScope;
        this.f36718d = kind;
        this.f36719e = arguments;
        this.f36720f = z10;
        this.f36721g = formatParams;
        C5146G c5146g = C5146G.f44966a;
        String debugMessage = kind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        this.f36722h = format;
    }
}
