package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import g.AbstractC3170a;
import h.AbstractC3220a;

/* renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1406h extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    private final C1407i f14157a;

    /* renamed from: b, reason: collision with root package name */
    private final C1403e f14158b;

    /* renamed from: c, reason: collision with root package name */
    private final C f14159c;

    /* renamed from: d, reason: collision with root package name */
    private C1412n f14160d;

    public C1406h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3170a.f33081p);
    }

    private C1412n getEmojiTextViewHelper() {
        if (this.f14160d == null) {
            this.f14160d = new C1412n(this);
        }
        return this.f14160d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C c10 = this.f14159c;
        if (c10 != null) {
            c10.b();
        }
        C1403e c1403e = this.f14158b;
        if (c1403e != null) {
            c1403e.b();
        }
        C1407i c1407i = this.f14157a;
        if (c1407i != null) {
            c1407i.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.r(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1403e c1403e = this.f14158b;
        if (c1403e != null) {
            return c1403e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1403e c1403e = this.f14158b;
        if (c1403e != null) {
            return c1403e.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1407i c1407i = this.f14157a;
        if (c1407i != null) {
            return c1407i.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1407i c1407i = this.f14157a;
        if (c1407i != null) {
            return c1407i.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14159c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14159c.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC1413o.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1403e c1403e = this.f14158b;
        if (c1403e != null) {
            c1403e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1403e c1403e = this.f14158b;
        if (c1403e != null) {
            c1403e.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1407i c1407i = this.f14157a;
        if (c1407i != null) {
            c1407i.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f14159c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f14159c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1403e c1403e = this.f14158b;
        if (c1403e != null) {
            c1403e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1403e c1403e = this.f14158b;
        if (c1403e != null) {
            c1403e.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1407i c1407i = this.f14157a;
        if (c1407i != null) {
            c1407i.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1407i c1407i = this.f14157a;
        if (c1407i != null) {
            c1407i.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f14159c.w(colorStateList);
        this.f14159c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f14159c.x(mode);
        this.f14159c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f14159c;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    public C1406h(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        C c10 = new C(this);
        this.f14159c = c10;
        c10.m(attributeSet, i10);
        c10.b();
        C1403e c1403e = new C1403e(this);
        this.f14158b = c1403e;
        c1403e.e(attributeSet, i10);
        C1407i c1407i = new C1407i(this);
        this.f14157a = c1407i;
        c1407i.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(AbstractC3220a.b(getContext(), i10));
    }
}
