package t;

import A.AbstractC0700h0;
import A.C0706k0;
import A.InterfaceC0705k;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import androidx.camera.core.impl.AbstractC1450n;
import androidx.camera.core.impl.C1454p;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.InterfaceC1469x;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.V;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import s.C4301a;
import t.C4584u;

/* renamed from: t.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4601z1 {

    /* renamed from: x, reason: collision with root package name */
    private static final MeteringRectangle[] f42255x = new MeteringRectangle[0];

    /* renamed from: a, reason: collision with root package name */
    private final C4584u f42256a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f42257b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f42258c;

    /* renamed from: f, reason: collision with root package name */
    private final x.m f42261f;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledFuture f42264i;

    /* renamed from: j, reason: collision with root package name */
    private ScheduledFuture f42265j;

    /* renamed from: q, reason: collision with root package name */
    private MeteringRectangle[] f42272q;

    /* renamed from: r, reason: collision with root package name */
    private MeteringRectangle[] f42273r;

    /* renamed from: s, reason: collision with root package name */
    private MeteringRectangle[] f42274s;

    /* renamed from: t, reason: collision with root package name */
    c.a f42275t;

    /* renamed from: u, reason: collision with root package name */
    c.a f42276u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f42277v;

    /* renamed from: w, reason: collision with root package name */
    private C4584u.c f42278w;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f42259d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile Rational f42260e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f42262g = false;

    /* renamed from: h, reason: collision with root package name */
    Integer f42263h = 0;

    /* renamed from: k, reason: collision with root package name */
    long f42266k = 0;

    /* renamed from: l, reason: collision with root package name */
    boolean f42267l = false;

    /* renamed from: m, reason: collision with root package name */
    boolean f42268m = false;

    /* renamed from: n, reason: collision with root package name */
    private int f42269n = 1;

    /* renamed from: o, reason: collision with root package name */
    private C4584u.c f42270o = null;

    /* renamed from: p, reason: collision with root package name */
    private C4584u.c f42271p = null;

    /* renamed from: t.z1$a */
    class a extends AbstractC1450n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f42279a;

        a(c.a aVar) {
            this.f42279a = aVar;
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void a(int i10) {
            c.a aVar = this.f42279a;
            if (aVar != null) {
                aVar.f(new InterfaceC0705k.a("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void b(int i10, InterfaceC1469x interfaceC1469x) {
            c.a aVar = this.f42279a;
            if (aVar != null) {
                aVar.c(interfaceC1469x);
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void c(int i10, C1454p c1454p) {
            c.a aVar = this.f42279a;
            if (aVar != null) {
                aVar.f(new D.c(c1454p));
            }
        }
    }

    /* renamed from: t.z1$b */
    class b extends AbstractC1450n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f42281a;

        b(c.a aVar) {
            this.f42281a = aVar;
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void a(int i10) {
            c.a aVar = this.f42281a;
            if (aVar != null) {
                aVar.f(new InterfaceC0705k.a("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void b(int i10, InterfaceC1469x interfaceC1469x) {
            if (this.f42281a != null) {
                AbstractC0700h0.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.f42281a.c(null);
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void c(int i10, C1454p c1454p) {
            c.a aVar = this.f42281a;
            if (aVar != null) {
                aVar.f(new D.c(c1454p));
            }
        }
    }

    C4601z1(C4584u c4584u, ScheduledExecutorService scheduledExecutorService, Executor executor, androidx.camera.core.impl.P0 p02) {
        MeteringRectangle[] meteringRectangleArr = f42255x;
        this.f42272q = meteringRectangleArr;
        this.f42273r = meteringRectangleArr;
        this.f42274s = meteringRectangleArr;
        this.f42275t = null;
        this.f42276u = null;
        this.f42277v = false;
        this.f42278w = null;
        this.f42256a = c4584u;
        this.f42257b = executor;
        this.f42258c = scheduledExecutorService;
        this.f42261f = new x.m(p02);
    }

    private void A(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, A.D d10, long j10) {
        final long t02;
        this.f42256a.k0(this.f42270o);
        x();
        u();
        this.f42272q = meteringRectangleArr;
        this.f42273r = meteringRectangleArr2;
        this.f42274s = meteringRectangleArr3;
        if (e0()) {
            this.f42262g = true;
            this.f42267l = false;
            this.f42268m = false;
            t02 = this.f42256a.t0();
            k0(null, true);
        } else {
            this.f42262g = false;
            this.f42267l = true;
            this.f42268m = false;
            t02 = this.f42256a.t0();
        }
        this.f42263h = 0;
        final boolean I10 = I();
        C4584u.c cVar = new C4584u.c() { // from class: t.n1
            @Override // t.C4584u.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                boolean T10;
                T10 = C4601z1.this.T(I10, t02, totalCaptureResult);
                return T10;
            }
        };
        this.f42270o = cVar;
        this.f42256a.z(cVar);
        final long j11 = this.f42266k + 1;
        this.f42266k = j11;
        Runnable runnable = new Runnable() { // from class: t.o1
            @Override // java.lang.Runnable
            public final void run() {
                C4601z1.this.V(j11);
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.f42258c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f42265j = scheduledExecutorService.schedule(runnable, j10, timeUnit);
        if (d10.e()) {
            this.f42264i = this.f42258c.schedule(new Runnable() { // from class: t.p1
                @Override // java.lang.Runnable
                public final void run() {
                    C4601z1.this.S(j11);
                }
            }, d10.a(), timeUnit);
        }
    }

    private void B(String str) {
        this.f42256a.k0(this.f42270o);
        c.a aVar = this.f42275t;
        if (aVar != null) {
            aVar.f(new InterfaceC0705k.a(str));
            this.f42275t = null;
        }
    }

    private void C(String str) {
        this.f42256a.k0(this.f42271p);
        c.a aVar = this.f42276u;
        if (aVar != null) {
            aVar.f(new InterfaceC0705k.a(str));
            this.f42276u = null;
        }
    }

    private Rational E() {
        if (this.f42260e != null) {
            return this.f42260e;
        }
        Rect D10 = this.f42256a.D();
        return new Rational(D10.width(), D10.height());
    }

    private static PointF F(C0706k0 c0706k0, Rational rational, Rational rational2, int i10, x.m mVar) {
        if (c0706k0.b() != null) {
            rational2 = c0706k0.b();
        }
        PointF a10 = mVar.a(c0706k0, i10);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                a10.y = (((float) ((doubleValue - 1.0d) / 2.0d)) + a10.y) * (1.0f / doubleValue);
            } else {
                float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                a10.x = (((float) ((doubleValue2 - 1.0d) / 2.0d)) + a10.x) * (1.0f / doubleValue2);
            }
        }
        return a10;
    }

    private static MeteringRectangle G(C0706k0 c0706k0, PointF pointF, Rect rect) {
        int width = (int) (rect.left + (pointF.x * rect.width()));
        int height = (int) (rect.top + (pointF.y * rect.height()));
        int a10 = ((int) (c0706k0.a() * rect.width())) / 2;
        int a11 = ((int) (c0706k0.a() * rect.height())) / 2;
        Rect rect2 = new Rect(width - a10, height - a11, width + a10, height + a11);
        rect2.left = a0(rect2.left, rect.right, rect.left);
        rect2.right = a0(rect2.right, rect.right, rect.left);
        rect2.top = a0(rect2.top, rect.bottom, rect.top);
        rect2.bottom = a0(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    private List H(List list, int i10, Rational rational, Rect rect, int i11) {
        if (list.isEmpty() || i10 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0706k0 c0706k0 = (C0706k0) it.next();
            if (arrayList.size() == i10) {
                break;
            }
            if (K(c0706k0)) {
                MeteringRectangle G10 = G(c0706k0, F(c0706k0, rational2, rational, i11, this.f42261f), rect);
                if (G10.getWidth() != 0 && G10.getHeight() != 0) {
                    arrayList.add(G10);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private boolean I() {
        return this.f42256a.O(1) == 1;
    }

    private static boolean K(C0706k0 c0706k0) {
        return c0706k0.c() >= 0.0f && c0706k0.c() <= 1.0f && c0706k0.d() >= 0.0f && c0706k0.d() <= 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object M(final c.a aVar) {
        this.f42257b.execute(new Runnable() { // from class: t.y1
            @Override // java.lang.Runnable
            public final void run() {
                C4601z1.this.L(aVar);
            }
        });
        return "cancelFocusAndMetering";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean N(int i10, long j10, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i10 || !C4584u.Y(totalCaptureResult, j10)) {
            return false;
        }
        w();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(boolean z10, c.a aVar) {
        this.f42256a.k0(this.f42278w);
        this.f42277v = z10;
        z(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object P(final boolean z10, final c.a aVar) {
        this.f42257b.execute(new Runnable() { // from class: t.t1
            @Override // java.lang.Runnable
            public final void run() {
                C4601z1.this.O(z10, aVar);
            }
        });
        return "enableExternalFlashAeMode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean Q(long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        boolean z10 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        AbstractC0700h0.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z10);
        if (z10 != this.f42277v || !C4584u.Y(totalCaptureResult, j10)) {
            return false;
        }
        AbstractC0700h0.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z10);
        if (aVar != null) {
            aVar.c(null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(long j10) {
        if (j10 == this.f42266k) {
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(final long j10) {
        this.f42257b.execute(new Runnable() { // from class: t.k1
            @Override // java.lang.Runnable
            public final void run() {
                C4601z1.this.R(j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean T(boolean z10, long j10, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (e0()) {
            if (!z10 || num == null) {
                this.f42268m = true;
                this.f42267l = true;
            } else if (this.f42263h.intValue() == 3) {
                if (num.intValue() == 4) {
                    this.f42268m = true;
                    this.f42267l = true;
                } else if (num.intValue() == 5) {
                    this.f42268m = false;
                    this.f42267l = true;
                }
            }
        }
        if (this.f42267l && C4584u.Y(totalCaptureResult, j10)) {
            v(this.f42268m);
            return true;
        }
        if (!this.f42263h.equals(num) && num != null) {
            this.f42263h = num;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(long j10) {
        if (j10 == this.f42266k) {
            this.f42268m = false;
            v(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(final long j10) {
        this.f42257b.execute(new Runnable() { // from class: t.r1
            @Override // java.lang.Runnable
            public final void run() {
                C4601z1.this.U(j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object X(final A.D d10, final long j10, final c.a aVar) {
        this.f42257b.execute(new Runnable() { // from class: t.l1
            @Override // java.lang.Runnable
            public final void run() {
                C4601z1.this.W(aVar, d10, j10);
            }
        });
        return "startFocusAndMetering";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object Z(final c.a aVar) {
        this.f42257b.execute(new Runnable() { // from class: t.u1
            @Override // java.lang.Runnable
            public final void run() {
                C4601z1.this.Y(aVar);
            }
        });
        return "triggerAePrecapture";
    }

    private static int a0(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i12), i11);
    }

    private boolean e0() {
        return this.f42272q.length > 0;
    }

    private void u() {
        ScheduledFuture scheduledFuture = this.f42265j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f42265j = null;
        }
    }

    private void w() {
        c.a aVar = this.f42276u;
        if (aVar != null) {
            aVar.c(null);
            this.f42276u = null;
        }
    }

    private void x() {
        ScheduledFuture scheduledFuture = this.f42264i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f42264i = null;
        }
    }

    private void z(final c.a aVar) {
        if (!this.f42259d) {
            if (aVar != null) {
                aVar.f(new InterfaceC0705k.a("Camera is not active."));
            }
        } else {
            final long t02 = this.f42256a.t0();
            C4584u.c cVar = new C4584u.c() { // from class: t.v1
                @Override // t.C4584u.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    boolean Q10;
                    Q10 = C4601z1.this.Q(t02, aVar, totalCaptureResult);
                    return Q10;
                }
            };
            this.f42278w = cVar;
            this.f42256a.z(cVar);
        }
    }

    int D() {
        return this.f42269n != 3 ? 4 : 3;
    }

    boolean J() {
        return this.f42277v;
    }

    void b0(boolean z10) {
        if (z10 == this.f42259d) {
            return;
        }
        this.f42259d = z10;
        if (this.f42259d) {
            return;
        }
        t();
    }

    public void c0(Rational rational) {
        this.f42260e = rational;
    }

    void d0(int i10) {
        this.f42269n = i10;
    }

    h8.d f0(A.D d10) {
        return g0(d10, 5000L);
    }

    h8.d g0(final A.D d10, final long j10) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.w1
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object X10;
                X10 = C4601z1.this.X(d10, j10, aVar);
                return X10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void W(c.a aVar, A.D d10, long j10) {
        if (!this.f42259d) {
            aVar.f(new InterfaceC0705k.a("Camera is not active."));
            return;
        }
        Rect D10 = this.f42256a.D();
        Rational E10 = E();
        List H10 = H(d10.c(), this.f42256a.H(), E10, D10, 1);
        List H11 = H(d10.b(), this.f42256a.G(), E10, D10, 2);
        List H12 = H(d10.d(), this.f42256a.I(), E10, D10, 4);
        if (H10.isEmpty() && H11.isEmpty() && H12.isEmpty()) {
            aVar.f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        B("Cancelled by another startFocusAndMetering()");
        C("Cancelled by another startFocusAndMetering()");
        x();
        this.f42275t = aVar;
        MeteringRectangle[] meteringRectangleArr = f42255x;
        A((MeteringRectangle[]) H10.toArray(meteringRectangleArr), (MeteringRectangle[]) H11.toArray(meteringRectangleArr), (MeteringRectangle[]) H12.toArray(meteringRectangleArr), d10, j10);
    }

    h8.d i0() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.s1
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object Z10;
                Z10 = C4601z1.this.Z(aVar);
                return Z10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void Y(c.a aVar) {
        AbstractC0700h0.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f42259d) {
            if (aVar != null) {
                aVar.f(new InterfaceC0705k.a("Camera is not active."));
                return;
            }
            return;
        }
        T.a aVar2 = new T.a();
        aVar2.v(this.f42269n);
        aVar2.w(true);
        C4301a.C0609a c0609a = new C4301a.C0609a();
        c0609a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c0609a.a());
        aVar2.c(new b(aVar));
        this.f42256a.r0(Collections.singletonList(aVar2.h()));
    }

    void k0(c.a aVar, boolean z10) {
        if (!this.f42259d) {
            if (aVar != null) {
                aVar.f(new InterfaceC0705k.a("Camera is not active."));
                return;
            }
            return;
        }
        T.a aVar2 = new T.a();
        aVar2.v(this.f42269n);
        aVar2.w(true);
        C4301a.C0609a c0609a = new C4301a.C0609a();
        c0609a.f(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z10) {
            c0609a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f42256a.M(1)), V.c.HIGH_PRIORITY_REQUIRED);
        }
        aVar2.e(c0609a.a());
        aVar2.c(new a(aVar));
        this.f42256a.r0(Collections.singletonList(aVar2.h()));
    }

    void p(C4301a.C0609a c0609a) {
        int D10 = this.f42262g ? 1 : D();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Object valueOf = Integer.valueOf(this.f42256a.O(D10));
        V.c cVar = V.c.REQUIRED;
        c0609a.g(key, valueOf, cVar);
        MeteringRectangle[] meteringRectangleArr = this.f42272q;
        if (meteringRectangleArr.length != 0) {
            c0609a.g(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, cVar);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f42273r;
        if (meteringRectangleArr2.length != 0) {
            c0609a.g(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, cVar);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f42274s;
        if (meteringRectangleArr3.length != 0) {
            c0609a.g(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, cVar);
        }
    }

    void q(boolean z10, boolean z11) {
        if (this.f42259d) {
            T.a aVar = new T.a();
            aVar.w(true);
            aVar.v(this.f42269n);
            C4301a.C0609a c0609a = new C4301a.C0609a();
            if (z10) {
                c0609a.f(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z11) {
                c0609a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(c0609a.a());
            this.f42256a.r0(Collections.singletonList(aVar.h()));
        }
    }

    h8.d r() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.x1
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object M10;
                M10 = C4601z1.this.M(aVar);
                return M10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void L(c.a aVar) {
        C("Cancelled by another cancelFocusAndMetering()");
        B("Cancelled by cancelFocusAndMetering()");
        this.f42276u = aVar;
        x();
        u();
        if (e0()) {
            q(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f42255x;
        this.f42272q = meteringRectangleArr;
        this.f42273r = meteringRectangleArr;
        this.f42274s = meteringRectangleArr;
        this.f42262g = false;
        final long t02 = this.f42256a.t0();
        if (this.f42276u != null) {
            final int O10 = this.f42256a.O(D());
            C4584u.c cVar = new C4584u.c() { // from class: t.m1
                @Override // t.C4584u.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    boolean N10;
                    N10 = C4601z1.this.N(O10, t02, totalCaptureResult);
                    return N10;
                }
            };
            this.f42271p = cVar;
            this.f42256a.z(cVar);
        }
    }

    void t() {
        L(null);
    }

    void v(boolean z10) {
        u();
        c.a aVar = this.f42275t;
        if (aVar != null) {
            aVar.c(A.E.a(z10));
            this.f42275t = null;
        }
    }

    h8.d y(final boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i10);
            return G.n.p(null);
        }
        if (this.f42256a.M(5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return G.n.p(null);
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.q1
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object P10;
                P10 = C4601z1.this.P(z10, aVar);
                return P10;
            }
        });
    }
}
