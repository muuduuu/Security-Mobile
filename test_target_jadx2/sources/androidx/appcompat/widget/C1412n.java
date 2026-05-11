package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import g.AbstractC3179j;

/* renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1412n {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f14219a;

    /* renamed from: b, reason: collision with root package name */
    private final S0.f f14220b;

    C1412n(TextView textView) {
        this.f14219a = textView;
        this.f14220b = new S0.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f14220b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f14220b.b();
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f14219a.getContext().obtainStyledAttributes(attributeSet, AbstractC3179j.f33393g0, i10, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(AbstractC3179j.f33463u0) ? obtainStyledAttributes.getBoolean(AbstractC3179j.f33463u0, true) : true;
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    void d(boolean z10) {
        this.f14220b.c(z10);
    }

    void e(boolean z10) {
        this.f14220b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f14220b.e(transformationMethod);
    }
}
