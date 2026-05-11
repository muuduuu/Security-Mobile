package wd;

import Kc.AbstractC0948u;
import Kc.C0949v;
import Kc.C0953z;
import Kc.D;
import Kc.EnumC0934f;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.J;
import Kc.U;
import Kc.Y;
import Kc.Z;
import Kc.a0;
import Kc.d0;
import Kc.g0;
import Kc.h0;
import Kc.j0;
import Mc.AbstractC0975a;
import Mc.C0980f;
import Mc.C0988n;
import Mc.F;
import Mc.p;
import dd.C3026c;
import dd.C3027d;
import dd.C3030g;
import dd.C3032i;
import dd.C3037n;
import dd.C3040q;
import dd.C3043t;
import dd.EnumC3034k;
import dd.w;
import dd.x;
import fd.AbstractC3165a;
import fd.h;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kd.AbstractC3565e;
import kd.C3561a;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.collections.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import org.conscrypt.BuildConfig;
import rd.h;
import rd.k;
import sd.C4514b;
import ud.AbstractC4882A;
import ud.B;
import ud.C;
import ud.E;
import ud.r;
import ud.y;
import xc.AbstractC5156i;
import xc.C5142C;
import yd.AbstractC5197E;
import yd.AbstractC5200b;
import yd.M;
import yd.e0;

/* renamed from: wd.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5072d extends AbstractC0975a implements InterfaceC0941m {

    /* renamed from: f, reason: collision with root package name */
    private final C3026c f44454f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC3165a f44455g;

    /* renamed from: h, reason: collision with root package name */
    private final a0 f44456h;

    /* renamed from: i, reason: collision with root package name */
    private final C3367b f44457i;

    /* renamed from: j, reason: collision with root package name */
    private final D f44458j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC0948u f44459k;

    /* renamed from: l, reason: collision with root package name */
    private final EnumC0934f f44460l;

    /* renamed from: m, reason: collision with root package name */
    private final ud.m f44461m;

    /* renamed from: n, reason: collision with root package name */
    private final rd.i f44462n;

    /* renamed from: o, reason: collision with root package name */
    private final b f44463o;

    /* renamed from: p, reason: collision with root package name */
    private final Y f44464p;

    /* renamed from: q, reason: collision with root package name */
    private final c f44465q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC0941m f44466r;

    /* renamed from: s, reason: collision with root package name */
    private final xd.j f44467s;

    /* renamed from: t, reason: collision with root package name */
    private final xd.i f44468t;

    /* renamed from: u, reason: collision with root package name */
    private final xd.j f44469u;

    /* renamed from: v, reason: collision with root package name */
    private final xd.i f44470v;

    /* renamed from: w, reason: collision with root package name */
    private final xd.j f44471w;

    /* renamed from: x, reason: collision with root package name */
    private final AbstractC4882A.a f44472x;

    /* renamed from: y, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f44473y;

    /* renamed from: wd.d$a */
    private final class a extends AbstractC5076h {

        /* renamed from: g, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.types.checker.g f44474g;

        /* renamed from: h, reason: collision with root package name */
        private final xd.i f44475h;

        /* renamed from: i, reason: collision with root package name */
        private final xd.i f44476i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C5072d f44477j;

        /* renamed from: wd.d$a$a, reason: collision with other inner class name */
        static final class C0642a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f44478a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0642a(List list) {
                super(0);
                this.f44478a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f44478a;
            }
        }

        /* renamed from: wd.d$a$b */
        static final class b extends xc.m implements Function0 {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection invoke() {
                return a.this.j(rd.d.f40618o, rd.h.f40643a.a(), Rc.d.WHEN_GET_ALL_DESCRIPTORS);
            }
        }

        /* renamed from: wd.d$a$c */
        public static final class c extends kd.j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f44480a;

            c(List list) {
                this.f44480a = list;
            }

            @Override // kd.k
            public void a(InterfaceC0930b fakeOverride) {
                Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
                kd.l.K(fakeOverride, null);
                this.f44480a.add(fakeOverride);
            }

            @Override // kd.j
            protected void e(InterfaceC0930b fromSuper, InterfaceC0930b fromCurrent) {
                Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
                Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
                if (fromCurrent instanceof p) {
                    ((p) fromCurrent).d1(C0949v.f5602a, fromSuper);
                }
            }
        }

        /* renamed from: wd.d$a$d, reason: collision with other inner class name */
        static final class C0643d extends xc.m implements Function0 {
            C0643d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection invoke() {
                return a.this.f44474g.g(a.this.B());
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(C5072d c5072d, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            super(r2, r3, r4, r5, new C0642a(r1));
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f44477j = c5072d;
            ud.m i12 = c5072d.i1();
            List F02 = c5072d.j1().F0();
            Intrinsics.checkNotNullExpressionValue(F02, "getFunctionList(...)");
            List T02 = c5072d.j1().T0();
            Intrinsics.checkNotNullExpressionValue(T02, "getPropertyList(...)");
            List b12 = c5072d.j1().b1();
            Intrinsics.checkNotNullExpressionValue(b12, "getTypeAliasList(...)");
            List Q02 = c5072d.j1().Q0();
            Intrinsics.checkNotNullExpressionValue(Q02, "getNestedClassNameList(...)");
            List list = Q02;
            fd.c g10 = c5072d.i1().g();
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(y.b(g10, ((Number) it.next()).intValue()));
            }
            this.f44474g = kotlinTypeRefiner;
            this.f44475h = p().h().d(new b());
            this.f44476i = p().h().d(new C0643d());
        }

        private final void A(id.f fVar, Collection collection, List list) {
            p().c().n().a().v(fVar, collection, new ArrayList(list), B(), new c(list));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C5072d B() {
            return this.f44477j;
        }

        public void C(id.f name, Rc.b location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            Qc.a.a(p().c().p(), location, B(), name);
        }

        @Override // wd.AbstractC5076h, rd.i, rd.h
        public Collection a(id.f name, Rc.b location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            C(name, location);
            return super.a(name, location);
        }

        @Override // wd.AbstractC5076h, rd.i, rd.h
        public Collection c(id.f name, Rc.b location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            C(name, location);
            return super.c(name, location);
        }

        @Override // wd.AbstractC5076h, rd.i, rd.k
        public InterfaceC0936h f(id.f name, Rc.b location) {
            InterfaceC0933e f10;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            C(name, location);
            c cVar = B().f44465q;
            return (cVar == null || (f10 = cVar.f(name)) == null) ? super.f(name, location) : f10;
        }

        @Override // rd.i, rd.k
        public Collection g(rd.d kindFilter, Function1 nameFilter) {
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            return (Collection) this.f44475h.invoke();
        }

        @Override // wd.AbstractC5076h
        protected void i(Collection result, Function1 nameFilter) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            c cVar = B().f44465q;
            List d10 = cVar != null ? cVar.d() : null;
            if (d10 == null) {
                d10 = CollectionsKt.j();
            }
            result.addAll(d10);
        }

        @Override // wd.AbstractC5076h
        protected void k(id.f name, List functions) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(functions, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) this.f44476i.invoke()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((AbstractC5197E) it.next()).w().a(name, Rc.d.FOR_ALREADY_TRACKED));
            }
            functions.addAll(p().c().c().c(name, this.f44477j));
            A(name, arrayList, functions);
        }

        @Override // wd.AbstractC5076h
        protected void l(id.f name, List descriptors) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) this.f44476i.invoke()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((AbstractC5197E) it.next()).w().c(name, Rc.d.FOR_ALREADY_TRACKED));
            }
            A(name, arrayList, descriptors);
        }

        @Override // wd.AbstractC5076h
        protected C3367b m(id.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            C3367b d10 = this.f44477j.f44457i.d(name);
            Intrinsics.checkNotNullExpressionValue(d10, "createNestedClassId(...)");
            return d10;
        }

        @Override // wd.AbstractC5076h
        protected Set s() {
            List a10 = B().f44463o.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = a10.iterator();
            while (it.hasNext()) {
                Set e10 = ((AbstractC5197E) it.next()).w().e();
                if (e10 == null) {
                    return null;
                }
                CollectionsKt.z(linkedHashSet, e10);
            }
            return linkedHashSet;
        }

        @Override // wd.AbstractC5076h
        protected Set t() {
            List a10 = B().f44463o.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = a10.iterator();
            while (it.hasNext()) {
                CollectionsKt.z(linkedHashSet, ((AbstractC5197E) it.next()).w().b());
            }
            linkedHashSet.addAll(p().c().c().e(this.f44477j));
            return linkedHashSet;
        }

        @Override // wd.AbstractC5076h
        protected Set u() {
            List a10 = B().f44463o.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = a10.iterator();
            while (it.hasNext()) {
                CollectionsKt.z(linkedHashSet, ((AbstractC5197E) it.next()).w().d());
            }
            return linkedHashSet;
        }

        @Override // wd.AbstractC5076h
        protected boolean x(Z function) {
            Intrinsics.checkNotNullParameter(function, "function");
            return p().c().t().a(this.f44477j, function);
        }
    }

    /* renamed from: wd.d$b */
    private final class b extends AbstractC5200b {

        /* renamed from: d, reason: collision with root package name */
        private final xd.i f44482d;

        /* renamed from: wd.d$b$a */
        static final class a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5072d f44484a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5072d c5072d) {
                super(0);
                this.f44484a = c5072d;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return g0.d(this.f44484a);
            }
        }

        public b() {
            super(C5072d.this.i1().h());
            this.f44482d = C5072d.this.i1().h().d(new a(C5072d.this));
        }

        @Override // yd.e0
        public List c() {
            return (List) this.f44482d.invoke();
        }

        @Override // yd.e0
        public boolean e() {
            return true;
        }

        @Override // yd.AbstractC5204f
        protected Collection l() {
            String c10;
            id.c b10;
            List o10 = fd.f.o(C5072d.this.j1(), C5072d.this.i1().j());
            C5072d c5072d = C5072d.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(o10, 10));
            Iterator it = o10.iterator();
            while (it.hasNext()) {
                arrayList.add(c5072d.i1().i().q((C3040q) it.next()));
            }
            List w02 = CollectionsKt.w0(arrayList, C5072d.this.i1().c().c().d(C5072d.this));
            ArrayList<J.b> arrayList2 = new ArrayList();
            Iterator it2 = w02.iterator();
            while (it2.hasNext()) {
                InterfaceC0936h d10 = ((AbstractC5197E) it2.next()).W0().d();
                J.b bVar = d10 instanceof J.b ? (J.b) d10 : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                r j10 = C5072d.this.i1().c().j();
                C5072d c5072d2 = C5072d.this;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.u(arrayList2, 10));
                for (J.b bVar2 : arrayList2) {
                    C3367b k10 = AbstractC3778c.k(bVar2);
                    if (k10 == null || (b10 = k10.b()) == null || (c10 = b10.b()) == null) {
                        c10 = bVar2.getName().c();
                    }
                    arrayList3.add(c10);
                }
                j10.b(c5072d2, arrayList3);
            }
            return CollectionsKt.O0(w02);
        }

        @Override // yd.AbstractC5204f
        protected d0 p() {
            return d0.a.f5565a;
        }

        public String toString() {
            String fVar = C5072d.this.getName().toString();
            Intrinsics.checkNotNullExpressionValue(fVar, "toString(...)");
            return fVar;
        }

        @Override // yd.AbstractC5200b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public C5072d d() {
            return C5072d.this;
        }
    }

    /* renamed from: wd.d$c */
    private final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Map f44485a;

        /* renamed from: b, reason: collision with root package name */
        private final xd.h f44486b;

        /* renamed from: c, reason: collision with root package name */
        private final xd.i f44487c;

        /* renamed from: wd.d$c$a */
        static final class a extends xc.m implements Function1 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5072d f44490b;

            /* renamed from: wd.d$c$a$a, reason: collision with other inner class name */
            static final class C0644a extends xc.m implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C5072d f44491a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3030g f44492b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0644a(C5072d c5072d, C3030g c3030g) {
                    super(0);
                    this.f44491a = c5072d;
                    this.f44492b = c3030g;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final List invoke() {
                    return CollectionsKt.O0(this.f44491a.i1().c().d().j(this.f44491a.n1(), this.f44492b));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5072d c5072d) {
                super(1);
                this.f44490b = c5072d;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC0933e invoke(id.f name) {
                Intrinsics.checkNotNullParameter(name, "name");
                C3030g c3030g = (C3030g) c.this.f44485a.get(name);
                if (c3030g == null) {
                    return null;
                }
                C5072d c5072d = this.f44490b;
                return C0988n.U0(c5072d.i1().h(), c5072d, name, c.this.f44487c, new C5069a(c5072d.i1().h(), new C0644a(c5072d, c3030g)), a0.f5560a);
            }
        }

        /* renamed from: wd.d$c$b */
        static final class b extends xc.m implements Function0 {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set invoke() {
                return c.this.e();
            }
        }

        public c() {
            List A02 = C5072d.this.j1().A0();
            Intrinsics.checkNotNullExpressionValue(A02, "getEnumEntryList(...)");
            List list = A02;
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(G.d(CollectionsKt.u(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(y.b(C5072d.this.i1().g(), ((C3030g) obj).C()), obj);
            }
            this.f44485a = linkedHashMap;
            this.f44486b = C5072d.this.i1().h().i(new a(C5072d.this));
            this.f44487c = C5072d.this.i1().h().d(new b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set e() {
            HashSet hashSet = new HashSet();
            Iterator it = C5072d.this.r().a().iterator();
            while (it.hasNext()) {
                for (InterfaceC0941m interfaceC0941m : k.a.a(((AbstractC5197E) it.next()).w(), null, null, 3, null)) {
                    if ((interfaceC0941m instanceof Z) || (interfaceC0941m instanceof U)) {
                        hashSet.add(interfaceC0941m.getName());
                    }
                }
            }
            List F02 = C5072d.this.j1().F0();
            Intrinsics.checkNotNullExpressionValue(F02, "getFunctionList(...)");
            C5072d c5072d = C5072d.this;
            Iterator it2 = F02.iterator();
            while (it2.hasNext()) {
                hashSet.add(y.b(c5072d.i1().g(), ((C3032i) it2.next()).a0()));
            }
            List T02 = C5072d.this.j1().T0();
            Intrinsics.checkNotNullExpressionValue(T02, "getPropertyList(...)");
            C5072d c5072d2 = C5072d.this;
            Iterator it3 = T02.iterator();
            while (it3.hasNext()) {
                hashSet.add(y.b(c5072d2.i1().g(), ((C3037n) it3.next()).Z()));
            }
            return O.k(hashSet, hashSet);
        }

        public final Collection d() {
            Set keySet = this.f44485a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                InterfaceC0933e f10 = f((id.f) it.next());
                if (f10 != null) {
                    arrayList.add(f10);
                }
            }
            return arrayList;
        }

        public final InterfaceC0933e f(id.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return (InterfaceC0933e) this.f44486b.invoke(name);
        }
    }

    /* renamed from: wd.d$d, reason: collision with other inner class name */
    static final class C0645d extends xc.m implements Function0 {
        C0645d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return CollectionsKt.O0(C5072d.this.i1().c().d().f(C5072d.this.n1()));
        }
    }

    /* renamed from: wd.d$e */
    static final class e extends xc.m implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0933e invoke() {
            return C5072d.this.c1();
        }
    }

    /* renamed from: wd.d$f */
    /* synthetic */ class f extends AbstractC5156i implements Function1 {
        f(Object obj) {
            super(1, obj);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(Intrinsics.a.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final M invoke(C3040q p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return E.n((E) this.f44980b, p02, false, 2, null);
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "simpleType";
        }
    }

    /* renamed from: wd.d$g */
    /* synthetic */ class g extends AbstractC5156i implements Function1 {
        g(Object obj) {
            super(1, obj);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(C5072d.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final M invoke(id.f p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return ((C5072d) this.f44980b).o1(p02);
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "getValueClassPropertyType";
        }
    }

    /* renamed from: wd.d$h */
    static final class h extends xc.m implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke() {
            return C5072d.this.d1();
        }
    }

    /* renamed from: wd.d$i */
    /* synthetic */ class i extends AbstractC5156i implements Function1 {
        i(Object obj) {
            super(1, obj);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(a.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final a invoke(kotlin.reflect.jvm.internal.impl.types.checker.g p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return new a((C5072d) this.f44980b, p02);
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "<init>";
        }
    }

    /* renamed from: wd.d$j */
    static final class j extends xc.m implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0932d invoke() {
            return C5072d.this.e1();
        }
    }

    /* renamed from: wd.d$k */
    static final class k extends xc.m implements Function0 {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke() {
            return C5072d.this.g1();
        }
    }

    /* renamed from: wd.d$l */
    static final class l extends xc.m implements Function0 {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return C5072d.this.h1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5072d(ud.m outerContext, C3026c classProto, fd.c nameResolver, AbstractC3165a metadataVersion, a0 sourceElement) {
        super(outerContext.h(), y.a(nameResolver, classProto.C0()).j());
        rd.i iVar;
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f44454f = classProto;
        this.f44455g = metadataVersion;
        this.f44456h = sourceElement;
        this.f44457i = y.a(nameResolver, classProto.C0());
        B b10 = B.f43625a;
        this.f44458j = b10.b((EnumC3034k) fd.b.f33014e.d(classProto.B0()));
        this.f44459k = C.a(b10, (x) fd.b.f33013d.d(classProto.B0()));
        EnumC0934f a10 = b10.a((C3026c.EnumC0459c) fd.b.f33015f.d(classProto.B0()));
        this.f44460l = a10;
        List e12 = classProto.e1();
        Intrinsics.checkNotNullExpressionValue(e12, "getTypeParameterList(...)");
        C3043t f12 = classProto.f1();
        Intrinsics.checkNotNullExpressionValue(f12, "getTypeTable(...)");
        fd.g gVar = new fd.g(f12);
        h.a aVar = fd.h.f33043b;
        w h12 = classProto.h1();
        Intrinsics.checkNotNullExpressionValue(h12, "getVersionRequirementTable(...)");
        ud.m a11 = outerContext.a(this, e12, nameResolver, gVar, aVar.a(h12), metadataVersion);
        this.f44461m = a11;
        EnumC0934f enumC0934f = EnumC0934f.ENUM_CLASS;
        if (a10 == enumC0934f) {
            Boolean d10 = fd.b.f33022m.d(classProto.B0());
            Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
            iVar = new rd.l(a11.h(), this, d10.booleanValue() || Intrinsics.b(a11.c().i().a(), Boolean.TRUE));
        } else {
            iVar = h.b.f40647b;
        }
        this.f44462n = iVar;
        this.f44463o = new b();
        this.f44464p = Y.f5551e.a(this, a11.h(), a11.c().n().d(), new i(this));
        this.f44465q = a10 == enumC0934f ? new c() : null;
        InterfaceC0941m e10 = outerContext.e();
        this.f44466r = e10;
        this.f44467s = a11.h().f(new j());
        this.f44468t = a11.h().d(new h());
        this.f44469u = a11.h().f(new e());
        this.f44470v = a11.h().d(new k());
        this.f44471w = a11.h().f(new l());
        fd.c g10 = a11.g();
        fd.g j10 = a11.j();
        C5072d c5072d = e10 instanceof C5072d ? (C5072d) e10 : null;
        this.f44472x = new AbstractC4882A.a(classProto, g10, j10, sourceElement, c5072d != null ? c5072d.f44472x : null);
        this.f44473y = !fd.b.f33012c.d(classProto.B0()).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b() : new C5082n(a11.h(), new C0645d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0933e c1() {
        if (!this.f44454f.i1()) {
            return null;
        }
        InterfaceC0936h f10 = k1().f(y.b(this.f44461m.g(), this.f44454f.n0()), Rc.d.FROM_DESERIALIZATION);
        if (f10 instanceof InterfaceC0933e) {
            return (InterfaceC0933e) f10;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection d1() {
        return CollectionsKt.w0(CollectionsKt.w0(f1(), CollectionsKt.n(W())), this.f44461m.c().c().b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0932d e1() {
        Object obj;
        if (this.f44460l.isSingleton()) {
            C0980f l10 = AbstractC3565e.l(this, a0.f5560a);
            l10.p1(y());
            return l10;
        }
        List q02 = this.f44454f.q0();
        Intrinsics.checkNotNullExpressionValue(q02, "getConstructorList(...)");
        Iterator it = q02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!fd.b.f33023n.d(((C3027d) obj).G()).booleanValue()) {
                break;
            }
        }
        C3027d c3027d = (C3027d) obj;
        if (c3027d != null) {
            return this.f44461m.f().i(c3027d, true);
        }
        return null;
    }

    private final List f1() {
        List q02 = this.f44454f.q0();
        Intrinsics.checkNotNullExpressionValue(q02, "getConstructorList(...)");
        ArrayList<C3027d> arrayList = new ArrayList();
        for (Object obj : q02) {
            Boolean d10 = fd.b.f33023n.d(((C3027d) obj).G());
            Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
            if (d10.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
        for (C3027d c3027d : arrayList) {
            ud.x f10 = this.f44461m.f();
            Intrinsics.d(c3027d);
            arrayList2.add(f10.i(c3027d, false));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection g1() {
        if (this.f44458j != D.SEALED) {
            return CollectionsKt.j();
        }
        List<Integer> U02 = this.f44454f.U0();
        Intrinsics.d(U02);
        if (U02.isEmpty()) {
            return C3561a.f36281a.a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : U02) {
            ud.k c10 = this.f44461m.c();
            fd.c g10 = this.f44461m.g();
            Intrinsics.d(num);
            InterfaceC0933e b10 = c10.b(y.a(g10, num.intValue()));
            if (b10 != null) {
                arrayList.add(b10);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h0 h1() {
        if (!p() && !Q()) {
            return null;
        }
        h0 a10 = ud.G.a(this.f44454f, this.f44461m.g(), this.f44461m.j(), new f(this.f44461m.i()), new g(this));
        if (a10 != null) {
            return a10;
        }
        if (this.f44455g.c(1, 5, 1)) {
            return null;
        }
        InterfaceC0932d W10 = W();
        if (W10 == null) {
            throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
        }
        List m10 = W10.m();
        Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
        id.f name = ((j0) CollectionsKt.d0(m10)).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        M o12 = o1(name);
        if (o12 != null) {
            return new C0953z(name, o12);
        }
        throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
    }

    private final a k1() {
        return (a) this.f44464p.c(this.f44461m.c().n().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r1 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M o1(id.f fVar) {
        Iterator it = k1().c(fVar, Rc.d.FROM_DESERIALIZATION).iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((U) next).s0() == null) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj = next;
                }
            }
        }
        U u10 = (U) obj;
        return (M) (u10 != null ? u10.getType() : null);
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0937i
    public List B() {
        return this.f44461m.i().j();
    }

    @Override // Kc.InterfaceC0933e
    public boolean F() {
        return fd.b.f33015f.d(this.f44454f.B0()) == C3026c.EnumC0459c.COMPANION_OBJECT;
    }

    @Override // Kc.InterfaceC0933e
    public h0 H0() {
        return (h0) this.f44471w.invoke();
    }

    @Override // Kc.InterfaceC0933e
    public boolean J() {
        Boolean d10 = fd.b.f33021l.d(this.f44454f.B0());
        Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
        return d10.booleanValue();
    }

    @Override // Kc.C
    public boolean M0() {
        return false;
    }

    @Override // Mc.t
    protected rd.h N(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f44464p.c(kotlinTypeRefiner);
    }

    @Override // Kc.InterfaceC0933e
    public Collection P() {
        return (Collection) this.f44470v.invoke();
    }

    @Override // Mc.AbstractC0975a, Kc.InterfaceC0933e
    public List P0() {
        List b10 = fd.f.b(this.f44454f, this.f44461m.j());
        ArrayList arrayList = new ArrayList(CollectionsKt.u(b10, 10));
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            arrayList.add(new F(S0(), new C4514b(this, this.f44461m.i().q((C3040q) it.next()), null, null), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b()));
        }
        return arrayList;
    }

    @Override // Kc.InterfaceC0933e
    public boolean Q() {
        Boolean d10 = fd.b.f33020k.d(this.f44454f.B0());
        Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
        return d10.booleanValue() && this.f44455g.c(1, 4, 2);
    }

    @Override // Kc.C
    public boolean R() {
        Boolean d10 = fd.b.f33019j.d(this.f44454f.B0());
        Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
        return d10.booleanValue();
    }

    @Override // Kc.InterfaceC0933e
    public boolean R0() {
        Boolean d10 = fd.b.f33017h.d(this.f44454f.B0());
        Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
        return d10.booleanValue();
    }

    @Override // Kc.InterfaceC0937i
    public boolean S() {
        Boolean d10 = fd.b.f33016g.d(this.f44454f.B0());
        Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
        return d10.booleanValue();
    }

    @Override // Kc.InterfaceC0933e
    public InterfaceC0932d W() {
        return (InterfaceC0932d) this.f44467s.invoke();
    }

    @Override // Kc.InterfaceC0933e
    public InterfaceC0933e Z() {
        return (InterfaceC0933e) this.f44469u.invoke();
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0942n, Kc.InterfaceC0941m
    public InterfaceC0941m b() {
        return this.f44466r;
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0945q, Kc.C
    public AbstractC0948u h() {
        return this.f44459k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i() {
        return this.f44473y;
    }

    public final ud.m i1() {
        return this.f44461m;
    }

    @Override // Kc.InterfaceC0944p
    public a0 j() {
        return this.f44456h;
    }

    public final C3026c j1() {
        return this.f44454f;
    }

    @Override // Kc.InterfaceC0933e
    public Collection k() {
        return (Collection) this.f44468t.invoke();
    }

    public final AbstractC3165a l1() {
        return this.f44455g;
    }

    @Override // Kc.InterfaceC0933e
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public rd.i X() {
        return this.f44462n;
    }

    public final AbstractC4882A.a n1() {
        return this.f44472x;
    }

    @Override // Kc.InterfaceC0933e
    public EnumC0934f o() {
        return this.f44460l;
    }

    @Override // Kc.InterfaceC0933e
    public boolean p() {
        Boolean d10 = fd.b.f33020k.d(this.f44454f.B0());
        Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
        return d10.booleanValue() && this.f44455g.e(1, 4, 1);
    }

    public final boolean p1(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return k1().q().contains(name);
    }

    @Override // Kc.C
    public boolean q() {
        Boolean d10 = fd.b.f33018i.d(this.f44454f.B0());
        Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
        return d10.booleanValue();
    }

    @Override // Kc.InterfaceC0936h
    public e0 r() {
        return this.f44463o;
    }

    @Override // Kc.InterfaceC0933e, Kc.C
    public D s() {
        return this.f44458j;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deserialized ");
        sb2.append(R() ? "expect " : BuildConfig.FLAVOR);
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }
}
