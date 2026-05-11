package Y;

import A.AbstractC0700h0;
import X.c;
import Y.n;
import Y.p;
import android.content.Context;
import androidx.camera.core.impl.E0;
import androidx.concurrent.futures.c;
import c0.h0;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    final Executor f11930a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference f11931b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f11932c;

    /* renamed from: d, reason: collision with root package name */
    final p f11933d;

    /* renamed from: e, reason: collision with root package name */
    final E f11934e;

    /* renamed from: f, reason: collision with root package name */
    private final long f11935f;

    /* renamed from: g, reason: collision with root package name */
    e f11936g;

    /* renamed from: h, reason: collision with root package name */
    c.a f11937h;

    /* renamed from: i, reason: collision with root package name */
    boolean f11938i;

    /* renamed from: j, reason: collision with root package name */
    Executor f11939j;

    /* renamed from: k, reason: collision with root package name */
    c f11940k;

    /* renamed from: l, reason: collision with root package name */
    X.c f11941l;

    /* renamed from: m, reason: collision with root package name */
    private G.c f11942m;

    /* renamed from: n, reason: collision with root package name */
    private E0.a f11943n;

    /* renamed from: o, reason: collision with root package name */
    boolean f11944o;

    /* renamed from: p, reason: collision with root package name */
    private long f11945p;

    /* renamed from: q, reason: collision with root package name */
    boolean f11946q;

    /* renamed from: r, reason: collision with root package name */
    boolean f11947r;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f11948s;

    /* renamed from: t, reason: collision with root package name */
    double f11949t;

    /* renamed from: u, reason: collision with root package name */
    long f11950u;

    /* renamed from: v, reason: collision with root package name */
    private final int f11951v;

    /* renamed from: w, reason: collision with root package name */
    public final int f11952w;

    class a implements E0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X.c f11953a;

        a(X.c cVar) {
            this.f11953a = cVar;
        }

        @Override // androidx.camera.core.impl.E0.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(c.a aVar) {
            Objects.requireNonNull(aVar);
            if (n.this.f11941l == this.f11953a) {
                AbstractC0700h0.a("AudioSource", "Receive BufferProvider state change: " + n.this.f11937h + " to " + aVar);
                n nVar = n.this;
                if (nVar.f11937h != aVar) {
                    nVar.f11937h = aVar;
                    nVar.S();
                }
            }
        }

        @Override // androidx.camera.core.impl.E0.a
        public void onError(Throwable th) {
            n nVar = n.this;
            if (nVar.f11941l == this.f11953a) {
                nVar.C(th);
            }
        }
    }

    class b implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X.c f11955a;

        b(X.c cVar) {
            this.f11955a = cVar;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(h0 h0Var) {
            n nVar = n.this;
            if (!nVar.f11938i || nVar.f11941l != this.f11955a) {
                h0Var.cancel();
                return;
            }
            if (nVar.f11944o && nVar.p()) {
                n.this.J();
            }
            p m10 = n.this.m();
            ByteBuffer h10 = h0Var.h();
            p.c read = m10.read(h10);
            if (read.a() > 0) {
                n nVar2 = n.this;
                if (nVar2.f11947r) {
                    nVar2.F(h10, read.a());
                }
                if (n.this.f11939j != null) {
                    long b10 = read.b();
                    n nVar3 = n.this;
                    if (b10 - nVar3.f11950u >= 200) {
                        nVar3.f11950u = read.b();
                        n.this.G(h10);
                    }
                }
                h10.limit(h10.position() + read.a());
                h0Var.d(TimeUnit.NANOSECONDS.toMicros(read.b()));
                h0Var.c();
            } else {
                AbstractC0700h0.l("AudioSource", "Unable to read data from AudioStream.");
                h0Var.cancel();
            }
            n.this.K();
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            if (n.this.f11941l != this.f11955a) {
                return;
            }
            AbstractC0700h0.a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
            if (th instanceof IllegalStateException) {
                return;
            }
            n.this.C(th);
        }
    }

    class d implements p.a {
        d() {
        }

        @Override // Y.p.a
        public void a(boolean z10) {
            n nVar = n.this;
            nVar.f11946q = z10;
            if (nVar.f11936g == e.STARTED) {
                nVar.D();
            }
        }
    }

    enum e {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    public n(AbstractC1305a abstractC1305a, Executor executor, Context context) {
        this(abstractC1305a, executor, context, new q() { // from class: Y.h
            @Override // Y.q
            public final p a(AbstractC1305a abstractC1305a2, Context context2) {
                return new s(abstractC1305a2, context2);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        int ordinal = this.f11936g.ordinal();
        if (ordinal == 1) {
            N(e.CONFIGURED);
            S();
        } else {
            if (ordinal != 2) {
                return;
            }
            AbstractC0700h0.l("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
        }
    }

    private void I(X.c cVar) {
        X.c cVar2 = this.f11941l;
        if (cVar2 != null) {
            E0.a aVar = this.f11943n;
            Objects.requireNonNull(aVar);
            cVar2.a(aVar);
            this.f11941l = null;
            this.f11943n = null;
            this.f11942m = null;
            this.f11937h = c.a.INACTIVE;
            S();
        }
        if (cVar != null) {
            this.f11941l = cVar;
            this.f11943n = new a(cVar);
            this.f11942m = new b(cVar);
            c.a l10 = l(cVar);
            if (l10 != null) {
                this.f11937h = l10;
                S();
            }
            this.f11941l.e(this.f11930a, this.f11943n);
        }
    }

    private void P() {
        if (this.f11938i) {
            return;
        }
        try {
            AbstractC0700h0.a("AudioSource", "startSendingAudio");
            this.f11933d.start();
            this.f11944o = false;
        } catch (p.b e10) {
            AbstractC0700h0.m("AudioSource", "Failed to start AudioStream", e10);
            this.f11944o = true;
            this.f11934e.start();
            this.f11945p = n();
            D();
        }
        this.f11938i = true;
        K();
    }

    private void R() {
        if (this.f11938i) {
            this.f11938i = false;
            AbstractC0700h0.a("AudioSource", "stopSendingAudio");
            this.f11933d.stop();
        }
    }

    private static c.a l(X.c cVar) {
        try {
            h8.d c10 = cVar.c();
            if (c10.isDone()) {
                return (c.a) c10.get();
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    private static long n() {
        return System.nanoTime();
    }

    public static boolean o(int i10, int i11, int i12) {
        return s.l(i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(boolean z10) {
        int ordinal = this.f11936g.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else {
            if (this.f11947r == z10) {
                return;
            }
            this.f11947r = z10;
            if (this.f11936g == e.STARTED) {
                D();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(c cVar) {
        cVar.c(this.f11949t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(c.a aVar) {
        try {
            int ordinal = this.f11936g.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                I(null);
                this.f11934e.a();
                this.f11933d.a();
                R();
                N(e.RELEASED);
            }
            aVar.c(null);
        } catch (Throwable th) {
            aVar.f(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object w(final c.a aVar) {
        this.f11930a.execute(new Runnable() { // from class: Y.k
            @Override // java.lang.Runnable
            public final void run() {
                n.this.v(aVar);
            }
        });
        return "AudioSource-release";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Executor executor, c cVar) {
        int ordinal = this.f11936g.ordinal();
        if (ordinal == 0) {
            this.f11939j = executor;
            this.f11940k = cVar;
        } else if (ordinal == 1 || ordinal == 2) {
            throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(X.c cVar) {
        int ordinal = this.f11936g.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (this.f11941l != cVar) {
            I(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(boolean z10) {
        int ordinal = this.f11936g.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
            return;
        }
        this.f11931b.set(null);
        this.f11932c.set(false);
        N(e.STARTED);
        B(z10);
        S();
    }

    public void B(final boolean z10) {
        this.f11930a.execute(new Runnable() { // from class: Y.i
            @Override // java.lang.Runnable
            public final void run() {
                n.this.q(z10);
            }
        });
    }

    void C(final Throwable th) {
        Executor executor = this.f11939j;
        final c cVar = this.f11940k;
        if (executor == null || cVar == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: Y.d
            @Override // java.lang.Runnable
            public final void run() {
                n.c.this.onError(th);
            }
        });
    }

    void D() {
        Executor executor = this.f11939j;
        final c cVar = this.f11940k;
        if (executor == null || cVar == null) {
            return;
        }
        final boolean z10 = this.f11947r || this.f11944o || this.f11946q;
        if (Objects.equals(this.f11931b.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        executor.execute(new Runnable() { // from class: Y.j
            @Override // java.lang.Runnable
            public final void run() {
                n.c.this.a(z10);
            }
        });
    }

    void E(final boolean z10) {
        Executor executor = this.f11939j;
        final c cVar = this.f11940k;
        if (executor == null || cVar == null || this.f11932c.getAndSet(z10) == z10) {
            return;
        }
        executor.execute(new Runnable() { // from class: Y.c
            @Override // java.lang.Runnable
            public final void run() {
                n.c.this.b(z10);
            }
        });
    }

    void F(ByteBuffer byteBuffer, int i10) {
        byte[] bArr = this.f11948s;
        if (bArr == null || bArr.length < i10) {
            this.f11948s = new byte[i10];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.f11948s, 0, i10);
        byteBuffer.limit(byteBuffer.position()).position(position);
    }

    void G(ByteBuffer byteBuffer) {
        Executor executor = this.f11939j;
        final c cVar = this.f11940k;
        if (this.f11951v == 2) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            double d10 = 0.0d;
            while (asShortBuffer.hasRemaining()) {
                d10 = Math.max(d10, Math.abs((int) asShortBuffer.get()));
            }
            this.f11949t = d10 / 32767.0d;
            if (executor == null || cVar == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Y.m
                @Override // java.lang.Runnable
                public final void run() {
                    n.this.u(cVar);
                }
            });
        }
    }

    public h8.d H() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: Y.e
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object w10;
                w10 = n.this.w(aVar);
                return w10;
            }
        });
    }

    void J() {
        y0.f.i(this.f11944o);
        try {
            this.f11933d.start();
            AbstractC0700h0.a("AudioSource", "Retry start AudioStream succeed");
            this.f11934e.stop();
            this.f11944o = false;
        } catch (p.b e10) {
            AbstractC0700h0.m("AudioSource", "Retry start AudioStream failed", e10);
            this.f11945p = n();
        }
    }

    void K() {
        X.c cVar = this.f11941l;
        Objects.requireNonNull(cVar);
        h8.d b10 = cVar.b();
        G.c cVar2 = this.f11942m;
        Objects.requireNonNull(cVar2);
        G.n.j(b10, cVar2, this.f11930a);
    }

    public void L(final Executor executor, final c cVar) {
        this.f11930a.execute(new Runnable() { // from class: Y.l
            @Override // java.lang.Runnable
            public final void run() {
                n.this.x(executor, cVar);
            }
        });
    }

    public void M(final X.c cVar) {
        this.f11930a.execute(new Runnable() { // from class: Y.g
            @Override // java.lang.Runnable
            public final void run() {
                n.this.y(cVar);
            }
        });
    }

    void N(e eVar) {
        AbstractC0700h0.a("AudioSource", "Transitioning internal state: " + this.f11936g + " --> " + eVar);
        this.f11936g = eVar;
    }

    public void O(final boolean z10) {
        this.f11930a.execute(new Runnable() { // from class: Y.f
            @Override // java.lang.Runnable
            public final void run() {
                n.this.z(z10);
            }
        });
    }

    public void Q() {
        this.f11930a.execute(new Runnable() { // from class: Y.b
            @Override // java.lang.Runnable
            public final void run() {
                n.this.A();
            }
        });
    }

    void S() {
        if (this.f11936g != e.STARTED) {
            R();
            return;
        }
        boolean z10 = this.f11937h == c.a.ACTIVE;
        E(!z10);
        if (z10) {
            P();
        } else {
            R();
        }
    }

    p m() {
        return this.f11944o ? this.f11934e : this.f11933d;
    }

    boolean p() {
        y0.f.i(this.f11945p > 0);
        return n() - this.f11945p >= this.f11935f;
    }

    n(AbstractC1305a abstractC1305a, Executor executor, Context context, q qVar, long j10) {
        this.f11931b = new AtomicReference(null);
        this.f11932c = new AtomicBoolean(false);
        this.f11936g = e.CONFIGURED;
        this.f11937h = c.a.INACTIVE;
        this.f11950u = 0L;
        Executor g10 = F.c.g(executor);
        this.f11930a = g10;
        this.f11935f = TimeUnit.MILLISECONDS.toNanos(j10);
        try {
            C c10 = new C(qVar.a(abstractC1305a, context), abstractC1305a);
            this.f11933d = c10;
            c10.b(new d(), g10);
            this.f11934e = new E(abstractC1305a);
            this.f11951v = abstractC1305a.b();
            this.f11952w = abstractC1305a.c();
        } catch (p.b | IllegalArgumentException e10) {
            throw new o("Unable to create AudioStream", e10);
        }
    }

    public interface c {
        void a(boolean z10);

        void c(double d10);

        void onError(Throwable th);

        default void b(boolean z10) {
        }
    }
}
