package Ec;

import Ec.F;
import Ec.n;
import Kc.AbstractC0951x;
import Kc.EnumC0934f;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0941m;
import Kc.U;
import Kc.a0;
import Kc.f0;
import Mc.C0982h;
import Mc.C0987m;
import cd.C1750a;
import dd.C3026c;
import dd.C3037n;
import gd.AbstractC3218a;
import id.C3367b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.text.StringsKt;
import od.AbstractC3778c;
import org.conscrypt.BuildConfig;
import rd.k;
import vc.AbstractC5011a;
import wd.C5072d;
import xc.AbstractC5156i;
import xc.C5142C;
import yd.AbstractC5197E;

/* renamed from: Ec.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0832k extends n implements kotlin.reflect.d, InterfaceC0833l, C {

    /* renamed from: d, reason: collision with root package name */
    private final Class f2010d;

    /* renamed from: e, reason: collision with root package name */
    private final Lazy f2011e;

    /* renamed from: Ec.k$a */
    public final class a extends n.b {

        /* renamed from: w, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.k[] f2012w = {C5142C.k(new xc.u(C5142C.b(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5142C.k(new xc.u(C5142C.b(a.class), "annotations", "getAnnotations()Ljava/util/List;")), C5142C.k(new xc.u(C5142C.b(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), C5142C.k(new xc.u(C5142C.b(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), C5142C.k(new xc.u(C5142C.b(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), C5142C.k(new xc.u(C5142C.b(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), C5142C.k(new xc.u(C5142C.b(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), C5142C.k(new xc.u(C5142C.b(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), C5142C.k(new xc.u(C5142C.b(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), C5142C.k(new xc.u(C5142C.b(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), C5142C.k(new xc.u(C5142C.b(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), C5142C.k(new xc.u(C5142C.b(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), C5142C.k(new xc.u(C5142C.b(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), C5142C.k(new xc.u(C5142C.b(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), C5142C.k(new xc.u(C5142C.b(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), C5142C.k(new xc.u(C5142C.b(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), C5142C.k(new xc.u(C5142C.b(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: d, reason: collision with root package name */
        private final F.a f2013d;

        /* renamed from: e, reason: collision with root package name */
        private final F.a f2014e;

        /* renamed from: f, reason: collision with root package name */
        private final F.a f2015f;

        /* renamed from: g, reason: collision with root package name */
        private final F.a f2016g;

        /* renamed from: h, reason: collision with root package name */
        private final F.a f2017h;

        /* renamed from: i, reason: collision with root package name */
        private final F.a f2018i;

        /* renamed from: j, reason: collision with root package name */
        private final Lazy f2019j;

        /* renamed from: k, reason: collision with root package name */
        private final F.a f2020k;

        /* renamed from: l, reason: collision with root package name */
        private final F.a f2021l;

        /* renamed from: m, reason: collision with root package name */
        private final F.a f2022m;

        /* renamed from: n, reason: collision with root package name */
        private final F.a f2023n;

        /* renamed from: o, reason: collision with root package name */
        private final F.a f2024o;

        /* renamed from: p, reason: collision with root package name */
        private final F.a f2025p;

        /* renamed from: q, reason: collision with root package name */
        private final F.a f2026q;

        /* renamed from: r, reason: collision with root package name */
        private final F.a f2027r;

        /* renamed from: s, reason: collision with root package name */
        private final F.a f2028s;

        /* renamed from: t, reason: collision with root package name */
        private final F.a f2029t;

        /* renamed from: u, reason: collision with root package name */
        private final F.a f2030u;

        /* renamed from: Ec.k$a$a, reason: collision with other inner class name */
        static final class C0045a extends xc.m implements Function0 {
            C0045a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return CollectionsKt.w0(a.this.g(), a.this.h());
            }
        }

        /* renamed from: Ec.k$a$b */
        static final class b extends xc.m implements Function0 {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return CollectionsKt.w0(a.this.k(), a.this.n());
            }
        }

        /* renamed from: Ec.k$a$c */
        static final class c extends xc.m implements Function0 {
            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return CollectionsKt.w0(a.this.l(), a.this.o());
            }
        }

        /* renamed from: Ec.k$a$d */
        static final class d extends xc.m implements Function0 {
            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return L.e(a.this.m());
            }
        }

        /* renamed from: Ec.k$a$e */
        static final class e extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0832k f2036a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(C0832k c0832k) {
                super(0);
                this.f2036a = c0832k;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                Collection I10 = this.f2036a.I();
                C0832k c0832k = this.f2036a;
                ArrayList arrayList = new ArrayList(CollectionsKt.u(I10, 10));
                Iterator it = I10.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Ec.o(c0832k, (InterfaceC0940l) it.next()));
                }
                return arrayList;
            }
        }

        /* renamed from: Ec.k$a$f */
        static final class f extends xc.m implements Function0 {
            f() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return CollectionsKt.w0(a.this.k(), a.this.l());
            }
        }

        /* renamed from: Ec.k$a$g */
        static final class g extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0832k f2038a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(C0832k c0832k) {
                super(0);
                this.f2038a = c0832k;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection invoke() {
                C0832k c0832k = this.f2038a;
                return c0832k.L(c0832k.b0(), n.c.DECLARED);
            }
        }

        /* renamed from: Ec.k$a$h */
        static final class h extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0832k f2039a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(C0832k c0832k) {
                super(0);
                this.f2039a = c0832k;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection invoke() {
                C0832k c0832k = this.f2039a;
                return c0832k.L(c0832k.c0(), n.c.DECLARED);
            }
        }

        /* renamed from: Ec.k$a$i */
        static final class i extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0832k f2040a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(C0832k c0832k) {
                super(0);
                this.f2040a = c0832k;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC0933e invoke() {
                C3367b Y10 = this.f2040a.Y();
                Oc.k a10 = ((a) this.f2040a.Z().getValue()).a();
                InterfaceC0933e b10 = (Y10.k() && this.f2040a.m().isAnnotationPresent(Metadata.class)) ? a10.a().b(Y10) : AbstractC0951x.a(a10.b(), Y10);
                return b10 == null ? this.f2040a.X(Y10, a10) : b10;
            }
        }

        /* renamed from: Ec.k$a$j */
        static final class j extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0832k f2041a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(C0832k c0832k) {
                super(0);
                this.f2041a = c0832k;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection invoke() {
                C0832k c0832k = this.f2041a;
                return c0832k.L(c0832k.b0(), n.c.INHERITED);
            }
        }

        /* renamed from: Ec.k$a$k, reason: collision with other inner class name */
        static final class C0046k extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0832k f2042a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0046k(C0832k c0832k) {
                super(0);
                this.f2042a = c0832k;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection invoke() {
                C0832k c0832k = this.f2042a;
                return c0832k.L(c0832k.c0(), n.c.INHERITED);
            }
        }

        /* renamed from: Ec.k$a$l */
        static final class l extends xc.m implements Function0 {
            l() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                rd.h G02 = a.this.m().G0();
                Intrinsics.checkNotNullExpressionValue(G02, "getUnsubstitutedInnerClassesScope(...)");
                Collection a10 = k.a.a(G02, null, null, 3, null);
                ArrayList<InterfaceC0941m> arrayList = new ArrayList();
                for (Object obj : a10) {
                    if (!kd.f.B((InterfaceC0941m) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC0941m interfaceC0941m : arrayList) {
                    InterfaceC0933e interfaceC0933e = interfaceC0941m instanceof InterfaceC0933e ? (InterfaceC0933e) interfaceC0941m : null;
                    Class q10 = interfaceC0933e != null ? L.q(interfaceC0933e) : null;
                    C0832k c0832k = q10 != null ? new C0832k(q10) : null;
                    if (c0832k != null) {
                        arrayList2.add(c0832k);
                    }
                }
                return arrayList2;
            }
        }

        /* renamed from: Ec.k$a$m */
        static final class m extends xc.m implements Function0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0832k f2045b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            m(C0832k c0832k) {
                super(0);
                this.f2045b = c0832k;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterfaceC0933e m10 = a.this.m();
                if (m10.o() != EnumC0934f.OBJECT) {
                    return null;
                }
                Object obj = ((!m10.F() || Hc.d.a(Hc.c.f3825a, m10)) ? this.f2045b.m().getDeclaredField("INSTANCE") : this.f2045b.m().getEnclosingClass().getDeclaredField(m10.getName().c())).get(null);
                Intrinsics.e(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return obj;
            }
        }

        /* renamed from: Ec.k$a$n */
        static final class n extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0832k f2046a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(C0832k c0832k) {
                super(0);
                this.f2046a = c0832k;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                if (this.f2046a.m().isAnonymousClass()) {
                    return null;
                }
                C3367b Y10 = this.f2046a.Y();
                if (Y10.k()) {
                    return null;
                }
                return Y10.b().b();
            }
        }

        /* renamed from: Ec.k$a$o */
        static final class o extends xc.m implements Function0 {
            o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                Collection<InterfaceC0933e> P10 = a.this.m().P();
                Intrinsics.checkNotNullExpressionValue(P10, "getSealedSubclasses(...)");
                ArrayList arrayList = new ArrayList();
                for (InterfaceC0933e interfaceC0933e : P10) {
                    Intrinsics.e(interfaceC0933e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class q10 = L.q(interfaceC0933e);
                    C0832k c0832k = q10 != null ? new C0832k(q10) : null;
                    if (c0832k != null) {
                        arrayList.add(c0832k);
                    }
                }
                return arrayList;
            }
        }

        /* renamed from: Ec.k$a$p */
        static final class p extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0832k f2048a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f2049b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            p(C0832k c0832k, a aVar) {
                super(0);
                this.f2048a = c0832k;
                this.f2049b = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                if (this.f2048a.m().isAnonymousClass()) {
                    return null;
                }
                C3367b Y10 = this.f2048a.Y();
                if (Y10.k()) {
                    return this.f2049b.f(this.f2048a.m());
                }
                String c10 = Y10.j().c();
                Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
                return c10;
            }
        }

        /* renamed from: Ec.k$a$q */
        static final class q extends xc.m implements Function0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0832k f2051b;

            /* renamed from: Ec.k$a$q$a, reason: collision with other inner class name */
            static final class C0047a extends xc.m implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractC5197E f2052a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f2053b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C0832k f2054c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0047a(AbstractC5197E abstractC5197E, a aVar, C0832k c0832k) {
                    super(0);
                    this.f2052a = abstractC5197E;
                    this.f2053b = aVar;
                    this.f2054c = c0832k;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Type invoke() {
                    InterfaceC0936h d10 = this.f2052a.W0().d();
                    if (!(d10 instanceof InterfaceC0933e)) {
                        throw new D("Supertype not a class: " + d10);
                    }
                    Class q10 = L.q((InterfaceC0933e) d10);
                    if (q10 == null) {
                        throw new D("Unsupported superclass of " + this.f2053b + ": " + d10);
                    }
                    if (Intrinsics.b(this.f2054c.m().getSuperclass(), q10)) {
                        Type genericSuperclass = this.f2054c.m().getGenericSuperclass();
                        Intrinsics.d(genericSuperclass);
                        return genericSuperclass;
                    }
                    Class<?>[] interfaces = this.f2054c.m().getInterfaces();
                    Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
                    int I10 = AbstractC3574i.I(interfaces, q10);
                    if (I10 >= 0) {
                        Type type = this.f2054c.m().getGenericInterfaces()[I10];
                        Intrinsics.d(type);
                        return type;
                    }
                    throw new D("No superclass of " + this.f2053b + " in Java reflection for " + d10);
                }
            }

            /* renamed from: Ec.k$a$q$b */
            static final class b extends xc.m implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                public static final b f2055a = new b();

                b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Type invoke() {
                    return Object.class;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            q(C0832k c0832k) {
                super(0);
                this.f2051b = c0832k;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                Collection<AbstractC5197E> a10 = a.this.m().r().a();
                Intrinsics.checkNotNullExpressionValue(a10, "getSupertypes(...)");
                ArrayList arrayList = new ArrayList(a10.size());
                a aVar = a.this;
                C0832k c0832k = this.f2051b;
                for (AbstractC5197E abstractC5197E : a10) {
                    Intrinsics.d(abstractC5197E);
                    arrayList.add(new A(abstractC5197E, new C0047a(abstractC5197E, aVar, c0832k)));
                }
                if (!Hc.g.u0(a.this.m())) {
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            EnumC0934f o10 = kd.f.e(((A) it.next()).r()).o();
                            Intrinsics.checkNotNullExpressionValue(o10, "getKind(...)");
                            if (o10 != EnumC0934f.INTERFACE && o10 != EnumC0934f.ANNOTATION_CLASS) {
                                break;
                            }
                        }
                    }
                    yd.M i10 = AbstractC3778c.j(a.this.m()).i();
                    Intrinsics.checkNotNullExpressionValue(i10, "getAnyType(...)");
                    arrayList.add(new A(i10, b.f2055a));
                }
                return Gd.a.c(arrayList);
            }
        }

        /* renamed from: Ec.k$a$r */
        static final class r extends xc.m implements Function0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0832k f2057b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            r(C0832k c0832k) {
                super(0);
                this.f2057b = c0832k;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                List B10 = a.this.m().B();
                Intrinsics.checkNotNullExpressionValue(B10, "getDeclaredTypeParameters(...)");
                List<f0> list = B10;
                C0832k c0832k = this.f2057b;
                ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
                for (f0 f0Var : list) {
                    Intrinsics.d(f0Var);
                    arrayList.add(new B(c0832k, f0Var));
                }
                return arrayList;
            }
        }

        public a() {
            super();
            this.f2013d = F.c(new i(C0832k.this));
            this.f2014e = F.c(new d());
            this.f2015f = F.c(new p(C0832k.this, this));
            this.f2016g = F.c(new n(C0832k.this));
            this.f2017h = F.c(new e(C0832k.this));
            this.f2018i = F.c(new l());
            this.f2019j = lc.i.b(lc.l.PUBLICATION, new m(C0832k.this));
            this.f2020k = F.c(new r(C0832k.this));
            this.f2021l = F.c(new q(C0832k.this));
            this.f2022m = F.c(new o());
            this.f2023n = F.c(new g(C0832k.this));
            this.f2024o = F.c(new h(C0832k.this));
            this.f2025p = F.c(new j(C0832k.this));
            this.f2026q = F.c(new C0046k(C0832k.this));
            this.f2027r = F.c(new b());
            this.f2028s = F.c(new c());
            this.f2029t = F.c(new f());
            this.f2030u = F.c(new C0045a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(Class cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                Intrinsics.d(simpleName);
                return StringsKt.I0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                Intrinsics.d(simpleName);
                return StringsKt.H0(simpleName, '$', null, 2, null);
            }
            Intrinsics.d(simpleName);
            return StringsKt.I0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection l() {
            Object b10 = this.f2024o.b(this, f2012w[10]);
            Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
            return (Collection) b10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection n() {
            Object b10 = this.f2025p.b(this, f2012w[11]);
            Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
            return (Collection) b10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection o() {
            Object b10 = this.f2026q.b(this, f2012w[12]);
            Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
            return (Collection) b10;
        }

        public final Collection g() {
            Object b10 = this.f2027r.b(this, f2012w[13]);
            Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
            return (Collection) b10;
        }

        public final Collection h() {
            Object b10 = this.f2028s.b(this, f2012w[14]);
            Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
            return (Collection) b10;
        }

        public final List i() {
            Object b10 = this.f2014e.b(this, f2012w[1]);
            Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
            return (List) b10;
        }

        public final Collection j() {
            Object b10 = this.f2017h.b(this, f2012w[4]);
            Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
            return (Collection) b10;
        }

        public final Collection k() {
            Object b10 = this.f2023n.b(this, f2012w[9]);
            Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
            return (Collection) b10;
        }

        public final InterfaceC0933e m() {
            Object b10 = this.f2013d.b(this, f2012w[0]);
            Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
            return (InterfaceC0933e) b10;
        }

        public final String p() {
            return (String) this.f2016g.b(this, f2012w[3]);
        }

        public final String q() {
            return (String) this.f2015f.b(this, f2012w[2]);
        }

        public final List r() {
            Object b10 = this.f2021l.b(this, f2012w[7]);
            Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
            return (List) b10;
        }
    }

    /* renamed from: Ec.k$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2058a;

        static {
            int[] iArr = new int[C1750a.EnumC0347a.values().length];
            try {
                iArr[C1750a.EnumC0347a.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1750a.EnumC0347a.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1750a.EnumC0347a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C1750a.EnumC0347a.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C1750a.EnumC0347a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C1750a.EnumC0347a.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f2058a = iArr;
        }
    }

    /* renamed from: Ec.k$c */
    public static final class c extends rd.e {
        c(C0982h c0982h, xd.n nVar) {
            super(nVar, c0982h);
        }

        @Override // rd.e
        protected List i() {
            return CollectionsKt.j();
        }
    }

    /* renamed from: Ec.k$d */
    static final class d extends xc.m implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return C0832k.this.new a();
        }
    }

    /* renamed from: Ec.k$e */
    /* synthetic */ class e extends AbstractC5156i implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public static final e f2060j = new e();

        e() {
            super(2);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(ud.x.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final U invoke(ud.x p02, C3037n p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return p02.l(p12);
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "loadProperty";
        }
    }

    public C0832k(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f2010d = jClass;
        this.f2011e = lc.i.b(lc.l.PUBLICATION, new d());
    }

    private final InterfaceC0933e W(C3367b c3367b, Oc.k kVar) {
        Kc.G b10 = kVar.b();
        id.c h10 = c3367b.h();
        Intrinsics.checkNotNullExpressionValue(h10, "getPackageFqName(...)");
        C0982h c0982h = new C0982h(new C0987m(b10, h10), c3367b.j(), Kc.D.FINAL, EnumC0934f.CLASS, CollectionsKt.e(kVar.b().v().h().y()), a0.f5560a, false, kVar.a().u());
        c0982h.T0(new c(c0982h, kVar.a().u()), O.d(), null);
        return c0982h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0933e X(C3367b c3367b, Oc.k kVar) {
        C1750a a10;
        if (m().isSynthetic()) {
            return W(c3367b, kVar);
        }
        Oc.f a11 = Oc.f.f7286c.a(m());
        C1750a.EnumC0347a c10 = (a11 == null || (a10 = a11.a()) == null) ? null : a10.c();
        switch (c10 == null ? -1 : b.f2058a[c10.ordinal()]) {
            case -1:
            case 6:
                throw new D("Unresolved class: " + m() + " (kind = " + c10 + ')');
            case 0:
            default:
                throw new lc.m();
            case 1:
            case 2:
            case 3:
            case 4:
                return W(c3367b, kVar);
            case 5:
                throw new D("Unknown class: " + m() + " (kind = " + c10 + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3367b Y() {
        return I.f1950a.c(m());
    }

    @Override // Ec.n
    public Collection I() {
        InterfaceC0933e n10 = n();
        if (n10.o() == EnumC0934f.INTERFACE || n10.o() == EnumC0934f.OBJECT) {
            return CollectionsKt.j();
        }
        Collection k10 = n10.k();
        Intrinsics.checkNotNullExpressionValue(k10, "getConstructors(...)");
        return k10;
    }

    @Override // Ec.n
    public Collection J(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        rd.h b02 = b0();
        Rc.d dVar = Rc.d.FROM_REFLECTION;
        return CollectionsKt.w0(b02.a(name, dVar), c0().a(name, dVar));
    }

    @Override // Ec.n
    public U K(int i10) {
        Class<?> declaringClass;
        if (Intrinsics.b(m().getSimpleName(), "DefaultImpls") && (declaringClass = m().getDeclaringClass()) != null && declaringClass.isInterface()) {
            kotlin.reflect.d e10 = AbstractC5011a.e(declaringClass);
            Intrinsics.e(e10, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((C0832k) e10).K(i10);
        }
        InterfaceC0933e n10 = n();
        C5072d c5072d = n10 instanceof C5072d ? (C5072d) n10 : null;
        if (c5072d == null) {
            return null;
        }
        C3026c j12 = c5072d.j1();
        i.f classLocalVariable = AbstractC3218a.f33683j;
        Intrinsics.checkNotNullExpressionValue(classLocalVariable, "classLocalVariable");
        C3037n c3037n = (C3037n) fd.e.b(j12, classLocalVariable, i10);
        if (c3037n != null) {
            return (U) L.h(m(), c3037n, c5072d.i1().g(), c5072d.i1().j(), c5072d.l1(), e.f2060j);
        }
        return null;
    }

    @Override // Ec.n
    public Collection N(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        rd.h b02 = b0();
        Rc.d dVar = Rc.d.FROM_REFLECTION;
        return CollectionsKt.w0(b02.c(name, dVar), c0().c(name, dVar));
    }

    public final Lazy Z() {
        return this.f2011e;
    }

    @Override // kotlin.reflect.d
    public List a() {
        return ((a) this.f2011e.getValue()).r();
    }

    @Override // Ec.InterfaceC0833l
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public InterfaceC0933e n() {
        return ((a) this.f2011e.getValue()).m();
    }

    public final rd.h b0() {
        return n().y().w();
    }

    public final rd.h c0() {
        rd.h X10 = n().X();
        Intrinsics.checkNotNullExpressionValue(X10, "getStaticScope(...)");
        return X10;
    }

    @Override // kotlin.reflect.d
    public String e() {
        return ((a) this.f2011e.getValue()).p();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0832k) && Intrinsics.b(AbstractC5011a.c(this), AbstractC5011a.c((kotlin.reflect.d) obj));
    }

    public int hashCode() {
        return AbstractC5011a.c(this).hashCode();
    }

    @Override // kotlin.reflect.b
    public List i() {
        return ((a) this.f2011e.getValue()).i();
    }

    @Override // kotlin.reflect.d
    public Collection k() {
        return ((a) this.f2011e.getValue()).j();
    }

    @Override // xc.InterfaceC5151d
    public Class m() {
        return this.f2010d;
    }

    @Override // kotlin.reflect.d
    public String q() {
        return ((a) this.f2011e.getValue()).q();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("class ");
        C3367b Y10 = Y();
        id.c h10 = Y10.h();
        Intrinsics.checkNotNullExpressionValue(h10, "getPackageFqName(...)");
        if (h10.d()) {
            str = BuildConfig.FLAVOR;
        } else {
            str = h10.b() + '.';
        }
        String b10 = Y10.i().b();
        Intrinsics.checkNotNullExpressionValue(b10, "asString(...)");
        sb2.append(str + StringsKt.y(b10, '.', '$', false, 4, null));
        return sb2.toString();
    }

    @Override // kotlin.reflect.d
    public boolean y(Object obj) {
        Integer c10 = Pc.d.c(m());
        if (c10 != null) {
            return kotlin.jvm.internal.a.m(obj, c10.intValue());
        }
        Class g10 = Pc.d.g(m());
        if (g10 == null) {
            g10 = m();
        }
        return g10.isInstance(obj);
    }
}
