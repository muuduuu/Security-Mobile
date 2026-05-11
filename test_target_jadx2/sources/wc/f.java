package Wc;

import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.D;
import Kc.EnumC0934f;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.J;
import Kc.Y;
import Kc.d0;
import Kc.f0;
import Kc.g0;
import Kc.h0;
import Kc.n0;
import Mc.AbstractC0981g;
import Sc.B;
import Sc.s;
import Zc.x;
import Zc.y;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import md.C3694u;
import nc.AbstractC3728a;
import od.AbstractC3778c;
import ud.r;
import yd.AbstractC5197E;
import yd.AbstractC5200b;
import yd.C5198F;
import yd.a0;
import yd.e0;
import yd.k0;
import yd.p0;
import yd.u0;

/* loaded from: classes3.dex */
public final class f extends AbstractC0981g implements Uc.c {

    /* renamed from: y, reason: collision with root package name */
    public static final a f11455y = new a(null);

    /* renamed from: z, reason: collision with root package name */
    private static final Set f11456z = O.h("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* renamed from: i, reason: collision with root package name */
    private final Vc.g f11457i;

    /* renamed from: j, reason: collision with root package name */
    private final Zc.g f11458j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC0933e f11459k;

    /* renamed from: l, reason: collision with root package name */
    private final Vc.g f11460l;

    /* renamed from: m, reason: collision with root package name */
    private final Lazy f11461m;

    /* renamed from: n, reason: collision with root package name */
    private final EnumC0934f f11462n;

    /* renamed from: o, reason: collision with root package name */
    private final D f11463o;

    /* renamed from: p, reason: collision with root package name */
    private final n0 f11464p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f11465q;

    /* renamed from: r, reason: collision with root package name */
    private final b f11466r;

    /* renamed from: s, reason: collision with root package name */
    private final g f11467s;

    /* renamed from: t, reason: collision with root package name */
    private final Y f11468t;

    /* renamed from: u, reason: collision with root package name */
    private final rd.f f11469u;

    /* renamed from: v, reason: collision with root package name */
    private final l f11470v;

    /* renamed from: w, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f11471w;

    /* renamed from: x, reason: collision with root package name */
    private final xd.i f11472x;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b extends AbstractC5200b {

        /* renamed from: d, reason: collision with root package name */
        private final xd.i f11473d;

        static final class a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f11475a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.f11475a = fVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return g0.d(this.f11475a);
            }
        }

        public b() {
            super(f.this.f11460l.e());
            this.f11473d = f.this.f11460l.e().d(new a(f.this));
        }

        private final AbstractC5197E x() {
            id.c cVar;
            ArrayList arrayList;
            id.c y10 = y();
            if (y10 == null || y10.d() || !y10.i(Hc.j.f3890x)) {
                y10 = null;
            }
            if (y10 == null) {
                cVar = Sc.m.f9042a.b(AbstractC3778c.l(f.this));
                if (cVar == null) {
                    return null;
                }
            } else {
                cVar = y10;
            }
            InterfaceC0933e w10 = AbstractC3778c.w(f.this.f11460l.d(), cVar, Rc.d.FROM_JAVA_LOADER);
            if (w10 == null) {
                return null;
            }
            int size = w10.r().c().size();
            List c10 = f.this.r().c();
            Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
            int size2 = c10.size();
            if (size2 == size) {
                List list = c10;
                arrayList = new ArrayList(CollectionsKt.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new k0(u0.INVARIANT, ((f0) it.next()).y()));
                }
            } else {
                if (size2 != 1 || size <= 1 || y10 != null) {
                    return null;
                }
                k0 k0Var = new k0(u0.INVARIANT, ((f0) CollectionsKt.A0(c10)).y());
                IntRange intRange = new IntRange(1, size);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.u(intRange, 10));
                Iterator it2 = intRange.iterator();
                while (it2.hasNext()) {
                    ((kotlin.collections.D) it2).a();
                    arrayList2.add(k0Var);
                }
                arrayList = arrayList2;
            }
            return C5198F.g(a0.f45478b.i(), w10, arrayList);
        }

        private final id.c y() {
            String str;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i10 = f.this.i();
            id.c PURELY_IMPLEMENTS_ANNOTATION = B.f8960r;
            Intrinsics.checkNotNullExpressionValue(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c p10 = i10.p(PURELY_IMPLEMENTS_ANNOTATION);
            if (p10 == null) {
                return null;
            }
            Object B02 = CollectionsKt.B0(p10.a().values());
            C3694u c3694u = B02 instanceof C3694u ? (C3694u) B02 : null;
            if (c3694u == null || (str = (String) c3694u.b()) == null || !id.e.e(str)) {
                return null;
            }
            return new id.c(str);
        }

        @Override // yd.e0
        public List c() {
            return (List) this.f11473d.invoke();
        }

        @Override // yd.e0
        public boolean e() {
            return true;
        }

        @Override // yd.AbstractC5204f
        protected Collection l() {
            Collection a10 = f.this.Y0().a();
            ArrayList arrayList = new ArrayList(a10.size());
            ArrayList<x> arrayList2 = new ArrayList(0);
            AbstractC5197E x10 = x();
            Iterator it = a10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Zc.j jVar = (Zc.j) it.next();
                AbstractC5197E h10 = f.this.f11460l.a().r().h(f.this.f11460l.g().o(jVar, Xc.b.b(p0.SUPERTYPE, false, false, null, 7, null)), f.this.f11460l);
                if (h10.W0().d() instanceof J.b) {
                    arrayList2.add(jVar);
                }
                if (!Intrinsics.b(h10.W0(), x10 != null ? x10.W0() : null) && !Hc.g.b0(h10)) {
                    arrayList.add(h10);
                }
            }
            InterfaceC0933e interfaceC0933e = f.this.f11459k;
            Gd.a.a(arrayList, interfaceC0933e != null ? Jc.m.a(interfaceC0933e, f.this).c().p(interfaceC0933e.y(), u0.INVARIANT) : null);
            Gd.a.a(arrayList, x10);
            if (!arrayList2.isEmpty()) {
                r c10 = f.this.f11460l.a().c();
                InterfaceC0933e d10 = d();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.u(arrayList2, 10));
                for (x xVar : arrayList2) {
                    Intrinsics.e(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((Zc.j) xVar).v());
                }
                c10.b(d10, arrayList3);
            }
            return !arrayList.isEmpty() ? CollectionsKt.O0(arrayList) : CollectionsKt.e(f.this.f11460l.d().v().i());
        }

        @Override // yd.AbstractC5204f
        protected d0 p() {
            return f.this.f11460l.a().v();
        }

        public String toString() {
            String c10 = f.this.getName().c();
            Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
            return c10;
        }

        @Override // yd.AbstractC5210l, yd.e0
        /* renamed from: w */
        public InterfaceC0933e d() {
            return f.this;
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List<y> n10 = f.this.Y0().n();
            f fVar = f.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(n10, 10));
            for (y yVar : n10) {
                f0 a10 = fVar.f11460l.f().a(yVar);
                if (a10 == null) {
                    throw new AssertionError("Parameter " + yVar + " surely belongs to class " + fVar.Y0() + ", so it must be resolved");
                }
                arrayList.add(a10);
            }
            return arrayList;
        }
    }

    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC3728a.a(AbstractC3778c.l((InterfaceC0933e) obj).b(), AbstractC3778c.l((InterfaceC0933e) obj2).b());
        }
    }

    static final class e extends xc.m implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            C3367b k10 = AbstractC3778c.k(f.this);
            if (k10 != null) {
                return f.this.a1().a().f().a(k10);
            }
            return null;
        }
    }

    /* renamed from: Wc.f$f, reason: collision with other inner class name */
    static final class C0214f extends xc.m implements Function1 {
        C0214f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke(kotlin.reflect.jvm.internal.impl.types.checker.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Vc.g gVar = f.this.f11460l;
            f fVar = f.this;
            return new g(gVar, fVar, fVar.Y0(), f.this.f11459k != null, f.this.f11467s);
        }
    }

    public /* synthetic */ f(Vc.g gVar, InterfaceC0941m interfaceC0941m, Zc.g gVar2, InterfaceC0933e interfaceC0933e, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, interfaceC0941m, gVar2, (i10 & 8) != 0 ? null : interfaceC0933e);
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0937i
    public List B() {
        return (List) this.f11472x.invoke();
    }

    @Override // Kc.InterfaceC0933e
    public boolean F() {
        return false;
    }

    @Override // Mc.AbstractC0975a, Kc.InterfaceC0933e
    public rd.h G0() {
        return this.f11469u;
    }

    @Override // Kc.InterfaceC0933e
    public h0 H0() {
        return null;
    }

    @Override // Kc.InterfaceC0933e
    public boolean J() {
        return false;
    }

    @Override // Kc.C
    public boolean M0() {
        return false;
    }

    @Override // Kc.InterfaceC0933e
    public Collection P() {
        if (this.f11463o != D.SEALED) {
            return CollectionsKt.j();
        }
        Xc.a b10 = Xc.b.b(p0.COMMON, false, false, null, 7, null);
        Collection U10 = this.f11458j.U();
        ArrayList arrayList = new ArrayList();
        Iterator it = U10.iterator();
        while (it.hasNext()) {
            InterfaceC0936h d10 = this.f11460l.g().o((Zc.j) it.next(), b10).W0().d();
            InterfaceC0933e interfaceC0933e = d10 instanceof InterfaceC0933e ? (InterfaceC0933e) d10 : null;
            if (interfaceC0933e != null) {
                arrayList.add(interfaceC0933e);
            }
        }
        return CollectionsKt.F0(arrayList, new d());
    }

    @Override // Kc.InterfaceC0933e
    public boolean Q() {
        return false;
    }

    @Override // Kc.C
    public boolean R() {
        return false;
    }

    @Override // Kc.InterfaceC0933e
    public boolean R0() {
        return false;
    }

    @Override // Kc.InterfaceC0937i
    public boolean S() {
        return this.f11465q;
    }

    @Override // Kc.InterfaceC0933e
    public InterfaceC0932d W() {
        return null;
    }

    public final f W0(Tc.g javaResolverCache, InterfaceC0933e interfaceC0933e) {
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        Vc.g gVar = this.f11460l;
        Vc.g i10 = Vc.a.i(gVar, gVar.a().x(javaResolverCache));
        InterfaceC0941m b10 = b();
        Intrinsics.checkNotNullExpressionValue(b10, "getContainingDeclaration(...)");
        return new f(i10, b10, this.f11458j, interfaceC0933e);
    }

    @Override // Kc.InterfaceC0933e
    public rd.h X() {
        return this.f11470v;
    }

    @Override // Kc.InterfaceC0933e
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public List k() {
        return (List) this.f11467s.x0().invoke();
    }

    public final Zc.g Y0() {
        return this.f11458j;
    }

    @Override // Kc.InterfaceC0933e
    public InterfaceC0933e Z() {
        return null;
    }

    public final List Z0() {
        return (List) this.f11461m.getValue();
    }

    public final Vc.g a1() {
        return this.f11457i;
    }

    @Override // Mc.AbstractC0975a, Kc.InterfaceC0933e
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public g L0() {
        rd.h L02 = super.L0();
        Intrinsics.e(L02, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (g) L02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mc.t
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public g N(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (g) this.f11468t.c(kotlinTypeRefiner);
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0945q, Kc.C
    public AbstractC0948u h() {
        if (!Intrinsics.b(this.f11464p, AbstractC0947t.f5585a) || this.f11458j.q() != null) {
            return Sc.J.d(this.f11464p);
        }
        AbstractC0948u abstractC0948u = s.f9052a;
        Intrinsics.d(abstractC0948u);
        return abstractC0948u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i() {
        return this.f11471w;
    }

    @Override // Kc.InterfaceC0933e
    public EnumC0934f o() {
        return this.f11462n;
    }

    @Override // Kc.InterfaceC0933e
    public boolean p() {
        return false;
    }

    @Override // Kc.InterfaceC0936h
    public e0 r() {
        return this.f11466r;
    }

    @Override // Kc.InterfaceC0933e, Kc.C
    public D s() {
        return this.f11463o;
    }

    public String toString() {
        return "Lazy Java class " + AbstractC3778c.m(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Vc.g outerContext, InterfaceC0941m containingDeclaration, Zc.g jClass, InterfaceC0933e interfaceC0933e) {
        super(outerContext.e(), containingDeclaration, jClass.getName(), outerContext.a().t().a(jClass), false);
        D d10;
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f11457i = outerContext;
        this.f11458j = jClass;
        this.f11459k = interfaceC0933e;
        Vc.g d11 = Vc.a.d(outerContext, this, jClass, 0, 4, null);
        this.f11460l = d11;
        d11.a().h().a(jClass, this);
        jClass.P();
        this.f11461m = lc.i.a(new e());
        this.f11462n = jClass.x() ? EnumC0934f.ANNOTATION_CLASS : jClass.N() ? EnumC0934f.INTERFACE : jClass.G() ? EnumC0934f.ENUM_CLASS : EnumC0934f.CLASS;
        if (jClass.x() || jClass.G()) {
            d10 = D.FINAL;
        } else {
            d10 = D.Companion.a(jClass.K(), jClass.K() || jClass.O() || jClass.N(), !jClass.u());
        }
        this.f11463o = d10;
        this.f11464p = jClass.h();
        this.f11465q = (jClass.q() == null || jClass.o()) ? false : true;
        this.f11466r = new b();
        g gVar = new g(d11, this, jClass, interfaceC0933e != null, null, 16, null);
        this.f11467s = gVar;
        this.f11468t = Y.f5551e.a(this, d11.e(), d11.a().k().d(), new C0214f());
        this.f11469u = new rd.f(gVar);
        this.f11470v = new l(d11, jClass, this);
        this.f11471w = Vc.e.a(d11, jClass);
        this.f11472x = d11.e().d(new c());
    }
}
