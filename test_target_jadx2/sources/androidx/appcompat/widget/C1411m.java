package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import g.AbstractC3179j;

/* renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1411m {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f14217a;

    /* renamed from: b, reason: collision with root package name */
    private final S0.a f14218b;

    C1411m(EditText editText) {
        this.f14217a = editText;
        this.f14218b = new S0.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f14218b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f14217a.getContext().obtainStyledAttributes(attributeSet, AbstractC3179j.f33393g0, i10, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(AbstractC3179j.f33463u0) ? obtainStyledAttributes.getBoolean(AbstractC3179j.f33463u0, true) : true;
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f14218b.b(inputConnection, editorInfo);
    }

    void e(boolean z10) {
        this.f14218b.c(z10);
    }
}
