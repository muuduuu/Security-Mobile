package c0;

import android.media.MediaCodec;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class j0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f19246a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19247b;

    /* renamed from: c, reason: collision with root package name */
    private final ByteBuffer f19248c;

    /* renamed from: d, reason: collision with root package name */
    private final h8.d f19249d;

    /* renamed from: e, reason: collision with root package name */
    private final c.a f19250e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f19251f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private long f19252g = 0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19253h = false;

    j0(MediaCodec mediaCodec, int i10) {
        this.f19246a = (MediaCodec) y0.f.g(mediaCodec);
        this.f19247b = y0.f.d(i10);
        this.f19248c = mediaCodec.getInputBuffer(i10);
        final AtomicReference atomicReference = new AtomicReference();
        this.f19249d = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: c0.i0
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object f10;
                f10 = j0.f(atomicReference, aVar);
                return f10;
            }
        });
        this.f19250e = (c.a) y0.f.g((c.a) atomicReference.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object f(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "Terminate InputBuffer";
    }

    private void g() {
        if (this.f19251f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override // c0.h0
    public h8.d a() {
        return G.n.B(this.f19249d);
    }

    @Override // c0.h0
    public void b(boolean z10) {
        g();
        this.f19253h = z10;
    }

    @Override // c0.h0
    public boolean c() {
        if (this.f19251f.getAndSet(true)) {
            return false;
        }
        try {
            this.f19246a.queueInputBuffer(this.f19247b, this.f19248c.position(), this.f19248c.limit(), this.f19252g, this.f19253h ? 4 : 0);
            this.f19250e.c(null);
            return true;
        } catch (IllegalStateException e10) {
            this.f19250e.f(e10);
            return false;
        }
    }

    @Override // c0.h0
    public boolean cancel() {
        if (this.f19251f.getAndSet(true)) {
            return false;
        }
        try {
            this.f19246a.queueInputBuffer(this.f19247b, 0, 0, 0L, 0);
            this.f19250e.c(null);
        } catch (IllegalStateException e10) {
            this.f19250e.f(e10);
        }
        return true;
    }

    @Override // c0.h0
    public void d(long j10) {
        g();
        y0.f.a(j10 >= 0);
        this.f19252g = j10;
    }

    @Override // c0.h0
    public ByteBuffer h() {
        g();
        return this.f19248c;
    }
}
