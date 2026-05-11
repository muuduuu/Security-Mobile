package rd;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0937i;
import Kc.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends i {

    /* renamed from: b, reason: collision with root package name */
    private final h f40640b;

    public f(h workerScope) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        this.f40640b = workerScope;
    }

    @Override // rd.i, rd.h
    public Set b() {
        return this.f40640b.b();
    }

    @Override // rd.i, rd.h
    public Set d() {
        return this.f40640b.d();
    }

    @Override // rd.i, rd.h
    public Set e() {
        return this.f40640b.e();
    }

    @Override // rd.i, rd.k
    public InterfaceC0936h f(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        InterfaceC0936h f10 = this.f40640b.f(name, location);
        if (f10 == null) {
            return null;
        }
        InterfaceC0933e interfaceC0933e = f10 instanceof InterfaceC0933e ? (InterfaceC0933e) f10 : null;
        if (interfaceC0933e != null) {
            return interfaceC0933e;
        }
        if (f10 instanceof e0) {
            return (e0) f10;
        }
        return null;
    }

    @Override // rd.i, rd.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public List g(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        d n10 = kindFilter.n(d.f40606c.c());
        if (n10 == null) {
            return CollectionsKt.j();
        }
        Collection g10 = this.f40640b.g(n10, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g10) {
            if (obj instanceof InterfaceC0937i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f40640b;
    }
}
