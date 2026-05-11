package com.google.android.material.floatingactionbutton;

import Y7.n;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC1484a0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class b {

    /* renamed from: D, reason: collision with root package name */
    static final TimeInterpolator f27063D = I7.a.f4337c;

    /* renamed from: E, reason: collision with root package name */
    static final int[] f27064E = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: F, reason: collision with root package name */
    static final int[] f27065F = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: G, reason: collision with root package name */
    static final int[] f27066G = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: H, reason: collision with root package name */
    static final int[] f27067H = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: I, reason: collision with root package name */
    static final int[] f27068I = {R.attr.state_enabled};

    /* renamed from: J, reason: collision with root package name */
    static final int[] f27069J = new int[0];

    /* renamed from: C, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f27072C;

    /* renamed from: a, reason: collision with root package name */
    Y7.k f27073a;

    /* renamed from: b, reason: collision with root package name */
    Y7.g f27074b;

    /* renamed from: c, reason: collision with root package name */
    Drawable f27075c;

    /* renamed from: d, reason: collision with root package name */
    com.google.android.material.floatingactionbutton.a f27076d;

    /* renamed from: e, reason: collision with root package name */
    Drawable f27077e;

    /* renamed from: f, reason: collision with root package name */
    boolean f27078f;

    /* renamed from: h, reason: collision with root package name */
    float f27080h;

    /* renamed from: i, reason: collision with root package name */
    float f27081i;

    /* renamed from: j, reason: collision with root package name */
    float f27082j;

    /* renamed from: k, reason: collision with root package name */
    int f27083k;

    /* renamed from: l, reason: collision with root package name */
    private final com.google.android.material.internal.i f27084l;

    /* renamed from: m, reason: collision with root package name */
    private Animator f27085m;

    /* renamed from: n, reason: collision with root package name */
    private I7.g f27086n;

    /* renamed from: o, reason: collision with root package name */
    private I7.g f27087o;

    /* renamed from: p, reason: collision with root package name */
    private float f27088p;

    /* renamed from: r, reason: collision with root package name */
    private int f27090r;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList f27092t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList f27093u;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList f27094v;

    /* renamed from: w, reason: collision with root package name */
    final FloatingActionButton f27095w;

    /* renamed from: x, reason: collision with root package name */
    final X7.b f27096x;

    /* renamed from: g, reason: collision with root package name */
    boolean f27079g = true;

    /* renamed from: q, reason: collision with root package name */
    private float f27089q = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    private int f27091s = 0;

    /* renamed from: y, reason: collision with root package name */
    private final Rect f27097y = new Rect();

    /* renamed from: z, reason: collision with root package name */
    private final RectF f27098z = new RectF();

    /* renamed from: A, reason: collision with root package name */
    private final RectF f27070A = new RectF();

    /* renamed from: B, reason: collision with root package name */
    private final Matrix f27071B = new Matrix();

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f27099a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27100b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f27101c;

        a(boolean z10, k kVar) {
            this.f27100b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27099a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.f27091s = 0;
            b.this.f27085m = null;
            if (this.f27099a) {
                return;
            }
            FloatingActionButton floatingActionButton = b.this.f27095w;
            boolean z10 = this.f27100b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            k kVar = this.f27101c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f27095w.b(0, this.f27100b);
            b.this.f27091s = 1;
            b.this.f27085m = animator;
            this.f27099a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$b, reason: collision with other inner class name */
    class C0400b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27103a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f27104b;

        C0400b(boolean z10, k kVar) {
            this.f27103a = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.f27091s = 0;
            b.this.f27085m = null;
            k kVar = this.f27104b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f27095w.b(0, this.f27103a);
            b.this.f27091s = 2;
            b.this.f27085m = animator;
        }
    }

    class c extends I7.f {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            b.this.f27089q = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f27107a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f27108b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f27109c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f27110d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f27111e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f27112f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f27113g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Matrix f27114h;

        d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f27107a = f10;
            this.f27108b = f11;
            this.f27109c = f12;
            this.f27110d = f13;
            this.f27111e = f14;
            this.f27112f = f15;
            this.f27113g = f16;
            this.f27114h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.f27095w.setAlpha(I7.a.b(this.f27107a, this.f27108b, 0.0f, 0.2f, floatValue));
            b.this.f27095w.setScaleX(I7.a.a(this.f27109c, this.f27110d, floatValue));
            b.this.f27095w.setScaleY(I7.a.a(this.f27111e, this.f27110d, floatValue));
            b.this.f27089q = I7.a.a(this.f27112f, this.f27113g, floatValue);
            b.this.e(I7.a.a(this.f27112f, this.f27113g, floatValue), this.f27114h);
            b.this.f27095w.setImageMatrix(this.f27114h);
        }
    }

    class e implements TypeEvaluator {

        /* renamed from: a, reason: collision with root package name */
        FloatEvaluator f27116a = new FloatEvaluator();

        e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float floatValue = this.f27116a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            b.this.D();
            return true;
        }
    }

    private class g extends m {
        g() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            return 0.0f;
        }
    }

    private class h extends m {
        h() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            b bVar = b.this;
            return bVar.f27080h + bVar.f27081i;
        }
    }

    private class i extends m {
        i() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            b bVar = b.this;
            return bVar.f27080h + bVar.f27082j;
        }
    }

    interface j {
        void a();

        void b();
    }

    interface k {
        void a();

        void b();
    }

    private class l extends m {
        l() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            return b.this.f27080h;
        }
    }

    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f27123a;

        /* renamed from: b, reason: collision with root package name */
        private float f27124b;

        /* renamed from: c, reason: collision with root package name */
        private float f27125c;

        private m() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.c0((int) this.f27125c);
            this.f27123a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f27123a) {
                Y7.g gVar = b.this.f27074b;
                this.f27124b = gVar == null ? 0.0f : gVar.w();
                this.f27125c = a();
                this.f27123a = true;
            }
            b bVar = b.this;
            float f10 = this.f27124b;
            bVar.c0((int) (f10 + ((this.f27125c - f10) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ m(b bVar, a aVar) {
            this();
        }
    }

    b(FloatingActionButton floatingActionButton, X7.b bVar) {
        this.f27095w = floatingActionButton;
        this.f27096x = bVar;
        com.google.android.material.internal.i iVar = new com.google.android.material.internal.i();
        this.f27084l = iVar;
        iVar.a(f27064E, h(new i()));
        iVar.a(f27065F, h(new h()));
        iVar.a(f27066G, h(new h()));
        iVar.a(f27067H, h(new h()));
        iVar.a(f27068I, h(new l()));
        iVar.a(f27069J, h(new g()));
        this.f27088p = floatingActionButton.getRotation();
    }

    private boolean W() {
        return AbstractC1484a0.U(this.f27095w) && !this.f27095w.isInEditMode();
    }

    private void d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(float f10, Matrix matrix) {
        matrix.reset();
        if (this.f27095w.getDrawable() == null || this.f27090r == 0) {
            return;
        }
        RectF rectF = this.f27098z;
        RectF rectF2 = this.f27070A;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i10 = this.f27090r;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f27090r;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    private AnimatorSet f(I7.g gVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f27095w, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        gVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f27095w, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        gVar.e("scale").a(ofFloat2);
        d0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f27095w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        gVar.e("scale").a(ofFloat3);
        d0(ofFloat3);
        arrayList.add(ofFloat3);
        e(f12, this.f27071B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f27095w, new I7.e(), new c(), new Matrix(this.f27071B));
        gVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        I7.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet g(float f10, float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d(this.f27095w.getAlpha(), f10, this.f27095w.getScaleX(), f11, this.f27095w.getScaleY(), this.f27089q, f12, new Matrix(this.f27071B)));
        arrayList.add(ofFloat);
        I7.b.a(animatorSet, arrayList);
        animatorSet.setDuration(S7.a.d(this.f27095w.getContext(), H7.b.f3112D, this.f27095w.getContext().getResources().getInteger(H7.g.f3276b)));
        animatorSet.setInterpolator(S7.a.e(this.f27095w.getContext(), H7.b.f3113E, I7.a.f4336b));
        return animatorSet;
    }

    private ValueAnimator h(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f27063D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private ViewTreeObserver.OnPreDrawListener n() {
        if (this.f27072C == null) {
            this.f27072C = new f();
        }
        return this.f27072C;
    }

    abstract void A(int[] iArr);

    abstract void B(float f10, float f11, float f12);

    void C(Rect rect) {
        y0.f.h(this.f27077e, "Didn't initialize content background");
        if (!V()) {
            this.f27096x.c(this.f27077e);
        } else {
            this.f27096x.c(new InsetDrawable(this.f27077e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void D() {
        float rotation = this.f27095w.getRotation();
        if (this.f27088p != rotation) {
            this.f27088p = rotation;
            Z();
        }
    }

    void E() {
        ArrayList arrayList = this.f27094v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((j) it.next()).b();
            }
        }
    }

    void F() {
        ArrayList arrayList = this.f27094v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a();
            }
        }
    }

    abstract boolean G();

    void H(ColorStateList colorStateList) {
        Y7.g gVar = this.f27074b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f27076d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    void I(PorterDuff.Mode mode) {
        Y7.g gVar = this.f27074b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    final void J(float f10) {
        if (this.f27080h != f10) {
            this.f27080h = f10;
            B(f10, this.f27081i, this.f27082j);
        }
    }

    void K(boolean z10) {
        this.f27078f = z10;
    }

    final void L(I7.g gVar) {
        this.f27087o = gVar;
    }

    final void M(float f10) {
        if (this.f27081i != f10) {
            this.f27081i = f10;
            B(this.f27080h, f10, this.f27082j);
        }
    }

    final void N(float f10) {
        this.f27089q = f10;
        Matrix matrix = this.f27071B;
        e(f10, matrix);
        this.f27095w.setImageMatrix(matrix);
    }

    final void O(int i10) {
        if (this.f27090r != i10) {
            this.f27090r = i10;
            a0();
        }
    }

    void P(int i10) {
        this.f27083k = i10;
    }

    final void Q(float f10) {
        if (this.f27082j != f10) {
            this.f27082j = f10;
            B(this.f27080h, this.f27081i, f10);
        }
    }

    void R(ColorStateList colorStateList) {
        Drawable drawable = this.f27075c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, W7.b.d(colorStateList));
        }
    }

    void S(boolean z10) {
        this.f27079g = z10;
        b0();
    }

    final void T(Y7.k kVar) {
        this.f27073a = kVar;
        Y7.g gVar = this.f27074b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f27075c;
        if (obj instanceof n) {
            ((n) obj).setShapeAppearanceModel(kVar);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f27076d;
        if (aVar != null) {
            aVar.f(kVar);
        }
    }

    final void U(I7.g gVar) {
        this.f27086n = gVar;
    }

    abstract boolean V();

    final boolean X() {
        return !this.f27078f || this.f27095w.getSizeDimension() >= this.f27083k;
    }

    void Y(k kVar, boolean z10) {
        if (v()) {
            return;
        }
        Animator animator = this.f27085m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = this.f27086n == null;
        if (!W()) {
            this.f27095w.b(0, z10);
            this.f27095w.setAlpha(1.0f);
            this.f27095w.setScaleY(1.0f);
            this.f27095w.setScaleX(1.0f);
            N(1.0f);
            if (kVar != null) {
                kVar.a();
                return;
            }
            return;
        }
        if (this.f27095w.getVisibility() != 0) {
            this.f27095w.setAlpha(0.0f);
            this.f27095w.setScaleY(z11 ? 0.4f : 0.0f);
            this.f27095w.setScaleX(z11 ? 0.4f : 0.0f);
            N(z11 ? 0.4f : 0.0f);
        }
        I7.g gVar = this.f27086n;
        AnimatorSet f10 = gVar != null ? f(gVar, 1.0f, 1.0f, 1.0f) : g(1.0f, 1.0f, 1.0f);
        f10.addListener(new C0400b(z10, kVar));
        ArrayList arrayList = this.f27092t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f10.addListener((Animator.AnimatorListener) it.next());
            }
        }
        f10.start();
    }

    abstract void Z();

    final void a0() {
        N(this.f27089q);
    }

    final void b0() {
        Rect rect = this.f27097y;
        o(rect);
        C(rect);
        this.f27096x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void c0(float f10) {
        Y7.g gVar = this.f27074b;
        if (gVar != null) {
            gVar.W(f10);
        }
    }

    final Drawable i() {
        return this.f27077e;
    }

    abstract float j();

    boolean k() {
        return this.f27078f;
    }

    final I7.g l() {
        return this.f27087o;
    }

    float m() {
        return this.f27081i;
    }

    void o(Rect rect) {
        int sizeDimension = this.f27078f ? (this.f27083k - this.f27095w.getSizeDimension()) / 2 : 0;
        int max = Math.max(sizeDimension, (int) Math.ceil(this.f27079g ? j() + this.f27082j : 0.0f));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    float p() {
        return this.f27082j;
    }

    final Y7.k q() {
        return this.f27073a;
    }

    final I7.g r() {
        return this.f27086n;
    }

    void s(k kVar, boolean z10) {
        if (u()) {
            return;
        }
        Animator animator = this.f27085m;
        if (animator != null) {
            animator.cancel();
        }
        if (!W()) {
            this.f27095w.b(z10 ? 8 : 4, z10);
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        I7.g gVar = this.f27087o;
        AnimatorSet f10 = gVar != null ? f(gVar, 0.0f, 0.0f, 0.0f) : g(0.0f, 0.4f, 0.4f);
        f10.addListener(new a(z10, kVar));
        ArrayList arrayList = this.f27093u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f10.addListener((Animator.AnimatorListener) it.next());
            }
        }
        f10.start();
    }

    abstract void t(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10);

    boolean u() {
        return this.f27095w.getVisibility() == 0 ? this.f27091s == 1 : this.f27091s != 2;
    }

    boolean v() {
        return this.f27095w.getVisibility() != 0 ? this.f27091s == 2 : this.f27091s != 1;
    }

    abstract void w();

    void x() {
        Y7.g gVar = this.f27074b;
        if (gVar != null) {
            Y7.h.f(this.f27095w, gVar);
        }
        if (G()) {
            this.f27095w.getViewTreeObserver().addOnPreDrawListener(n());
        }
    }

    abstract void y();

    void z() {
        ViewTreeObserver viewTreeObserver = this.f27095w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f27072C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f27072C = null;
        }
    }
}
