package wd;

import Kc.AbstractC0948u;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.a0;
import Kc.e0;
import Kc.g0;
import Mc.AbstractC0978d;
import dd.C3041r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.G;
import yd.M;
import yd.m0;
import yd.n0;
import yd.u0;

/* renamed from: wd.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5080l extends AbstractC0978d implements InterfaceC5075g {

    /* renamed from: k, reason: collision with root package name */
    private final C3041r f44567k;

    /* renamed from: l, reason: collision with root package name */
    private final fd.c f44568l;

    /* renamed from: m, reason: collision with root package name */
    private final fd.g f44569m;

    /* renamed from: n, reason: collision with root package name */
    private final fd.h f44570n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC5074f f44571o;

    /* renamed from: p, reason: collision with root package name */
    private M f44572p;

    /* renamed from: q, reason: collision with root package name */
    private M f44573q;

    /* renamed from: r, reason: collision with root package name */
    private List f44574r;

    /* renamed from: s, reason: collision with root package name */
    private M f44575s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5080l(xd.n storageManager, InterfaceC0941m containingDeclaration, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, id.f name, AbstractC0948u visibility, C3041r proto, fd.c nameResolver, fd.g typeTable, fd.h versionRequirementTable, InterfaceC5074f interfaceC5074f) {
        super(storageManager, containingDeclaration, annotations, name, NO_SOURCE, visibility);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        a0 NO_SOURCE = a0.f5560a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        this.f44567k = proto;
        this.f44568l = nameResolver;
        this.f44569m = typeTable;
        this.f44570n = versionRequirementTable;
        this.f44571o = interfaceC5074f;
    }

    @Override // Mc.AbstractC0978d
    protected List V0() {
        List list = this.f44574r;
        if (list != null) {
            return list;
        }
        Intrinsics.v("typeConstructorParameters");
        return null;
    }

    public C3041r X0() {
        return this.f44567k;
    }

    @Override // wd.InterfaceC5075g
    public fd.g Y() {
        return this.f44569m;
    }

    public fd.h Y0() {
        return this.f44570n;
    }

    public final void Z0(List declaredTypeParameters, M underlyingType, M expandedType) {
        Intrinsics.checkNotNullParameter(declaredTypeParameters, "declaredTypeParameters");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(expandedType, "expandedType");
        W0(declaredTypeParameters);
        this.f44572p = underlyingType;
        this.f44573q = expandedType;
        this.f44574r = g0.d(this);
        this.f44575s = N0();
    }

    @Override // Kc.c0
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public e0 c(n0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        xd.n n02 = n0();
        InterfaceC0941m b10 = b();
        Intrinsics.checkNotNullExpressionValue(b10, "getContainingDeclaration(...)");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i10 = i();
        Intrinsics.checkNotNullExpressionValue(i10, "<get-annotations>(...)");
        id.f name = getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        C5080l c5080l = new C5080l(n02, b10, i10, name, h(), X0(), e0(), Y(), Y0(), i0());
        List B10 = B();
        M m02 = m0();
        u0 u0Var = u0.INVARIANT;
        AbstractC5197E n10 = substitutor.n(m02, u0Var);
        Intrinsics.checkNotNullExpressionValue(n10, "safeSubstitute(...)");
        M a10 = m0.a(n10);
        AbstractC5197E n11 = substitutor.n(b0(), u0Var);
        Intrinsics.checkNotNullExpressionValue(n11, "safeSubstitute(...)");
        c5080l.Z0(B10, a10, m0.a(n11));
        return c5080l;
    }

    @Override // Kc.e0
    public M b0() {
        M m10 = this.f44573q;
        if (m10 != null) {
            return m10;
        }
        Intrinsics.v("expandedType");
        return null;
    }

    @Override // wd.InterfaceC5075g
    public fd.c e0() {
        return this.f44568l;
    }

    @Override // wd.InterfaceC5075g
    public InterfaceC5074f i0() {
        return this.f44571o;
    }

    @Override // Kc.e0
    public M m0() {
        M m10 = this.f44572p;
        if (m10 != null) {
            return m10;
        }
        Intrinsics.v("underlyingType");
        return null;
    }

    @Override // Kc.e0
    public InterfaceC0933e x() {
        if (G.a(b0())) {
            return null;
        }
        InterfaceC0936h d10 = b0().W0().d();
        if (d10 instanceof InterfaceC0933e) {
            return (InterfaceC0933e) d10;
        }
        return null;
    }

    @Override // Kc.InterfaceC0936h
    public M y() {
        M m10 = this.f44575s;
        if (m10 != null) {
            return m10;
        }
        Intrinsics.v("defaultTypeImpl");
        return null;
    }
}
