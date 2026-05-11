package com.google.android.material.button;

import H7.k;
import H7.l;
import V7.c;
import Y7.h;
import Y7.n;
import a8.AbstractC1367a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C1404f;
import androidx.core.view.AbstractC1484a0;
import com.google.android.material.internal.m;
import com.google.android.material.internal.o;
import h.AbstractC3220a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class MaterialButton extends C1404f implements Checkable, n {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f26733q = {R.attr.state_checkable};

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f26734r = {R.attr.state_checked};

    /* renamed from: s, reason: collision with root package name */
    private static final int f26735s = k.f3339o;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.material.button.a f26736d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f26737e;

    /* renamed from: f, reason: collision with root package name */
    private a f26738f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f26739g;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f26740h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f26741i;

    /* renamed from: j, reason: collision with root package name */
    private int f26742j;

    /* renamed from: k, reason: collision with root package name */
    private int f26743k;

    /* renamed from: l, reason: collision with root package name */
    private int f26744l;

    /* renamed from: m, reason: collision with root package name */
    private int f26745m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26746n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f26747o;

    /* renamed from: p, reason: collision with root package name */
    private int f26748p;

    interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    static class b extends F0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f26749c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f26749c = parcel.readInt() == 1;
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f26749c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3152y);
    }

    private boolean b() {
        int i10 = this.f26748p;
        return i10 == 3 || i10 == 4;
    }

    private boolean c() {
        int i10 = this.f26748p;
        return i10 == 1 || i10 == 2;
    }

    private boolean d() {
        int i10 = this.f26748p;
        return i10 == 16 || i10 == 32;
    }

    private boolean e() {
        return AbstractC1484a0.A(this) == 1;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f26736d;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void g() {
        if (c()) {
            androidx.core.widget.k.j(this, this.f26741i, null, null, null);
        } else if (b()) {
            androidx.core.widget.k.j(this, null, null, this.f26741i, null);
        } else if (d()) {
            androidx.core.widget.k.j(this, null, this.f26741i, null, null);
        }
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    private void h(boolean z10) {
        Drawable drawable = this.f26741i;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.l(drawable).mutate();
            this.f26741i = mutate;
            androidx.core.graphics.drawable.a.i(mutate, this.f26740h);
            PorterDuff.Mode mode = this.f26739g;
            if (mode != null) {
                androidx.core.graphics.drawable.a.j(this.f26741i, mode);
            }
            int i10 = this.f26742j;
            if (i10 == 0) {
                i10 = this.f26741i.getIntrinsicWidth();
            }
            int i11 = this.f26742j;
            if (i11 == 0) {
                i11 = this.f26741i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f26741i;
            int i12 = this.f26743k;
            int i13 = this.f26744l;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f26741i.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] a10 = androidx.core.widget.k.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        if ((!c() || drawable3 == this.f26741i) && ((!b() || drawable5 == this.f26741i) && (!d() || drawable4 == this.f26741i))) {
            return;
        }
        g();
    }

    private void i(int i10, int i11) {
        if (this.f26741i == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f26743k = 0;
                if (this.f26748p == 16) {
                    this.f26744l = 0;
                    h(false);
                    return;
                }
                int i12 = this.f26742j;
                if (i12 == 0) {
                    i12 = this.f26741i.getIntrinsicHeight();
                }
                int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - i12) - this.f26745m) - getPaddingBottom()) / 2;
                if (this.f26744l != textHeight) {
                    this.f26744l = textHeight;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f26744l = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.f26748p;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f26743k = 0;
            h(false);
            return;
        }
        int i14 = this.f26742j;
        if (i14 == 0) {
            i14 = this.f26741i.getIntrinsicWidth();
        }
        int textWidth = ((((i10 - getTextWidth()) - AbstractC1484a0.E(this)) - i14) - this.f26745m) - AbstractC1484a0.F(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textWidth /= 2;
        }
        if (e() != (this.f26748p == 4)) {
            textWidth = -textWidth;
        }
        if (this.f26743k != textWidth) {
            this.f26743k = textWidth;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f26736d;
        return aVar != null && aVar.p();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f26736d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f26741i;
    }

    public int getIconGravity() {
        return this.f26748p;
    }

    public int getIconPadding() {
        return this.f26745m;
    }

    public int getIconSize() {
        return this.f26742j;
    }

    public ColorStateList getIconTint() {
        return this.f26740h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f26739g;
    }

    public int getInsetBottom() {
        return this.f26736d.c();
    }

    public int getInsetTop() {
        return this.f26736d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f26736d.h();
        }
        return null;
    }

    public Y7.k getShapeAppearanceModel() {
        if (f()) {
            return this.f26736d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f26736d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f26736d.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C1404f
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f26736d.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C1404f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f26736d.m() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f26746n;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f26736d.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f26733q);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f26734r);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C1404f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C1404f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C1404f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f26749c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f26749c = this.f26746n;
        return bVar;
    }

    @Override // androidx.appcompat.widget.C1404f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f26741i != null) {
            if (this.f26741i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f26736d.r(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.C1404f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f26736d.s();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C1404f, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? AbstractC3220a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (f()) {
            this.f26736d.t(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f26746n != z10) {
            this.f26746n = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f26746n);
            }
            if (this.f26747o) {
                return;
            }
            this.f26747o = true;
            Iterator it = this.f26737e.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            this.f26747o = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f26736d.u(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (f()) {
            this.f26736d.f().W(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f26741i != drawable) {
            this.f26741i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f26748p != i10) {
            this.f26748p = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f26745m != i10) {
            this.f26745m = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? AbstractC3220a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f26742j != i10) {
            this.f26742j = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f26740h != colorStateList) {
            this.f26740h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f26739g != mode) {
            this.f26739g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(AbstractC3220a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f26736d.v(i10);
    }

    public void setInsetTop(int i10) {
        this.f26736d.w(i10);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(a aVar) {
        this.f26738f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        a aVar = this.f26738f;
        if (aVar != null) {
            aVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f26736d.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(AbstractC3220a.a(getContext(), i10));
        }
    }

    @Override // Y7.n
    public void setShapeAppearanceModel(Y7.k kVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f26736d.y(kVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f26736d.z(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f26736d.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(AbstractC3220a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f26736d.B(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.C1404f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f26736d.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C1404f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f26736d.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f26746n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC1367a.c(context, attributeSet, i10, r6), attributeSet, i10);
        int i11 = f26735s;
        this.f26737e = new LinkedHashSet();
        this.f26746n = false;
        this.f26747o = false;
        Context context2 = getContext();
        TypedArray h10 = m.h(context2, attributeSet, l.f3579Z2, i10, i11, new int[0]);
        this.f26745m = h10.getDimensionPixelSize(l.f3696m3, 0);
        this.f26739g = o.f(h10.getInt(l.f3723p3, -1), PorterDuff.Mode.SRC_IN);
        this.f26740h = c.a(getContext(), h10, l.f3714o3);
        this.f26741i = c.d(getContext(), h10, l.f3678k3);
        this.f26748p = h10.getInteger(l.f3687l3, 1);
        this.f26742j = h10.getDimensionPixelSize(l.f3705n3, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, Y7.k.e(context2, attributeSet, i10, i11).m());
        this.f26736d = aVar;
        aVar.q(h10);
        h10.recycle();
        setCompoundDrawablePadding(this.f26745m);
        h(this.f26741i != null);
    }
}
