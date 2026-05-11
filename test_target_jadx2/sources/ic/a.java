package Ic;

import Ic.g;
import Kc.G;
import Kc.InterfaceC0933e;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import xd.n;

/* loaded from: classes3.dex */
public final class a implements Lc.b {

    /* renamed from: a, reason: collision with root package name */
    private final n f4399a;

    /* renamed from: b, reason: collision with root package name */
    private final G f4400b;

    public a(n storageManager, G module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f4399a = storageManager;
        this.f4400b = module;
    }

    @Override // Lc.b
    public InterfaceC0933e a(C3367b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (classId.k() || classId.l()) {
            return null;
        }
        String b10 = classId.i().b();
        Intrinsics.checkNotNullExpressionValue(b10, "asString(...)");
        if (!StringsKt.K(b10, "Function", false, 2, null)) {
            return null;
        }
        id.c h10 = classId.h();
        Intrinsics.checkNotNullExpressionValue(h10, "getPackageFqName(...)");
        g.b c10 = g.f4422c.a().c(h10, b10);
        if (c10 == null) {
            return null;
        }
        f a10 = c10.a();
        int b11 = c10.b();
        List O10 = this.f4400b.p0(h10).O();
        ArrayList arrayList = new ArrayList();
        for (Object obj : O10) {
            if (obj instanceof Hc.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        android.support.v4.media.session.b.a(CollectionsKt.firstOrNull(arrayList2));
        return new b(this.f4399a, (Hc.b) CollectionsKt.d0(arrayList), a10, b11);
    }

    @Override // Lc.b
    public boolean b(id.c packageFqName, id.f name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        String c10 = name.c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        return (StringsKt.F(c10, "Function", false, 2, null) || StringsKt.F(c10, "KFunction", false, 2, null) || StringsKt.F(c10, "SuspendFunction", false, 2, null) || StringsKt.F(c10, "KSuspendFunction", false, 2, null)) && g.f4422c.a().c(packageFqName, c10) != null;
    }

    @Override // Lc.b
    public Collection c(id.c packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return O.d();
    }
}
