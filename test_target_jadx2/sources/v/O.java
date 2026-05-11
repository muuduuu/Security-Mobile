package V;

import A.AbstractC0700h0;
import A.I0;
import A.InterfaceC0713p;
import V.A0;
import V.AbstractC1237a0;
import V.B0;
import V.O;
import V.r;
import V.z0;
import Y.AbstractC1305a;
import Y.n;
import android.content.Context;
import android.location.Location;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.Y0;
import androidx.camera.core.impl.e1;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.concurrent.futures.c;
import c0.C1696g;
import c0.C1697h;
import c0.InterfaceC1698i;
import c0.InterfaceC1701l;
import c0.InterfaceC1702m;
import c0.InterfaceC1703n;
import c0.InterfaceC1704o;
import e0.AbstractC3066a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public final class O implements z0 {

    /* renamed from: j0, reason: collision with root package name */
    private static final Set f10460j0 = Collections.unmodifiableSet(EnumSet.of(l.PENDING_RECORDING, l.PENDING_PAUSED));

    /* renamed from: k0, reason: collision with root package name */
    private static final Set f10461k0 = Collections.unmodifiableSet(EnumSet.of(l.CONFIGURING, l.IDLING, l.RESETTING, l.STOPPING, l.ERROR));

    /* renamed from: l0, reason: collision with root package name */
    public static final C1261y f10462l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final B0 f10463m0;

    /* renamed from: n0, reason: collision with root package name */
    private static final r f10464n0;

    /* renamed from: o0, reason: collision with root package name */
    private static final Exception f10465o0;

    /* renamed from: p0, reason: collision with root package name */
    static final InterfaceC1704o f10466p0;

    /* renamed from: q0, reason: collision with root package name */
    private static final Executor f10467q0;

    /* renamed from: r0, reason: collision with root package name */
    static int f10468r0;

    /* renamed from: s0, reason: collision with root package name */
    static long f10469s0;

    /* renamed from: A, reason: collision with root package name */
    Surface f10470A;

    /* renamed from: B, reason: collision with root package name */
    Surface f10471B;

    /* renamed from: C, reason: collision with root package name */
    MediaMuxer f10472C;

    /* renamed from: D, reason: collision with root package name */
    final C0 f10473D;

    /* renamed from: E, reason: collision with root package name */
    Y.n f10474E;

    /* renamed from: F, reason: collision with root package name */
    InterfaceC1701l f10475F;

    /* renamed from: G, reason: collision with root package name */
    c0.l0 f10476G;

    /* renamed from: H, reason: collision with root package name */
    InterfaceC1701l f10477H;

    /* renamed from: I, reason: collision with root package name */
    c0.l0 f10478I;

    /* renamed from: J, reason: collision with root package name */
    h f10479J;

    /* renamed from: K, reason: collision with root package name */
    Uri f10480K;

    /* renamed from: L, reason: collision with root package name */
    long f10481L;

    /* renamed from: M, reason: collision with root package name */
    long f10482M;

    /* renamed from: N, reason: collision with root package name */
    long f10483N;

    /* renamed from: O, reason: collision with root package name */
    int f10484O;

    /* renamed from: P, reason: collision with root package name */
    Range f10485P;

    /* renamed from: Q, reason: collision with root package name */
    long f10486Q;

    /* renamed from: R, reason: collision with root package name */
    long f10487R;

    /* renamed from: S, reason: collision with root package name */
    long f10488S;

    /* renamed from: T, reason: collision with root package name */
    long f10489T;

    /* renamed from: U, reason: collision with root package name */
    long f10490U;

    /* renamed from: V, reason: collision with root package name */
    int f10491V;

    /* renamed from: W, reason: collision with root package name */
    Throwable f10492W;

    /* renamed from: X, reason: collision with root package name */
    InterfaceC1698i f10493X;

    /* renamed from: Y, reason: collision with root package name */
    final L.c f10494Y;

    /* renamed from: Z, reason: collision with root package name */
    Throwable f10495Z;

    /* renamed from: a, reason: collision with root package name */
    private final C0 f10496a;

    /* renamed from: a0, reason: collision with root package name */
    boolean f10497a0;

    /* renamed from: b, reason: collision with root package name */
    private final C0 f10498b;

    /* renamed from: b0, reason: collision with root package name */
    z0.a f10499b0;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f10500c;

    /* renamed from: c0, reason: collision with root package name */
    ScheduledFuture f10501c0;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f10502d;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f10503d0;

    /* renamed from: e, reason: collision with root package name */
    final Executor f10504e;

    /* renamed from: e0, reason: collision with root package name */
    y0 f10505e0;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1704o f10506f;

    /* renamed from: f0, reason: collision with root package name */
    y0 f10507f0;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1704o f10508g;

    /* renamed from: g0, reason: collision with root package name */
    double f10509g0;

    /* renamed from: h, reason: collision with root package name */
    private final Object f10510h = new Object();

    /* renamed from: h0, reason: collision with root package name */
    private boolean f10511h0;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f10512i;

    /* renamed from: i0, reason: collision with root package name */
    private k f10513i0;

    /* renamed from: j, reason: collision with root package name */
    private final int f10514j;

    /* renamed from: k, reason: collision with root package name */
    private l f10515k;

    /* renamed from: l, reason: collision with root package name */
    private l f10516l;

    /* renamed from: m, reason: collision with root package name */
    int f10517m;

    /* renamed from: n, reason: collision with root package name */
    j f10518n;

    /* renamed from: o, reason: collision with root package name */
    j f10519o;

    /* renamed from: p, reason: collision with root package name */
    private long f10520p;

    /* renamed from: q, reason: collision with root package name */
    j f10521q;

    /* renamed from: r, reason: collision with root package name */
    boolean f10522r;

    /* renamed from: s, reason: collision with root package name */
    private I0.h f10523s;

    /* renamed from: t, reason: collision with root package name */
    private I0.h f10524t;

    /* renamed from: u, reason: collision with root package name */
    private X.g f10525u;

    /* renamed from: v, reason: collision with root package name */
    final List f10526v;

    /* renamed from: w, reason: collision with root package name */
    Integer f10527w;

    /* renamed from: x, reason: collision with root package name */
    Integer f10528x;

    /* renamed from: y, reason: collision with root package name */
    I0 f10529y;

    /* renamed from: z, reason: collision with root package name */
    e1 f10530z;

    class a implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0 f10531a;

        a(y0 y0Var) {
            this.f10531a = y0Var;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC1701l interfaceC1701l) {
            InterfaceC1701l interfaceC1701l2;
            AbstractC0700h0.a("Recorder", "VideoEncoder can be released: " + interfaceC1701l);
            if (interfaceC1701l == null) {
                return;
            }
            ScheduledFuture scheduledFuture = O.this.f10501c0;
            if (scheduledFuture != null && scheduledFuture.cancel(false) && (interfaceC1701l2 = O.this.f10475F) != null && interfaceC1701l2 == interfaceC1701l) {
                O.c0(interfaceC1701l2);
            }
            O o10 = O.this;
            o10.f10507f0 = this.f10531a;
            o10.x0(null);
            O o11 = O.this;
            o11.p0(4, null, o11.N());
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            AbstractC0700h0.a("Recorder", "Error in ReadyToReleaseFuture: " + th);
        }
    }

    class b implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y.n f10533a;

        b(Y.n nVar) {
            this.f10533a = nVar;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            AbstractC0700h0.a("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f10533a.hashCode())));
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            AbstractC0700h0.a("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f10533a.hashCode())));
        }
    }

    class d implements n.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5159a f10538a;

        d(InterfaceC5159a interfaceC5159a) {
            this.f10538a = interfaceC5159a;
        }

        @Override // Y.n.c
        public void a(boolean z10) {
            O o10 = O.this;
            if (o10.f10497a0 != z10) {
                o10.f10497a0 = z10;
                o10.M0();
            } else {
                AbstractC0700h0.l("Recorder", "Audio source silenced transitions to the same state " + z10);
            }
        }

        @Override // Y.n.c
        public void c(double d10) {
            O.this.f10509g0 = d10;
        }

        @Override // Y.n.c
        public void onError(Throwable th) {
            AbstractC0700h0.d("Recorder", "Error occurred after audio source started.", th);
            if (th instanceof Y.o) {
                this.f10538a.accept(th);
            }
        }
    }

    class f implements G.c {
        f() {
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List list) {
            AbstractC0700h0.a("Recorder", "Encodings end successfully.");
            O o10 = O.this;
            o10.C(o10.f10491V, o10.f10492W);
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            y0.f.j(O.this.f10521q != null, "In-progress recording shouldn't be null");
            if (O.this.f10521q.r()) {
                return;
            }
            AbstractC0700h0.a("Recorder", "Encodings end with error: " + th);
            O o10 = O.this;
            o10.C(o10.f10472C == null ? 8 : 6, th);
        }
    }

    class g implements E0.a {
        g() {
        }

        @Override // androidx.camera.core.impl.E0.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            O.this.f10498b.k(bool);
        }

        @Override // androidx.camera.core.impl.E0.a
        public void onError(Throwable th) {
            O.this.f10498b.j(th);
        }
    }

    enum h {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        private final r.a f10546a;

        /* renamed from: b, reason: collision with root package name */
        private int f10547b = 0;

        /* renamed from: c, reason: collision with root package name */
        private Executor f10548c = null;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC1704o f10549d;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC1704o f10550e;

        public i() {
            InterfaceC1704o interfaceC1704o = O.f10466p0;
            this.f10549d = interfaceC1704o;
            this.f10550e = interfaceC1704o;
            this.f10546a = r.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(int i10, B0.a aVar) {
            aVar.c(new Range(Integer.valueOf(i10), Integer.valueOf(i10)));
        }

        public O c() {
            return new O(this.f10548c, this.f10546a.a(), this.f10547b, this.f10549d, this.f10550e);
        }

        public i f(Executor executor) {
            y0.f.h(executor, "The specified executor can't be null.");
            this.f10548c = executor;
            return this;
        }

        public i g(final C1261y c1261y) {
            y0.f.h(c1261y, "The specified quality selector can't be null.");
            this.f10546a.b(new InterfaceC5159a() { // from class: V.Q
                @Override // y0.InterfaceC5159a
                public final void accept(Object obj) {
                    ((B0.a) obj).e(C1261y.this);
                }
            });
            return this;
        }

        public i h(final int i10) {
            if (i10 > 0) {
                this.f10546a.b(new InterfaceC5159a() { // from class: V.P
                    @Override // y0.InterfaceC5159a
                    public final void accept(Object obj) {
                        O.i.e(i10, (B0.a) obj);
                    }
                });
                return this;
            }
            throw new IllegalArgumentException("The requested target bitrate " + i10 + " is not supported. Target bitrate must be greater than 0.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class k {

        /* renamed from: a, reason: collision with root package name */
        private final I0 f10561a;

        /* renamed from: b, reason: collision with root package name */
        private final e1 f10562b;

        /* renamed from: c, reason: collision with root package name */
        private final int f10563c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f10564d = false;

        /* renamed from: e, reason: collision with root package name */
        private int f10565e = 0;

        /* renamed from: f, reason: collision with root package name */
        private ScheduledFuture f10566f = null;

        class a implements G.c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y0 f10568a;

            a(y0 y0Var) {
                this.f10568a = y0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void b() {
                if (k.this.f10564d) {
                    return;
                }
                AbstractC0700h0.a("Recorder", "Retry setupVideo #" + k.this.f10565e);
                k kVar = k.this;
                kVar.l(kVar.f10561a, k.this.f10562b);
            }

            @Override // G.c
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(InterfaceC1701l interfaceC1701l) {
                AbstractC0700h0.a("Recorder", "VideoEncoder is created. " + interfaceC1701l);
                if (interfaceC1701l == null) {
                    return;
                }
                y0.f.i(O.this.f10505e0 == this.f10568a);
                y0.f.i(O.this.f10475F == null);
                O.this.k0(this.f10568a);
                O.this.d0();
            }

            @Override // G.c
            public void onFailure(Throwable th) {
                AbstractC0700h0.m("Recorder", "VideoEncoder Setup error: " + th, th);
                if (k.this.f10565e >= k.this.f10563c) {
                    O.this.e0(th);
                    return;
                }
                k.e(k.this);
                k.this.f10566f = O.u0(new Runnable() { // from class: V.W
                    @Override // java.lang.Runnable
                    public final void run() {
                        O.k.a.this.b();
                    }
                }, O.this.f10504e, O.f10469s0, TimeUnit.MILLISECONDS);
            }
        }

        k(I0 i02, e1 e1Var, int i10) {
            this.f10561a = i02;
            this.f10562b = e1Var;
            this.f10563c = i10;
        }

        static /* synthetic */ int e(k kVar) {
            int i10 = kVar.f10565e;
            kVar.f10565e = i10 + 1;
            return i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(I0 i02, e1 e1Var) {
            if (!i02.t() && (!O.this.f10505e0.n(i02) || O.this.N())) {
                InterfaceC1704o interfaceC1704o = O.this.f10506f;
                O o10 = O.this;
                y0 y0Var = new y0(interfaceC1704o, o10.f10504e, o10.f10502d);
                O o11 = O.this;
                h8.d i10 = y0Var.i(i02, e1Var, (r) o11.G(o11.f10473D), O.this.f10525u);
                O.this.f10505e0 = y0Var;
                G.n.j(i10, new a(y0Var), O.this.f10504e);
                return;
            }
            AbstractC0700h0.l("Recorder", "Ignore the SurfaceRequest " + i02 + " isServiced: " + i02.t() + " VideoEncoderSession: " + O.this.f10505e0 + " has been configured with a persistent in-progress recording.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(final I0 i02, final e1 e1Var) {
            O.this.t0().e(new Runnable() { // from class: V.V
                @Override // java.lang.Runnable
                public final void run() {
                    O.k.this.k(i02, e1Var);
                }
            }, O.this.f10504e);
        }

        void j() {
            if (this.f10564d) {
                return;
            }
            this.f10564d = true;
            ScheduledFuture scheduledFuture = this.f10566f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f10566f = null;
            }
        }

        void m() {
            l(this.f10561a, this.f10562b);
        }
    }

    enum l {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        AbstractC1258v abstractC1258v = AbstractC1258v.f10728c;
        C1261y e10 = C1261y.e(Arrays.asList(abstractC1258v, AbstractC1258v.f10727b, AbstractC1258v.f10726a), AbstractC1253p.a(abstractC1258v));
        f10462l0 = e10;
        B0 a10 = B0.a().e(e10).b(-1).a();
        f10463m0 = a10;
        f10464n0 = r.a().e(-1).f(a10).a();
        f10465o0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        f10466p0 = new InterfaceC1704o() { // from class: V.H
            @Override // c0.InterfaceC1704o
            public final InterfaceC1701l a(Executor executor, InterfaceC1703n interfaceC1703n) {
                return new c0.H(executor, interfaceC1703n);
            }
        };
        f10467q0 = F.c.g(F.c.d());
        f10468r0 = 3;
        f10469s0 = 1000L;
    }

    O(Executor executor, r rVar, int i10, InterfaceC1704o interfaceC1704o, InterfaceC1704o interfaceC1704o2) {
        this.f10512i = androidx.camera.video.internal.compat.quirk.a.b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f10515k = l.CONFIGURING;
        this.f10516l = null;
        this.f10517m = 0;
        this.f10518n = null;
        this.f10519o = null;
        this.f10520p = 0L;
        this.f10521q = null;
        this.f10522r = false;
        this.f10523s = null;
        this.f10524t = null;
        this.f10525u = null;
        this.f10526v = new ArrayList();
        this.f10527w = null;
        this.f10528x = null;
        this.f10470A = null;
        this.f10471B = null;
        this.f10472C = null;
        this.f10474E = null;
        this.f10475F = null;
        this.f10476G = null;
        this.f10477H = null;
        this.f10478I = null;
        this.f10479J = h.INITIALIZING;
        this.f10480K = Uri.EMPTY;
        this.f10481L = 0L;
        this.f10482M = 0L;
        this.f10483N = Long.MAX_VALUE;
        this.f10484O = 0;
        this.f10485P = null;
        this.f10486Q = Long.MAX_VALUE;
        this.f10487R = Long.MAX_VALUE;
        this.f10488S = Long.MAX_VALUE;
        this.f10489T = 0L;
        this.f10490U = 0L;
        this.f10491V = 1;
        this.f10492W = null;
        this.f10493X = null;
        this.f10494Y = new L.a(60);
        this.f10495Z = null;
        this.f10497a0 = false;
        this.f10499b0 = z0.a.INACTIVE;
        this.f10501c0 = null;
        this.f10503d0 = false;
        this.f10507f0 = null;
        this.f10509g0 = 0.0d;
        this.f10511h0 = false;
        this.f10513i0 = null;
        this.f10500c = executor;
        executor = executor == null ? F.c.d() : executor;
        this.f10502d = executor;
        Executor g10 = F.c.g(executor);
        this.f10504e = g10;
        this.f10473D = C0.l(A(rVar));
        this.f10514j = i10;
        this.f10496a = C0.l(AbstractC1237a0.d(this.f10517m, K(this.f10515k)));
        this.f10498b = C0.l(Boolean.FALSE);
        this.f10506f = interfaceC1704o;
        this.f10508g = interfaceC1704o2;
        this.f10505e0 = new y0(interfaceC1704o, g10, executor);
    }

    private r A(r rVar) {
        r.a i10 = rVar.i();
        if (rVar.d().b() == -1) {
            i10.b(new InterfaceC5159a() { // from class: V.z
                @Override // y0.InterfaceC5159a
                public final void accept(Object obj) {
                    O.P((B0.a) obj);
                }
            });
        }
        return i10.a();
    }

    private void B(I0 i02, e1 e1Var, boolean z10) {
        if (i02.t()) {
            AbstractC0700h0.l("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        i02.E(this.f10504e, new I0.i() { // from class: V.I
            @Override // A.I0.i
            public final void a(I0.h hVar) {
                O.this.Q(hVar);
            }
        });
        Size p10 = i02.p();
        A.B n10 = i02.n();
        InterfaceC1239b0 H10 = H(i02.l().c());
        AbstractC1258v a10 = H10.a(p10, n10);
        AbstractC0700h0.a("Recorder", "Using supported quality of " + a10 + " for surface size " + p10);
        if (a10 != AbstractC1258v.f10732g) {
            X.g c10 = H10.c(a10, n10);
            this.f10525u = c10;
            if (c10 == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        k kVar = this.f10513i0;
        if (kVar != null) {
            kVar.j();
        }
        k kVar2 = new k(i02, e1Var, z10 ? f10468r0 : 0);
        this.f10513i0 = kVar2;
        kVar2.m();
    }

    private void B0(j jVar) {
        r rVar = (r) G(this.f10473D);
        b0.e d10 = b0.b.d(rVar, this.f10525u);
        e1 e1Var = e1.UPTIME;
        AbstractC1305a e10 = b0.b.e(d10, rVar.b());
        if (this.f10474E != null) {
            o0();
        }
        Y.n C02 = C0(jVar, e10);
        this.f10474E = C02;
        AbstractC0700h0.a("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(C02.hashCode())));
        InterfaceC1701l a10 = this.f10508g.a(this.f10502d, b0.b.c(d10, e1Var, e10, rVar.b()));
        this.f10477H = a10;
        InterfaceC1701l.b c10 = a10.c();
        if (!(c10 instanceof InterfaceC1701l.a)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        this.f10474E.M((InterfaceC1701l.a) c10);
    }

    private Y.n C0(j jVar, AbstractC1305a abstractC1305a) {
        return jVar.x(abstractC1305a, f10467q0);
    }

    private void D(j jVar, int i10, Throwable th) {
        Uri uri = Uri.EMPTY;
        jVar.d(uri);
        jVar.C(A0.b(jVar.j(), Z.d(0L, 0L, AbstractC1238b.d(1, this.f10495Z, 0.0d)), AbstractC1256t.b(uri), i10, th));
    }

    private List E(long j10) {
        ArrayList arrayList = new ArrayList();
        while (!this.f10494Y.isEmpty()) {
            InterfaceC1698i interfaceC1698i = (InterfaceC1698i) this.f10494Y.a();
            if (interfaceC1698i.C1() >= j10) {
                arrayList.add(interfaceC1698i);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void E0(j jVar) {
        if (this.f10521q != null) {
            throw new AssertionError("Attempted to start a new recording while another was in progress.");
        }
        if (jVar.j().b() > 0) {
            this.f10489T = Math.round(jVar.j().b() * 0.95d);
            AbstractC0700h0.a("Recorder", "File size limit in bytes: " + this.f10489T);
        } else {
            this.f10489T = 0L;
        }
        if (jVar.j().a() > 0) {
            this.f10490U = TimeUnit.MILLISECONDS.toNanos(jVar.j().a());
            AbstractC0700h0.a("Recorder", "Duration limit in nanoseconds: " + this.f10490U);
        } else {
            this.f10490U = 0L;
        }
        this.f10521q = jVar;
        int ordinal = this.f10479J.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                v0(jVar.o() ? h.ENABLED : h.DISABLED);
            } else if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
                throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.f10479J);
            }
        } else if (jVar.o()) {
            if (!M()) {
                throw new AssertionError("The Recorder doesn't support recording with audio");
            }
            try {
                if (this.f10521q.r()) {
                    if (this.f10477H == null) {
                    }
                    v0(h.ENABLED);
                }
                B0(jVar);
                v0(h.ENABLED);
            } catch (Y.o e10) {
                e = e10;
                AbstractC0700h0.d("Recorder", "Unable to create audio resource with error: ", e);
                v0(!(e instanceof c0.k0) ? h.ERROR_ENCODER : h.ERROR_SOURCE);
                this.f10495Z = e;
                L0(jVar, false);
                if (L()) {
                }
                this.f10475F.start();
                j jVar2 = this.f10521q;
                jVar2.C(A0.f(jVar2.j(), F()));
            } catch (c0.k0 e11) {
                e = e11;
                AbstractC0700h0.d("Recorder", "Unable to create audio resource with error: ", e);
                v0(!(e instanceof c0.k0) ? h.ERROR_ENCODER : h.ERROR_SOURCE);
                this.f10495Z = e;
                L0(jVar, false);
                if (L()) {
                }
                this.f10475F.start();
                j jVar22 = this.f10521q;
                jVar22.C(A0.f(jVar22.j(), F()));
            }
        }
        L0(jVar, false);
        if (L()) {
            this.f10474E.O(jVar.q());
            this.f10477H.start();
        }
        this.f10475F.start();
        j jVar222 = this.f10521q;
        jVar222.C(A0.f(jVar222.j(), F()));
    }

    private void F0(j jVar, boolean z10) {
        E0(jVar);
        if (z10) {
            l0(jVar);
        }
    }

    public static InterfaceC1239b0 H(InterfaceC0713p interfaceC0713p) {
        return I(interfaceC0713p, 0);
    }

    public static InterfaceC1239b0 I(InterfaceC0713p interfaceC0713p, int i10) {
        return new X(i10, (androidx.camera.core.impl.G) interfaceC0713p, c0.t0.f19273d);
    }

    private static int I0(X.g gVar, int i10) {
        if (gVar != null) {
            int b10 = gVar.b();
            if (b10 == 1) {
                return Build.VERSION.SDK_INT < 26 ? 0 : 2;
            }
            if (b10 == 2) {
                return 0;
            }
            if (b10 == 9) {
                return 1;
            }
        }
        return i10;
    }

    private int J(h hVar) {
        int ordinal = hVar.ordinal();
        if (ordinal == 0 || ordinal == 2) {
            return 1;
        }
        if (ordinal == 3) {
            j jVar = this.f10521q;
            if (jVar == null || !jVar.q()) {
                return this.f10497a0 ? 2 : 0;
            }
            return 5;
        }
        if (ordinal == 4) {
            return 3;
        }
        if (ordinal == 5) {
            return 4;
        }
        throw new AssertionError("Invalid internal audio state: " + hVar);
    }

    private void J0() {
        y0 y0Var = this.f10507f0;
        if (y0Var == null) {
            t0();
            return;
        }
        y0.f.i(y0Var.m() == this.f10475F);
        AbstractC0700h0.a("Recorder", "Releasing video encoder: " + this.f10475F);
        this.f10507f0.x();
        this.f10507f0 = null;
        this.f10475F = null;
        this.f10476G = null;
        x0(null);
    }

    private AbstractC1237a0.a K(l lVar) {
        return (lVar == l.RECORDING || (lVar == l.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) androidx.camera.video.internal.compat.quirk.a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? AbstractC1237a0.a.ACTIVE : AbstractC1237a0.a.INACTIVE;
    }

    private void L0(final j jVar, boolean z10) {
        if (!this.f10526v.isEmpty()) {
            h8.d k10 = G.n.k(this.f10526v);
            if (!k10.isDone()) {
                k10.cancel(true);
            }
            this.f10526v.clear();
        }
        this.f10526v.add(androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: V.K
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object Y10;
                Y10 = O.this.Y(jVar, aVar);
                return Y10;
            }
        }));
        if (L() && !z10) {
            this.f10526v.add(androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: V.L
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object a02;
                    a02 = O.this.a0(jVar, aVar);
                    return a02;
                }
            }));
        }
        G.n.j(G.n.k(this.f10526v), new f(), F.c.b());
    }

    private void N0(l lVar) {
        if (!f10460j0.contains(this.f10515k)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f10515k);
        }
        if (!f10461k0.contains(lVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + lVar);
        }
        if (this.f10516l != lVar) {
            this.f10516l = lVar;
            this.f10496a.k(AbstractC1237a0.e(this.f10517m, K(lVar), this.f10523s));
        }
    }

    private static boolean O(Y y10, j jVar) {
        return jVar != null && y10.d() == jVar.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P(B0.a aVar) {
        aVar.b(f10463m0.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(I0.h hVar) {
        this.f10524t = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(Uri uri) {
        this.f10480K = uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V() {
        I0 i02 = this.f10529y;
        if (i02 == null) {
            throw new AssertionError("surface request is required to retry initialization.");
        }
        B(i02, this.f10530z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void X(InterfaceC1701l interfaceC1701l) {
        AbstractC0700h0.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (androidx.camera.video.internal.compat.quirk.a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
            c0(interfaceC1701l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object Y(j jVar, c.a aVar) {
        this.f10475F.e(new c(aVar, jVar), this.f10504e);
        return "videoEncodingFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(c.a aVar, Throwable th) {
        if (this.f10495Z == null) {
            if (th instanceof C1697h) {
                v0(h.ERROR_ENCODER);
            } else {
                v0(h.ERROR_SOURCE);
            }
            this.f10495Z = th;
            M0();
            aVar.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object a0(j jVar, final c.a aVar) {
        InterfaceC5159a interfaceC5159a = new InterfaceC5159a() { // from class: V.A
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                O.this.Z(aVar, (Throwable) obj);
            }
        };
        this.f10474E.L(this.f10504e, new d(interfaceC5159a));
        this.f10477H.e(new e(aVar, interfaceC5159a, jVar), this.f10504e);
        return "audioEncodingFuture";
    }

    private j b0(l lVar) {
        boolean z10;
        if (lVar == l.PENDING_PAUSED) {
            z10 = true;
        } else {
            if (lVar != l.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z10 = false;
        }
        if (this.f10518n != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        j jVar = this.f10519o;
        if (jVar == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f10518n = jVar;
        jVar.n().e(F.c.b(), new g());
        this.f10519o = null;
        if (z10) {
            y0(l.PAUSED);
        } else {
            y0(l.RECORDING);
        }
        return jVar;
    }

    static void c0(InterfaceC1701l interfaceC1701l) {
        if (interfaceC1701l instanceof c0.H) {
            ((c0.H) interfaceC1701l).n0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:11:0x00b4, B:32:0x0025, B:34:0x0029, B:36:0x002f, B:39:0x003a, B:42:0x0045, B:43:0x0052, B:44:0x006a, B:46:0x006e, B:48:0x0074, B:49:0x0084, B:51:0x0088, B:53:0x008e, B:56:0x0096, B:58:0x009f, B:60:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:11:0x00b4, B:32:0x0025, B:34:0x0029, B:36:0x002f, B:39:0x003a, B:42:0x0045, B:43:0x0052, B:44:0x006a, B:46:0x006e, B:48:0x0074, B:49:0x0084, B:51:0x0088, B:53:0x008e, B:56:0x0096, B:58:0x009f, B:60:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void g0(j jVar) {
        j jVar2;
        boolean z10;
        j jVar3;
        Throwable th;
        int i10;
        int i11;
        int i12;
        synchronized (this.f10510h) {
            try {
                j jVar4 = this.f10518n;
                if (jVar4 != jVar) {
                    throw new AssertionError("Active recording did not match finalized recording on finalize.");
                }
                jVar4.n().f();
                jVar2 = null;
                this.f10518n = null;
                int i13 = 1;
                switch (this.f10515k.ordinal()) {
                    case 1:
                        z10 = false;
                        if (this.f10499b0 != z0.a.INACTIVE) {
                            jVar3 = this.f10519o;
                            this.f10519o = null;
                            y0(l.CONFIGURING);
                            th = f10465o0;
                            i11 = 0;
                            i12 = 4;
                            i10 = 0;
                            break;
                        } else if (this.f10512i) {
                            this.f10471B = null;
                            I0 i02 = this.f10529y;
                            if (i02 == null || i02.t()) {
                                i13 = 0;
                            }
                            N0(l.CONFIGURING);
                            th = null;
                            i10 = i13;
                            i11 = 0;
                            i12 = i11;
                            jVar3 = th;
                        } else if (this.f10475F != null) {
                            th = null;
                            i10 = 0;
                            i11 = 0;
                            i12 = 0;
                            jVar2 = b0(this.f10515k);
                            jVar3 = th;
                        } else {
                            jVar3 = null;
                            th = null;
                            i10 = 0;
                            i11 = i10;
                            i12 = i11;
                        }
                        break;
                    case 2:
                        z10 = true;
                        if (this.f10499b0 != z0.a.INACTIVE) {
                        }
                        break;
                    case 3:
                        throw new AssertionError("Unexpected state on finalize of recording: " + this.f10515k);
                    case 4:
                    case 5:
                    case 6:
                        if (this.f10512i) {
                            this.f10471B = null;
                            I0 i03 = this.f10529y;
                            if (i03 == null || i03.t()) {
                                i13 = 0;
                            }
                            y0(l.CONFIGURING);
                            th = null;
                            i10 = i13;
                            z10 = false;
                            i11 = 0;
                            i12 = i11;
                            jVar3 = th;
                            break;
                        } else {
                            y0(l.IDLING);
                            jVar3 = null;
                            th = null;
                            z10 = false;
                            i10 = 0;
                            i11 = i10;
                            i12 = i11;
                        }
                        break;
                    case 7:
                        th = null;
                        i11 = 1;
                        z10 = false;
                        i10 = 0;
                        i12 = 0;
                        jVar3 = th;
                        break;
                    default:
                        jVar3 = null;
                        th = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        i12 = i11;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i10 != 0) {
            B(this.f10529y, this.f10530z, false);
            return;
        }
        if (i11 != 0) {
            q0();
            return;
        }
        if (jVar2 != null) {
            if (this.f10512i) {
                throw new AssertionError("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
            }
            F0(jVar2, z10);
        } else if (jVar3 != null) {
            D(jVar3, i12, th);
        }
    }

    private void h0() {
        boolean z10;
        I0 i02;
        synchronized (this.f10510h) {
            try {
                switch (this.f10515k.ordinal()) {
                    case 1:
                    case 2:
                        N0(l.CONFIGURING);
                        z10 = true;
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (N()) {
                            z10 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        y0(l.CONFIGURING);
                        z10 = true;
                        break;
                    default:
                        z10 = true;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f10503d0 = false;
        if (!z10 || (i02 = this.f10529y) == null || i02.t()) {
            return;
        }
        B(this.f10529y, this.f10530z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void S(I0 i02, e1 e1Var) {
        I0 i03 = this.f10529y;
        if (i03 != null && !i03.t()) {
            this.f10529y.G();
        }
        this.f10529y = i02;
        this.f10530z = e1Var;
        B(i02, e1Var, true);
    }

    private void l0(j jVar) {
        if (this.f10521q != jVar || this.f10522r) {
            return;
        }
        if (L()) {
            this.f10477H.pause();
        }
        this.f10475F.pause();
        j jVar2 = this.f10521q;
        jVar2.C(A0.d(jVar2.j(), F()));
    }

    private C1257u n0(Context context, AbstractC1255s abstractC1255s) {
        y0.f.h(abstractC1255s, "The OutputOptions cannot be null.");
        return new C1257u(context, this, abstractC1255s);
    }

    private void o0() {
        Y.n nVar = this.f10474E;
        if (nVar == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.f10474E = null;
        AbstractC0700h0.a("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(nVar.hashCode())));
        G.n.j(nVar.H(), new b(nVar), F.c.b());
    }

    private void q0() {
        if (this.f10477H != null) {
            AbstractC0700h0.a("Recorder", "Releasing audio encoder.");
            this.f10477H.a();
            this.f10477H = null;
            this.f10478I = null;
        }
        if (this.f10474E != null) {
            o0();
        }
        v0(h.INITIALIZING);
        r0();
    }

    private void r0() {
        if (this.f10475F != null) {
            AbstractC0700h0.a("Recorder", "Releasing video encoder.");
            J0();
        }
        h0();
    }

    private void s0() {
        if (f10460j0.contains(this.f10515k)) {
            y0(this.f10516l);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.f10515k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h8.d t0() {
        AbstractC0700h0.a("Recorder", "Try to safely release video encoder: " + this.f10475F);
        return this.f10505e0.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledFuture u0(final Runnable runnable, final Executor executor, long j10, TimeUnit timeUnit) {
        return F.c.e().schedule(new Runnable() { // from class: V.B
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(runnable);
            }
        }, j10, timeUnit);
    }

    private void z() {
        while (!this.f10494Y.isEmpty()) {
            this.f10494Y.a();
        }
    }

    private void z0(int i10) {
        if (this.f10517m == i10) {
            return;
        }
        AbstractC0700h0.a("Recorder", "Transitioning streamId: " + this.f10517m + " --> " + i10);
        this.f10517m = i10;
        this.f10496a.k(AbstractC1237a0.e(i10, K(this.f10515k), this.f10523s));
    }

    void A0(j jVar) {
        if (this.f10472C != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (L() && this.f10494Y.isEmpty()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        InterfaceC1698i interfaceC1698i = this.f10493X;
        if (interfaceC1698i == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.f10493X = null;
            List E10 = E(interfaceC1698i.C1());
            long size = interfaceC1698i.size();
            Iterator it = E10.iterator();
            while (it.hasNext()) {
                size += ((InterfaceC1698i) it.next()).size();
            }
            long j10 = this.f10489T;
            if (j10 != 0 && size > j10) {
                AbstractC0700h0.a("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f10489T)));
                f0(jVar, 2, null);
                interfaceC1698i.close();
                return;
            }
            try {
                r rVar = (r) G(this.f10473D);
                MediaMuxer y10 = jVar.y(rVar.c() == -1 ? I0(this.f10525u, r.g(f10464n0.c())) : r.g(rVar.c()), new InterfaceC5159a() { // from class: V.E
                    @Override // y0.InterfaceC5159a
                    public final void accept(Object obj) {
                        O.this.U((Uri) obj);
                    }
                });
                I0.h hVar = this.f10524t;
                if (hVar != null) {
                    w0(hVar);
                    y10.setOrientationHint(hVar.b());
                }
                Location c10 = jVar.j().c();
                if (c10 != null) {
                    try {
                        Pair a10 = AbstractC3066a.a(c10.getLatitude(), c10.getLongitude());
                        y10.setLocation((float) ((Double) a10.first).doubleValue(), (float) ((Double) a10.second).doubleValue());
                    } catch (IllegalArgumentException e10) {
                        y10.release();
                        f0(jVar, 5, e10);
                        interfaceC1698i.close();
                        return;
                    }
                }
                this.f10528x = Integer.valueOf(y10.addTrack(this.f10476G.a()));
                if (L()) {
                    this.f10527w = Integer.valueOf(y10.addTrack(this.f10478I.a()));
                }
                y10.start();
                this.f10472C = y10;
                P0(interfaceC1698i, jVar);
                Iterator it2 = E10.iterator();
                while (it2.hasNext()) {
                    O0((InterfaceC1698i) it2.next(), jVar);
                }
                interfaceC1698i.close();
            } catch (IOException e11) {
                f0(jVar, 5, e11);
                interfaceC1698i.close();
            }
        } catch (Throwable th) {
            if (interfaceC1698i != null) {
                try {
                    interfaceC1698i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    void C(int i10, Throwable th) {
        if (this.f10521q == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.f10472C;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.f10472C.release();
            } catch (IllegalStateException e10) {
                AbstractC0700h0.c("Recorder", "MediaMuxer failed to stop or release with error: " + e10.getMessage());
                if (i10 == 0) {
                    i10 = 1;
                }
            }
            this.f10472C = null;
        } else if (i10 == 0) {
            i10 = 8;
        }
        this.f10521q.d(this.f10480K);
        AbstractC1255s j10 = this.f10521q.j();
        Z F10 = F();
        AbstractC1256t b10 = AbstractC1256t.b(this.f10480K);
        this.f10521q.C(i10 == 0 ? A0.a(j10, F10, b10) : A0.b(j10, F10, b10, i10, th));
        j jVar = this.f10521q;
        this.f10521q = null;
        this.f10522r = false;
        this.f10527w = null;
        this.f10528x = null;
        this.f10526v.clear();
        this.f10480K = Uri.EMPTY;
        this.f10481L = 0L;
        this.f10482M = 0L;
        this.f10483N = Long.MAX_VALUE;
        this.f10486Q = Long.MAX_VALUE;
        this.f10487R = Long.MAX_VALUE;
        this.f10488S = Long.MAX_VALUE;
        this.f10491V = 1;
        this.f10492W = null;
        this.f10495Z = null;
        this.f10509g0 = 0.0d;
        z();
        w0(null);
        int ordinal = this.f10479J.ordinal();
        if (ordinal == 1) {
            throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
        }
        if (ordinal == 2 || ordinal == 3) {
            v0(h.IDLING);
            this.f10474E.Q();
        } else if (ordinal == 4 || ordinal == 5) {
            v0(h.INITIALIZING);
        }
        g0(jVar);
    }

    Y D0(C1257u c1257u) {
        long j10;
        j jVar;
        int i10;
        j jVar2;
        y0.f.h(c1257u, "The given PendingRecording cannot be null.");
        synchronized (this.f10510h) {
            try {
                j10 = this.f10520p + 1;
                this.f10520p = j10;
                jVar = null;
                i10 = 0;
                switch (this.f10515k) {
                    case CONFIGURING:
                    case IDLING:
                    case STOPPING:
                    case RESETTING:
                    case ERROR:
                        l lVar = this.f10515k;
                        l lVar2 = l.IDLING;
                        if (lVar == lVar2) {
                            y0.f.j(this.f10518n == null && this.f10519o == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            j f10 = j.f(c1257u, j10);
                            f10.p(c1257u.a());
                            this.f10519o = f10;
                            l lVar3 = this.f10515k;
                            if (lVar3 == lVar2) {
                                y0(l.PENDING_RECORDING);
                                this.f10504e.execute(new Runnable() { // from class: V.F
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        O.this.K0();
                                    }
                                });
                            } else if (lVar3 == l.ERROR) {
                                y0(l.PENDING_RECORDING);
                                this.f10504e.execute(new Runnable() { // from class: V.G
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        O.this.V();
                                    }
                                });
                            } else {
                                y0(l.PENDING_RECORDING);
                            }
                            e = null;
                            break;
                        } catch (IOException e10) {
                            e = e10;
                            i10 = 5;
                            break;
                        }
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        jVar2 = (j) y0.f.g(this.f10519o);
                        jVar = jVar2;
                        e = null;
                        break;
                    case RECORDING:
                    case PAUSED:
                        jVar2 = this.f10518n;
                        jVar = jVar2;
                        e = null;
                        break;
                    default:
                        e = null;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i10 == 0) {
            return Y.b(c1257u, j10);
        }
        AbstractC0700h0.c("Recorder", "Recording was started when the Recorder had encountered error " + e);
        D(j.f(c1257u, j10), i10, e);
        return Y.a(c1257u, j10);
    }

    Z F() {
        return Z.d(this.f10482M, this.f10481L, AbstractC1238b.d(J(this.f10479J), this.f10495Z, this.f10509g0));
    }

    Object G(Y0 y02) {
        try {
            return y02.c().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    void G0(Y y10, final int i10, final Throwable th) {
        synchronized (this.f10510h) {
            try {
                if (!O(y10, this.f10519o) && !O(y10, this.f10518n)) {
                    AbstractC0700h0.a("Recorder", "stop() called on a recording that is no longer active: " + y10.c());
                    return;
                }
                j jVar = null;
                switch (this.f10515k) {
                    case CONFIGURING:
                    case IDLING:
                        throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        y0.f.i(O(y10, this.f10519o));
                        j jVar2 = this.f10519o;
                        this.f10519o = null;
                        s0();
                        jVar = jVar2;
                        break;
                    case RECORDING:
                    case PAUSED:
                        y0(l.STOPPING);
                        final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                        final j jVar3 = this.f10518n;
                        this.f10504e.execute(new Runnable() { // from class: V.J
                            @Override // java.lang.Runnable
                            public final void run() {
                                O.this.W(jVar3, micros, i10, th);
                            }
                        });
                        break;
                    case STOPPING:
                    case RESETTING:
                        y0.f.i(O(y10, this.f10518n));
                        break;
                }
                if (jVar != null) {
                    if (i10 == 10) {
                        AbstractC0700h0.c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                    }
                    D(jVar, 8, new RuntimeException("Recording was stopped before any data could be produced.", th));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public void W(j jVar, long j10, int i10, Throwable th) {
        if (this.f10521q != jVar || this.f10522r) {
            return;
        }
        this.f10522r = true;
        this.f10491V = i10;
        this.f10492W = th;
        if (L()) {
            z();
            this.f10477H.b(j10);
        }
        InterfaceC1698i interfaceC1698i = this.f10493X;
        if (interfaceC1698i != null) {
            interfaceC1698i.close();
            this.f10493X = null;
        }
        if (this.f10499b0 != z0.a.ACTIVE_NON_STREAMING) {
            final InterfaceC1701l interfaceC1701l = this.f10475F;
            this.f10501c0 = u0(new Runnable() { // from class: V.M
                @Override // java.lang.Runnable
                public final void run() {
                    O.X(InterfaceC1701l.this);
                }
            }, this.f10504e, 1000L, TimeUnit.MILLISECONDS);
        } else {
            c0(this.f10475F);
        }
        this.f10475F.b(j10);
    }

    void K0() {
        boolean z10;
        j jVar;
        int i10;
        j jVar2;
        Throwable th;
        synchronized (this.f10510h) {
            try {
                int ordinal = this.f10515k.ordinal();
                boolean z11 = true;
                z10 = false;
                jVar = null;
                if (ordinal == 1) {
                    z11 = false;
                } else if (ordinal != 2) {
                    i10 = 0;
                    jVar2 = null;
                    th = jVar2;
                }
                if (this.f10518n == null && !this.f10503d0) {
                    if (this.f10499b0 == z0.a.INACTIVE) {
                        jVar2 = this.f10519o;
                        this.f10519o = null;
                        s0();
                        i10 = 4;
                        z10 = z11;
                        th = f10465o0;
                    } else if (this.f10475F != null) {
                        i10 = 0;
                        z10 = z11;
                        th = null;
                        jVar = b0(this.f10515k);
                        jVar2 = null;
                    }
                }
                i10 = 0;
                jVar2 = null;
                z10 = z11;
                th = jVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jVar != null) {
            F0(jVar, z10);
        } else if (jVar2 != null) {
            D(jVar2, i10, th);
        }
    }

    boolean L() {
        return this.f10479J == h.ENABLED;
    }

    boolean M() {
        return ((r) G(this.f10473D)).b().c() != 0;
    }

    void M0() {
        j jVar = this.f10521q;
        if (jVar != null) {
            jVar.C(A0.g(jVar.j(), F()));
        }
    }

    boolean N() {
        j jVar = this.f10521q;
        return jVar != null && jVar.r();
    }

    void O0(InterfaceC1698i interfaceC1698i, j jVar) {
        long size = this.f10481L + interfaceC1698i.size();
        long j10 = this.f10489T;
        if (j10 != 0 && size > j10) {
            AbstractC0700h0.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f10489T)));
            f0(jVar, 2, null);
            return;
        }
        long C12 = interfaceC1698i.C1();
        long j11 = this.f10486Q;
        if (j11 == Long.MAX_VALUE) {
            this.f10486Q = C12;
            AbstractC0700h0.a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(C12), X.d.c(this.f10486Q)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(C12 - Math.min(this.f10483N, j11));
            y0.f.j(this.f10488S != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + timeUnit.toNanos(C12 - this.f10488S);
            long j12 = this.f10490U;
            if (j12 != 0 && nanos2 > j12) {
                AbstractC0700h0.a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f10490U)));
                f0(jVar, 9, null);
                return;
            }
        }
        this.f10472C.writeSampleData(this.f10527w.intValue(), interfaceC1698i.h(), interfaceC1698i.E0());
        this.f10481L = size;
        this.f10488S = C12;
    }

    void P0(InterfaceC1698i interfaceC1698i, j jVar) {
        if (this.f10528x == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = this.f10481L + interfaceC1698i.size();
        long j10 = this.f10489T;
        long j11 = 0;
        if (j10 != 0 && size > j10) {
            AbstractC0700h0.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f10489T)));
            f0(jVar, 2, null);
            return;
        }
        long C12 = interfaceC1698i.C1();
        long j12 = this.f10483N;
        if (j12 == Long.MAX_VALUE) {
            this.f10483N = C12;
            AbstractC0700h0.a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(C12), X.d.c(this.f10483N)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(C12 - Math.min(j12, this.f10486Q));
            y0.f.j(this.f10487R != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(C12 - this.f10487R) + nanos;
            long j13 = this.f10490U;
            if (j13 != 0 && nanos2 > j13) {
                AbstractC0700h0.a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f10490U)));
                f0(jVar, 9, null);
                return;
            }
            j11 = nanos;
        }
        this.f10472C.writeSampleData(this.f10528x.intValue(), interfaceC1698i.h(), interfaceC1698i.E0());
        this.f10481L = size;
        this.f10482M = j11;
        this.f10487R = C12;
        M0();
    }

    @Override // V.z0
    public void a(I0 i02) {
        e(i02, e1.UPTIME);
    }

    @Override // V.z0
    public InterfaceC1239b0 b(InterfaceC0713p interfaceC0713p) {
        return I(interfaceC0713p, this.f10514j);
    }

    @Override // V.z0
    public void c(final z0.a aVar) {
        this.f10504e.execute(new Runnable() { // from class: V.N
            @Override // java.lang.Runnable
            public final void run() {
                O.this.R(aVar);
            }
        });
    }

    @Override // V.z0
    public E0 d() {
        return this.f10473D;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:5:0x000c, B:9:0x0089, B:26:0x0011, B:27:0x001d, B:30:0x0023, B:31:0x002a, B:33:0x002e, B:35:0x003c, B:36:0x0054, B:38:0x0058, B:41:0x0061, B:43:0x0067, B:44:0x0073, B:46:0x007f), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void d0() {
        j jVar;
        boolean z10;
        Exception exc;
        int i10;
        int i11;
        j jVar2;
        synchronized (this.f10510h) {
            try {
                jVar = null;
                switch (this.f10515k) {
                    case CONFIGURING:
                        y0(l.IDLING);
                        jVar2 = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        break;
                    case PENDING_RECORDING:
                        z10 = false;
                        if (this.f10518n == null) {
                            jVar2 = null;
                            exc = null;
                            i10 = 0;
                            i11 = i10;
                            break;
                        } else if (this.f10499b0 == z0.a.INACTIVE) {
                            jVar2 = this.f10519o;
                            this.f10519o = null;
                            s0();
                            exc = f10465o0;
                            i10 = 4;
                            i11 = 0;
                        } else {
                            exc = null;
                            i10 = 0;
                            i11 = 0;
                            jVar = b0(this.f10515k);
                            jVar2 = null;
                        }
                    case PENDING_PAUSED:
                        z10 = true;
                        if (this.f10518n == null) {
                        }
                        break;
                    case IDLING:
                    case RESETTING:
                        throw new AssertionError("Incorrectly invoke onConfigured() in state " + this.f10515k);
                    case RECORDING:
                        z10 = false;
                        y0.f.j(N(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        i11 = 1;
                        jVar2 = null;
                        exc = null;
                        i10 = 0;
                        break;
                    case PAUSED:
                        z10 = true;
                        y0.f.j(N(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        i11 = 1;
                        jVar2 = null;
                        exc = null;
                        i10 = 0;
                        break;
                    case STOPPING:
                        if (!this.f10512i) {
                            throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                        }
                        jVar2 = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        break;
                    case ERROR:
                        AbstractC0700h0.c("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
                        jVar2 = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        break;
                    default:
                        jVar2 = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i11 == 0) {
            if (jVar != null) {
                F0(jVar, z10);
                return;
            } else {
                if (jVar2 != null) {
                    D(jVar2, i10, exc);
                    return;
                }
                return;
            }
        }
        L0(this.f10521q, true);
        this.f10475F.start();
        if (this.f10511h0) {
            j jVar3 = this.f10521q;
            jVar3.C(A0.e(jVar3.j(), F()));
            this.f10511h0 = false;
        }
        if (z10) {
            this.f10475F.pause();
        }
    }

    @Override // V.z0
    public void e(final I0 i02, final e1 e1Var) {
        synchronized (this.f10510h) {
            try {
                AbstractC0700h0.a("Recorder", "Surface is requested in state: " + this.f10515k + ", Current surface: " + this.f10517m);
                if (this.f10515k == l.ERROR) {
                    y0(l.CONFIGURING);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f10504e.execute(new Runnable() { // from class: V.D
            @Override // java.lang.Runnable
            public final void run() {
                O.this.S(i02, e1Var);
            }
        });
    }

    void e0(Throwable th) {
        j jVar;
        synchronized (this.f10510h) {
            try {
                jVar = null;
                switch (this.f10515k) {
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        j jVar2 = this.f10519o;
                        this.f10519o = null;
                        jVar = jVar2;
                    case CONFIGURING:
                        z0(-1);
                        y0(l.ERROR);
                        break;
                    case IDLING:
                    case RECORDING:
                    case PAUSED:
                    case STOPPING:
                    case RESETTING:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f10515k + ": " + th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jVar != null) {
            D(jVar, 7, th);
        }
    }

    @Override // V.z0
    public E0 f() {
        return this.f10496a;
    }

    void f0(j jVar, int i10, Throwable th) {
        boolean z10;
        if (jVar != this.f10521q) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.f10510h) {
            try {
                z10 = false;
                switch (this.f10515k) {
                    case CONFIGURING:
                    case IDLING:
                    case ERROR:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f10515k);
                    case RECORDING:
                    case PAUSED:
                        y0(l.STOPPING);
                        z10 = true;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                    case STOPPING:
                    case RESETTING:
                        if (jVar != this.f10518n) {
                            throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                        }
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            W(jVar, -1L, i10, th);
        }
    }

    @Override // V.z0
    public E0 g() {
        return this.f10498b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void R(z0.a aVar) {
        ScheduledFuture scheduledFuture;
        InterfaceC1701l interfaceC1701l;
        z0.a aVar2 = this.f10499b0;
        this.f10499b0 = aVar;
        if (aVar2 == aVar) {
            AbstractC0700h0.a("Recorder", "Video source transitions to the same state: " + aVar);
            return;
        }
        AbstractC0700h0.a("Recorder", "Video source has transitioned to state: " + aVar);
        if (aVar != z0.a.INACTIVE) {
            if (aVar != z0.a.ACTIVE_NON_STREAMING || (scheduledFuture = this.f10501c0) == null || !scheduledFuture.cancel(false) || (interfaceC1701l = this.f10475F) == null) {
                return;
            }
            c0(interfaceC1701l);
            return;
        }
        if (this.f10471B == null) {
            k kVar = this.f10513i0;
            if (kVar != null) {
                kVar.j();
                this.f10513i0 = null;
            }
            p0(4, null, false);
            return;
        }
        this.f10503d0 = true;
        j jVar = this.f10521q;
        if (jVar == null || jVar.r()) {
            return;
        }
        f0(this.f10521q, 4, null);
    }

    void k0(y0 y0Var) {
        InterfaceC1701l m10 = y0Var.m();
        this.f10475F = m10;
        this.f10485P = ((c0.r0) m10.d()).c();
        this.f10484O = this.f10475F.h();
        Surface k10 = y0Var.k();
        this.f10471B = k10;
        x0(k10);
        y0Var.v(this.f10504e, new InterfaceC1701l.c.a() { // from class: V.C
            @Override // c0.InterfaceC1701l.c.a
            public final void a(Surface surface) {
                O.this.x0(surface);
            }
        });
        G.n.j(y0Var.l(), new a(y0Var), this.f10504e);
    }

    public C1257u m0(Context context, C1254q c1254q) {
        return n0(context, c1254q);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    void p0(int i10, Throwable th, boolean z10) {
        boolean z11;
        boolean z12;
        synchronized (this.f10510h) {
            try {
                z11 = true;
                z12 = false;
                switch (this.f10515k) {
                    case CONFIGURING:
                    case IDLING:
                    case ERROR:
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        N0(l.RESETTING);
                        break;
                    case RECORDING:
                    case PAUSED:
                        y0.f.j(this.f10521q != null, "In-progress recording shouldn't be null when in state " + this.f10515k);
                        if (this.f10518n != this.f10521q) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!N()) {
                            y0(l.RESETTING);
                            z12 = true;
                            z11 = false;
                        }
                        break;
                    case STOPPING:
                        y0(l.RESETTING);
                        z11 = false;
                        break;
                    case RESETTING:
                    default:
                        z11 = false;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z11) {
            if (z12) {
                W(this.f10521q, -1L, i10, th);
            }
        } else if (z10) {
            r0();
        } else {
            q0();
        }
    }

    void v0(h hVar) {
        AbstractC0700h0.a("Recorder", "Transitioning audio state: " + this.f10479J + " --> " + hVar);
        this.f10479J = hVar;
    }

    void w0(I0.h hVar) {
        AbstractC0700h0.a("Recorder", "Update stream transformation info: " + hVar);
        this.f10523s = hVar;
        synchronized (this.f10510h) {
            this.f10496a.k(AbstractC1237a0.e(this.f10517m, K(this.f10515k), hVar));
        }
    }

    void x0(Surface surface) {
        int hashCode;
        if (this.f10470A == surface) {
            return;
        }
        this.f10470A = surface;
        synchronized (this.f10510h) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                hashCode = 0;
            }
            z0(hashCode);
        }
    }

    void y0(l lVar) {
        if (this.f10515k == lVar) {
            throw new AssertionError("Attempted to transition to state " + lVar + ", but Recorder is already in state " + lVar);
        }
        AbstractC0700h0.a("Recorder", "Transitioning Recorder internal state: " + this.f10515k + " --> " + lVar);
        Set set = f10460j0;
        AbstractC1237a0.a aVar = null;
        if (set.contains(lVar)) {
            if (!set.contains(this.f10515k)) {
                if (!f10461k0.contains(this.f10515k)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f10515k);
                }
                l lVar2 = this.f10515k;
                this.f10516l = lVar2;
                aVar = K(lVar2);
            }
        } else if (this.f10516l != null) {
            this.f10516l = null;
        }
        this.f10515k = lVar;
        if (aVar == null) {
            aVar = K(lVar);
        }
        this.f10496a.k(AbstractC1237a0.e(this.f10517m, aVar, this.f10523s));
    }

    class c implements InterfaceC1702m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f10535b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f10536c;

        c(c.a aVar, j jVar) {
            this.f10535b = aVar;
            this.f10536c = jVar;
        }

        @Override // c0.InterfaceC1702m
        public void b(InterfaceC1698i interfaceC1698i) {
            boolean z10;
            O o10 = O.this;
            if (o10.f10472C != null) {
                try {
                    o10.P0(interfaceC1698i, this.f10536c);
                    if (interfaceC1698i != null) {
                        interfaceC1698i.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (interfaceC1698i != null) {
                        try {
                            interfaceC1698i.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (o10.f10522r) {
                AbstractC0700h0.a("Recorder", "Drop video data since recording is stopping.");
                interfaceC1698i.close();
                return;
            }
            InterfaceC1698i interfaceC1698i2 = o10.f10493X;
            if (interfaceC1698i2 != null) {
                interfaceC1698i2.close();
                O.this.f10493X = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (!interfaceC1698i.M0()) {
                if (z10) {
                    AbstractC0700h0.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                AbstractC0700h0.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                O.this.f10475F.g();
                interfaceC1698i.close();
                return;
            }
            O o11 = O.this;
            o11.f10493X = interfaceC1698i;
            if (!o11.L() || !O.this.f10494Y.isEmpty()) {
                AbstractC0700h0.a("Recorder", "Received video keyframe. Starting muxer...");
                O.this.A0(this.f10536c);
            } else if (z10) {
                AbstractC0700h0.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
            } else {
                AbstractC0700h0.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
            }
        }

        @Override // c0.InterfaceC1702m
        public void c(c0.l0 l0Var) {
            O.this.f10476G = l0Var;
        }

        @Override // c0.InterfaceC1702m
        public void d() {
            this.f10535b.c(null);
        }

        @Override // c0.InterfaceC1702m
        public void e(C1697h c1697h) {
            this.f10535b.f(c1697h);
        }

        @Override // c0.InterfaceC1702m
        public void a() {
        }
    }

    class e implements InterfaceC1702m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f10540b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5159a f10541c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f10542d;

        e(c.a aVar, InterfaceC5159a interfaceC5159a, j jVar) {
            this.f10540b = aVar;
            this.f10541c = interfaceC5159a;
            this.f10542d = jVar;
        }

        @Override // c0.InterfaceC1702m
        public void b(InterfaceC1698i interfaceC1698i) {
            O o10 = O.this;
            if (o10.f10479J == h.DISABLED) {
                interfaceC1698i.close();
                throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
            }
            if (o10.f10472C == null) {
                if (o10.f10522r) {
                    AbstractC0700h0.a("Recorder", "Drop audio data since recording is stopping.");
                } else {
                    o10.f10494Y.b(new C1696g(interfaceC1698i));
                    if (O.this.f10493X != null) {
                        AbstractC0700h0.a("Recorder", "Received audio data. Starting muxer...");
                        O.this.A0(this.f10542d);
                    } else {
                        AbstractC0700h0.a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                    }
                }
                interfaceC1698i.close();
                return;
            }
            try {
                o10.O0(interfaceC1698i, this.f10542d);
                if (interfaceC1698i != null) {
                    interfaceC1698i.close();
                }
            } catch (Throwable th) {
                if (interfaceC1698i != null) {
                    try {
                        interfaceC1698i.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // c0.InterfaceC1702m
        public void c(c0.l0 l0Var) {
            O.this.f10478I = l0Var;
        }

        @Override // c0.InterfaceC1702m
        public void d() {
            this.f10540b.c(null);
        }

        @Override // c0.InterfaceC1702m
        public void e(C1697h c1697h) {
            if (O.this.f10495Z == null) {
                this.f10541c.accept(c1697h);
            }
        }

        @Override // c0.InterfaceC1702m
        public void a() {
        }
    }

    static abstract class j implements AutoCloseable {

        /* renamed from: a, reason: collision with root package name */
        private final E.d f10551a = E.d.b();

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f10552b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        private final AtomicReference f10553c = new AtomicReference(null);

        /* renamed from: d, reason: collision with root package name */
        private final AtomicReference f10554d = new AtomicReference(null);

        /* renamed from: e, reason: collision with root package name */
        private final AtomicReference f10555e = new AtomicReference(new InterfaceC5159a() { // from class: V.T
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                O.j.t((Uri) obj);
            }
        });

        /* renamed from: f, reason: collision with root package name */
        private final AtomicBoolean f10556f = new AtomicBoolean(false);

        /* renamed from: g, reason: collision with root package name */
        private final C0 f10557g = C0.l(Boolean.FALSE);

        class a implements c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f10558a;

            a(Context context) {
                this.f10558a = context;
            }

            @Override // V.O.j.c
            public Y.n a(AbstractC1305a abstractC1305a, Executor executor) {
                return new Y.n(abstractC1305a, executor, this.f10558a);
            }
        }

        class b implements c {
            b() {
            }

            @Override // V.O.j.c
            public Y.n a(AbstractC1305a abstractC1305a, Executor executor) {
                return new Y.n(abstractC1305a, executor, null);
            }
        }

        private interface c {
            Y.n a(AbstractC1305a abstractC1305a, Executor executor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        interface d {
            MediaMuxer a(int i10, InterfaceC5159a interfaceC5159a);
        }

        j() {
        }

        private void e(InterfaceC5159a interfaceC5159a, Uri uri) {
            if (interfaceC5159a != null) {
                this.f10551a.a();
                interfaceC5159a.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        static j f(C1257u c1257u, long j10) {
            return new C1248k(c1257u.d(), c1257u.c(), c1257u.b(), c1257u.f(), c1257u.g(), j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaMuxer s(AbstractC1255s abstractC1255s, ParcelFileDescriptor parcelFileDescriptor, int i10, InterfaceC5159a interfaceC5159a) {
            Uri uri = Uri.EMPTY;
            if (!(abstractC1255s instanceof C1254q)) {
                throw new AssertionError("Invalid output options type: " + abstractC1255s.getClass().getSimpleName());
            }
            File d10 = ((C1254q) abstractC1255s).d();
            if (!d0.d.a(d10)) {
                AbstractC0700h0.l("Recorder", "Failed to create folder for " + d10.getAbsolutePath());
            }
            MediaMuxer mediaMuxer = new MediaMuxer(d10.getAbsolutePath(), i10);
            interfaceC5159a.accept(Uri.fromFile(d10));
            return mediaMuxer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(A0 a02) {
            i().accept(a02);
        }

        private void z(A0 a02) {
            if ((a02 instanceof A0.d) || (a02 instanceof A0.c)) {
                this.f10557g.k(Boolean.TRUE);
            } else if ((a02 instanceof A0.b) || (a02 instanceof A0.a)) {
                this.f10557g.k(Boolean.FALSE);
            }
        }

        void C(final A0 a02) {
            if (!Objects.equals(a02.c(), j())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + a02.c() + ", Expected: " + j() + "]");
            }
            String str = "Sending VideoRecordEvent " + a02.getClass().getSimpleName();
            if (a02 instanceof A0.a) {
                A0.a aVar = (A0.a) a02;
                if (aVar.l()) {
                    str = str + String.format(" [error: %s]", A0.a.h(aVar.j()));
                }
            }
            AbstractC0700h0.a("Recorder", str);
            z(a02);
            if (g() == null || i() == null) {
                return;
            }
            try {
                g().execute(new Runnable() { // from class: V.U
                    @Override // java.lang.Runnable
                    public final void run() {
                        O.j.this.u(a02);
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC0700h0.d("Recorder", "The callback executor is invalid.", e10);
            }
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            d(Uri.EMPTY);
        }

        void d(Uri uri) {
            if (this.f10552b.get()) {
                e((InterfaceC5159a) this.f10555e.getAndSet(null), uri);
            }
        }

        protected void finalize() {
            try {
                this.f10551a.d();
                InterfaceC5159a interfaceC5159a = (InterfaceC5159a) this.f10555e.getAndSet(null);
                if (interfaceC5159a != null) {
                    e(interfaceC5159a, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        abstract Executor g();

        abstract InterfaceC5159a i();

        abstract AbstractC1255s j();

        abstract long l();

        Y0 n() {
            return this.f10557g;
        }

        abstract boolean o();

        void p(Context context) {
            if (this.f10552b.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            final AbstractC1255s j10 = j();
            this.f10551a.c("finalizeRecording");
            final ParcelFileDescriptor parcelFileDescriptor = null;
            this.f10553c.set(new d() { // from class: V.S
                @Override // V.O.j.d
                public final MediaMuxer a(int i10, InterfaceC5159a interfaceC5159a) {
                    MediaMuxer s10;
                    s10 = O.j.s(AbstractC1255s.this, parcelFileDescriptor, i10, interfaceC5159a);
                    return s10;
                }
            });
            if (o()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.f10554d.set(new a(context));
                } else {
                    this.f10554d.set(new b());
                }
            }
        }

        boolean q() {
            return this.f10556f.get();
        }

        abstract boolean r();

        Y.n x(AbstractC1305a abstractC1305a, Executor executor) {
            if (!o()) {
                throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
            }
            c cVar = (c) this.f10554d.getAndSet(null);
            if (cVar != null) {
                return cVar.a(abstractC1305a, executor);
            }
            throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
        }

        MediaMuxer y(int i10, InterfaceC5159a interfaceC5159a) {
            if (!this.f10552b.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            d dVar = (d) this.f10553c.getAndSet(null);
            if (dVar == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            try {
                return dVar.a(i10, interfaceC5159a);
            } catch (RuntimeException e10) {
                throw new IOException("Failed to create MediaMuxer by " + e10, e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void t(Uri uri) {
        }
    }
}
