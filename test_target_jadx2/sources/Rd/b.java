package rd;

import Kc.InterfaceC0936h;
import Kc.InterfaceC0937i;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rd.h;

/* loaded from: classes3.dex */
public final class b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final a f40600d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f40601b;

    /* renamed from: c, reason: collision with root package name */
    private final h[] f40602c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(String debugName, Iterable scopes) {
            Intrinsics.checkNotNullParameter(debugName, "debugName");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            Gd.f fVar = new Gd.f();
            Iterator it = scopes.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (hVar != h.b.f40647b) {
                    if (hVar instanceof b) {
                        CollectionsKt.A(fVar, ((b) hVar).f40602c);
                    } else {
                        fVar.add(hVar);
                    }
                }
            }
            return b(debugName, fVar);
        }

        public final h b(String debugName, List scopes) {
            Intrinsics.checkNotNullParameter(debugName, "debugName");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            int size = scopes.size();
            return size != 0 ? size != 1 ? new b(debugName, (h[]) scopes.toArray(new h[0]), null) : (h) scopes.get(0) : h.b.f40647b;
        }

        private a() {
        }
    }

    public /* synthetic */ b(String str, h[] hVarArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, hVarArr);
    }

    @Override // rd.h
    public Collection a(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        h[] hVarArr = this.f40602c;
        int length = hVarArr.length;
        if (length == 0) {
            return CollectionsKt.j();
        }
        if (length == 1) {
            return hVarArr[0].a(name, location);
        }
        Collection collection = null;
        for (h hVar : hVarArr) {
            collection = Fd.a.a(collection, hVar.a(name, location));
        }
        return collection == null ? O.d() : collection;
    }

    @Override // rd.h
    public Set b() {
        h[] hVarArr = this.f40602c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (h hVar : hVarArr) {
            CollectionsKt.z(linkedHashSet, hVar.b());
        }
        return linkedHashSet;
    }

    @Override // rd.h
    public Collection c(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        h[] hVarArr = this.f40602c;
        int length = hVarArr.length;
        if (length == 0) {
            return CollectionsKt.j();
        }
        if (length == 1) {
            return hVarArr[0].c(name, location);
        }
        Collection collection = null;
        for (h hVar : hVarArr) {
            collection = Fd.a.a(collection, hVar.c(name, location));
        }
        return collection == null ? O.d() : collection;
    }

    @Override // rd.h
    public Set d() {
        h[] hVarArr = this.f40602c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (h hVar : hVarArr) {
            CollectionsKt.z(linkedHashSet, hVar.d());
        }
        return linkedHashSet;
    }

    @Override // rd.h
    public Set e() {
        return j.a(AbstractC3574i.s(this.f40602c));
    }

    @Override // rd.k
    public InterfaceC0936h f(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        InterfaceC0936h interfaceC0936h = null;
        for (h hVar : this.f40602c) {
            InterfaceC0936h f10 = hVar.f(name, location);
            if (f10 != null) {
                if (!(f10 instanceof InterfaceC0937i) || !((InterfaceC0937i) f10).R()) {
                    return f10;
                }
                if (interfaceC0936h == null) {
                    interfaceC0936h = f10;
                }
            }
        }
        return interfaceC0936h;
    }

    @Override // rd.k
    public Collection g(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        h[] hVarArr = this.f40602c;
        int length = hVarArr.length;
        if (length == 0) {
            return CollectionsKt.j();
        }
        if (length == 1) {
            return hVarArr[0].g(kindFilter, nameFilter);
        }
        Collection collection = null;
        for (h hVar : hVarArr) {
            collection = Fd.a.a(collection, hVar.g(kindFilter, nameFilter));
        }
        return collection == null ? O.d() : collection;
    }

    public String toString() {
        return this.f40601b;
    }

    private b(String str, h[] hVarArr) {
        this.f40601b = str;
        this.f40602c = hVarArr;
    }
}
