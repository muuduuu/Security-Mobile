package Od;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final a f7341e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7342f = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f7343g = AtomicLongFieldUpdater.newUpdater(q.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final D f7344h = new D("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    private final int f7345a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7346b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7347c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f7348d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823L) | i10;
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (i10 << 30);
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f7349a;

        public b(int i10) {
            this.f7349a = i10;
        }
    }

    public q(int i10, boolean z10) {
        this.f7345a = i10;
        this.f7346b = z10;
        int i11 = i10 - 1;
        this.f7347c = i11;
        this.f7348d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final q b(long j10) {
        q qVar = new q(this.f7345a * 2, this.f7346b);
        int i10 = (int) (1073741823 & j10);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f7347c;
            if ((i10 & i12) == (i12 & i11)) {
                f7343g.set(qVar, f7341e.d(j10, 1152921504606846976L));
                return qVar;
            }
            Object obj = f().get(this.f7347c & i10);
            if (obj == null) {
                obj = new b(i10);
            }
            qVar.f().set(qVar.f7347c & i10, obj);
            i10++;
        }
    }

    private final q c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7342f;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar != null) {
                return qVar;
            }
            androidx.concurrent.futures.b.a(f7342f, this, null, b(j10));
        }
    }

    private final q e(int i10, Object obj) {
        Object obj2 = f().get(this.f7347c & i10);
        if (!(obj2 instanceof b) || ((b) obj2).f7349a != i10) {
            return null;
        }
        f().set(i10 & this.f7347c, obj);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray f() {
        return this.f7348d;
    }

    private final long k() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7343g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    private final q n(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7343g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) (1073741823 & j10);
            if ((1152921504606846976L & j10) != 0) {
                return l();
            }
        } while (!f7343g.compareAndSet(this, j10, f7341e.b(j10, i11)));
        f().set(this.f7347c & i12, null);
        return null;
    }

    public final int a(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7343g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return f7341e.a(j10);
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f7347c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (!this.f7346b && f().get(i11 & i12) != null) {
                int i13 = this.f7345a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    break;
                }
            } else if (f7343g.compareAndSet(this, j10, f7341e.c(j10, (i11 + 1) & 1073741823))) {
                f().set(i11 & i12, obj);
                q qVar = this;
                while ((f7343g.get(qVar) & 1152921504606846976L) != 0 && (qVar = qVar.l().e(i11, obj)) != null) {
                }
                return 0;
            }
        }
        return 1;
    }

    public final boolean d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7343g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int g() {
        long j10 = f7343g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    public final boolean j() {
        long j10 = f7343g.get(this);
        return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    public final q l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7343g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f7344h;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = this.f7347c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i11 & i10)) {
                return null;
            }
            Object obj = f().get(this.f7347c & i10);
            if (obj == null) {
                if (this.f7346b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i12 = (i10 + 1) & 1073741823;
                if (f7343g.compareAndSet(this, j10, f7341e.b(j10, i12))) {
                    f().set(this.f7347c & i10, null);
                    return obj;
                }
                if (this.f7346b) {
                    q qVar = this;
                    do {
                        qVar = qVar.n(i10, i12);
                    } while (qVar != null);
                    return obj;
                }
            }
        }
    }
}
