package rd;

import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.c0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ld.AbstractC3629d;
import rd.k;
import yd.l0;
import yd.n0;

/* loaded from: classes3.dex */
public final class m implements h {

    /* renamed from: b, reason: collision with root package name */
    private final h f40655b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f40656c;

    /* renamed from: d, reason: collision with root package name */
    private final n0 f40657d;

    /* renamed from: e, reason: collision with root package name */
    private Map f40658e;

    /* renamed from: f, reason: collision with root package name */
    private final Lazy f40659f;

    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke() {
            m mVar = m.this;
            return mVar.l(k.a.a(mVar.f40655b, null, null, 3, null));
        }
    }

    static final class b extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0 f40661a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n0 n0Var) {
            super(0);
            this.f40661a = n0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            return this.f40661a.j().c();
        }
    }

    public m(h workerScope, n0 givenSubstitutor) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        Intrinsics.checkNotNullParameter(givenSubstitutor, "givenSubstitutor");
        this.f40655b = workerScope;
        this.f40656c = lc.i.a(new b(givenSubstitutor));
        l0 j10 = givenSubstitutor.j();
        Intrinsics.checkNotNullExpressionValue(j10, "getSubstitution(...)");
        this.f40657d = AbstractC3629d.f(j10, false, 1, null).c();
        this.f40659f = lc.i.a(new a());
    }

    private final Collection j() {
        return (Collection) this.f40659f.getValue();
    }

    private final InterfaceC0941m k(InterfaceC0941m interfaceC0941m) {
        if (this.f40657d.k()) {
            return interfaceC0941m;
        }
        if (this.f40658e == null) {
            this.f40658e = new HashMap();
        }
        Map map = this.f40658e;
        Intrinsics.d(map);
        Object obj = map.get(interfaceC0941m);
        if (obj == null) {
            if (!(interfaceC0941m instanceof c0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC0941m).toString());
            }
            obj = ((c0) interfaceC0941m).c(this.f40657d);
            if (obj == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC0941m + " substitution fails");
            }
            map.put(interfaceC0941m, obj);
        }
        InterfaceC0941m interfaceC0941m2 = (InterfaceC0941m) obj;
        Intrinsics.e(interfaceC0941m2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return interfaceC0941m2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection l(Collection collection) {
        if (this.f40657d.k()) {
            return collection;
        }
        if (collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet g10 = Gd.a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g10.add(k((InterfaceC0941m) it.next()));
        }
        return g10;
    }

    @Override // rd.h
    public Collection a(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return l(this.f40655b.a(name, location));
    }

    @Override // rd.h
    public Set b() {
        return this.f40655b.b();
    }

    @Override // rd.h
    public Collection c(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return l(this.f40655b.c(name, location));
    }

    @Override // rd.h
    public Set d() {
        return this.f40655b.d();
    }

    @Override // rd.h
    public Set e() {
        return this.f40655b.e();
    }

    @Override // rd.k
    public InterfaceC0936h f(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        InterfaceC0936h f10 = this.f40655b.f(name, location);
        if (f10 != null) {
            return (InterfaceC0936h) k(f10);
        }
        return null;
    }

    @Override // rd.k
    public Collection g(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return j();
    }
}
