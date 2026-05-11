package Ec;

import Ec.F;
import Ec.n;
import Kc.U;
import cd.C1750a;
import dd.C3035l;
import dd.C3037n;
import dd.C3043t;
import gd.AbstractC3218a;
import java.util.Collection;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.text.StringsKt;
import rd.h;
import xc.AbstractC5156i;
import xc.C5142C;

/* loaded from: classes3.dex */
public final class t extends n {

    /* renamed from: d, reason: collision with root package name */
    private final Class f2092d;

    /* renamed from: e, reason: collision with root package name */
    private final Lazy f2093e;

    private final class a extends n.b {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.k[] f2094j = {C5142C.k(new xc.u(C5142C.b(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), C5142C.k(new xc.u(C5142C.b(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), C5142C.k(new xc.u(C5142C.b(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* renamed from: d, reason: collision with root package name */
        private final F.a f2095d;

        /* renamed from: e, reason: collision with root package name */
        private final F.a f2096e;

        /* renamed from: f, reason: collision with root package name */
        private final Lazy f2097f;

        /* renamed from: g, reason: collision with root package name */
        private final Lazy f2098g;

        /* renamed from: h, reason: collision with root package name */
        private final F.a f2099h;

        /* renamed from: Ec.t$a$a, reason: collision with other inner class name */
        static final class C0048a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f2101a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0048a(t tVar) {
                super(0);
                this.f2101a = tVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Oc.f invoke() {
                return Oc.f.f7286c.a(this.f2101a.m());
            }
        }

        static final class b extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f2102a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f2103b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(t tVar, a aVar) {
                super(0);
                this.f2102a = tVar;
                this.f2103b = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection invoke() {
                return this.f2102a.L(this.f2103b.f(), n.c.DECLARED);
            }
        }

        static final class c extends xc.m implements Function0 {
            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final lc.s invoke() {
                C1750a a10;
                Oc.f c10 = a.this.c();
                if (c10 == null || (a10 = c10.a()) == null) {
                    return null;
                }
                String[] a11 = a10.a();
                String[] g10 = a10.g();
                if (a11 == null || g10 == null) {
                    return null;
                }
                Pair m10 = hd.i.m(a11, g10);
                return new lc.s((hd.f) m10.getFirst(), (C3035l) m10.getSecond(), a10.d());
            }
        }

        static final class d extends xc.m implements Function0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f2106b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(t tVar) {
                super(0);
                this.f2106b = tVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Class invoke() {
                C1750a a10;
                Oc.f c10 = a.this.c();
                String e10 = (c10 == null || (a10 = c10.a()) == null) ? null : a10.e();
                if (e10 == null || e10.length() <= 0) {
                    return null;
                }
                return this.f2106b.m().getClassLoader().loadClass(StringsKt.y(e10, '/', '.', false, 4, null));
            }
        }

        static final class e extends xc.m implements Function0 {
            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final rd.h invoke() {
                Oc.f c10 = a.this.c();
                return c10 != null ? a.this.a().c().a(c10) : h.b.f40647b;
            }
        }

        public a() {
            super();
            this.f2095d = F.c(new C0048a(t.this));
            this.f2096e = F.c(new e());
            lc.l lVar = lc.l.PUBLICATION;
            this.f2097f = lc.i.b(lVar, new d(t.this));
            this.f2098g = lc.i.b(lVar, new c());
            this.f2099h = F.c(new b(t.this, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Oc.f c() {
            return (Oc.f) this.f2095d.b(this, f2094j[0]);
        }

        public final lc.s d() {
            return (lc.s) this.f2098g.getValue();
        }

        public final Class e() {
            return (Class) this.f2097f.getValue();
        }

        public final rd.h f() {
            Object b10 = this.f2096e.b(this, f2094j[1]);
            Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
            return (rd.h) b10;
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return t.this.new a();
        }
    }

    /* synthetic */ class c extends AbstractC5156i implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public static final c f2109j = new c();

        c() {
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

    public t(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f2092d = jClass;
        this.f2093e = lc.i.b(lc.l.PUBLICATION, new b());
    }

    private final rd.h U() {
        return ((a) this.f2093e.getValue()).f();
    }

    @Override // Ec.n
    public Collection I() {
        return CollectionsKt.j();
    }

    @Override // Ec.n
    public Collection J(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return U().a(name, Rc.d.FROM_REFLECTION);
    }

    @Override // Ec.n
    public U K(int i10) {
        lc.s d10 = ((a) this.f2093e.getValue()).d();
        if (d10 == null) {
            return null;
        }
        hd.f fVar = (hd.f) d10.a();
        C3035l c3035l = (C3035l) d10.b();
        hd.e eVar = (hd.e) d10.c();
        i.f packageLocalVariable = AbstractC3218a.f33687n;
        Intrinsics.checkNotNullExpressionValue(packageLocalVariable, "packageLocalVariable");
        C3037n c3037n = (C3037n) fd.e.b(c3035l, packageLocalVariable, i10);
        if (c3037n == null) {
            return null;
        }
        Class m10 = m();
        C3043t S10 = c3035l.S();
        Intrinsics.checkNotNullExpressionValue(S10, "getTypeTable(...)");
        return (U) L.h(m10, c3037n, fVar, new fd.g(S10), eVar, c.f2109j);
    }

    @Override // Ec.n
    protected Class M() {
        Class e10 = ((a) this.f2093e.getValue()).e();
        return e10 == null ? m() : e10;
    }

    @Override // Ec.n
    public Collection N(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return U().c(name, Rc.d.FROM_REFLECTION);
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && Intrinsics.b(m(), ((t) obj).m());
    }

    public int hashCode() {
        return m().hashCode();
    }

    @Override // xc.InterfaceC5151d
    public Class m() {
        return this.f2092d;
    }

    public String toString() {
        return "file class " + Pc.d.a(m()).b();
    }
}
