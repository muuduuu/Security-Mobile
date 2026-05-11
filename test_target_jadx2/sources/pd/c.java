package pd;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Tc.g;
import Zc.D;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import rd.h;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Vc.f f38598a;

    /* renamed from: b, reason: collision with root package name */
    private final g f38599b;

    public c(Vc.f packageFragmentProvider, g javaResolverCache) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        this.f38598a = packageFragmentProvider;
        this.f38599b = javaResolverCache;
    }

    public final Vc.f a() {
        return this.f38598a;
    }

    public final InterfaceC0933e b(Zc.g javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        id.c e10 = javaClass.e();
        if (e10 != null && javaClass.P() == D.SOURCE) {
            return this.f38599b.d(e10);
        }
        Zc.g q10 = javaClass.q();
        if (q10 != null) {
            InterfaceC0933e b10 = b(q10);
            h G02 = b10 != null ? b10.G0() : null;
            InterfaceC0936h f10 = G02 != null ? G02.f(javaClass.getName(), Rc.d.FROM_JAVA_LOADER) : null;
            if (f10 instanceof InterfaceC0933e) {
                return (InterfaceC0933e) f10;
            }
            return null;
        }
        if (e10 == null) {
            return null;
        }
        Vc.f fVar = this.f38598a;
        id.c e11 = e10.e();
        Intrinsics.checkNotNullExpressionValue(e11, "parent(...)");
        Wc.h hVar = (Wc.h) CollectionsKt.firstOrNull(fVar.c(e11));
        if (hVar != null) {
            return hVar.V0(javaClass);
        }
        return null;
    }
}
