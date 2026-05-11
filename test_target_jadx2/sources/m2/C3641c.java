package m2;

import D2.k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: m2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3641c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f37294a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final b f37295b = new b();

    /* renamed from: m2.c$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Lock f37296a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        int f37297b;

        a() {
        }
    }

    /* renamed from: m2.c$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue f37298a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVar;
            synchronized (this.f37298a) {
                aVar = (a) this.f37298a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        void b(a aVar) {
            synchronized (this.f37298a) {
                try {
                    if (this.f37298a.size() < 10) {
                        this.f37298a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    C3641c() {
    }

    void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) this.f37294a.get(str);
                if (aVar == null) {
                    aVar = this.f37295b.a();
                    this.f37294a.put(str, aVar);
                }
                aVar.f37297b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f37296a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.d(this.f37294a.get(str));
                int i10 = aVar.f37297b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f37297b);
                }
                int i11 = i10 - 1;
                aVar.f37297b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f37294a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f37295b.b(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f37296a.unlock();
    }
}
