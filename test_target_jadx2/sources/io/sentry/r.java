package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class r implements InterfaceC3466x {

    /* renamed from: a, reason: collision with root package name */
    private final Map f35485a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final P1 f35486b;

    public r(P1 p12) {
        this.f35486b = (P1) io.sentry.util.n.c(p12, "options are required");
    }

    private static List a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th.getCause() != null) {
            arrayList.add(th.getCause());
            th = th.getCause();
        }
        return arrayList;
    }

    private static boolean c(Map map, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (map.containsKey(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.InterfaceC3466x
    public A1 b(A1 a12, A a10) {
        if (this.f35486b.isEnableDeduplication()) {
            Throwable O10 = a12.O();
            if (O10 != null) {
                if (this.f35485a.containsKey(O10) || c(this.f35485a, a(O10))) {
                    this.f35486b.getLogger().c(K1.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", a12.G());
                    return null;
                }
                this.f35485a.put(O10, null);
            }
        } else {
            this.f35486b.getLogger().c(K1.DEBUG, "Event deduplication is disabled.", new Object[0]);
        }
        return a12;
    }
}
