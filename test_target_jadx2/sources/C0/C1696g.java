package c0;

import android.media.MediaCodec;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1696g implements InterfaceC1698i {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f19237a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodec.BufferInfo f19238b;

    /* renamed from: c, reason: collision with root package name */
    private final h8.d f19239c;

    /* renamed from: d, reason: collision with root package name */
    private final c.a f19240d;

    public C1696g(InterfaceC1698i interfaceC1698i) {
        this.f19238b = c(interfaceC1698i);
        this.f19237a = b(interfaceC1698i);
        final AtomicReference atomicReference = new AtomicReference();
        this.f19239c = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: c0.f
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object d10;
                d10 = C1696g.d(atomicReference, aVar);
                return d10;
            }
        });
        this.f19240d = (c.a) y0.f.g((c.a) atomicReference.get());
    }

    private ByteBuffer b(InterfaceC1698i interfaceC1698i) {
        ByteBuffer h10 = interfaceC1698i.h();
        MediaCodec.BufferInfo E02 = interfaceC1698i.E0();
        h10.position(E02.offset);
        h10.limit(E02.offset + E02.size);
        ByteBuffer allocate = ByteBuffer.allocate(E02.size);
        allocate.order(h10.order());
        allocate.put(h10);
        allocate.flip();
        return allocate;
    }

    private MediaCodec.BufferInfo c(InterfaceC1698i interfaceC1698i) {
        MediaCodec.BufferInfo E02 = interfaceC1698i.E0();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, E02.size, E02.presentationTimeUs, E02.flags);
        return bufferInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    @Override // c0.InterfaceC1698i
    public long C1() {
        return this.f19238b.presentationTimeUs;
    }

    @Override // c0.InterfaceC1698i
    public MediaCodec.BufferInfo E0() {
        return this.f19238b;
    }

    @Override // c0.InterfaceC1698i
    public boolean M0() {
        return (this.f19238b.flags & 1) != 0;
    }

    @Override // c0.InterfaceC1698i, java.lang.AutoCloseable
    public void close() {
        this.f19240d.c(null);
    }

    @Override // c0.InterfaceC1698i
    public ByteBuffer h() {
        return this.f19237a;
    }

    @Override // c0.InterfaceC1698i
    public long size() {
        return this.f19238b.size;
    }
}
