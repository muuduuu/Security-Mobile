package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.AbstractC1484a0;
import com.google.android.material.textfield.TextInputLayout;
import z0.AbstractC5234c;
import z0.C5228A;

/* loaded from: classes2.dex */
class e extends com.google.android.material.textfield.f {

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f27650t = true;

    /* renamed from: e, reason: collision with root package name */
    private final TextWatcher f27651e;

    /* renamed from: f, reason: collision with root package name */
    private final View.OnFocusChangeListener f27652f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.e f27653g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout.f f27654h;

    /* renamed from: i, reason: collision with root package name */
    private final TextInputLayout.g f27655i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f27656j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC5234c.a f27657k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f27658l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f27659m;

    /* renamed from: n, reason: collision with root package name */
    private long f27660n;

    /* renamed from: o, reason: collision with root package name */
    private StateListDrawable f27661o;

    /* renamed from: p, reason: collision with root package name */
    private Y7.g f27662p;

    /* renamed from: q, reason: collision with root package name */
    private AccessibilityManager f27663q;

    /* renamed from: r, reason: collision with root package name */
    private ValueAnimator f27664r;

    /* renamed from: s, reason: collision with root package name */
    private ValueAnimator f27665s;

    class a extends com.google.android.material.internal.l {

        /* renamed from: com.google.android.material.textfield.e$a$a, reason: collision with other inner class name */
        class RunnableC0407a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f27667a;

            RunnableC0407a(AutoCompleteTextView autoCompleteTextView) {
                this.f27667a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f27667a.isPopupShowing();
                e.this.J(isPopupShowing);
                e.this.f27658l = isPopupShowing;
            }
        }

        a() {
        }

        @Override // com.google.android.material.internal.l, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView C10 = e.C(e.this.f27683a.getEditText());
            if (e.this.f27663q.isTouchExplorationEnabled() && e.H(C10) && !e.this.f27685c.hasFocus()) {
                C10.dismissDropDown();
            }
            C10.post(new RunnableC0407a(C10));
        }
    }

    class b implements AutoCompleteTextView.OnDismissListener {
        b() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            e.this.N();
            e.this.J(false);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e eVar = e.this;
            eVar.f27685c.setChecked(eVar.f27659m);
            e.this.f27665s.start();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            e.this.f27685c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.e$e, reason: collision with other inner class name */
    class ViewOnFocusChangeListenerC0408e implements View.OnFocusChangeListener {
        ViewOnFocusChangeListenerC0408e() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            e.this.f27683a.setEndIconActivated(z10);
            if (z10) {
                return;
            }
            e.this.J(false);
            e.this.f27658l = false;
        }
    }

    class f extends TextInputLayout.e {
        f(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            super.g(view, c5228a);
            if (!e.H(e.this.f27683a.getEditText())) {
                c5228a.q0(Spinner.class.getName());
            }
            if (c5228a.a0()) {
                c5228a.B0(null);
            }
        }

        @Override // androidx.core.view.C1483a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView C10 = e.C(e.this.f27683a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && e.this.f27663q.isEnabled() && !e.H(e.this.f27683a.getEditText())) {
                e.this.M(C10);
                e.this.N();
            }
        }
    }

    class g implements TextInputLayout.f {
        g() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView C10 = e.C(textInputLayout.getEditText());
            e.this.K(C10);
            e.this.y(C10);
            e.this.L(C10);
            C10.setThreshold(0);
            C10.removeTextChangedListener(e.this.f27651e);
            C10.addTextChangedListener(e.this.f27651e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!e.H(C10) && e.this.f27663q.isTouchExplorationEnabled()) {
                AbstractC1484a0.B0(e.this.f27685c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(e.this.f27653g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    class h implements TextInputLayout.g {

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f27676a;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f27676a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27676a.removeTextChangedListener(e.this.f27651e);
            }
        }

        h() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i10 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == e.this.f27652f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (e.f27650t) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
            if (i10 == 3) {
                textInputLayout.removeOnAttachStateChangeListener(e.this.f27656j);
                e.this.I();
            }
        }
    }

    class i implements View.OnAttachStateChangeListener {
        i() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            e.this.B();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            e.this.I();
        }
    }

    class j implements AbstractC5234c.a {
        j() {
        }

        @Override // z0.AbstractC5234c.a
        public void onTouchExplorationStateChanged(boolean z10) {
            AutoCompleteTextView autoCompleteTextView;
            TextInputLayout textInputLayout = e.this.f27683a;
            if (textInputLayout == null || (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) == null || e.H(autoCompleteTextView)) {
                return;
            }
            AbstractC1484a0.B0(e.this.f27685c, z10 ? 2 : 1);
        }
    }

    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.M((AutoCompleteTextView) e.this.f27683a.getEditText());
        }
    }

    class l implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f27681a;

        l(AutoCompleteTextView autoCompleteTextView) {
            this.f27681a = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (e.this.G()) {
                    e.this.f27658l = false;
                }
                e.this.M(this.f27681a);
                e.this.N();
            }
            return false;
        }
    }

    e(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f27651e = new a();
        this.f27652f = new ViewOnFocusChangeListenerC0408e();
        this.f27653g = new f(this.f27683a);
        this.f27654h = new g();
        this.f27655i = new h();
        this.f27656j = new i();
        this.f27657k = new j();
        this.f27658l = false;
        this.f27659m = false;
        this.f27660n = Long.MAX_VALUE;
    }

    private void A(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, Y7.g gVar) {
        LayerDrawable layerDrawable;
        int d10 = M7.a.d(autoCompleteTextView, H7.b.f3143p);
        Y7.g gVar2 = new Y7.g(gVar.C());
        int h10 = M7.a.h(i10, d10, 0.1f);
        gVar2.X(new ColorStateList(iArr, new int[]{h10, 0}));
        if (f27650t) {
            gVar2.setTint(d10);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h10, d10});
            Y7.g gVar3 = new Y7.g(gVar.C());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        AbstractC1484a0.u0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        TextInputLayout textInputLayout;
        if (this.f27663q == null || (textInputLayout = this.f27683a) == null || !AbstractC1484a0.T(textInputLayout)) {
            return;
        }
        AbstractC5234c.a(this.f27663q, this.f27657k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AutoCompleteTextView C(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator D(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(I7.a.f4335a);
        ofFloat.setDuration(i10);
        ofFloat.addUpdateListener(new d());
        return ofFloat;
    }

    private Y7.g E(float f10, float f11, float f12, int i10) {
        Y7.k m10 = Y7.k.a().B(f10).G(f10).s(f11).w(f11).m();
        Y7.g m11 = Y7.g.m(this.f27684b, f12);
        m11.setShapeAppearanceModel(m10);
        m11.Z(0, i10, 0, i10);
        return m11;
    }

    private void F() {
        this.f27665s = D(67, 0.0f, 1.0f);
        ValueAnimator D10 = D(50, 1.0f, 0.0f);
        this.f27664r = D10;
        D10.addListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f27660n;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean H(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        AccessibilityManager accessibilityManager = this.f27663q;
        if (accessibilityManager != null) {
            AbstractC5234c.b(accessibilityManager, this.f27657k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(boolean z10) {
        if (this.f27659m != z10) {
            this.f27659m = z10;
            this.f27665s.cancel();
            this.f27664r.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(AutoCompleteTextView autoCompleteTextView) {
        if (f27650t) {
            int boxBackgroundMode = this.f27683a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f27662p);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f27661o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new l(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f27652f);
        if (f27650t) {
            autoCompleteTextView.setOnDismissListener(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (G()) {
            this.f27658l = false;
        }
        if (this.f27658l) {
            this.f27658l = false;
            return;
        }
        if (f27650t) {
            J(!this.f27659m);
        } else {
            this.f27659m = !this.f27659m;
            this.f27685c.toggle();
        }
        if (!this.f27659m) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        this.f27658l = true;
        this.f27660n = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(AutoCompleteTextView autoCompleteTextView) {
        if (H(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f27683a.getBoxBackgroundMode();
        Y7.g boxBackground = this.f27683a.getBoxBackground();
        int d10 = M7.a.d(autoCompleteTextView, H7.b.f3139l);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            A(autoCompleteTextView, d10, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            z(autoCompleteTextView, d10, iArr, boxBackground);
        }
    }

    private void z(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, Y7.g gVar) {
        int boxBackgroundColor = this.f27683a.getBoxBackgroundColor();
        int[] iArr2 = {M7.a.h(i10, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f27650t) {
            AbstractC1484a0.u0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        Y7.g gVar2 = new Y7.g(gVar.C());
        gVar2.X(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int F10 = AbstractC1484a0.F(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int E10 = AbstractC1484a0.E(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        AbstractC1484a0.u0(autoCompleteTextView, layerDrawable);
        AbstractC1484a0.G0(autoCompleteTextView, F10, paddingTop, E10, paddingBottom);
    }

    void O(AutoCompleteTextView autoCompleteTextView) {
        if (!H(autoCompleteTextView) && this.f27683a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            y(autoCompleteTextView);
        }
    }

    @Override // com.google.android.material.textfield.f
    void a() {
        float dimensionPixelOffset = this.f27684b.getResources().getDimensionPixelOffset(H7.d.f3193b0);
        float dimensionPixelOffset2 = this.f27684b.getResources().getDimensionPixelOffset(H7.d.f3184U);
        int dimensionPixelOffset3 = this.f27684b.getResources().getDimensionPixelOffset(H7.d.f3185V);
        Y7.g E10 = E(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        Y7.g E11 = E(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f27662p = E10;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f27661o = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, E10);
        this.f27661o.addState(new int[0], E11);
        int i10 = this.f27686d;
        if (i10 == 0) {
            i10 = f27650t ? H7.e.f3226d : H7.e.f3227e;
        }
        this.f27683a.setEndIconDrawable(i10);
        TextInputLayout textInputLayout = this.f27683a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(H7.j.f3310g));
        this.f27683a.setEndIconOnClickListener(new k());
        this.f27683a.g(this.f27654h);
        this.f27683a.h(this.f27655i);
        F();
        this.f27663q = (AccessibilityManager) this.f27684b.getSystemService("accessibility");
        this.f27683a.addOnAttachStateChangeListener(this.f27656j);
        B();
    }

    @Override // com.google.android.material.textfield.f
    boolean b(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.f
    boolean d() {
        return true;
    }
}
