package V;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class Y implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f10584a;

    /* renamed from: b, reason: collision with root package name */
    private final O f10585b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10586c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC1255s f10587d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10588e;

    /* renamed from: f, reason: collision with root package name */
    private final E.d f10589f;

    Y(O o10, long j10, AbstractC1255s abstractC1255s, boolean z10, boolean z11) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f10584a = atomicBoolean;
        E.d b10 = E.d.b();
        this.f10589f = b10;
        this.f10585b = o10;
        this.f10586c = j10;
        this.f10587d = abstractC1255s;
        this.f10588e = z10;
        if (z11) {
            atomicBoolean.set(true);
        } else {
            b10.c("stop");
        }
    }

    static Y a(C1257u c1257u, long j10) {
        y0.f.h(c1257u, "The given PendingRecording cannot be null.");
        return new Y(c1257u.e(), j10, c1257u.d(), c1257u.g(), true);
    }

    static Y b(C1257u c1257u, long j10) {
        y0.f.h(c1257u, "The given PendingRecording cannot be null.");
        return new Y(c1257u.e(), j10, c1257u.d(), c1257u.g(), false);
    }

    private void e(int i10, Throwable th) {
        this.f10589f.a();
        if (this.f10584a.getAndSet(true)) {
            return;
        }
        this.f10585b.G0(this, i10, th);
    }

    AbstractC1255s c() {
        return this.f10587d;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        e(0, null);
    }

    long d() {
        return this.f10586c;
    }

    protected void finalize() {
        try {
            this.f10589f.d();
            e(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
