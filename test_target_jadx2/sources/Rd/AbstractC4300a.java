package rd;

import Kc.InterfaceC0936h;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4300a implements h {
    @Override // rd.h
    public Collection a(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().a(name, location);
    }

    @Override // rd.h
    public Set b() {
        return i().b();
    }

    @Override // rd.h
    public Collection c(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().c(name, location);
    }

    @Override // rd.h
    public Set d() {
        return i().d();
    }

    @Override // rd.h
    public Set e() {
        return i().e();
    }

    @Override // rd.k
    public InterfaceC0936h f(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().f(name, location);
    }

    @Override // rd.k
    public Collection g(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return i().g(kindFilter, nameFilter);
    }

    public final h h() {
        if (!(i() instanceof AbstractC4300a)) {
            return i();
        }
        h i10 = i();
        Intrinsics.e(i10, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractC4300a) i10).h();
    }

    protected abstract h i();
}
