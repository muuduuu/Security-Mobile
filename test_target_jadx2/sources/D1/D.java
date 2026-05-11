package D1;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class D {

    /* renamed from: e, reason: collision with root package name */
    private static final String f1129e = x1.n.i("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    final x1.w f1130a;

    /* renamed from: b, reason: collision with root package name */
    final Map f1131b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map f1132c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Object f1133d = new Object();

    public interface a {
        void a(C1.m mVar);
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final D f1134a;

        /* renamed from: b, reason: collision with root package name */
        private final C1.m f1135b;

        b(D d10, C1.m mVar) {
            this.f1134a = d10;
            this.f1135b = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f1134a.f1133d) {
                try {
                    if (((b) this.f1134a.f1131b.remove(this.f1135b)) != null) {
                        a aVar = (a) this.f1134a.f1132c.remove(this.f1135b);
                        if (aVar != null) {
                            aVar.a(this.f1135b);
                        }
                    } else {
                        x1.n.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f1135b));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public D(x1.w wVar) {
        this.f1130a = wVar;
    }

    public void a(C1.m mVar, long j10, a aVar) {
        synchronized (this.f1133d) {
            x1.n.e().a(f1129e, "Starting timer for " + mVar);
            b(mVar);
            b bVar = new b(this, mVar);
            this.f1131b.put(mVar, bVar);
            this.f1132c.put(mVar, aVar);
            this.f1130a.a(j10, bVar);
        }
    }

    public void b(C1.m mVar) {
        synchronized (this.f1133d) {
            try {
                if (((b) this.f1131b.remove(mVar)) != null) {
                    x1.n.e().a(f1129e, "Stopping timer for " + mVar);
                    this.f1132c.remove(mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
