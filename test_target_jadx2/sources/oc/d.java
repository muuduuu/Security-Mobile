package Oc;

import Pc.w;
import Sc.p;
import Zc.u;
import id.C3367b;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    private final ClassLoader f7285a;

    public d(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f7285a = classLoader;
    }

    @Override // Sc.p
    public Zc.g a(p.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        C3367b a10 = request.a();
        id.c h10 = a10.h();
        Intrinsics.checkNotNullExpressionValue(h10, "getPackageFqName(...)");
        String b10 = a10.i().b();
        Intrinsics.checkNotNullExpressionValue(b10, "asString(...)");
        String y10 = StringsKt.y(b10, '.', '$', false, 4, null);
        if (!h10.d()) {
            y10 = h10.b() + '.' + y10;
        }
        Class a11 = e.a(this.f7285a, y10);
        if (a11 != null) {
            return new Pc.l(a11);
        }
        return null;
    }

    @Override // Sc.p
    public Set b(id.c packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return null;
    }

    @Override // Sc.p
    public u c(id.c fqName, boolean z10) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return new w(fqName);
    }
}
