package Od;

import Jd.J0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public abstract class A extends AbstractC1074b implements J0 {

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7299d = AtomicIntegerFieldUpdater.newUpdater(A.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f7300c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public A(long j10, A a10, int i10) {
        super(a10);
        this.f7300c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // Od.AbstractC1074b
    public boolean k() {
        return f7299d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f7299d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i10, Throwable th, CoroutineContext coroutineContext);

    public final void t() {
        if (f7299d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7299d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
