package androidx.work.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private final Object f18153a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f18154b = new LinkedHashMap();

    public final boolean a(C1.m id2) {
        boolean containsKey;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f18153a) {
            containsKey = this.f18154b.containsKey(id2);
        }
        return containsKey;
    }

    public final A b(C1.m id2) {
        A a10;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f18153a) {
            a10 = (A) this.f18154b.remove(id2);
        }
        return a10;
    }

    public final List c(String workSpecId) {
        List O02;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f18153a) {
            try {
                Map map = this.f18154b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (Intrinsics.b(((C1.m) entry.getKey()).b(), workSpecId)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    this.f18154b.remove((C1.m) it.next());
                }
                O02 = CollectionsKt.O0(linkedHashMap.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return O02;
    }

    public final A d(C1.m id2) {
        A a10;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f18153a) {
            try {
                Map map = this.f18154b;
                Object obj = map.get(id2);
                if (obj == null) {
                    obj = new A(id2);
                    map.put(id2, obj);
                }
                a10 = (A) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a10;
    }

    public final A e(C1.u spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return d(C1.x.a(spec));
    }
}
