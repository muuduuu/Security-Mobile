package Sd;

import Jd.InterfaceC0895m;
import Jd.V0;
import Ld.l;
import Od.A;
import Od.AbstractC1073a;
import Od.B;
import Od.D;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wc.InterfaceC5068n;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9098c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f9099d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9100e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f9101f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9102g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    private final int f9103a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5068n f9104b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* synthetic */ class a extends xc.j implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public static final a f9105j = new a();

        a() {
            super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final k I(long j10, k kVar) {
            k h10;
            h10 = j.h(j10, kVar);
            return h10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return I(((Number) obj).longValue(), (k) obj2);
        }
    }

    /* synthetic */ class b extends xc.j implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public static final b f9106j = new b();

        b() {
            super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final k I(long j10, k kVar) {
            k h10;
            h10 = j.h(j10, kVar);
            return h10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return I(((Number) obj).longValue(), (k) obj2);
        }
    }

    public i(int i10, int i11) {
        this.f9103a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i10 - i11;
        this.f9104b = new InterfaceC5068n() { // from class: Sd.h
            @Override // wc.InterfaceC5068n
            public final Object n(Object obj, Object obj2, Object obj3) {
                Unit o10;
                o10 = i.o(i.this, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
                return o10;
            }
        };
    }

    private final boolean f(V0 v02) {
        int i10;
        Object c10;
        int i11;
        D d10;
        D d11;
        k kVar = (k) f9100e.get(this);
        long andIncrement = f9101f.getAndIncrement(this);
        a aVar = a.f9105j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9100e;
        i10 = j.f9112f;
        long j10 = andIncrement / i10;
        loop0: while (true) {
            c10 = AbstractC1073a.c(kVar, j10, aVar);
            if (!B.c(c10)) {
                A b10 = B.b(c10);
                while (true) {
                    A a10 = (A) atomicReferenceFieldUpdater.get(this);
                    if (a10.f7300c >= b10.f7300c) {
                        break loop0;
                    }
                    if (!b10.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, a10, b10)) {
                        if (a10.p()) {
                            a10.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) B.b(c10);
        i11 = j.f9112f;
        int i12 = (int) (andIncrement % i11);
        if (l.a(kVar2.v(), i12, null, v02)) {
            v02.d(kVar2, i12);
            return true;
        }
        d10 = j.f9108b;
        d11 = j.f9109c;
        if (!l.a(kVar2.v(), i12, d10, d11)) {
            return false;
        }
        if (v02 instanceof InterfaceC0895m) {
            Intrinsics.e(v02, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC0895m) v02).h(Unit.f36324a, this.f9104b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + v02).toString());
    }

    private final void g() {
        int i10;
        do {
            i10 = f9102g.get(this);
            if (i10 <= this.f9103a) {
                return;
            }
        } while (!f9102g.compareAndSet(this, i10, this.f9103a));
    }

    private final int h() {
        int andDecrement;
        do {
            andDecrement = f9102g.getAndDecrement(this);
        } while (andDecrement > this.f9103a);
        return andDecrement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(i iVar, Throwable th, Unit unit, CoroutineContext coroutineContext) {
        iVar.p();
        return Unit.f36324a;
    }

    private final boolean r(Object obj) {
        if (!(obj instanceof InterfaceC0895m)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0895m interfaceC0895m = (InterfaceC0895m) obj;
        Object o10 = interfaceC0895m.o(Unit.f36324a, null, this.f9104b);
        if (o10 == null) {
            return false;
        }
        interfaceC0895m.G(o10);
        return true;
    }

    private final boolean s() {
        int i10;
        Object c10;
        int i11;
        D d10;
        D d11;
        int i12;
        D d12;
        D d13;
        D d14;
        k kVar = (k) f9098c.get(this);
        long andIncrement = f9099d.getAndIncrement(this);
        i10 = j.f9112f;
        long j10 = andIncrement / i10;
        b bVar = b.f9106j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9098c;
        loop0: while (true) {
            c10 = AbstractC1073a.c(kVar, j10, bVar);
            if (B.c(c10)) {
                break;
            }
            A b10 = B.b(c10);
            while (true) {
                A a10 = (A) atomicReferenceFieldUpdater.get(this);
                if (a10.f7300c >= b10.f7300c) {
                    break loop0;
                }
                if (!b10.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, a10, b10)) {
                    if (a10.p()) {
                        a10.n();
                    }
                } else if (b10.p()) {
                    b10.n();
                }
            }
        }
        k kVar2 = (k) B.b(c10);
        kVar2.c();
        if (kVar2.f7300c > j10) {
            return false;
        }
        i11 = j.f9112f;
        int i13 = (int) (andIncrement % i11);
        d10 = j.f9108b;
        Object andSet = kVar2.v().getAndSet(i13, d10);
        if (andSet != null) {
            d11 = j.f9111e;
            if (andSet == d11) {
                return false;
            }
            return r(andSet);
        }
        i12 = j.f9107a;
        for (int i14 = 0; i14 < i12; i14++) {
            Object obj = kVar2.v().get(i13);
            d14 = j.f9109c;
            if (obj == d14) {
                return true;
            }
        }
        d12 = j.f9108b;
        d13 = j.f9110d;
        return !l.a(kVar2.v(), i13, d12, d13);
    }

    protected final void e(InterfaceC0895m interfaceC0895m) {
        while (h() <= 0) {
            Intrinsics.e(interfaceC0895m, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (f((V0) interfaceC0895m)) {
                return;
            }
        }
        interfaceC0895m.h(Unit.f36324a, this.f9104b);
    }

    public final int i() {
        return Math.max(f9102g.get(this), 0);
    }

    public final void p() {
        do {
            int andIncrement = f9102g.getAndIncrement(this);
            if (andIncrement >= this.f9103a) {
                g();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f9103a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!s());
    }

    public final boolean q() {
        while (true) {
            int i10 = f9102g.get(this);
            if (i10 > this.f9103a) {
                g();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f9102g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
