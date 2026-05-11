package T6;

import V6.AbstractC1287s;
import android.os.Looper;
import c7.ExecutorC1737a;
import java.util.concurrent.Executor;

/* renamed from: T6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1181k {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f9438a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f9439b;

    /* renamed from: c, reason: collision with root package name */
    private volatile a f9440c;

    /* renamed from: T6.k$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f9441a;

        /* renamed from: b, reason: collision with root package name */
        private final String f9442b;

        a(Object obj, String str) {
            this.f9441a = obj;
            this.f9442b = str;
        }

        public String a() {
            return this.f9442b + "@" + System.identityHashCode(this.f9441a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9441a == aVar.f9441a && this.f9442b.equals(aVar.f9442b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f9441a) * 31) + this.f9442b.hashCode();
        }
    }

    /* renamed from: T6.k$b */
    public interface b {
        void a(Object obj);

        void b();
    }

    C1181k(Looper looper, Object obj, String str) {
        this.f9438a = new ExecutorC1737a(looper);
        this.f9439b = AbstractC1287s.n(obj, "Listener must not be null");
        this.f9440c = new a(obj, AbstractC1287s.g(str));
    }

    public void a() {
        this.f9439b = null;
        this.f9440c = null;
    }

    public a b() {
        return this.f9440c;
    }

    public void c(final b bVar) {
        AbstractC1287s.n(bVar, "Notifier must not be null");
        this.f9438a.execute(new Runnable() { // from class: T6.Z
            @Override // java.lang.Runnable
            public final void run() {
                C1181k.this.d(bVar);
            }
        });
    }

    final void d(b bVar) {
        Object obj = this.f9439b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e10) {
            bVar.b();
            throw e10;
        }
    }

    C1181k(Executor executor, Object obj, String str) {
        this.f9438a = (Executor) AbstractC1287s.n(executor, "Executor must not be null");
        this.f9439b = AbstractC1287s.n(obj, "Listener must not be null");
        this.f9440c = new a(obj, AbstractC1287s.g(str));
    }
}
