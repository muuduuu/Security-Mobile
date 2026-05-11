package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
class a extends com.google.android.material.textfield.f {

    /* renamed from: e, reason: collision with root package name */
    private final TextWatcher f27631e;

    /* renamed from: f, reason: collision with root package name */
    private final View.OnFocusChangeListener f27632f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.f f27633g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout.g f27634h;

    /* renamed from: i, reason: collision with root package name */
    private AnimatorSet f27635i;

    /* renamed from: j, reason: collision with root package name */
    private ValueAnimator f27636j;

    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    class C0405a implements TextWatcher {
        C0405a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f27683a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.i(aVar.m());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            a aVar = a.this;
            aVar.i(aVar.m());
        }
    }

    class c implements TextInputLayout.f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.this.m());
            editText.setOnFocusChangeListener(a.this.f27632f);
            a aVar = a.this;
            aVar.f27685c.setOnFocusChangeListener(aVar.f27632f);
            editText.removeTextChangedListener(a.this.f27631e);
            editText.addTextChangedListener(a.this.f27631e);
        }
    }

    class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a, reason: collision with other inner class name */
        class RunnableC0406a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EditText f27641a;

            RunnableC0406a(EditText editText) {
                this.f27641a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27641a.removeTextChangedListener(a.this.f27631e);
                a.this.i(true);
            }
        }

        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 2) {
                return;
            }
            editText.post(new RunnableC0406a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f27632f) {
                editText.setOnFocusChangeListener(null);
            }
            if (a.this.f27685c.getOnFocusChangeListener() == a.this.f27632f) {
                a.this.f27685c.setOnFocusChangeListener(null);
            }
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f27683a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f27683a.U();
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f27683a.setEndIconVisible(true);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f27683a.setEndIconVisible(false);
        }
    }

    class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f27685c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f27685c.setScaleX(floatValue);
            a.this.f27685c.setScaleY(floatValue);
        }
    }

    a(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f27631e = new C0405a();
        this.f27632f = new b();
        this.f27633g = new c();
        this.f27634h = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z10) {
        boolean z11 = this.f27683a.K() == z10;
        if (z10 && !this.f27635i.isRunning()) {
            this.f27636j.cancel();
            this.f27635i.start();
            if (z11) {
                this.f27635i.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f27635i.cancel();
        this.f27636j.start();
        if (z11) {
            this.f27636j.end();
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(I7.a.f4335a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    private ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(I7.a.f4338d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    private void l() {
        ValueAnimator k10 = k();
        ValueAnimator j10 = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f27635i = animatorSet;
        animatorSet.playTogether(k10, j10);
        this.f27635i.addListener(new f());
        ValueAnimator j11 = j(1.0f, 0.0f);
        this.f27636j = j11;
        j11.addListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        EditText editText = this.f27683a.getEditText();
        return editText != null && (editText.hasFocus() || this.f27685c.hasFocus()) && editText.getText().length() > 0;
    }

    @Override // com.google.android.material.textfield.f
    void a() {
        TextInputLayout textInputLayout = this.f27683a;
        int i10 = this.f27686d;
        if (i10 == 0) {
            i10 = H7.e.f3228f;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f27683a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(H7.j.f3308e));
        this.f27683a.setEndIconCheckable(false);
        this.f27683a.setEndIconOnClickListener(new e());
        this.f27683a.g(this.f27633g);
        this.f27683a.h(this.f27634h);
        l();
    }

    @Override // com.google.android.material.textfield.f
    void c(boolean z10) {
        if (this.f27683a.getSuffixText() == null) {
            return;
        }
        i(z10);
    }
}
