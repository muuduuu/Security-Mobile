package A;

import C.C0746y;
import C.InterfaceC0745x;
import P.c;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.C1453o0;
import androidx.camera.core.impl.InterfaceC1455p0;
import androidx.camera.core.impl.InterfaceC1457q0;
import androidx.camera.core.impl.InterfaceC1458r0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.Z0;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.m1;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.io.File;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC3735a;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public final class W extends J0 {

    /* renamed from: B, reason: collision with root package name */
    public static final c f110B = new c();

    /* renamed from: C, reason: collision with root package name */
    static final K.b f111C = new K.b();

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC0745x f112A;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC1458r0.a f113p;

    /* renamed from: q, reason: collision with root package name */
    private final int f114q;

    /* renamed from: r, reason: collision with root package name */
    private final AtomicReference f115r;

    /* renamed from: s, reason: collision with root package name */
    private final int f116s;

    /* renamed from: t, reason: collision with root package name */
    private int f117t;

    /* renamed from: u, reason: collision with root package name */
    private Rational f118u;

    /* renamed from: v, reason: collision with root package name */
    private H.j f119v;

    /* renamed from: w, reason: collision with root package name */
    V0.b f120w;

    /* renamed from: x, reason: collision with root package name */
    private C0746y f121x;

    /* renamed from: y, reason: collision with root package name */
    private C.Z f122y;

    /* renamed from: z, reason: collision with root package name */
    private V0.c f123z;

    class a implements InterfaceC0745x {
        a() {
        }

        @Override // C.InterfaceC0745x
        public h8.d a(List list) {
            return W.this.J0(list);
        }

        @Override // C.InterfaceC0745x
        public void b() {
            W.this.C0();
        }

        @Override // C.InterfaceC0745x
        public void c() {
            W.this.O0();
        }
    }

    public static final class b implements l1.a, InterfaceC1457q0.a {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.B0 f125a;

        public b() {
            this(androidx.camera.core.impl.B0.d0());
        }

        public static b f(androidx.camera.core.impl.V v10) {
            return new b(androidx.camera.core.impl.B0.e0(v10));
        }

        @Override // A.C
        public androidx.camera.core.impl.A0 b() {
            return this.f125a;
        }

        public W e() {
            Integer num = (Integer) b().f(C1453o0.f14661M, null);
            if (num != null) {
                b().x(InterfaceC1455p0.f14673l, num);
            } else if (W.v0(b())) {
                b().x(InterfaceC1455p0.f14673l, 4101);
                b().x(InterfaceC1455p0.f14674m, B.f6c);
            } else {
                b().x(InterfaceC1455p0.f14673l, Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
            }
            C1453o0 c10 = c();
            InterfaceC1457q0.E(c10);
            W w10 = new W(c10);
            Size size = (Size) b().f(InterfaceC1457q0.f14679r, null);
            if (size != null) {
                w10.E0(new Rational(size.getWidth(), size.getHeight()));
            }
            y0.f.h((Executor) b().f(H.h.f3062a, F.c.d()), "The IO executor can't be null");
            androidx.camera.core.impl.A0 b10 = b();
            V.a aVar = C1453o0.f14659K;
            if (b10.b(aVar)) {
                Integer num2 = (Integer) b().a(aVar);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
                if (num2.intValue() == 3 && b().f(C1453o0.f14668T, null) == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
            return w10;
        }

        @Override // androidx.camera.core.impl.l1.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C1453o0 c() {
            return new C1453o0(androidx.camera.core.impl.G0.b0(this.f125a));
        }

        public b h(int i10) {
            b().x(C1453o0.f14658J, Integer.valueOf(i10));
            return this;
        }

        public b i(m1.b bVar) {
            b().x(l1.f14636F, bVar);
            return this;
        }

        public b j(B b10) {
            b().x(InterfaceC1455p0.f14674m, b10);
            return this;
        }

        public b k(int i10) {
            b().x(C1453o0.f14659K, Integer.valueOf(i10));
            return this;
        }

        public b l(int i10) {
            b().x(C1453o0.f14662N, Integer.valueOf(i10));
            return this;
        }

        public b m(P.c cVar) {
            b().x(InterfaceC1457q0.f14683v, cVar);
            return this;
        }

        public b n(int i10) {
            b().x(l1.f14632B, Integer.valueOf(i10));
            return this;
        }

        public b o(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            b().x(InterfaceC1457q0.f14675n, Integer.valueOf(i10));
            return this;
        }

        public b p(Class cls) {
            b().x(H.m.f3079c, cls);
            if (b().f(H.m.f3078b, null) == null) {
                q(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public b q(String str) {
            b().x(H.m.f3078b, str);
            return this;
        }

        @Override // androidx.camera.core.impl.InterfaceC1457q0.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b a(Size size) {
            b().x(InterfaceC1457q0.f14679r, size);
            return this;
        }

        @Override // androidx.camera.core.impl.InterfaceC1457q0.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public b d(int i10) {
            b().x(InterfaceC1457q0.f14676o, Integer.valueOf(i10));
            return this;
        }

        private b(androidx.camera.core.impl.B0 b02) {
            this.f125a = b02;
            Class cls = (Class) b02.f(H.m.f3079c, null);
            if (cls == null || cls.equals(W.class)) {
                i(m1.b.IMAGE_CAPTURE);
                p(W.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private static final P.c f126a;

        /* renamed from: b, reason: collision with root package name */
        private static final C1453o0 f127b;

        /* renamed from: c, reason: collision with root package name */
        private static final B f128c;

        static {
            P.c a10 = new c.a().d(P.a.f7357c).f(P.d.f7369c).a();
            f126a = a10;
            B b10 = B.f7d;
            f128c = b10;
            f127b = new b().n(4).o(0).m(a10).l(0).j(b10).c();
        }

        public C1453o0 a() {
            return f127b;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private boolean f129a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f130b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f131c;

        /* renamed from: d, reason: collision with root package name */
        private Location f132d;

        public Location a() {
            return this.f132d;
        }

        public boolean b() {
            return this.f129a;
        }

        public boolean c() {
            return this.f131c;
        }

        public String toString() {
            return "Metadata{mIsReversedHorizontal=" + this.f129a + ", mIsReversedVertical=" + this.f131c + ", mLocation=" + this.f132d + "}";
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final File f133a;

        /* renamed from: b, reason: collision with root package name */
        private final ContentResolver f134b;

        /* renamed from: c, reason: collision with root package name */
        private final Uri f135c;

        /* renamed from: d, reason: collision with root package name */
        private final ContentValues f136d;

        /* renamed from: e, reason: collision with root package name */
        private final OutputStream f137e;

        /* renamed from: f, reason: collision with root package name */
        private final d f138f;

        g(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, d dVar) {
            this.f133a = file;
            this.f134b = contentResolver;
            this.f135c = uri;
            this.f136d = contentValues;
            this.f137e = outputStream;
            this.f138f = dVar == null ? new d() : dVar;
        }

        public ContentResolver a() {
            return this.f134b;
        }

        public ContentValues b() {
            return this.f136d;
        }

        public File c() {
            return this.f133a;
        }

        public d d() {
            return this.f138f;
        }

        public OutputStream e() {
            return this.f137e;
        }

        public Uri f() {
            return this.f135c;
        }

        public String toString() {
            return "OutputFileOptions{mFile=" + this.f133a + ", mContentResolver=" + this.f134b + ", mSaveCollection=" + this.f135c + ", mContentValues=" + this.f136d + ", mOutputStream=" + this.f137e + ", mMetadata=" + this.f138f + "}";
        }

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private File f139a;

            /* renamed from: b, reason: collision with root package name */
            private ContentResolver f140b;

            /* renamed from: c, reason: collision with root package name */
            private Uri f141c;

            /* renamed from: d, reason: collision with root package name */
            private ContentValues f142d;

            /* renamed from: e, reason: collision with root package name */
            private OutputStream f143e;

            /* renamed from: f, reason: collision with root package name */
            private d f144f;

            public a(File file) {
                this.f139a = file;
            }

            public g a() {
                return new g(this.f139a, this.f140b, this.f141c, this.f142d, this.f143e, this.f144f);
            }

            public a(OutputStream outputStream) {
                this.f143e = outputStream;
            }
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f145a;

        public h(Uri uri) {
            this.f145a = uri;
        }

        public Uri a() {
            return this.f145a;
        }
    }

    public interface i {
        void a(long j10, j jVar);

        void clear();
    }

    public interface j {
        void a();
    }

    W(C1453o0 c1453o0) {
        super(c1453o0);
        this.f113p = new InterfaceC1458r0.a() { // from class: A.S
            @Override // androidx.camera.core.impl.InterfaceC1458r0.a
            public final void a(InterfaceC1458r0 interfaceC1458r0) {
                W.y0(interfaceC1458r0);
            }
        };
        this.f115r = new AtomicReference(null);
        this.f117t = -1;
        this.f118u = null;
        this.f112A = new a();
        C1453o0 c1453o02 = (C1453o0) j();
        if (c1453o02.b(C1453o0.f14658J)) {
            this.f114q = c1453o02.a0();
        } else {
            this.f114q = 1;
        }
        this.f116s = c1453o02.c0(0);
        this.f119v = H.j.g(c1453o02.g0());
    }

    private void D0(Executor executor, e eVar, f fVar) {
        X x10 = new X(4, "Not bound to a valid Camera [" + this + "]", null);
        if (eVar != null) {
            eVar.d(x10);
        } else {
            if (fVar == null) {
                throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
            }
            fVar.onError(x10);
        }
    }

    private void G0() {
        H0(this.f119v);
    }

    private void H0(i iVar) {
        h().m(iVar);
    }

    private void M0(Executor executor, e eVar, f fVar, g gVar) {
        E.q.a();
        if (n0() == 3 && this.f119v.h() == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        Log.d("ImageCapture", "takePictureInternal");
        androidx.camera.core.impl.H g10 = g();
        if (g10 == null) {
            D0(executor, eVar, fVar);
            return;
        }
        C.Z z10 = this.f122y;
        Objects.requireNonNull(z10);
        z10.j(C.f0.v(executor, eVar, fVar, gVar, s0(), v(), q(g10), o0(), m0(), this.f120w.r()));
    }

    private void N0() {
        synchronized (this.f115r) {
            try {
                if (this.f115r.get() != null) {
                    return;
                }
                h().h(n0());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void f0() {
        this.f119v.f();
        C.Z z10 = this.f122y;
        if (z10 != null) {
            z10.e();
        }
    }

    private void h0() {
        i0(false);
    }

    private void i0(boolean z10) {
        C.Z z11;
        Log.d("ImageCapture", "clearPipeline");
        E.q.a();
        V0.c cVar = this.f123z;
        if (cVar != null) {
            cVar.b();
            this.f123z = null;
        }
        C0746y c0746y = this.f121x;
        if (c0746y != null) {
            c0746y.a();
            this.f121x = null;
        }
        if (z10 || (z11 = this.f122y) == null) {
            return;
        }
        z11.e();
        this.f122y = null;
    }

    private V0.b j0(String str, C1453o0 c1453o0, Z0 z02) {
        E.q.a();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, z02));
        Size e10 = z02.e();
        androidx.camera.core.impl.H g10 = g();
        Objects.requireNonNull(g10);
        boolean z10 = !g10.o();
        if (this.f121x != null) {
            y0.f.i(z10);
            this.f121x.a();
        }
        if (((Boolean) j().f(C1453o0.f14670V, Boolean.FALSE)).booleanValue()) {
            r0();
        }
        l();
        this.f121x = new C0746y(c1453o0, e10, null, z10, null, 35);
        if (this.f122y == null) {
            this.f122y = new C.Z(this.f112A);
        }
        this.f122y.m(this.f121x);
        V0.b f10 = this.f121x.f(z02.e());
        if (m0() == 2 && !z02.f()) {
            h().a(f10);
        }
        if (z02.d() != null) {
            f10.g(z02.d());
        }
        V0.c cVar = this.f123z;
        if (cVar != null) {
            cVar.b();
        }
        V0.c cVar2 = new V0.c(new V0.d() { // from class: A.U
            @Override // androidx.camera.core.impl.V0.d
            public final void a(V0 v02, V0.g gVar) {
                W.this.x0(v02, gVar);
            }
        });
        this.f123z = cVar2;
        f10.t(cVar2);
        return f10;
    }

    private int l0() {
        androidx.camera.core.impl.H g10 = g();
        if (g10 != null) {
            return g10.c().i();
        }
        return -1;
    }

    private int o0() {
        C1453o0 c1453o0 = (C1453o0) j();
        if (c1453o0.b(C1453o0.f14667S)) {
            return c1453o0.f0();
        }
        int i10 = this.f114q;
        if (i10 == 0) {
            return 100;
        }
        if (i10 == 1 || i10 == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f114q + " is invalid");
    }

    private X0 r0() {
        g().i().Y(null);
        return null;
    }

    private Rect s0() {
        Rect A10 = A();
        Size f10 = f();
        Objects.requireNonNull(f10);
        if (A10 != null) {
            return A10;
        }
        if (!L.b.h(this.f118u)) {
            return new Rect(0, 0, f10.getWidth(), f10.getHeight());
        }
        androidx.camera.core.impl.H g10 = g();
        Objects.requireNonNull(g10);
        int q10 = q(g10);
        Rational rational = new Rational(this.f118u.getDenominator(), this.f118u.getNumerator());
        if (!E.r.i(q10)) {
            rational = this.f118u;
        }
        Rect a10 = L.b.a(f10, rational);
        Objects.requireNonNull(a10);
        return a10;
    }

    private static boolean u0(List list, int i10) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v0(androidx.camera.core.impl.A0 a02) {
        return Objects.equals(a02.f(C1453o0.f14662N, null), 1);
    }

    private boolean w0() {
        if (g() == null) {
            return false;
        }
        g().i().Y(null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(V0 v02, V0.g gVar) {
        List a10;
        if (g() == null) {
            return;
        }
        this.f122y.k();
        i0(true);
        V0.b j02 = j0(i(), (C1453o0) j(), (Z0) y0.f.g(e()));
        this.f120w = j02;
        a10 = H.a(new Object[]{j02.o()});
        X(a10);
        G();
        this.f122y.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y0(InterfaceC1458r0 interfaceC1458r0) {
        try {
            androidx.camera.core.n c10 = interfaceC1458r0.c();
            try {
                Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + c10);
                if (c10 != null) {
                    c10.close();
                }
            } finally {
            }
        } catch (IllegalStateException e10) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void z0(List list) {
        return null;
    }

    void C0() {
        synchronized (this.f115r) {
            try {
                if (this.f115r.get() != null) {
                    return;
                }
                this.f115r.set(Integer.valueOf(n0()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void E0(Rational rational) {
        this.f118u = rational;
    }

    public void F0(int i10) {
        AbstractC0700h0.a("ImageCapture", "setFlashMode: flashMode = " + i10);
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                throw new IllegalArgumentException("Invalid flash mode: " + i10);
            }
            if (this.f119v.h() == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            }
            if (g() != null && l0() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        synchronized (this.f115r) {
            this.f117t = i10;
            N0();
        }
    }

    public void I0(int i10) {
        int t02 = t0();
        if (!U(i10) || this.f118u == null) {
            return;
        }
        this.f118u = L.b.f(Math.abs(E.c.b(i10) - E.c.b(t02)), this.f118u);
    }

    @Override // A.J0
    public void J() {
        y0.f.h(g(), "Attached camera cannot be null");
        if (n0() == 3 && l0() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    h8.d J0(List list) {
        E.q.a();
        return G.n.G(h().c(list, this.f114q, this.f116s), new InterfaceC3735a() { // from class: A.V
            @Override // o.InterfaceC3735a
            public final Object apply(Object obj) {
                Void z02;
                z02 = W.z0((List) obj);
                return z02;
            }
        }, F.c.b());
    }

    @Override // A.J0
    public void K() {
        AbstractC0700h0.a("ImageCapture", "onCameraControlReady");
        N0();
        G0();
    }

    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public void B0(final g gVar, final Executor executor, final f fVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            F.c.e().execute(new Runnable() { // from class: A.Q
                @Override // java.lang.Runnable
                public final void run() {
                    W.this.B0(gVar, executor, fVar);
                }
            });
        } else {
            M0(executor, null, fVar, gVar);
        }
    }

    @Override // A.J0
    protected l1 L(androidx.camera.core.impl.G g10, l1.a aVar) {
        if (g10.p().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            androidx.camera.core.impl.A0 b10 = aVar.b();
            V.a aVar2 = C1453o0.f14665Q;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(b10.f(aVar2, bool2))) {
                AbstractC0700h0.l("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                AbstractC0700h0.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                aVar.b().x(aVar2, bool2);
            }
        }
        boolean k02 = k0(aVar.b());
        Integer num = (Integer) aVar.b().f(C1453o0.f14661M, null);
        if (num != null) {
            y0.f.b(!w0() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            aVar.b().x(InterfaceC1455p0.f14673l, Integer.valueOf(k02 ? 35 : num.intValue()));
        } else if (v0(aVar.b())) {
            aVar.b().x(InterfaceC1455p0.f14673l, 4101);
            aVar.b().x(InterfaceC1455p0.f14674m, B.f6c);
        } else if (k02) {
            aVar.b().x(InterfaceC1455p0.f14673l, 35);
        } else {
            List list = (List) aVar.b().f(InterfaceC1457q0.f14682u, null);
            if (list == null) {
                aVar.b().x(InterfaceC1455p0.f14673l, Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
            } else if (u0(list, PSKKeyManager.MAX_KEY_LENGTH_BYTES)) {
                aVar.b().x(InterfaceC1455p0.f14673l, Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
            } else if (u0(list, 35)) {
                aVar.b().x(InterfaceC1455p0.f14673l, 35);
            }
        }
        return aVar.c();
    }

    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public void A0(final Executor executor, final e eVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            F.c.e().execute(new Runnable() { // from class: A.T
                @Override // java.lang.Runnable
                public final void run() {
                    W.this.A0(executor, eVar);
                }
            });
        } else {
            M0(executor, eVar, null, null);
        }
    }

    @Override // A.J0
    public void N() {
        f0();
    }

    @Override // A.J0
    protected Z0 O(androidx.camera.core.impl.V v10) {
        List a10;
        this.f120w.g(v10);
        a10 = H.a(new Object[]{this.f120w.o()});
        X(a10);
        return e().g().d(v10).a();
    }

    void O0() {
        synchronized (this.f115r) {
            try {
                Integer num = (Integer) this.f115r.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != n0()) {
                    N0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A.J0
    protected Z0 P(Z0 z02, Z0 z03) {
        List a10;
        V0.b j02 = j0(i(), (C1453o0) j(), z02);
        this.f120w = j02;
        a10 = H.a(new Object[]{j02.o()});
        X(a10);
        E();
        return z02;
    }

    @Override // A.J0
    public void Q() {
        f0();
        h0();
        H0(null);
    }

    @Override // A.J0
    public l1 k(boolean z10, m1 m1Var) {
        c cVar = f110B;
        androidx.camera.core.impl.V a10 = m1Var.a(cVar.a().F(), m0());
        if (z10) {
            a10 = androidx.camera.core.impl.V.H(a10, cVar.a());
        }
        if (a10 == null) {
            return null;
        }
        return z(a10).c();
    }

    boolean k0(androidx.camera.core.impl.A0 a02) {
        boolean z10;
        Boolean bool = Boolean.TRUE;
        V.a aVar = C1453o0.f14665Q;
        Boolean bool2 = Boolean.FALSE;
        boolean z11 = false;
        if (bool.equals(a02.f(aVar, bool2))) {
            if (w0()) {
                AbstractC0700h0.l("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z10 = false;
            } else {
                z10 = true;
            }
            Integer num = (Integer) a02.f(C1453o0.f14661M, null);
            if (num == null || num.intValue() == 256) {
                z11 = z10;
            } else {
                AbstractC0700h0.l("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z11) {
                AbstractC0700h0.l("ImageCapture", "Unable to support software JPEG. Disabling.");
                a02.x(aVar, bool2);
            }
        }
        return z11;
    }

    public int m0() {
        return this.f114q;
    }

    public int n0() {
        int i10;
        synchronized (this.f115r) {
            i10 = this.f117t;
            if (i10 == -1) {
                i10 = ((C1453o0) j()).b0(2);
            }
        }
        return i10;
    }

    public s0 p0() {
        return q0();
    }

    protected s0 q0() {
        androidx.camera.core.impl.H g10 = g();
        Size f10 = f();
        if (g10 == null || f10 == null) {
            return null;
        }
        Rect A10 = A();
        Rational rational = this.f118u;
        if (A10 == null) {
            A10 = rational != null ? L.b.a(f10, rational) : new Rect(0, 0, f10.getWidth(), f10.getHeight());
        }
        int q10 = q(g10);
        Objects.requireNonNull(A10);
        return new s0(f10, A10, q10);
    }

    public int t0() {
        return y();
    }

    public String toString() {
        return "ImageCapture:" + o();
    }

    @Override // A.J0
    public Set x() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // A.J0
    public l1.a z(androidx.camera.core.impl.V v10) {
        return b.f(v10);
    }

    public interface f {
        void onError(X x10);

        void onImageSaved(h hVar);

        default void onCaptureStarted() {
        }

        default void onCaptureProcessProgressed(int i10) {
        }

        default void onPostviewBitmapAvailable(Bitmap bitmap) {
        }
    }

    public static abstract class e {
        public abstract void b();

        public abstract void c(androidx.camera.core.n nVar);

        public abstract void d(X x10);

        public void a(int i10) {
        }

        public void e(Bitmap bitmap) {
        }
    }
}
