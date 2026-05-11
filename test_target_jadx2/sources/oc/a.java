package Oc;

import Mc.C0987m;
import bd.s;
import bd.t;
import cd.C1750a;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final bd.j f7280a;

    /* renamed from: b, reason: collision with root package name */
    private final g f7281b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f7282c;

    public a(bd.j resolver, g kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f7280a = resolver;
        this.f7281b = kotlinClassFinder;
        this.f7282c = new ConcurrentHashMap();
    }

    public final rd.h a(f fileClass) {
        Collection e10;
        Intrinsics.checkNotNullParameter(fileClass, "fileClass");
        ConcurrentHashMap concurrentHashMap = this.f7282c;
        C3367b l10 = fileClass.l();
        Object obj = concurrentHashMap.get(l10);
        if (obj == null) {
            id.c h10 = fileClass.l().h();
            Intrinsics.checkNotNullExpressionValue(h10, "getPackageFqName(...)");
            if (fileClass.a().c() == C1750a.EnumC0347a.MULTIFILE_CLASS) {
                List f10 = fileClass.a().f();
                e10 = new ArrayList();
                Iterator it = f10.iterator();
                while (it.hasNext()) {
                    C3367b m10 = C3367b.m(pd.d.d((String) it.next()).e());
                    Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
                    t b10 = s.b(this.f7281b, m10, Gd.c.a(this.f7280a.d().g()));
                    if (b10 != null) {
                        e10.add(b10);
                    }
                }
            } else {
                e10 = CollectionsKt.e(fileClass);
            }
            C0987m c0987m = new C0987m(this.f7280a.d().q(), h10);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = e10.iterator();
            while (it2.hasNext()) {
                rd.h b11 = this.f7280a.b(c0987m, (t) it2.next());
                if (b11 != null) {
                    arrayList.add(b11);
                }
            }
            List O02 = CollectionsKt.O0(arrayList);
            rd.h a10 = rd.b.f40600d.a("package " + h10 + " (" + fileClass + ')', O02);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(l10, a10);
            obj = putIfAbsent == null ? a10 : putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return (rd.h) obj;
    }
}
