package V;

import A.AbstractC0700h0;
import A.I0;
import android.view.Surface;
import androidx.camera.core.impl.e1;
import androidx.concurrent.futures.c;
import c0.InterfaceC1701l;
import c0.InterfaceC1704o;
import java.util.Objects;
import java.util.concurrent.Executor;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
final class y0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f10747a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f10748b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1704o f10749c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1701l f10750d = null;

    /* renamed from: e, reason: collision with root package name */
    private Surface f10751e = null;

    /* renamed from: f, reason: collision with root package name */
    private I0 f10752f = null;

    /* renamed from: g, reason: collision with root package name */
    private Executor f10753g = null;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC1701l.c.a f10754h = null;

    /* renamed from: i, reason: collision with root package name */
    private b f10755i = b.NOT_INITIALIZED;

    /* renamed from: j, reason: collision with root package name */
    private h8.d f10756j = G.n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: k, reason: collision with root package name */
    private c.a f10757k = null;

    /* renamed from: l, reason: collision with root package name */
    private h8.d f10758l = G.n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: m, reason: collision with root package name */
    private c.a f10759m = null;

    private enum b {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    y0(InterfaceC1704o interfaceC1704o, Executor executor, Executor executor2) {
        this.f10747a = executor2;
        this.f10748b = executor;
        this.f10749c = interfaceC1704o;
    }

    private void h() {
        int ordinal = this.f10755i.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            x();
            return;
        }
        if (ordinal == 2 || ordinal == 3) {
            AbstractC0700h0.a("VideoEncoderSession", "closeInternal in " + this.f10755i + " state");
            this.f10755i = b.PENDING_RELEASE;
            return;
        }
        if (ordinal == 4) {
            AbstractC0700h0.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.f10755i + " is not handled");
    }

    private void j(final I0 i02, e1 e1Var, X.g gVar, r rVar, final c.a aVar) {
        A.B n10 = i02.n();
        try {
            InterfaceC1701l a10 = this.f10749c.a(this.f10747a, b0.k.c(b0.k.d(rVar, n10, gVar), e1Var, rVar.d(), i02.p(), n10, i02.o()));
            this.f10750d = a10;
            InterfaceC1701l.b c10 = a10.c();
            if (c10 instanceof InterfaceC1701l.c) {
                ((InterfaceC1701l.c) c10).d(this.f10748b, new InterfaceC1701l.c.a() { // from class: V.v0
                    @Override // c0.InterfaceC1701l.c.a
                    public final void a(Surface surface) {
                        y0.this.s(aVar, i02, surface);
                    }
                });
            } else {
                aVar.f(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (c0.k0 e10) {
            AbstractC0700h0.d("VideoEncoderSession", "Unable to initialize video encoder.", e10);
            aVar.f(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(c.a aVar) {
        this.f10757k = aVar;
        return "ReleasedFuture " + this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p(c.a aVar) {
        this.f10759m = aVar;
        return "ReadyToReleaseFuture " + this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(I0 i02, e1 e1Var, X.g gVar, r rVar, c.a aVar) {
        j(i02, e1Var, gVar, rVar, aVar);
        return "ConfigureVideoEncoderFuture " + this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(Surface surface) {
        this.f10754h.a(surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(c.a aVar, I0 i02, final Surface surface) {
        Executor executor;
        int ordinal = this.f10755i.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (i02.t()) {
                    AbstractC0700h0.a("VideoEncoderSession", "Not provide surface, " + Objects.toString(i02, "EMPTY") + " is already serviced.");
                    aVar.c(null);
                    h();
                    return;
                }
                this.f10751e = surface;
                AbstractC0700h0.a("VideoEncoderSession", "provide surface: " + surface);
                i02.D(surface, this.f10748b, new InterfaceC5159a() { // from class: V.w0
                    @Override // y0.InterfaceC5159a
                    public final void accept(Object obj) {
                        y0.this.u((I0.g) obj);
                    }
                });
                this.f10755i = b.READY;
                aVar.c(this.f10750d);
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    if (this.f10754h != null && (executor = this.f10753g) != null) {
                        executor.execute(new Runnable() { // from class: V.x0
                            @Override // java.lang.Runnable
                            public final void run() {
                                y0.this.r(surface);
                            }
                        });
                    }
                    AbstractC0700h0.l("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
                if (ordinal != 4) {
                    throw new IllegalStateException("State " + this.f10755i + " is not handled");
                }
            }
        }
        AbstractC0700h0.a("VideoEncoderSession", "Not provide surface in " + this.f10755i);
        aVar.c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f10757k.c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(I0.g gVar) {
        AbstractC0700h0.a("VideoEncoderSession", "Surface can be closed: " + gVar.b().hashCode());
        Surface b10 = gVar.b();
        if (b10 != this.f10751e) {
            b10.release();
            return;
        }
        this.f10751e = null;
        this.f10759m.c(this.f10750d);
        h();
    }

    h8.d i(final I0 i02, final e1 e1Var, final r rVar, final X.g gVar) {
        if (this.f10755i.ordinal() != 0) {
            return G.n.n(new IllegalStateException("configure() shouldn't be called in " + this.f10755i));
        }
        this.f10755i = b.INITIALIZING;
        this.f10752f = i02;
        AbstractC0700h0.a("VideoEncoderSession", "Create VideoEncoderSession: " + this);
        this.f10756j = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: V.s0
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object o10;
                o10 = y0.this.o(aVar);
                return o10;
            }
        });
        this.f10758l = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: V.t0
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object p10;
                p10 = y0.this.p(aVar);
                return p10;
            }
        });
        h8.d a10 = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: V.u0
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object q10;
                q10 = y0.this.q(i02, e1Var, gVar, rVar, aVar);
                return q10;
            }
        });
        G.n.j(a10, new a(), this.f10748b);
        return G.n.B(a10);
    }

    Surface k() {
        if (this.f10755i != b.READY) {
            return null;
        }
        return this.f10751e;
    }

    h8.d l() {
        return G.n.B(this.f10758l);
    }

    InterfaceC1701l m() {
        return this.f10750d;
    }

    boolean n(I0 i02) {
        int ordinal = this.f10755i.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return false;
                }
                throw new IllegalStateException("State " + this.f10755i + " is not handled");
            }
        }
        return this.f10752f == i02;
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f10752f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }

    void v(Executor executor, InterfaceC1701l.c.a aVar) {
        this.f10753g = executor;
        this.f10754h = aVar;
    }

    h8.d w() {
        h();
        return G.n.B(this.f10756j);
    }

    void x() {
        int ordinal = this.f10755i.ordinal();
        if (ordinal == 0) {
            this.f10755i = b.RELEASED;
            return;
        }
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            if (ordinal != 4) {
                throw new IllegalStateException("State " + this.f10755i + " is not handled");
            }
            AbstractC0700h0.a("VideoEncoderSession", "terminateNow in " + this.f10755i + ", No-op");
            return;
        }
        this.f10755i = b.RELEASED;
        this.f10759m.c(this.f10750d);
        this.f10752f = null;
        if (this.f10750d == null) {
            AbstractC0700h0.l("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f10757k.c(null);
            return;
        }
        AbstractC0700h0.a("VideoEncoderSession", "VideoEncoder is releasing: " + this.f10750d);
        this.f10750d.a();
        this.f10750d.f().e(new Runnable() { // from class: V.r0
            @Override // java.lang.Runnable
            public final void run() {
                y0.this.t();
            }
        }, this.f10748b);
        this.f10750d = null;
    }

    class a implements G.c {
        a() {
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            AbstractC0700h0.m("VideoEncoderSession", "VideoEncoder configuration failed.", th);
            y0.this.x();
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC1701l interfaceC1701l) {
        }
    }
}
