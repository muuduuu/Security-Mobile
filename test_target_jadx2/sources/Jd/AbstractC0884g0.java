package Jd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Jd.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0884g0 extends AbstractC0886h0 implements X {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5042f = AtomicReferenceFieldUpdater.newUpdater(AbstractC0884g0.class, Object.class, "_queue$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5043g = AtomicReferenceFieldUpdater.newUpdater(AbstractC0884g0.class, Object.class, "_delayed$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5044h = AtomicIntegerFieldUpdater.newUpdater(AbstractC0884g0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: Jd.g0$a */
    public static final class a extends Od.M {
    }

    private final void M1() {
    }

    private final boolean N1(Runnable runnable) {
        Od.D d10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5042f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (c()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f5042f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof Od.q) {
                Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                Od.q qVar = (Od.q) obj;
                int a10 = qVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    androidx.concurrent.futures.b.a(f5042f, this, obj, qVar.l());
                } else if (a10 == 2) {
                    return false;
                }
            } else {
                d10 = AbstractC0890j0.f5047b;
                if (obj == d10) {
                    return false;
                }
                Od.q qVar2 = new Od.q(8, true);
                Intrinsics.e(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar2.a((Runnable) obj);
                qVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f5042f, this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    private final boolean c() {
        return f5044h.get(this) != 0;
    }

    private final void g2() {
        AbstractC0875c.a();
        System.nanoTime();
    }

    private final void i2(boolean z10) {
        f5044h.set(this, z10 ? 1 : 0);
    }

    private final void y1() {
        Od.D d10;
        Od.D d11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5042f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5042f;
                d10 = AbstractC0890j0.f5047b;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, null, d10)) {
                    return;
                }
            } else {
                if (obj instanceof Od.q) {
                    ((Od.q) obj).d();
                    return;
                }
                d11 = AbstractC0890j0.f5047b;
                if (obj == d11) {
                    return;
                }
                Od.q qVar = new Od.q(8, true);
                Intrinsics.e(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f5042f, this, obj, qVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable z1() {
        Od.D d10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5042f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof Od.q) {
                Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                Od.q qVar = (Od.q) obj;
                Object m10 = qVar.m();
                if (m10 != Od.q.f7344h) {
                    return (Runnable) m10;
                }
                androidx.concurrent.futures.b.a(f5042f, this, obj, qVar.l());
            } else {
                d10 = AbstractC0890j0.f5047b;
                if (obj == d10) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f5042f, this, obj, null)) {
                    Intrinsics.e(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void A1(Runnable runnable) {
        M1();
        if (N1(runnable)) {
            x1();
        } else {
            T.f5012i.A1(runnable);
        }
    }

    @Override // Jd.AbstractC0882f0
    protected long Z0() {
        Od.D d10;
        if (super.Z0() == 0) {
            return 0L;
        }
        Object obj = f5042f.get(this);
        if (obj != null) {
            if (!(obj instanceof Od.q)) {
                d10 = AbstractC0890j0.f5047b;
                return obj == d10 ? Long.MAX_VALUE : 0L;
            }
            if (!((Od.q) obj).j()) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    protected boolean f2() {
        Od.D d10;
        if (!l1()) {
            return false;
        }
        Object obj = f5042f.get(this);
        if (obj != null) {
            if (obj instanceof Od.q) {
                return ((Od.q) obj).j();
            }
            d10 = AbstractC0890j0.f5047b;
            if (obj != d10) {
                return false;
            }
        }
        return true;
    }

    protected final void h2() {
        f5042f.set(this, null);
        f5043g.set(this, null);
    }

    @Override // Jd.AbstractC0882f0
    public long m1() {
        if (o1()) {
            return 0L;
        }
        M1();
        Runnable z12 = z1();
        if (z12 == null) {
            return Z0();
        }
        z12.run();
        return 0L;
    }

    @Override // Jd.J
    public final void s(CoroutineContext coroutineContext, Runnable runnable) {
        A1(runnable);
    }

    @Override // Jd.AbstractC0882f0
    public void shutdown() {
        Q0.f5006a.c();
        i2(true);
        y1();
        while (m1() <= 0) {
        }
        g2();
    }
}
