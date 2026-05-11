package C5;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
class k {

    /* renamed from: a, reason: collision with root package name */
    private final Object f927a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f928b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final ReferenceQueue f929c = new ReferenceQueue();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final k f930a = new k();
    }

    k() {
    }

    public static k a() {
        return a.f930a;
    }

    private void b() {
        while (true) {
            SoftReference softReference = (SoftReference) this.f929c.poll();
            if (softReference == null) {
                return;
            } else {
                this.f928b.remove(softReference);
            }
        }
    }

    public SoftReference c(C5.a aVar) {
        SoftReference softReference = new SoftReference(aVar, this.f929c);
        this.f928b.put(softReference, Boolean.TRUE);
        b();
        return softReference;
    }
}
