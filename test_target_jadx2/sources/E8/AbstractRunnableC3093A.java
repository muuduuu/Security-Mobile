package e8;

import D7.C0787k;

/* renamed from: e8.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC3093A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final C0787k f32254a;

    AbstractRunnableC3093A() {
        this.f32254a = null;
    }

    public void a(Exception exc) {
        C0787k c0787k = this.f32254a;
        if (c0787k != null) {
            c0787k.d(exc);
        }
    }

    protected abstract void b();

    final C0787k c() {
        return this.f32254a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public AbstractRunnableC3093A(C0787k c0787k) {
        this.f32254a = c0787k;
    }
}
