package Jd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class r extends B {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5060c = AtomicIntegerFieldUpdater.newUpdater(r.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(kotlin.coroutines.d dVar, Throwable th, boolean z10) {
        super(th, z10);
        if (th == null) {
            th = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }

    public final boolean e() {
        return f5060c.compareAndSet(this, 0, 1);
    }
}
