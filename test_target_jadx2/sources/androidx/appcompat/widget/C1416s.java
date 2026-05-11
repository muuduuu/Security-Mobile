package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import g.AbstractC3170a;
import h.AbstractC3220a;

/* renamed from: androidx.appcompat.widget.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1416s extends MultiAutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f14252d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    private final C1403e f14253a;

    /* renamed from: b, reason: collision with root package name */
    private final C f14254b;

    /* renamed from: c, reason: collision with root package name */
    private final C1411m f14255c;

    public C1416s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3170a.f33078m);
    }

    void a(C1411m c1411m) {
        KeyListener keyListener = getKeyListener();
        if (c1411m.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a10 = c1411m.a(keyListener);
            if (a10 == keyListener) {
                return;
            }
            super.setKeyListener(a10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1403e c1403e = this.f14253a;
        if (c1403e != null) {
            c1403e.b();
        }
        C c10 = this.f14254b;
        if (c10 != null) {
            c10.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1403e c1403e = this.f14253a;
        if (c1403e != null) {
            return c1403e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1403e c1403e = this.f14253a;
        if (c1403e != null) {
            return c1403e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14254b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14254b.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f14255c.d(AbstractC1413o.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1403e c1403e = this.f14253a;
        if (c1403e != null) {
            c1403e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1403e c1403e = this.f14253a;
        if (c1403e != null) {
            c1403e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f14254b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f14254b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(AbstractC3220a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f14255c.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f14255c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1403e c1403e = this.f14253a;
        if (c1403e != null) {
            c1403e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1403e c1403e = this.f14253a;
        if (c1403e != null) {
            c1403e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f14254b.w(colorStateList);
        this.f14254b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f14254b.x(mode);
        this.f14254b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f14254b;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    public C1416s(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        h0 v10 = h0.v(getContext(), attributeSet, f14252d, i10, 0);
        if (v10.s(0)) {
            setDropDownBackgroundDrawable(v10.g(0));
        }
        v10.x();
        C1403e c1403e = new C1403e(this);
        this.f14253a = c1403e;
        c1403e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f14254b = c10;
        c10.m(attributeSet, i10);
        c10.b();
        C1411m c1411m = new C1411m(this);
        this.f14255c = c1411m;
        c1411m.c(attributeSet, i10);
        a(c1411m);
    }
}
