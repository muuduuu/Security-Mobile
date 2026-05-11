package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import s1.AbstractC4306a;

/* loaded from: classes2.dex */
final class d extends i {

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f27328l = {0, 1350, 2700, 4050};

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f27329m = {667, 2017, 3367, 4717};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f27330n = {1000, 2350, 3700, 5050};

    /* renamed from: o, reason: collision with root package name */
    private static final Property f27331o = new c(Float.class, "animationFraction");

    /* renamed from: p, reason: collision with root package name */
    private static final Property f27332p = new C0403d(Float.class, "completeEndFraction");

    /* renamed from: d, reason: collision with root package name */
    private ObjectAnimator f27333d;

    /* renamed from: e, reason: collision with root package name */
    private ObjectAnimator f27334e;

    /* renamed from: f, reason: collision with root package name */
    private final W0.b f27335f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f27336g;

    /* renamed from: h, reason: collision with root package name */
    private int f27337h;

    /* renamed from: i, reason: collision with root package name */
    private float f27338i;

    /* renamed from: j, reason: collision with root package name */
    private float f27339j;

    /* renamed from: k, reason: collision with root package name */
    AbstractC4306a f27340k;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            d dVar = d.this;
            dVar.f27337h = (dVar.f27337h + 4) % d.this.f27336g.f27320c.length;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            d.this.a();
            d dVar = d.this;
            AbstractC4306a abstractC4306a = dVar.f27340k;
            if (abstractC4306a != null) {
                abstractC4306a.a(dVar.f27371a);
            }
        }
    }

    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.o());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.t(f10.floatValue());
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$d, reason: collision with other inner class name */
    class C0403d extends Property {
        C0403d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.p());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.u(f10.floatValue());
        }
    }

    public d(e eVar) {
        super(1);
        this.f27337h = 0;
        this.f27340k = null;
        this.f27336g = eVar;
        this.f27335f = new W0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float o() {
        return this.f27338i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.f27339j;
    }

    private void q() {
        if (this.f27333d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<d, Float>) f27331o, 0.0f, 1.0f);
            this.f27333d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f27333d.setInterpolator(null);
            this.f27333d.setRepeatCount(-1);
            this.f27333d.addListener(new a());
        }
        if (this.f27334e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<d, Float>) f27332p, 0.0f, 1.0f);
            this.f27334e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f27334e.setInterpolator(this.f27335f);
            this.f27334e.addListener(new b());
        }
    }

    private void r(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            float b10 = b(i10, f27330n[i11], 333);
            if (b10 >= 0.0f && b10 <= 1.0f) {
                int i12 = i11 + this.f27337h;
                int[] iArr = this.f27336g.f27320c;
                int length = i12 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                this.f27373c[0] = I7.c.b().evaluate(this.f27335f.getInterpolation(b10), Integer.valueOf(M7.a.a(iArr[length], this.f27371a.getAlpha())), Integer.valueOf(M7.a.a(this.f27336g.f27320c[length2], this.f27371a.getAlpha()))).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(float f10) {
        this.f27339j = f10;
    }

    private void v(int i10) {
        float[] fArr = this.f27372b;
        float f10 = this.f27338i;
        fArr[0] = (f10 * 1520.0f) - 20.0f;
        fArr[1] = f10 * 1520.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float b10 = b(i10, f27328l[i11], 667);
            float[] fArr2 = this.f27372b;
            fArr2[1] = fArr2[1] + (this.f27335f.getInterpolation(b10) * 250.0f);
            float b11 = b(i10, f27329m[i11], 667);
            float[] fArr3 = this.f27372b;
            fArr3[0] = fArr3[0] + (this.f27335f.getInterpolation(b11) * 250.0f);
        }
        float[] fArr4 = this.f27372b;
        float f11 = fArr4[0];
        float f12 = fArr4[1];
        float f13 = f11 + ((f12 - f11) * this.f27339j);
        fArr4[0] = f13;
        fArr4[0] = f13 / 360.0f;
        fArr4[1] = f12 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.i
    void a() {
        ObjectAnimator objectAnimator = this.f27333d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void c() {
        s();
    }

    @Override // com.google.android.material.progressindicator.i
    public void d(AbstractC4306a abstractC4306a) {
        this.f27340k = abstractC4306a;
    }

    @Override // com.google.android.material.progressindicator.i
    void f() {
        ObjectAnimator objectAnimator = this.f27334e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f27371a.isVisible()) {
            this.f27334e.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    void g() {
        q();
        s();
        this.f27333d.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
        this.f27340k = null;
    }

    void s() {
        this.f27337h = 0;
        this.f27373c[0] = M7.a.a(this.f27336g.f27320c[0], this.f27371a.getAlpha());
        this.f27339j = 0.0f;
    }

    void t(float f10) {
        this.f27338i = f10;
        int i10 = (int) (f10 * 5400.0f);
        v(i10);
        r(i10);
        this.f27371a.invalidateSelf();
    }
}
