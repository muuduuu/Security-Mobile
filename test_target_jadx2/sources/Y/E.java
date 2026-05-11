package Y;

import A.AbstractC0700h0;
import Y.p;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class E implements p {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f11900a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f11901b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private final int f11902c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11903d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f11904e;

    /* renamed from: f, reason: collision with root package name */
    private long f11905f;

    /* renamed from: g, reason: collision with root package name */
    private p.a f11906g;

    /* renamed from: h, reason: collision with root package name */
    private Executor f11907h;

    public E(AbstractC1305a abstractC1305a) {
        this.f11902c = abstractC1305a.d();
        this.f11903d = abstractC1305a.f();
    }

    private static void d(long j10) {
        long g10 = j10 - g();
        if (g10 > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(g10));
            } catch (InterruptedException e10) {
                AbstractC0700h0.m("SilentAudioStream", "Ignore interruption", e10);
            }
        }
    }

    private void e() {
        y0.f.j(!this.f11901b.get(), "AudioStream has been released.");
    }

    private void f() {
        y0.f.j(this.f11900a.get(), "AudioStream has not been started.");
    }

    private static long g() {
        return System.nanoTime();
    }

    private void i() {
        final p.a aVar = this.f11906g;
        Executor executor = this.f11907h;
        if (aVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: Y.D
            @Override // java.lang.Runnable
            public final void run() {
                p.a.this.a(true);
            }
        });
    }

    private void j(ByteBuffer byteBuffer, int i10) {
        y0.f.i(i10 <= byteBuffer.remaining());
        byte[] bArr = this.f11904e;
        if (bArr == null || bArr.length < i10) {
            this.f11904e = new byte[i10];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.f11904e, 0, i10).limit(i10 + position).position(position);
    }

    @Override // Y.p
    public void a() {
        this.f11901b.getAndSet(true);
    }

    @Override // Y.p
    public void b(p.a aVar, Executor executor) {
        boolean z10 = true;
        y0.f.j(!this.f11900a.get(), "AudioStream can not be started when setCallback.");
        e();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        y0.f.b(z10, "executor can't be null with non-null callback.");
        this.f11906g = aVar;
        this.f11907h = executor;
    }

    @Override // Y.p
    public p.c read(ByteBuffer byteBuffer) {
        e();
        f();
        long g10 = t.g(byteBuffer.remaining(), this.f11902c);
        int e10 = (int) t.e(g10, this.f11902c);
        if (e10 <= 0) {
            return p.c.c(0, this.f11905f);
        }
        long d10 = this.f11905f + t.d(g10, this.f11903d);
        d(d10);
        j(byteBuffer, e10);
        p.c c10 = p.c.c(e10, this.f11905f);
        this.f11905f = d10;
        return c10;
    }

    @Override // Y.p
    public void start() {
        e();
        if (this.f11900a.getAndSet(true)) {
            return;
        }
        this.f11905f = g();
        i();
    }

    @Override // Y.p
    public void stop() {
        e();
        this.f11900a.set(false);
    }
}
