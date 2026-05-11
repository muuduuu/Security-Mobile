package Jd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* renamed from: Jd.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0911u0 extends B0 {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5067f = AtomicIntegerFieldUpdater.newUpdater(C0911u0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f5068e;

    public C0911u0(Function1 function1) {
        this.f5068e = function1;
    }

    @Override // Jd.B0
    public boolean w() {
        return true;
    }

    @Override // Jd.B0
    public void x(Throwable th) {
        if (f5067f.compareAndSet(this, 0, 1)) {
            this.f5068e.invoke(th);
        }
    }
}
