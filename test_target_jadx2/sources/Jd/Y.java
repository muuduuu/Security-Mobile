package Jd;

import Od.AbstractC1081i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public final class Y extends Od.z {

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5020e = AtomicIntegerFieldUpdater.newUpdater(Y.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public Y(CoroutineContext coroutineContext, kotlin.coroutines.d dVar) {
        super(coroutineContext, dVar);
    }

    private final boolean X0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5020e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f5020e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean Y0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5020e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f5020e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // Od.z, Jd.C0
    protected void O(Object obj) {
        R0(obj);
    }

    @Override // Od.z, Jd.AbstractC0871a
    protected void R0(Object obj) {
        if (X0()) {
            return;
        }
        AbstractC1081i.b(AbstractC3868b.c(this.f7356d), D.a(obj, this.f7356d));
    }

    public final Object V0() {
        if (Y0()) {
            return AbstractC3868b.e();
        }
        Object h10 = D0.h(l0());
        if (h10 instanceof B) {
            throw ((B) h10).f4974a;
        }
        return h10;
    }
}
