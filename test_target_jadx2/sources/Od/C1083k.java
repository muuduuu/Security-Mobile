package Od;

import Jd.U;
import Jd.X;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* renamed from: Od.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1083k extends Jd.J implements X {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7327i = AtomicIntegerFieldUpdater.newUpdater(C1083k.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ X f7328c;

    /* renamed from: d, reason: collision with root package name */
    private final Jd.J f7329d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7330e;

    /* renamed from: f, reason: collision with root package name */
    private final String f7331f;

    /* renamed from: g, reason: collision with root package name */
    private final C1088p f7332g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f7333h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: Od.k$a */
    private final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Runnable f7334a;

        public a(Runnable runnable) {
            this.f7334a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f7334a.run();
                } catch (Throwable th) {
                    Jd.L.a(kotlin.coroutines.g.f36372a, th);
                }
                Runnable O02 = C1083k.this.O0();
                if (O02 == null) {
                    return;
                }
                this.f7334a = O02;
                i10++;
                if (i10 >= 16 && C1083k.this.f7329d.y(C1083k.this)) {
                    C1083k.this.f7329d.s(C1083k.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1083k(Jd.J j10, int i10, String str) {
        X x10 = j10 instanceof X ? (X) j10 : null;
        this.f7328c = x10 == null ? U.a() : x10;
        this.f7329d = j10;
        this.f7330e = i10;
        this.f7331f = str;
        this.f7332g = new C1088p(false);
        this.f7333h = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable O0() {
        while (true) {
            Runnable runnable = (Runnable) this.f7332g.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f7333h) {
                f7327i.decrementAndGet(this);
                if (this.f7332g.c() == 0) {
                    return null;
                }
                f7327i.incrementAndGet(this);
            }
        }
    }

    private final boolean Z0() {
        synchronized (this.f7333h) {
            if (f7327i.get(this) >= this.f7330e) {
                return false;
            }
            f7327i.incrementAndGet(this);
            return true;
        }
    }

    @Override // Jd.J
    public Jd.J i0(int i10, String str) {
        AbstractC1084l.a(i10);
        return i10 >= this.f7330e ? AbstractC1084l.b(this, str) : super.i0(i10, str);
    }

    @Override // Jd.J
    public void s(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable O02;
        this.f7332g.a(runnable);
        if (f7327i.get(this) >= this.f7330e || !Z0() || (O02 = O0()) == null) {
            return;
        }
        this.f7329d.s(this, new a(O02));
    }

    @Override // Jd.J
    public String toString() {
        String str = this.f7331f;
        if (str != null) {
            return str;
        }
        return this.f7329d + ".limitedParallelism(" + this.f7330e + ')';
    }

    @Override // Jd.J
    public void u(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable O02;
        this.f7332g.a(runnable);
        if (f7327i.get(this) >= this.f7330e || !Z0() || (O02 = O0()) == null) {
            return;
        }
        this.f7329d.u(this, new a(O02));
    }
}
