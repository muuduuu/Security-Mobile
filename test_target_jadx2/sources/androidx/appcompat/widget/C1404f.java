package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import g.AbstractC3170a;

/* renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1404f extends Button {

    /* renamed from: a, reason: collision with root package name */
    private final C1403e f14145a;

    /* renamed from: b, reason: collision with root package name */
    private final C f14146b;

    /* renamed from: c, reason: collision with root package name */
    private C1412n f14147c;

    public C1404f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3170a.f33079n);
    }

    private C1412n getEmojiTextViewHelper() {
        if (this.f14147c == null) {
            this.f14147c = new C1412n(this);
        }
        return this.f14147c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1403e c1403e = this.f14145a;
        if (c1403e != null) {
            c1403e.b();
        }
        C c10 = this.f14146b;
        if (c10 != null) {
            c10.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (s0.f14258c) {
            return super.getAutoSizeMaxTextSize();
        }
        C c10 = this.f14146b;
        if (c10 != null) {
            return c10.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (s0.f14258c) {
            return super.getAutoSizeMinTextSize();
        }
        C c10 = this.f14146b;
        if (c10 != null) {
            return c10.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (s0.f14258c) {
            return super.getAutoSizeStepGranularity();
        }
        C c10 = this.f14146b;
        if (c10 != null) {
            return c10.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (s0.f14258c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C c10 = this.f14146b;
        return c10 != null ? c10.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (s0.f14258c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C c10 = this.f14146b;
        if (c10 != null) {
            return c10.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.r(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1403e c1403e = this.f14145a;
        if (c1403e != null) {
            return c1403e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1403e c1403e = this.f14145a;
        if (c1403e != null) {
            return c1403e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14146b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14146b.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C c10 = this.f14146b;
        if (c10 != null) {
            c10.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C c10 = this.f14146b;
        if (c10 == null || s0.f14258c || !c10.l()) {
            return;
        }
        this.f14146b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (s0.f14258c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C c10 = this.f14146b;
        if (c10 != null) {
            c10.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (s0.f14258c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C c10 = this.f14146b;
        if (c10 != null) {
            c10.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (s0.f14258c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C c10 = this.f14146b;
        if (c10 != null) {
            c10.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1403e c1403e = this.f14145a;
        if (c1403e != null) {
            c1403e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1403e c1403e = this.f14145a;
        if (c1403e != null) {
            c1403e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        C c10 = this.f14146b;
        if (c10 != null) {
            c10.s(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1403e c1403e = this.f14145a;
        if (c1403e != null) {
            c1403e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1403e c1403e = this.f14145a;
        if (c1403e != null) {
            c1403e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f14146b.w(colorStateList);
        this.f14146b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f14146b.x(mode);
        this.f14146b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f14146b;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (s0.f14258c) {
            super.setTextSize(i10, f10);
            return;
        }
        C c10 = this.f14146b;
        if (c10 != null) {
            c10.A(i10, f10);
        }
    }

    public C1404f(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        C1403e c1403e = new C1403e(this);
        this.f14145a = c1403e;
        c1403e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f14146b = c10;
        c10.m(attributeSet, i10);
        c10.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
