package Jd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
final class R0 extends B0 {

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5008g = AtomicIntegerFieldUpdater.newUpdater(R0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    private final Thread f5009e = Thread.currentThread();

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC0876c0 f5010f;

    private final Void B(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void C(InterfaceC0915w0 interfaceC0915w0) {
        InterfaceC0876c0 i10;
        int i11;
        i10 = A0.i(interfaceC0915w0, false, this, 1, null);
        this.f5010f = i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5008g;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 == 2 || i11 == 3) {
                    return;
                }
                B(i11);
                throw new lc.e();
            }
        } while (!f5008g.compareAndSet(this, i11, 0));
    }

    @Override // Jd.B0
    public boolean w() {
        return true;
    }

    @Override // Jd.B0
    public void x(Throwable th) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5008g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                B(i10);
                throw new lc.e();
            }
        } while (!f5008g.compareAndSet(this, i10, 2));
        this.f5009e.interrupt();
        f5008g.set(this, 3);
    }

    public final void z() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5008g;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        B(i10);
                        throw new lc.e();
                    }
                }
            } else if (f5008g.compareAndSet(this, i10, 1)) {
                InterfaceC0876c0 interfaceC0876c0 = this.f5010f;
                if (interfaceC0876c0 != null) {
                    interfaceC0876c0.a();
                    return;
                }
                return;
            }
        }
    }
}
