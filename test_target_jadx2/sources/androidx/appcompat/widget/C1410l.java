package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1489d;
import g.AbstractC3170a;

/* renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1410l extends EditText implements androidx.core.view.K {

    /* renamed from: a, reason: collision with root package name */
    private final C1403e f14188a;

    /* renamed from: b, reason: collision with root package name */
    private final C f14189b;

    /* renamed from: c, reason: collision with root package name */
    private final B f14190c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.core.widget.l f14191d;

    /* renamed from: e, reason: collision with root package name */
    private final C1411m f14192e;

    /* renamed from: f, reason: collision with root package name */
    private a f14193f;

    /* renamed from: androidx.appcompat.widget.l$a */
    class a {
        a() {
        }

        public TextClassifier a() {
            return C1410l.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            C1410l.super.setTextClassifier(textClassifier);
        }
    }

    public C1410l(Context context) {
        this(context, null);
    }

    private a getSuperCaller() {
        if (this.f14193f == null) {
            this.f14193f = new a();
        }
        return this.f14193f;
    }

    @Override // androidx.core.view.K
    public C1489d a(C1489d c1489d) {
        return this.f14191d.a(this, c1489d);
    }

    void d(C1411m c1411m) {
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
        C1403e c1403e = this.f14188a;
        if (c1403e != null) {
            c1403e.b();
        }
        C c10 = this.f14189b;
        if (c10 != null) {
            c10.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.r(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1403e c1403e = this.f14188a;
        if (c1403e != null) {
            return c1403e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1403e c1403e = this.f14188a;
        if (c1403e != null) {
            return c1403e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14189b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14189b.k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        B b10;
        return (Build.VERSION.SDK_INT >= 28 || (b10 = this.f14190c) == null) ? getSuperCaller().a() : b10.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] D10;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f14189b.r(this, onCreateInputConnection, editorInfo);
        InputConnection a10 = AbstractC1413o.a(onCreateInputConnection, editorInfo, this);
        if (a10 != null && Build.VERSION.SDK_INT <= 30 && (D10 = AbstractC1484a0.D(this)) != null) {
            C0.c.d(editorInfo, D10);
            a10 = C0.e.c(this, a10, editorInfo);
        }
        return this.f14192e.d(a10, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AbstractC1421x.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (AbstractC1421x.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1403e c1403e = this.f14188a;
        if (c1403e != null) {
            c1403e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1403e c1403e = this.f14188a;
        if (c1403e != null) {
            c1403e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f14189b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f14189b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f14192e.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f14192e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1403e c1403e = this.f14188a;
        if (c1403e != null) {
            c1403e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1403e c1403e = this.f14188a;
        if (c1403e != null) {
            c1403e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f14189b.w(colorStateList);
        this.f14189b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f14189b.x(mode);
        this.f14189b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f14189b;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        B b10;
        if (Build.VERSION.SDK_INT >= 28 || (b10 = this.f14190c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            b10.b(textClassifier);
        }
    }

    public C1410l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3170a.f33091z);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public C1410l(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        C1403e c1403e = new C1403e(this);
        this.f14188a = c1403e;
        c1403e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f14189b = c10;
        c10.m(attributeSet, i10);
        c10.b();
        this.f14190c = new B(this);
        this.f14191d = new androidx.core.widget.l();
        C1411m c1411m = new C1411m(this);
        this.f14192e = c1411m;
        c1411m.c(attributeSet, i10);
        d(c1411m);
    }
}
