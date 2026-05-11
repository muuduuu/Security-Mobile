package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.D;
import androidx.core.view.AbstractC1484a0;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27687a;

    /* renamed from: b, reason: collision with root package name */
    private final TextInputLayout f27688b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f27689c;

    /* renamed from: d, reason: collision with root package name */
    private int f27690d;

    /* renamed from: e, reason: collision with root package name */
    private FrameLayout f27691e;

    /* renamed from: f, reason: collision with root package name */
    private Animator f27692f;

    /* renamed from: g, reason: collision with root package name */
    private final float f27693g;

    /* renamed from: h, reason: collision with root package name */
    private int f27694h;

    /* renamed from: i, reason: collision with root package name */
    private int f27695i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f27696j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f27697k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f27698l;

    /* renamed from: m, reason: collision with root package name */
    private CharSequence f27699m;

    /* renamed from: n, reason: collision with root package name */
    private int f27700n;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f27701o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f27702p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27703q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f27704r;

    /* renamed from: s, reason: collision with root package name */
    private int f27705s;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f27706t;

    /* renamed from: u, reason: collision with root package name */
    private Typeface f27707u;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f27708a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f27709b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27710c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f27711d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f27708a = i10;
            this.f27709b = textView;
            this.f27710c = i11;
            this.f27711d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h.this.f27694h = this.f27708a;
            h.this.f27692f = null;
            TextView textView = this.f27709b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f27710c == 1 && h.this.f27698l != null) {
                    h.this.f27698l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f27711d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f27711d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f27711d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = h.this.f27688b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public h(TextInputLayout textInputLayout) {
        this.f27687a = textInputLayout.getContext();
        this.f27688b = textInputLayout;
        this.f27693g = r0.getResources().getDimensionPixelSize(H7.d.f3206j);
    }

    private void C(int i10, int i11) {
        TextView m10;
        TextView m11;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (m11 = m(i11)) != null) {
            m11.setVisibility(0);
            m11.setAlpha(1.0f);
        }
        if (i10 != 0 && (m10 = m(i10)) != null) {
            m10.setVisibility(4);
            if (i10 == 1) {
                m10.setText((CharSequence) null);
            }
        }
        this.f27694h = i11;
    }

    private void K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void M(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean N(TextView textView, CharSequence charSequence) {
        return AbstractC1484a0.U(this.f27688b) && this.f27688b.isEnabled() && !(this.f27695i == this.f27694h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void Q(int i10, int i11, boolean z10) {
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f27692f = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.f27703q, this.f27704r, 2, i10, i11);
            i(arrayList, this.f27697k, this.f27698l, 1, i10, i11);
            I7.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            C(i10, i11);
        }
        this.f27688b.r0();
        this.f27688b.w0(z10);
        this.f27688b.E0();
    }

    private boolean g() {
        return (this.f27689c == null || this.f27688b.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            list.add(j(textView, i12 == i10));
            if (i12 == i10) {
                list.add(k(textView));
            }
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(I7.a.f4335a);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f27693g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(I7.a.f4338d);
        return ofFloat;
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f27698l;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f27704r;
    }

    private int u(boolean z10, int i10, int i11) {
        return z10 ? this.f27687a.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean x(int i10) {
        return (i10 != 1 || this.f27698l == null || TextUtils.isEmpty(this.f27696j)) ? false : true;
    }

    boolean A() {
        return this.f27703q;
    }

    void B(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f27689c == null) {
            return;
        }
        if (!y(i10) || (frameLayout = this.f27691e) == null) {
            this.f27689c.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f27690d - 1;
        this.f27690d = i11;
        M(this.f27689c, i11);
    }

    void D(CharSequence charSequence) {
        this.f27699m = charSequence;
        TextView textView = this.f27698l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void E(boolean z10) {
        if (this.f27697k == z10) {
            return;
        }
        h();
        if (z10) {
            D d10 = new D(this.f27687a);
            this.f27698l = d10;
            d10.setId(H7.f.f3243N);
            this.f27698l.setTextAlignment(5);
            Typeface typeface = this.f27707u;
            if (typeface != null) {
                this.f27698l.setTypeface(typeface);
            }
            F(this.f27700n);
            G(this.f27701o);
            D(this.f27699m);
            this.f27698l.setVisibility(4);
            AbstractC1484a0.s0(this.f27698l, 1);
            e(this.f27698l, 0);
        } else {
            v();
            B(this.f27698l, 0);
            this.f27698l = null;
            this.f27688b.r0();
            this.f27688b.E0();
        }
        this.f27697k = z10;
    }

    void F(int i10) {
        this.f27700n = i10;
        TextView textView = this.f27698l;
        if (textView != null) {
            this.f27688b.d0(textView, i10);
        }
    }

    void G(ColorStateList colorStateList) {
        this.f27701o = colorStateList;
        TextView textView = this.f27698l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void H(int i10) {
        this.f27705s = i10;
        TextView textView = this.f27704r;
        if (textView != null) {
            androidx.core.widget.k.p(textView, i10);
        }
    }

    void I(boolean z10) {
        if (this.f27703q == z10) {
            return;
        }
        h();
        if (z10) {
            D d10 = new D(this.f27687a);
            this.f27704r = d10;
            d10.setId(H7.f.f3244O);
            this.f27704r.setTextAlignment(5);
            Typeface typeface = this.f27707u;
            if (typeface != null) {
                this.f27704r.setTypeface(typeface);
            }
            this.f27704r.setVisibility(4);
            AbstractC1484a0.s0(this.f27704r, 1);
            H(this.f27705s);
            J(this.f27706t);
            e(this.f27704r, 1);
            this.f27704r.setAccessibilityDelegate(new b());
        } else {
            w();
            B(this.f27704r, 1);
            this.f27704r = null;
            this.f27688b.r0();
            this.f27688b.E0();
        }
        this.f27703q = z10;
    }

    void J(ColorStateList colorStateList) {
        this.f27706t = colorStateList;
        TextView textView = this.f27704r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void L(Typeface typeface) {
        if (typeface != this.f27707u) {
            this.f27707u = typeface;
            K(this.f27698l, typeface);
            K(this.f27704r, typeface);
        }
    }

    void O(CharSequence charSequence) {
        h();
        this.f27696j = charSequence;
        this.f27698l.setText(charSequence);
        int i10 = this.f27694h;
        if (i10 != 1) {
            this.f27695i = 1;
        }
        Q(i10, this.f27695i, N(this.f27698l, charSequence));
    }

    void P(CharSequence charSequence) {
        h();
        this.f27702p = charSequence;
        this.f27704r.setText(charSequence);
        int i10 = this.f27694h;
        if (i10 != 2) {
            this.f27695i = 2;
        }
        Q(i10, this.f27695i, N(this.f27704r, charSequence));
    }

    void e(TextView textView, int i10) {
        if (this.f27689c == null && this.f27691e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f27687a);
            this.f27689c = linearLayout;
            linearLayout.setOrientation(0);
            this.f27688b.addView(this.f27689c, -1, -2);
            this.f27691e = new FrameLayout(this.f27687a);
            this.f27689c.addView(this.f27691e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f27688b.getEditText() != null) {
                f();
            }
        }
        if (y(i10)) {
            this.f27691e.setVisibility(0);
            this.f27691e.addView(textView);
        } else {
            this.f27689c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f27689c.setVisibility(0);
        this.f27690d++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f27688b.getEditText();
            boolean g10 = V7.c.g(this.f27687a);
            AbstractC1484a0.G0(this.f27689c, u(g10, H7.d.f3218v, AbstractC1484a0.F(editText)), u(g10, H7.d.f3219w, this.f27687a.getResources().getDimensionPixelSize(H7.d.f3217u)), u(g10, H7.d.f3218v, AbstractC1484a0.E(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f27692f;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return x(this.f27695i);
    }

    CharSequence n() {
        return this.f27699m;
    }

    CharSequence o() {
        return this.f27696j;
    }

    int p() {
        TextView textView = this.f27698l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList q() {
        TextView textView = this.f27698l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence r() {
        return this.f27702p;
    }

    View s() {
        return this.f27704r;
    }

    int t() {
        TextView textView = this.f27704r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void v() {
        this.f27696j = null;
        h();
        if (this.f27694h == 1) {
            if (!this.f27703q || TextUtils.isEmpty(this.f27702p)) {
                this.f27695i = 0;
            } else {
                this.f27695i = 2;
            }
        }
        Q(this.f27694h, this.f27695i, N(this.f27698l, BuildConfig.FLAVOR));
    }

    void w() {
        h();
        int i10 = this.f27694h;
        if (i10 == 2) {
            this.f27695i = 0;
        }
        Q(i10, this.f27695i, N(this.f27704r, BuildConfig.FLAVOR));
    }

    boolean y(int i10) {
        return i10 == 0 || i10 == 1;
    }

    boolean z() {
        return this.f27697k;
    }
}
