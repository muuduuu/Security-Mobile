package Y;

import A.AbstractC0700h0;
import Y.p;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class C implements p {

    /* renamed from: g, reason: collision with root package name */
    private final p f11889g;

    /* renamed from: h, reason: collision with root package name */
    private final int f11890h;

    /* renamed from: i, reason: collision with root package name */
    private final int f11891i;

    /* renamed from: j, reason: collision with root package name */
    private final int f11892j;

    /* renamed from: l, reason: collision with root package name */
    private int f11894l;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f11883a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f11884b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private final Queue f11885c = new ConcurrentLinkedQueue();

    /* renamed from: d, reason: collision with root package name */
    private final Executor f11886d = F.c.g(F.c.a());

    /* renamed from: e, reason: collision with root package name */
    private final Object f11887e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private a f11888f = null;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f11893k = new AtomicBoolean(false);

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f11895a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11896b;

        /* renamed from: c, reason: collision with root package name */
        private final ByteBuffer f11897c;

        /* renamed from: d, reason: collision with root package name */
        private long f11898d;

        a(ByteBuffer byteBuffer, p.c cVar, int i10, int i11) {
            byteBuffer.rewind();
            int limit = byteBuffer.limit() - byteBuffer.position();
            if (limit == cVar.a()) {
                this.f11895a = i10;
                this.f11896b = i11;
                this.f11897c = byteBuffer;
                this.f11898d = cVar.b();
                return;
            }
            throw new IllegalStateException("Byte buffer size is not match with packet info: " + limit + " != " + cVar.a());
        }

        public int a() {
            return this.f11897c.remaining();
        }

        public p.c b(ByteBuffer byteBuffer) {
            int remaining;
            long j10 = this.f11898d;
            int position = this.f11897c.position();
            int position2 = byteBuffer.position();
            if (this.f11897c.remaining() > byteBuffer.remaining()) {
                remaining = byteBuffer.remaining();
                this.f11898d += t.d(t.g(remaining, this.f11895a), this.f11896b);
                ByteBuffer duplicate = this.f11897c.duplicate();
                duplicate.position(position).limit(position + remaining);
                byteBuffer.put(duplicate).limit(position2 + remaining).position(position2);
            } else {
                remaining = this.f11897c.remaining();
                byteBuffer.put(this.f11897c).limit(position2 + remaining).position(position2);
            }
            this.f11897c.position(position + remaining);
            return p.c.c(remaining, j10);
        }
    }

    public C(p pVar, AbstractC1305a abstractC1305a) {
        this.f11889g = pVar;
        int d10 = abstractC1305a.d();
        this.f11890h = d10;
        int f10 = abstractC1305a.f();
        this.f11891i = f10;
        y0.f.b(((long) d10) > 0, "mBytesPerFrame must be greater than 0.");
        y0.f.b(((long) f10) > 0, "mSampleRate must be greater than 0.");
        this.f11892j = 500;
        this.f11894l = d10 * 1024;
    }

    private void i() {
        y0.f.j(!this.f11884b.get(), "AudioStream has been released.");
    }

    private void j() {
        y0.f.j(this.f11883a.get(), "AudioStream has not been started.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f11893k.get()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f11894l);
            a aVar = new a(allocateDirect, this.f11889g.read(allocateDirect), this.f11890h, this.f11891i);
            int i10 = this.f11892j;
            synchronized (this.f11887e) {
                try {
                    this.f11885c.offer(aVar);
                    while (this.f11885c.size() > i10) {
                        this.f11885c.poll();
                        AbstractC0700h0.l("BufferedAudioStream", "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f11893k.get()) {
                this.f11886d.execute(new Runnable() { // from class: Y.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        C.this.k();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f11893k.set(false);
        this.f11889g.a();
        synchronized (this.f11887e) {
            this.f11888f = null;
            this.f11885c.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(p.a aVar, Executor executor) {
        this.f11889g.b(aVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        try {
            this.f11889g.start();
            q();
        } catch (p.b e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f11893k.set(false);
        this.f11889g.stop();
        synchronized (this.f11887e) {
            this.f11888f = null;
            this.f11885c.clear();
        }
    }

    private void q() {
        if (this.f11893k.getAndSet(true)) {
            return;
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void p(int i10) {
        int i11 = this.f11894l;
        if (i11 == i10) {
            return;
        }
        int i12 = this.f11890h;
        this.f11894l = (i10 / i12) * i12;
        AbstractC0700h0.a("BufferedAudioStream", "Update buffer size from " + i11 + " to " + this.f11894l);
    }

    private void s(final int i10) {
        this.f11886d.execute(new Runnable() { // from class: Y.z
            @Override // java.lang.Runnable
            public final void run() {
                C.this.p(i10);
            }
        });
    }

    @Override // Y.p
    public void a() {
        if (this.f11884b.getAndSet(true)) {
            return;
        }
        this.f11886d.execute(new Runnable() { // from class: Y.B
            @Override // java.lang.Runnable
            public final void run() {
                C.this.l();
            }
        });
    }

    @Override // Y.p
    public void b(final p.a aVar, final Executor executor) {
        boolean z10 = true;
        y0.f.j(!this.f11883a.get(), "AudioStream can not be started when setCallback.");
        i();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        y0.f.b(z10, "executor can't be null with non-null callback.");
        this.f11886d.execute(new Runnable() { // from class: Y.x
            @Override // java.lang.Runnable
            public final void run() {
                C.this.m(aVar, executor);
            }
        });
    }

    @Override // Y.p
    public p.c read(ByteBuffer byteBuffer) {
        boolean z10;
        i();
        j();
        s(byteBuffer.remaining());
        p.c c10 = p.c.c(0, 0L);
        do {
            synchronized (this.f11887e) {
                try {
                    a aVar = this.f11888f;
                    this.f11888f = null;
                    if (aVar == null) {
                        aVar = (a) this.f11885c.poll();
                    }
                    if (aVar != null) {
                        c10 = aVar.b(byteBuffer);
                        if (aVar.a() > 0) {
                            this.f11888f = aVar;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z10 = c10.a() <= 0 && this.f11883a.get() && !this.f11884b.get();
            if (z10) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e10) {
                    AbstractC0700h0.m("BufferedAudioStream", "Interruption while waiting for audio data", e10);
                }
            }
        } while (z10);
        return c10;
    }

    @Override // Y.p
    public void start() {
        i();
        if (this.f11883a.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: Y.y
            @Override // java.lang.Runnable
            public final void run() {
                C.this.n();
            }
        }, null);
        this.f11886d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f11883a.set(false);
            throw new p.b(e10);
        }
    }

    @Override // Y.p
    public void stop() {
        i();
        if (this.f11883a.getAndSet(false)) {
            this.f11886d.execute(new Runnable() { // from class: Y.w
                @Override // java.lang.Runnable
                public final void run() {
                    C.this.o();
                }
            });
        }
    }
}
