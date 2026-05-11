package Wc;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0937i;
import bd.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xc.C5142C;
import xc.u;

/* loaded from: classes3.dex */
public final class d implements rd.h {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f11437f = {C5142C.k(new u(C5142C.b(d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b, reason: collision with root package name */
    private final Vc.g f11438b;

    /* renamed from: c, reason: collision with root package name */
    private final h f11439c;

    /* renamed from: d, reason: collision with root package name */
    private final i f11440d;

    /* renamed from: e, reason: collision with root package name */
    private final xd.i f11441e;

    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rd.h[] invoke() {
            Collection values = d.this.f11439c.W0().values();
            d dVar = d.this;
            ArrayList arrayList = new ArrayList();
            Iterator it = values.iterator();
            while (it.hasNext()) {
                rd.h b10 = dVar.f11438b.a().b().b(dVar.f11439c, (t) it.next());
                if (b10 != null) {
                    arrayList.add(b10);
                }
            }
            return (rd.h[]) Fd.a.b(arrayList).toArray(new rd.h[0]);
        }
    }

    public d(Vc.g c10, Zc.u jPackage, h packageFragment) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f11438b = c10;
        this.f11439c = packageFragment;
        this.f11440d = new i(c10, jPackage, packageFragment);
        this.f11441e = c10.e().d(new a());
    }

    private final rd.h[] k() {
        return (rd.h[]) xd.m.a(this.f11441e, this, f11437f[0]);
    }

    @Override // rd.h
    public Collection a(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        l(name, location);
        i iVar = this.f11440d;
        rd.h[] k10 = k();
        Collection a10 = iVar.a(name, location);
        for (rd.h hVar : k10) {
            a10 = Fd.a.a(a10, hVar.a(name, location));
        }
        return a10 == null ? O.d() : a10;
    }

    @Override // rd.h
    public Set b() {
        rd.h[] k10 = k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (rd.h hVar : k10) {
            CollectionsKt.z(linkedHashSet, hVar.b());
        }
        linkedHashSet.addAll(this.f11440d.b());
        return linkedHashSet;
    }

    @Override // rd.h
    public Collection c(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        l(name, location);
        i iVar = this.f11440d;
        rd.h[] k10 = k();
        Collection c10 = iVar.c(name, location);
        for (rd.h hVar : k10) {
            c10 = Fd.a.a(c10, hVar.c(name, location));
        }
        return c10 == null ? O.d() : c10;
    }

    @Override // rd.h
    public Set d() {
        rd.h[] k10 = k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (rd.h hVar : k10) {
            CollectionsKt.z(linkedHashSet, hVar.d());
        }
        linkedHashSet.addAll(this.f11440d.d());
        return linkedHashSet;
    }

    @Override // rd.h
    public Set e() {
        Set a10 = rd.j.a(AbstractC3574i.s(k()));
        if (a10 == null) {
            return null;
        }
        a10.addAll(this.f11440d.e());
        return a10;
    }

    @Override // rd.k
    public InterfaceC0936h f(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        l(name, location);
        InterfaceC0933e f10 = this.f11440d.f(name, location);
        if (f10 != null) {
            return f10;
        }
        InterfaceC0936h interfaceC0936h = null;
        for (rd.h hVar : k()) {
            InterfaceC0936h f11 = hVar.f(name, location);
            if (f11 != null) {
                if (!(f11 instanceof InterfaceC0937i) || !((InterfaceC0937i) f11).R()) {
                    return f11;
                }
                if (interfaceC0936h == null) {
                    interfaceC0936h = f11;
                }
            }
        }
        return interfaceC0936h;
    }

    @Override // rd.k
    public Collection g(rd.d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        i iVar = this.f11440d;
        rd.h[] k10 = k();
        Collection g10 = iVar.g(kindFilter, nameFilter);
        for (rd.h hVar : k10) {
            g10 = Fd.a.a(g10, hVar.g(kindFilter, nameFilter));
        }
        return g10 == null ? O.d() : g10;
    }

    public final i j() {
        return this.f11440d;
    }

    public void l(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        Qc.a.b(this.f11438b.a().l(), location, this.f11439c, name);
    }

    public String toString() {
        return "scope for " + this.f11439c;
    }
}
