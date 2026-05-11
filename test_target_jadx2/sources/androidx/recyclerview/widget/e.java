package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.AbstractC1484a0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class e extends RecyclerView.o implements RecyclerView.t {

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f17662D = {R.attr.state_pressed};

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f17663E = new int[0];

    /* renamed from: A, reason: collision with root package name */
    int f17664A;

    /* renamed from: B, reason: collision with root package name */
    private final Runnable f17665B;

    /* renamed from: C, reason: collision with root package name */
    private final RecyclerView.u f17666C;

    /* renamed from: a, reason: collision with root package name */
    private final int f17667a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17668b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f17669c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f17670d;

    /* renamed from: e, reason: collision with root package name */
    private final int f17671e;

    /* renamed from: f, reason: collision with root package name */
    private final int f17672f;

    /* renamed from: g, reason: collision with root package name */
    private final StateListDrawable f17673g;

    /* renamed from: h, reason: collision with root package name */
    private final Drawable f17674h;

    /* renamed from: i, reason: collision with root package name */
    private final int f17675i;

    /* renamed from: j, reason: collision with root package name */
    private final int f17676j;

    /* renamed from: k, reason: collision with root package name */
    int f17677k;

    /* renamed from: l, reason: collision with root package name */
    int f17678l;

    /* renamed from: m, reason: collision with root package name */
    float f17679m;

    /* renamed from: n, reason: collision with root package name */
    int f17680n;

    /* renamed from: o, reason: collision with root package name */
    int f17681o;

    /* renamed from: p, reason: collision with root package name */
    float f17682p;

    /* renamed from: s, reason: collision with root package name */
    private RecyclerView f17685s;

    /* renamed from: z, reason: collision with root package name */
    final ValueAnimator f17692z;

    /* renamed from: q, reason: collision with root package name */
    private int f17683q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f17684r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f17686t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f17687u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f17688v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f17689w = 0;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f17690x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    private final int[] f17691y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.q(500);
        }
    }

    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            e.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f17695a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f17695a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f17695a) {
                this.f17695a = false;
                return;
            }
            if (((Float) e.this.f17692z.getAnimatedValue()).floatValue() == 0.0f) {
                e eVar = e.this;
                eVar.f17664A = 0;
                eVar.y(0);
            } else {
                e eVar2 = e.this;
                eVar2.f17664A = 2;
                eVar2.v();
            }
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            e.this.f17669c.setAlpha(floatValue);
            e.this.f17670d.setAlpha(floatValue);
            e.this.v();
        }
    }

    e(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f17692z = ofFloat;
        this.f17664A = 0;
        this.f17665B = new a();
        this.f17666C = new b();
        this.f17669c = stateListDrawable;
        this.f17670d = drawable;
        this.f17673g = stateListDrawable2;
        this.f17674h = drawable2;
        this.f17671e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f17672f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f17675i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f17676j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f17667a = i11;
        this.f17668b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        j(recyclerView);
    }

    private void C(float f10) {
        int[] p10 = p();
        float max = Math.max(p10[0], Math.min(p10[1], f10));
        if (Math.abs(this.f17678l - max) < 2.0f) {
            return;
        }
        int x10 = x(this.f17679m, max, p10, this.f17685s.computeVerticalScrollRange(), this.f17685s.computeVerticalScrollOffset(), this.f17684r);
        if (x10 != 0) {
            this.f17685s.scrollBy(0, x10);
        }
        this.f17679m = max;
    }

    private void k() {
        this.f17685s.removeCallbacks(this.f17665B);
    }

    private void l() {
        this.f17685s.g1(this);
        this.f17685s.h1(this);
        this.f17685s.i1(this.f17666C);
        k();
    }

    private void m(Canvas canvas) {
        int i10 = this.f17684r;
        int i11 = this.f17675i;
        int i12 = this.f17681o;
        int i13 = this.f17680n;
        this.f17673g.setBounds(0, 0, i13, i11);
        this.f17674h.setBounds(0, 0, this.f17683q, this.f17676j);
        canvas.translate(0.0f, i10 - i11);
        this.f17674h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f17673g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void n(Canvas canvas) {
        int i10 = this.f17683q;
        int i11 = this.f17671e;
        int i12 = i10 - i11;
        int i13 = this.f17678l;
        int i14 = this.f17677k;
        int i15 = i13 - (i14 / 2);
        this.f17669c.setBounds(0, 0, i11, i14);
        this.f17670d.setBounds(0, 0, this.f17672f, this.f17684r);
        if (!s()) {
            canvas.translate(i12, 0.0f);
            this.f17670d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f17669c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f17670d.draw(canvas);
        canvas.translate(this.f17671e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f17669c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f17671e, -i15);
    }

    private int[] o() {
        int[] iArr = this.f17691y;
        int i10 = this.f17668b;
        iArr[0] = i10;
        iArr[1] = this.f17683q - i10;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f17690x;
        int i10 = this.f17668b;
        iArr[0] = i10;
        iArr[1] = this.f17684r - i10;
        return iArr;
    }

    private void r(float f10) {
        int[] o10 = o();
        float max = Math.max(o10[0], Math.min(o10[1], f10));
        if (Math.abs(this.f17681o - max) < 2.0f) {
            return;
        }
        int x10 = x(this.f17682p, max, o10, this.f17685s.computeHorizontalScrollRange(), this.f17685s.computeHorizontalScrollOffset(), this.f17683q);
        if (x10 != 0) {
            this.f17685s.scrollBy(x10, 0);
        }
        this.f17682p = max;
    }

    private boolean s() {
        return AbstractC1484a0.A(this.f17685s) == 1;
    }

    private void w(int i10) {
        k();
        this.f17685s.postDelayed(this.f17665B, i10);
    }

    private int x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void z() {
        this.f17685s.j(this);
        this.f17685s.m(this);
        this.f17685s.n(this.f17666C);
    }

    public void A() {
        int i10 = this.f17664A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f17692z.cancel();
            }
        }
        this.f17664A = 1;
        ValueAnimator valueAnimator = this.f17692z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f17692z.setDuration(500L);
        this.f17692z.setStartDelay(0L);
        this.f17692z.start();
    }

    void B(int i10, int i11) {
        int computeVerticalScrollRange = this.f17685s.computeVerticalScrollRange();
        int i12 = this.f17684r;
        this.f17686t = computeVerticalScrollRange - i12 > 0 && i12 >= this.f17667a;
        int computeHorizontalScrollRange = this.f17685s.computeHorizontalScrollRange();
        int i13 = this.f17683q;
        boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= this.f17667a;
        this.f17687u = z10;
        boolean z11 = this.f17686t;
        if (!z11 && !z10) {
            if (this.f17688v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f17678l = (int) ((f10 * (i11 + (f10 / 2.0f))) / computeVerticalScrollRange);
            this.f17677k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
        }
        if (this.f17687u) {
            float f11 = i13;
            this.f17681o = (int) ((f11 * (i10 + (f11 / 2.0f))) / computeHorizontalScrollRange);
            this.f17680n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
        }
        int i14 = this.f17688v;
        if (i14 == 0 || i14 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f17688v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean u10 = u(motionEvent.getX(), motionEvent.getY());
            boolean t10 = t(motionEvent.getX(), motionEvent.getY());
            if (u10 || t10) {
                if (t10) {
                    this.f17689w = 1;
                    this.f17682p = (int) motionEvent.getX();
                } else if (u10) {
                    this.f17689w = 2;
                    this.f17679m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f17688v == 2) {
            this.f17679m = 0.0f;
            this.f17682p = 0.0f;
            y(1);
            this.f17689w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f17688v == 2) {
            A();
            if (this.f17689w == 1) {
                r(motionEvent.getX());
            }
            if (this.f17689w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f17688v;
        if (i10 == 1) {
            boolean u10 = u(motionEvent.getX(), motionEvent.getY());
            boolean t10 = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u10 && !t10) {
                return false;
            }
            if (t10) {
                this.f17689w = 1;
                this.f17682p = (int) motionEvent.getX();
            } else if (u10) {
                this.f17689w = 2;
                this.f17679m = (int) motionEvent.getY();
            }
            y(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        if (this.f17683q != this.f17685s.getWidth() || this.f17684r != this.f17685s.getHeight()) {
            this.f17683q = this.f17685s.getWidth();
            this.f17684r = this.f17685s.getHeight();
            y(0);
        } else if (this.f17664A != 0) {
            if (this.f17686t) {
                n(canvas);
            }
            if (this.f17687u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f17685s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f17685s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i10) {
        int i11 = this.f17664A;
        if (i11 == 1) {
            this.f17692z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f17664A = 3;
        ValueAnimator valueAnimator = this.f17692z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f17692z.setDuration(i10);
        this.f17692z.start();
    }

    boolean t(float f10, float f11) {
        if (f11 >= this.f17684r - this.f17675i) {
            int i10 = this.f17681o;
            int i11 = this.f17680n;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f10, float f11) {
        if (!s() ? f10 >= this.f17683q - this.f17671e : f10 <= this.f17671e) {
            int i10 = this.f17678l;
            int i11 = this.f17677k;
            if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.f17685s.invalidate();
    }

    void y(int i10) {
        if (i10 == 2 && this.f17688v != 2) {
            this.f17669c.setState(f17662D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f17688v == 2 && i10 != 2) {
            this.f17669c.setState(f17663E);
            w(1200);
        } else if (i10 == 1) {
            w(1500);
        }
        this.f17688v = i10;
    }
}
