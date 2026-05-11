package c0;

import android.media.MediaCodec;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1700k implements InterfaceC1698i {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f19254a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodec.BufferInfo f19255b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19256c;

    /* renamed from: d, reason: collision with root package name */
    private final ByteBuffer f19257d;

    /* renamed from: e, reason: collision with root package name */
    private final h8.d f19258e;

    /* renamed from: f, reason: collision with root package name */
    private final c.a f19259f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f19260g = new AtomicBoolean(false);

    C1700k(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        this.f19254a = (MediaCodec) y0.f.g(mediaCodec);
        this.f19256c = i10;
        this.f19257d = mediaCodec.getOutputBuffer(i10);
        this.f19255b = (MediaCodec.BufferInfo) y0.f.g(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.f19258e = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: c0.j
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object c10;
                c10 = C1700k.c(atomicReference, aVar);
                return c10;
            }
        });
        this.f19259f = (c.a) y0.f.g((c.a) atomicReference.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    private void d() {
        if (this.f19260g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
    }

    @Override // c0.InterfaceC1698i
    public long C1() {
        return this.f19255b.presentationTimeUs;
    }

    @Override // c0.InterfaceC1698i
    public MediaCodec.BufferInfo E0() {
        return this.f19255b;
    }

    @Override // c0.InterfaceC1698i
    public boolean M0() {
        return (this.f19255b.flags & 1) != 0;
    }

    public h8.d b() {
        return G.n.B(this.f19258e);
    }

    @Override // c0.InterfaceC1698i, java.lang.AutoCloseable
    public void close() {
        if (this.f19260g.getAndSet(true)) {
            return;
        }
        try {
            this.f19254a.releaseOutputBuffer(this.f19256c, false);
            this.f19259f.c(null);
        } catch (IllegalStateException e10) {
            this.f19259f.f(e10);
        }
    }

    @Override // c0.InterfaceC1698i
    public ByteBuffer h() {
        d();
        this.f19257d.position(this.f19255b.offset);
        ByteBuffer byteBuffer = this.f19257d;
        MediaCodec.BufferInfo bufferInfo = this.f19255b;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f19257d;
    }

    @Override // c0.InterfaceC1698i
    public long size() {
        return this.f19255b.size;
    }
}
