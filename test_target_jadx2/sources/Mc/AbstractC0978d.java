package Mc;

import Kc.AbstractC0948u;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0943o;
import Kc.InterfaceC0944p;
import Kc.a0;
import Kc.e0;
import Kc.f0;
import Mc.J;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import rd.h;
import xc.C5142C;
import yd.q0;
import yd.t0;

/* renamed from: Mc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0978d extends AbstractC0985k implements e0 {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f6225j = {C5142C.k(new xc.u(C5142C.b(AbstractC0978d.class), "constructors", "getConstructors()Ljava/util/Collection;"))};

    /* renamed from: e, reason: collision with root package name */
    private final xd.n f6226e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC0948u f6227f;

    /* renamed from: g, reason: collision with root package name */
    private final xd.i f6228g;

    /* renamed from: h, reason: collision with root package name */
    private List f6229h;

    /* renamed from: i, reason: collision with root package name */
    private final C0126d f6230i;

    /* renamed from: Mc.d$a */
    static final class a extends xc.m implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yd.M invoke(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            InterfaceC0936h f10 = gVar.f(AbstractC0978d.this);
            if (f10 != null) {
                return f10.y();
            }
            return null;
        }
    }

    /* renamed from: Mc.d$b */
    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke() {
            return AbstractC0978d.this.U0();
        }
    }

    /* renamed from: Mc.d$c */
    static final class c extends xc.m implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 t0Var) {
            boolean z10;
            Intrinsics.d(t0Var);
            if (!yd.G.a(t0Var)) {
                AbstractC0978d abstractC0978d = AbstractC0978d.this;
                InterfaceC0936h d10 = t0Var.W0().d();
                if ((d10 instanceof f0) && !Intrinsics.b(((f0) d10).b(), abstractC0978d)) {
                    z10 = true;
                    return Boolean.valueOf(z10);
                }
            }
            z10 = false;
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: Mc.d$d, reason: collision with other inner class name */
    public static final class C0126d implements yd.e0 {
        C0126d() {
        }

        @Override // yd.e0
        public Collection a() {
            Collection a10 = d().m0().W0().a();
            Intrinsics.checkNotNullExpressionValue(a10, "getSupertypes(...)");
            return a10;
        }

        @Override // yd.e0
        public yd.e0 b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this;
        }

        @Override // yd.e0
        public List c() {
            return AbstractC0978d.this.V0();
        }

        @Override // yd.e0
        public boolean e() {
            return true;
        }

        @Override // yd.e0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public e0 d() {
            return AbstractC0978d.this;
        }

        public String toString() {
            return "[typealias " + d().getName().c() + ']';
        }

        @Override // yd.e0
        public Hc.g v() {
            return AbstractC3778c.j(d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0978d(xd.n storageManager, InterfaceC0941m containingDeclaration, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, id.f name, a0 sourceElement, AbstractC0948u visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        Intrinsics.checkNotNullParameter(visibilityImpl, "visibilityImpl");
        this.f6226e = storageManager;
        this.f6227f = visibilityImpl;
        this.f6228g = storageManager.d(new b());
        this.f6230i = new C0126d();
    }

    @Override // Kc.InterfaceC0937i
    public List B() {
        List list = this.f6229h;
        if (list != null) {
            return list;
        }
        Intrinsics.v("declaredTypeParametersImpl");
        return null;
    }

    @Override // Kc.C
    public boolean M0() {
        return false;
    }

    protected final yd.M N0() {
        rd.h hVar;
        InterfaceC0933e x10 = x();
        if (x10 == null || (hVar = x10.L0()) == null) {
            hVar = h.b.f40647b;
        }
        yd.M u10 = q0.u(this, hVar, new a());
        Intrinsics.checkNotNullExpressionValue(u10, "makeUnsubstitutedType(...)");
        return u10;
    }

    @Override // Kc.C
    public boolean R() {
        return false;
    }

    @Override // Kc.InterfaceC0937i
    public boolean S() {
        return q0.c(m0(), new c());
    }

    @Override // Mc.AbstractC0985k, Mc.AbstractC0984j, Kc.InterfaceC0941m
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public e0 a() {
        InterfaceC0944p a10 = super.a();
        Intrinsics.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (e0) a10;
    }

    public final Collection U0() {
        InterfaceC0933e x10 = x();
        if (x10 == null) {
            return CollectionsKt.j();
        }
        Collection<InterfaceC0932d> k10 = x10.k();
        Intrinsics.checkNotNullExpressionValue(k10, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0932d interfaceC0932d : k10) {
            J.a aVar = J.f6193I;
            xd.n nVar = this.f6226e;
            Intrinsics.d(interfaceC0932d);
            I b10 = aVar.b(nVar, this, interfaceC0932d);
            if (b10 != null) {
                arrayList.add(b10);
            }
        }
        return arrayList;
    }

    protected abstract List V0();

    public final void W0(List declaredTypeParameters) {
        Intrinsics.checkNotNullParameter(declaredTypeParameters, "declaredTypeParameters");
        this.f6229h = declaredTypeParameters;
    }

    @Override // Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.d(this, obj);
    }

    @Override // Kc.InterfaceC0945q, Kc.C
    public AbstractC0948u h() {
        return this.f6227f;
    }

    protected final xd.n n0() {
        return this.f6226e;
    }

    @Override // Kc.C
    public boolean q() {
        return false;
    }

    @Override // Kc.InterfaceC0936h
    public yd.e0 r() {
        return this.f6230i;
    }

    @Override // Mc.AbstractC0984j
    public String toString() {
        return "typealias " + getName().c();
    }
}
