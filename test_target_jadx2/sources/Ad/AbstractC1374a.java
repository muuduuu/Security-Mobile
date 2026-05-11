package ad;

import Sc.AbstractC1151a;
import Sc.EnumC1152b;
import Sc.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ad.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1374a {

    /* renamed from: ad.a$a, reason: collision with other inner class name */
    private static final class C0235a {

        /* renamed from: a, reason: collision with root package name */
        private final Ad.i f12651a;

        /* renamed from: b, reason: collision with root package name */
        private final y f12652b;

        /* renamed from: c, reason: collision with root package name */
        private final Ad.n f12653c;

        public C0235a(Ad.i iVar, y yVar, Ad.n nVar) {
            this.f12651a = iVar;
            this.f12652b = yVar;
            this.f12653c = nVar;
        }

        public final y a() {
            return this.f12652b;
        }

        public final Ad.i b() {
            return this.f12651a;
        }

        public final Ad.n c() {
            return this.f12653c;
        }
    }

    /* renamed from: ad.a$b */
    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1392q f12654a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1378e[] f12655b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1392q c1392q, C1378e[] c1378eArr) {
            super(1);
            this.f12654a = c1392q;
            this.f12655b = c1378eArr;
        }

        public final C1378e a(int i10) {
            Map a10;
            C1378e c1378e;
            C1392q c1392q = this.f12654a;
            if (c1392q != null && (a10 = c1392q.a()) != null && (c1378e = (C1378e) a10.get(Integer.valueOf(i10))) != null) {
                return c1378e;
            }
            C1378e[] c1378eArr = this.f12655b;
            return (i10 < 0 || i10 > AbstractC3574i.D(c1378eArr)) ? C1378e.f12668e.a() : c1378eArr[i10];
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* renamed from: ad.a$c */
    static final class c extends xc.m implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0235a f12657b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C0235a c0235a) {
            super(1);
            this.f12657b = c0235a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object extractNullability) {
            Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
            return Boolean.valueOf(AbstractC1374a.this.h(extractNullability, this.f12657b.b()));
        }
    }

    /* renamed from: ad.a$d */
    static final class d extends xc.m implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ad.o f12659b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Ad.o oVar) {
            super(1);
            this.f12659b = oVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterable invoke(C0235a it) {
            Ad.i b10;
            Ad.m e02;
            List S10;
            C0235a c0235a;
            Ad.i b11;
            Intrinsics.checkNotNullParameter(it, "it");
            if ((AbstractC1374a.this.u() && (b11 = it.b()) != null && this.f12659b.K(b11)) || (b10 = it.b()) == null || (e02 = this.f12659b.e0(b10)) == null || (S10 = this.f12659b.S(e02)) == null) {
                return null;
            }
            List list = S10;
            List D10 = this.f12659b.D(it.b());
            Ad.o oVar = this.f12659b;
            AbstractC1374a abstractC1374a = AbstractC1374a.this;
            Iterator it2 = list.iterator();
            Iterator it3 = D10.iterator();
            ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.u(list, 10), CollectionsKt.u(D10, 10)));
            while (it2.hasNext() && it3.hasNext()) {
                Object next = it2.next();
                Ad.l lVar = (Ad.l) it3.next();
                Ad.n nVar = (Ad.n) next;
                if (oVar.E(lVar)) {
                    c0235a = new C0235a(null, it.a(), nVar);
                } else {
                    Ad.i n02 = oVar.n0(lVar);
                    c0235a = new C0235a(n02, abstractC1374a.c(n02, it.a()), nVar);
                }
                arrayList.add(c0235a);
            }
            return arrayList;
        }
    }

    private final C1382i B(C1382i c1382i, C1382i c1382i2) {
        return c1382i == null ? c1382i2 : c1382i2 == null ? c1382i : (!c1382i.d() || c1382i2.d()) ? (c1382i.d() || !c1382i2.d()) ? c1382i.c().compareTo(c1382i2.c()) < 0 ? c1382i2 : c1382i.c().compareTo(c1382i2.c()) > 0 ? c1382i : c1382i2 : c1382i : c1382i2;
    }

    private final List C(Ad.i iVar) {
        return f(new C0235a(iVar, c(iVar, n()), null), new d(v()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y c(Ad.i iVar, y yVar) {
        return i().c(yVar, j(iVar));
    }

    private final C1378e d(Ad.i iVar) {
        EnumC1381h enumC1381h;
        EnumC1381h t10 = t(iVar);
        EnumC1379f enumC1379f = null;
        if (t10 == null) {
            Ad.i q10 = q(iVar);
            enumC1381h = q10 != null ? t(q10) : null;
        } else {
            enumC1381h = t10;
        }
        Ad.o v10 = v();
        Jc.c cVar = Jc.c.f4890a;
        if (cVar.l(s(v10.V(iVar)))) {
            enumC1379f = EnumC1379f.READ_ONLY;
        } else if (cVar.k(s(v10.t0(iVar)))) {
            enumC1379f = EnumC1379f.MUTABLE;
        }
        return new C1378e(enumC1381h, enumC1379f, v().N(iVar) || A(iVar), enumC1381h != t10);
    }

    private final C1378e e(C0235a c0235a) {
        List j10;
        C1382i d10;
        C1382i c1382i;
        Ad.i b10;
        Ad.m e02;
        if (c0235a.b() == null) {
            Ad.o v10 = v();
            Ad.n c10 = c0235a.c();
            if ((c10 != null ? v10.h(c10) : null) == Ad.s.IN) {
                return C1378e.f12668e.a();
            }
        }
        boolean z10 = false;
        boolean z11 = c0235a.c() == null;
        Ad.i b11 = c0235a.b();
        if (b11 == null || (j10 = j(b11)) == null) {
            j10 = CollectionsKt.j();
        }
        Ad.o v11 = v();
        Ad.i b12 = c0235a.b();
        Ad.n C02 = (b12 == null || (e02 = v11.e0(b12)) == null) ? null : v11.C0(e02);
        boolean z12 = m() == EnumC1152b.TYPE_PARAMETER_BOUNDS;
        if (z11) {
            if (z12 || !p() || (b10 = c0235a.b()) == null || !w(b10)) {
                j10 = CollectionsKt.u0(l(), j10);
            } else {
                Iterable l10 = l();
                ArrayList arrayList = new ArrayList();
                for (Object obj : l10) {
                    if (!i().m(obj)) {
                        arrayList.add(obj);
                    }
                }
                j10 = CollectionsKt.w0(arrayList, j10);
            }
        }
        EnumC1379f e10 = i().e(j10);
        C1382i f10 = i().f(j10, new c(c0235a));
        if (f10 != null) {
            EnumC1381h c11 = f10.c();
            if (f10.c() == EnumC1381h.NOT_NULL && C02 != null) {
                z10 = true;
            }
            return new C1378e(c11, e10, z10, f10.d());
        }
        EnumC1152b m10 = (z11 || z12) ? m() : EnumC1152b.TYPE_USE;
        y a10 = c0235a.a();
        Sc.r a11 = a10 != null ? a10.a(m10) : null;
        C1382i k10 = C02 != null ? k(C02) : null;
        if (k10 == null || (d10 = C1382i.b(k10, EnumC1381h.NOT_NULL, false, 2, null)) == null) {
            d10 = a11 != null ? a11.d() : null;
        }
        boolean z13 = (k10 != null ? k10.c() : null) == EnumC1381h.NOT_NULL || !(C02 == null || a11 == null || !a11.c());
        Ad.n c12 = c0235a.c();
        if (c12 == null || (c1382i = k(c12)) == null) {
            c1382i = null;
        } else if (c1382i.c() == EnumC1381h.NULLABLE) {
            c1382i = C1382i.b(c1382i, EnumC1381h.FORCE_FLEXIBILITY, false, 2, null);
        }
        C1382i B10 = B(c1382i, d10);
        EnumC1381h c13 = B10 != null ? B10.c() : null;
        if (B10 != null && B10.d()) {
            z10 = true;
        }
        return new C1378e(c13, e10, z13, z10);
    }

    private final List f(Object obj, Function1 function1) {
        ArrayList arrayList = new ArrayList(1);
        g(obj, arrayList, function1);
        return arrayList;
    }

    private final void g(Object obj, List list, Function1 function1) {
        list.add(obj);
        Iterable iterable = (Iterable) function1.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next(), list, function1);
            }
        }
    }

    private final C1382i k(Ad.n nVar) {
        List list;
        EnumC1381h enumC1381h;
        Ad.o v10 = v();
        if (!z(nVar)) {
            return null;
        }
        List i02 = v10.i0(nVar);
        List list2 = i02;
        boolean z10 = list2 instanceof Collection;
        if (!z10 || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!v10.l0((Ad.i) it.next())) {
                    if (!z10 || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (t((Ad.i) it2.next()) != null) {
                                list = i02;
                                break;
                            }
                        }
                    }
                    if (!z10 || !list2.isEmpty()) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (q((Ad.i) it3.next()) != null) {
                                list = new ArrayList();
                                Iterator it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    Ad.i q10 = q((Ad.i) it4.next());
                                    if (q10 != null) {
                                        list.add(q10);
                                    }
                                }
                                List list3 = list;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator it5 = list3.iterator();
                                    while (it5.hasNext()) {
                                        if (!v10.z0((Ad.i) it5.next())) {
                                            enumC1381h = EnumC1381h.NOT_NULL;
                                            break;
                                        }
                                    }
                                }
                                enumC1381h = EnumC1381h.NULLABLE;
                                return new C1382i(enumC1381h, list != i02);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private final EnumC1381h t(Ad.i iVar) {
        Ad.o v10 = v();
        if (v10.u(v10.V(iVar))) {
            return EnumC1381h.NULLABLE;
        }
        if (v10.u(v10.t0(iVar))) {
            return null;
        }
        return EnumC1381h.NOT_NULL;
    }

    public abstract boolean A(Ad.i iVar);

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Function1 b(Ad.i iVar, Iterable overrides, C1392q c1392q, boolean z10) {
        int i10;
        int i11;
        Ad.i b10;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        List C10 = C(iVar);
        ArrayList arrayList = new ArrayList(CollectionsKt.u(overrides, 10));
        Iterator it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(C((Ad.i) it.next()));
        }
        if (!r()) {
            if (x() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
                Iterator it2 = overrides.iterator();
                while (it2.hasNext()) {
                    if (!y(iVar, (Ad.i) it2.next())) {
                    }
                }
            }
            i10 = C10.size();
            C1378e[] c1378eArr = new C1378e[i10];
            i11 = 0;
            while (i11 < i10) {
                C1378e e10 = e((C0235a) C10.get(i11));
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C0235a c0235a = (C0235a) CollectionsKt.f0((List) it3.next(), i11);
                    C1378e d10 = (c0235a == null || (b10 = c0235a.b()) == null) ? null : d(b10);
                    if (d10 != null) {
                        arrayList2.add(d10);
                    }
                }
                c1378eArr[i11] = AbstractC1394s.a(e10, arrayList2, i11 == 0 && x(), i11 == 0 && o(), z10);
                i11++;
            }
            return new b(c1392q, c1378eArr);
        }
        i10 = 1;
        C1378e[] c1378eArr2 = new C1378e[i10];
        i11 = 0;
        while (i11 < i10) {
        }
        return new b(c1392q, c1378eArr2);
    }

    public abstract boolean h(Object obj, Ad.i iVar);

    public abstract AbstractC1151a i();

    public abstract Iterable j(Ad.i iVar);

    public abstract Iterable l();

    public abstract EnumC1152b m();

    public abstract y n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract Ad.i q(Ad.i iVar);

    public boolean r() {
        return false;
    }

    public abstract id.d s(Ad.i iVar);

    public abstract boolean u();

    public abstract Ad.o v();

    public abstract boolean w(Ad.i iVar);

    public abstract boolean x();

    public abstract boolean y(Ad.i iVar, Ad.i iVar2);

    public abstract boolean z(Ad.n nVar);
}
