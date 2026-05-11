package D7;

import V6.AbstractC1287s;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class N extends Task {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1333a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final J f1334b = new J();

    /* renamed from: c, reason: collision with root package name */
    private boolean f1335c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f1336d;

    /* renamed from: e, reason: collision with root package name */
    private Object f1337e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f1338f;

    N() {
    }

    private final void u() {
        AbstractC1287s.q(this.f1335c, "Task is not yet complete");
    }

    private final void v() {
        if (this.f1336d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void w() {
        if (this.f1335c) {
            throw C0780d.a(this);
        }
    }

    private final void x() {
        synchronized (this.f1333a) {
            try {
                if (this.f1335c) {
                    this.f1334b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task a(InterfaceC0781e interfaceC0781e) {
        b(AbstractC0788l.f1343a, interfaceC0781e);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.f1334b.a(new B(AbstractC0788l.f1343a, onCompleteListener));
        x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task b(Executor executor, InterfaceC0781e interfaceC0781e) {
        this.f1334b.a(new z(executor, interfaceC0781e));
        x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task c(Executor executor, OnCompleteListener onCompleteListener) {
        this.f1334b.a(new B(executor, onCompleteListener));
        x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task d(InterfaceC0782f interfaceC0782f) {
        e(AbstractC0788l.f1343a, interfaceC0782f);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task e(Executor executor, InterfaceC0782f interfaceC0782f) {
        this.f1334b.a(new D(executor, interfaceC0782f));
        x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(InterfaceC0783g interfaceC0783g) {
        g(AbstractC0788l.f1343a, interfaceC0783g);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task g(Executor executor, InterfaceC0783g interfaceC0783g) {
        this.f1334b.a(new F(executor, interfaceC0783g));
        x();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f1333a) {
            exc = this.f1338f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.f1333a) {
            try {
                u();
                v();
                Exception exc = this.f1338f;
                if (exc != null) {
                    throw new C0785i(exc);
                }
                obj = this.f1337e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task h(InterfaceC0779c interfaceC0779c) {
        return i(AbstractC0788l.f1343a, interfaceC0779c);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task i(Executor executor, InterfaceC0779c interfaceC0779c) {
        N n10 = new N();
        this.f1334b.a(new v(executor, interfaceC0779c, n10));
        x();
        return n10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z10;
        synchronized (this.f1333a) {
            try {
                z10 = false;
                if (this.f1335c && !this.f1336d && this.f1338f == null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task j(Executor executor, InterfaceC0779c interfaceC0779c) {
        N n10 = new N();
        this.f1334b.a(new x(executor, interfaceC0779c, n10));
        x();
        return n10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object k(Class cls) {
        Object obj;
        synchronized (this.f1333a) {
            try {
                u();
                v();
                if (cls.isInstance(this.f1338f)) {
                    throw ((Throwable) cls.cast(this.f1338f));
                }
                Exception exc = this.f1338f;
                if (exc != null) {
                    throw new C0785i(exc);
                }
                obj = this.f1337e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean l() {
        return this.f1336d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean m() {
        boolean z10;
        synchronized (this.f1333a) {
            z10 = this.f1335c;
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task n(InterfaceC0786j interfaceC0786j) {
        Executor executor = AbstractC0788l.f1343a;
        N n10 = new N();
        this.f1334b.a(new H(executor, interfaceC0786j, n10));
        x();
        return n10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task o(Executor executor, InterfaceC0786j interfaceC0786j) {
        N n10 = new N();
        this.f1334b.a(new H(executor, interfaceC0786j, n10));
        x();
        return n10;
    }

    public final void p(Exception exc) {
        AbstractC1287s.n(exc, "Exception must not be null");
        synchronized (this.f1333a) {
            w();
            this.f1335c = true;
            this.f1338f = exc;
        }
        this.f1334b.b(this);
    }

    public final void q(Object obj) {
        synchronized (this.f1333a) {
            w();
            this.f1335c = true;
            this.f1337e = obj;
        }
        this.f1334b.b(this);
    }

    public final boolean r() {
        synchronized (this.f1333a) {
            try {
                if (this.f1335c) {
                    return false;
                }
                this.f1335c = true;
                this.f1336d = true;
                this.f1334b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean s(Exception exc) {
        AbstractC1287s.n(exc, "Exception must not be null");
        synchronized (this.f1333a) {
            try {
                if (this.f1335c) {
                    return false;
                }
                this.f1335c = true;
                this.f1338f = exc;
                this.f1334b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t(Object obj) {
        synchronized (this.f1333a) {
            try {
                if (this.f1335c) {
                    return false;
                }
                this.f1335c = true;
                this.f1337e = obj;
                this.f1334b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
