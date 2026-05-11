package X8;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1295a {

    /* renamed from: a, reason: collision with root package name */
    private final ReferenceQueue f11781a = new ReferenceQueue();

    /* renamed from: b, reason: collision with root package name */
    private final Set f11782b = Collections.synchronizedSet(new HashSet());

    /* renamed from: X8.a$a, reason: collision with other inner class name */
    public interface InterfaceC0219a {
        void a();
    }

    private C1295a() {
    }

    public static C1295a a() {
        C1295a c1295a = new C1295a();
        c1295a.b(c1295a, new Runnable() { // from class: X8.p
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = c1295a.f11781a;
        final Set set = c1295a.f11782b;
        Thread thread = new Thread(new Runnable() { // from class: X8.o
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                Set set2 = set;
                while (!set2.isEmpty()) {
                    try {
                        ((r) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c1295a;
    }

    public InterfaceC0219a b(Object obj, Runnable runnable) {
        r rVar = new r(obj, this.f11781a, this.f11782b, runnable, null);
        this.f11782b.add(rVar);
        return rVar;
    }
}
