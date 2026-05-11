package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.h0;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1524v;
import com.google.android.material.internal.CheckableImageButton;
import z0.C5228A;

/* loaded from: classes2.dex */
class l extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f27728a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f27729b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f27730c;

    /* renamed from: d, reason: collision with root package name */
    private final CheckableImageButton f27731d;

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f27732e;

    /* renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f27733f;

    /* renamed from: g, reason: collision with root package name */
    private View.OnLongClickListener f27734g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27735h;

    l(TextInputLayout textInputLayout, h0 h0Var) {
        super(textInputLayout.getContext());
        this.f27728a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(H7.h.f3285h, (ViewGroup) this, false);
        this.f27731d = checkableImageButton;
        D d10 = new D(getContext());
        this.f27729b = d10;
        g(h0Var);
        f(h0Var);
        addView(checkableImageButton);
        addView(d10);
    }

    private void f(h0 h0Var) {
        this.f27729b.setVisibility(8);
        this.f27729b.setId(H7.f.f3246Q);
        this.f27729b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        AbstractC1484a0.s0(this.f27729b, 1);
        l(h0Var.n(H7.l.f3377C7, 0));
        if (h0Var.s(H7.l.f3386D7)) {
            m(h0Var.c(H7.l.f3386D7));
        }
        k(h0Var.p(H7.l.f3368B7));
    }

    private void g(h0 h0Var) {
        if (V7.c.g(getContext())) {
            AbstractC1524v.c((ViewGroup.MarginLayoutParams) this.f27731d.getLayoutParams(), 0);
        }
        q(null);
        r(null);
        if (h0Var.s(H7.l.f3422H7)) {
            this.f27732e = V7.c.b(getContext(), h0Var, H7.l.f3422H7);
        }
        if (h0Var.s(H7.l.f3431I7)) {
            this.f27733f = com.google.android.material.internal.o.f(h0Var.k(H7.l.f3431I7, -1), null);
        }
        if (h0Var.s(H7.l.f3413G7)) {
            p(h0Var.g(H7.l.f3413G7));
            if (h0Var.s(H7.l.f3404F7)) {
                o(h0Var.p(H7.l.f3404F7));
            }
            n(h0Var.a(H7.l.f3395E7, true));
        }
    }

    private void x() {
        int i10 = (this.f27730c == null || this.f27735h) ? 8 : 0;
        setVisibility((this.f27731d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f27729b.setVisibility(i10);
        this.f27728a.q0();
    }

    CharSequence a() {
        return this.f27730c;
    }

    ColorStateList b() {
        return this.f27729b.getTextColors();
    }

    TextView c() {
        return this.f27729b;
    }

    CharSequence d() {
        return this.f27731d.getContentDescription();
    }

    Drawable e() {
        return this.f27731d.getDrawable();
    }

    boolean h() {
        return this.f27731d.getVisibility() == 0;
    }

    void i(boolean z10) {
        this.f27735h = z10;
        x();
    }

    void j() {
        g.c(this.f27728a, this.f27731d, this.f27732e);
    }

    void k(CharSequence charSequence) {
        this.f27730c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f27729b.setText(charSequence);
        x();
    }

    void l(int i10) {
        androidx.core.widget.k.p(this.f27729b, i10);
    }

    void m(ColorStateList colorStateList) {
        this.f27729b.setTextColor(colorStateList);
    }

    void n(boolean z10) {
        this.f27731d.setCheckable(z10);
    }

    void o(CharSequence charSequence) {
        if (d() != charSequence) {
            this.f27731d.setContentDescription(charSequence);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        w();
    }

    void p(Drawable drawable) {
        this.f27731d.setImageDrawable(drawable);
        if (drawable != null) {
            g.a(this.f27728a, this.f27731d, this.f27732e, this.f27733f);
            u(true);
            j();
        } else {
            u(false);
            q(null);
            r(null);
            o(null);
        }
    }

    void q(View.OnClickListener onClickListener) {
        g.e(this.f27731d, onClickListener, this.f27734g);
    }

    void r(View.OnLongClickListener onLongClickListener) {
        this.f27734g = onLongClickListener;
        g.f(this.f27731d, onLongClickListener);
    }

    void s(ColorStateList colorStateList) {
        if (this.f27732e != colorStateList) {
            this.f27732e = colorStateList;
            g.a(this.f27728a, this.f27731d, colorStateList, this.f27733f);
        }
    }

    void t(PorterDuff.Mode mode) {
        if (this.f27733f != mode) {
            this.f27733f = mode;
            g.a(this.f27728a, this.f27731d, this.f27732e, mode);
        }
    }

    void u(boolean z10) {
        if (h() != z10) {
            this.f27731d.setVisibility(z10 ? 0 : 8);
            w();
            x();
        }
    }

    void v(C5228A c5228a) {
        if (this.f27729b.getVisibility() != 0) {
            c5228a.U0(this.f27731d);
        } else {
            c5228a.C0(this.f27729b);
            c5228a.U0(this.f27729b);
        }
    }

    void w() {
        EditText editText = this.f27728a.f27580e;
        if (editText == null) {
            return;
        }
        AbstractC1484a0.G0(this.f27729b, h() ? 0 : AbstractC1484a0.F(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(H7.d.f3220x), editText.getCompoundPaddingBottom());
    }
}
