package Ec;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap f1941a = new ConcurrentHashMap();

    public static final Oc.k a(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader f10 = Pc.d.f(cls);
        M m10 = new M(f10);
        ConcurrentMap concurrentMap = f1941a;
        WeakReference weakReference = (WeakReference) concurrentMap.get(m10);
        if (weakReference != null) {
            Oc.k kVar = (Oc.k) weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(m10, weakReference);
        }
        Oc.k a10 = Oc.k.f7293c.a(f10);
        while (true) {
            try {
                ConcurrentMap concurrentMap2 = f1941a;
                WeakReference weakReference2 = (WeakReference) concurrentMap2.putIfAbsent(m10, new WeakReference(a10));
                if (weakReference2 == null) {
                    return a10;
                }
                Oc.k kVar2 = (Oc.k) weakReference2.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(m10, weakReference2);
            } finally {
                m10.a(null);
            }
        }
    }
}
