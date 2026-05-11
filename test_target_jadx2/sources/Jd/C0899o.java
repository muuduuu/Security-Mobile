package Jd;

import Jd.InterfaceC0893l;
import Od.C1080h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;

/* renamed from: Jd.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0899o extends Z implements InterfaceC0895m, kotlin.coroutines.jvm.internal.e, V0 {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5052f = AtomicIntegerFieldUpdater.newUpdater(C0899o.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5053g = AtomicReferenceFieldUpdater.newUpdater(C0899o.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5054h = AtomicReferenceFieldUpdater.newUpdater(C0899o.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.coroutines.d f5055d;

    /* renamed from: e, reason: collision with root package name */
    private final CoroutineContext f5056e;

    public C0899o(kotlin.coroutines.d dVar, int i10) {
        super(i10);
        this.f5055d = dVar;
        this.f5056e = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0877d.f5026a;
    }

    private final String B() {
        Object z10 = z();
        return z10 instanceof J0 ? "Active" : z10 instanceof r ? "Cancelled" : "Completed";
    }

    private final InterfaceC0876c0 H() {
        InterfaceC0876c0 i10;
        InterfaceC0915w0 interfaceC0915w0 = (InterfaceC0915w0) getContext().a(InterfaceC0915w0.f5070O);
        if (interfaceC0915w0 == null) {
            return null;
        }
        i10 = A0.i(interfaceC0915w0, false, new C0906s(this), 1, null);
        androidx.concurrent.futures.b.a(f5054h, this, null, i10);
        return i10;
    }

    private final void I(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5053g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C0877d) {
                if (androidx.concurrent.futures.b.a(f5053g, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof InterfaceC0893l) || (obj2 instanceof Od.A)) {
                L(obj, obj2);
            } else {
                if (obj2 instanceof B) {
                    B b10 = (B) obj2;
                    if (!b10.c()) {
                        L(obj, obj2);
                    }
                    if (obj2 instanceof r) {
                        if (!(obj2 instanceof B)) {
                            b10 = null;
                        }
                        Throwable th = b10 != null ? b10.f4974a : null;
                        if (obj instanceof InterfaceC0893l) {
                            m((InterfaceC0893l) obj, th);
                            return;
                        } else {
                            Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            p((Od.A) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof A) {
                    A a10 = (A) obj2;
                    if (a10.f4969b != null) {
                        L(obj, obj2);
                    }
                    if (obj instanceof Od.A) {
                        return;
                    }
                    Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC0893l interfaceC0893l = (InterfaceC0893l) obj;
                    if (a10.c()) {
                        m(interfaceC0893l, a10.f4972e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f5053g, this, obj2, A.b(a10, null, interfaceC0893l, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof Od.A) {
                        return;
                    }
                    Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.b.a(f5053g, this, obj2, new A(obj2, (InterfaceC0893l) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean K() {
        if (AbstractC0872a0.c(this.f5021c)) {
            kotlin.coroutines.d dVar = this.f5055d;
            Intrinsics.e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C1080h) dVar).q()) {
                return true;
            }
        }
        return false;
    }

    private final void L(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(Function1 function1, Throwable th, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th);
        return Unit.f36324a;
    }

    public static /* synthetic */ void T(C0899o c0899o, Object obj, int i10, InterfaceC5068n interfaceC5068n, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            interfaceC5068n = null;
        }
        c0899o.S(obj, i10, interfaceC5068n);
    }

    private final Object U(J0 j02, Object obj, int i10, InterfaceC5068n interfaceC5068n, Object obj2) {
        if (obj instanceof B) {
            return obj;
        }
        if (!AbstractC0872a0.b(i10) && obj2 == null) {
            return obj;
        }
        if (interfaceC5068n == null && !(j02 instanceof InterfaceC0893l) && obj2 == null) {
            return obj;
        }
        return new A(obj, j02 instanceof InterfaceC0893l ? (InterfaceC0893l) j02 : null, interfaceC5068n, obj2, null, 16, null);
    }

    private final boolean V() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5052f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f5052f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final Od.D W(Object obj, Object obj2, InterfaceC5068n interfaceC5068n) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5053g;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof J0)) {
                if ((obj3 instanceof A) && obj2 != null && ((A) obj3).f4971d == obj2) {
                    return AbstractC0901p.f5057a;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f5053g, this, obj3, U((J0) obj3, obj, this.f5021c, interfaceC5068n, obj2)));
        t();
        return AbstractC0901p.f5057a;
    }

    private final boolean X() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5052f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f5052f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void l(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void p(Od.A a10, Throwable th) {
        int i10 = f5052f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            a10.s(i10, th, getContext());
        } catch (Throwable th2) {
            L.a(getContext(), new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean q(Throwable th) {
        if (!K()) {
            return false;
        }
        kotlin.coroutines.d dVar = this.f5055d;
        Intrinsics.e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C1080h) dVar).r(th);
    }

    private final void t() {
        if (K()) {
            return;
        }
        r();
    }

    private final void v(int i10) {
        if (V()) {
            return;
        }
        AbstractC0872a0.a(this, i10);
    }

    private final InterfaceC0876c0 x() {
        return (InterfaceC0876c0) f5054h.get(this);
    }

    @Override // Jd.InterfaceC0895m
    public boolean A(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5053g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof J0)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f5053g, this, obj, new r(this, th, (obj instanceof InterfaceC0893l) || (obj instanceof Od.A))));
        J0 j02 = (J0) obj;
        if (j02 instanceof InterfaceC0893l) {
            m((InterfaceC0893l) obj, th);
        } else if (j02 instanceof Od.A) {
            p((Od.A) obj, th);
        }
        t();
        v(this.f5021c);
        return true;
    }

    public void F() {
        InterfaceC0876c0 H10 = H();
        if (H10 != null && c()) {
            H10.a();
            f5054h.set(this, I0.f4998a);
        }
    }

    @Override // Jd.InterfaceC0895m
    public void G(Object obj) {
        v(this.f5021c);
    }

    public final void J(InterfaceC0893l interfaceC0893l) {
        I(interfaceC0893l);
    }

    protected String M() {
        return "CancellableContinuation";
    }

    public final void N(Throwable th) {
        if (q(th)) {
            return;
        }
        A(th);
        t();
    }

    public final void O() {
        Throwable v10;
        kotlin.coroutines.d dVar = this.f5055d;
        C1080h c1080h = dVar instanceof C1080h ? (C1080h) dVar : null;
        if (c1080h == null || (v10 = c1080h.v(this)) == null) {
            return;
        }
        r();
        A(v10);
    }

    public final boolean P() {
        Object obj = f5053g.get(this);
        if ((obj instanceof A) && ((A) obj).f4971d != null) {
            r();
            return false;
        }
        f5052f.set(this, 536870911);
        f5053g.set(this, C0877d.f5026a);
        return true;
    }

    public void Q(Object obj, final Function1 function1) {
        S(obj, this.f5021c, function1 != null ? new InterfaceC5068n() { // from class: Jd.n
            @Override // wc.InterfaceC5068n
            public final Object n(Object obj2, Object obj3, Object obj4) {
                Unit R10;
                R10 = C0899o.R(Function1.this, (Throwable) obj2, obj3, (CoroutineContext) obj4);
                return R10;
            }
        } : null);
    }

    public final void S(Object obj, int i10, InterfaceC5068n interfaceC5068n) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5053g;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof J0)) {
                if (obj2 instanceof r) {
                    r rVar = (r) obj2;
                    if (rVar.e()) {
                        if (interfaceC5068n != null) {
                            n(interfaceC5068n, rVar.f4974a, obj);
                            return;
                        }
                        return;
                    }
                }
                l(obj);
                throw new lc.e();
            }
        } while (!androidx.concurrent.futures.b.a(f5053g, this, obj2, U((J0) obj2, obj, i10, interfaceC5068n, null)));
        t();
        v(i10);
    }

    @Override // Jd.Z
    public void a(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5053g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof J0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof B) {
                return;
            }
            if (obj2 instanceof A) {
                A a10 = (A) obj2;
                if (a10.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (androidx.concurrent.futures.b.a(f5053g, this, obj2, A.b(a10, null, null, null, null, th, 15, null))) {
                    a10.d(this, th);
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f5053g, this, obj2, new A(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // Jd.InterfaceC0895m
    public boolean b() {
        return z() instanceof J0;
    }

    @Override // Jd.InterfaceC0895m
    public boolean c() {
        return !(z() instanceof J0);
    }

    @Override // Jd.V0
    public void d(Od.A a10, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5052f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        I(a10);
    }

    @Override // Jd.Z
    public final kotlin.coroutines.d e() {
        return this.f5055d;
    }

    @Override // Jd.Z
    public Throwable f(Object obj) {
        Throwable f10 = super.f(obj);
        if (f10 != null) {
            return f10;
        }
        return null;
    }

    @Override // Jd.Z
    public Object g(Object obj) {
        return obj instanceof A ? ((A) obj).f4968a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d dVar = this.f5055d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    public CoroutineContext getContext() {
        return this.f5056e;
    }

    @Override // Jd.InterfaceC0895m
    public void h(Object obj, InterfaceC5068n interfaceC5068n) {
        S(obj, this.f5021c, interfaceC5068n);
    }

    @Override // Jd.InterfaceC0895m
    public boolean isCancelled() {
        return z() instanceof r;
    }

    @Override // Jd.Z
    public Object j() {
        return z();
    }

    public final void m(InterfaceC0893l interfaceC0893l, Throwable th) {
        try {
            interfaceC0893l.a(th);
        } catch (Throwable th2) {
            L.a(getContext(), new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n(InterfaceC5068n interfaceC5068n, Throwable th, Object obj) {
        try {
            interfaceC5068n.n(th, obj, getContext());
        } catch (Throwable th2) {
            L.a(getContext(), new C("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // Jd.InterfaceC0895m
    public Object o(Object obj, Object obj2, InterfaceC5068n interfaceC5068n) {
        return W(obj, obj2, interfaceC5068n);
    }

    public final void r() {
        InterfaceC0876c0 x10 = x();
        if (x10 == null) {
            return;
        }
        x10.a();
        f5054h.set(this, I0.f4998a);
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
        T(this, D.c(obj, this), this.f5021c, null, 4, null);
    }

    @Override // Jd.InterfaceC0895m
    public void s(Function1 function1) {
        AbstractC0903q.c(this, new InterfaceC0893l.a(function1));
    }

    public String toString() {
        return M() + '(' + S.c(this.f5055d) + "){" + B() + "}@" + S.b(this);
    }

    @Override // Jd.InterfaceC0895m
    public Object u(Throwable th) {
        return W(new B(th, false, 2, null), null, null);
    }

    public Throwable w(InterfaceC0915w0 interfaceC0915w0) {
        return interfaceC0915w0.p();
    }

    public final Object y() {
        InterfaceC0915w0 interfaceC0915w0;
        boolean K10 = K();
        if (X()) {
            if (x() == null) {
                H();
            }
            if (K10) {
                O();
            }
            return AbstractC3868b.e();
        }
        if (K10) {
            O();
        }
        Object z10 = z();
        if (z10 instanceof B) {
            throw ((B) z10).f4974a;
        }
        if (!AbstractC0872a0.b(this.f5021c) || (interfaceC0915w0 = (InterfaceC0915w0) getContext().a(InterfaceC0915w0.f5070O)) == null || interfaceC0915w0.b()) {
            return g(z10);
        }
        CancellationException p10 = interfaceC0915w0.p();
        a(z10, p10);
        throw p10;
    }

    public final Object z() {
        return f5053g.get(this);
    }
}
