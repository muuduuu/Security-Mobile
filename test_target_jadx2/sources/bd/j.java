package bd;

import Kc.InterfaceC0933e;
import Kc.K;
import cd.C1750a;
import dd.C3026c;
import dd.C3035l;
import java.util.Collection;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ud.C4889g;
import wd.C5077i;
import wd.EnumC5073e;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19009b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Set f19010c = O.c(C1750a.EnumC0347a.CLASS);

    /* renamed from: d, reason: collision with root package name */
    private static final Set f19011d = O.h(C1750a.EnumC0347a.FILE_FACADE, C1750a.EnumC0347a.MULTIFILE_CLASS_PART);

    /* renamed from: e, reason: collision with root package name */
    private static final hd.e f19012e = new hd.e(1, 1, 2);

    /* renamed from: f, reason: collision with root package name */
    private static final hd.e f19013f = new hd.e(1, 1, 11);

    /* renamed from: g, reason: collision with root package name */
    private static final hd.e f19014g = new hd.e(1, 1, 13);

    /* renamed from: a, reason: collision with root package name */
    public ud.k f19015a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hd.e a() {
            return j.f19014g;
        }

        private a() {
        }
    }

    static final class b extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f19016a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke() {
            return CollectionsKt.j();
        }
    }

    private final EnumC5073e c(t tVar) {
        return d().g().b() ? EnumC5073e.STABLE : tVar.a().j() ? EnumC5073e.FIR_UNSTABLE : tVar.a().k() ? EnumC5073e.IR_UNSTABLE : EnumC5073e.STABLE;
    }

    private final ud.t e(t tVar) {
        if (g() || tVar.a().d().h(f())) {
            return null;
        }
        return new ud.t(tVar.a().d(), hd.e.f34067i, f(), f().k(tVar.a().d().j()), tVar.getLocation(), tVar.l());
    }

    private final hd.e f() {
        return Gd.c.a(d().g());
    }

    private final boolean g() {
        return d().g().e();
    }

    private final boolean h(t tVar) {
        return !d().g().c() && tVar.a().i() && Intrinsics.b(tVar.a().d(), f19013f);
    }

    private final boolean i(t tVar) {
        return (d().g().f() && (tVar.a().i() || Intrinsics.b(tVar.a().d(), f19012e))) || h(tVar);
    }

    private final String[] k(t tVar, Set set) {
        C1750a a10 = tVar.a();
        String[] a11 = a10.a();
        if (a11 == null) {
            a11 = a10.b();
        }
        if (a11 == null || !set.contains(a10.c())) {
            return null;
        }
        return a11;
    }

    public final rd.h b(K descriptor, t kotlinClass) {
        Pair pair;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        String[] k10 = k(kotlinClass, f19011d);
        if (k10 == null) {
            return null;
        }
        String[] g10 = kotlinClass.a().g();
        try {
        } catch (Throwable th) {
            if (g() || kotlinClass.a().d().h(f())) {
                throw th;
            }
            pair = null;
        }
        if (g10 == null) {
            return null;
        }
        try {
            pair = hd.i.m(k10, g10);
            if (pair == null) {
                return null;
            }
            hd.f fVar = (hd.f) pair.getFirst();
            C3035l c3035l = (C3035l) pair.getSecond();
            n nVar = new n(kotlinClass, c3035l, fVar, e(kotlinClass), i(kotlinClass), c(kotlinClass));
            return new C5077i(descriptor, c3035l, fVar, kotlinClass.a().d(), nVar, d(), "scope for " + nVar + " in " + descriptor, b.f19016a);
        } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
            throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e10);
        }
    }

    public final ud.k d() {
        ud.k kVar = this.f19015a;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.v("components");
        return null;
    }

    public final C4889g j(t kotlinClass) {
        String[] g10;
        Pair pair;
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        String[] k10 = k(kotlinClass, f19010c);
        if (k10 == null || (g10 = kotlinClass.a().g()) == null) {
            return null;
        }
        try {
            try {
                pair = hd.i.i(k10, g10);
            } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e10);
            }
        } catch (Throwable th) {
            if (g() || kotlinClass.a().d().h(f())) {
                throw th;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        return new C4889g((hd.f) pair.getFirst(), (C3026c) pair.getSecond(), kotlinClass.a().d(), new v(kotlinClass, e(kotlinClass), i(kotlinClass), c(kotlinClass)));
    }

    public final InterfaceC0933e l(t kotlinClass) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        C4889g j10 = j(kotlinClass);
        if (j10 == null) {
            return null;
        }
        return d().f().d(kotlinClass.l(), j10);
    }

    public final void m(h components) {
        Intrinsics.checkNotNullParameter(components, "components");
        n(components.a());
    }

    public final void n(ud.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f19015a = kVar;
    }
}
