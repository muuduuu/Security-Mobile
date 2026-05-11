package rd;

import Kc.InterfaceC0936h;
import Kc.Z;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class i implements h {
    @Override // rd.h
    public Collection a(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return CollectionsKt.j();
    }

    @Override // rd.h
    public Set b() {
        Collection g10 = g(d.f40625v, Gd.e.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : g10) {
            if (obj instanceof Z) {
                id.f name = ((Z) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // rd.h
    public Collection c(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return CollectionsKt.j();
    }

    @Override // rd.h
    public Set d() {
        Collection g10 = g(d.f40626w, Gd.e.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : g10) {
            if (obj instanceof Z) {
                id.f name = ((Z) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // rd.h
    public Set e() {
        return null;
    }

    @Override // rd.k
    public InterfaceC0936h f(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // rd.k
    public Collection g(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt.j();
    }
}
