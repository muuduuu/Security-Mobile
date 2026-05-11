package com.google.android.material.textfield;

import Y7.k;
import a8.AbstractC1367a;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C1409k;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.h0;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1524v;
import androidx.core.view.C1483a;
import com.google.android.material.internal.CheckableImageButton;
import h.AbstractC3220a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.conscrypt.BuildConfig;
import r1.AbstractC3996n;
import r1.C3986d;
import z0.C5228A;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: b1, reason: collision with root package name */
    private static final int f27537b1 = H7.k.f3336l;

    /* renamed from: A, reason: collision with root package name */
    private CharSequence f27538A;

    /* renamed from: A0, reason: collision with root package name */
    private PorterDuff.Mode f27539A0;

    /* renamed from: B, reason: collision with root package name */
    private final TextView f27540B;

    /* renamed from: B0, reason: collision with root package name */
    private Drawable f27541B0;

    /* renamed from: C, reason: collision with root package name */
    private boolean f27542C;

    /* renamed from: C0, reason: collision with root package name */
    private int f27543C0;

    /* renamed from: D, reason: collision with root package name */
    private CharSequence f27544D;

    /* renamed from: D0, reason: collision with root package name */
    private Drawable f27545D0;

    /* renamed from: E, reason: collision with root package name */
    private boolean f27546E;

    /* renamed from: E0, reason: collision with root package name */
    private View.OnLongClickListener f27547E0;

    /* renamed from: F, reason: collision with root package name */
    private Y7.g f27548F;

    /* renamed from: F0, reason: collision with root package name */
    private View.OnLongClickListener f27549F0;

    /* renamed from: G, reason: collision with root package name */
    private Y7.g f27550G;

    /* renamed from: G0, reason: collision with root package name */
    private final CheckableImageButton f27551G0;

    /* renamed from: H, reason: collision with root package name */
    private Y7.g f27552H;

    /* renamed from: H0, reason: collision with root package name */
    private ColorStateList f27553H0;

    /* renamed from: I, reason: collision with root package name */
    private Y7.k f27554I;

    /* renamed from: I0, reason: collision with root package name */
    private PorterDuff.Mode f27555I0;

    /* renamed from: J, reason: collision with root package name */
    private boolean f27556J;

    /* renamed from: J0, reason: collision with root package name */
    private ColorStateList f27557J0;

    /* renamed from: K, reason: collision with root package name */
    private final int f27558K;

    /* renamed from: K0, reason: collision with root package name */
    private ColorStateList f27559K0;

    /* renamed from: L0, reason: collision with root package name */
    private int f27560L0;

    /* renamed from: M0, reason: collision with root package name */
    private int f27561M0;

    /* renamed from: N0, reason: collision with root package name */
    private int f27562N0;

    /* renamed from: O0, reason: collision with root package name */
    private ColorStateList f27563O0;

    /* renamed from: P0, reason: collision with root package name */
    private int f27564P0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f27565Q0;

    /* renamed from: R0, reason: collision with root package name */
    private int f27566R0;

    /* renamed from: S0, reason: collision with root package name */
    private int f27567S0;

    /* renamed from: T0, reason: collision with root package name */
    private int f27568T0;

    /* renamed from: U0, reason: collision with root package name */
    private boolean f27569U0;

    /* renamed from: V0, reason: collision with root package name */
    final com.google.android.material.internal.b f27570V0;

    /* renamed from: W0, reason: collision with root package name */
    private boolean f27571W0;

    /* renamed from: X0, reason: collision with root package name */
    private boolean f27572X0;

    /* renamed from: Y0, reason: collision with root package name */
    private ValueAnimator f27573Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private boolean f27574Z0;

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f27575a;

    /* renamed from: a1, reason: collision with root package name */
    private boolean f27576a1;

    /* renamed from: b, reason: collision with root package name */
    private final l f27577b;

    /* renamed from: c, reason: collision with root package name */
    private final LinearLayout f27578c;

    /* renamed from: d, reason: collision with root package name */
    private final FrameLayout f27579d;

    /* renamed from: e, reason: collision with root package name */
    EditText f27580e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f27581f;

    /* renamed from: g, reason: collision with root package name */
    private int f27582g;

    /* renamed from: h, reason: collision with root package name */
    private int f27583h;

    /* renamed from: h0, reason: collision with root package name */
    private int f27584h0;

    /* renamed from: i, reason: collision with root package name */
    private int f27585i;

    /* renamed from: i0, reason: collision with root package name */
    private int f27586i0;

    /* renamed from: j, reason: collision with root package name */
    private int f27587j;

    /* renamed from: j0, reason: collision with root package name */
    private int f27588j0;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.android.material.textfield.h f27589k;

    /* renamed from: k0, reason: collision with root package name */
    private int f27590k0;

    /* renamed from: l, reason: collision with root package name */
    boolean f27591l;

    /* renamed from: l0, reason: collision with root package name */
    private int f27592l0;

    /* renamed from: m, reason: collision with root package name */
    private int f27593m;

    /* renamed from: m0, reason: collision with root package name */
    private int f27594m0;

    /* renamed from: n, reason: collision with root package name */
    private boolean f27595n;

    /* renamed from: n0, reason: collision with root package name */
    private int f27596n0;

    /* renamed from: o, reason: collision with root package name */
    private TextView f27597o;

    /* renamed from: o0, reason: collision with root package name */
    private final Rect f27598o0;

    /* renamed from: p, reason: collision with root package name */
    private int f27599p;

    /* renamed from: p0, reason: collision with root package name */
    private final Rect f27600p0;

    /* renamed from: q, reason: collision with root package name */
    private int f27601q;

    /* renamed from: q0, reason: collision with root package name */
    private final RectF f27602q0;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f27603r;

    /* renamed from: r0, reason: collision with root package name */
    private Typeface f27604r0;

    /* renamed from: s, reason: collision with root package name */
    private boolean f27605s;

    /* renamed from: s0, reason: collision with root package name */
    private Drawable f27606s0;

    /* renamed from: t, reason: collision with root package name */
    private TextView f27607t;

    /* renamed from: t0, reason: collision with root package name */
    private int f27608t0;

    /* renamed from: u, reason: collision with root package name */
    private ColorStateList f27609u;

    /* renamed from: u0, reason: collision with root package name */
    private final LinkedHashSet f27610u0;

    /* renamed from: v, reason: collision with root package name */
    private int f27611v;

    /* renamed from: v0, reason: collision with root package name */
    private int f27612v0;

    /* renamed from: w, reason: collision with root package name */
    private C3986d f27613w;

    /* renamed from: w0, reason: collision with root package name */
    private final SparseArray f27614w0;

    /* renamed from: x, reason: collision with root package name */
    private C3986d f27615x;

    /* renamed from: x0, reason: collision with root package name */
    private final CheckableImageButton f27616x0;

    /* renamed from: y, reason: collision with root package name */
    private ColorStateList f27617y;

    /* renamed from: y0, reason: collision with root package name */
    private final LinkedHashSet f27618y0;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f27619z;

    /* renamed from: z0, reason: collision with root package name */
    private ColorStateList f27620z0;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.w0(!r0.f27576a1);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f27591l) {
                textInputLayout.m0(editable.length());
            }
            if (TextInputLayout.this.f27605s) {
                TextInputLayout.this.A0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f27616x0.performClick();
            TextInputLayout.this.f27616x0.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f27580e.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f27570V0.d0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends C1483a {

        /* renamed from: d, reason: collision with root package name */
        private final TextInputLayout f27625d;

        public e(TextInputLayout textInputLayout) {
            this.f27625d = textInputLayout;
        }

        @Override // androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            super.g(view, c5228a);
            EditText editText = this.f27625d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f27625d.getHint();
            CharSequence error = this.f27625d.getError();
            CharSequence placeholderText = this.f27625d.getPlaceholderText();
            int counterMaxLength = this.f27625d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f27625d.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(hint);
            boolean N10 = this.f27625d.N();
            boolean isEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String charSequence = !isEmpty2 ? hint.toString() : BuildConfig.FLAVOR;
            this.f27625d.f27577b.v(c5228a);
            if (!isEmpty) {
                c5228a.S0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                c5228a.S0(charSequence);
                if (!N10 && placeholderText != null) {
                    c5228a.S0(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c5228a.S0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    c5228a.B0(charSequence);
                } else {
                    if (!isEmpty) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    c5228a.S0(charSequence);
                }
                c5228a.O0(isEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            c5228a.E0(counterMaxLength);
            if (z10) {
                if (isEmpty3) {
                    error = counterOverflowDescription;
                }
                c5228a.x0(error);
            }
            View s10 = this.f27625d.f27589k.s();
            if (s10 != null) {
                c5228a.C0(s10);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    static class h extends F0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        CharSequence f27626c;

        /* renamed from: d, reason: collision with root package name */
        boolean f27627d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f27628e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f27629f;

        /* renamed from: g, reason: collision with root package name */
        CharSequence f27630g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f27626c) + " hint=" + ((Object) this.f27628e) + " helperText=" + ((Object) this.f27629f) + " placeholderText=" + ((Object) this.f27630g) + "}";
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f27626c, parcel, i10);
            parcel.writeInt(this.f27627d ? 1 : 0);
            TextUtils.writeToParcel(this.f27628e, parcel, i10);
            TextUtils.writeToParcel(this.f27629f, parcel, i10);
            TextUtils.writeToParcel(this.f27630g, parcel, i10);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f27626c = (CharSequence) creator.createFromParcel(parcel);
            this.f27627d = parcel.readInt() == 1;
            this.f27628e = (CharSequence) creator.createFromParcel(parcel);
            this.f27629f = (CharSequence) creator.createFromParcel(parcel);
            this.f27630g = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3125Q);
    }

    private boolean A() {
        return this.f27542C && !TextUtils.isEmpty(this.f27544D) && (this.f27548F instanceof com.google.android.material.textfield.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(int i10) {
        if (i10 != 0 || this.f27569U0) {
            J();
        } else {
            h0();
        }
    }

    private void B() {
        Iterator it = this.f27610u0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    private void B0(boolean z10, boolean z11) {
        int defaultColor = this.f27563O0.getDefaultColor();
        int colorForState = this.f27563O0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f27563O0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f27594m0 = colorForState2;
        } else if (z11) {
            this.f27594m0 = colorForState;
        } else {
            this.f27594m0 = defaultColor;
        }
    }

    private void C(int i10) {
        Iterator it = this.f27618y0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this, i10);
        }
    }

    private void C0() {
        if (this.f27580e == null) {
            return;
        }
        AbstractC1484a0.G0(this.f27540B, getContext().getResources().getDimensionPixelSize(H7.d.f3220x), this.f27580e.getPaddingTop(), (K() || L()) ? 0 : AbstractC1484a0.E(this.f27580e), this.f27580e.getPaddingBottom());
    }

    private void D(Canvas canvas) {
        Y7.g gVar;
        if (this.f27552H == null || (gVar = this.f27550G) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f27580e.isFocused()) {
            Rect bounds = this.f27552H.getBounds();
            Rect bounds2 = this.f27550G.getBounds();
            float x10 = this.f27570V0.x();
            int centerX = bounds2.centerX();
            bounds.left = I7.a.c(centerX, bounds2.left, x10);
            bounds.right = I7.a.c(centerX, bounds2.right, x10);
            this.f27552H.draw(canvas);
        }
    }

    private void D0() {
        int visibility = this.f27540B.getVisibility();
        int i10 = (this.f27538A == null || N()) ? 8 : 0;
        if (visibility != i10) {
            getEndIconDelegate().c(i10 == 0);
        }
        t0();
        this.f27540B.setVisibility(i10);
        q0();
    }

    private void E(Canvas canvas) {
        if (this.f27542C) {
            this.f27570V0.l(canvas);
        }
    }

    private void F(boolean z10) {
        ValueAnimator valueAnimator = this.f27573Y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f27573Y0.cancel();
        }
        if (z10 && this.f27572X0) {
            k(0.0f);
        } else {
            this.f27570V0.d0(0.0f);
        }
        if (A() && ((com.google.android.material.textfield.d) this.f27548F).i0()) {
            x();
        }
        this.f27569U0 = true;
        J();
        this.f27577b.i(true);
        D0();
    }

    private int G(int i10, boolean z10) {
        int compoundPaddingLeft = i10 + this.f27580e.getCompoundPaddingLeft();
        return (getPrefixText() == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    private int H(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f27580e.getCompoundPaddingRight();
        return (getPrefixText() == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    private boolean I() {
        return this.f27612v0 != 0;
    }

    private void J() {
        TextView textView = this.f27607t;
        if (textView == null || !this.f27605s) {
            return;
        }
        textView.setText((CharSequence) null);
        AbstractC3996n.a(this.f27575a, this.f27615x);
        this.f27607t.setVisibility(4);
    }

    private boolean L() {
        return this.f27551G0.getVisibility() == 0;
    }

    private boolean P() {
        return this.f27584h0 == 1 && this.f27580e.getMinLines() <= 1;
    }

    private void Q() {
        o();
        Z();
        E0();
        j0();
        j();
        if (this.f27584h0 != 0) {
            v0();
        }
    }

    private void R() {
        if (A()) {
            RectF rectF = this.f27602q0;
            this.f27570V0.o(rectF, this.f27580e.getWidth(), this.f27580e.getGravity());
            n(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f27588j0);
            ((com.google.android.material.textfield.d) this.f27548F).l0(rectF);
        }
    }

    private void S() {
        if (!A() || this.f27569U0) {
            return;
        }
        x();
        R();
    }

    private static void T(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                T((ViewGroup) childAt, z10);
            }
        }
    }

    private void X() {
        TextView textView = this.f27607t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void Z() {
        if (g0()) {
            AbstractC1484a0.u0(this.f27580e, this.f27548F);
        }
    }

    private static void a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean P10 = AbstractC1484a0.P(checkableImageButton);
        boolean z10 = onLongClickListener != null;
        boolean z11 = P10 || z10;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(P10);
        checkableImageButton.setPressable(P10);
        checkableImageButton.setLongClickable(z10);
        AbstractC1484a0.B0(checkableImageButton, z11 ? 1 : 2);
    }

    private static void b0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private static void c0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private boolean e0() {
        return (this.f27551G0.getVisibility() == 0 || ((I() && K()) || this.f27538A != null)) && this.f27578c.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f27577b.getMeasuredWidth() > 0;
    }

    private boolean g0() {
        EditText editText = this.f27580e;
        return (editText == null || this.f27548F == null || editText.getBackground() != null || this.f27584h0 == 0) ? false : true;
    }

    private com.google.android.material.textfield.f getEndIconDelegate() {
        com.google.android.material.textfield.f fVar = (com.google.android.material.textfield.f) this.f27614w0.get(this.f27612v0);
        return fVar != null ? fVar : (com.google.android.material.textfield.f) this.f27614w0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f27551G0.getVisibility() == 0) {
            return this.f27551G0;
        }
        if (I() && K()) {
            return this.f27616x0;
        }
        return null;
    }

    private void h0() {
        if (this.f27607t == null || !this.f27605s || TextUtils.isEmpty(this.f27603r)) {
            return;
        }
        this.f27607t.setText(this.f27603r);
        AbstractC3996n.a(this.f27575a, this.f27613w);
        this.f27607t.setVisibility(0);
        this.f27607t.bringToFront();
        announceForAccessibility(this.f27603r);
    }

    private void i() {
        TextView textView = this.f27607t;
        if (textView != null) {
            this.f27575a.addView(textView);
            this.f27607t.setVisibility(0);
        }
    }

    private void i0(boolean z10) {
        if (!z10 || getEndIconDrawable() == null) {
            com.google.android.material.textfield.g.a(this, this.f27616x0, this.f27620z0, this.f27539A0);
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.l(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.h(mutate, this.f27589k.p());
        this.f27616x0.setImageDrawable(mutate);
    }

    private void j() {
        if (this.f27580e == null || this.f27584h0 != 1) {
            return;
        }
        if (V7.c.h(getContext())) {
            EditText editText = this.f27580e;
            AbstractC1484a0.G0(editText, AbstractC1484a0.F(editText), getResources().getDimensionPixelSize(H7.d.f3214r), AbstractC1484a0.E(this.f27580e), getResources().getDimensionPixelSize(H7.d.f3213q));
        } else if (V7.c.g(getContext())) {
            EditText editText2 = this.f27580e;
            AbstractC1484a0.G0(editText2, AbstractC1484a0.F(editText2), getResources().getDimensionPixelSize(H7.d.f3212p), AbstractC1484a0.E(this.f27580e), getResources().getDimensionPixelSize(H7.d.f3211o));
        }
    }

    private void j0() {
        if (this.f27584h0 == 1) {
            if (V7.c.h(getContext())) {
                this.f27586i0 = getResources().getDimensionPixelSize(H7.d.f3216t);
            } else if (V7.c.g(getContext())) {
                this.f27586i0 = getResources().getDimensionPixelSize(H7.d.f3215s);
            }
        }
    }

    private void k0(Rect rect) {
        Y7.g gVar = this.f27550G;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.f27590k0, rect.right, i10);
        }
        Y7.g gVar2 = this.f27552H;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.f27592l0, rect.right, i11);
        }
    }

    private void l() {
        Y7.g gVar = this.f27548F;
        if (gVar == null) {
            return;
        }
        Y7.k C10 = gVar.C();
        Y7.k kVar = this.f27554I;
        if (C10 != kVar) {
            this.f27548F.setShapeAppearanceModel(kVar);
            p0();
        }
        if (v()) {
            this.f27548F.b0(this.f27588j0, this.f27594m0);
        }
        int p10 = p();
        this.f27596n0 = p10;
        this.f27548F.X(ColorStateList.valueOf(p10));
        if (this.f27612v0 == 3) {
            this.f27580e.getBackground().invalidateSelf();
        }
        m();
        invalidate();
    }

    private void l0() {
        if (this.f27597o != null) {
            EditText editText = this.f27580e;
            m0(editText == null ? 0 : editText.getText().length());
        }
    }

    private void m() {
        if (this.f27550G == null || this.f27552H == null) {
            return;
        }
        if (w()) {
            this.f27550G.X(this.f27580e.isFocused() ? ColorStateList.valueOf(this.f27560L0) : ColorStateList.valueOf(this.f27594m0));
            this.f27552H.X(ColorStateList.valueOf(this.f27594m0));
        }
        invalidate();
    }

    private void n(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f27558K;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private static void n0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? H7.j.f3306c : H7.j.f3305b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void o() {
        int i10 = this.f27584h0;
        if (i10 == 0) {
            this.f27548F = null;
            this.f27550G = null;
            this.f27552H = null;
            return;
        }
        if (i10 == 1) {
            this.f27548F = new Y7.g(this.f27554I);
            this.f27550G = new Y7.g();
            this.f27552H = new Y7.g();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.f27584h0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f27542C || (this.f27548F instanceof com.google.android.material.textfield.d)) {
                this.f27548F = new Y7.g(this.f27554I);
            } else {
                this.f27548F = new com.google.android.material.textfield.d(this.f27554I);
            }
            this.f27550G = null;
            this.f27552H = null;
        }
    }

    private void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f27597o;
        if (textView != null) {
            d0(textView, this.f27595n ? this.f27599p : this.f27601q);
            if (!this.f27595n && (colorStateList2 = this.f27617y) != null) {
                this.f27597o.setTextColor(colorStateList2);
            }
            if (!this.f27595n || (colorStateList = this.f27619z) == null) {
                return;
            }
            this.f27597o.setTextColor(colorStateList);
        }
    }

    private int p() {
        return this.f27584h0 == 1 ? M7.a.g(M7.a.e(this, H7.b.f3143p, 0), this.f27596n0) : this.f27596n0;
    }

    private void p0() {
        if (this.f27612v0 == 3 && this.f27584h0 == 2) {
            ((com.google.android.material.textfield.e) this.f27614w0.get(3)).O((AutoCompleteTextView) this.f27580e);
        }
    }

    private Rect q(Rect rect) {
        if (this.f27580e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f27600p0;
        boolean e10 = com.google.android.material.internal.o.e(this);
        rect2.bottom = rect.bottom;
        int i10 = this.f27584h0;
        if (i10 == 1) {
            rect2.left = G(rect.left, e10);
            rect2.top = rect.top + this.f27586i0;
            rect2.right = H(rect.right, e10);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = G(rect.left, e10);
            rect2.top = getPaddingTop();
            rect2.right = H(rect.right, e10);
            return rect2;
        }
        rect2.left = rect.left + this.f27580e.getPaddingLeft();
        rect2.top = rect.top - u();
        rect2.right = rect.right - this.f27580e.getPaddingRight();
        return rect2;
    }

    private int r(Rect rect, Rect rect2, float f10) {
        return P() ? (int) (rect2.top + f10) : rect.bottom - this.f27580e.getCompoundPaddingBottom();
    }

    private int s(Rect rect, float f10) {
        return P() ? (int) (rect.centerY() - (f10 / 2.0f)) : rect.top + this.f27580e.getCompoundPaddingTop();
    }

    private boolean s0() {
        int max;
        if (this.f27580e == null || this.f27580e.getMeasuredHeight() >= (max = Math.max(this.f27578c.getMeasuredHeight(), this.f27577b.getMeasuredHeight()))) {
            return false;
        }
        this.f27580e.setMinimumHeight(max);
        return true;
    }

    private void setEditText(EditText editText) {
        if (this.f27580e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f27612v0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f27580e = editText;
        int i10 = this.f27582g;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f27585i);
        }
        int i11 = this.f27583h;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f27587j);
        }
        Q();
        setTextInputAccessibilityDelegate(new e(this));
        this.f27570V0.j0(this.f27580e.getTypeface());
        this.f27570V0.b0(this.f27580e.getTextSize());
        this.f27570V0.X(this.f27580e.getLetterSpacing());
        int gravity = this.f27580e.getGravity();
        this.f27570V0.S((gravity & (-113)) | 48);
        this.f27570V0.a0(gravity);
        this.f27580e.addTextChangedListener(new a());
        if (this.f27557J0 == null) {
            this.f27557J0 = this.f27580e.getHintTextColors();
        }
        if (this.f27542C) {
            if (TextUtils.isEmpty(this.f27544D)) {
                CharSequence hint = this.f27580e.getHint();
                this.f27581f = hint;
                setHint(hint);
                this.f27580e.setHint((CharSequence) null);
            }
            this.f27546E = true;
        }
        if (this.f27597o != null) {
            m0(this.f27580e.getText().length());
        }
        r0();
        this.f27589k.f();
        this.f27577b.bringToFront();
        this.f27578c.bringToFront();
        this.f27579d.bringToFront();
        this.f27551G0.bringToFront();
        B();
        C0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f27544D)) {
            return;
        }
        this.f27544D = charSequence;
        this.f27570V0.h0(charSequence);
        if (this.f27569U0) {
            return;
        }
        R();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f27605s == z10) {
            return;
        }
        if (z10) {
            i();
        } else {
            X();
            this.f27607t = null;
        }
        this.f27605s = z10;
    }

    private Rect t(Rect rect) {
        if (this.f27580e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f27600p0;
        float w10 = this.f27570V0.w();
        rect2.left = rect.left + this.f27580e.getCompoundPaddingLeft();
        rect2.top = s(rect, w10);
        rect2.right = rect.right - this.f27580e.getCompoundPaddingRight();
        rect2.bottom = r(rect, rect2, w10);
        return rect2;
    }

    private void t0() {
        this.f27579d.setVisibility((this.f27616x0.getVisibility() != 0 || L()) ? 8 : 0);
        this.f27578c.setVisibility(K() || L() || !((this.f27538A == null || N()) ? 8 : false) ? 0 : 8);
    }

    private int u() {
        float q10;
        if (!this.f27542C) {
            return 0;
        }
        int i10 = this.f27584h0;
        if (i10 == 0) {
            q10 = this.f27570V0.q();
        } else {
            if (i10 != 2) {
                return 0;
            }
            q10 = this.f27570V0.q() / 2.0f;
        }
        return (int) q10;
    }

    private void u0() {
        this.f27551G0.setVisibility(getErrorIconDrawable() != null && this.f27589k.z() && this.f27589k.l() ? 0 : 8);
        t0();
        C0();
        if (I()) {
            return;
        }
        q0();
    }

    private boolean v() {
        return this.f27584h0 == 2 && w();
    }

    private void v0() {
        if (this.f27584h0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f27575a.getLayoutParams();
            int u10 = u();
            if (u10 != layoutParams.topMargin) {
                layoutParams.topMargin = u10;
                this.f27575a.requestLayout();
            }
        }
    }

    private boolean w() {
        return this.f27588j0 > -1 && this.f27594m0 != 0;
    }

    private void x() {
        if (A()) {
            ((com.google.android.material.textfield.d) this.f27548F).j0();
        }
    }

    private void x0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f27580e;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f27580e;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        boolean l10 = this.f27589k.l();
        ColorStateList colorStateList2 = this.f27557J0;
        if (colorStateList2 != null) {
            this.f27570V0.R(colorStateList2);
            this.f27570V0.Z(this.f27557J0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f27557J0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f27568T0) : this.f27568T0;
            this.f27570V0.R(ColorStateList.valueOf(colorForState));
            this.f27570V0.Z(ColorStateList.valueOf(colorForState));
        } else if (l10) {
            this.f27570V0.R(this.f27589k.q());
        } else if (this.f27595n && (textView = this.f27597o) != null) {
            this.f27570V0.R(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f27559K0) != null) {
            this.f27570V0.R(colorStateList);
        }
        if (z13 || !this.f27571W0 || (isEnabled() && z12)) {
            if (z11 || this.f27569U0) {
                y(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f27569U0) {
            F(z10);
        }
    }

    private void y(boolean z10) {
        ValueAnimator valueAnimator = this.f27573Y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f27573Y0.cancel();
        }
        if (z10 && this.f27572X0) {
            k(1.0f);
        } else {
            this.f27570V0.d0(1.0f);
        }
        this.f27569U0 = false;
        if (A()) {
            R();
        }
        z0();
        this.f27577b.i(false);
        D0();
    }

    private void y0() {
        EditText editText;
        if (this.f27607t == null || (editText = this.f27580e) == null) {
            return;
        }
        this.f27607t.setGravity(editText.getGravity());
        this.f27607t.setPadding(this.f27580e.getCompoundPaddingLeft(), this.f27580e.getCompoundPaddingTop(), this.f27580e.getCompoundPaddingRight(), this.f27580e.getCompoundPaddingBottom());
    }

    private C3986d z() {
        C3986d c3986d = new C3986d();
        c3986d.d0(87L);
        c3986d.f0(I7.a.f4335a);
        return c3986d;
    }

    private void z0() {
        EditText editText = this.f27580e;
        A0(editText == null ? 0 : editText.getText().length());
    }

    void E0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f27548F == null || this.f27584h0 == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f27580e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f27580e) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f27594m0 = this.f27568T0;
        } else if (this.f27589k.l()) {
            if (this.f27563O0 != null) {
                B0(z11, z10);
            } else {
                this.f27594m0 = this.f27589k.p();
            }
        } else if (!this.f27595n || (textView = this.f27597o) == null) {
            if (z11) {
                this.f27594m0 = this.f27562N0;
            } else if (z10) {
                this.f27594m0 = this.f27561M0;
            } else {
                this.f27594m0 = this.f27560L0;
            }
        } else if (this.f27563O0 != null) {
            B0(z11, z10);
        } else {
            this.f27594m0 = textView.getCurrentTextColor();
        }
        u0();
        V();
        W();
        U();
        if (getEndIconDelegate().d()) {
            i0(this.f27589k.l());
        }
        if (this.f27584h0 == 2) {
            int i10 = this.f27588j0;
            if (z11 && isEnabled()) {
                this.f27588j0 = this.f27592l0;
            } else {
                this.f27588j0 = this.f27590k0;
            }
            if (this.f27588j0 != i10) {
                S();
            }
        }
        if (this.f27584h0 == 1) {
            if (!isEnabled()) {
                this.f27596n0 = this.f27565Q0;
            } else if (z10 && !z11) {
                this.f27596n0 = this.f27567S0;
            } else if (z11) {
                this.f27596n0 = this.f27566R0;
            } else {
                this.f27596n0 = this.f27564P0;
            }
        }
        l();
    }

    public boolean K() {
        return this.f27579d.getVisibility() == 0 && this.f27616x0.getVisibility() == 0;
    }

    public boolean M() {
        return this.f27589k.A();
    }

    final boolean N() {
        return this.f27569U0;
    }

    public boolean O() {
        return this.f27546E;
    }

    public void U() {
        com.google.android.material.textfield.g.c(this, this.f27616x0, this.f27620z0);
    }

    public void V() {
        com.google.android.material.textfield.g.c(this, this.f27551G0, this.f27553H0);
    }

    public void W() {
        this.f27577b.j();
    }

    public void Y(float f10, float f11, float f12, float f13) {
        boolean e10 = com.google.android.material.internal.o.e(this);
        this.f27556J = e10;
        float f14 = e10 ? f11 : f10;
        if (!e10) {
            f10 = f11;
        }
        float f15 = e10 ? f13 : f12;
        if (!e10) {
            f12 = f13;
        }
        Y7.g gVar = this.f27548F;
        if (gVar != null && gVar.F() == f14 && this.f27548F.G() == f10 && this.f27548F.s() == f15 && this.f27548F.t() == f12) {
            return;
        }
        this.f27554I = this.f27554I.v().B(f14).G(f10).s(f15).w(f12).m();
        l();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f27575a.addView(view, layoutParams2);
        this.f27575a.setLayoutParams(layoutParams);
        v0();
        setEditText((EditText) view);
    }

    void d0(TextView textView, int i10) {
        try {
            androidx.core.widget.k.p(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.k.p(textView, H7.k.f3326b);
        textView.setTextColor(androidx.core.content.a.c(getContext(), H7.c.f3154a));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        AutofillId autofillId;
        EditText editText = this.f27580e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f27581f != null) {
            boolean z10 = this.f27546E;
            this.f27546E = false;
            CharSequence hint = editText.getHint();
            this.f27580e.setHint(this.f27581f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f27580e.setHint(hint);
                this.f27546E = z10;
            }
        }
        autofillId = getAutofillId();
        viewStructure.setAutofillId(autofillId);
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f27575a.getChildCount());
        for (int i11 = 0; i11 < this.f27575a.getChildCount(); i11++) {
            View childAt = this.f27575a.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f27580e) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f27576a1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f27576a1 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f27574Z0) {
            return;
        }
        this.f27574Z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.f27570V0;
        boolean g02 = bVar != null ? bVar.g0(drawableState) : false;
        if (this.f27580e != null) {
            w0(AbstractC1484a0.U(this) && isEnabled());
        }
        r0();
        E0();
        if (g02) {
            invalidate();
        }
        this.f27574Z0 = false;
    }

    public void g(f fVar) {
        this.f27610u0.add(fVar);
        if (this.f27580e != null) {
            fVar.a(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f27580e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + u() : super.getBaseline();
    }

    Y7.g getBoxBackground() {
        int i10 = this.f27584h0;
        if (i10 == 1 || i10 == 2) {
            return this.f27548F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f27596n0;
    }

    public int getBoxBackgroundMode() {
        return this.f27584h0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f27586i0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.o.e(this) ? this.f27554I.j().a(this.f27602q0) : this.f27554I.l().a(this.f27602q0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.o.e(this) ? this.f27554I.l().a(this.f27602q0) : this.f27554I.j().a(this.f27602q0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.o.e(this) ? this.f27554I.r().a(this.f27602q0) : this.f27554I.t().a(this.f27602q0);
    }

    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.o.e(this) ? this.f27554I.t().a(this.f27602q0) : this.f27554I.r().a(this.f27602q0);
    }

    public int getBoxStrokeColor() {
        return this.f27562N0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f27563O0;
    }

    public int getBoxStrokeWidth() {
        return this.f27590k0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f27592l0;
    }

    public int getCounterMaxLength() {
        return this.f27593m;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f27591l && this.f27595n && (textView = this.f27597o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f27617y;
    }

    public ColorStateList getCounterTextColor() {
        return this.f27617y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f27557J0;
    }

    public EditText getEditText() {
        return this.f27580e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f27616x0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f27616x0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f27612v0;
    }

    CheckableImageButton getEndIconView() {
        return this.f27616x0;
    }

    public CharSequence getError() {
        if (this.f27589k.z()) {
            return this.f27589k.o();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f27589k.n();
    }

    public int getErrorCurrentTextColors() {
        return this.f27589k.p();
    }

    public Drawable getErrorIconDrawable() {
        return this.f27551G0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f27589k.p();
    }

    public CharSequence getHelperText() {
        if (this.f27589k.A()) {
            return this.f27589k.r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f27589k.t();
    }

    public CharSequence getHint() {
        if (this.f27542C) {
            return this.f27544D;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f27570V0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f27570V0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f27559K0;
    }

    public int getMaxEms() {
        return this.f27583h;
    }

    public int getMaxWidth() {
        return this.f27587j;
    }

    public int getMinEms() {
        return this.f27582g;
    }

    public int getMinWidth() {
        return this.f27585i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f27616x0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f27616x0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f27605s) {
            return this.f27603r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f27611v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f27609u;
    }

    public CharSequence getPrefixText() {
        return this.f27577b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f27577b.b();
    }

    public TextView getPrefixTextView() {
        return this.f27577b.c();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f27577b.d();
    }

    public Drawable getStartIconDrawable() {
        return this.f27577b.e();
    }

    public CharSequence getSuffixText() {
        return this.f27538A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f27540B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f27540B;
    }

    public Typeface getTypeface() {
        return this.f27604r0;
    }

    public void h(g gVar) {
        this.f27618y0.add(gVar);
    }

    void k(float f10) {
        if (this.f27570V0.x() == f10) {
            return;
        }
        if (this.f27573Y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27573Y0 = valueAnimator;
            valueAnimator.setInterpolator(I7.a.f4336b);
            this.f27573Y0.setDuration(167L);
            this.f27573Y0.addUpdateListener(new d());
        }
        this.f27573Y0.setFloatValues(this.f27570V0.x(), f10);
        this.f27573Y0.start();
    }

    void m0(int i10) {
        boolean z10 = this.f27595n;
        int i11 = this.f27593m;
        if (i11 == -1) {
            this.f27597o.setText(String.valueOf(i10));
            this.f27597o.setContentDescription(null);
            this.f27595n = false;
        } else {
            this.f27595n = i10 > i11;
            n0(getContext(), this.f27597o, i10, this.f27593m, this.f27595n);
            if (z10 != this.f27595n) {
                o0();
            }
            this.f27597o.setText(androidx.core.text.a.c().j(getContext().getString(H7.j.f3307d, Integer.valueOf(i10), Integer.valueOf(this.f27593m))));
        }
        if (this.f27580e == null || z10 == this.f27595n) {
            return;
        }
        w0(false);
        E0();
        r0();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f27570V0.H(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f27580e;
        if (editText != null) {
            Rect rect = this.f27598o0;
            com.google.android.material.internal.c.a(this, editText, rect);
            k0(rect);
            if (this.f27542C) {
                this.f27570V0.b0(this.f27580e.getTextSize());
                int gravity = this.f27580e.getGravity();
                this.f27570V0.S((gravity & (-113)) | 48);
                this.f27570V0.a0(gravity);
                this.f27570V0.O(q(rect));
                this.f27570V0.W(t(rect));
                this.f27570V0.K();
                if (!A() || this.f27569U0) {
                    return;
                }
                R();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean s02 = s0();
        boolean q02 = q0();
        if (s02 || q02) {
            this.f27580e.post(new c());
        }
        y0();
        C0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f27626c);
        if (hVar.f27627d) {
            this.f27616x0.post(new b());
        }
        setHint(hVar.f27628e);
        setHelperText(hVar.f27629f);
        setPlaceholderText(hVar.f27630g);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = false;
        boolean z11 = i10 == 1;
        boolean z12 = this.f27556J;
        if (z11 != z12) {
            if (z11 && !z12) {
                z10 = true;
            }
            float a10 = this.f27554I.r().a(this.f27602q0);
            float a11 = this.f27554I.t().a(this.f27602q0);
            float a12 = this.f27554I.j().a(this.f27602q0);
            float a13 = this.f27554I.l().a(this.f27602q0);
            float f10 = z10 ? a10 : a11;
            if (z10) {
                a10 = a11;
            }
            float f11 = z10 ? a12 : a13;
            if (z10) {
                a12 = a13;
            }
            Y(f10, a10, f11, a12);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f27589k.l()) {
            hVar.f27626c = getError();
        }
        hVar.f27627d = I() && this.f27616x0.isChecked();
        hVar.f27628e = getHint();
        hVar.f27629f = getHelperText();
        hVar.f27630g = getPlaceholderText();
        return hVar;
    }

    boolean q0() {
        boolean z10;
        if (this.f27580e == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.f27577b.getMeasuredWidth() - this.f27580e.getPaddingLeft();
            if (this.f27606s0 == null || this.f27608t0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f27606s0 = colorDrawable;
                this.f27608t0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a10 = androidx.core.widget.k.a(this.f27580e);
            Drawable drawable = a10[0];
            Drawable drawable2 = this.f27606s0;
            if (drawable != drawable2) {
                androidx.core.widget.k.j(this.f27580e, drawable2, a10[1], a10[2], a10[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f27606s0 != null) {
                Drawable[] a11 = androidx.core.widget.k.a(this.f27580e);
                androidx.core.widget.k.j(this.f27580e, null, a11[1], a11[2], a11[3]);
                this.f27606s0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f27540B.getMeasuredWidth() - this.f27580e.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + AbstractC1524v.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] a12 = androidx.core.widget.k.a(this.f27580e);
            Drawable drawable3 = this.f27541B0;
            if (drawable3 == null || this.f27543C0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f27541B0 = colorDrawable2;
                    this.f27543C0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = a12[2];
                Drawable drawable5 = this.f27541B0;
                if (drawable4 != drawable5) {
                    this.f27545D0 = drawable4;
                    androidx.core.widget.k.j(this.f27580e, a12[0], a12[1], drawable5, a12[3]);
                } else {
                    z11 = z10;
                }
            } else {
                this.f27543C0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.k.j(this.f27580e, a12[0], a12[1], this.f27541B0, a12[3]);
            }
        } else {
            if (this.f27541B0 == null) {
                return z10;
            }
            Drawable[] a13 = androidx.core.widget.k.a(this.f27580e);
            if (a13[2] == this.f27541B0) {
                androidx.core.widget.k.j(this.f27580e, a13[0], a13[1], this.f27545D0, a13[3]);
            } else {
                z11 = z10;
            }
            this.f27541B0 = null;
        }
        return z11;
    }

    void r0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f27580e;
        if (editText == null || this.f27584h0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (O.a(background)) {
            background = background.mutate();
        }
        if (this.f27589k.l()) {
            background.setColorFilter(C1409k.e(this.f27589k.p(), PorterDuff.Mode.SRC_IN));
        } else if (this.f27595n && (textView = this.f27597o) != null) {
            background.setColorFilter(C1409k.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            androidx.core.graphics.drawable.a.a(background);
            this.f27580e.refreshDrawableState();
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f27596n0 != i10) {
            this.f27596n0 = i10;
            this.f27564P0 = i10;
            this.f27566R0 = i10;
            this.f27567S0 = i10;
            l();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(androidx.core.content.a.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f27564P0 = defaultColor;
        this.f27596n0 = defaultColor;
        this.f27565Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f27566R0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f27567S0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f27584h0) {
            return;
        }
        this.f27584h0 = i10;
        if (this.f27580e != null) {
            Q();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f27586i0 = i10;
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f27562N0 != i10) {
            this.f27562N0 = i10;
            E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f27560L0 = colorStateList.getDefaultColor();
            this.f27568T0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f27561M0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f27562N0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f27562N0 != colorStateList.getDefaultColor()) {
            this.f27562N0 = colorStateList.getDefaultColor();
        }
        E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f27563O0 != colorStateList) {
            this.f27563O0 = colorStateList;
            E0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f27590k0 = i10;
        E0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f27592l0 = i10;
        E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f27591l != z10) {
            if (z10) {
                D d10 = new D(getContext());
                this.f27597o = d10;
                d10.setId(H7.f.f3242M);
                Typeface typeface = this.f27604r0;
                if (typeface != null) {
                    this.f27597o.setTypeface(typeface);
                }
                this.f27597o.setMaxLines(1);
                this.f27589k.e(this.f27597o, 2);
                AbstractC1524v.d((ViewGroup.MarginLayoutParams) this.f27597o.getLayoutParams(), getResources().getDimensionPixelOffset(H7.d.f3203g0));
                o0();
                l0();
            } else {
                this.f27589k.B(this.f27597o, 2);
                this.f27597o = null;
            }
            this.f27591l = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f27593m != i10) {
            if (i10 > 0) {
                this.f27593m = i10;
            } else {
                this.f27593m = -1;
            }
            if (this.f27591l) {
                l0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f27599p != i10) {
            this.f27599p = i10;
            o0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f27619z != colorStateList) {
            this.f27619z = colorStateList;
            o0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f27601q != i10) {
            this.f27601q = i10;
            o0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f27617y != colorStateList) {
            this.f27617y = colorStateList;
            o0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f27557J0 = colorStateList;
        this.f27559K0 = colorStateList;
        if (this.f27580e != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        T(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f27616x0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f27616x0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? AbstractC3220a.b(getContext(), i10) : null);
    }

    public void setEndIconMode(int i10) {
        int i11 = this.f27612v0;
        if (i11 == i10) {
            return;
        }
        this.f27612v0 = i10;
        C(i11);
        setEndIconVisible(i10 != 0);
        if (getEndIconDelegate().b(this.f27584h0)) {
            getEndIconDelegate().a();
            com.google.android.material.textfield.g.a(this, this.f27616x0, this.f27620z0, this.f27539A0);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f27584h0 + " is not supported by the end icon mode " + i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.f27616x0, onClickListener, this.f27547E0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f27547E0 = onLongClickListener;
        c0(this.f27616x0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f27620z0 != colorStateList) {
            this.f27620z0 = colorStateList;
            com.google.android.material.textfield.g.a(this, this.f27616x0, colorStateList, this.f27539A0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f27539A0 != mode) {
            this.f27539A0 = mode;
            com.google.android.material.textfield.g.a(this, this.f27616x0, this.f27620z0, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (K() != z10) {
            this.f27616x0.setVisibility(z10 ? 0 : 8);
            t0();
            C0();
            q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f27589k.z()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f27589k.v();
        } else {
            this.f27589k.O(charSequence);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f27589k.D(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f27589k.E(z10);
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? AbstractC3220a.b(getContext(), i10) : null);
        V();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.f27551G0, onClickListener, this.f27549F0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f27549F0 = onLongClickListener;
        c0(this.f27551G0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.f27553H0 != colorStateList) {
            this.f27553H0 = colorStateList;
            com.google.android.material.textfield.g.a(this, this.f27551G0, colorStateList, this.f27555I0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.f27555I0 != mode) {
            this.f27555I0 = mode;
            com.google.android.material.textfield.g.a(this, this.f27551G0, this.f27553H0, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        this.f27589k.F(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f27589k.G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f27571W0 != z10) {
            this.f27571W0 = z10;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (M()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!M()) {
                setHelperTextEnabled(true);
            }
            this.f27589k.P(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f27589k.J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f27589k.I(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f27589k.H(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f27542C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f27572X0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f27542C) {
            this.f27542C = z10;
            if (z10) {
                CharSequence hint = this.f27580e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f27544D)) {
                        setHint(hint);
                    }
                    this.f27580e.setHint((CharSequence) null);
                }
                this.f27546E = true;
            } else {
                this.f27546E = false;
                if (!TextUtils.isEmpty(this.f27544D) && TextUtils.isEmpty(this.f27580e.getHint())) {
                    this.f27580e.setHint(this.f27544D);
                }
                setHintInternal(null);
            }
            if (this.f27580e != null) {
                v0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f27570V0.P(i10);
        this.f27559K0 = this.f27570V0.p();
        if (this.f27580e != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f27559K0 != colorStateList) {
            if (this.f27557J0 == null) {
                this.f27570V0.R(colorStateList);
            }
            this.f27559K0 = colorStateList;
            if (this.f27580e != null) {
                w0(false);
            }
        }
    }

    public void setMaxEms(int i10) {
        this.f27583h = i10;
        EditText editText = this.f27580e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f27587j = i10;
        EditText editText = this.f27580e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f27582g = i10;
        EditText editText = this.f27580e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f27585i = i10;
        EditText editText = this.f27580e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? AbstractC3220a.b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.f27612v0 != 1) {
            setEndIconMode(1);
        } else {
            if (z10) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f27620z0 = colorStateList;
        com.google.android.material.textfield.g.a(this, this.f27616x0, colorStateList, this.f27539A0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f27539A0 = mode;
        com.google.android.material.textfield.g.a(this, this.f27616x0, this.f27620z0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f27607t == null) {
            D d10 = new D(getContext());
            this.f27607t = d10;
            d10.setId(H7.f.f3245P);
            AbstractC1484a0.B0(this.f27607t, 2);
            C3986d z10 = z();
            this.f27613w = z10;
            z10.i0(67L);
            this.f27615x = z();
            setPlaceholderTextAppearance(this.f27611v);
            setPlaceholderTextColor(this.f27609u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f27605s) {
                setPlaceholderTextEnabled(true);
            }
            this.f27603r = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f27611v = i10;
        TextView textView = this.f27607t;
        if (textView != null) {
            androidx.core.widget.k.p(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f27609u != colorStateList) {
            this.f27609u = colorStateList;
            TextView textView = this.f27607t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f27577b.k(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f27577b.l(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f27577b.m(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.f27577b.n(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? AbstractC3220a.b(getContext(), i10) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f27577b.q(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f27577b.r(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f27577b.s(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f27577b.t(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f27577b.u(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f27538A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f27540B.setText(charSequence);
        D0();
    }

    public void setSuffixTextAppearance(int i10) {
        androidx.core.widget.k.p(this.f27540B, i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f27540B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f27580e;
        if (editText != null) {
            AbstractC1484a0.q0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f27604r0) {
            this.f27604r0 = typeface;
            this.f27570V0.j0(typeface);
            this.f27589k.L(typeface);
            TextView textView = this.f27597o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void w0(boolean z10) {
        x0(z10, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC1367a.c(context, attributeSet, i10, r9), attributeSet, i10);
        int i11;
        ?? r42;
        View view;
        int i12;
        int i13 = f27537b1;
        this.f27582g = -1;
        this.f27583h = -1;
        this.f27585i = -1;
        this.f27587j = -1;
        this.f27589k = new com.google.android.material.textfield.h(this);
        this.f27598o0 = new Rect();
        this.f27600p0 = new Rect();
        this.f27602q0 = new RectF();
        this.f27610u0 = new LinkedHashSet();
        this.f27612v0 = 0;
        SparseArray sparseArray = new SparseArray();
        this.f27614w0 = sparseArray;
        this.f27618y0 = new LinkedHashSet();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f27570V0 = bVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f27575a = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f27579d = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f27578c = linearLayout;
        D d10 = new D(context2);
        this.f27540B = d10;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        d10.setVisibility(8);
        LayoutInflater from = LayoutInflater.from(context2);
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(H7.h.f3284g, (ViewGroup) linearLayout, false);
        this.f27551G0 = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) from.inflate(H7.h.f3284g, (ViewGroup) frameLayout2, false);
        this.f27616x0 = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = I7.a.f4335a;
        bVar.i0(timeInterpolator);
        bVar.f0(timeInterpolator);
        bVar.S(8388659);
        h0 i14 = com.google.android.material.internal.m.i(context2, attributeSet, H7.l.f3807y6, i10, i13, H7.l.f3547V6, H7.l.f3529T6, H7.l.f3664i7, H7.l.f3709n7, H7.l.f3745r7);
        l lVar = new l(this, i14);
        this.f27577b = lVar;
        this.f27542C = i14.a(H7.l.f3736q7, true);
        setHint(i14.p(H7.l.f3385D6));
        this.f27572X0 = i14.a(H7.l.f3727p7, true);
        this.f27571W0 = i14.a(H7.l.f3682k7, true);
        if (i14.s(H7.l.f3403F6)) {
            i11 = -1;
            setMinEms(i14.k(H7.l.f3403F6, -1));
        } else {
            i11 = -1;
            if (i14.s(H7.l.f3376C6)) {
                setMinWidth(i14.f(H7.l.f3376C6, -1));
            }
        }
        if (i14.s(H7.l.f3394E6)) {
            setMaxEms(i14.k(H7.l.f3394E6, i11));
        } else if (i14.s(H7.l.f3367B6)) {
            setMaxWidth(i14.f(H7.l.f3367B6, i11));
        }
        this.f27554I = Y7.k.e(context2, attributeSet, i10, i13).m();
        this.f27558K = context2.getResources().getDimensionPixelOffset(H7.d.f3197d0);
        this.f27586i0 = i14.e(H7.l.f3430I6, 0);
        this.f27590k0 = i14.f(H7.l.f3493P6, context2.getResources().getDimensionPixelSize(H7.d.f3199e0));
        this.f27592l0 = i14.f(H7.l.f3502Q6, context2.getResources().getDimensionPixelSize(H7.d.f3201f0));
        this.f27588j0 = this.f27590k0;
        float d11 = i14.d(H7.l.f3466M6, -1.0f);
        float d12 = i14.d(H7.l.f3457L6, -1.0f);
        float d13 = i14.d(H7.l.f3439J6, -1.0f);
        float d14 = i14.d(H7.l.f3448K6, -1.0f);
        k.b v10 = this.f27554I.v();
        if (d11 >= 0.0f) {
            v10.B(d11);
        }
        if (d12 >= 0.0f) {
            v10.G(d12);
        }
        if (d13 >= 0.0f) {
            v10.w(d13);
        }
        if (d14 >= 0.0f) {
            v10.s(d14);
        }
        this.f27554I = v10.m();
        ColorStateList b10 = V7.c.b(context2, i14, H7.l.f3412G6);
        if (b10 != null) {
            int defaultColor = b10.getDefaultColor();
            this.f27564P0 = defaultColor;
            this.f27596n0 = defaultColor;
            if (b10.isStateful()) {
                this.f27565Q0 = b10.getColorForState(new int[]{-16842910}, -1);
                this.f27566R0 = b10.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f27567S0 = b10.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f27566R0 = this.f27564P0;
                ColorStateList a10 = AbstractC3220a.a(context2, H7.c.f3160g);
                this.f27565Q0 = a10.getColorForState(new int[]{-16842910}, -1);
                this.f27567S0 = a10.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f27596n0 = 0;
            this.f27564P0 = 0;
            this.f27565Q0 = 0;
            this.f27566R0 = 0;
            this.f27567S0 = 0;
        }
        if (i14.s(H7.l.f3358A6)) {
            ColorStateList c10 = i14.c(H7.l.f3358A6);
            this.f27559K0 = c10;
            this.f27557J0 = c10;
        }
        ColorStateList b11 = V7.c.b(context2, i14, H7.l.f3475N6);
        this.f27562N0 = i14.b(H7.l.f3475N6, 0);
        this.f27560L0 = androidx.core.content.a.c(context2, H7.c.f3161h);
        this.f27568T0 = androidx.core.content.a.c(context2, H7.c.f3162i);
        this.f27561M0 = androidx.core.content.a.c(context2, H7.c.f3163j);
        if (b11 != null) {
            setBoxStrokeColorStateList(b11);
        }
        if (i14.s(H7.l.f3484O6)) {
            setBoxStrokeErrorColor(V7.c.b(context2, i14, H7.l.f3484O6));
        }
        if (i14.n(H7.l.f3745r7, -1) != -1) {
            r42 = 0;
            setHintTextAppearance(i14.n(H7.l.f3745r7, 0));
        } else {
            r42 = 0;
        }
        int n10 = i14.n(H7.l.f3664i7, r42);
        CharSequence p10 = i14.p(H7.l.f3619d7);
        boolean a11 = i14.a(H7.l.f3628e7, r42);
        checkableImageButton.setId(H7.f.f3241L);
        if (V7.c.g(context2)) {
            AbstractC1524v.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r42);
        }
        if (i14.s(H7.l.f3646g7)) {
            this.f27553H0 = V7.c.b(context2, i14, H7.l.f3646g7);
        }
        if (i14.s(H7.l.f3655h7)) {
            this.f27555I0 = com.google.android.material.internal.o.f(i14.k(H7.l.f3655h7, -1), null);
        }
        if (i14.s(H7.l.f3637f7)) {
            setErrorIconDrawable(i14.g(H7.l.f3637f7));
        }
        checkableImageButton.setContentDescription(getResources().getText(H7.j.f3309f));
        AbstractC1484a0.B0(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int n11 = i14.n(H7.l.f3709n7, 0);
        boolean a12 = i14.a(H7.l.f3700m7, false);
        CharSequence p11 = i14.p(H7.l.f3691l7);
        int n12 = i14.n(H7.l.f3817z7, 0);
        CharSequence p12 = i14.p(H7.l.f3808y7);
        int n13 = i14.n(H7.l.f3449K7, 0);
        CharSequence p13 = i14.p(H7.l.f3440J7);
        boolean a13 = i14.a(H7.l.f3511R6, false);
        setCounterMaxLength(i14.k(H7.l.f3520S6, -1));
        this.f27601q = i14.n(H7.l.f3547V6, 0);
        this.f27599p = i14.n(H7.l.f3529T6, 0);
        setBoxBackgroundMode(i14.k(H7.l.f3421H6, 0));
        if (V7.c.g(context2)) {
            AbstractC1524v.d((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        int n14 = i14.n(H7.l.f3583Z6, 0);
        sparseArray.append(-1, new com.google.android.material.textfield.b(this, n14));
        sparseArray.append(0, new j(this));
        if (n14 == 0) {
            view = checkableImageButton;
            i12 = i14.n(H7.l.f3772u7, 0);
        } else {
            view = checkableImageButton;
            i12 = n14;
        }
        sparseArray.append(1, new k(this, i12));
        sparseArray.append(2, new com.google.android.material.textfield.a(this, n14));
        sparseArray.append(3, new com.google.android.material.textfield.e(this, n14));
        if (!i14.s(H7.l.f3781v7)) {
            if (i14.s(H7.l.f3601b7)) {
                this.f27620z0 = V7.c.b(context2, i14, H7.l.f3601b7);
            }
            if (i14.s(H7.l.f3610c7)) {
                this.f27539A0 = com.google.android.material.internal.o.f(i14.k(H7.l.f3610c7, -1), null);
            }
        }
        if (i14.s(H7.l.f3592a7)) {
            setEndIconMode(i14.k(H7.l.f3592a7, 0));
            if (i14.s(H7.l.f3574Y6)) {
                setEndIconContentDescription(i14.p(H7.l.f3574Y6));
            }
            setEndIconCheckable(i14.a(H7.l.f3565X6, true));
        } else if (i14.s(H7.l.f3781v7)) {
            if (i14.s(H7.l.f3790w7)) {
                this.f27620z0 = V7.c.b(context2, i14, H7.l.f3790w7);
            }
            if (i14.s(H7.l.f3799x7)) {
                this.f27539A0 = com.google.android.material.internal.o.f(i14.k(H7.l.f3799x7, -1), null);
            }
            setEndIconMode(i14.a(H7.l.f3781v7, false) ? 1 : 0);
            setEndIconContentDescription(i14.p(H7.l.f3763t7));
        }
        d10.setId(H7.f.f3247R);
        d10.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        AbstractC1484a0.s0(d10, 1);
        setErrorContentDescription(p10);
        setCounterOverflowTextAppearance(this.f27599p);
        setHelperTextTextAppearance(n11);
        setErrorTextAppearance(n10);
        setCounterTextAppearance(this.f27601q);
        setPlaceholderText(p12);
        setPlaceholderTextAppearance(n12);
        setSuffixTextAppearance(n13);
        if (i14.s(H7.l.f3673j7)) {
            setErrorTextColor(i14.c(H7.l.f3673j7));
        }
        if (i14.s(H7.l.f3718o7)) {
            setHelperTextColor(i14.c(H7.l.f3718o7));
        }
        if (i14.s(H7.l.f3754s7)) {
            setHintTextColor(i14.c(H7.l.f3754s7));
        }
        if (i14.s(H7.l.f3556W6)) {
            setCounterTextColor(i14.c(H7.l.f3556W6));
        }
        if (i14.s(H7.l.f3538U6)) {
            setCounterOverflowTextColor(i14.c(H7.l.f3538U6));
        }
        if (i14.s(H7.l.f3359A7)) {
            setPlaceholderTextColor(i14.c(H7.l.f3359A7));
        }
        if (i14.s(H7.l.f3458L7)) {
            setSuffixTextColor(i14.c(H7.l.f3458L7));
        }
        setEnabled(i14.a(H7.l.f3816z6, true));
        i14.x();
        AbstractC1484a0.B0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1484a0.D0(this, 1);
        }
        frameLayout2.addView(checkableImageButton2);
        linearLayout.addView(d10);
        linearLayout.addView(view);
        linearLayout.addView(frameLayout2);
        frameLayout.addView(lVar);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        setHelperTextEnabled(a12);
        setErrorEnabled(a11);
        setCounterEnabled(a13);
        setHelperText(p11);
        setSuffixText(p13);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f27616x0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f27616x0.setImageDrawable(drawable);
        if (drawable != null) {
            com.google.android.material.textfield.g.a(this, this.f27616x0, this.f27620z0, this.f27539A0);
            U();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f27577b.o(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f27577b.p(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f27551G0.setImageDrawable(drawable);
        u0();
        com.google.android.material.textfield.g.a(this, this.f27551G0, this.f27553H0, this.f27555I0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f27616x0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f27616x0.setImageDrawable(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
