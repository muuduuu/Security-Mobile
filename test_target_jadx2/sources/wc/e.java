package Wc;

import Kc.AbstractC0951x;
import Kc.InterfaceC0933e;
import Kc.j0;
import Sc.B;
import Zc.InterfaceC1328a;
import Zc.InterfaceC1329b;
import Zc.InterfaceC1330c;
import Zc.o;
import Zc.x;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import md.AbstractC3680g;
import md.C3674a;
import md.C3681h;
import md.C3683j;
import md.C3689p;
import md.C3691r;
import od.AbstractC3778c;
import xc.C5142C;
import xc.u;
import yd.AbstractC5197E;
import yd.M;
import yd.p0;
import yd.u0;

/* loaded from: classes3.dex */
public final class e implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Uc.g {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f11443i = {C5142C.k(new u(C5142C.b(e.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), C5142C.k(new u(C5142C.b(e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), C5142C.k(new u(C5142C.b(e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a, reason: collision with root package name */
    private final Vc.g f11444a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1328a f11445b;

    /* renamed from: c, reason: collision with root package name */
    private final xd.j f11446c;

    /* renamed from: d, reason: collision with root package name */
    private final xd.i f11447d;

    /* renamed from: e, reason: collision with root package name */
    private final Yc.a f11448e;

    /* renamed from: f, reason: collision with root package name */
    private final xd.i f11449f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f11450g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f11451h;

    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            Collection<InterfaceC1329b> f10 = e.this.f11445b.f();
            e eVar = e.this;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1329b interfaceC1329b : f10) {
                id.f name = interfaceC1329b.getName();
                if (name == null) {
                    name = B.f8945c;
                }
                AbstractC3680g m10 = eVar.m(interfaceC1329b);
                Pair a10 = m10 != null ? t.a(name, m10) : null;
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
            return G.r(arrayList);
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final id.c invoke() {
            C3367b l10 = e.this.f11445b.l();
            if (l10 != null) {
                return l10.b();
            }
            return null;
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke() {
            id.c e10 = e.this.e();
            if (e10 == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, e.this.f11445b.toString());
            }
            InterfaceC0933e f10 = Jc.d.f(Jc.d.f4910a, e10, e.this.f11444a.d().v(), null, 4, null);
            if (f10 == null) {
                Zc.g c10 = e.this.f11445b.c();
                f10 = c10 != null ? e.this.f11444a.a().n().a(c10) : null;
                if (f10 == null) {
                    f10 = e.this.h(e10);
                }
            }
            return f10.y();
        }
    }

    public e(Vc.g c10, InterfaceC1328a javaAnnotation, boolean z10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(javaAnnotation, "javaAnnotation");
        this.f11444a = c10;
        this.f11445b = javaAnnotation;
        this.f11446c = c10.e().f(new b());
        this.f11447d = c10.e().d(new c());
        this.f11448e = c10.a().t().a(javaAnnotation);
        this.f11449f = c10.e().d(new a());
        this.f11450g = javaAnnotation.d();
        this.f11451h = javaAnnotation.B() || z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0933e h(id.c cVar) {
        Kc.G d10 = this.f11444a.d();
        C3367b m10 = C3367b.m(cVar);
        Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
        return AbstractC0951x.c(d10, m10, this.f11444a.a().b().d().r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC3680g m(InterfaceC1329b interfaceC1329b) {
        if (interfaceC1329b instanceof o) {
            return C3681h.d(C3681h.f37480a, ((o) interfaceC1329b).getValue(), null, 2, null);
        }
        if (interfaceC1329b instanceof Zc.m) {
            Zc.m mVar = (Zc.m) interfaceC1329b;
            return p(mVar.b(), mVar.d());
        }
        if (!(interfaceC1329b instanceof Zc.e)) {
            if (interfaceC1329b instanceof InterfaceC1330c) {
                return n(((InterfaceC1330c) interfaceC1329b).a());
            }
            if (interfaceC1329b instanceof Zc.h) {
                return q(((Zc.h) interfaceC1329b).c());
            }
            return null;
        }
        Zc.e eVar = (Zc.e) interfaceC1329b;
        id.f name = eVar.getName();
        if (name == null) {
            name = B.f8945c;
        }
        Intrinsics.d(name);
        return o(name, eVar.e());
    }

    private final AbstractC3680g n(InterfaceC1328a interfaceC1328a) {
        return new C3674a(new e(this.f11444a, interfaceC1328a, false, 4, null));
    }

    private final AbstractC3680g o(id.f fVar, List list) {
        AbstractC5197E l10;
        M type = getType();
        Intrinsics.checkNotNullExpressionValue(type, "<get-type>(...)");
        if (yd.G.a(type)) {
            return null;
        }
        InterfaceC0933e i10 = AbstractC3778c.i(this);
        Intrinsics.d(i10);
        j0 b10 = Tc.a.b(fVar, i10);
        if (b10 == null || (l10 = b10.getType()) == null) {
            l10 = this.f11444a.a().m().v().l(u0.INVARIANT, kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
        }
        Intrinsics.d(l10);
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC3680g m10 = m((InterfaceC1329b) it.next());
            if (m10 == null) {
                m10 = new C3691r();
            }
            arrayList.add(m10);
        }
        return C3681h.f37480a.b(arrayList, l10);
    }

    private final AbstractC3680g p(C3367b c3367b, id.f fVar) {
        if (c3367b == null || fVar == null) {
            return null;
        }
        return new C3683j(c3367b, fVar);
    }

    private final AbstractC3680g q(x xVar) {
        return C3689p.f37495b.a(this.f11444a.g().o(xVar, Xc.b.b(p0.COMMON, false, false, null, 7, null)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map a() {
        return (Map) xd.m.a(this.f11449f, this, f11443i[2]);
    }

    @Override // Uc.g
    public boolean d() {
        return this.f11450g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public id.c e() {
        return (id.c) xd.m.b(this.f11446c, this, f11443i[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Yc.a j() {
        return this.f11448e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public M getType() {
        return (M) xd.m.a(this.f11447d, this, f11443i[1]);
    }

    public final boolean l() {
        return this.f11451h;
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.c.s(kotlin.reflect.jvm.internal.impl.renderer.c.f36584g, this, null, 2, null);
    }

    public /* synthetic */ e(Vc.g gVar, InterfaceC1328a interfaceC1328a, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, interfaceC1328a, (i10 & 4) != 0 ? false : z10);
    }
}
