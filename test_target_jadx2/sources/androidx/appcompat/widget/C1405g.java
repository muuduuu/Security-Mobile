package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import g.AbstractC3170a;
import h.AbstractC3220a;

/* renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1405g extends CheckBox {

    /* renamed from: a, reason: collision with root package name */
    private final C1408j f14152a;

    /* renamed from: b, reason: collision with root package name */
    private final C1403e f14153b;

    /* renamed from: c, reason: collision with root package name */
    private final C f14154c;

    /* renamed from: d, reason: collision with root package name */
    private C1412n f14155d;

    public C1405g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3170a.f33080o);
    }

    private C1412n getEmojiTextViewHelper() {
        if (this.f14155d == null) {
            this.f14155d = new C1412n(this);
        }
        return this.f14155d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1403e c1403e = this.f14153b;
        if (c1403e != null) {
            c1403e.b();
        }
        C c10 = this.f14154c;
        if (c10 != null) {
            c10.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1403e c1403e = this.f14153b;
        if (c1403e != null) {
            return c1403e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1403e c1403e = this.f14153b;
        if (c1403e != null) {
            return c1403e.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C1408j c1408j = this.f14152a;
        if (c1408j != null) {
            return c1408j.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1408j c1408j = this.f14152a;
        if (c1408j != null) {
            return c1408j.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14154c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14154c.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1403e c1403e = this.f14153b;
        if (c1403e != null) {
            c1403e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1403e c1403e = this.f14153b;
        if (c1403e != null) {
            c1403e.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1408j c1408j = this.f14152a;
        if (c1408j != null) {
            c1408j.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f14154c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f14154c;
        if (c10 != null) {
            c10.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1403e c1403e = this.f14153b;
        if (c1403e != null) {
            c1403e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1403e c1403e = this.f14153b;
        if (c1403e != null) {
            c1403e.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1408j c1408j = this.f14152a;
        if (c1408j != null) {
            c1408j.f(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1408j c1408j = this.f14152a;
        if (c1408j != null) {
            c1408j.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f14154c.w(colorStateList);
        this.f14154c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f14154c.x(mode);
        this.f14154c.b();
    }

    public C1405g(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        C1408j c1408j = new C1408j(this);
        this.f14152a = c1408j;
        c1408j.d(attributeSet, i10);
        C1403e c1403e = new C1403e(this);
        this.f14153b = c1403e;
        c1403e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f14154c = c10;
        c10.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(AbstractC3220a.b(getContext(), i10));
    }
}
