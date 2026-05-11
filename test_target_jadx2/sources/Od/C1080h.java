package Od;

import Jd.AbstractC0882f0;
import Jd.C0899o;
import Jd.InterfaceC0895m;
import Jd.Q0;
import Jd.S;
import Jd.Z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Od.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1080h extends Z implements kotlin.coroutines.jvm.internal.e, kotlin.coroutines.d {

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7320h = AtomicReferenceFieldUpdater.newUpdater(C1080h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final Jd.J f7321d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.coroutines.d f7322e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7323f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7324g;

    public C1080h(Jd.J j10, kotlin.coroutines.d dVar) {
        super(-1);
        D d10;
        this.f7321d = j10;
        this.f7322e = dVar;
        d10 = AbstractC1081i.f7325a;
        this.f7323f = d10;
        this.f7324g = K.g(getContext());
    }

    private final C0899o n() {
        Object obj = f7320h.get(this);
        if (obj instanceof C0899o) {
            return (C0899o) obj;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d dVar = this.f7322e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    public CoroutineContext getContext() {
        return this.f7322e.getContext();
    }

    @Override // Jd.Z
    public Object j() {
        D d10;
        Object obj = this.f7323f;
        d10 = AbstractC1081i.f7325a;
        this.f7323f = d10;
        return obj;
    }

    public final void k() {
        while (f7320h.get(this) == AbstractC1081i.f7326b) {
        }
    }

    public final C0899o l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7320h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f7320h.set(this, AbstractC1081i.f7326b);
                return null;
            }
            if (obj instanceof C0899o) {
                if (androidx.concurrent.futures.b.a(f7320h, this, obj, AbstractC1081i.f7326b)) {
                    return (C0899o) obj;
                }
            } else if (obj != AbstractC1081i.f7326b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void m(CoroutineContext coroutineContext, Object obj) {
        this.f7323f = obj;
        this.f5021c = 1;
        this.f7321d.u(coroutineContext, this);
    }

    public final boolean q() {
        return f7320h.get(this) != null;
    }

    public final boolean r(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7320h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            D d10 = AbstractC1081i.f7326b;
            if (Intrinsics.b(obj, d10)) {
                if (androidx.concurrent.futures.b.a(f7320h, this, d10, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f7320h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
        Object b10 = Jd.D.b(obj);
        if (this.f7321d.y(getContext())) {
            this.f7323f = b10;
            this.f5021c = 0;
            this.f7321d.s(getContext(), this);
            return;
        }
        AbstractC0882f0 b11 = Q0.f5006a.b();
        if (b11.i1()) {
            this.f7323f = b10;
            this.f5021c = 0;
            b11.O0(this);
            return;
        }
        b11.a1(true);
        try {
            CoroutineContext context = getContext();
            Object i10 = K.i(context, this.f7324g);
            try {
                this.f7322e.resumeWith(obj);
                Unit unit = Unit.f36324a;
                while (b11.o1()) {
                }
            } finally {
                K.f(context, i10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void t() {
        k();
        C0899o n10 = n();
        if (n10 != null) {
            n10.r();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f7321d + ", " + S.c(this.f7322e) + ']';
    }

    public final Throwable v(InterfaceC0895m interfaceC0895m) {
        D d10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7320h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            d10 = AbstractC1081i.f7326b;
            if (obj != d10) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f7320h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f7320h, this, d10, interfaceC0895m));
        return null;
    }

    @Override // Jd.Z
    public kotlin.coroutines.d e() {
        return this;
    }
}
