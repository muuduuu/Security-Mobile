package Jd;

import Jd.InterfaceC0915w0;
import Od.C1087o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.AbstractC3622a;
import pc.AbstractC3868b;
import xc.C5141B;

/* loaded from: classes3.dex */
public class C0 implements InterfaceC0915w0, InterfaceC0912v, K0 {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4976a = AtomicReferenceFieldUpdater.newUpdater(C0.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4977b = AtomicReferenceFieldUpdater.newUpdater(C0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    private static final class a extends C0899o {

        /* renamed from: i, reason: collision with root package name */
        private final C0 f4978i;

        public a(kotlin.coroutines.d dVar, C0 c02) {
            super(dVar, 1);
            this.f4978i = c02;
        }

        @Override // Jd.C0899o
        protected String M() {
            return "AwaitContinuation";
        }

        @Override // Jd.C0899o
        public Throwable w(InterfaceC0915w0 interfaceC0915w0) {
            Throwable f10;
            Object l02 = this.f4978i.l0();
            return (!(l02 instanceof c) || (f10 = ((c) l02).f()) == null) ? l02 instanceof B ? ((B) l02).f4974a : interfaceC0915w0.p() : f10;
        }
    }

    private static final class b extends B0 {

        /* renamed from: e, reason: collision with root package name */
        private final C0 f4979e;

        /* renamed from: f, reason: collision with root package name */
        private final c f4980f;

        /* renamed from: g, reason: collision with root package name */
        private final C0910u f4981g;

        /* renamed from: h, reason: collision with root package name */
        private final Object f4982h;

        public b(C0 c02, c cVar, C0910u c0910u, Object obj) {
            this.f4979e = c02;
            this.f4980f = cVar;
            this.f4981g = c0910u;
            this.f4982h = obj;
        }

        @Override // Jd.B0
        public boolean w() {
            return false;
        }

        @Override // Jd.B0
        public void x(Throwable th) {
            this.f4979e.a0(this.f4980f, this.f4981g, this.f4982h);
        }
    }

    private static final class c implements InterfaceC0905r0 {

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f4983b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f4984c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f4985d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a, reason: collision with root package name */
        private final H0 f4986a;

        public c(H0 h02, boolean z10, Throwable th) {
            this.f4986a = h02;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        private final ArrayList c() {
            return new ArrayList(4);
        }

        private final Object e() {
            return f4985d.get(this);
        }

        private final void o(Object obj) {
            f4985d.set(this, obj);
        }

        public final void a(Throwable th) {
            Throwable f10 = f();
            if (f10 == null) {
                p(th);
                return;
            }
            if (th == f10) {
                return;
            }
            Object e10 = e();
            if (e10 == null) {
                o(th);
                return;
            }
            if (e10 instanceof Throwable) {
                if (th == e10) {
                    return;
                }
                ArrayList c10 = c();
                c10.add(e10);
                c10.add(th);
                o(c10);
                return;
            }
            if (e10 instanceof ArrayList) {
                ((ArrayList) e10).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + e10).toString());
        }

        @Override // Jd.InterfaceC0905r0
        public boolean b() {
            return f() == null;
        }

        @Override // Jd.InterfaceC0905r0
        public H0 d() {
            return this.f4986a;
        }

        public final Throwable f() {
            return (Throwable) f4984c.get(this);
        }

        public final boolean j() {
            return f() != null;
        }

        public final boolean k() {
            return f4983b.get(this) != 0;
        }

        public final boolean l() {
            Od.D d10;
            Object e10 = e();
            d10 = D0.f4991e;
            return e10 == d10;
        }

        public final List m(Throwable th) {
            ArrayList arrayList;
            Od.D d10;
            Object e10 = e();
            if (e10 == null) {
                arrayList = c();
            } else if (e10 instanceof Throwable) {
                ArrayList c10 = c();
                c10.add(e10);
                arrayList = c10;
            } else {
                if (!(e10 instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + e10).toString());
                }
                arrayList = (ArrayList) e10;
            }
            Throwable f10 = f();
            if (f10 != null) {
                arrayList.add(0, f10);
            }
            if (th != null && !Intrinsics.b(th, f10)) {
                arrayList.add(th);
            }
            d10 = D0.f4991e;
            o(d10);
            return arrayList;
        }

        public final void n(boolean z10) {
            f4983b.set(this, z10 ? 1 : 0);
        }

        public final void p(Throwable th) {
            f4984c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + d() + ']';
        }
    }

    public C0(boolean z10) {
        this._state$volatile = z10 ? D0.f4993g : D0.f4992f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [Jd.q0] */
    private final void D0(C0880e0 c0880e0) {
        H0 h02 = new H0();
        if (!c0880e0.b()) {
            h02 = new C0904q0(h02);
        }
        androidx.concurrent.futures.b.a(f4976a, this, c0880e0, h02);
    }

    private final void E0(B0 b02) {
        b02.g(new H0());
        androidx.concurrent.futures.b.a(f4976a, this, b02, b02.m());
    }

    private final int H0(Object obj) {
        C0880e0 c0880e0;
        if (!(obj instanceof C0880e0)) {
            if (!(obj instanceof C0904q0)) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f4976a, this, obj, ((C0904q0) obj).d())) {
                return -1;
            }
            C0();
            return 1;
        }
        if (((C0880e0) obj).b()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4976a;
        c0880e0 = D0.f4993g;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, c0880e0)) {
            return -1;
        }
        C0();
        return 1;
    }

    private final String I0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC0905r0 ? ((InterfaceC0905r0) obj).b() ? "Active" : "New" : obj instanceof B ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.j() ? "Cancelling" : cVar.k() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException K0(C0 c02, Throwable th, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return c02.J0(th, str);
    }

    private final void M(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                AbstractC3622a.a(th, th2);
            }
        }
    }

    private final boolean M0(InterfaceC0905r0 interfaceC0905r0, Object obj) {
        if (!androidx.concurrent.futures.b.a(f4976a, this, interfaceC0905r0, D0.g(obj))) {
            return false;
        }
        A0(null);
        B0(obj);
        Z(interfaceC0905r0, obj);
        return true;
    }

    private final boolean N0(InterfaceC0905r0 interfaceC0905r0, Throwable th) {
        H0 i02 = i0(interfaceC0905r0);
        if (i02 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f4976a, this, interfaceC0905r0, new c(i02, false, th))) {
            return false;
        }
        y0(i02, th);
        return true;
    }

    private final Object O0(Object obj, Object obj2) {
        Od.D d10;
        Od.D d11;
        if (!(obj instanceof InterfaceC0905r0)) {
            d11 = D0.f4987a;
            return d11;
        }
        if ((!(obj instanceof C0880e0) && !(obj instanceof B0)) || (obj instanceof C0910u) || (obj2 instanceof B)) {
            return P0((InterfaceC0905r0) obj, obj2);
        }
        if (M0((InterfaceC0905r0) obj, obj2)) {
            return obj2;
        }
        d10 = D0.f4989c;
        return d10;
    }

    private final Object P0(InterfaceC0905r0 interfaceC0905r0, Object obj) {
        Od.D d10;
        Od.D d11;
        Od.D d12;
        H0 i02 = i0(interfaceC0905r0);
        if (i02 == null) {
            d12 = D0.f4989c;
            return d12;
        }
        c cVar = interfaceC0905r0 instanceof c ? (c) interfaceC0905r0 : null;
        if (cVar == null) {
            cVar = new c(i02, false, null);
        }
        C5141B c5141b = new C5141B();
        synchronized (cVar) {
            if (cVar.k()) {
                d11 = D0.f4987a;
                return d11;
            }
            cVar.n(true);
            if (cVar != interfaceC0905r0 && !androidx.concurrent.futures.b.a(f4976a, this, interfaceC0905r0, cVar)) {
                d10 = D0.f4989c;
                return d10;
            }
            boolean j10 = cVar.j();
            B b10 = obj instanceof B ? (B) obj : null;
            if (b10 != null) {
                cVar.a(b10.f4974a);
            }
            Throwable f10 = j10 ? null : cVar.f();
            c5141b.f44962a = f10;
            Unit unit = Unit.f36324a;
            if (f10 != null) {
                y0(i02, f10);
            }
            C0910u x02 = x0(i02);
            if (x02 != null && Q0(cVar, x02, obj)) {
                return D0.f4988b;
            }
            i02.h(2);
            C0910u x03 = x0(i02);
            return (x03 == null || !Q0(cVar, x03, obj)) ? c0(cVar, obj) : D0.f4988b;
        }
    }

    private final boolean Q0(c cVar, C0910u c0910u, Object obj) {
        while (z0.h(c0910u.f5066e, false, new b(this, cVar, c0910u, obj)) == I0.f4998a) {
            c0910u = x0(c0910u);
            if (c0910u == null) {
                return false;
            }
        }
        return true;
    }

    private final Object R(kotlin.coroutines.d dVar) {
        InterfaceC0876c0 i10;
        a aVar = new a(AbstractC3868b.c(dVar), this);
        aVar.F();
        i10 = A0.i(this, false, new L0(aVar), 1, null);
        AbstractC0903q.a(aVar, i10);
        Object y10 = aVar.y();
        if (y10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y10;
    }

    private final Object V(Object obj) {
        Od.D d10;
        Object O02;
        Od.D d11;
        do {
            Object l02 = l0();
            if (!(l02 instanceof InterfaceC0905r0) || ((l02 instanceof c) && ((c) l02).k())) {
                d10 = D0.f4987a;
                return d10;
            }
            O02 = O0(l02, new B(b0(obj), false, 2, null));
            d11 = D0.f4989c;
        } while (O02 == d11);
        return O02;
    }

    private final boolean W(Throwable th) {
        if (s0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        InterfaceC0908t k02 = k0();
        return (k02 == null || k02 == I0.f4998a) ? z10 : k02.c(th) || z10;
    }

    private final void Z(InterfaceC0905r0 interfaceC0905r0, Object obj) {
        InterfaceC0908t k02 = k0();
        if (k02 != null) {
            k02.a();
            G0(I0.f4998a);
        }
        B b10 = obj instanceof B ? (B) obj : null;
        Throwable th = b10 != null ? b10.f4974a : null;
        if (!(interfaceC0905r0 instanceof B0)) {
            H0 d10 = interfaceC0905r0.d();
            if (d10 != null) {
                z0(d10, th);
                return;
            }
            return;
        }
        try {
            ((B0) interfaceC0905r0).x(th);
        } catch (Throwable th2) {
            p0(new C("Exception in completion handler " + interfaceC0905r0 + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(c cVar, C0910u c0910u, Object obj) {
        C0910u x02 = x0(c0910u);
        if (x02 == null || !Q0(cVar, x02, obj)) {
            cVar.d().h(2);
            C0910u x03 = x0(c0910u);
            if (x03 == null || !Q0(cVar, x03, obj)) {
                O(c0(cVar, obj));
            }
        }
    }

    private final Throwable b0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C0917x0(X(), null, this) : th;
        }
        Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((K0) obj).I();
    }

    private final Object c0(c cVar, Object obj) {
        boolean j10;
        Throwable f02;
        B b10 = obj instanceof B ? (B) obj : null;
        Throwable th = b10 != null ? b10.f4974a : null;
        synchronized (cVar) {
            j10 = cVar.j();
            List m10 = cVar.m(th);
            f02 = f0(cVar, m10);
            if (f02 != null) {
                M(f02, m10);
            }
        }
        if (f02 != null && f02 != th) {
            obj = new B(f02, false, 2, null);
        }
        if (f02 != null && (W(f02) || o0(f02))) {
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((B) obj).c();
        }
        if (!j10) {
            A0(f02);
        }
        B0(obj);
        androidx.concurrent.futures.b.a(f4976a, this, cVar, D0.g(obj));
        Z(cVar, obj);
        return obj;
    }

    private final Throwable e0(Object obj) {
        B b10 = obj instanceof B ? (B) obj : null;
        if (b10 != null) {
            return b10.f4974a;
        }
        return null;
    }

    private final Throwable f0(c cVar, List list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.j()) {
                return new C0917x0(X(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : (Throwable) list.get(0);
    }

    private final H0 i0(InterfaceC0905r0 interfaceC0905r0) {
        H0 d10 = interfaceC0905r0.d();
        if (d10 != null) {
            return d10;
        }
        if (interfaceC0905r0 instanceof C0880e0) {
            return new H0();
        }
        if (interfaceC0905r0 instanceof B0) {
            E0((B0) interfaceC0905r0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0905r0).toString());
    }

    private final Object t0(Object obj) {
        Od.D d10;
        Od.D d11;
        Od.D d12;
        Od.D d13;
        Od.D d14;
        Od.D d15;
        Throwable th = null;
        while (true) {
            Object l02 = l0();
            if (l02 instanceof c) {
                synchronized (l02) {
                    if (((c) l02).l()) {
                        d11 = D0.f4990d;
                        return d11;
                    }
                    boolean j10 = ((c) l02).j();
                    if (obj != null || !j10) {
                        if (th == null) {
                            th = b0(obj);
                        }
                        ((c) l02).a(th);
                    }
                    Throwable f10 = j10 ? null : ((c) l02).f();
                    if (f10 != null) {
                        y0(((c) l02).d(), f10);
                    }
                    d10 = D0.f4987a;
                    return d10;
                }
            }
            if (!(l02 instanceof InterfaceC0905r0)) {
                d12 = D0.f4990d;
                return d12;
            }
            if (th == null) {
                th = b0(obj);
            }
            InterfaceC0905r0 interfaceC0905r0 = (InterfaceC0905r0) l02;
            if (!interfaceC0905r0.b()) {
                Object O02 = O0(l02, new B(th, false, 2, null));
                d14 = D0.f4987a;
                if (O02 == d14) {
                    throw new IllegalStateException(("Cannot happen in " + l02).toString());
                }
                d15 = D0.f4989c;
                if (O02 != d15) {
                    return O02;
                }
            } else if (N0(interfaceC0905r0, th)) {
                d13 = D0.f4987a;
                return d13;
            }
        }
    }

    private final C0910u x0(C1087o c1087o) {
        while (c1087o.r()) {
            c1087o = c1087o.n();
        }
        while (true) {
            c1087o = c1087o.m();
            if (!c1087o.r()) {
                if (c1087o instanceof C0910u) {
                    return (C0910u) c1087o;
                }
                if (c1087o instanceof H0) {
                    return null;
                }
            }
        }
    }

    private final void y0(H0 h02, Throwable th) {
        A0(th);
        h02.h(4);
        Object l10 = h02.l();
        Intrinsics.e(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C c10 = null;
        for (C1087o c1087o = (C1087o) l10; !Intrinsics.b(c1087o, h02); c1087o = c1087o.m()) {
            if ((c1087o instanceof B0) && ((B0) c1087o).w()) {
                try {
                    ((B0) c1087o).x(th);
                } catch (Throwable th2) {
                    if (c10 != null) {
                        AbstractC3622a.a(c10, th2);
                    } else {
                        c10 = new C("Exception in completion handler " + c1087o + " for " + this, th2);
                        Unit unit = Unit.f36324a;
                    }
                }
            }
        }
        if (c10 != null) {
            p0(c10);
        }
        W(th);
    }

    private final void z0(H0 h02, Throwable th) {
        h02.h(1);
        Object l10 = h02.l();
        Intrinsics.e(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C c10 = null;
        for (C1087o c1087o = (C1087o) l10; !Intrinsics.b(c1087o, h02); c1087o = c1087o.m()) {
            if (c1087o instanceof B0) {
                try {
                    ((B0) c1087o).x(th);
                } catch (Throwable th2) {
                    if (c10 != null) {
                        AbstractC3622a.a(c10, th2);
                    } else {
                        c10 = new C("Exception in completion handler " + c1087o + " for " + this, th2);
                        Unit unit = Unit.f36324a;
                    }
                }
            }
        }
        if (c10 != null) {
            p0(c10);
        }
    }

    public final void F0(B0 b02) {
        Object l02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0880e0 c0880e0;
        do {
            l02 = l0();
            if (!(l02 instanceof B0)) {
                if (!(l02 instanceof InterfaceC0905r0) || ((InterfaceC0905r0) l02).d() == null) {
                    return;
                }
                b02.s();
                return;
            }
            if (l02 != b02) {
                return;
            }
            atomicReferenceFieldUpdater = f4976a;
            c0880e0 = D0.f4993g;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, l02, c0880e0));
    }

    public final void G0(InterfaceC0908t interfaceC0908t) {
        f4977b.set(this, interfaceC0908t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // Jd.K0
    public CancellationException I() {
        CancellationException cancellationException;
        Object l02 = l0();
        if (l02 instanceof c) {
            cancellationException = ((c) l02).f();
        } else if (l02 instanceof B) {
            cancellationException = ((B) l02).f4974a;
        } else {
            if (l02 instanceof InterfaceC0905r0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + l02).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new C0917x0("Parent job is " + I0(l02), cancellationException, this);
    }

    protected final CancellationException J0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = X();
            }
            cancellationException = new C0917x0(str, th, this);
        }
        return cancellationException;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object K(Object obj, Function2 function2) {
        return InterfaceC0915w0.a.b(this, obj, function2);
    }

    public final String L0() {
        return w0() + '{' + I0(l0()) + '}';
    }

    protected final Object P(kotlin.coroutines.d dVar) {
        Object l02;
        do {
            l02 = l0();
            if (!(l02 instanceof InterfaceC0905r0)) {
                if (l02 instanceof B) {
                    throw ((B) l02).f4974a;
                }
                return D0.h(l02);
            }
        } while (H0(l02) < 0);
        return R(dVar);
    }

    public final boolean S(Throwable th) {
        return T(th);
    }

    public final boolean T(Object obj) {
        Object obj2;
        Od.D d10;
        Od.D d11;
        Od.D d12;
        obj2 = D0.f4987a;
        if (h0() && (obj2 = V(obj)) == D0.f4988b) {
            return true;
        }
        d10 = D0.f4987a;
        if (obj2 == d10) {
            obj2 = t0(obj);
        }
        d11 = D0.f4987a;
        if (obj2 == d11 || obj2 == D0.f4988b) {
            return true;
        }
        d12 = D0.f4990d;
        if (obj2 == d12) {
            return false;
        }
        O(obj2);
        return true;
    }

    public void U(Throwable th) {
        T(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String X() {
        return "Job was cancelled";
    }

    public boolean Y(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return T(th) && g0();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element a(CoroutineContext.b bVar) {
        return InterfaceC0915w0.a.c(this, bVar);
    }

    @Override // Jd.InterfaceC0915w0
    public boolean b() {
        Object l02 = l0();
        return (l02 instanceof InterfaceC0905r0) && ((InterfaceC0905r0) l02).b();
    }

    @Override // Jd.InterfaceC0915w0
    public final boolean c() {
        return !(l0() instanceof InterfaceC0905r0);
    }

    @Override // Jd.InterfaceC0915w0
    public void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0917x0(X(), null, this);
        }
        U(cancellationException);
    }

    public final Object d0() {
        Object l02 = l0();
        if (l02 instanceof InterfaceC0905r0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (l02 instanceof B) {
            throw ((B) l02).f4974a;
        }
        return D0.h(l02);
    }

    public boolean g0() {
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.b getKey() {
        return InterfaceC0915w0.f5070O;
    }

    public boolean h0() {
        return false;
    }

    public final boolean isCancelled() {
        Object l02 = l0();
        return (l02 instanceof B) || ((l02 instanceof c) && ((c) l02).j());
    }

    @Override // Jd.InterfaceC0915w0
    public final InterfaceC0908t j(InterfaceC0912v interfaceC0912v) {
        C0910u c0910u = new C0910u(interfaceC0912v);
        c0910u.y(this);
        while (true) {
            Object l02 = l0();
            if (l02 instanceof C0880e0) {
                C0880e0 c0880e0 = (C0880e0) l02;
                if (!c0880e0.b()) {
                    D0(c0880e0);
                } else if (androidx.concurrent.futures.b.a(f4976a, this, l02, c0910u)) {
                    break;
                }
            } else {
                if (!(l02 instanceof InterfaceC0905r0)) {
                    Object l03 = l0();
                    B b10 = l03 instanceof B ? (B) l03 : null;
                    c0910u.x(b10 != null ? b10.f4974a : null);
                    return I0.f4998a;
                }
                H0 d10 = ((InterfaceC0905r0) l02).d();
                if (d10 == null) {
                    Intrinsics.e(l02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    E0((B0) l02);
                } else if (!d10.e(c0910u, 7)) {
                    boolean e10 = d10.e(c0910u, 3);
                    Object l04 = l0();
                    if (l04 instanceof c) {
                        r2 = ((c) l04).f();
                    } else {
                        B b11 = l04 instanceof B ? (B) l04 : null;
                        if (b11 != null) {
                            r2 = b11.f4974a;
                        }
                    }
                    c0910u.x(r2);
                    if (!e10) {
                        return I0.f4998a;
                    }
                }
            }
        }
        return c0910u;
    }

    public InterfaceC0915w0 j0() {
        InterfaceC0908t k02 = k0();
        if (k02 != null) {
            return k02.getParent();
        }
        return null;
    }

    public final InterfaceC0908t k0() {
        return (InterfaceC0908t) f4977b.get(this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext l(CoroutineContext coroutineContext) {
        return InterfaceC0915w0.a.e(this, coroutineContext);
    }

    public final Object l0() {
        return f4976a.get(this);
    }

    @Override // Jd.InterfaceC0915w0
    public final InterfaceC0876c0 n(boolean z10, boolean z11, Function1 function1) {
        return r0(z11, z10 ? new C0911u0(function1) : new C0913v0(function1));
    }

    protected boolean o0(Throwable th) {
        return false;
    }

    @Override // Jd.InterfaceC0915w0
    public final CancellationException p() {
        Object l02 = l0();
        if (!(l02 instanceof c)) {
            if (l02 instanceof InterfaceC0905r0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (l02 instanceof B) {
                return K0(this, ((B) l02).f4974a, null, 1, null);
            }
            return new C0917x0(S.a(this) + " has completed normally", null, this);
        }
        Throwable f10 = ((c) l02).f();
        if (f10 != null) {
            CancellationException J02 = J0(f10, S.a(this) + " is cancelling");
            if (J02 != null) {
                return J02;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    protected final void q0(InterfaceC0915w0 interfaceC0915w0) {
        if (interfaceC0915w0 == null) {
            G0(I0.f4998a);
            return;
        }
        interfaceC0915w0.start();
        InterfaceC0908t j10 = interfaceC0915w0.j(this);
        G0(j10);
        if (c()) {
            j10.a();
            G0(I0.f4998a);
        }
    }

    public final InterfaceC0876c0 r0(boolean z10, B0 b02) {
        boolean z11;
        boolean e10;
        b02.y(this);
        while (true) {
            Object l02 = l0();
            z11 = true;
            if (!(l02 instanceof C0880e0)) {
                if (!(l02 instanceof InterfaceC0905r0)) {
                    z11 = false;
                    break;
                }
                InterfaceC0905r0 interfaceC0905r0 = (InterfaceC0905r0) l02;
                H0 d10 = interfaceC0905r0.d();
                if (d10 == null) {
                    Intrinsics.e(l02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    E0((B0) l02);
                } else {
                    if (b02.w()) {
                        c cVar = interfaceC0905r0 instanceof c ? (c) interfaceC0905r0 : null;
                        Throwable f10 = cVar != null ? cVar.f() : null;
                        if (f10 != null) {
                            if (z10) {
                                b02.x(f10);
                            }
                            return I0.f4998a;
                        }
                        e10 = d10.e(b02, 5);
                    } else {
                        e10 = d10.e(b02, 1);
                    }
                    if (e10) {
                        break;
                    }
                }
            } else {
                C0880e0 c0880e0 = (C0880e0) l02;
                if (!c0880e0.b()) {
                    D0(c0880e0);
                } else if (androidx.concurrent.futures.b.a(f4976a, this, l02, b02)) {
                    break;
                }
            }
        }
        if (z11) {
            return b02;
        }
        if (z10) {
            Object l03 = l0();
            B b10 = l03 instanceof B ? (B) l03 : null;
            b02.x(b10 != null ? b10.f4974a : null);
        }
        return I0.f4998a;
    }

    protected boolean s0() {
        return false;
    }

    @Override // Jd.InterfaceC0915w0
    public final boolean start() {
        int H02;
        do {
            H02 = H0(l0());
            if (H02 == 0) {
                return false;
            }
        } while (H02 != 1);
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext t(CoroutineContext.b bVar) {
        return InterfaceC0915w0.a.d(this, bVar);
    }

    public String toString() {
        return L0() + '@' + S.b(this);
    }

    public final boolean u0(Object obj) {
        Object O02;
        Od.D d10;
        Od.D d11;
        do {
            O02 = O0(l0(), obj);
            d10 = D0.f4987a;
            if (O02 == d10) {
                return false;
            }
            if (O02 == D0.f4988b) {
                return true;
            }
            d11 = D0.f4989c;
        } while (O02 == d11);
        O(O02);
        return true;
    }

    public final Object v0(Object obj) {
        Object O02;
        Od.D d10;
        Od.D d11;
        do {
            O02 = O0(l0(), obj);
            d10 = D0.f4987a;
            if (O02 == d10) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, e0(obj));
            }
            d11 = D0.f4989c;
        } while (O02 == d11);
        return O02;
    }

    public String w0() {
        return S.a(this);
    }

    @Override // Jd.InterfaceC0912v
    public final void x(K0 k02) {
        T(k02);
    }

    @Override // Jd.InterfaceC0915w0
    public final InterfaceC0876c0 z(Function1 function1) {
        return r0(true, new C0913v0(function1));
    }

    protected void C0() {
    }

    protected void A0(Throwable th) {
    }

    protected void B0(Object obj) {
    }

    protected void O(Object obj) {
    }

    public void p0(Throwable th) {
        throw th;
    }
}
