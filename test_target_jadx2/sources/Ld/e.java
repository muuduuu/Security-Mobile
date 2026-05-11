package Ld;

import Jd.AbstractC0903q;
import Jd.C0899o;
import Jd.InterfaceC0895m;
import Jd.V0;
import Od.A;
import Od.AbstractC1073a;
import Od.AbstractC1074b;
import Od.AbstractC1082j;
import Od.B;
import Od.C;
import Od.D;
import Od.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.AbstractC3622a;
import lc.o;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;

/* loaded from: classes3.dex */
public class e implements g {

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f5756d = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f5757e = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f5758f = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f5759g = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5760h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5761i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5762j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5763k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5764l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    private final int f5765a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f5766b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5068n f5767c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    private final class a implements i, V0 {

        /* renamed from: a, reason: collision with root package name */
        private Object f5768a;

        /* renamed from: b, reason: collision with root package name */
        private C0899o f5769b;

        public a() {
            D d10;
            d10 = f.f5796p;
            this.f5768a = d10;
        }

        private final Object f(m mVar, int i10, long j10, kotlin.coroutines.d dVar) {
            D d10;
            D d11;
            Boolean a10;
            D d12;
            D d13;
            D d14;
            e eVar = e.this;
            C0899o b10 = AbstractC0903q.b(AbstractC3868b.c(dVar));
            try {
                this.f5769b = b10;
                Object h12 = eVar.h1(mVar, i10, j10, this);
                d10 = f.f5793m;
                if (h12 == d10) {
                    eVar.P0(this, mVar, i10);
                } else {
                    d11 = f.f5795o;
                    InterfaceC5068n interfaceC5068n = null;
                    if (h12 == d11) {
                        if (j10 < eVar.m0()) {
                            mVar.c();
                        }
                        m mVar2 = (m) e.g0().get(eVar);
                        while (true) {
                            if (eVar.u0()) {
                                h();
                                break;
                            }
                            long andIncrement = e.h0().getAndIncrement(eVar);
                            int i11 = f.f5782b;
                            long j11 = andIncrement / i11;
                            int i12 = (int) (andIncrement % i11);
                            if (mVar2.f7300c != j11) {
                                m X10 = eVar.X(j11, mVar2);
                                if (X10 != null) {
                                    mVar2 = X10;
                                }
                            }
                            Object h13 = eVar.h1(mVar2, i12, andIncrement, this);
                            d12 = f.f5793m;
                            if (h13 == d12) {
                                eVar.P0(this, mVar2, i12);
                                break;
                            }
                            d13 = f.f5795o;
                            if (h13 != d13) {
                                d14 = f.f5794n;
                                if (h13 == d14) {
                                    throw new IllegalStateException("unexpected");
                                }
                                mVar2.c();
                                this.f5768a = h13;
                                this.f5769b = null;
                                a10 = kotlin.coroutines.jvm.internal.b.a(true);
                                Function1 function1 = eVar.f5766b;
                                if (function1 != null) {
                                    interfaceC5068n = eVar.J(function1, h13);
                                }
                            } else if (andIncrement < eVar.m0()) {
                                mVar2.c();
                            }
                        }
                    } else {
                        mVar.c();
                        this.f5768a = h12;
                        this.f5769b = null;
                        a10 = kotlin.coroutines.jvm.internal.b.a(true);
                        Function1 function12 = eVar.f5766b;
                        if (function12 != null) {
                            interfaceC5068n = eVar.J(function12, h12);
                        }
                    }
                    b10.h(a10, interfaceC5068n);
                }
                Object y10 = b10.y();
                if (y10 == AbstractC3868b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return y10;
            } catch (Throwable th) {
                b10.O();
                throw th;
            }
        }

        private final boolean g() {
            this.f5768a = f.z();
            Throwable c02 = e.this.c0();
            if (c02 == null) {
                return false;
            }
            throw C.a(c02);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            C0899o c0899o = this.f5769b;
            Intrinsics.d(c0899o);
            this.f5769b = null;
            this.f5768a = f.z();
            Throwable c02 = e.this.c0();
            if (c02 == null) {
                o.a aVar = lc.o.f37128b;
                c0899o.resumeWith(lc.o.b(Boolean.FALSE));
            } else {
                o.a aVar2 = lc.o.f37128b;
                c0899o.resumeWith(lc.o.b(lc.p.a(c02)));
            }
        }

        @Override // Ld.i
        public Object a(kotlin.coroutines.d dVar) {
            D d10;
            D d11;
            D d12;
            D d13;
            Object obj = this.f5768a;
            d10 = f.f5796p;
            boolean z10 = true;
            if (obj == d10 || this.f5768a == f.z()) {
                e eVar = e.this;
                m mVar = (m) e.g0().get(eVar);
                while (true) {
                    if (eVar.u0()) {
                        z10 = g();
                        break;
                    }
                    long andIncrement = e.h0().getAndIncrement(eVar);
                    int i10 = f.f5782b;
                    long j10 = andIncrement / i10;
                    int i11 = (int) (andIncrement % i10);
                    if (mVar.f7300c != j10) {
                        m X10 = eVar.X(j10, mVar);
                        if (X10 == null) {
                            continue;
                        } else {
                            mVar = X10;
                        }
                    }
                    Object h12 = eVar.h1(mVar, i11, andIncrement, null);
                    d11 = f.f5793m;
                    if (h12 == d11) {
                        throw new IllegalStateException("unreachable");
                    }
                    d12 = f.f5795o;
                    if (h12 != d12) {
                        d13 = f.f5794n;
                        if (h12 == d13) {
                            return f(mVar, i11, andIncrement, dVar);
                        }
                        mVar.c();
                        this.f5768a = h12;
                    } else if (andIncrement < eVar.m0()) {
                        mVar.c();
                    }
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }

        @Override // Jd.V0
        public void d(A a10, int i10) {
            C0899o c0899o = this.f5769b;
            if (c0899o != null) {
                c0899o.d(a10, i10);
            }
        }

        public final boolean i(Object obj) {
            boolean B10;
            C0899o c0899o = this.f5769b;
            Intrinsics.d(c0899o);
            this.f5769b = null;
            this.f5768a = obj;
            Boolean bool = Boolean.TRUE;
            e eVar = e.this;
            Function1 function1 = eVar.f5766b;
            B10 = f.B(c0899o, bool, function1 != null ? eVar.J(function1, obj) : null);
            return B10;
        }

        public final void j() {
            C0899o c0899o = this.f5769b;
            Intrinsics.d(c0899o);
            this.f5769b = null;
            this.f5768a = f.z();
            Throwable c02 = e.this.c0();
            if (c02 == null) {
                o.a aVar = lc.o.f37128b;
                c0899o.resumeWith(lc.o.b(Boolean.FALSE));
            } else {
                o.a aVar2 = lc.o.f37128b;
                c0899o.resumeWith(lc.o.b(lc.p.a(c02)));
            }
        }

        @Override // Ld.i
        public Object next() {
            D d10;
            D d11;
            Object obj = this.f5768a;
            d10 = f.f5796p;
            if (obj == d10) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            d11 = f.f5796p;
            this.f5768a = d11;
            if (obj != f.z()) {
                return obj;
            }
            throw C.a(e.this.f0());
        }
    }

    /* synthetic */ class b extends xc.j implements InterfaceC5068n {
        b(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void I(Throwable th, Object obj, CoroutineContext coroutineContext) {
            ((e) this.f44980b).F0(th, obj, coroutineContext);
        }

        @Override // wc.InterfaceC5068n
        public /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3) {
            I((Throwable) obj, obj2, (CoroutineContext) obj3);
            return Unit.f36324a;
        }
    }

    /* synthetic */ class c extends xc.j implements InterfaceC5068n {
        c(Object obj) {
            super(3, obj, e.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void I(Throwable th, Object obj, CoroutineContext coroutineContext) {
            ((e) this.f44980b).E0(th, obj, coroutineContext);
        }

        @Override // wc.InterfaceC5068n
        public /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3) {
            I((Throwable) obj, ((k) obj2).k(), (CoroutineContext) obj3);
            return Unit.f36324a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f5771a;

        /* renamed from: c, reason: collision with root package name */
        int f5773c;

        d(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5771a = obj;
            this.f5773c |= Integer.MIN_VALUE;
            Object S02 = e.S0(e.this, this);
            return S02 == AbstractC3868b.e() ? S02 : k.b(S02);
        }
    }

    /* renamed from: Ld.e$e, reason: collision with other inner class name */
    static final class C0117e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f5774a;

        /* renamed from: b, reason: collision with root package name */
        Object f5775b;

        /* renamed from: c, reason: collision with root package name */
        int f5776c;

        /* renamed from: d, reason: collision with root package name */
        long f5777d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f5778e;

        /* renamed from: g, reason: collision with root package name */
        int f5780g;

        C0117e(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5778e = obj;
            this.f5780g |= Integer.MIN_VALUE;
            Object T02 = e.this.T0(null, 0, 0L, this);
            return T02 == AbstractC3868b.e() ? T02 : k.b(T02);
        }
    }

    public e(int i10, Function1 function1) {
        long A10;
        D d10;
        this.f5765a = i10;
        this.f5766b = function1;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        A10 = f.A(i10);
        this.bufferEnd$volatile = A10;
        this.completedExpandBuffersAndPauseFlag$volatile = a0();
        m mVar = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar;
        this.receiveSegment$volatile = mVar;
        if (y0()) {
            mVar = f.f5781a;
            Intrinsics.e(mVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar;
        this.f5767c = function1 != null ? new InterfaceC5068n() { // from class: Ld.b
            @Override // wc.InterfaceC5068n
            public final Object n(Object obj, Object obj2, Object obj3) {
                InterfaceC5068n N02;
                e eVar = e.this;
                android.support.v4.media.session.b.a(obj);
                N02 = e.N0(eVar, null, obj2, obj3);
                return N02;
            }
        } : null;
        d10 = f.f5799s;
        this._closeCause$volatile = d10;
    }

    private final void A0() {
        long j10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5756d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            } else {
                w10 = f.w(1152921504606846975L & j10, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    private final void B0() {
        long j10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5756d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            w10 = f.w(1152921504606846975L & j10, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    private final void C0() {
        long j10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5756d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                w10 = f.w(j10 & 1152921504606846975L, 2);
            } else if (i10 != 1) {
                return;
            } else {
                w10 = f.w(j10 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void D0(long j10, m mVar) {
        m mVar2;
        m mVar3;
        while (mVar.f7300c < j10 && (mVar3 = (m) mVar.f()) != null) {
            mVar = mVar3;
        }
        while (true) {
            if (!mVar.k() || (mVar2 = (m) mVar.f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5762j;
                while (true) {
                    A a10 = (A) atomicReferenceFieldUpdater.get(this);
                    if (a10.f7300c >= mVar.f7300c) {
                        return;
                    }
                    if (!mVar.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, a10, mVar)) {
                        if (a10.p()) {
                            a10.n();
                            return;
                        }
                        return;
                    } else if (mVar.p()) {
                        mVar.n();
                    }
                }
            } else {
                mVar = mVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(Throwable th, Object obj, CoroutineContext coroutineContext) {
        Function1 function1 = this.f5766b;
        Intrinsics.d(function1);
        Object f10 = k.f(obj);
        Intrinsics.d(f10);
        Od.w.a(function1, f10, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0(Throwable th, Object obj, CoroutineContext coroutineContext) {
        Function1 function1 = this.f5766b;
        Intrinsics.d(function1);
        Od.w.a(function1, obj, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(InterfaceC0895m interfaceC0895m) {
        o.a aVar = lc.o.f37128b;
        interfaceC0895m.resumeWith(lc.o.b(k.b(k.f5805b.a(c0()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.g I(Function1 function1) {
        return new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0(InterfaceC0895m interfaceC0895m) {
        o.a aVar = lc.o.f37128b;
        interfaceC0895m.resumeWith(lc.o.b(lc.p.a(f0())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5068n J(final Function1 function1, final Object obj) {
        return new InterfaceC5068n() { // from class: Ld.c
            @Override // wc.InterfaceC5068n
            public final Object n(Object obj2, Object obj3, Object obj4) {
                Unit K10;
                K10 = e.K(Function1.this, obj, (Throwable) obj2, obj3, (CoroutineContext) obj4);
                return K10;
            }
        };
    }

    private final Object J0(Object obj, kotlin.coroutines.d dVar) {
        P c10;
        C0899o c0899o = new C0899o(AbstractC3868b.c(dVar), 1);
        c0899o.F();
        Function1 function1 = this.f5766b;
        if (function1 == null || (c10 = Od.w.c(function1, obj, null, 2, null)) == null) {
            Throwable j02 = j0();
            o.a aVar = lc.o.f37128b;
            c0899o.resumeWith(lc.o.b(lc.p.a(j02)));
        } else {
            AbstractC3622a.a(c10, j0());
            o.a aVar2 = lc.o.f37128b;
            c0899o.resumeWith(lc.o.b(lc.p.a(c10)));
        }
        Object y10 = c0899o.y();
        if (y10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y10 == AbstractC3868b.e() ? y10 : Unit.f36324a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(Function1 function1, Object obj, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        Od.w.a(function1, obj, coroutineContext);
        return Unit.f36324a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(Object obj, InterfaceC0895m interfaceC0895m) {
        Function1 function1 = this.f5766b;
        if (function1 != null) {
            Od.w.a(function1, obj, interfaceC0895m.getContext());
        }
        Throwable j02 = j0();
        o.a aVar = lc.o.f37128b;
        interfaceC0895m.resumeWith(lc.o.b(lc.p.a(j02)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.g L(Function1 function1) {
        return new c(this);
    }

    private final boolean M(long j10) {
        return j10 < a0() || j10 < i0() + ((long) this.f5765a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5068n N0(final e eVar, final Rd.a aVar, Object obj, final Object obj2) {
        return new InterfaceC5068n(obj2, eVar, aVar) { // from class: Ld.d

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f5754a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f5755b;

            @Override // wc.InterfaceC5068n
            public final Object n(Object obj3, Object obj4, Object obj5) {
                Unit O02;
                O02 = e.O0(this.f5754a, this.f5755b, null, (Throwable) obj3, obj4, (CoroutineContext) obj5);
                return O02;
            }
        };
    }

    private final void O(m mVar, long j10) {
        D d10;
        Object b10 = AbstractC1082j.b(null, 1, null);
        loop0: while (mVar != null) {
            for (int i10 = f.f5782b - 1; -1 < i10; i10--) {
                if ((mVar.f7300c * f.f5782b) + i10 < j10) {
                    break loop0;
                }
                while (true) {
                    Object B10 = mVar.B(i10);
                    if (B10 != null) {
                        d10 = f.f5785e;
                        if (B10 != d10) {
                            if (!(B10 instanceof y)) {
                                if (!(B10 instanceof V0)) {
                                    break;
                                }
                                if (mVar.v(i10, B10, f.z())) {
                                    b10 = AbstractC1082j.c(b10, B10);
                                    mVar.C(i10, true);
                                    break;
                                }
                            } else {
                                if (mVar.v(i10, B10, f.z())) {
                                    b10 = AbstractC1082j.c(b10, ((y) B10).f5819a);
                                    mVar.C(i10, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (mVar.v(i10, B10, f.z())) {
                        mVar.t();
                        break;
                    }
                }
            }
            mVar = (m) mVar.h();
        }
        if (b10 != null) {
            if (!(b10 instanceof ArrayList)) {
                W0((V0) b10);
                return;
            }
            Intrinsics.e(b10, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) b10;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                W0((V0) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O0(Object obj, e eVar, Rd.a aVar, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        if (obj != f.z()) {
            Od.w.a(eVar.f5766b, obj, aVar.getContext());
        }
        return Unit.f36324a;
    }

    private final m P() {
        Object obj = f5762j.get(this);
        m mVar = (m) f5760h.get(this);
        if (mVar.f7300c > ((m) obj).f7300c) {
            obj = mVar;
        }
        m mVar2 = (m) f5761i.get(this);
        if (mVar2.f7300c > ((m) obj).f7300c) {
            obj = mVar2;
        }
        return (m) AbstractC1073a.b((AbstractC1074b) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0(V0 v02, m mVar, int i10) {
        M0();
        v02.d(mVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(V0 v02, m mVar, int i10) {
        v02.d(mVar, i10 + f.f5782b);
    }

    private final void R(long j10) {
        V0(S(j10));
    }

    static /* synthetic */ Object R0(e eVar, kotlin.coroutines.d dVar) {
        D d10;
        D d11;
        D d12;
        m mVar = (m) g0().get(eVar);
        while (!eVar.u0()) {
            long andIncrement = h0().getAndIncrement(eVar);
            int i10 = f.f5782b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (mVar.f7300c != j10) {
                m X10 = eVar.X(j10, mVar);
                if (X10 == null) {
                    continue;
                } else {
                    mVar = X10;
                }
            }
            Object h12 = eVar.h1(mVar, i11, andIncrement, null);
            d10 = f.f5793m;
            if (h12 == d10) {
                throw new IllegalStateException("unexpected");
            }
            d11 = f.f5795o;
            if (h12 != d11) {
                d12 = f.f5794n;
                if (h12 == d12) {
                    return eVar.U0(mVar, i11, andIncrement, dVar);
                }
                mVar.c();
                return h12;
            }
            if (andIncrement < eVar.m0()) {
                mVar.c();
            }
        }
        throw C.a(eVar.f0());
    }

    private final m S(long j10) {
        m P10 = P();
        if (x0()) {
            long z02 = z0(P10);
            if (z02 != -1) {
                U(z02);
            }
        }
        O(P10, j10);
        return P10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object S0(e eVar, kotlin.coroutines.d dVar) {
        d dVar2;
        int i10;
        D d10;
        D d11;
        D d12;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.f5773c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.f5773c = i11 - Integer.MIN_VALUE;
                d dVar3 = dVar2;
                Object obj = dVar3.f5771a;
                Object e10 = AbstractC3868b.e();
                i10 = dVar3.f5773c;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                    return ((k) obj).k();
                }
                lc.p.b(obj);
                m mVar = (m) g0().get(eVar);
                while (!eVar.u0()) {
                    long andIncrement = h0().getAndIncrement(eVar);
                    int i12 = f.f5782b;
                    long j10 = andIncrement / i12;
                    int i13 = (int) (andIncrement % i12);
                    if (mVar.f7300c != j10) {
                        m X10 = eVar.X(j10, mVar);
                        if (X10 == null) {
                            continue;
                        } else {
                            mVar = X10;
                        }
                    }
                    Object h12 = eVar.h1(mVar, i13, andIncrement, null);
                    d10 = f.f5793m;
                    if (h12 == d10) {
                        throw new IllegalStateException("unexpected");
                    }
                    d11 = f.f5795o;
                    if (h12 != d11) {
                        d12 = f.f5794n;
                        if (h12 != d12) {
                            mVar.c();
                            return k.f5805b.c(h12);
                        }
                        dVar3.f5773c = 1;
                        Object T02 = eVar.T0(mVar, i13, andIncrement, dVar3);
                        return T02 == e10 ? e10 : T02;
                    }
                    if (andIncrement < eVar.m0()) {
                        mVar.c();
                    }
                }
                return k.f5805b.a(eVar.c0());
            }
        }
        dVar2 = eVar.new d(dVar);
        d dVar32 = dVar2;
        Object obj2 = dVar32.f5771a;
        Object e102 = AbstractC3868b.e();
        i10 = dVar32.f5773c;
        if (i10 == 0) {
        }
    }

    private final void T() {
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T0(m mVar, int i10, long j10, kotlin.coroutines.d dVar) {
        C0117e c0117e;
        int i11;
        D d10;
        D d11;
        k b10;
        InterfaceC5068n interfaceC5068n;
        D d12;
        D d13;
        D d14;
        if (dVar instanceof C0117e) {
            c0117e = (C0117e) dVar;
            int i12 = c0117e.f5780g;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c0117e.f5780g = i12 - Integer.MIN_VALUE;
                Object obj = c0117e.f5778e;
                Object e10 = AbstractC3868b.e();
                i11 = c0117e.f5780g;
                if (i11 != 0) {
                    lc.p.b(obj);
                    c0117e.f5774a = this;
                    c0117e.f5775b = mVar;
                    c0117e.f5776c = i10;
                    c0117e.f5777d = j10;
                    c0117e.f5780g = 1;
                    C0899o b11 = AbstractC0903q.b(AbstractC3868b.c(c0117e));
                    try {
                        Intrinsics.e(b11, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$38>>");
                        v vVar = new v(b11);
                        Object h12 = h1(mVar, i10, j10, vVar);
                        d10 = f.f5793m;
                        if (h12 == d10) {
                            P0(vVar, mVar, i10);
                        } else {
                            d11 = f.f5795o;
                            if (h12 == d11) {
                                if (j10 < m0()) {
                                    mVar.c();
                                }
                                m mVar2 = (m) g0().get(this);
                                while (true) {
                                    if (u0()) {
                                        H0(b11);
                                        break;
                                    }
                                    long andIncrement = h0().getAndIncrement(this);
                                    int i13 = f.f5782b;
                                    long j11 = andIncrement / i13;
                                    int i14 = (int) (andIncrement % i13);
                                    if (mVar2.f7300c != j11) {
                                        m X10 = X(j11, mVar2);
                                        if (X10 != null) {
                                            mVar2 = X10;
                                        }
                                    }
                                    Object h13 = h1(mVar2, i14, andIncrement, vVar);
                                    d12 = f.f5793m;
                                    if (h13 == d12) {
                                        P0(vVar, mVar2, i14);
                                        break;
                                    }
                                    d13 = f.f5795o;
                                    if (h13 != d13) {
                                        d14 = f.f5794n;
                                        if (h13 == d14) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar2.c();
                                        b10 = k.b(k.f5805b.c(h13));
                                        Function1 function1 = this.f5766b;
                                        interfaceC5068n = (InterfaceC5068n) (function1 != null ? L(function1) : null);
                                    } else if (andIncrement < m0()) {
                                        mVar2.c();
                                    }
                                }
                            } else {
                                mVar.c();
                                b10 = k.b(k.f5805b.c(h12));
                                Function1 function12 = this.f5766b;
                                interfaceC5068n = (InterfaceC5068n) (function12 != null ? L(function12) : null);
                            }
                            b11.h(b10, interfaceC5068n);
                        }
                        obj = b11.y();
                        if (obj == AbstractC3868b.e()) {
                            kotlin.coroutines.jvm.internal.h.c(c0117e);
                        }
                        if (obj == e10) {
                            return e10;
                        }
                    } catch (Throwable th) {
                        b11.O();
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                }
                return ((k) obj).k();
            }
        }
        c0117e = new C0117e(dVar);
        Object obj2 = c0117e.f5778e;
        Object e102 = AbstractC3868b.e();
        i11 = c0117e.f5780g;
        if (i11 != 0) {
        }
        return ((k) obj2).k();
    }

    private final Object U0(m mVar, int i10, long j10, kotlin.coroutines.d dVar) {
        D d10;
        D d11;
        InterfaceC5068n interfaceC5068n;
        D d12;
        D d13;
        D d14;
        C0899o b10 = AbstractC0903q.b(AbstractC3868b.c(dVar));
        try {
            Object h12 = h1(mVar, i10, j10, b10);
            d10 = f.f5793m;
            if (h12 == d10) {
                P0(b10, mVar, i10);
            } else {
                d11 = f.f5795o;
                if (h12 == d11) {
                    if (j10 < m0()) {
                        mVar.c();
                    }
                    m mVar2 = (m) g0().get(this);
                    while (true) {
                        if (u0()) {
                            I0(b10);
                            break;
                        }
                        long andIncrement = h0().getAndIncrement(this);
                        int i11 = f.f5782b;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (mVar2.f7300c != j11) {
                            m X10 = X(j11, mVar2);
                            if (X10 != null) {
                                mVar2 = X10;
                            }
                        }
                        h12 = h1(mVar2, i12, andIncrement, b10);
                        d12 = f.f5793m;
                        if (h12 == d12) {
                            C0899o c0899o = b10 != null ? b10 : null;
                            if (c0899o != null) {
                                P0(c0899o, mVar2, i12);
                            }
                        } else {
                            d13 = f.f5795o;
                            if (h12 != d13) {
                                d14 = f.f5794n;
                                if (h12 == d14) {
                                    throw new IllegalStateException("unexpected");
                                }
                                mVar2.c();
                                Function1 function1 = this.f5766b;
                                interfaceC5068n = (InterfaceC5068n) (function1 != null ? I(function1) : null);
                            } else if (andIncrement < m0()) {
                                mVar2.c();
                            }
                        }
                    }
                } else {
                    mVar.c();
                    Function1 function12 = this.f5766b;
                    interfaceC5068n = (InterfaceC5068n) (function12 != null ? I(function12) : null);
                }
                b10.h(h12, interfaceC5068n);
            }
            Object y10 = b10.y();
            if (y10 == AbstractC3868b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y10;
        } catch (Throwable th) {
            b10.O();
            throw th;
        }
    }

    private final void V() {
        if (y0()) {
            return;
        }
        m mVar = (m) f5762j.get(this);
        while (true) {
            long andIncrement = f5758f.getAndIncrement(this);
            int i10 = f.f5782b;
            long j10 = andIncrement / i10;
            if (m0() <= andIncrement) {
                if (mVar.f7300c < j10 && mVar.f() != null) {
                    D0(j10, mVar);
                }
                q0(this, 0L, 1, null);
                return;
            }
            if (mVar.f7300c != j10) {
                m W10 = W(j10, mVar, andIncrement);
                if (W10 == null) {
                    continue;
                } else {
                    mVar = W10;
                }
            }
            if (f1(mVar, (int) (andIncrement % i10), andIncrement)) {
                q0(this, 0L, 1, null);
                return;
            }
            q0(this, 0L, 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
    
        r12 = (Ld.m) r12.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void V0(m mVar) {
        D d10;
        D d11;
        D d12;
        D d13;
        D d14;
        Function1 function1 = this.f5766b;
        P p10 = null;
        Object b10 = AbstractC1082j.b(null, 1, null);
        loop0: do {
            int i10 = f.f5782b - 1;
            while (true) {
                if (-1 >= i10) {
                    break;
                }
                long j10 = (mVar.f7300c * f.f5782b) + i10;
                while (true) {
                    Object B10 = mVar.B(i10);
                    d10 = f.f5789i;
                    if (B10 == d10) {
                        break loop0;
                    }
                    if (B10 != f.f5784d) {
                        d11 = f.f5785e;
                        if (B10 == d11 || B10 == null) {
                            if (mVar.v(i10, B10, f.z())) {
                                mVar.t();
                                break;
                            }
                        } else if (!(B10 instanceof V0) && !(B10 instanceof y)) {
                            d12 = f.f5787g;
                            if (B10 == d12) {
                                break loop0;
                            }
                            d13 = f.f5786f;
                            if (B10 == d13) {
                                break loop0;
                            }
                            d14 = f.f5787g;
                            if (B10 != d14) {
                                break;
                            }
                        } else {
                            if (j10 < i0()) {
                                break loop0;
                            }
                            V0 v02 = B10 instanceof y ? ((y) B10).f5819a : (V0) B10;
                            if (mVar.v(i10, B10, f.z())) {
                                if (function1 != null) {
                                    p10 = Od.w.b(function1, mVar.A(i10), p10);
                                }
                                b10 = AbstractC1082j.c(b10, v02);
                                mVar.w(i10);
                                mVar.t();
                            }
                        }
                    } else {
                        if (j10 < i0()) {
                            break loop0;
                        }
                        if (mVar.v(i10, B10, f.z())) {
                            if (function1 != null) {
                                p10 = Od.w.b(function1, mVar.A(i10), p10);
                            }
                            mVar.w(i10);
                            mVar.t();
                        }
                    }
                }
                i10--;
            }
        } while (mVar != null);
        if (b10 != null) {
            if (b10 instanceof ArrayList) {
                Intrinsics.e(b10, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) b10;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    X0((V0) arrayList.get(size));
                }
            } else {
                X0((V0) b10);
            }
        }
        if (p10 != null) {
            throw p10;
        }
    }

    private final m W(long j10, m mVar, long j11) {
        Object c10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5762j;
        Function2 function2 = (Function2) f.y();
        loop0: while (true) {
            c10 = AbstractC1073a.c(mVar, j10, function2);
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
        if (B.c(c10)) {
            T();
            D0(j10, mVar);
            q0(this, 0L, 1, null);
            return null;
        }
        m mVar2 = (m) B.b(c10);
        if (mVar2.f7300c <= j10) {
            return mVar2;
        }
        long j12 = mVar2.f7300c;
        int i10 = f.f5782b;
        if (f5758f.compareAndSet(this, j11 + 1, j12 * i10)) {
            p0((mVar2.f7300c * i10) - j11);
            return null;
        }
        q0(this, 0L, 1, null);
        return null;
    }

    private final void W0(V0 v02) {
        Y0(v02, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m X(long j10, m mVar) {
        Object c10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5761i;
        Function2 function2 = (Function2) f.y();
        loop0: while (true) {
            c10 = AbstractC1073a.c(mVar, j10, function2);
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
        if (B.c(c10)) {
            T();
            if (mVar.f7300c * f.f5782b >= m0()) {
                return null;
            }
            mVar.c();
            return null;
        }
        m mVar2 = (m) B.b(c10);
        if (!y0() && j10 <= a0() / f.f5782b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5762j;
            while (true) {
                A a11 = (A) atomicReferenceFieldUpdater2.get(this);
                if (a11.f7300c >= mVar2.f7300c || !mVar2.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, a11, mVar2)) {
                    if (a11.p()) {
                        a11.n();
                    }
                } else if (mVar2.p()) {
                    mVar2.n();
                }
            }
        }
        long j11 = mVar2.f7300c;
        if (j11 <= j10) {
            return mVar2;
        }
        int i10 = f.f5782b;
        l1(j11 * i10);
        if (mVar2.f7300c * i10 >= m0()) {
            return null;
        }
        mVar2.c();
        return null;
    }

    private final void X0(V0 v02) {
        Y0(v02, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m Y(long j10, m mVar) {
        Object c10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5760h;
        Function2 function2 = (Function2) f.y();
        loop0: while (true) {
            c10 = AbstractC1073a.c(mVar, j10, function2);
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
        if (B.c(c10)) {
            T();
            if (mVar.f7300c * f.f5782b >= i0()) {
                return null;
            }
            mVar.c();
            return null;
        }
        m mVar2 = (m) B.b(c10);
        long j11 = mVar2.f7300c;
        if (j11 <= j10) {
            return mVar2;
        }
        int i10 = f.f5782b;
        m1(j11 * i10);
        if (mVar2.f7300c * i10 >= i0()) {
            return null;
        }
        mVar2.c();
        return null;
    }

    private final void Y0(V0 v02, boolean z10) {
        if (v02 instanceof InterfaceC0895m) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) v02;
            o.a aVar = lc.o.f37128b;
            dVar.resumeWith(lc.o.b(lc.p.a(z10 ? f0() : j0())));
        } else if (v02 instanceof v) {
            C0899o c0899o = ((v) v02).f5818a;
            o.a aVar2 = lc.o.f37128b;
            c0899o.resumeWith(lc.o.b(k.b(k.f5805b.a(c0()))));
        } else {
            if (v02 instanceof a) {
                ((a) v02).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + v02).toString());
        }
    }

    static /* synthetic */ Object Z0(e eVar, Object obj, kotlin.coroutines.d dVar) {
        m mVar = (m) k0().get(eVar);
        while (true) {
            long andIncrement = l0().getAndIncrement(eVar);
            long j10 = 1152921504606846975L & andIncrement;
            boolean w02 = eVar.w0(andIncrement);
            int i10 = f.f5782b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (mVar.f7300c != j11) {
                m Y10 = eVar.Y(j11, mVar);
                if (Y10 != null) {
                    mVar = Y10;
                } else if (w02) {
                    Object J02 = eVar.J0(obj, dVar);
                    if (J02 == AbstractC3868b.e()) {
                        return J02;
                    }
                }
            }
            int j12 = eVar.j1(mVar, i11, obj, j10, null, w02);
            if (j12 == 0) {
                mVar.c();
                break;
            }
            if (j12 == 1) {
                break;
            }
            if (j12 != 2) {
                if (j12 == 3) {
                    Object a12 = eVar.a1(mVar, i11, obj, j10, dVar);
                    if (a12 == AbstractC3868b.e()) {
                        return a12;
                    }
                } else if (j12 == 4) {
                    if (j10 < eVar.i0()) {
                        mVar.c();
                    }
                    Object J03 = eVar.J0(obj, dVar);
                    if (J03 == AbstractC3868b.e()) {
                        return J03;
                    }
                } else if (j12 == 5) {
                    mVar.c();
                }
            } else if (w02) {
                mVar.t();
                Object J04 = eVar.J0(obj, dVar);
                if (J04 == AbstractC3868b.e()) {
                    return J04;
                }
            }
        }
        return Unit.f36324a;
    }

    private final long a0() {
        return f5758f.get(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a1(m mVar, int i10, Object obj, long j10, kotlin.coroutines.d dVar) {
        Object b10;
        Object y10;
        m mVar2;
        C0899o b11 = AbstractC0903q.b(AbstractC3868b.c(dVar));
        try {
            int j12 = j1(mVar, i10, obj, j10, b11, false);
            if (j12 == 0) {
                mVar.c();
                o.a aVar = lc.o.f37128b;
                b10 = lc.o.b(Unit.f36324a);
            } else {
                if (j12 != 1) {
                    if (j12 != 2) {
                        if (j12 != 4) {
                            if (j12 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            mVar.c();
                            m mVar3 = (m) k0().get(this);
                            while (true) {
                                long andIncrement = l0().getAndIncrement(this);
                                long j11 = andIncrement & 1152921504606846975L;
                                boolean w02 = w0(andIncrement);
                                int i11 = f.f5782b;
                                long j13 = j11 / i11;
                                int i12 = (int) (j11 % i11);
                                if (mVar3.f7300c != j13) {
                                    m Y10 = Y(j13, mVar3);
                                    if (Y10 != null) {
                                        mVar2 = Y10;
                                    } else if (w02) {
                                        break;
                                    }
                                } else {
                                    mVar2 = mVar3;
                                }
                                m mVar4 = mVar2;
                                int j14 = j1(mVar2, i12, obj, j11, b11, w02);
                                if (j14 == 0) {
                                    mVar4.c();
                                    o.a aVar2 = lc.o.f37128b;
                                    b10 = lc.o.b(Unit.f36324a);
                                    break;
                                }
                                if (j14 == 1) {
                                    o.a aVar3 = lc.o.f37128b;
                                    b10 = lc.o.b(Unit.f36324a);
                                    break;
                                }
                                if (j14 != 2) {
                                    if (j14 == 3) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    if (j14 != 4) {
                                        if (j14 == 5) {
                                            mVar4.c();
                                        }
                                        mVar3 = mVar4;
                                    } else if (j11 < i0()) {
                                        mVar4.c();
                                    }
                                } else if (w02) {
                                    mVar4.t();
                                } else {
                                    C0899o c0899o = b11 != null ? b11 : null;
                                    if (c0899o != null) {
                                        Q0(c0899o, mVar4, i12);
                                    }
                                }
                            }
                        } else if (j10 < i0()) {
                            mVar.c();
                        }
                        K0(obj, b11);
                    } else {
                        Q0(b11, mVar, i10);
                    }
                    y10 = b11.y();
                    if (y10 == AbstractC3868b.e()) {
                        kotlin.coroutines.jvm.internal.h.c(dVar);
                    }
                    return y10 != AbstractC3868b.e() ? y10 : Unit.f36324a;
                }
                o.a aVar4 = lc.o.f37128b;
                b10 = lc.o.b(Unit.f36324a);
            }
            b11.resumeWith(b10);
            y10 = b11.y();
            if (y10 == AbstractC3868b.e()) {
            }
            if (y10 != AbstractC3868b.e()) {
            }
        } catch (Throwable th) {
            b11.O();
            throw th;
        }
    }

    private final boolean b1(long j10) {
        if (w0(j10)) {
            return false;
        }
        return !M(j10 & 1152921504606846975L);
    }

    private final boolean c1(Object obj, Object obj2) {
        boolean B10;
        boolean B11;
        if (obj instanceof v) {
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C0899o c0899o = ((v) obj).f5818a;
            k b10 = k.b(k.f5805b.c(obj2));
            Function1 function1 = this.f5766b;
            B11 = f.B(c0899o, b10, (InterfaceC5068n) (function1 != null ? L(function1) : null));
            return B11;
        }
        if (obj instanceof a) {
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (!(obj instanceof InterfaceC0895m)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        InterfaceC0895m interfaceC0895m = (InterfaceC0895m) obj;
        Function1 function12 = this.f5766b;
        B10 = f.B(interfaceC0895m, obj2, (InterfaceC5068n) (function12 != null ? I(function12) : null));
        return B10;
    }

    private final boolean d1(Object obj, m mVar, int i10) {
        if (obj instanceof InterfaceC0895m) {
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f.C((InterfaceC0895m) obj, Unit.f36324a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable f0() {
        Throwable c02 = c0();
        return c02 == null ? new p("Channel was closed") : c02;
    }

    private final boolean f1(m mVar, int i10, long j10) {
        D d10;
        D d11;
        Object B10 = mVar.B(i10);
        if ((B10 instanceof V0) && j10 >= f5757e.get(this)) {
            d10 = f.f5787g;
            if (mVar.v(i10, B10, d10)) {
                if (d1(B10, mVar, i10)) {
                    mVar.F(i10, f.f5784d);
                    return true;
                }
                d11 = f.f5790j;
                mVar.F(i10, d11);
                mVar.C(i10, false);
                return false;
            }
        }
        return g1(mVar, i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater g0() {
        return f5761i;
    }

    private final boolean g1(m mVar, int i10, long j10) {
        D d10;
        D d11;
        D d12;
        D d13;
        D d14;
        D d15;
        D d16;
        D d17;
        while (true) {
            Object B10 = mVar.B(i10);
            if (!(B10 instanceof V0)) {
                d12 = f.f5790j;
                if (B10 != d12) {
                    if (B10 != null) {
                        if (B10 != f.f5784d) {
                            d14 = f.f5788h;
                            if (B10 == d14) {
                                break;
                            }
                            d15 = f.f5789i;
                            if (B10 == d15) {
                                break;
                            }
                            d16 = f.f5791k;
                            if (B10 == d16 || B10 == f.z()) {
                                return true;
                            }
                            d17 = f.f5786f;
                            if (B10 != d17) {
                                throw new IllegalStateException(("Unexpected cell state: " + B10).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        d13 = f.f5785e;
                        if (mVar.v(i10, B10, d13)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j10 >= f5757e.get(this)) {
                d10 = f.f5787g;
                if (mVar.v(i10, B10, d10)) {
                    if (d1(B10, mVar, i10)) {
                        mVar.F(i10, f.f5784d);
                        return true;
                    }
                    d11 = f.f5790j;
                    mVar.F(i10, d11);
                    mVar.C(i10, false);
                    return false;
                }
            } else if (mVar.v(i10, B10, new y((V0) B10))) {
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater h0() {
        return f5757e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h1(m mVar, int i10, long j10, Object obj) {
        D d10;
        D d11;
        D d12;
        Object B10 = mVar.B(i10);
        if (B10 == null) {
            if (j10 >= (f5756d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    d12 = f.f5794n;
                    return d12;
                }
                if (mVar.v(i10, B10, obj)) {
                    V();
                    d11 = f.f5793m;
                    return d11;
                }
            }
        } else if (B10 == f.f5784d) {
            d10 = f.f5789i;
            if (mVar.v(i10, B10, d10)) {
                V();
                return mVar.D(i10);
            }
        }
        return i1(mVar, i10, j10, obj);
    }

    private final Object i1(m mVar, int i10, long j10, Object obj) {
        D d10;
        D d11;
        D d12;
        D d13;
        D d14;
        D d15;
        D d16;
        D d17;
        D d18;
        D d19;
        D d20;
        D d21;
        D d22;
        D d23;
        D d24;
        D d25;
        while (true) {
            Object B10 = mVar.B(i10);
            if (B10 != null) {
                d14 = f.f5785e;
                if (B10 != d14) {
                    if (B10 == f.f5784d) {
                        d15 = f.f5789i;
                        if (mVar.v(i10, B10, d15)) {
                            V();
                            return mVar.D(i10);
                        }
                    } else {
                        d16 = f.f5790j;
                        if (B10 == d16) {
                            d17 = f.f5795o;
                            return d17;
                        }
                        d18 = f.f5788h;
                        if (B10 == d18) {
                            d19 = f.f5795o;
                            return d19;
                        }
                        if (B10 == f.z()) {
                            V();
                            d20 = f.f5795o;
                            return d20;
                        }
                        d21 = f.f5787g;
                        if (B10 != d21) {
                            d22 = f.f5786f;
                            if (mVar.v(i10, B10, d22)) {
                                boolean z10 = B10 instanceof y;
                                if (z10) {
                                    B10 = ((y) B10).f5819a;
                                }
                                if (d1(B10, mVar, i10)) {
                                    d25 = f.f5789i;
                                    mVar.F(i10, d25);
                                    V();
                                    return mVar.D(i10);
                                }
                                d23 = f.f5790j;
                                mVar.F(i10, d23);
                                mVar.C(i10, false);
                                if (z10) {
                                    V();
                                }
                                d24 = f.f5795o;
                                return d24;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (j10 < (f5756d.get(this) & 1152921504606846975L)) {
                d10 = f.f5788h;
                if (mVar.v(i10, B10, d10)) {
                    V();
                    d11 = f.f5795o;
                    return d11;
                }
            } else {
                if (obj == null) {
                    d12 = f.f5794n;
                    return d12;
                }
                if (mVar.v(i10, B10, obj)) {
                    V();
                    d13 = f.f5793m;
                    return d13;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int j1(m mVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        D d10;
        D d11;
        D d12;
        mVar.G(i10, obj);
        if (z10) {
            return k1(mVar, i10, obj, j10, obj2, z10);
        }
        Object B10 = mVar.B(i10);
        if (B10 == null) {
            if (M(j10)) {
                if (mVar.v(i10, null, f.f5784d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.v(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (B10 instanceof V0) {
            mVar.w(i10);
            if (c1(B10, obj)) {
                d12 = f.f5789i;
                mVar.F(i10, d12);
                L0();
                return 0;
            }
            d10 = f.f5791k;
            Object x10 = mVar.x(i10, d10);
            d11 = f.f5791k;
            if (x10 != d11) {
                mVar.C(i10, true);
            }
            return 5;
        }
        return k1(mVar, i10, obj, j10, obj2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater k0() {
        return f5760h;
    }

    private final int k1(m mVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        D d10;
        D d11;
        D d12;
        D d13;
        D d14;
        D d15;
        D d16;
        while (true) {
            Object B10 = mVar.B(i10);
            if (B10 != null) {
                d11 = f.f5785e;
                if (B10 != d11) {
                    d12 = f.f5791k;
                    if (B10 == d12) {
                        mVar.w(i10);
                        return 5;
                    }
                    d13 = f.f5788h;
                    if (B10 == d13) {
                        mVar.w(i10);
                        return 5;
                    }
                    if (B10 == f.z()) {
                        mVar.w(i10);
                        T();
                        return 4;
                    }
                    mVar.w(i10);
                    if (B10 instanceof y) {
                        B10 = ((y) B10).f5819a;
                    }
                    if (c1(B10, obj)) {
                        d16 = f.f5789i;
                        mVar.F(i10, d16);
                        L0();
                        return 0;
                    }
                    d14 = f.f5791k;
                    Object x10 = mVar.x(i10, d14);
                    d15 = f.f5791k;
                    if (x10 != d15) {
                        mVar.C(i10, true);
                    }
                    return 5;
                }
                if (mVar.v(i10, B10, f.f5784d)) {
                    return 1;
                }
            } else if (!M(j10) || z10) {
                if (z10) {
                    d10 = f.f5790j;
                    if (mVar.v(i10, null, d10)) {
                        mVar.C(i10, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (mVar.v(i10, null, obj2)) {
                        return 2;
                    }
                }
            } else if (mVar.v(i10, null, f.f5784d)) {
                return 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater l0() {
        return f5756d;
    }

    private final void l1(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5757e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
        } while (!f5757e.compareAndSet(this, j11, j10));
    }

    private final void m1(long j10) {
        long j11;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5756d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            long j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            } else {
                w10 = f.w(j12, (int) (j11 >> 60));
            }
        } while (!f5756d.compareAndSet(this, j11, w10));
    }

    private final void p0(long j10) {
        if ((f5759g.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            while ((f5759g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void q0(e eVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        eVar.p0(j10);
    }

    private final void r0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5764l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? f.f5797q : f.f5798r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(c0());
    }

    private final boolean s0(m mVar, int i10, long j10) {
        Object B10;
        D d10;
        D d11;
        D d12;
        D d13;
        D d14;
        D d15;
        D d16;
        do {
            B10 = mVar.B(i10);
            if (B10 != null) {
                d11 = f.f5785e;
                if (B10 != d11) {
                    if (B10 == f.f5784d) {
                        return true;
                    }
                    d12 = f.f5790j;
                    if (B10 == d12 || B10 == f.z()) {
                        return false;
                    }
                    d13 = f.f5789i;
                    if (B10 == d13) {
                        return false;
                    }
                    d14 = f.f5788h;
                    if (B10 == d14) {
                        return false;
                    }
                    d15 = f.f5787g;
                    if (B10 == d15) {
                        return true;
                    }
                    d16 = f.f5786f;
                    return B10 != d16 && j10 == i0();
                }
            }
            d10 = f.f5788h;
        } while (!mVar.v(i10, B10, d10));
        V();
        return false;
    }

    private final boolean t0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            S(j10 & 1152921504606846975L);
            if (z10 && o0()) {
                return false;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i10).toString());
            }
            R(j10 & 1152921504606846975L);
        }
        return true;
    }

    private final boolean v0(long j10) {
        return t0(j10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w0(long j10) {
        return t0(j10, false);
    }

    private final boolean y0() {
        long a02 = a0();
        return a02 == 0 || a02 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (Ld.m) r8.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long z0(m mVar) {
        D d10;
        do {
            int i10 = f.f5782b;
            while (true) {
                i10--;
                if (-1 >= i10) {
                    break;
                }
                long j10 = (mVar.f7300c * f.f5782b) + i10;
                if (j10 < i0()) {
                    return -1L;
                }
                while (true) {
                    Object B10 = mVar.B(i10);
                    if (B10 != null) {
                        d10 = f.f5785e;
                        if (B10 != d10) {
                            if (B10 == f.f5784d) {
                                return j10;
                            }
                        }
                    }
                    if (mVar.v(i10, B10, f.z())) {
                        mVar.t();
                        break;
                    }
                }
            }
        } while (mVar != null);
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return Ld.k.f5805b.c(kotlin.Unit.f36324a);
     */
    @Override // Ld.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(Object obj) {
        Object obj2;
        m mVar;
        if (b1(f5756d.get(this))) {
            return k.f5805b.b();
        }
        obj2 = f.f5790j;
        m mVar2 = (m) k0().get(this);
        while (true) {
            long andIncrement = l0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean w02 = w0(andIncrement);
            int i10 = f.f5782b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (mVar2.f7300c != j11) {
                m Y10 = Y(j11, mVar2);
                if (Y10 != null) {
                    mVar = Y10;
                } else if (w02) {
                    break;
                }
            } else {
                mVar = mVar2;
            }
            int j12 = j1(mVar, i11, obj, j10, obj2, w02);
            if (j12 == 0) {
                mVar.c();
                break;
            }
            if (j12 == 1) {
                break;
            }
            if (j12 != 2) {
                if (j12 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (j12 != 4) {
                    if (j12 == 5) {
                        mVar.c();
                    }
                    mVar2 = mVar;
                } else if (j10 < i0()) {
                    mVar.c();
                }
            } else {
                if (!w02) {
                    V0 v02 = obj2 instanceof V0 ? (V0) obj2 : null;
                    if (v02 != null) {
                        Q0(v02, mVar, i11);
                    }
                    mVar.t();
                    return k.f5805b.b();
                }
                mVar.t();
            }
        }
        return k.f5805b.a(j0());
    }

    @Override // Ld.x
    public Object D(Object obj, kotlin.coroutines.d dVar) {
        return Z0(this, obj, dVar);
    }

    @Override // Ld.x
    public boolean E() {
        return w0(f5756d.get(this));
    }

    public boolean N(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return Q(th, true);
    }

    protected boolean Q(Throwable th, boolean z10) {
        D d10;
        if (z10) {
            A0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5763k;
        d10 = f.f5799s;
        boolean a10 = androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, d10, th);
        if (z10) {
            B0();
        } else {
            C0();
        }
        T();
        G0();
        if (a10) {
            r0();
        }
        return a10;
    }

    protected final void U(long j10) {
        D d10;
        P c10;
        m mVar = (m) f5761i.get(this);
        while (true) {
            long j11 = f5757e.get(this);
            if (j10 < Math.max(this.f5765a + j11, a0())) {
                return;
            }
            if (f5757e.compareAndSet(this, j11, j11 + 1)) {
                int i10 = f.f5782b;
                long j12 = j11 / i10;
                int i11 = (int) (j11 % i10);
                if (mVar.f7300c != j12) {
                    m X10 = X(j12, mVar);
                    if (X10 == null) {
                        continue;
                    } else {
                        mVar = X10;
                    }
                }
                Object h12 = h1(mVar, i11, j11, null);
                d10 = f.f5795o;
                if (h12 != d10) {
                    mVar.c();
                    Function1 function1 = this.f5766b;
                    if (function1 != null && (c10 = Od.w.c(function1, h12, null, 2, null)) != null) {
                        throw c10;
                    }
                } else if (j11 < m0()) {
                    mVar.c();
                }
            }
        }
    }

    protected final Throwable c0() {
        return (Throwable) f5763k.get(this);
    }

    @Override // Ld.w
    public final void d(CancellationException cancellationException) {
        N(cancellationException);
    }

    @Override // Ld.w
    public Object e() {
        Object obj;
        m mVar;
        D d10;
        D d11;
        D d12;
        long j10 = f5757e.get(this);
        long j11 = f5756d.get(this);
        if (v0(j11)) {
            return k.f5805b.a(c0());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return k.f5805b.b();
        }
        obj = f.f5791k;
        m mVar2 = (m) g0().get(this);
        while (!u0()) {
            long andIncrement = h0().getAndIncrement(this);
            int i10 = f.f5782b;
            long j12 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (mVar2.f7300c != j12) {
                m X10 = X(j12, mVar2);
                if (X10 == null) {
                    continue;
                } else {
                    mVar = X10;
                }
            } else {
                mVar = mVar2;
            }
            Object h12 = h1(mVar, i11, andIncrement, obj);
            d10 = f.f5793m;
            if (h12 == d10) {
                V0 v02 = obj instanceof V0 ? (V0) obj : null;
                if (v02 != null) {
                    P0(v02, mVar, i11);
                }
                n1(andIncrement);
                mVar.t();
                return k.f5805b.b();
            }
            d11 = f.f5795o;
            if (h12 != d11) {
                d12 = f.f5794n;
                if (h12 == d12) {
                    throw new IllegalStateException("unexpected");
                }
                mVar.c();
                return k.f5805b.c(h12);
            }
            if (andIncrement < m0()) {
                mVar.c();
            }
            mVar2 = mVar;
        }
        return k.f5805b.a(c0());
    }

    protected final Object e1(Object obj) {
        m mVar;
        Object obj2 = f.f5784d;
        m mVar2 = (m) k0().get(this);
        while (true) {
            long andIncrement = l0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean w02 = w0(andIncrement);
            int i10 = f.f5782b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (mVar2.f7300c != j11) {
                m Y10 = Y(j11, mVar2);
                if (Y10 != null) {
                    mVar = Y10;
                } else if (w02) {
                    return k.f5805b.a(j0());
                }
            } else {
                mVar = mVar2;
            }
            int j12 = j1(mVar, i11, obj, j10, obj2, w02);
            if (j12 == 0) {
                mVar.c();
                return k.f5805b.c(Unit.f36324a);
            }
            if (j12 == 1) {
                return k.f5805b.c(Unit.f36324a);
            }
            if (j12 == 2) {
                if (w02) {
                    mVar.t();
                    return k.f5805b.a(j0());
                }
                V0 v02 = obj2 instanceof V0 ? (V0) obj2 : null;
                if (v02 != null) {
                    Q0(v02, mVar, i11);
                }
                U((mVar.f7300c * i10) + i11);
                return k.f5805b.c(Unit.f36324a);
            }
            if (j12 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (j12 == 4) {
                if (j10 < i0()) {
                    mVar.c();
                }
                return k.f5805b.a(j0());
            }
            if (j12 == 5) {
                mVar.c();
            }
            mVar2 = mVar;
        }
    }

    public final long i0() {
        return f5757e.get(this);
    }

    @Override // Ld.w
    public i iterator() {
        return new a();
    }

    protected final Throwable j0() {
        Throwable c02 = c0();
        return c02 == null ? new q("Channel was closed") : c02;
    }

    @Override // Ld.w
    public Object k(kotlin.coroutines.d dVar) {
        return S0(this, dVar);
    }

    @Override // Ld.w
    public Object m(kotlin.coroutines.d dVar) {
        return R0(this, dVar);
    }

    public final long m0() {
        return f5756d.get(this) & 1152921504606846975L;
    }

    public final void n1(long j10) {
        int i10;
        long j11;
        long v10;
        long v11;
        long j12;
        long v12;
        if (y0()) {
            return;
        }
        while (a0() <= j10) {
        }
        i10 = f.f5783c;
        for (int i11 = 0; i11 < i10; i11++) {
            long a02 = a0();
            if (a02 == (f5759g.get(this) & 4611686018427387903L) && a02 == a0()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5759g;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            v10 = f.v(j11 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, v10));
        while (true) {
            long a03 = a0();
            long j13 = f5759g.get(this);
            long j14 = j13 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j13) != 0;
            if (a03 == j14 && a03 == a0()) {
                break;
            }
            if (!z10) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5759g;
                v11 = f.v(j14, true);
                atomicLongFieldUpdater2.compareAndSet(this, j13, v11);
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater3 = f5759g;
        do {
            j12 = atomicLongFieldUpdater3.get(this);
            v12 = f.v(j12 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater3.compareAndSet(this, j12, v12));
    }

    public final boolean o0() {
        while (true) {
            m mVar = (m) f5761i.get(this);
            long i02 = i0();
            if (m0() <= i02) {
                return false;
            }
            int i10 = f.f5782b;
            long j10 = i02 / i10;
            if (mVar.f7300c == j10 || (mVar = X(j10, mVar)) != null) {
                mVar.c();
                if (s0(mVar, (int) (i02 % i10), i02)) {
                    return true;
                }
                f5757e.compareAndSet(this, i02, 1 + i02);
            } else if (((m) f5761i.get(this)).f7300c < j10) {
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b5, code lost:
    
        r3 = (Ld.m) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bc, code lost:
    
        if (r3 != null) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        D d10;
        String str;
        D d11;
        D d12;
        D d13;
        D d14;
        D d15;
        D d16;
        m mVar;
        StringBuilder sb2 = new StringBuilder();
        int i10 = (int) (f5756d.get(this) >> 60);
        if (i10 == 2) {
            sb2.append("closed,");
        } else if (i10 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f5765a + ',');
        sb2.append("data=[");
        int i11 = 0;
        List m10 = CollectionsKt.m(f5761i.get(this), f5760h.get(this), f5762j.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m10) {
            m mVar2 = (m) obj;
            mVar = f.f5781a;
            if (mVar2 != mVar) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((m) next).f7300c;
            do {
                Object next2 = it.next();
                long j11 = ((m) next2).f7300c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        m mVar3 = (m) next;
        long i02 = i0();
        long m02 = m0();
        loop2: while (true) {
            int i12 = f.f5782b;
            int i13 = i11;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                long j12 = (mVar3.f7300c * f.f5782b) + i13;
                if (j12 >= m02 && j12 >= i02) {
                    break loop2;
                }
                Object B10 = mVar3.B(i13);
                Object A10 = mVar3.A(i13);
                if (B10 instanceof InterfaceC0895m) {
                    str = (j12 >= i02 || j12 < m02) ? (j12 >= m02 || j12 < i02) ? "cont" : "send" : "receive";
                } else if (B10 instanceof v) {
                    str = "receiveCatching";
                } else if (B10 instanceof y) {
                    str = "EB(" + B10 + ')';
                } else {
                    d10 = f.f5786f;
                    if (!Intrinsics.b(B10, d10)) {
                        d11 = f.f5787g;
                        if (!Intrinsics.b(B10, d11)) {
                            if (B10 != null) {
                                d12 = f.f5785e;
                                if (!Intrinsics.b(B10, d12)) {
                                    d13 = f.f5789i;
                                    if (!Intrinsics.b(B10, d13)) {
                                        d14 = f.f5788h;
                                        if (!Intrinsics.b(B10, d14)) {
                                            d15 = f.f5791k;
                                            if (!Intrinsics.b(B10, d15)) {
                                                d16 = f.f5790j;
                                                if (!Intrinsics.b(B10, d16) && !Intrinsics.b(B10, f.z())) {
                                                    str = B10.toString();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i13++;
                        }
                    }
                    str = "resuming_sender";
                }
                if (A10 != null) {
                    sb2.append('(' + str + ',' + A10 + "),");
                } else {
                    sb2.append(str + ',');
                }
                i13++;
            }
            i11 = 0;
        }
        if (StringsKt.V0(sb2) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    public boolean u0() {
        return v0(f5756d.get(this));
    }

    @Override // Ld.x
    public boolean v(Throwable th) {
        return Q(th, false);
    }

    @Override // Ld.x
    public void w(Function1 function1) {
        D d10;
        D d11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        D d12;
        D d13;
        if (androidx.concurrent.futures.b.a(f5764l, this, null, function1)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5764l;
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            d10 = f.f5797q;
            if (obj != d10) {
                d11 = f.f5798r;
                if (obj == d11) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = f5764l;
            d12 = f.f5797q;
            d13 = f.f5798r;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, d12, d13));
        function1.invoke(c0());
    }

    protected boolean x0() {
        return false;
    }

    protected void G0() {
    }

    protected void L0() {
    }

    protected void M0() {
    }
}
