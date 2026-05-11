package Vc;

import Kc.O;
import Sc.o;
import Vc.k;
import Zc.u;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xc.m;
import xd.InterfaceC5157a;

/* loaded from: classes3.dex */
public final class f implements O {

    /* renamed from: a, reason: collision with root package name */
    private final g f11141a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5157a f11142b;

    static final class a extends m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f11144b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u uVar) {
            super(0);
            this.f11144b = uVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Wc.h invoke() {
            return new Wc.h(f.this.f11141a, this.f11144b);
        }
    }

    public f(b components) {
        Intrinsics.checkNotNullParameter(components, "components");
        g gVar = new g(components, k.a.f11157a, lc.i.c(null));
        this.f11141a = gVar;
        this.f11142b = gVar.e().b();
    }

    private final Wc.h e(id.c cVar) {
        u a10 = o.a(this.f11141a.a().d(), cVar, false, 2, null);
        if (a10 == null) {
            return null;
        }
        return (Wc.h) this.f11142b.a(cVar, new a(a10));
    }

    @Override // Kc.O
    public boolean a(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return o.a(this.f11141a.a().d(), fqName, false, 2, null) == null;
    }

    @Override // Kc.O
    public void b(id.c fqName, Collection packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        Gd.a.a(packageFragments, e(fqName));
    }

    @Override // Kc.L
    public List c(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return CollectionsKt.n(e(fqName));
    }

    @Override // Kc.L
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List t(id.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Wc.h e10 = e(fqName);
        List Y02 = e10 != null ? e10.Y0() : null;
        return Y02 == null ? CollectionsKt.j() : Y02;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f11141a.a().m();
    }
}
