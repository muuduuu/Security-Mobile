package com.airbnb.lottie;

import O1.AbstractC1031b;
import O1.AbstractC1034e;
import O1.B;
import O1.C1038i;
import O1.E;
import O1.EnumC1030a;
import O1.H;
import O1.InterfaceC1032c;
import O1.J;
import O1.w;
import O1.x;
import Z1.v;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import c2.C1720c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class o extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: m0, reason: collision with root package name */
    private static final boolean f20052m0;

    /* renamed from: n0, reason: collision with root package name */
    private static final List f20053n0;

    /* renamed from: o0, reason: collision with root package name */
    private static final Executor f20054o0;

    /* renamed from: A, reason: collision with root package name */
    private Bitmap f20055A;

    /* renamed from: B, reason: collision with root package name */
    private Canvas f20056B;

    /* renamed from: C, reason: collision with root package name */
    private Rect f20057C;

    /* renamed from: D, reason: collision with root package name */
    private RectF f20058D;

    /* renamed from: E, reason: collision with root package name */
    private Paint f20059E;

    /* renamed from: F, reason: collision with root package name */
    private Rect f20060F;

    /* renamed from: G, reason: collision with root package name */
    private Rect f20061G;

    /* renamed from: H, reason: collision with root package name */
    private RectF f20062H;

    /* renamed from: I, reason: collision with root package name */
    private RectF f20063I;

    /* renamed from: J, reason: collision with root package name */
    private Matrix f20064J;

    /* renamed from: K, reason: collision with root package name */
    private Matrix f20065K;

    /* renamed from: X, reason: collision with root package name */
    private boolean f20066X;

    /* renamed from: Y, reason: collision with root package name */
    private EnumC1030a f20067Y;

    /* renamed from: Z, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f20068Z;

    /* renamed from: a, reason: collision with root package name */
    private C1038i f20069a;

    /* renamed from: b, reason: collision with root package name */
    private final b2.i f20070b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20071c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20072d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20073e;

    /* renamed from: f, reason: collision with root package name */
    private b f20074f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f20075g;

    /* renamed from: h, reason: collision with root package name */
    private T1.b f20076h;

    /* renamed from: h0, reason: collision with root package name */
    private final Semaphore f20077h0;

    /* renamed from: i, reason: collision with root package name */
    private String f20078i;

    /* renamed from: i0, reason: collision with root package name */
    private Handler f20079i0;

    /* renamed from: j, reason: collision with root package name */
    private T1.a f20080j;

    /* renamed from: j0, reason: collision with root package name */
    private Runnable f20081j0;

    /* renamed from: k, reason: collision with root package name */
    private Map f20082k;

    /* renamed from: k0, reason: collision with root package name */
    private final Runnable f20083k0;

    /* renamed from: l, reason: collision with root package name */
    String f20084l;

    /* renamed from: l0, reason: collision with root package name */
    private float f20085l0;

    /* renamed from: m, reason: collision with root package name */
    AbstractC1031b f20086m;

    /* renamed from: n, reason: collision with root package name */
    J f20087n;

    /* renamed from: o, reason: collision with root package name */
    private final p f20088o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20089p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20090q;

    /* renamed from: r, reason: collision with root package name */
    private X1.c f20091r;

    /* renamed from: s, reason: collision with root package name */
    private int f20092s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20093t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f20094u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f20095v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f20096w;

    /* renamed from: x, reason: collision with root package name */
    private H f20097x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f20098y;

    /* renamed from: z, reason: collision with root package name */
    private final Matrix f20099z;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a(C1038i c1038i);
    }

    private enum b {
        NONE,
        PLAY,
        RESUME
    }

    static {
        f20052m0 = Build.VERSION.SDK_INT <= 25;
        f20053n0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f20054o0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new b2.g());
    }

    public o() {
        b2.i iVar = new b2.i();
        this.f20070b = iVar;
        this.f20071c = true;
        this.f20072d = false;
        this.f20073e = false;
        this.f20074f = b.NONE;
        this.f20075g = new ArrayList();
        this.f20088o = new p();
        this.f20089p = false;
        this.f20090q = true;
        this.f20092s = 255;
        this.f20096w = false;
        this.f20097x = H.AUTOMATIC;
        this.f20098y = false;
        this.f20099z = new Matrix();
        this.f20066X = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: O1.u
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.airbnb.lottie.o.this.j0(valueAnimator);
            }
        };
        this.f20068Z = animatorUpdateListener;
        this.f20077h0 = new Semaphore(1);
        this.f20083k0 = new Runnable() { // from class: O1.v
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.o.this.l0();
            }
        };
        this.f20085l0 = -3.4028235E38f;
        iVar.addUpdateListener(animatorUpdateListener);
    }

    private void A(Canvas canvas) {
        X1.c cVar = this.f20091r;
        C1038i c1038i = this.f20069a;
        if (cVar == null || c1038i == null) {
            return;
        }
        this.f20099z.reset();
        if (!getBounds().isEmpty()) {
            this.f20099z.preScale(r2.width() / c1038i.b().width(), r2.height() / c1038i.b().height());
            this.f20099z.preTranslate(r2.left, r2.top);
        }
        cVar.f(canvas, this.f20099z, this.f20092s);
    }

    private void D(int i10, int i11) {
        Bitmap bitmap = this.f20055A;
        if (bitmap == null || bitmap.getWidth() < i10 || this.f20055A.getHeight() < i11) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f20055A = createBitmap;
            this.f20056B.setBitmap(createBitmap);
            this.f20066X = true;
            return;
        }
        if (this.f20055A.getWidth() > i10 || this.f20055A.getHeight() > i11) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f20055A, 0, 0, i10, i11);
            this.f20055A = createBitmap2;
            this.f20056B.setBitmap(createBitmap2);
            this.f20066X = true;
        }
    }

    private void D0(Canvas canvas, X1.c cVar) {
        if (this.f20069a == null || cVar == null) {
            return;
        }
        E();
        canvas.getMatrix(this.f20064J);
        canvas.getClipBounds(this.f20057C);
        y(this.f20057C, this.f20058D);
        this.f20064J.mapRect(this.f20058D);
        z(this.f20058D, this.f20057C);
        if (this.f20090q) {
            this.f20063I.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.c(this.f20063I, null, false);
        }
        this.f20064J.mapRect(this.f20063I);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        H0(this.f20063I, width, height);
        if (!d0()) {
            RectF rectF = this.f20063I;
            Rect rect = this.f20057C;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.f20063I.width());
        int ceil2 = (int) Math.ceil(this.f20063I.height());
        if (ceil <= 0 || ceil2 <= 0) {
            return;
        }
        D(ceil, ceil2);
        if (this.f20066X) {
            this.f20099z.set(this.f20064J);
            this.f20099z.preScale(width, height);
            Matrix matrix = this.f20099z;
            RectF rectF2 = this.f20063I;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f20055A.eraseColor(0);
            cVar.f(this.f20056B, this.f20099z, this.f20092s);
            this.f20064J.invert(this.f20065K);
            this.f20065K.mapRect(this.f20062H, this.f20063I);
            z(this.f20062H, this.f20061G);
        }
        this.f20060F.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.f20055A, this.f20060F, this.f20061G, this.f20059E);
    }

    private void E() {
        if (this.f20056B != null) {
            return;
        }
        this.f20056B = new Canvas();
        this.f20063I = new RectF();
        this.f20064J = new Matrix();
        this.f20065K = new Matrix();
        this.f20057C = new Rect();
        this.f20058D = new RectF();
        this.f20059E = new P1.a();
        this.f20060F = new Rect();
        this.f20061G = new Rect();
        this.f20062H = new RectF();
    }

    private void H0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    private Context L() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private T1.a M() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f20080j == null) {
            T1.a aVar = new T1.a(getCallback(), this.f20086m);
            this.f20080j = aVar;
            String str = this.f20084l;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f20080j;
    }

    private T1.b O() {
        T1.b bVar = this.f20076h;
        if (bVar != null && !bVar.b(L())) {
            this.f20076h = null;
        }
        if (this.f20076h == null) {
            this.f20076h = new T1.b(getCallback(), this.f20078i, null, this.f20069a.j());
        }
        return this.f20076h;
    }

    private boolean d0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r0).getClipChildren();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(U1.e eVar, Object obj, C1720c c1720c, C1038i c1038i) {
        s(eVar, obj, c1720c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(ValueAnimator valueAnimator) {
        if (G()) {
            invalidateSelf();
            return;
        }
        X1.c cVar = this.f20091r;
        if (cVar != null) {
            cVar.N(this.f20070b.o());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0() {
        X1.c cVar = this.f20091r;
        if (cVar == null) {
            return;
        }
        try {
            this.f20077h0.acquire();
            cVar.N(this.f20070b.o());
            if (f20052m0 && this.f20066X) {
                if (this.f20079i0 == null) {
                    this.f20079i0 = new Handler(Looper.getMainLooper());
                    this.f20081j0 = new Runnable() { // from class: O1.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.airbnb.lottie.o.this.k0();
                        }
                    };
                }
                this.f20079i0.post(this.f20081j0);
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.f20077h0.release();
            throw th;
        }
        this.f20077h0.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(C1038i c1038i) {
        A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(C1038i c1038i) {
        F0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(int i10, C1038i c1038i) {
        Q0(i10);
    }

    private boolean o1() {
        C1038i c1038i = this.f20069a;
        if (c1038i == null) {
            return false;
        }
        float f10 = this.f20085l0;
        float o10 = this.f20070b.o();
        this.f20085l0 = o10;
        return Math.abs(o10 - f10) * c1038i.d() >= 50.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(String str, C1038i c1038i) {
        W0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(int i10, C1038i c1038i) {
        V0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(float f10, C1038i c1038i) {
        X0(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(String str, C1038i c1038i) {
        Z0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(int i10, int i11, C1038i c1038i) {
        Y0(i10, i11);
    }

    private void u() {
        C1038i c1038i = this.f20069a;
        if (c1038i == null) {
            return;
        }
        X1.c cVar = new X1.c(this, v.a(c1038i), c1038i.k(), c1038i);
        this.f20091r = cVar;
        if (this.f20094u) {
            cVar.L(true);
        }
        this.f20091r.R(this.f20090q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(float f10, float f11, C1038i c1038i) {
        a1(f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(int i10, C1038i c1038i) {
        b1(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(String str, C1038i c1038i) {
        c1(str);
    }

    private void x() {
        C1038i c1038i = this.f20069a;
        if (c1038i == null) {
            return;
        }
        this.f20098y = this.f20097x.useSoftwareRendering(Build.VERSION.SDK_INT, c1038i.q(), c1038i.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(float f10, C1038i c1038i) {
        d1(f10);
    }

    private void y(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(float f10, C1038i c1038i) {
        g1(f10);
    }

    private void z(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public void A0() {
        if (this.f20091r == null) {
            this.f20075g.add(new a() { // from class: com.airbnb.lottie.k
                @Override // com.airbnb.lottie.o.a
                public final void a(C1038i c1038i) {
                    o.this.m0(c1038i);
                }
            });
            return;
        }
        x();
        if (t(L()) || Y() == 0) {
            if (isVisible()) {
                this.f20070b.z();
                this.f20074f = b.NONE;
            } else {
                this.f20074f = b.PLAY;
            }
        }
        if (t(L())) {
            return;
        }
        U1.h S10 = S();
        if (S10 != null) {
            Q0((int) S10.f10327b);
        } else {
            Q0((int) (a0() < 0.0f ? U() : T()));
        }
        this.f20070b.n();
        if (isVisible()) {
            return;
        }
        this.f20074f = b.NONE;
    }

    public void B(w wVar, boolean z10) {
        boolean a10 = this.f20088o.a(wVar, z10);
        if (this.f20069a == null || !a10) {
            return;
        }
        u();
    }

    public void B0() {
        this.f20070b.removeAllListeners();
    }

    public void C() {
        this.f20075g.clear();
        this.f20070b.n();
        if (isVisible()) {
            return;
        }
        this.f20074f = b.NONE;
    }

    public void C0(Animator.AnimatorListener animatorListener) {
        this.f20070b.removeListener(animatorListener);
    }

    public List E0(U1.e eVar) {
        if (this.f20091r == null) {
            b2.f.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f20091r.d(eVar, 0, arrayList, new U1.e(new String[0]));
        return arrayList;
    }

    public EnumC1030a F() {
        EnumC1030a enumC1030a = this.f20067Y;
        return enumC1030a != null ? enumC1030a : AbstractC1034e.d();
    }

    public void F0() {
        if (this.f20091r == null) {
            this.f20075g.add(new a() { // from class: com.airbnb.lottie.h
                @Override // com.airbnb.lottie.o.a
                public final void a(C1038i c1038i) {
                    o.this.n0(c1038i);
                }
            });
            return;
        }
        x();
        if (t(L()) || Y() == 0) {
            if (isVisible()) {
                this.f20070b.D();
                this.f20074f = b.NONE;
            } else {
                this.f20074f = b.RESUME;
            }
        }
        if (t(L())) {
            return;
        }
        Q0((int) (a0() < 0.0f ? U() : T()));
        this.f20070b.n();
        if (isVisible()) {
            return;
        }
        this.f20074f = b.NONE;
    }

    public boolean G() {
        return F() == EnumC1030a.ENABLED;
    }

    public void G0() {
        this.f20070b.E();
    }

    public Bitmap H(String str) {
        T1.b O10 = O();
        if (O10 != null) {
            return O10.a(str);
        }
        return null;
    }

    public boolean I() {
        return this.f20096w;
    }

    public void I0(boolean z10) {
        this.f20095v = z10;
    }

    public boolean J() {
        return this.f20090q;
    }

    public void J0(EnumC1030a enumC1030a) {
        this.f20067Y = enumC1030a;
    }

    public C1038i K() {
        return this.f20069a;
    }

    public void K0(boolean z10) {
        if (z10 != this.f20096w) {
            this.f20096w = z10;
            invalidateSelf();
        }
    }

    public void L0(boolean z10) {
        if (z10 != this.f20090q) {
            this.f20090q = z10;
            X1.c cVar = this.f20091r;
            if (cVar != null) {
                cVar.R(z10);
            }
            invalidateSelf();
        }
    }

    public boolean M0(C1038i c1038i) {
        if (this.f20069a == c1038i) {
            return false;
        }
        this.f20066X = true;
        w();
        this.f20069a = c1038i;
        u();
        this.f20070b.G(c1038i);
        g1(this.f20070b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f20075g).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(c1038i);
            }
            it.remove();
        }
        this.f20075g.clear();
        c1038i.v(this.f20093t);
        x();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public int N() {
        return (int) this.f20070b.p();
    }

    public void N0(String str) {
        this.f20084l = str;
        T1.a M10 = M();
        if (M10 != null) {
            M10.c(str);
        }
    }

    public void O0(AbstractC1031b abstractC1031b) {
        this.f20086m = abstractC1031b;
        T1.a aVar = this.f20080j;
        if (aVar != null) {
            aVar.d(abstractC1031b);
        }
    }

    public String P() {
        return this.f20078i;
    }

    public void P0(Map map) {
        if (map == this.f20082k) {
            return;
        }
        this.f20082k = map;
        invalidateSelf();
    }

    public x Q(String str) {
        C1038i c1038i = this.f20069a;
        if (c1038i == null) {
            return null;
        }
        return (x) c1038i.j().get(str);
    }

    public void Q0(final int i10) {
        if (this.f20069a == null) {
            this.f20075g.add(new a() { // from class: com.airbnb.lottie.n
                @Override // com.airbnb.lottie.o.a
                public final void a(C1038i c1038i) {
                    o.this.o0(i10, c1038i);
                }
            });
        } else {
            this.f20070b.H(i10);
        }
    }

    public boolean R() {
        return this.f20089p;
    }

    public void R0(boolean z10) {
        this.f20072d = z10;
    }

    public U1.h S() {
        Iterator it = f20053n0.iterator();
        U1.h hVar = null;
        while (it.hasNext()) {
            hVar = this.f20069a.l((String) it.next());
            if (hVar != null) {
                break;
            }
        }
        return hVar;
    }

    public void S0(InterfaceC1032c interfaceC1032c) {
        T1.b bVar = this.f20076h;
        if (bVar != null) {
            bVar.d(interfaceC1032c);
        }
    }

    public float T() {
        return this.f20070b.s();
    }

    public void T0(String str) {
        this.f20078i = str;
    }

    public float U() {
        return this.f20070b.v();
    }

    public void U0(boolean z10) {
        this.f20089p = z10;
    }

    public E V() {
        C1038i c1038i = this.f20069a;
        if (c1038i != null) {
            return c1038i.n();
        }
        return null;
    }

    public void V0(final int i10) {
        if (this.f20069a == null) {
            this.f20075g.add(new a() { // from class: com.airbnb.lottie.c
                @Override // com.airbnb.lottie.o.a
                public final void a(C1038i c1038i) {
                    o.this.q0(i10, c1038i);
                }
            });
        } else {
            this.f20070b.J(i10 + 0.99f);
        }
    }

    public float W() {
        return this.f20070b.o();
    }

    public void W0(final String str) {
        C1038i c1038i = this.f20069a;
        if (c1038i == null) {
            this.f20075g.add(new a() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.o.a
                public final void a(C1038i c1038i2) {
                    o.this.p0(str, c1038i2);
                }
            });
            return;
        }
        U1.h l10 = c1038i.l(str);
        if (l10 != null) {
            V0((int) (l10.f10327b + l10.f10328c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public H X() {
        return this.f20098y ? H.SOFTWARE : H.HARDWARE;
    }

    public void X0(final float f10) {
        C1038i c1038i = this.f20069a;
        if (c1038i == null) {
            this.f20075g.add(new a() { // from class: com.airbnb.lottie.f
                @Override // com.airbnb.lottie.o.a
                public final void a(C1038i c1038i2) {
                    o.this.r0(f10, c1038i2);
                }
            });
        } else {
            this.f20070b.J(b2.k.i(c1038i.p(), this.f20069a.f(), f10));
        }
    }

    public int Y() {
        return this.f20070b.getRepeatCount();
    }

    public void Y0(final int i10, final int i11) {
        if (this.f20069a == null) {
            this.f20075g.add(new a() { // from class: com.airbnb.lottie.g
                @Override // com.airbnb.lottie.o.a
                public final void a(C1038i c1038i) {
                    o.this.t0(i10, i11, c1038i);
                }
            });
        } else {
            this.f20070b.K(i10, i11 + 0.99f);
        }
    }

    public int Z() {
        return this.f20070b.getRepeatMode();
    }

    public void Z0(final String str) {
        C1038i c1038i = this.f20069a;
        if (c1038i == null) {
            this.f20075g.add(new a() { // from class: com.airbnb.lottie.a
                @Override // com.airbnb.lottie.o.a
                public final void a(C1038i c1038i2) {
                    o.this.s0(str, c1038i2);
                }
            });
            return;
        }
        U1.h l10 = c1038i.l(str);
        if (l10 != null) {
            int i10 = (int) l10.f10327b;
            Y0(i10, ((int) l10.f10328c) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public float a0() {
        return this.f20070b.w();
    }

    public void a1(final float f10, final float f11) {
        C1038i c1038i = this.f20069a;
        if (c1038i == null) {
            this.f20075g.add(new a() { // from class: com.airbnb.lottie.b
                @Override // com.airbnb.lottie.o.a
                public final void a(C1038i c1038i2) {
                    o.this.u0(f10, f11, c1038i2);
                }
            });
        } else {
            Y0((int) b2.k.i(c1038i.p(), this.f20069a.f(), f10), (int) b2.k.i(this.f20069a.p(), this.f20069a.f(), f11));
        }
    }

    public J b0() {
        return this.f20087n;
    }

    public void b1(final int i10) {
        if (this.f20069a == null) {
            this.f20075g.add(new a() { // from class: com.airbnb.lottie.d
                @Override // com.airbnb.lottie.o.a
                public final void a(C1038i c1038i) {
                    o.this.v0(i10, c1038i);
                }
            });
        } else {
            this.f20070b.L(i10);
        }
    }

    public Typeface c0(U1.c cVar) {
        Map map = this.f20082k;
        if (map != null) {
            String a10 = cVar.a();
            if (map.containsKey(a10)) {
                return (Typeface) map.get(a10);
            }
            String b10 = cVar.b();
            if (map.containsKey(b10)) {
                return (Typeface) map.get(b10);
            }
            String str = cVar.a() + "-" + cVar.c();
            if (map.containsKey(str)) {
                return (Typeface) map.get(str);
            }
        }
        T1.a M10 = M();
        if (M10 != null) {
            return M10.b(cVar);
        }
        return null;
    }

    public void c1(final String str) {
        C1038i c1038i = this.f20069a;
        if (c1038i == null) {
            this.f20075g.add(new a() { // from class: com.airbnb.lottie.j
                @Override // com.airbnb.lottie.o.a
                public final void a(C1038i c1038i2) {
                    o.this.w0(str, c1038i2);
                }
            });
            return;
        }
        U1.h l10 = c1038i.l(str);
        if (l10 != null) {
            b1((int) l10.f10327b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void d1(final float f10) {
        C1038i c1038i = this.f20069a;
        if (c1038i == null) {
            this.f20075g.add(new a() { // from class: com.airbnb.lottie.l
                @Override // com.airbnb.lottie.o.a
                public final void a(C1038i c1038i2) {
                    o.this.x0(f10, c1038i2);
                }
            });
        } else {
            b1((int) b2.k.i(c1038i.p(), this.f20069a.f(), f10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        X1.c cVar = this.f20091r;
        if (cVar == null) {
            return;
        }
        boolean G10 = G();
        if (G10) {
            try {
                this.f20077h0.acquire();
            } catch (InterruptedException unused) {
                if (AbstractC1034e.h()) {
                    AbstractC1034e.c("Drawable#draw");
                }
                if (!G10) {
                    return;
                }
                this.f20077h0.release();
                if (cVar.Q() == this.f20070b.o()) {
                    return;
                }
            } catch (Throwable th) {
                if (AbstractC1034e.h()) {
                    AbstractC1034e.c("Drawable#draw");
                }
                if (G10) {
                    this.f20077h0.release();
                    if (cVar.Q() != this.f20070b.o()) {
                        f20054o0.execute(this.f20083k0);
                    }
                }
                throw th;
            }
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("Drawable#draw");
        }
        if (G10 && o1()) {
            g1(this.f20070b.o());
        }
        if (this.f20073e) {
            try {
                if (this.f20098y) {
                    D0(canvas, cVar);
                } else {
                    A(canvas);
                }
            } catch (Throwable th2) {
                b2.f.b("Lottie crashed in draw!", th2);
            }
        } else if (this.f20098y) {
            D0(canvas, cVar);
        } else {
            A(canvas);
        }
        this.f20066X = false;
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("Drawable#draw");
        }
        if (G10) {
            this.f20077h0.release();
            if (cVar.Q() == this.f20070b.o()) {
                return;
            }
            f20054o0.execute(this.f20083k0);
        }
    }

    public boolean e0() {
        b2.i iVar = this.f20070b;
        if (iVar == null) {
            return false;
        }
        return iVar.isRunning();
    }

    public void e1(boolean z10) {
        if (this.f20094u == z10) {
            return;
        }
        this.f20094u = z10;
        X1.c cVar = this.f20091r;
        if (cVar != null) {
            cVar.L(z10);
        }
    }

    boolean f0() {
        if (isVisible()) {
            return this.f20070b.isRunning();
        }
        b bVar = this.f20074f;
        return bVar == b.PLAY || bVar == b.RESUME;
    }

    public void f1(boolean z10) {
        this.f20093t = z10;
        C1038i c1038i = this.f20069a;
        if (c1038i != null) {
            c1038i.v(z10);
        }
    }

    public boolean g0() {
        return this.f20095v;
    }

    public void g1(final float f10) {
        if (this.f20069a == null) {
            this.f20075g.add(new a() { // from class: com.airbnb.lottie.m
                @Override // com.airbnb.lottie.o.a
                public final void a(C1038i c1038i) {
                    o.this.y0(f10, c1038i);
                }
            });
            return;
        }
        if (AbstractC1034e.h()) {
            AbstractC1034e.b("Drawable#setProgress");
        }
        this.f20070b.H(this.f20069a.h(f10));
        if (AbstractC1034e.h()) {
            AbstractC1034e.c("Drawable#setProgress");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f20092s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C1038i c1038i = this.f20069a;
        if (c1038i == null) {
            return -1;
        }
        return c1038i.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C1038i c1038i = this.f20069a;
        if (c1038i == null) {
            return -1;
        }
        return c1038i.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h0(w wVar) {
        return this.f20088o.b(wVar);
    }

    public void h1(H h10) {
        this.f20097x = h10;
        x();
    }

    public void i1(int i10) {
        this.f20070b.setRepeatCount(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f20066X) {
            return;
        }
        this.f20066X = true;
        if ((!f20052m0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return e0();
    }

    public void j1(int i10) {
        this.f20070b.setRepeatMode(i10);
    }

    public void k1(boolean z10) {
        this.f20073e = z10;
    }

    public void l1(float f10) {
        this.f20070b.M(f10);
    }

    public void m1(J j10) {
        this.f20087n = j10;
    }

    public void n1(boolean z10) {
        this.f20070b.N(z10);
    }

    public boolean p1() {
        return this.f20082k == null && this.f20087n == null && this.f20069a.c().o() > 0;
    }

    public void r(Animator.AnimatorListener animatorListener) {
        this.f20070b.addListener(animatorListener);
    }

    public void s(final U1.e eVar, final Object obj, final C1720c c1720c) {
        X1.c cVar = this.f20091r;
        if (cVar == null) {
            this.f20075g.add(new a() { // from class: com.airbnb.lottie.e
                @Override // com.airbnb.lottie.o.a
                public final void a(C1038i c1038i) {
                    o.this.i0(eVar, obj, c1720c, c1038i);
                }
            });
            return;
        }
        boolean z10 = true;
        if (eVar == U1.e.f10321c) {
            cVar.h(obj, c1720c);
        } else if (eVar.d() != null) {
            eVar.d().h(obj, c1720c);
        } else {
            List E02 = E0(eVar);
            for (int i10 = 0; i10 < E02.size(); i10++) {
                ((U1.e) E02.get(i10)).d().h(obj, c1720c);
            }
            z10 = true ^ E02.isEmpty();
        }
        if (z10) {
            invalidateSelf();
            if (obj == B.f6857E) {
                g1(W());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f20092s = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        b2.f.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            b bVar = this.f20074f;
            if (bVar == b.PLAY) {
                A0();
            } else if (bVar == b.RESUME) {
                F0();
            }
        } else if (this.f20070b.isRunning()) {
            z0();
            this.f20074f = b.RESUME;
        } else if (isVisible) {
            this.f20074f = b.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        A0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        C();
    }

    public boolean t(Context context) {
        if (this.f20072d) {
            return true;
        }
        return this.f20071c && AbstractC1034e.f().a(context) == S1.a.STANDARD_MOTION;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void v() {
        this.f20075g.clear();
        this.f20070b.cancel();
        if (isVisible()) {
            return;
        }
        this.f20074f = b.NONE;
    }

    public void w() {
        if (this.f20070b.isRunning()) {
            this.f20070b.cancel();
            if (!isVisible()) {
                this.f20074f = b.NONE;
            }
        }
        this.f20069a = null;
        this.f20091r = null;
        this.f20076h = null;
        this.f20085l0 = -3.4028235E38f;
        this.f20070b.m();
        invalidateSelf();
    }

    public void z0() {
        this.f20075g.clear();
        this.f20070b.y();
        if (isVisible()) {
            return;
        }
        this.f20074f = b.NONE;
    }
}
