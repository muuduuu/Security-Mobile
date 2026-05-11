package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s1.AbstractC4306a;

/* loaded from: classes2.dex */
abstract class g extends Drawable implements Animatable {

    /* renamed from: o, reason: collision with root package name */
    private static final Property f27352o = new c(Float.class, "growFraction");

    /* renamed from: a, reason: collision with root package name */
    final Context f27353a;

    /* renamed from: b, reason: collision with root package name */
    final com.google.android.material.progressindicator.b f27354b;

    /* renamed from: d, reason: collision with root package name */
    private ValueAnimator f27356d;

    /* renamed from: e, reason: collision with root package name */
    private ValueAnimator f27357e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27358f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27359g;

    /* renamed from: h, reason: collision with root package name */
    private float f27360h;

    /* renamed from: i, reason: collision with root package name */
    private List f27361i;

    /* renamed from: j, reason: collision with root package name */
    private AbstractC4306a f27362j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f27363k;

    /* renamed from: l, reason: collision with root package name */
    private float f27364l;

    /* renamed from: n, reason: collision with root package name */
    private int f27366n;

    /* renamed from: m, reason: collision with root package name */
    final Paint f27365m = new Paint();

    /* renamed from: c, reason: collision with root package name */
    T7.a f27355c = new T7.a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            g.this.e();
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            g.super.setVisible(false, false);
            g.this.d();
        }
    }

    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(g gVar) {
            return Float.valueOf(gVar.g());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(g gVar, Float f10) {
            gVar.m(f10.floatValue());
        }
    }

    g(Context context, com.google.android.material.progressindicator.b bVar) {
        this.f27353a = context;
        this.f27354b = bVar;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        AbstractC4306a abstractC4306a = this.f27362j;
        if (abstractC4306a != null) {
            abstractC4306a.a(this);
        }
        List list = this.f27361i;
        if (list == null || this.f27363k) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC4306a) it.next()).a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        AbstractC4306a abstractC4306a = this.f27362j;
        if (abstractC4306a != null) {
            abstractC4306a.b(this);
        }
        List list = this.f27361i;
        if (list == null || this.f27363k) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC4306a) it.next()).b(this);
        }
    }

    private void f(ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f27363k;
        this.f27363k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f27363k = z10;
    }

    private void k() {
        if (this.f27356d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<g, Float>) f27352o, 0.0f, 1.0f);
            this.f27356d = ofFloat;
            ofFloat.setDuration(500L);
            this.f27356d.setInterpolator(I7.a.f4336b);
            o(this.f27356d);
        }
        if (this.f27357e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<g, Float>) f27352o, 1.0f, 0.0f);
            this.f27357e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f27357e.setInterpolator(I7.a.f4336b);
            n(this.f27357e);
        }
    }

    private void n(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f27357e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f27357e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f27356d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f27356d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    float g() {
        if (this.f27354b.b() || this.f27354b.a()) {
            return (this.f27359g || this.f27358f) ? this.f27360h : this.f27364l;
        }
        return 1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f27366n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h() {
        return p(false, false, false);
    }

    public boolean i() {
        ValueAnimator valueAnimator = this.f27357e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f27359g;
    }

    public boolean isRunning() {
        return j() || i();
    }

    public boolean j() {
        ValueAnimator valueAnimator = this.f27356d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f27358f;
    }

    public void l(AbstractC4306a abstractC4306a) {
        if (this.f27361i == null) {
            this.f27361i = new ArrayList();
        }
        if (this.f27361i.contains(abstractC4306a)) {
            return;
        }
        this.f27361i.add(abstractC4306a);
    }

    void m(float f10) {
        if (this.f27364l != f10) {
            this.f27364l = f10;
            invalidateSelf();
        }
    }

    public boolean p(boolean z10, boolean z11, boolean z12) {
        return q(z10, z11, z12 && this.f27355c.a(this.f27353a.getContentResolver()) > 0.0f);
    }

    boolean q(boolean z10, boolean z11, boolean z12) {
        k();
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator = z10 ? this.f27356d : this.f27357e;
        if (!z12) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                f(valueAnimator);
            }
            return super.setVisible(z10, false);
        }
        if (z12 && valueAnimator.isRunning()) {
            return false;
        }
        boolean z13 = !z10 || super.setVisible(z10, false);
        if (!(z10 ? this.f27354b.b() : this.f27354b.a())) {
            f(valueAnimator);
            return z13;
        }
        if (z11 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z13;
    }

    public boolean r(AbstractC4306a abstractC4306a) {
        List list = this.f27361i;
        if (list == null || !list.contains(abstractC4306a)) {
            return false;
        }
        this.f27361i.remove(abstractC4306a);
        if (!this.f27361i.isEmpty()) {
            return true;
        }
        this.f27361i = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f27366n = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f27365m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return p(z10, z11, true);
    }

    public void start() {
        q(true, true, false);
    }

    public void stop() {
        q(false, true, false);
    }
}
