package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC1484a0;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    private static final int f16248r = ViewConfiguration.getTapTimeout();

    /* renamed from: c, reason: collision with root package name */
    final View f16251c;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f16252d;

    /* renamed from: g, reason: collision with root package name */
    private int f16255g;

    /* renamed from: h, reason: collision with root package name */
    private int f16256h;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16260l;

    /* renamed from: m, reason: collision with root package name */
    boolean f16261m;

    /* renamed from: n, reason: collision with root package name */
    boolean f16262n;

    /* renamed from: o, reason: collision with root package name */
    boolean f16263o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16264p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f16265q;

    /* renamed from: a, reason: collision with root package name */
    final C0278a f16249a = new C0278a();

    /* renamed from: b, reason: collision with root package name */
    private final Interpolator f16250b = new AccelerateInterpolator();

    /* renamed from: e, reason: collision with root package name */
    private float[] f16253e = {0.0f, 0.0f};

    /* renamed from: f, reason: collision with root package name */
    private float[] f16254f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i, reason: collision with root package name */
    private float[] f16257i = {0.0f, 0.0f};

    /* renamed from: j, reason: collision with root package name */
    private float[] f16258j = {0.0f, 0.0f};

    /* renamed from: k, reason: collision with root package name */
    private float[] f16259k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0278a {

        /* renamed from: a, reason: collision with root package name */
        private int f16266a;

        /* renamed from: b, reason: collision with root package name */
        private int f16267b;

        /* renamed from: c, reason: collision with root package name */
        private float f16268c;

        /* renamed from: d, reason: collision with root package name */
        private float f16269d;

        /* renamed from: j, reason: collision with root package name */
        private float f16275j;

        /* renamed from: k, reason: collision with root package name */
        private int f16276k;

        /* renamed from: e, reason: collision with root package name */
        private long f16270e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f16274i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f16271f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f16272g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f16273h = 0;

        C0278a() {
        }

        private float e(long j10) {
            if (j10 < this.f16270e) {
                return 0.0f;
            }
            long j11 = this.f16274i;
            if (j11 < 0 || j10 < j11) {
                return a.e((j10 - r0) / this.f16266a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f16275j;
            return (1.0f - f10) + (f10 * a.e((j10 - j11) / this.f16276k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f16271f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g10 = g(e(currentAnimationTimeMillis));
            long j10 = currentAnimationTimeMillis - this.f16271f;
            this.f16271f = currentAnimationTimeMillis;
            float f10 = j10 * g10;
            this.f16272g = (int) (this.f16268c * f10);
            this.f16273h = (int) (f10 * this.f16269d);
        }

        public int b() {
            return this.f16272g;
        }

        public int c() {
            return this.f16273h;
        }

        public int d() {
            float f10 = this.f16268c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f16269d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f16274i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f16274i + ((long) this.f16276k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f16276k = a.f((int) (currentAnimationTimeMillis - this.f16270e), 0, this.f16267b);
            this.f16275j = e(currentAnimationTimeMillis);
            this.f16274i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f16267b = i10;
        }

        public void k(int i10) {
            this.f16266a = i10;
        }

        public void l(float f10, float f11) {
            this.f16268c = f10;
            this.f16269d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f16270e = currentAnimationTimeMillis;
            this.f16274i = -1L;
            this.f16271f = currentAnimationTimeMillis;
            this.f16275j = 0.5f;
            this.f16272g = 0;
            this.f16273h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f16263o) {
                if (aVar.f16261m) {
                    aVar.f16261m = false;
                    aVar.f16249a.m();
                }
                C0278a c0278a = a.this.f16249a;
                if (c0278a.h() || !a.this.u()) {
                    a.this.f16263o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f16262n) {
                    aVar2.f16262n = false;
                    aVar2.c();
                }
                c0278a.a();
                a.this.j(c0278a.b(), c0278a.c());
                AbstractC1484a0.i0(a.this.f16251c, this);
            }
        }
    }

    public a(View view) {
        this.f16251c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f16248r);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.f16253e[i10], f11, this.f16254f[i10], f10);
        if (h10 == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f16257i[i10];
        float f14 = this.f16258j[i10];
        float f15 = this.f16259k[i10];
        float f16 = f13 * f12;
        return h10 > 0.0f ? e(h10 * f16, f14, f15) : -e((-h10) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f16255g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f16263o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            interpolation = -this.f16250b.getInterpolation(-g10);
        } else {
            if (g10 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f16250b.getInterpolation(g10);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f16261m) {
            this.f16263o = false;
        } else {
            this.f16249a.i();
        }
    }

    private void v() {
        int i10;
        if (this.f16252d == null) {
            this.f16252d = new b();
        }
        this.f16263o = true;
        this.f16261m = true;
        if (this.f16260l || (i10 = this.f16256h) <= 0) {
            this.f16252d.run();
        } else {
            AbstractC1484a0.j0(this.f16251c, this.f16252d, i10);
        }
        this.f16260l = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f16251c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f16256h = i10;
        return this;
    }

    public a l(int i10) {
        this.f16255g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f16264p && !z10) {
            i();
        }
        this.f16264p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f16254f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f16259k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f16264p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            i();
            return this.f16265q && this.f16263o;
        }
        this.f16262n = true;
        this.f16260l = false;
        this.f16249a.l(d(0, motionEvent.getX(), view.getWidth(), this.f16251c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f16251c.getHeight()));
        if (!this.f16263o && u()) {
            v();
        }
        if (this.f16265q) {
            return false;
        }
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f16258j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f16249a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f16249a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f16253e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f16257i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0278a c0278a = this.f16249a;
        int f10 = c0278a.f();
        int d10 = c0278a.d();
        return (f10 != 0 && b(f10)) || (d10 != 0 && a(d10));
    }
}
