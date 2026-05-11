package Mc;

import Kc.P;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rd.c;

/* loaded from: classes3.dex */
public class H extends rd.i {

    /* renamed from: b, reason: collision with root package name */
    private final Kc.G f6191b;

    /* renamed from: c, reason: collision with root package name */
    private final id.c f6192c;

    public H(Kc.G moduleDescriptor, id.c fqName) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f6191b = moduleDescriptor;
        this.f6192c = fqName;
    }

    @Override // rd.i, rd.h
    public Set e() {
        return O.d();
    }

    @Override // rd.i, rd.k
    public Collection g(rd.d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        if (!kindFilter.a(rd.d.f40606c.f())) {
            return CollectionsKt.j();
        }
        if (this.f6192c.d() && kindFilter.l().contains(c.b.f40605a)) {
            return CollectionsKt.j();
        }
        Collection t10 = this.f6191b.t(this.f6192c, nameFilter);
        ArrayList arrayList = new ArrayList(t10.size());
        Iterator it = t10.iterator();
        while (it.hasNext()) {
            id.f g10 = ((id.c) it.next()).g();
            Intrinsics.checkNotNullExpressionValue(g10, "shortName(...)");
            if (((Boolean) nameFilter.invoke(g10)).booleanValue()) {
                Gd.a.a(arrayList, h(g10));
            }
        }
        return arrayList;
    }

    protected final P h(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.p()) {
            return null;
        }
        Kc.G g10 = this.f6191b;
        id.c c10 = this.f6192c.c(name);
        Intrinsics.checkNotNullExpressionValue(c10, "child(...)");
        P p02 = g10.p0(c10);
        if (p02.isEmpty()) {
            return null;
        }
        return p02;
    }

    public String toString() {
        return "subpackages of " + this.f6192c + " from " + this.f6191b;
    }
}
