package Wc;

import Kc.D;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.U;
import Kc.X;
import Kc.Z;
import Kc.f0;
import Kc.k0;
import Mc.C;
import Mc.L;
import Sc.J;
import Zc.B;
import Zc.r;
import Zc.x;
import bd.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kd.AbstractC3565e;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import md.AbstractC3680g;
import rd.c;
import xc.C5141B;
import xc.C5142C;
import xc.u;
import yd.AbstractC5197E;
import yd.p0;
import yd.q0;

/* loaded from: classes3.dex */
public abstract class j extends rd.i {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f11527m = {C5142C.k(new u(C5142C.b(j.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), C5142C.k(new u(C5142C.b(j.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), C5142C.k(new u(C5142C.b(j.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b, reason: collision with root package name */
    private final Vc.g f11528b;

    /* renamed from: c, reason: collision with root package name */
    private final j f11529c;

    /* renamed from: d, reason: collision with root package name */
    private final xd.i f11530d;

    /* renamed from: e, reason: collision with root package name */
    private final xd.i f11531e;

    /* renamed from: f, reason: collision with root package name */
    private final xd.g f11532f;

    /* renamed from: g, reason: collision with root package name */
    private final xd.h f11533g;

    /* renamed from: h, reason: collision with root package name */
    private final xd.g f11534h;

    /* renamed from: i, reason: collision with root package name */
    private final xd.i f11535i;

    /* renamed from: j, reason: collision with root package name */
    private final xd.i f11536j;

    /* renamed from: k, reason: collision with root package name */
    private final xd.i f11537k;

    /* renamed from: l, reason: collision with root package name */
    private final xd.g f11538l;

    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5197E f11539a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC5197E f11540b;

        /* renamed from: c, reason: collision with root package name */
        private final List f11541c;

        /* renamed from: d, reason: collision with root package name */
        private final List f11542d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f11543e;

        /* renamed from: f, reason: collision with root package name */
        private final List f11544f;

        public a(AbstractC5197E returnType, AbstractC5197E abstractC5197E, List valueParameters, List typeParameters, boolean z10, List errors) {
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
            Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.f11539a = returnType;
            this.f11540b = abstractC5197E;
            this.f11541c = valueParameters;
            this.f11542d = typeParameters;
            this.f11543e = z10;
            this.f11544f = errors;
        }

        public final List a() {
            return this.f11544f;
        }

        public final boolean b() {
            return this.f11543e;
        }

        public final AbstractC5197E c() {
            return this.f11540b;
        }

        public final AbstractC5197E d() {
            return this.f11539a;
        }

        public final List e() {
            return this.f11542d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f11539a, aVar.f11539a) && Intrinsics.b(this.f11540b, aVar.f11540b) && Intrinsics.b(this.f11541c, aVar.f11541c) && Intrinsics.b(this.f11542d, aVar.f11542d) && this.f11543e == aVar.f11543e && Intrinsics.b(this.f11544f, aVar.f11544f);
        }

        public final List f() {
            return this.f11541c;
        }

        public int hashCode() {
            int hashCode = this.f11539a.hashCode() * 31;
            AbstractC5197E abstractC5197E = this.f11540b;
            return ((((((((hashCode + (abstractC5197E == null ? 0 : abstractC5197E.hashCode())) * 31) + this.f11541c.hashCode()) * 31) + this.f11542d.hashCode()) * 31) + Boolean.hashCode(this.f11543e)) * 31) + this.f11544f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f11539a + ", receiverType=" + this.f11540b + ", valueParameters=" + this.f11541c + ", typeParameters=" + this.f11542d + ", hasStableParameterNames=" + this.f11543e + ", errors=" + this.f11544f + ')';
        }
    }

    protected static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List f11545a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f11546b;

        public b(List descriptors, boolean z10) {
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            this.f11545a = descriptors;
            this.f11546b = z10;
        }

        public final List a() {
            return this.f11545a;
        }

        public final boolean b() {
            return this.f11546b;
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke() {
            return j.this.m(rd.d.f40618o, rd.h.f40643a.a());
        }
    }

    static final class d extends xc.m implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            return j.this.l(rd.d.f40623t, null);
        }
    }

    static final class e extends xc.m implements Function1 {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U invoke(id.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (j.this.B() != null) {
                return (U) j.this.B().f11533g.invoke(name);
            }
            Zc.n c10 = ((Wc.b) j.this.y().invoke()).c(name);
            if (c10 == null || c10.M()) {
                return null;
            }
            return j.this.J(c10);
        }
    }

    static final class f extends xc.m implements Function1 {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(id.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (j.this.B() != null) {
                return (Collection) j.this.B().f11532f.invoke(name);
            }
            ArrayList arrayList = new ArrayList();
            for (r rVar : ((Wc.b) j.this.y().invoke()).b(name)) {
                Uc.e I10 = j.this.I(rVar);
                if (j.this.G(I10)) {
                    j.this.w().a().h().b(rVar, I10);
                    arrayList.add(I10);
                }
            }
            j.this.o(arrayList, name);
            return arrayList;
        }
    }

    static final class g extends xc.m implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Wc.b invoke() {
            return j.this.p();
        }
    }

    static final class h extends xc.m implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            return j.this.n(rd.d.f40625v, null);
        }
    }

    static final class i extends xc.m implements Function1 {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(id.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) j.this.f11532f.invoke(name));
            j.this.L(linkedHashSet);
            j.this.r(linkedHashSet, name);
            return CollectionsKt.O0(j.this.w().a().r().g(j.this.w(), linkedHashSet));
        }
    }

    /* renamed from: Wc.j$j, reason: collision with other inner class name */
    static final class C0217j extends xc.m implements Function1 {
        C0217j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(id.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            ArrayList arrayList = new ArrayList();
            Gd.a.a(arrayList, j.this.f11533g.invoke(name));
            j.this.s(name, arrayList);
            return kd.f.t(j.this.C()) ? CollectionsKt.O0(arrayList) : CollectionsKt.O0(j.this.w().a().r().g(j.this.w(), arrayList));
        }
    }

    static final class k extends xc.m implements Function0 {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            return j.this.t(rd.d.f40626w, null);
        }
    }

    static final class l extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Zc.n f11557b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5141B f11558c;

        static final class a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f11559a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Zc.n f11560b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C5141B f11561c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, Zc.n nVar, C5141B c5141b) {
                super(0);
                this.f11559a = jVar;
                this.f11560b = nVar;
                this.f11561c = c5141b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC3680g invoke() {
                return this.f11559a.w().a().g().a(this.f11560b, (U) this.f11561c.f44962a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Zc.n nVar, C5141B c5141b) {
            super(0);
            this.f11557b = nVar;
            this.f11558c = c5141b;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xd.j invoke() {
            return j.this.w().e().f(new a(j.this, this.f11557b, this.f11558c));
        }
    }

    static final class m extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final m f11562a = new m();

        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0929a invoke(Z selectMostSpecificInEachOverridableGroup) {
            Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    public /* synthetic */ j(Vc.g gVar, j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i10 & 2) != 0 ? null : jVar);
    }

    private final Set A() {
        return (Set) xd.m.a(this.f11535i, this, f11527m[0]);
    }

    private final Set D() {
        return (Set) xd.m.a(this.f11536j, this, f11527m[1]);
    }

    private final AbstractC5197E E(Zc.n nVar) {
        AbstractC5197E o10 = this.f11528b.g().o(nVar.getType(), Xc.b.b(p0.COMMON, false, false, null, 7, null));
        if ((!Hc.g.s0(o10) && !Hc.g.v0(o10)) || !F(nVar) || !nVar.V()) {
            return o10;
        }
        AbstractC5197E n10 = q0.n(o10);
        Intrinsics.checkNotNullExpressionValue(n10, "makeNotNullable(...)");
        return n10;
    }

    private final boolean F(Zc.n nVar) {
        return nVar.u() && nVar.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final U J(Zc.n nVar) {
        C5141B c5141b = new C5141B();
        C u10 = u(nVar);
        c5141b.f44962a = u10;
        u10.e1(null, null, null, null);
        ((C) c5141b.f44962a).k1(E(nVar), CollectionsKt.j(), z(), null, CollectionsKt.j());
        InterfaceC0941m C10 = C();
        InterfaceC0933e interfaceC0933e = C10 instanceof InterfaceC0933e ? (InterfaceC0933e) C10 : null;
        if (interfaceC0933e != null) {
            Vc.g gVar = this.f11528b;
            c5141b.f44962a = gVar.a().w().d(gVar, interfaceC0933e, (C) c5141b.f44962a);
        }
        Object obj = c5141b.f44962a;
        if (kd.f.K((k0) obj, ((C) obj).getType())) {
            ((C) c5141b.f44962a).U0(new l(nVar, c5141b));
        }
        this.f11528b.a().h().c(nVar, (U) c5141b.f44962a);
        return (U) c5141b.f44962a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String c10 = y.c((Z) obj, false, false, 2, null);
            Object obj2 = linkedHashMap.get(c10);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(c10, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection a10 = kd.n.a(list2, m.f11562a);
                set.removeAll(list2);
                set.addAll(a10);
            }
        }
    }

    private final C u(Zc.n nVar) {
        Uc.f o12 = Uc.f.o1(C(), Vc.e.a(this.f11528b, nVar), D.FINAL, J.d(nVar.h()), !nVar.u(), nVar.getName(), this.f11528b.a().t().a(nVar), F(nVar));
        Intrinsics.checkNotNullExpressionValue(o12, "create(...)");
        return o12;
    }

    private final Set x() {
        return (Set) xd.m.a(this.f11537k, this, f11527m[2]);
    }

    protected final j B() {
        return this.f11529c;
    }

    protected abstract InterfaceC0941m C();

    protected boolean G(Uc.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return true;
    }

    protected abstract a H(r rVar, List list, AbstractC5197E abstractC5197E, List list2);

    protected final Uc.e I(r method) {
        Intrinsics.checkNotNullParameter(method, "method");
        Uc.e y12 = Uc.e.y1(C(), Vc.e.a(this.f11528b, method), method.getName(), this.f11528b.a().t().a(method), ((Wc.b) this.f11531e.invoke()).e(method.getName()) != null && method.m().isEmpty());
        Intrinsics.checkNotNullExpressionValue(y12, "createJavaMethod(...)");
        Vc.g f10 = Vc.a.f(this.f11528b, y12, method, 0, 4, null);
        List n10 = method.n();
        List arrayList = new ArrayList(CollectionsKt.u(n10, 10));
        Iterator it = n10.iterator();
        while (it.hasNext()) {
            f0 a10 = f10.f().a((Zc.y) it.next());
            Intrinsics.d(a10);
            arrayList.add(a10);
        }
        b K10 = K(f10, y12, method.m());
        a H10 = H(method, arrayList, q(method, f10), K10.a());
        AbstractC5197E c10 = H10.c();
        y12.x1(c10 != null ? AbstractC3565e.i(y12, c10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b()) : null, z(), CollectionsKt.j(), H10.e(), H10.f(), H10.d(), D.Companion.a(false, method.O(), true ^ method.u()), J.d(method.h()), H10.c() != null ? G.e(t.a(Uc.e.f10420G, CollectionsKt.d0(K10.a()))) : G.h());
        y12.B1(H10.b(), K10.b());
        if (!H10.a().isEmpty()) {
            f10.a().s().a(y12, H10.a());
        }
        return y12;
    }

    protected final b K(Vc.g gVar, InterfaceC0952y function, List jValueParameters) {
        Pair a10;
        id.f name;
        Vc.g c10 = gVar;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(jValueParameters, "jValueParameters");
        Iterable<IndexedValue> U02 = CollectionsKt.U0(jValueParameters);
        ArrayList arrayList = new ArrayList(CollectionsKt.u(U02, 10));
        boolean z10 = false;
        for (IndexedValue indexedValue : U02) {
            int index = indexedValue.getIndex();
            B b10 = (B) indexedValue.getValue();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a11 = Vc.e.a(c10, b10);
            Xc.a b11 = Xc.b.b(p0.COMMON, false, false, null, 7, null);
            if (b10.b()) {
                x type = b10.getType();
                Zc.f fVar = type instanceof Zc.f ? (Zc.f) type : null;
                if (fVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + b10);
                }
                AbstractC5197E k10 = gVar.g().k(fVar, b11, true);
                a10 = t.a(k10, gVar.d().v().k(k10));
            } else {
                a10 = t.a(gVar.g().o(b10.getType(), b11), null);
            }
            AbstractC5197E abstractC5197E = (AbstractC5197E) a10.getFirst();
            AbstractC5197E abstractC5197E2 = (AbstractC5197E) a10.getSecond();
            if (Intrinsics.b(function.getName().c(), "equals") && jValueParameters.size() == 1 && Intrinsics.b(gVar.d().v().I(), abstractC5197E)) {
                name = id.f.o("other");
            } else {
                name = b10.getName();
                if (name == null) {
                    z10 = true;
                }
                if (name == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(index);
                    name = id.f.o(sb2.toString());
                    Intrinsics.checkNotNullExpressionValue(name, "identifier(...)");
                }
            }
            boolean z11 = z10;
            id.f fVar2 = name;
            Intrinsics.d(fVar2);
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new L(function, null, index, a11, fVar2, abstractC5197E, false, false, false, abstractC5197E2, gVar.a().t().a(b10)));
            arrayList = arrayList2;
            z10 = z11;
            c10 = gVar;
        }
        return new b(CollectionsKt.O0(arrayList), z10);
    }

    @Override // rd.i, rd.h
    public Collection a(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !b().contains(name) ? CollectionsKt.j() : (Collection) this.f11534h.invoke(name);
    }

    @Override // rd.i, rd.h
    public Set b() {
        return A();
    }

    @Override // rd.i, rd.h
    public Collection c(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !d().contains(name) ? CollectionsKt.j() : (Collection) this.f11538l.invoke(name);
    }

    @Override // rd.i, rd.h
    public Set d() {
        return D();
    }

    @Override // rd.i, rd.h
    public Set e() {
        return x();
    }

    @Override // rd.i, rd.k
    public Collection g(rd.d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return (Collection) this.f11530d.invoke();
    }

    protected abstract Set l(rd.d dVar, Function1 function1);

    protected final List m(rd.d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Rc.d dVar = Rc.d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.a(rd.d.f40606c.c())) {
            for (id.f fVar : l(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                    Gd.a.a(linkedHashSet, f(fVar, dVar));
                }
            }
        }
        if (kindFilter.a(rd.d.f40606c.d()) && !kindFilter.l().contains(c.a.f40603a)) {
            for (id.f fVar2 : n(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                    linkedHashSet.addAll(a(fVar2, dVar));
                }
            }
        }
        if (kindFilter.a(rd.d.f40606c.i()) && !kindFilter.l().contains(c.a.f40603a)) {
            for (id.f fVar3 : t(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar3)).booleanValue()) {
                    linkedHashSet.addAll(c(fVar3, dVar));
                }
            }
        }
        return CollectionsKt.O0(linkedHashSet);
    }

    protected abstract Set n(rd.d dVar, Function1 function1);

    protected void o(Collection result, id.f name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    protected abstract Wc.b p();

    protected final AbstractC5197E q(r method, Vc.g c10) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(c10, "c");
        return c10.g().o(method.g(), Xc.b.b(p0.COMMON, method.W().x(), false, null, 6, null));
    }

    protected abstract void r(Collection collection, id.f fVar);

    protected abstract void s(id.f fVar, Collection collection);

    protected abstract Set t(rd.d dVar, Function1 function1);

    public String toString() {
        return "Lazy scope for " + C();
    }

    protected final xd.i v() {
        return this.f11530d;
    }

    protected final Vc.g w() {
        return this.f11528b;
    }

    protected final xd.i y() {
        return this.f11531e;
    }

    protected abstract X z();

    public j(Vc.g c10, j jVar) {
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f11528b = c10;
        this.f11529c = jVar;
        this.f11530d = c10.e().c(new c(), CollectionsKt.j());
        this.f11531e = c10.e().d(new g());
        this.f11532f = c10.e().h(new f());
        this.f11533g = c10.e().i(new e());
        this.f11534h = c10.e().h(new i());
        this.f11535i = c10.e().d(new h());
        this.f11536j = c10.e().d(new k());
        this.f11537k = c10.e().d(new d());
        this.f11538l = c10.e().h(new C0217j());
    }
}
