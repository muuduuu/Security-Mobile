package le;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;
import pe.C3880h;
import pe.InterfaceC3878f;

/* loaded from: classes3.dex */
public final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37237a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3878f f37238b;

    /* renamed from: c, reason: collision with root package name */
    private final Random f37239c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37240d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f37241e;

    /* renamed from: f, reason: collision with root package name */
    private final long f37242f;

    /* renamed from: g, reason: collision with root package name */
    private final C3877e f37243g;

    /* renamed from: h, reason: collision with root package name */
    private final C3877e f37244h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f37245i;

    /* renamed from: j, reason: collision with root package name */
    private a f37246j;

    /* renamed from: k, reason: collision with root package name */
    private final byte[] f37247k;

    /* renamed from: l, reason: collision with root package name */
    private final C3877e.a f37248l;

    public h(boolean z10, InterfaceC3878f sink, Random random, boolean z11, boolean z12, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f37237a = z10;
        this.f37238b = sink;
        this.f37239c = random;
        this.f37240d = z11;
        this.f37241e = z12;
        this.f37242f = j10;
        this.f37243g = new C3877e();
        this.f37244h = sink.m();
        this.f37247k = z10 ? new byte[4] : null;
        this.f37248l = z10 ? new C3877e.a() : null;
    }

    private final void b(int i10, C3880h c3880h) {
        if (this.f37245i) {
            throw new IOException("closed");
        }
        int L10 = c3880h.L();
        if (L10 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f37244h.q0(i10 | 128);
        if (this.f37237a) {
            this.f37244h.q0(L10 | 128);
            Random random = this.f37239c;
            byte[] bArr = this.f37247k;
            Intrinsics.d(bArr);
            random.nextBytes(bArr);
            this.f37244h.G1(this.f37247k);
            if (L10 > 0) {
                long size = this.f37244h.size();
                this.f37244h.Q1(c3880h);
                C3877e c3877e = this.f37244h;
                C3877e.a aVar = this.f37248l;
                Intrinsics.d(aVar);
                c3877e.C(aVar);
                this.f37248l.d(size);
                f.f37220a.b(this.f37248l, this.f37247k);
                this.f37248l.close();
            }
        } else {
            this.f37244h.q0(L10);
            this.f37244h.Q1(c3880h);
        }
        this.f37238b.flush();
    }

    public final void a(int i10, C3880h c3880h) {
        C3880h c3880h2 = C3880h.f38684e;
        if (i10 != 0 || c3880h != null) {
            if (i10 != 0) {
                f.f37220a.c(i10);
            }
            C3877e c3877e = new C3877e();
            c3877e.f0(i10);
            if (c3880h != null) {
                c3877e.Q1(c3880h);
            }
            c3880h2 = c3877e.K();
        }
        try {
            b(8, c3880h2);
        } finally {
            this.f37245i = true;
        }
    }

    public final void c(int i10, C3880h data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f37245i) {
            throw new IOException("closed");
        }
        this.f37243g.Q1(data);
        int i11 = i10 | 128;
        if (this.f37240d && data.L() >= this.f37242f) {
            a aVar = this.f37246j;
            if (aVar == null) {
                aVar = new a(this.f37241e);
                this.f37246j = aVar;
            }
            aVar.a(this.f37243g);
            i11 = i10 | 192;
        }
        long size = this.f37243g.size();
        this.f37244h.q0(i11);
        int i12 = this.f37237a ? 128 : 0;
        if (size <= 125) {
            this.f37244h.q0(i12 | ((int) size));
        } else if (size <= 65535) {
            this.f37244h.q0(i12 | 126);
            this.f37244h.f0((int) size);
        } else {
            this.f37244h.q0(i12 | 127);
            this.f37244h.O1(size);
        }
        if (this.f37237a) {
            Random random = this.f37239c;
            byte[] bArr = this.f37247k;
            Intrinsics.d(bArr);
            random.nextBytes(bArr);
            this.f37244h.G1(this.f37247k);
            if (size > 0) {
                C3877e c3877e = this.f37243g;
                C3877e.a aVar2 = this.f37248l;
                Intrinsics.d(aVar2);
                c3877e.C(aVar2);
                this.f37248l.d(0L);
                f.f37220a.b(this.f37248l, this.f37247k);
                this.f37248l.close();
            }
        }
        this.f37244h.N0(this.f37243g, size);
        this.f37238b.e0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a aVar = this.f37246j;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void d(C3880h payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        b(9, payload);
    }

    public final void e(C3880h payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        b(10, payload);
    }
}
