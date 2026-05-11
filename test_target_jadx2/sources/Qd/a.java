package Qd;

import Jd.AbstractC0875c;
import Jd.S;
import Od.D;
import Od.y;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.m;
import qc.AbstractC3958a;
import xc.C5141B;

/* loaded from: classes3.dex */
public final class a implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final C0160a f8303h = new C0160a(null);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f8304i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f8305j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f8306k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final D f8307l = new D("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f8308a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8309b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8310c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f8311d;

    /* renamed from: e, reason: collision with root package name */
    public final Qd.d f8312e;

    /* renamed from: f, reason: collision with root package name */
    public final Qd.d f8313f;

    /* renamed from: g, reason: collision with root package name */
    public final y f8314g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: Qd.a$a, reason: collision with other inner class name */
    public static final class C0160a {
        public /* synthetic */ C0160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0160a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8315a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f8315a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d CPU_ACQUIRED = new d("CPU_ACQUIRED", 0);
        public static final d BLOCKING = new d("BLOCKING", 1);
        public static final d PARKING = new d("PARKING", 2);
        public static final d DORMANT = new d("DORMANT", 3);
        public static final d TERMINATED = new d("TERMINATED", 4);

        private static final /* synthetic */ d[] $values() {
            return new d[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
        }

        static {
            d[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private d(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public a(int i10, int i11, long j10, String str) {
        this.f8308a = i10;
        this.f8309b = i11;
        this.f8310c = j10;
        this.f8311d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f8312e = new Qd.d();
        this.f8313f = new Qd.d();
        this.f8314g = new y((i10 + 1) * 2);
        this.controlState$volatile = i10 << 42;
        this._isTerminated$volatile = 0;
    }

    private final h C(c cVar, h hVar, boolean z10) {
        if (cVar == null) {
            return hVar;
        }
        d dVar = cVar.f8319c;
        if (dVar == d.TERMINATED) {
            return hVar;
        }
        if (!hVar.f8335b && dVar == d.BLOCKING) {
            return hVar;
        }
        cVar.f8323g = true;
        return cVar.f8317a.a(hVar, z10);
    }

    private final boolean F(long j10) {
        if (kotlin.ranges.d.d(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f8308a) {
            int c10 = c();
            if (c10 == 1 && this.f8308a > 1) {
                c();
            }
            if (c10 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean H(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f8305j.get(aVar);
        }
        return aVar.F(j10);
    }

    private final boolean I() {
        c q10;
        do {
            q10 = q();
            if (q10 == null) {
                return false;
            }
        } while (!c.f8316i.compareAndSet(q10, -1, 0));
        LockSupport.unpark(q10);
        return true;
    }

    private final boolean b(h hVar) {
        return hVar.f8335b ? this.f8313f.a(hVar) : this.f8312e.a(hVar);
    }

    private final int c() {
        synchronized (this.f8314g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f8305j.get(this);
                int i10 = (int) (j10 & 2097151);
                int d10 = kotlin.ranges.d.d(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (d10 >= this.f8308a) {
                    return 0;
                }
                if (i10 >= this.f8309b) {
                    return 0;
                }
                int i11 = ((int) (j().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f8314g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f8314g.c(i11, cVar);
                if (i11 != ((int) (2097151 & f8305j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = d10 + 1;
                cVar.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final c f() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !Intrinsics.b(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void i(a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.g(runnable, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater j() {
        return f8305j;
    }

    private final int p(c cVar) {
        Object g10 = cVar.g();
        while (g10 != f8307l) {
            if (g10 == null) {
                return 0;
            }
            c cVar2 = (c) g10;
            int f10 = cVar2.f();
            if (f10 != 0) {
                return f10;
            }
            g10 = cVar2.g();
        }
        return -1;
    }

    private final c q() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8304i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f8314g.b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int p10 = p(cVar);
            if (p10 >= 0 && f8304i.compareAndSet(this, j10, p10 | j11)) {
                cVar.o(f8307l);
                return cVar;
            }
        }
    }

    private final void y(long j10, boolean z10) {
        if (z10 || I() || F(j10)) {
            return;
        }
        I();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        x(10000L);
    }

    public final h d(Runnable runnable, boolean z10) {
        long a10 = j.f8342f.a();
        if (!(runnable instanceof h)) {
            return j.b(runnable, a10, z10);
        }
        h hVar = (h) runnable;
        hVar.f8334a = a10;
        hVar.f8335b = z10;
        return hVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        i(this, runnable, false, false, 6, null);
    }

    public final void g(Runnable runnable, boolean z10, boolean z11) {
        AbstractC0875c.a();
        h d10 = d(runnable, z10);
        boolean z12 = d10.f8335b;
        long addAndGet = z12 ? f8305j.addAndGet(this, 2097152L) : 0L;
        c f10 = f();
        h C10 = C(f10, d10, z11);
        if (C10 != null && !b(C10)) {
            throw new RejectedExecutionException(this.f8311d + " was terminated");
        }
        boolean z13 = z11 && f10 != null;
        if (z12) {
            y(addAndGet, z13);
        } else {
            if (z13) {
                return;
            }
            z();
        }
    }

    public final boolean isTerminated() {
        return f8306k.get(this) != 0;
    }

    public final boolean s(c cVar) {
        long j10;
        int f10;
        if (cVar.g() != f8307l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8304i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            f10 = cVar.f();
            cVar.o(this.f8314g.b((int) (2097151 & j10)));
        } while (!f8304i.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | f10));
        return true;
    }

    public final void t(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8304i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                i12 = i11 == 0 ? p(cVar) : i11;
            }
            if (i12 >= 0 && f8304i.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a10 = this.f8314g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c cVar = (c) this.f8314g.b(i15);
            if (cVar != null) {
                int i16 = cVar.f8317a.i();
                int i17 = b.f8315a[cVar.f8319c.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new m();
                    }
                    i14++;
                }
            }
        }
        long j10 = f8305j.get(this);
        return this.f8311d + '@' + S.b(this) + "[Pool Size {core = " + this.f8308a + ", max = " + this.f8309b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f8312e.c() + ", global blocking queue size = " + this.f8313f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f8308a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void u(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void x(long j10) {
        int i10;
        h hVar;
        if (f8306k.compareAndSet(this, 0, 1)) {
            c f10 = f();
            synchronized (this.f8314g) {
                i10 = (int) (j().get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object b10 = this.f8314g.b(i11);
                    Intrinsics.d(b10);
                    c cVar = (c) b10;
                    if (cVar != f10) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f8317a.j(this.f8313f);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f8313f.b();
            this.f8312e.b();
            while (true) {
                if (f10 != null) {
                    hVar = f10.e(true);
                    if (hVar != null) {
                        continue;
                        u(hVar);
                    }
                }
                hVar = (h) this.f8312e.e();
                if (hVar == null && (hVar = (h) this.f8313f.e()) == null) {
                    break;
                }
                u(hVar);
            }
            if (f10 != null) {
                f10.r(d.TERMINATED);
            }
            f8304i.set(this, 0L);
            f8305j.set(this, 0L);
        }
    }

    public final void z() {
        if (I() || H(this, 0L, 1, null)) {
            return;
        }
        I();
    }

    public final class c extends Thread {

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f8316i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* renamed from: a, reason: collision with root package name */
        public final l f8317a;

        /* renamed from: b, reason: collision with root package name */
        private final C5141B f8318b;

        /* renamed from: c, reason: collision with root package name */
        public d f8319c;

        /* renamed from: d, reason: collision with root package name */
        private long f8320d;

        /* renamed from: e, reason: collision with root package name */
        private long f8321e;

        /* renamed from: f, reason: collision with root package name */
        private int f8322f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f8323g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f8317a = new l();
            this.f8318b = new C5141B();
            this.f8319c = d.DORMANT;
            this.nextParkedWorker = a.f8307l;
            int nanoTime = (int) System.nanoTime();
            this.f8322f = nanoTime == 0 ? 42 : nanoTime;
        }

        private final void b(h hVar) {
            this.f8320d = 0L;
            if (this.f8319c == d.PARKING) {
                this.f8319c = d.BLOCKING;
            }
            if (!hVar.f8335b) {
                a.this.u(hVar);
                return;
            }
            if (r(d.BLOCKING)) {
                a.this.z();
            }
            a.this.u(hVar);
            a.j().addAndGet(a.this, -2097152L);
            if (this.f8319c != d.TERMINATED) {
                this.f8319c = d.DORMANT;
            }
        }

        private final h c(boolean z10) {
            h l10;
            h l11;
            if (z10) {
                boolean z11 = j(a.this.f8308a * 2) == 0;
                if (z11 && (l11 = l()) != null) {
                    return l11;
                }
                h k10 = this.f8317a.k();
                if (k10 != null) {
                    return k10;
                }
                if (!z11 && (l10 = l()) != null) {
                    return l10;
                }
            } else {
                h l12 = l();
                if (l12 != null) {
                    return l12;
                }
            }
            return s(3);
        }

        private final h d() {
            h l10 = this.f8317a.l();
            if (l10 != null) {
                return l10;
            }
            h hVar = (h) a.this.f8313f.e();
            return hVar == null ? s(1) : hVar;
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f8307l;
        }

        private final void k() {
            if (this.f8320d == 0) {
                this.f8320d = System.nanoTime() + a.this.f8310c;
            }
            LockSupport.parkNanos(a.this.f8310c);
            if (System.nanoTime() - this.f8320d >= 0) {
                this.f8320d = 0L;
                t();
            }
        }

        private final h l() {
            if (j(2) == 0) {
                h hVar = (h) a.this.f8312e.e();
                return hVar != null ? hVar : (h) a.this.f8313f.e();
            }
            h hVar2 = (h) a.this.f8313f.e();
            return hVar2 != null ? hVar2 : (h) a.this.f8312e.e();
        }

        private final void m() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f8319c != d.TERMINATED) {
                    h e10 = e(this.f8323g);
                    if (e10 != null) {
                        this.f8321e = 0L;
                        b(e10);
                    } else {
                        this.f8323g = false;
                        if (this.f8321e == 0) {
                            q();
                        } else if (z10) {
                            r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f8321e);
                            this.f8321e = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
            }
            r(d.TERMINATED);
        }

        private final boolean p() {
            long j10;
            if (this.f8319c == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater j11 = a.j();
            do {
                j10 = j11.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.j().compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f8319c = d.CPU_ACQUIRED;
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.s(this);
                return;
            }
            f8316i.set(this, -1);
            while (i() && f8316i.get(this) == -1 && !a.this.isTerminated() && this.f8319c != d.TERMINATED) {
                r(d.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final h s(int i10) {
            int i11 = (int) (a.j().get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int j10 = j(i11);
            a aVar = a.this;
            long j11 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                j10++;
                if (j10 > i11) {
                    j10 = 1;
                }
                c cVar = (c) aVar.f8314g.b(j10);
                if (cVar != null && cVar != this) {
                    long r10 = cVar.f8317a.r(i10, this.f8318b);
                    if (r10 == -1) {
                        C5141B c5141b = this.f8318b;
                        h hVar = (h) c5141b.f44962a;
                        c5141b.f44962a = null;
                        return hVar;
                    }
                    if (r10 > 0) {
                        j11 = Math.min(j11, r10);
                    }
                }
            }
            if (j11 == Long.MAX_VALUE) {
                j11 = 0;
            }
            this.f8321e = j11;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f8314g) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.j().get(aVar) & 2097151)) <= aVar.f8308a) {
                        return;
                    }
                    if (f8316i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        n(0);
                        aVar.t(this, i10, 0);
                        int andDecrement = (int) (a.j().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i10) {
                            Object b10 = aVar.f8314g.b(andDecrement);
                            Intrinsics.d(b10);
                            c cVar = (c) b10;
                            aVar.f8314g.c(i10, cVar);
                            cVar.n(i10);
                            aVar.t(cVar, andDecrement, i10);
                        }
                        aVar.f8314g.c(andDecrement, null);
                        Unit unit = Unit.f36324a;
                        this.f8319c = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final h e(boolean z10) {
            return p() ? c(z10) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i10) {
            int i11 = this.f8322f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f8322f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void n(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f8311d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f8319c;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.j().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f8319c = dVar;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public c(a aVar, int i10) {
            this();
            n(i10);
        }
    }
}
