package wd;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.U;
import Kc.Z;
import Kc.e0;
import dd.C3032i;
import dd.C3037n;
import dd.C3041r;
import id.C3367b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.collections.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.r;
import rd.d;
import ud.x;
import ud.y;
import xc.C5142C;
import xc.u;

/* renamed from: wd.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5076h extends rd.i {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f44500f = {C5142C.k(new u(C5142C.b(AbstractC5076h.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), C5142C.k(new u(C5142C.b(AbstractC5076h.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b, reason: collision with root package name */
    private final ud.m f44501b;

    /* renamed from: c, reason: collision with root package name */
    private final a f44502c;

    /* renamed from: d, reason: collision with root package name */
    private final xd.i f44503d;

    /* renamed from: e, reason: collision with root package name */
    private final xd.j f44504e;

    /* renamed from: wd.h$a */
    private interface a {
        Collection a(id.f fVar, Rc.b bVar);

        Set b();

        Collection c(id.f fVar, Rc.b bVar);

        Set d();

        e0 e(id.f fVar);

        void f(Collection collection, rd.d dVar, Function1 function1, Rc.b bVar);

        Set g();
    }

    /* renamed from: wd.h$b */
    private final class b implements a {

        /* renamed from: o, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.k[] f44505o = {C5142C.k(new u(C5142C.b(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), C5142C.k(new u(C5142C.b(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), C5142C.k(new u(C5142C.b(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), C5142C.k(new u(C5142C.b(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), C5142C.k(new u(C5142C.b(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), C5142C.k(new u(C5142C.b(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), C5142C.k(new u(C5142C.b(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), C5142C.k(new u(C5142C.b(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), C5142C.k(new u(C5142C.b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), C5142C.k(new u(C5142C.b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a, reason: collision with root package name */
        private final List f44506a;

        /* renamed from: b, reason: collision with root package name */
        private final List f44507b;

        /* renamed from: c, reason: collision with root package name */
        private final List f44508c;

        /* renamed from: d, reason: collision with root package name */
        private final xd.i f44509d;

        /* renamed from: e, reason: collision with root package name */
        private final xd.i f44510e;

        /* renamed from: f, reason: collision with root package name */
        private final xd.i f44511f;

        /* renamed from: g, reason: collision with root package name */
        private final xd.i f44512g;

        /* renamed from: h, reason: collision with root package name */
        private final xd.i f44513h;

        /* renamed from: i, reason: collision with root package name */
        private final xd.i f44514i;

        /* renamed from: j, reason: collision with root package name */
        private final xd.i f44515j;

        /* renamed from: k, reason: collision with root package name */
        private final xd.i f44516k;

        /* renamed from: l, reason: collision with root package name */
        private final xd.i f44517l;

        /* renamed from: m, reason: collision with root package name */
        private final xd.i f44518m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ AbstractC5076h f44519n;

        /* renamed from: wd.h$b$a */
        static final class a extends xc.m implements Function0 {
            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return CollectionsKt.w0(b.this.D(), b.this.t());
            }
        }

        /* renamed from: wd.h$b$b, reason: collision with other inner class name */
        static final class C0646b extends xc.m implements Function0 {
            C0646b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return CollectionsKt.w0(b.this.E(), b.this.u());
            }
        }

        /* renamed from: wd.h$b$c */
        static final class c extends xc.m implements Function0 {
            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return b.this.z();
            }
        }

        /* renamed from: wd.h$b$d */
        static final class d extends xc.m implements Function0 {
            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return b.this.v();
            }
        }

        /* renamed from: wd.h$b$e */
        static final class e extends xc.m implements Function0 {
            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return b.this.y();
            }
        }

        /* renamed from: wd.h$b$f */
        static final class f extends xc.m implements Function0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5076h f44526b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(AbstractC5076h abstractC5076h) {
                super(0);
                this.f44526b = abstractC5076h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set invoke() {
                b bVar = b.this;
                List list = bVar.f44506a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                AbstractC5076h abstractC5076h = bVar.f44519n;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(y.b(abstractC5076h.p().g(), ((C3032i) ((p) it.next())).a0()));
                }
                return O.k(linkedHashSet, this.f44526b.t());
            }
        }

        /* renamed from: wd.h$b$g */
        static final class g extends xc.m implements Function0 {
            g() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map invoke() {
                List A10 = b.this.A();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : A10) {
                    id.f name = ((Z) obj).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* renamed from: wd.h$b$h, reason: collision with other inner class name */
        static final class C0647h extends xc.m implements Function0 {
            C0647h() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map invoke() {
                List B10 = b.this.B();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : B10) {
                    id.f name = ((U) obj).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* renamed from: wd.h$b$i */
        static final class i extends xc.m implements Function0 {
            i() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map invoke() {
                List C10 = b.this.C();
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(G.d(CollectionsKt.u(C10, 10)), 16));
                for (Object obj : C10) {
                    id.f name = ((e0) obj).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    linkedHashMap.put(name, obj);
                }
                return linkedHashMap;
            }
        }

        /* renamed from: wd.h$b$j */
        static final class j extends xc.m implements Function0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5076h f44531b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(AbstractC5076h abstractC5076h) {
                super(0);
                this.f44531b = abstractC5076h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set invoke() {
                b bVar = b.this;
                List list = bVar.f44507b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                AbstractC5076h abstractC5076h = bVar.f44519n;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(y.b(abstractC5076h.p().g(), ((C3037n) ((p) it.next())).Z()));
                }
                return O.k(linkedHashSet, this.f44531b.u());
            }
        }

        public b(AbstractC5076h abstractC5076h, List functionList, List propertyList, List typeAliasList) {
            Intrinsics.checkNotNullParameter(functionList, "functionList");
            Intrinsics.checkNotNullParameter(propertyList, "propertyList");
            Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
            this.f44519n = abstractC5076h;
            this.f44506a = functionList;
            this.f44507b = propertyList;
            this.f44508c = abstractC5076h.p().c().g().g() ? typeAliasList : CollectionsKt.j();
            this.f44509d = abstractC5076h.p().h().d(new d());
            this.f44510e = abstractC5076h.p().h().d(new e());
            this.f44511f = abstractC5076h.p().h().d(new c());
            this.f44512g = abstractC5076h.p().h().d(new a());
            this.f44513h = abstractC5076h.p().h().d(new C0646b());
            this.f44514i = abstractC5076h.p().h().d(new i());
            this.f44515j = abstractC5076h.p().h().d(new g());
            this.f44516k = abstractC5076h.p().h().d(new C0647h());
            this.f44517l = abstractC5076h.p().h().d(new f(abstractC5076h));
            this.f44518m = abstractC5076h.p().h().d(new j(abstractC5076h));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List A() {
            return (List) xd.m.a(this.f44512g, this, f44505o[3]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List B() {
            return (List) xd.m.a(this.f44513h, this, f44505o[4]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List C() {
            return (List) xd.m.a(this.f44511f, this, f44505o[2]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List D() {
            return (List) xd.m.a(this.f44509d, this, f44505o[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List E() {
            return (List) xd.m.a(this.f44510e, this, f44505o[1]);
        }

        private final Map F() {
            return (Map) xd.m.a(this.f44515j, this, f44505o[6]);
        }

        private final Map G() {
            return (Map) xd.m.a(this.f44516k, this, f44505o[7]);
        }

        private final Map H() {
            return (Map) xd.m.a(this.f44514i, this, f44505o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List t() {
            Set t10 = this.f44519n.t();
            ArrayList arrayList = new ArrayList();
            Iterator it = t10.iterator();
            while (it.hasNext()) {
                CollectionsKt.z(arrayList, w((id.f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List u() {
            Set u10 = this.f44519n.u();
            ArrayList arrayList = new ArrayList();
            Iterator it = u10.iterator();
            while (it.hasNext()) {
                CollectionsKt.z(arrayList, x((id.f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List v() {
            List list = this.f44506a;
            AbstractC5076h abstractC5076h = this.f44519n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Z j10 = abstractC5076h.p().f().j((C3032i) ((p) it.next()));
                if (!abstractC5076h.x(j10)) {
                    j10 = null;
                }
                if (j10 != null) {
                    arrayList.add(j10);
                }
            }
            return arrayList;
        }

        private final List w(id.f fVar) {
            List D10 = D();
            AbstractC5076h abstractC5076h = this.f44519n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : D10) {
                if (Intrinsics.b(((InterfaceC0941m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC5076h.k(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List x(id.f fVar) {
            List E10 = E();
            AbstractC5076h abstractC5076h = this.f44519n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : E10) {
                if (Intrinsics.b(((InterfaceC0941m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC5076h.l(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List y() {
            List list = this.f44507b;
            AbstractC5076h abstractC5076h = this.f44519n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                U l10 = abstractC5076h.p().f().l((C3037n) ((p) it.next()));
                if (l10 != null) {
                    arrayList.add(l10);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List z() {
            List list = this.f44508c;
            AbstractC5076h abstractC5076h = this.f44519n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e0 m10 = abstractC5076h.p().f().m((C3041r) ((p) it.next()));
                if (m10 != null) {
                    arrayList.add(m10);
                }
            }
            return arrayList;
        }

        @Override // wd.AbstractC5076h.a
        public Collection a(id.f name, Rc.b location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            if (!b().contains(name)) {
                return CollectionsKt.j();
            }
            Collection collection = (Collection) F().get(name);
            return collection == null ? CollectionsKt.j() : collection;
        }

        @Override // wd.AbstractC5076h.a
        public Set b() {
            return (Set) xd.m.a(this.f44517l, this, f44505o[8]);
        }

        @Override // wd.AbstractC5076h.a
        public Collection c(id.f name, Rc.b location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            if (!d().contains(name)) {
                return CollectionsKt.j();
            }
            Collection collection = (Collection) G().get(name);
            return collection == null ? CollectionsKt.j() : collection;
        }

        @Override // wd.AbstractC5076h.a
        public Set d() {
            return (Set) xd.m.a(this.f44518m, this, f44505o[9]);
        }

        @Override // wd.AbstractC5076h.a
        public e0 e(id.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return (e0) H().get(name);
        }

        @Override // wd.AbstractC5076h.a
        public void f(Collection result, rd.d kindFilter, Function1 nameFilter, Rc.b location) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            Intrinsics.checkNotNullParameter(location, "location");
            if (kindFilter.a(rd.d.f40606c.i())) {
                for (Object obj : B()) {
                    id.f name = ((U) obj).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.a(rd.d.f40606c.d())) {
                for (Object obj2 : A()) {
                    id.f name2 = ((Z) obj2).getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    if (((Boolean) nameFilter.invoke(name2)).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // wd.AbstractC5076h.a
        public Set g() {
            List list = this.f44508c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC5076h abstractC5076h = this.f44519n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(y.b(abstractC5076h.p().g(), ((C3041r) ((p) it.next())).T()));
            }
            return linkedHashSet;
        }
    }

    /* renamed from: wd.h$c */
    private final class c implements a {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.k[] f44532j = {C5142C.k(new u(C5142C.b(c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), C5142C.k(new u(C5142C.b(c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a, reason: collision with root package name */
        private final Map f44533a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f44534b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f44535c;

        /* renamed from: d, reason: collision with root package name */
        private final xd.g f44536d;

        /* renamed from: e, reason: collision with root package name */
        private final xd.g f44537e;

        /* renamed from: f, reason: collision with root package name */
        private final xd.h f44538f;

        /* renamed from: g, reason: collision with root package name */
        private final xd.i f44539g;

        /* renamed from: h, reason: collision with root package name */
        private final xd.i f44540h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AbstractC5076h f44541i;

        /* renamed from: wd.h$c$a */
        static final class a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f44542a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f44543b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC5076h f44544c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r rVar, ByteArrayInputStream byteArrayInputStream, AbstractC5076h abstractC5076h) {
                super(0);
                this.f44542a = rVar;
                this.f44543b = byteArrayInputStream;
                this.f44544c = abstractC5076h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p invoke() {
                return (p) this.f44542a.c(this.f44543b, this.f44544c.p().c().k());
            }
        }

        /* renamed from: wd.h$c$b */
        static final class b extends xc.m implements Function0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5076h f44546b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AbstractC5076h abstractC5076h) {
                super(0);
                this.f44546b = abstractC5076h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set invoke() {
                return O.k(c.this.f44533a.keySet(), this.f44546b.t());
            }
        }

        /* renamed from: wd.h$c$c, reason: collision with other inner class name */
        static final class C0648c extends xc.m implements Function1 {
            C0648c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection invoke(id.f it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return c.this.m(it);
            }
        }

        /* renamed from: wd.h$c$d */
        static final class d extends xc.m implements Function1 {
            d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection invoke(id.f it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return c.this.n(it);
            }
        }

        /* renamed from: wd.h$c$e */
        static final class e extends xc.m implements Function1 {
            e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e0 invoke(id.f it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return c.this.o(it);
            }
        }

        /* renamed from: wd.h$c$f */
        static final class f extends xc.m implements Function0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5076h f44551b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(AbstractC5076h abstractC5076h) {
                super(0);
                this.f44551b = abstractC5076h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set invoke() {
                return O.k(c.this.f44534b.keySet(), this.f44551b.u());
            }
        }

        public c(AbstractC5076h abstractC5076h, List functionList, List propertyList, List typeAliasList) {
            Map h10;
            Intrinsics.checkNotNullParameter(functionList, "functionList");
            Intrinsics.checkNotNullParameter(propertyList, "propertyList");
            Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
            this.f44541i = abstractC5076h;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                id.f b10 = y.b(abstractC5076h.p().g(), ((C3032i) ((p) obj)).a0());
                Object obj2 = linkedHashMap.get(b10);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(b10, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.f44533a = p(linkedHashMap);
            AbstractC5076h abstractC5076h2 = this.f44541i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : propertyList) {
                id.f b11 = y.b(abstractC5076h2.p().g(), ((C3037n) ((p) obj3)).Z());
                Object obj4 = linkedHashMap2.get(b11);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(b11, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.f44534b = p(linkedHashMap2);
            if (this.f44541i.p().c().g().g()) {
                AbstractC5076h abstractC5076h3 = this.f44541i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : typeAliasList) {
                    id.f b12 = y.b(abstractC5076h3.p().g(), ((C3041r) ((p) obj5)).T());
                    Object obj6 = linkedHashMap3.get(b12);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap3.put(b12, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                h10 = p(linkedHashMap3);
            } else {
                h10 = G.h();
            }
            this.f44535c = h10;
            this.f44536d = this.f44541i.p().h().h(new C0648c());
            this.f44537e = this.f44541i.p().h().h(new d());
            this.f44538f = this.f44541i.p().h().i(new e());
            this.f44539g = this.f44541i.p().h().d(new b(this.f44541i));
            this.f44540h = this.f44541i.p().h().d(new f(this.f44541i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Collection m(id.f fVar) {
            List<C3032i> j10;
            Map map = this.f44533a;
            r PARSER = C3032i.f31615w;
            Intrinsics.checkNotNullExpressionValue(PARSER, "PARSER");
            AbstractC5076h abstractC5076h = this.f44541i;
            byte[] bArr = (byte[]) map.get(fVar);
            if (bArr != null) {
                List C10 = kotlin.sequences.j.C(kotlin.sequences.j.i(new a(PARSER, new ByteArrayInputStream(bArr), this.f44541i)));
                if (C10 != null) {
                    j10 = C10;
                    ArrayList arrayList = new ArrayList(j10.size());
                    for (C3032i c3032i : j10) {
                        x f10 = abstractC5076h.p().f();
                        Intrinsics.d(c3032i);
                        Z j11 = f10.j(c3032i);
                        if (!abstractC5076h.x(j11)) {
                            j11 = null;
                        }
                        if (j11 != null) {
                            arrayList.add(j11);
                        }
                    }
                    abstractC5076h.k(fVar, arrayList);
                    return Gd.a.c(arrayList);
                }
            }
            j10 = CollectionsKt.j();
            ArrayList arrayList2 = new ArrayList(j10.size());
            while (r0.hasNext()) {
            }
            abstractC5076h.k(fVar, arrayList2);
            return Gd.a.c(arrayList2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Collection n(id.f fVar) {
            List<C3037n> j10;
            Map map = this.f44534b;
            r PARSER = C3037n.f31683w;
            Intrinsics.checkNotNullExpressionValue(PARSER, "PARSER");
            AbstractC5076h abstractC5076h = this.f44541i;
            byte[] bArr = (byte[]) map.get(fVar);
            if (bArr != null) {
                List C10 = kotlin.sequences.j.C(kotlin.sequences.j.i(new a(PARSER, new ByteArrayInputStream(bArr), this.f44541i)));
                if (C10 != null) {
                    j10 = C10;
                    ArrayList arrayList = new ArrayList(j10.size());
                    for (C3037n c3037n : j10) {
                        x f10 = abstractC5076h.p().f();
                        Intrinsics.d(c3037n);
                        U l10 = f10.l(c3037n);
                        if (l10 != null) {
                            arrayList.add(l10);
                        }
                    }
                    abstractC5076h.l(fVar, arrayList);
                    return Gd.a.c(arrayList);
                }
            }
            j10 = CollectionsKt.j();
            ArrayList arrayList2 = new ArrayList(j10.size());
            while (r0.hasNext()) {
            }
            abstractC5076h.l(fVar, arrayList2);
            return Gd.a.c(arrayList2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final e0 o(id.f fVar) {
            C3041r k02;
            byte[] bArr = (byte[]) this.f44535c.get(fVar);
            if (bArr == null || (k02 = C3041r.k0(new ByteArrayInputStream(bArr), this.f44541i.p().c().k())) == null) {
                return null;
            }
            return this.f44541i.p().f().m(k02);
        }

        private final Map p(Map map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(G.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt.u(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((kotlin.reflect.jvm.internal.impl.protobuf.a) it.next()).f(byteArrayOutputStream);
                    arrayList.add(Unit.f36324a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // wd.AbstractC5076h.a
        public Collection a(id.f name, Rc.b location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            return !b().contains(name) ? CollectionsKt.j() : (Collection) this.f44536d.invoke(name);
        }

        @Override // wd.AbstractC5076h.a
        public Set b() {
            return (Set) xd.m.a(this.f44539g, this, f44532j[0]);
        }

        @Override // wd.AbstractC5076h.a
        public Collection c(id.f name, Rc.b location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            return !d().contains(name) ? CollectionsKt.j() : (Collection) this.f44537e.invoke(name);
        }

        @Override // wd.AbstractC5076h.a
        public Set d() {
            return (Set) xd.m.a(this.f44540h, this, f44532j[1]);
        }

        @Override // wd.AbstractC5076h.a
        public e0 e(id.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return (e0) this.f44538f.invoke(name);
        }

        @Override // wd.AbstractC5076h.a
        public void f(Collection result, rd.d kindFilter, Function1 nameFilter, Rc.b location) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            Intrinsics.checkNotNullParameter(location, "location");
            if (kindFilter.a(rd.d.f40606c.i())) {
                Set<id.f> d10 = d();
                ArrayList arrayList = new ArrayList();
                for (id.f fVar : d10) {
                    if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                        arrayList.addAll(c(fVar, location));
                    }
                }
                kd.i INSTANCE = kd.i.f36294a;
                Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
                CollectionsKt.y(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.a(rd.d.f40606c.d())) {
                Set<id.f> b10 = b();
                ArrayList arrayList2 = new ArrayList();
                for (id.f fVar2 : b10) {
                    if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                        arrayList2.addAll(a(fVar2, location));
                    }
                }
                kd.i INSTANCE2 = kd.i.f36294a;
                Intrinsics.checkNotNullExpressionValue(INSTANCE2, "INSTANCE");
                CollectionsKt.y(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // wd.AbstractC5076h.a
        public Set g() {
            return this.f44535c.keySet();
        }
    }

    /* renamed from: wd.h$d */
    static final class d extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f44552a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0 function0) {
            super(0);
            this.f44552a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            return CollectionsKt.S0((Iterable) this.f44552a.invoke());
        }
    }

    /* renamed from: wd.h$e */
    static final class e extends xc.m implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            Set s10 = AbstractC5076h.this.s();
            if (s10 == null) {
                return null;
            }
            return O.k(O.k(AbstractC5076h.this.q(), AbstractC5076h.this.f44502c.g()), s10);
        }
    }

    protected AbstractC5076h(ud.m c10, List functionList, List propertyList, List typeAliasList, Function0 classNames) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(functionList, "functionList");
        Intrinsics.checkNotNullParameter(propertyList, "propertyList");
        Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        this.f44501b = c10;
        this.f44502c = n(functionList, propertyList, typeAliasList);
        this.f44503d = c10.h().d(new d(classNames));
        this.f44504e = c10.h().f(new e());
    }

    private final a n(List list, List list2, List list3) {
        return this.f44501b.c().g().a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    private final InterfaceC0933e o(id.f fVar) {
        return this.f44501b.c().b(m(fVar));
    }

    private final Set r() {
        return (Set) xd.m.b(this.f44504e, this, f44500f[1]);
    }

    private final e0 v(id.f fVar) {
        return this.f44502c.e(fVar);
    }

    @Override // rd.i, rd.h
    public Collection a(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f44502c.a(name, location);
    }

    @Override // rd.i, rd.h
    public Set b() {
        return this.f44502c.b();
    }

    @Override // rd.i, rd.h
    public Collection c(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f44502c.c(name, location);
    }

    @Override // rd.i, rd.h
    public Set d() {
        return this.f44502c.d();
    }

    @Override // rd.i, rd.h
    public Set e() {
        return r();
    }

    @Override // rd.i, rd.k
    public InterfaceC0936h f(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        if (w(name)) {
            return o(name);
        }
        if (this.f44502c.g().contains(name)) {
            return v(name);
        }
        return null;
    }

    protected abstract void i(Collection collection, Function1 function1);

    protected final Collection j(rd.d kindFilter, Function1 nameFilter, Rc.b location) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Intrinsics.checkNotNullParameter(location, "location");
        ArrayList arrayList = new ArrayList(0);
        d.a aVar = rd.d.f40606c;
        if (kindFilter.a(aVar.g())) {
            i(arrayList, nameFilter);
        }
        this.f44502c.f(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.a(aVar.c())) {
            for (id.f fVar : q()) {
                if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                    Gd.a.a(arrayList, o(fVar));
                }
            }
        }
        if (kindFilter.a(rd.d.f40606c.h())) {
            for (id.f fVar2 : this.f44502c.g()) {
                if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                    Gd.a.a(arrayList, this.f44502c.e(fVar2));
                }
            }
        }
        return Gd.a.c(arrayList);
    }

    protected void k(id.f name, List functions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(functions, "functions");
    }

    protected void l(id.f name, List descriptors) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
    }

    protected abstract C3367b m(id.f fVar);

    protected final ud.m p() {
        return this.f44501b;
    }

    public final Set q() {
        return (Set) xd.m.a(this.f44503d, this, f44500f[0]);
    }

    protected abstract Set s();

    protected abstract Set t();

    protected abstract Set u();

    protected boolean w(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return q().contains(name);
    }

    protected boolean x(Z function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return true;
    }
}
