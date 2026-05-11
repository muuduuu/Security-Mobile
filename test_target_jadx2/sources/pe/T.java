package pe;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class T implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3879g f38614a;

    /* renamed from: b, reason: collision with root package name */
    private final C3877e f38615b;

    /* renamed from: c, reason: collision with root package name */
    private W f38616c;

    /* renamed from: d, reason: collision with root package name */
    private int f38617d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f38618e;

    /* renamed from: f, reason: collision with root package name */
    private long f38619f;

    public T(InterfaceC3879g upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f38614a = upstream;
        C3877e m10 = upstream.m();
        this.f38615b = m10;
        W w10 = m10.f38666a;
        this.f38616c = w10;
        this.f38617d = w10 != null ? w10.f38630b : -1;
    }

    @Override // pe.b0
    public c0 A() {
        return this.f38614a.A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r4.f38630b) goto L15;
     */
    @Override // pe.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long b2(C3877e sink, long j10) {
        W w10;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f38618e) {
            throw new IllegalStateException("closed");
        }
        W w11 = this.f38616c;
        if (w11 != null) {
            W w12 = this.f38615b.f38666a;
            if (w11 == w12) {
                int i10 = this.f38617d;
                Intrinsics.d(w12);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f38614a.n1(this.f38619f + 1)) {
            return -1L;
        }
        if (this.f38616c == null && (w10 = this.f38615b.f38666a) != null) {
            this.f38616c = w10;
            Intrinsics.d(w10);
            this.f38617d = w10.f38630b;
        }
        long min = Math.min(j10, this.f38615b.size() - this.f38619f);
        this.f38615b.l(sink, this.f38619f, min);
        this.f38619f += min;
        return min;
    }

    @Override // pe.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f38618e = true;
    }
}
