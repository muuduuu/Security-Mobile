package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import y0.f;

/* loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    private static final Interpolator f17838g = new LinearInterpolator();

    /* renamed from: h, reason: collision with root package name */
    private static final Interpolator f17839h = new W0.b();

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f17840i = {-16777216};

    /* renamed from: a, reason: collision with root package name */
    private final c f17841a;

    /* renamed from: b, reason: collision with root package name */
    private float f17842b;

    /* renamed from: c, reason: collision with root package name */
    private Resources f17843c;

    /* renamed from: d, reason: collision with root package name */
    private Animator f17844d;

    /* renamed from: e, reason: collision with root package name */
    float f17845e;

    /* renamed from: f, reason: collision with root package name */
    boolean f17846f;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f17847a;

        a(c cVar) {
            this.f17847a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.f17847a);
            b.this.b(floatValue, this.f17847a, false);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    class C0307b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f17849a;

        C0307b(c cVar) {
            this.f17849a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f17849a, true);
            this.f17849a.A();
            this.f17849a.l();
            b bVar = b.this;
            if (!bVar.f17846f) {
                bVar.f17845e += 1.0f;
                return;
            }
            bVar.f17846f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f17849a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f17845e = 0.0f;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final RectF f17851a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        final Paint f17852b;

        /* renamed from: c, reason: collision with root package name */
        final Paint f17853c;

        /* renamed from: d, reason: collision with root package name */
        final Paint f17854d;

        /* renamed from: e, reason: collision with root package name */
        float f17855e;

        /* renamed from: f, reason: collision with root package name */
        float f17856f;

        /* renamed from: g, reason: collision with root package name */
        float f17857g;

        /* renamed from: h, reason: collision with root package name */
        float f17858h;

        /* renamed from: i, reason: collision with root package name */
        int[] f17859i;

        /* renamed from: j, reason: collision with root package name */
        int f17860j;

        /* renamed from: k, reason: collision with root package name */
        float f17861k;

        /* renamed from: l, reason: collision with root package name */
        float f17862l;

        /* renamed from: m, reason: collision with root package name */
        float f17863m;

        /* renamed from: n, reason: collision with root package name */
        boolean f17864n;

        /* renamed from: o, reason: collision with root package name */
        Path f17865o;

        /* renamed from: p, reason: collision with root package name */
        float f17866p;

        /* renamed from: q, reason: collision with root package name */
        float f17867q;

        /* renamed from: r, reason: collision with root package name */
        int f17868r;

        /* renamed from: s, reason: collision with root package name */
        int f17869s;

        /* renamed from: t, reason: collision with root package name */
        int f17870t;

        /* renamed from: u, reason: collision with root package name */
        int f17871u;

        c() {
            Paint paint = new Paint();
            this.f17852b = paint;
            Paint paint2 = new Paint();
            this.f17853c = paint2;
            Paint paint3 = new Paint();
            this.f17854d = paint3;
            this.f17855e = 0.0f;
            this.f17856f = 0.0f;
            this.f17857g = 0.0f;
            this.f17858h = 5.0f;
            this.f17866p = 1.0f;
            this.f17870t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f17861k = this.f17855e;
            this.f17862l = this.f17856f;
            this.f17863m = this.f17857g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f17851a;
            float f10 = this.f17867q;
            float f11 = (this.f17858h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f17868r * this.f17866p) / 2.0f, this.f17858h / 2.0f);
            }
            rectF.set(rect.centerX() - f11, rect.centerY() - f11, rect.centerX() + f11, rect.centerY() + f11);
            float f12 = this.f17855e;
            float f13 = this.f17857g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f17856f + f13) * 360.0f) - f14;
            this.f17852b.setColor(this.f17871u);
            this.f17852b.setAlpha(this.f17870t);
            float f16 = this.f17858h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f17854d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f17852b);
            b(canvas, f14, f15, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f17864n) {
                Path path = this.f17865o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f17865o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f17868r * this.f17866p) / 2.0f;
                this.f17865o.moveTo(0.0f, 0.0f);
                this.f17865o.lineTo(this.f17868r * this.f17866p, 0.0f);
                Path path3 = this.f17865o;
                float f13 = this.f17868r;
                float f14 = this.f17866p;
                path3.lineTo((f13 * f14) / 2.0f, this.f17869s * f14);
                this.f17865o.offset((min + rectF.centerX()) - f12, rectF.centerY() + (this.f17858h / 2.0f));
                this.f17865o.close();
                this.f17853c.setColor(this.f17871u);
                this.f17853c.setAlpha(this.f17870t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f17865o, this.f17853c);
                canvas.restore();
            }
        }

        int c() {
            return this.f17870t;
        }

        float d() {
            return this.f17856f;
        }

        int e() {
            return this.f17859i[f()];
        }

        int f() {
            return (this.f17860j + 1) % this.f17859i.length;
        }

        float g() {
            return this.f17855e;
        }

        int h() {
            return this.f17859i[this.f17860j];
        }

        float i() {
            return this.f17862l;
        }

        float j() {
            return this.f17863m;
        }

        float k() {
            return this.f17861k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f17861k = 0.0f;
            this.f17862l = 0.0f;
            this.f17863m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i10) {
            this.f17870t = i10;
        }

        void o(float f10, float f11) {
            this.f17868r = (int) f10;
            this.f17869s = (int) f11;
        }

        void p(float f10) {
            if (f10 != this.f17866p) {
                this.f17866p = f10;
            }
        }

        void q(float f10) {
            this.f17867q = f10;
        }

        void r(int i10) {
            this.f17871u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f17852b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f17860j = i10;
            this.f17871u = this.f17859i[i10];
        }

        void u(int[] iArr) {
            this.f17859i = iArr;
            t(0);
        }

        void v(float f10) {
            this.f17856f = f10;
        }

        void w(float f10) {
            this.f17857g = f10;
        }

        void x(boolean z10) {
            if (this.f17864n != z10) {
                this.f17864n = z10;
            }
        }

        void y(float f10) {
            this.f17855e = f10;
        }

        void z(float f10) {
            this.f17858h = f10;
            this.f17852b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f17843c = ((Context) f.g(context)).getResources();
        c cVar = new c();
        this.f17841a = cVar;
        cVar.u(f17840i);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        float floor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((floor - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    private void h(float f10) {
        this.f17842b = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f17841a;
        float f14 = this.f17843c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f17841a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f17838g);
        ofFloat.addListener(new C0307b(cVar));
        this.f17844d = ofFloat;
    }

    void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.f17846f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float j10 = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                f11 = (f17839h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float k10 = cVar.k() + 0.79f;
                interpolation = k10 - (((1.0f - f17839h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = k10;
            }
            float f12 = j10 + (0.20999998f * f10);
            float f13 = (f10 + this.f17845e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(f11);
            cVar.w(f12);
            h(f13);
        }
    }

    public void d(boolean z10) {
        this.f17841a.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f17842b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f17841a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f17841a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f17841a.u(iArr);
        this.f17841a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f17841a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17841a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f17844d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f17841a.y(f10);
        this.f17841a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f17841a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f17841a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f17841a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f17844d.cancel();
        this.f17841a.A();
        if (this.f17841a.d() != this.f17841a.g()) {
            this.f17846f = true;
            this.f17844d.setDuration(666L);
            this.f17844d.start();
        } else {
            this.f17841a.t(0);
            this.f17841a.m();
            this.f17844d.setDuration(1332L);
            this.f17844d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f17844d.cancel();
        h(0.0f);
        this.f17841a.x(false);
        this.f17841a.t(0);
        this.f17841a.m();
        invalidateSelf();
    }
}
