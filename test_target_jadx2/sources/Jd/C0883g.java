package Jd;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Jd.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0883g extends AbstractC0871a {

    /* renamed from: d, reason: collision with root package name */
    private final Thread f5040d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC0882f0 f5041e;

    public C0883g(CoroutineContext coroutineContext, Thread thread, AbstractC0882f0 abstractC0882f0) {
        super(coroutineContext, true, true);
        this.f5040d = thread;
        this.f5041e = abstractC0882f0;
    }

    @Override // Jd.C0
    protected void O(Object obj) {
        if (Intrinsics.b(Thread.currentThread(), this.f5040d)) {
            return;
        }
        Thread thread = this.f5040d;
        AbstractC0875c.a();
        LockSupport.unpark(thread);
    }

    public final Object V0() {
        AbstractC0875c.a();
        try {
            AbstractC0882f0 abstractC0882f0 = this.f5041e;
            if (abstractC0882f0 != null) {
                AbstractC0882f0.g1(abstractC0882f0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC0882f0 abstractC0882f02 = this.f5041e;
                    long m12 = abstractC0882f02 != null ? abstractC0882f02.m1() : Long.MAX_VALUE;
                    if (c()) {
                        AbstractC0882f0 abstractC0882f03 = this.f5041e;
                        if (abstractC0882f03 != null) {
                            AbstractC0882f0.z0(abstractC0882f03, false, 1, null);
                        }
                        AbstractC0875c.a();
                        Object h10 = D0.h(l0());
                        B b10 = h10 instanceof B ? (B) h10 : null;
                        if (b10 == null) {
                            return h10;
                        }
                        throw b10.f4974a;
                    }
                    AbstractC0875c.a();
                    LockSupport.parkNanos(this, m12);
                } catch (Throwable th) {
                    AbstractC0882f0 abstractC0882f04 = this.f5041e;
                    if (abstractC0882f04 != null) {
                        AbstractC0882f0.z0(abstractC0882f04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            S(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC0875c.a();
            throw th2;
        }
    }

    @Override // Jd.C0
    protected boolean s0() {
        return true;
    }
}
