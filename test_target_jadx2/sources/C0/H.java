package c0;

import A.AbstractC0700h0;
import X.c;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.e1;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.concurrent.futures.c;
import c0.H;
import c0.InterfaceC1701l;
import d0.AbstractC2970a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class H implements InterfaceC1701l {

    /* renamed from: E, reason: collision with root package name */
    private static final Range f19104E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: D, reason: collision with root package name */
    private Future f19108D;

    /* renamed from: a, reason: collision with root package name */
    final String f19109a;

    /* renamed from: c, reason: collision with root package name */
    final boolean f19111c;

    /* renamed from: d, reason: collision with root package name */
    private final MediaFormat f19112d;

    /* renamed from: e, reason: collision with root package name */
    final MediaCodec f19113e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC1701l.b f19114f;

    /* renamed from: g, reason: collision with root package name */
    private final f0 f19115g;

    /* renamed from: h, reason: collision with root package name */
    final Executor f19116h;

    /* renamed from: i, reason: collision with root package name */
    private final h8.d f19117i;

    /* renamed from: j, reason: collision with root package name */
    private final c.a f19118j;

    /* renamed from: p, reason: collision with root package name */
    final e1 f19124p;

    /* renamed from: t, reason: collision with root package name */
    d f19128t;

    /* renamed from: b, reason: collision with root package name */
    final Object f19110b = new Object();

    /* renamed from: k, reason: collision with root package name */
    final Queue f19119k = new ArrayDeque();

    /* renamed from: l, reason: collision with root package name */
    private final Queue f19120l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    private final Set f19121m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    final Set f19122n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    final Deque f19123o = new ArrayDeque();

    /* renamed from: q, reason: collision with root package name */
    final o0 f19125q = new n0();

    /* renamed from: r, reason: collision with root package name */
    InterfaceC1702m f19126r = InterfaceC1702m.f19261a;

    /* renamed from: s, reason: collision with root package name */
    Executor f19127s = F.c.b();

    /* renamed from: u, reason: collision with root package name */
    Range f19129u = f19104E;

    /* renamed from: v, reason: collision with root package name */
    long f19130v = 0;

    /* renamed from: w, reason: collision with root package name */
    boolean f19131w = false;

    /* renamed from: x, reason: collision with root package name */
    Long f19132x = null;

    /* renamed from: y, reason: collision with root package name */
    Future f19133y = null;

    /* renamed from: z, reason: collision with root package name */
    private e f19134z = null;

    /* renamed from: A, reason: collision with root package name */
    private boolean f19105A = false;

    /* renamed from: B, reason: collision with root package name */
    private boolean f19106B = false;

    /* renamed from: C, reason: collision with root package name */
    boolean f19107C = false;

    private static class b {
        static Surface a() {
            return MediaCodec.createPersistentInputSurface();
        }

        static void b(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    class c implements InterfaceC1701l.a {

        /* renamed from: a, reason: collision with root package name */
        private final Map f19137a = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        private c.a f19138b = c.a.INACTIVE;

        /* renamed from: c, reason: collision with root package name */
        private final List f19139c = new ArrayList();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void q(h8.d dVar) {
            if (dVar.cancel(true)) {
                return;
            }
            y0.f.i(dVar.isDone());
            try {
                ((h0) dVar.get()).cancel();
            } catch (InterruptedException | CancellationException | ExecutionException e10) {
                AbstractC0700h0.l(H.this.f19109a, "Unable to cancel the input buffer: " + e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(h8.d dVar) {
            this.f19139c.remove(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(c.a aVar) {
            c.a aVar2 = this.f19138b;
            if (aVar2 == c.a.ACTIVE) {
                final h8.d C10 = H.this.C();
                G.n.C(C10, aVar);
                aVar.a(new Runnable() { // from class: c0.Q
                    @Override // java.lang.Runnable
                    public final void run() {
                        H.c.this.q(C10);
                    }
                }, F.c.b());
                this.f19139c.add(C10);
                C10.e(new Runnable() { // from class: c0.S
                    @Override // java.lang.Runnable
                    public final void run() {
                        H.c.this.r(C10);
                    }
                }, H.this.f19116h);
                return;
            }
            if (aVar2 == c.a.INACTIVE) {
                aVar.f(new IllegalStateException("BufferProvider is not active."));
                return;
            }
            aVar.f(new IllegalStateException("Unknown state: " + this.f19138b));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object t(final c.a aVar) {
            H.this.f19116h.execute(new Runnable() { // from class: c0.P
                @Override // java.lang.Runnable
                public final void run() {
                    H.c.this.s(aVar);
                }
            });
            return "acquireBuffer";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(final E0.a aVar, Executor executor) {
            this.f19137a.put((E0.a) y0.f.g(aVar), (Executor) y0.f.g(executor));
            final c.a aVar2 = this.f19138b;
            executor.execute(new Runnable() { // from class: c0.N
                @Override // java.lang.Runnable
                public final void run() {
                    E0.a.this.a(aVar2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(c.a aVar) {
            aVar.c(this.f19138b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object x(final c.a aVar) {
            H.this.f19116h.execute(new Runnable() { // from class: c0.M
                @Override // java.lang.Runnable
                public final void run() {
                    H.c.this.w(aVar);
                }
            });
            return "fetchData";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(E0.a aVar) {
            this.f19137a.remove(y0.f.g(aVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void z(Map.Entry entry, c.a aVar) {
            ((E0.a) entry.getKey()).a(aVar);
        }

        void A(boolean z10) {
            final c.a aVar = z10 ? c.a.ACTIVE : c.a.INACTIVE;
            if (this.f19138b == aVar) {
                return;
            }
            this.f19138b = aVar;
            if (aVar == c.a.INACTIVE) {
                Iterator it = this.f19139c.iterator();
                while (it.hasNext()) {
                    ((h8.d) it.next()).cancel(true);
                }
                this.f19139c.clear();
            }
            for (final Map.Entry entry : this.f19137a.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: c0.K
                        @Override // java.lang.Runnable
                        public final void run() {
                            H.c.z(entry, aVar);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    AbstractC0700h0.d(H.this.f19109a, "Unable to post to the supplied executor.", e10);
                }
            }
        }

        @Override // androidx.camera.core.impl.E0
        public void a(final E0.a aVar) {
            H.this.f19116h.execute(new Runnable() { // from class: c0.O
                @Override // java.lang.Runnable
                public final void run() {
                    H.c.this.y(aVar);
                }
            });
        }

        @Override // X.c
        public h8.d b() {
            return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: c0.L
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object t10;
                    t10 = H.c.this.t(aVar);
                    return t10;
                }
            });
        }

        @Override // androidx.camera.core.impl.E0
        public h8.d c() {
            return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: c0.J
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object x10;
                    x10 = H.c.this.x(aVar);
                    return x10;
                }
            });
        }

        @Override // androidx.camera.core.impl.E0
        public void e(final Executor executor, final E0.a aVar) {
            H.this.f19116h.execute(new Runnable() { // from class: c0.I
                @Override // java.lang.Runnable
                public final void run() {
                    H.c.this.v(aVar, executor);
                }
            });
        }
    }

    enum d {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    class f implements InterfaceC1701l.c {

        /* renamed from: b, reason: collision with root package name */
        private Surface f19155b;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC1701l.c.a f19157d;

        /* renamed from: e, reason: collision with root package name */
        private Executor f19158e;

        /* renamed from: a, reason: collision with root package name */
        private final Object f19154a = new Object();

        /* renamed from: c, reason: collision with root package name */
        private final Set f19156c = new HashSet();

        f() {
        }

        private void c(Executor executor, final InterfaceC1701l.c.a aVar, final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: c0.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1701l.c.a.this.a(surface);
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC0700h0.d(H.this.f19109a, "Unable to post to the supplied executor.", e10);
            }
        }

        @Override // c0.InterfaceC1701l.c
        public void d(Executor executor, InterfaceC1701l.c.a aVar) {
            Surface surface;
            synchronized (this.f19154a) {
                this.f19157d = (InterfaceC1701l.c.a) y0.f.g(aVar);
                this.f19158e = (Executor) y0.f.g(executor);
                surface = this.f19155b;
            }
            if (surface != null) {
                c(executor, aVar, surface);
            }
        }

        void e() {
            Surface surface;
            HashSet hashSet;
            synchronized (this.f19154a) {
                surface = this.f19155b;
                this.f19155b = null;
                hashSet = new HashSet(this.f19156c);
                this.f19156c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }

        void f() {
            Surface createInputSurface;
            InterfaceC1701l.c.a aVar;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) androidx.camera.video.internal.compat.quirk.a.b(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.f19154a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (this.f19155b == null) {
                            createInputSurface = b.a();
                            this.f19155b = createInputSurface;
                        } else {
                            createInputSurface = null;
                        }
                        b.b(H.this.f19113e, this.f19155b);
                    } else {
                        Surface surface = this.f19155b;
                        if (surface != null) {
                            this.f19156c.add(surface);
                        }
                        createInputSurface = H.this.f19113e.createInputSurface();
                        this.f19155b = createInputSurface;
                    }
                    aVar = this.f19157d;
                    executor = this.f19158e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (createInputSurface == null || aVar == null || executor == null) {
                return;
            }
            c(executor, aVar, createInputSurface);
        }
    }

    public H(Executor executor, InterfaceC1703n interfaceC1703n) {
        y0.f.g(executor);
        y0.f.g(interfaceC1703n);
        MediaCodec a10 = AbstractC2970a.a(interfaceC1703n);
        this.f19113e = a10;
        MediaCodecInfo codecInfo = a10.getCodecInfo();
        this.f19116h = F.c.g(executor);
        MediaFormat a11 = interfaceC1703n.a();
        this.f19112d = a11;
        e1 b10 = interfaceC1703n.b();
        this.f19124p = b10;
        if (interfaceC1703n instanceof AbstractC1690a) {
            this.f19109a = "AudioEncoder";
            this.f19111c = false;
            this.f19114f = new c();
            this.f19115g = new C1691b(codecInfo, interfaceC1703n.c());
        } else {
            if (!(interfaceC1703n instanceof p0)) {
                throw new k0("Unknown encoder config type");
            }
            this.f19109a = "VideoEncoder";
            this.f19111c = true;
            this.f19114f = new f();
            t0 t0Var = new t0(codecInfo, interfaceC1703n.c());
            E(t0Var, a11);
            this.f19115g = t0Var;
        }
        AbstractC0700h0.a(this.f19109a, "mInputTimebase = " + b10);
        AbstractC0700h0.a(this.f19109a, "mMediaFormat = " + a11);
        try {
            i0();
            final AtomicReference atomicReference = new AtomicReference();
            this.f19117i = G.n.B(androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: c0.A
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object T10;
                    T10 = H.T(atomicReference, aVar);
                    return T10;
                }
            }));
            this.f19118j = (c.a) y0.f.g((c.a) atomicReference.get());
            k0(d.CONFIGURED);
        } catch (MediaCodec.CodecException e10) {
            throw new k0(e10);
        }
    }

    private void D() {
        if (androidx.camera.video.internal.compat.quirk.a.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
            final e eVar = this.f19134z;
            final Executor executor = this.f19116h;
            Future future = this.f19108D;
            if (future != null) {
                future.cancel(false);
            }
            this.f19108D = F.c.e().schedule(new Runnable() { // from class: c0.v
                @Override // java.lang.Runnable
                public final void run() {
                    H.Q(executor, eVar);
                }
            }, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    private void E(r0 r0Var, MediaFormat mediaFormat) {
        y0.f.i(this.f19111c);
        if (mediaFormat.containsKey("bitrate")) {
            int integer = mediaFormat.getInteger("bitrate");
            int intValue = ((Integer) r0Var.c().clamp(Integer.valueOf(integer))).intValue();
            if (integer != intValue) {
                mediaFormat.setInteger("bitrate", intValue);
                AbstractC0700h0.a(this.f19109a, "updated bitrate from " + integer + " to " + intValue);
            }
        }
    }

    static boolean K(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    private boolean L() {
        return androidx.camera.video.internal.compat.quirk.a.b(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) != null;
    }

    static boolean N(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object O(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "acquireInputBuffer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(c.a aVar) {
        this.f19120l.remove(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(Executor executor, final e eVar) {
        Objects.requireNonNull(eVar);
        executor.execute(new Runnable() { // from class: c0.p
            @Override // java.lang.Runnable
            public final void run() {
                H.e.this.t();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(j0 j0Var) {
        this.f19121m.remove(j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object T(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "mReleasedFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U(InterfaceC1702m interfaceC1702m, int i10, String str, Throwable th) {
        interfaceC1702m.e(new C1697h(i10, str, th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(long j10) {
        switch (this.f19128t) {
            case CONFIGURED:
            case PAUSED:
            case STOPPING:
            case PENDING_START_PAUSED:
            case ERROR:
                return;
            case STARTED:
                AbstractC0700h0.a(this.f19109a, "Pause on " + X.d.c(j10));
                this.f19123o.addLast(Range.create(Long.valueOf(j10), Long.MAX_VALUE));
                k0(d.PAUSED);
                return;
            case PENDING_START:
                k0(d.PENDING_START_PAUSED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f19128t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W() {
        switch (this.f19128t) {
            case CONFIGURED:
            case STARTED:
            case PAUSED:
            case ERROR:
                g0();
                return;
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
                k0(d.PENDING_RELEASE);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + this.f19128t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X() {
        int ordinal = this.f19128t.ordinal();
        if (ordinal == 1) {
            h0();
        } else if (ordinal == 6 || ordinal == 8) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y() {
        this.f19106B = true;
        if (this.f19105A) {
            this.f19113e.stop();
            i0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(long j10) {
        switch (this.f19128t) {
            case CONFIGURED:
                this.f19132x = null;
                AbstractC0700h0.a(this.f19109a, "Start on " + X.d.c(j10));
                try {
                    if (this.f19105A) {
                        i0();
                    }
                    this.f19129u = Range.create(Long.valueOf(j10), Long.MAX_VALUE);
                    this.f19113e.start();
                    InterfaceC1701l.b bVar = this.f19114f;
                    if (bVar instanceof c) {
                        ((c) bVar).A(true);
                    }
                    k0(d.STARTED);
                    return;
                } catch (MediaCodec.CodecException e10) {
                    I(e10);
                    return;
                }
            case STARTED:
            case PENDING_START:
            case ERROR:
                return;
            case PAUSED:
                this.f19132x = null;
                Range range = (Range) this.f19123o.removeLast();
                y0.f.j(range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                Long l10 = (Long) range.getLower();
                long longValue = l10.longValue();
                this.f19123o.addLast(Range.create(l10, Long.valueOf(j10)));
                AbstractC0700h0.a(this.f19109a, "Resume on " + X.d.c(j10) + "\nPaused duration = " + X.d.c(j10 - longValue));
                if ((this.f19111c || androidx.camera.video.internal.compat.quirk.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!this.f19111c || androidx.camera.video.internal.compat.quirk.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    j0(false);
                    InterfaceC1701l.b bVar2 = this.f19114f;
                    if (bVar2 instanceof c) {
                        ((c) bVar2).A(true);
                    }
                }
                if (this.f19111c) {
                    h0();
                }
                k0(d.STARTED);
                return;
            case STOPPING:
            case PENDING_START_PAUSED:
                k0(d.PENDING_START);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f19128t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0() {
        if (this.f19131w) {
            AbstractC0700h0.l(this.f19109a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            this.f19132x = null;
            l0();
            this.f19131w = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0() {
        this.f19116h.execute(new Runnable() { // from class: c0.t
            @Override // java.lang.Runnable
            public final void run() {
                H.this.a0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void c0(long j10, long j11) {
        switch (this.f19128t) {
            case CONFIGURED:
            case STOPPING:
            case ERROR:
                return;
            case STARTED:
            case PAUSED:
                d dVar = this.f19128t;
                k0(d.STOPPING);
                Long l10 = (Long) this.f19129u.getLower();
                long longValue = l10.longValue();
                if (longValue == Long.MAX_VALUE) {
                    throw new AssertionError("There should be a \"start\" before \"stop\"");
                }
                if (j10 != -1) {
                    if (j10 < longValue) {
                        AbstractC0700h0.l(this.f19109a, "The expected stop time is less than the start time. Use current time as stop time.");
                    }
                    if (j10 >= longValue) {
                        throw new AssertionError("The start time should be before the stop time.");
                    }
                    this.f19129u = Range.create(l10, Long.valueOf(j10));
                    AbstractC0700h0.a(this.f19109a, "Stop on " + X.d.c(j10));
                    if (dVar == d.PAUSED && this.f19132x != null) {
                        l0();
                        return;
                    } else {
                        this.f19131w = true;
                        this.f19133y = F.c.e().schedule(new Runnable() { // from class: c0.s
                            @Override // java.lang.Runnable
                            public final void run() {
                                H.this.b0();
                            }
                        }, 1000L, TimeUnit.MILLISECONDS);
                        return;
                    }
                }
                j10 = j11;
                if (j10 >= longValue) {
                }
                break;
            case PENDING_START:
            case PENDING_START_PAUSED:
                k0(d.CONFIGURED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f19128t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(List list, Runnable runnable) {
        if (this.f19128t != d.ERROR) {
            if (!list.isEmpty()) {
                AbstractC0700h0.a(this.f19109a, "encoded data and input buffers are returned");
            }
            if (!(this.f19114f instanceof f) || this.f19106B || L()) {
                this.f19113e.stop();
            } else {
                this.f19113e.flush();
                this.f19105A = true;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        J();
    }

    private void g0() {
        if (this.f19105A) {
            this.f19113e.stop();
            this.f19105A = false;
        }
        this.f19113e.release();
        InterfaceC1701l.b bVar = this.f19114f;
        if (bVar instanceof f) {
            ((f) bVar).e();
        }
        k0(d.RELEASED);
        this.f19118j.c(null);
    }

    private void i0() {
        this.f19129u = f19104E;
        this.f19130v = 0L;
        this.f19123o.clear();
        this.f19119k.clear();
        Iterator it = this.f19120l.iterator();
        while (it.hasNext()) {
            ((c.a) it.next()).d();
        }
        this.f19120l.clear();
        this.f19113e.reset();
        this.f19105A = false;
        this.f19106B = false;
        this.f19107C = false;
        this.f19131w = false;
        Future future = this.f19133y;
        if (future != null) {
            future.cancel(true);
            this.f19133y = null;
        }
        Future future2 = this.f19108D;
        if (future2 != null) {
            future2.cancel(false);
            this.f19108D = null;
        }
        e eVar = this.f19134z;
        if (eVar != null) {
            eVar.w();
        }
        e eVar2 = new e();
        this.f19134z = eVar2;
        this.f19113e.setCallback(eVar2);
        this.f19113e.configure(this.f19112d, (Surface) null, (MediaCrypto) null, 1);
        InterfaceC1701l.b bVar = this.f19114f;
        if (bVar instanceof f) {
            ((f) bVar).f();
        }
    }

    private void k0(d dVar) {
        if (this.f19128t == dVar) {
            return;
        }
        AbstractC0700h0.a(this.f19109a, "Transitioning encoder internal state: " + this.f19128t + " --> " + dVar);
        this.f19128t = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        G.n.j(C(), new a(), this.f19116h);
    }

    h8.d C() {
        switch (this.f19128t) {
            case CONFIGURED:
                return G.n.n(new IllegalStateException("Encoder is not started yet."));
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                final AtomicReference atomicReference = new AtomicReference();
                h8.d a10 = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: c0.w
                    @Override // androidx.concurrent.futures.c.InterfaceC0253c
                    public final Object a(c.a aVar) {
                        Object O10;
                        O10 = H.O(atomicReference, aVar);
                        return O10;
                    }
                });
                final c.a aVar = (c.a) y0.f.g((c.a) atomicReference.get());
                this.f19120l.offer(aVar);
                aVar.a(new Runnable() { // from class: c0.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        H.this.P(aVar);
                    }
                }, this.f19116h);
                e0();
                return a10;
            case ERROR:
                return G.n.n(new IllegalStateException("Encoder is in error state."));
            case RELEASED:
                return G.n.n(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f19128t);
        }
    }

    long F() {
        return this.f19125q.a();
    }

    long G(MediaCodec.BufferInfo bufferInfo) {
        long j10 = this.f19130v;
        return j10 > 0 ? bufferInfo.presentationTimeUs - j10 : bufferInfo.presentationTimeUs;
    }

    void H(final int i10, final String str, final Throwable th) {
        switch (this.f19128t) {
            case CONFIGURED:
                R(i10, str, th);
                i0();
                break;
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                k0(d.ERROR);
                o0(new Runnable() { // from class: c0.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        H.this.R(i10, str, th);
                    }
                });
                break;
            case ERROR:
                AbstractC0700h0.m(this.f19109a, "Get more than one error: " + str + "(" + i10 + ")", th);
                break;
        }
    }

    void I(MediaCodec.CodecException codecException) {
        H(1, codecException.getMessage(), codecException);
    }

    void J() {
        d dVar = this.f19128t;
        if (dVar == d.PENDING_RELEASE) {
            g0();
            return;
        }
        if (!this.f19105A) {
            i0();
        }
        k0(d.CONFIGURED);
        if (dVar == d.PENDING_START || dVar == d.PENDING_START_PAUSED) {
            start();
            if (dVar == d.PENDING_START_PAUSED) {
                pause();
            }
        }
    }

    boolean M(long j10) {
        for (Range range : this.f19123o) {
            if (range.contains((Range) Long.valueOf(j10))) {
                return true;
            }
            if (j10 < ((Long) range.getLower()).longValue()) {
                break;
            }
        }
        return false;
    }

    @Override // c0.InterfaceC1701l
    public void a() {
        this.f19116h.execute(new Runnable() { // from class: c0.B
            @Override // java.lang.Runnable
            public final void run() {
                H.this.W();
            }
        });
    }

    @Override // c0.InterfaceC1701l
    public void b(final long j10) {
        final long F10 = F();
        this.f19116h.execute(new Runnable() { // from class: c0.G
            @Override // java.lang.Runnable
            public final void run() {
                H.this.c0(j10, F10);
            }
        });
    }

    @Override // c0.InterfaceC1701l
    public InterfaceC1701l.b c() {
        return this.f19114f;
    }

    @Override // c0.InterfaceC1701l
    public f0 d() {
        return this.f19115g;
    }

    @Override // c0.InterfaceC1701l
    public void e(InterfaceC1702m interfaceC1702m, Executor executor) {
        synchronized (this.f19110b) {
            this.f19126r = interfaceC1702m;
            this.f19127s = executor;
        }
    }

    void e0() {
        while (!this.f19120l.isEmpty() && !this.f19119k.isEmpty()) {
            c.a aVar = (c.a) this.f19120l.poll();
            Objects.requireNonNull(aVar);
            Integer num = (Integer) this.f19119k.poll();
            Objects.requireNonNull(num);
            try {
                final j0 j0Var = new j0(this.f19113e, num.intValue());
                if (aVar.c(j0Var)) {
                    this.f19121m.add(j0Var);
                    j0Var.a().e(new Runnable() { // from class: c0.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            H.this.S(j0Var);
                        }
                    }, this.f19116h);
                } else {
                    j0Var.cancel();
                }
            } catch (MediaCodec.CodecException e10) {
                I(e10);
                return;
            }
        }
    }

    @Override // c0.InterfaceC1701l
    public h8.d f() {
        return this.f19117i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void R(final int i10, final String str, final Throwable th) {
        final InterfaceC1702m interfaceC1702m;
        Executor executor;
        synchronized (this.f19110b) {
            interfaceC1702m = this.f19126r;
            executor = this.f19127s;
        }
        try {
            executor.execute(new Runnable() { // from class: c0.D
                @Override // java.lang.Runnable
                public final void run() {
                    H.U(InterfaceC1702m.this, i10, str, th);
                }
            });
        } catch (RejectedExecutionException e10) {
            AbstractC0700h0.d(this.f19109a, "Unable to post to the supplied executor.", e10);
        }
    }

    @Override // c0.InterfaceC1701l
    public void g() {
        this.f19116h.execute(new Runnable() { // from class: c0.u
            @Override // java.lang.Runnable
            public final void run() {
                H.this.X();
            }
        });
    }

    @Override // c0.InterfaceC1701l
    public int h() {
        if (this.f19112d.containsKey("bitrate")) {
            return this.f19112d.getInteger("bitrate");
        }
        return 0;
    }

    void h0() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f19113e.setParameters(bundle);
    }

    void j0(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z10 ? 1 : 0);
        this.f19113e.setParameters(bundle);
    }

    void l0() {
        AbstractC0700h0.a(this.f19109a, "signalCodecStop");
        InterfaceC1701l.b bVar = this.f19114f;
        if (bVar instanceof c) {
            ((c) bVar).A(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f19121m.iterator();
            while (it.hasNext()) {
                arrayList.add(((h0) it.next()).a());
            }
            G.n.F(arrayList).e(new Runnable() { // from class: c0.r
                @Override // java.lang.Runnable
                public final void run() {
                    H.this.m0();
                }
            }, this.f19116h);
            return;
        }
        if (bVar instanceof f) {
            try {
                D();
                this.f19113e.signalEndOfInputStream();
                this.f19107C = true;
            } catch (MediaCodec.CodecException e10) {
                I(e10);
            }
        }
    }

    public void n0() {
        this.f19116h.execute(new Runnable() { // from class: c0.E
            @Override // java.lang.Runnable
            public final void run() {
                H.this.Y();
            }
        });
    }

    void o0(final Runnable runnable) {
        AbstractC0700h0.a(this.f19109a, "stopMediaCodec");
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.f19122n.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1700k) it.next()).b());
        }
        Iterator it2 = this.f19121m.iterator();
        while (it2.hasNext()) {
            arrayList.add(((h0) it2.next()).a());
        }
        if (!arrayList.isEmpty()) {
            AbstractC0700h0.a(this.f19109a, "Waiting for resources to return. encoded data = " + this.f19122n.size() + ", input buffers = " + this.f19121m.size());
        }
        G.n.F(arrayList).e(new Runnable() { // from class: c0.F
            @Override // java.lang.Runnable
            public final void run() {
                H.this.d0(arrayList, runnable);
            }
        }, this.f19116h);
    }

    void p0(long j10) {
        while (!this.f19123o.isEmpty()) {
            Range range = (Range) this.f19123o.getFirst();
            if (j10 <= ((Long) range.getUpper()).longValue()) {
                return;
            }
            this.f19123o.removeFirst();
            this.f19130v += ((Long) range.getUpper()).longValue() - ((Long) range.getLower()).longValue();
            AbstractC0700h0.a(this.f19109a, "Total paused duration = " + X.d.c(this.f19130v));
        }
    }

    @Override // c0.InterfaceC1701l
    public void pause() {
        final long F10 = F();
        this.f19116h.execute(new Runnable() { // from class: c0.y
            @Override // java.lang.Runnable
            public final void run() {
                H.this.V(F10);
            }
        });
    }

    @Override // c0.InterfaceC1701l
    public void start() {
        final long F10 = F();
        this.f19116h.execute(new Runnable() { // from class: c0.z
            @Override // java.lang.Runnable
            public final void run() {
                H.this.Z(F10);
            }
        });
    }

    class a implements G.c {
        a() {
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(h0 h0Var) {
            h0Var.d(H.this.F());
            h0Var.b(true);
            h0Var.c();
            G.n.j(h0Var.a(), new C0341a(), H.this.f19116h);
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            H.this.H(0, "Unable to acquire InputBuffer.", th);
        }

        /* renamed from: c0.H$a$a, reason: collision with other inner class name */
        class C0341a implements G.c {
            C0341a() {
            }

            @Override // G.c
            public void onFailure(Throwable th) {
                if (th instanceof MediaCodec.CodecException) {
                    H.this.I((MediaCodec.CodecException) th);
                } else {
                    H.this.H(0, th.getMessage(), th);
                }
            }

            @Override // G.c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r12) {
            }
        }
    }

    class e extends MediaCodec.Callback {

        /* renamed from: a, reason: collision with root package name */
        private final e0.f f19141a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f19142b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f19143c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f19144d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f19145e = false;

        /* renamed from: f, reason: collision with root package name */
        private long f19146f = 0;

        /* renamed from: g, reason: collision with root package name */
        private long f19147g = 0;

        /* renamed from: h, reason: collision with root package name */
        private boolean f19148h = false;

        /* renamed from: i, reason: collision with root package name */
        private boolean f19149i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f19150j = false;

        class a implements G.c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1700k f19152a;

            a(C1700k c1700k) {
                this.f19152a = c1700k;
            }

            @Override // G.c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r22) {
                H.this.f19122n.remove(this.f19152a);
            }

            @Override // G.c
            public void onFailure(Throwable th) {
                H.this.f19122n.remove(this.f19152a);
                if (th instanceof MediaCodec.CodecException) {
                    H.this.I((MediaCodec.CodecException) th);
                } else {
                    H.this.H(0, th.getMessage(), th);
                }
            }
        }

        e() {
            this.f19142b = true;
            if (H.this.f19111c) {
                this.f19141a = new e0.f(H.this.f19125q, H.this.f19124p, (CameraUseInconsistentTimebaseQuirk) androidx.camera.video.internal.compat.quirk.a.b(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.f19141a = null;
            }
            CodecStuckOnFlushQuirk codecStuckOnFlushQuirk = (CodecStuckOnFlushQuirk) androidx.camera.video.internal.compat.quirk.a.b(CodecStuckOnFlushQuirk.class);
            if (codecStuckOnFlushQuirk == null || !codecStuckOnFlushQuirk.g(H.this.f19112d.getString("mime"))) {
                return;
            }
            this.f19142b = false;
        }

        private boolean i(MediaCodec.BufferInfo bufferInfo) {
            if (this.f19145e) {
                AbstractC0700h0.a(H.this.f19109a, "Drop buffer by already reach end of stream.");
                return false;
            }
            if (bufferInfo.size <= 0) {
                AbstractC0700h0.a(H.this.f19109a, "Drop buffer by invalid buffer size.");
                return false;
            }
            if ((bufferInfo.flags & 2) != 0) {
                AbstractC0700h0.a(H.this.f19109a, "Drop buffer by codec config.");
                return false;
            }
            e0.f fVar = this.f19141a;
            if (fVar != null) {
                bufferInfo.presentationTimeUs = fVar.b(bufferInfo.presentationTimeUs);
            }
            long j10 = bufferInfo.presentationTimeUs;
            if (j10 <= this.f19146f) {
                AbstractC0700h0.a(H.this.f19109a, "Drop buffer by out of order buffer from MediaCodec.");
                return false;
            }
            this.f19146f = j10;
            if (!H.this.f19129u.contains((Range) Long.valueOf(j10))) {
                AbstractC0700h0.a(H.this.f19109a, "Drop buffer by not in start-stop range.");
                H h10 = H.this;
                if (h10.f19131w && bufferInfo.presentationTimeUs >= ((Long) h10.f19129u.getUpper()).longValue()) {
                    Future future = H.this.f19133y;
                    if (future != null) {
                        future.cancel(true);
                    }
                    H.this.f19132x = Long.valueOf(bufferInfo.presentationTimeUs);
                    H.this.l0();
                    H.this.f19131w = false;
                }
                return false;
            }
            if (x(bufferInfo)) {
                AbstractC0700h0.a(H.this.f19109a, "Drop buffer by pause.");
                return false;
            }
            if (H.this.G(bufferInfo) <= this.f19147g) {
                AbstractC0700h0.a(H.this.f19109a, "Drop buffer by adjusted time is less than the last sent time.");
                if (H.this.f19111c && H.N(bufferInfo)) {
                    this.f19149i = true;
                }
                return false;
            }
            if (!this.f19144d && !this.f19149i && H.this.f19111c) {
                this.f19149i = true;
            }
            if (this.f19149i) {
                if (!H.N(bufferInfo)) {
                    AbstractC0700h0.a(H.this.f19109a, "Drop buffer by not a key frame.");
                    H.this.h0();
                    return false;
                }
                this.f19149i = false;
            }
            return true;
        }

        private boolean j(MediaCodec.BufferInfo bufferInfo) {
            return H.K(bufferInfo) || (this.f19142b && k(bufferInfo));
        }

        private boolean k(MediaCodec.BufferInfo bufferInfo) {
            H h10 = H.this;
            return h10.f19107C && bufferInfo.presentationTimeUs > ((Long) h10.f19129u.getUpper()).longValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(MediaCodec.CodecException codecException) {
            switch (H.this.f19128t) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    H.this.I(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + H.this.f19128t);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(int i10) {
            if (this.f19150j) {
                AbstractC0700h0.l(H.this.f19109a, "Receives input frame after codec is reset.");
                return;
            }
            switch (H.this.f19128t) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    H.this.f19119k.offer(Integer.valueOf(i10));
                    H.this.e0();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + H.this.f19128t);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i10) {
            final InterfaceC1702m interfaceC1702m;
            Executor executor;
            if (this.f19150j) {
                AbstractC0700h0.l(H.this.f19109a, "Receives frame after codec is reset.");
                return;
            }
            switch (H.this.f19128t) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    synchronized (H.this.f19110b) {
                        H h10 = H.this;
                        interfaceC1702m = h10.f19126r;
                        executor = h10.f19127s;
                    }
                    if (!this.f19143c) {
                        this.f19143c = true;
                        try {
                            Objects.requireNonNull(interfaceC1702m);
                            executor.execute(new Runnable() { // from class: c0.Y
                                @Override // java.lang.Runnable
                                public final void run() {
                                    InterfaceC1702m.this.a();
                                }
                            });
                        } catch (RejectedExecutionException e10) {
                            AbstractC0700h0.d(H.this.f19109a, "Unable to post to the supplied executor.", e10);
                        }
                    }
                    if (i(bufferInfo)) {
                        if (!this.f19144d) {
                            this.f19144d = true;
                            AbstractC0700h0.a(H.this.f19109a, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + H.this.f19124p + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo u10 = u(bufferInfo);
                        this.f19147g = u10.presentationTimeUs;
                        try {
                            v(new C1700k(mediaCodec, i10, u10), interfaceC1702m, executor);
                        } catch (MediaCodec.CodecException e11) {
                            H.this.I(e11);
                            return;
                        }
                    } else {
                        try {
                            H.this.f19113e.releaseOutputBuffer(i10, false);
                        } catch (MediaCodec.CodecException e12) {
                            H.this.I(e12);
                            return;
                        }
                    }
                    if (this.f19145e || !j(bufferInfo)) {
                        return;
                    }
                    t();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + H.this.f19128t);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void p(InterfaceC1702m interfaceC1702m, final MediaFormat mediaFormat) {
            interfaceC1702m.c(new l0() { // from class: c0.c0
                @Override // c0.l0
                public final MediaFormat a() {
                    MediaFormat o10;
                    o10 = H.e.o(mediaFormat);
                    return o10;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(final MediaFormat mediaFormat) {
            final InterfaceC1702m interfaceC1702m;
            Executor executor;
            if (this.f19150j) {
                AbstractC0700h0.l(H.this.f19109a, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (H.this.f19128t) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    synchronized (H.this.f19110b) {
                        H h10 = H.this;
                        interfaceC1702m = h10.f19126r;
                        executor = h10.f19127s;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: c0.Z
                            @Override // java.lang.Runnable
                            public final void run() {
                                H.e.p(InterfaceC1702m.this, mediaFormat);
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e10) {
                        AbstractC0700h0.d(H.this.f19109a, "Unable to post to the supplied executor.", e10);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + H.this.f19128t);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(Executor executor, final InterfaceC1702m interfaceC1702m) {
            if (H.this.f19128t == d.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(interfaceC1702m);
                executor.execute(new Runnable() { // from class: c0.U
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1702m.this.d();
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC0700h0.d(H.this.f19109a, "Unable to post to the supplied executor.", e10);
            }
        }

        private MediaCodec.BufferInfo u(MediaCodec.BufferInfo bufferInfo) {
            long G10 = H.this.G(bufferInfo);
            if (bufferInfo.presentationTimeUs == G10) {
                return bufferInfo;
            }
            y0.f.i(G10 > this.f19147g);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, G10, bufferInfo.flags);
            return bufferInfo2;
        }

        private void v(final C1700k c1700k, final InterfaceC1702m interfaceC1702m, Executor executor) {
            H.this.f19122n.add(c1700k);
            G.n.j(c1700k.b(), new a(c1700k), H.this.f19116h);
            try {
                executor.execute(new Runnable() { // from class: c0.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1702m.this.b(c1700k);
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC0700h0.d(H.this.f19109a, "Unable to post to the supplied executor.", e10);
                c1700k.close();
            }
        }

        private boolean x(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final InterfaceC1702m interfaceC1702m;
            H.this.p0(bufferInfo.presentationTimeUs);
            boolean M10 = H.this.M(bufferInfo.presentationTimeUs);
            boolean z10 = this.f19148h;
            if (!z10 && M10) {
                AbstractC0700h0.a(H.this.f19109a, "Switch to pause state");
                this.f19148h = true;
                synchronized (H.this.f19110b) {
                    H h10 = H.this;
                    executor = h10.f19127s;
                    interfaceC1702m = h10.f19126r;
                }
                Objects.requireNonNull(interfaceC1702m);
                executor.execute(new Runnable() { // from class: c0.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1702m.this.f();
                    }
                });
                H h11 = H.this;
                if (h11.f19128t == d.PAUSED && ((h11.f19111c || androidx.camera.video.internal.compat.quirk.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!H.this.f19111c || androidx.camera.video.internal.compat.quirk.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    InterfaceC1701l.b bVar = H.this.f19114f;
                    if (bVar instanceof c) {
                        ((c) bVar).A(false);
                    }
                    H.this.j0(true);
                }
                H.this.f19132x = Long.valueOf(bufferInfo.presentationTimeUs);
                H h12 = H.this;
                if (h12.f19131w) {
                    Future future = h12.f19133y;
                    if (future != null) {
                        future.cancel(true);
                    }
                    H.this.l0();
                    H.this.f19131w = false;
                }
            } else if (z10 && !M10) {
                AbstractC0700h0.a(H.this.f19109a, "Switch to resume state");
                this.f19148h = false;
                if (H.this.f19111c && !H.N(bufferInfo)) {
                    this.f19149i = true;
                }
            }
            return this.f19148h;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            H.this.f19116h.execute(new Runnable() { // from class: c0.W
                @Override // java.lang.Runnable
                public final void run() {
                    H.e.this.l(codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i10) {
            H.this.f19116h.execute(new Runnable() { // from class: c0.T
                @Override // java.lang.Runnable
                public final void run() {
                    H.e.this.m(i10);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i10, final MediaCodec.BufferInfo bufferInfo) {
            H.this.f19116h.execute(new Runnable() { // from class: c0.V
                @Override // java.lang.Runnable
                public final void run() {
                    H.e.this.n(bufferInfo, mediaCodec, i10);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            H.this.f19116h.execute(new Runnable() { // from class: c0.X
                @Override // java.lang.Runnable
                public final void run() {
                    H.e.this.q(mediaFormat);
                }
            });
        }

        void t() {
            H h10;
            final InterfaceC1702m interfaceC1702m;
            final Executor executor;
            if (this.f19145e) {
                return;
            }
            this.f19145e = true;
            if (H.this.f19108D != null) {
                H.this.f19108D.cancel(false);
                H.this.f19108D = null;
            }
            synchronized (H.this.f19110b) {
                h10 = H.this;
                interfaceC1702m = h10.f19126r;
                executor = h10.f19127s;
            }
            h10.o0(new Runnable() { // from class: c0.a0
                @Override // java.lang.Runnable
                public final void run() {
                    H.e.this.r(executor, interfaceC1702m);
                }
            });
        }

        void w() {
            this.f19150j = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaFormat o(MediaFormat mediaFormat) {
            return mediaFormat;
        }
    }
}
