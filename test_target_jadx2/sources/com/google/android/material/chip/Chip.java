package com.google.android.material.chip;

import H7.j;
import H7.k;
import H7.l;
import I7.g;
import V7.f;
import Y7.n;
import a8.AbstractC1367a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C1405g;
import androidx.core.view.AbstractC1484a0;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.material.chip.a;
import com.google.android.material.internal.h;
import com.google.android.material.internal.m;
import com.google.android.material.internal.o;
import java.util.List;
import org.conscrypt.BuildConfig;
import z0.C5228A;

/* loaded from: classes2.dex */
public class Chip extends C1405g implements a.InterfaceC0396a, n, h {

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.material.chip.a f26795e;

    /* renamed from: f, reason: collision with root package name */
    private InsetDrawable f26796f;

    /* renamed from: g, reason: collision with root package name */
    private RippleDrawable f26797g;

    /* renamed from: h, reason: collision with root package name */
    private View.OnClickListener f26798h;

    /* renamed from: i, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f26799i;

    /* renamed from: j, reason: collision with root package name */
    private h.a f26800j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26801k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f26802l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f26803m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26804n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f26805o;

    /* renamed from: p, reason: collision with root package name */
    private int f26806p;

    /* renamed from: q, reason: collision with root package name */
    private int f26807q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f26808r;

    /* renamed from: s, reason: collision with root package name */
    private final d f26809s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f26810t;

    /* renamed from: u, reason: collision with root package name */
    private final Rect f26811u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f26812v;

    /* renamed from: w, reason: collision with root package name */
    private final f f26813w;

    /* renamed from: x, reason: collision with root package name */
    private static final int f26792x = k.f3341q;

    /* renamed from: y, reason: collision with root package name */
    private static final Rect f26793y = new Rect();

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f26794z = {R.attr.state_selected};

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f26791A = {R.attr.state_checkable};

    class a extends f {
        a() {
        }

        @Override // V7.f
        public void a(int i10) {
        }

        @Override // V7.f
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f26795e.J2() ? Chip.this.f26795e.f1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b implements CompoundButton.OnCheckedChangeListener {
        b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (Chip.this.f26800j != null) {
                Chip.this.f26800j.a(Chip.this, z10);
            }
            if (Chip.this.f26799i != null) {
                Chip.this.f26799i.onCheckedChanged(compoundButton, z10);
            }
        }
    }

    class c extends ViewOutlineProvider {
        c() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f26795e != null) {
                Chip.this.f26795e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class d extends G0.a {
        d(Chip chip) {
            super(chip);
        }

        @Override // G0.a
        protected int B(float f10, float f11) {
            return (Chip.this.o() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // G0.a
        protected void C(List list) {
            list.add(0);
            if (Chip.this.o() && Chip.this.t() && Chip.this.f26798h != null) {
                list.add(1);
            }
        }

        @Override // G0.a
        protected boolean J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.u();
            }
            return false;
        }

        @Override // G0.a
        protected void M(C5228A c5228a) {
            c5228a.o0(Chip.this.s());
            c5228a.r0(Chip.this.isClickable());
            c5228a.q0(Chip.this.getAccessibilityClassName());
            c5228a.S0(Chip.this.getText());
        }

        @Override // G0.a
        protected void N(int i10, C5228A c5228a) {
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (i10 != 1) {
                c5228a.u0(BuildConfig.FLAVOR);
                c5228a.m0(Chip.f26793y);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                c5228a.u0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i11 = j.f3313j;
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                c5228a.u0(context.getString(i11, charSequence).trim());
            }
            c5228a.m0(Chip.this.getCloseIconTouchBoundsInt());
            c5228a.b(C5228A.a.f45627i);
            c5228a.w0(Chip.this.isEnabled());
        }

        @Override // G0.a
        protected void O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f26804n = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3136i);
    }

    private void A() {
        this.f26797g = new RippleDrawable(W7.b.d(this.f26795e.d1()), getBackgroundDrawable(), null);
        this.f26795e.I2(false);
        AbstractC1484a0.u0(this, this.f26797g);
        B();
    }

    private void B() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f26795e) == null) {
            return;
        }
        int H02 = (int) (aVar.H0() + this.f26795e.h1() + this.f26795e.o0());
        int M02 = (int) (this.f26795e.M0() + this.f26795e.i1() + this.f26795e.k0());
        if (this.f26796f != null) {
            Rect rect = new Rect();
            this.f26796f.getPadding(rect);
            M02 += rect.left;
            H02 += rect.right;
        }
        AbstractC1484a0.G0(this, M02, getPaddingTop(), H02, getPaddingBottom());
    }

    private void C() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        V7.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f26813w);
        }
    }

    private void D(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", AppStateModule.APP_STATE_BACKGROUND) != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f26812v.setEmpty();
        if (o() && this.f26798h != null) {
            this.f26795e.W0(this.f26812v);
        }
        return this.f26812v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f26811u.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f26811u;
    }

    private V7.d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.g1();
        }
        return null;
    }

    private void k(com.google.android.material.chip.a aVar) {
        aVar.n2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] l() {
        ?? isEnabled = isEnabled();
        int i10 = isEnabled;
        if (this.f26804n) {
            i10 = isEnabled + 1;
        }
        int i11 = i10;
        if (this.f26803m) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f26802l) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f26804n) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f26803m) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f26802l) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    private void n() {
        if (getBackgroundDrawable() == this.f26796f && this.f26795e.getCallback() == null) {
            this.f26795e.setCallback(this.f26796f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        com.google.android.material.chip.a aVar = this.f26795e;
        return (aVar == null || aVar.P0() == null) ? false : true;
    }

    private void p(Context context, AttributeSet attributeSet, int i10) {
        TypedArray h10 = m.h(context, attributeSet, l.f3810z0, i10, f26792x, new int[0]);
        this.f26805o = h10.getBoolean(l.f3631f1, false);
        this.f26807q = (int) Math.ceil(h10.getDimension(l.f3523T0, (float) Math.ceil(o.b(getContext(), 48))));
        h10.recycle();
    }

    private void q() {
        setOutlineProvider(new c());
    }

    private void r(int i10, int i11, int i12, int i13) {
        this.f26796f = new InsetDrawable((Drawable) this.f26795e, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f26803m != z10) {
            this.f26803m = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f26802l != z10) {
            this.f26802l = z10;
            refreshDrawableState();
        }
    }

    private void v() {
        if (this.f26796f != null) {
            this.f26796f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    private void x(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.n2(null);
        }
    }

    private void y() {
        if (o() && t() && this.f26798h != null) {
            AbstractC1484a0.q0(this, this.f26809s);
            this.f26810t = true;
        } else {
            AbstractC1484a0.q0(this, null);
            this.f26810t = false;
        }
    }

    private void z() {
        if (W7.b.f11399a) {
            A();
            return;
        }
        this.f26795e.I2(true);
        AbstractC1484a0.u0(this, getBackgroundDrawable());
        B();
        n();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0396a
    public void a() {
        m(this.f26807q);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f26810t ? super.dispatchHoverEvent(motionEvent) : this.f26809s.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f26810t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f26809s.w(keyEvent) || this.f26809s.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.C1405g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f26795e;
        if ((aVar == null || !aVar.n1()) ? false : this.f26795e.j2(l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f26808r)) {
            return this.f26808r;
        }
        if (!s()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).h()) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f26796f;
        return insetDrawable == null ? this.f26795e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.D0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.E0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.F0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.G0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f26795e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.H0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.J0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.L0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.P0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.Q0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.T0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f26810t && (this.f26809s.A() == 1 || this.f26809s.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public g getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.b1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.c1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    public Y7.k getShapeAppearanceModel() {
        return this.f26795e.C();
    }

    public g getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.h1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            return aVar.i1();
        }
        return 0.0f;
    }

    public boolean m(int i10) {
        this.f26807q = i10;
        if (!w()) {
            if (this.f26796f != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int max = Math.max(0, i10 - this.f26795e.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.f26795e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f26796f != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int i11 = max2 > 0 ? max2 / 2 : 0;
        int i12 = max > 0 ? max / 2 : 0;
        if (this.f26796f != null) {
            Rect rect = new Rect();
            this.f26796f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                z();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        r(i11, i12, i11, i12);
        z();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Y7.h.f(this, this.f26795e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f26794z);
        }
        if (s()) {
            View.mergeDrawableStates(onCreateDrawableState, f26791A);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f26810t) {
            this.f26809s.I(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(s());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C5228A.Y0(accessibilityNodeInfo).t0(C5228A.f.b(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.g(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f26806p != i10) {
            this.f26806p = i10;
            B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f26802l) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z10 = true;
                    }
                }
                z10 = false;
            } else if (this.f26802l) {
                u();
                z10 = true;
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z10 = true;
            }
            z10 = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f26795e;
        return aVar != null && aVar.m1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f26808r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f26797g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C1405g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f26797g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C1405g, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.v1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.w1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar == null) {
            this.f26801k = z10;
        } else if (aVar.m1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.x1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.y1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.z1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.A1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.B1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.D1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.E1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.F1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.G1(i10);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f26795e;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f26795e = aVar;
            aVar.y2(false);
            k(this.f26795e);
            m(this.f26807q);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.H1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.I1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.J1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.K1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.L1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.M1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.N1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.O1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.P1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.R1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.S1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.T1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.U1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.V1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.W1(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.X1(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.Y1(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.a2(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.b2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.c2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.d2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.e2(i10);
        }
        y();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.f2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.g2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.h2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.i2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.k2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.l2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.C1405g, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.C1405g, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.W(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f26795e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.o2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f26805o = z10;
        m(this.f26807q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(g gVar) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.p2(gVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.q2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.r2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.s2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.t2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.u2(i10);
        }
    }

    @Override // com.google.android.material.internal.h
    public void setInternalOnCheckedChangeListener(h.a aVar) {
        this.f26800j = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f26795e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.v2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f26799i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f26798h = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.w2(colorStateList);
        }
        if (this.f26795e.k1()) {
            return;
        }
        A();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.x2(i10);
            if (this.f26795e.k1()) {
                return;
            }
            A();
        }
    }

    @Override // Y7.n
    public void setShapeAppearanceModel(Y7.k kVar) {
        this.f26795e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(g gVar) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.z2(gVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.A2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        super.setText(aVar.J2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f26795e;
        if (aVar2 != null) {
            aVar2.B2(charSequence);
        }
    }

    public void setTextAppearance(V7.d dVar) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.C2(dVar);
        }
        C();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.E2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.F2(i10);
        }
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.G2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.H2(i10);
        }
    }

    public boolean t() {
        com.google.android.material.chip.a aVar = this.f26795e;
        return aVar != null && aVar.o1();
    }

    public boolean u() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f26798h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f26810t) {
            this.f26809s.U(1, 1);
        }
        return z10;
    }

    public boolean w() {
        return this.f26805o;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC1367a.c(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f26792x;
        this.f26811u = new Rect();
        this.f26812v = new RectF();
        this.f26813w = new a();
        Context context2 = getContext();
        D(attributeSet);
        com.google.android.material.chip.a t02 = com.google.android.material.chip.a.t0(context2, attributeSet, i10, i11);
        p(context2, attributeSet, i10);
        setChipDrawable(t02);
        t02.W(AbstractC1484a0.v(this));
        TypedArray h10 = m.h(context2, attributeSet, l.f3810z0, i10, i11, new int[0]);
        boolean hasValue = h10.hasValue(l.f3676k1);
        h10.recycle();
        this.f26809s = new d(this);
        y();
        if (!hasValue) {
            q();
        }
        setChecked(this.f26801k);
        setText(t02.f1());
        setEllipsize(t02.Z0());
        C();
        if (!this.f26795e.J2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        B();
        if (w()) {
            setMinHeight(this.f26807q);
        }
        this.f26806p = AbstractC1484a0.A(this);
        super.setOnCheckedChangeListener(new b());
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.m2(z10);
        }
        y();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.C1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.Q1(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.D2(i10);
        }
        C();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f26795e;
        if (aVar != null) {
            aVar.D2(i10);
        }
        C();
    }
}
