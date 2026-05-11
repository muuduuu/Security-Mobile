package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import g.AbstractC3179j;

/* renamed from: androidx.appcompat.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1397a {
    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z10);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z10);

    public abstract void s(boolean z10);

    public abstract void t(Drawable drawable);

    public abstract void u(boolean z10);

    public abstract void v(CharSequence charSequence);

    public abstract void w(CharSequence charSequence);

    public androidx.appcompat.view.b x(b.a aVar) {
        return null;
    }

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0243a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f13148a;

        public C0243a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13148a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3179j.f33457t);
            this.f13148a = obtainStyledAttributes.getInt(AbstractC3179j.f33462u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0243a(int i10, int i11) {
            super(i10, i11);
            this.f13148a = 8388627;
        }

        public C0243a(C0243a c0243a) {
            super((ViewGroup.MarginLayoutParams) c0243a);
            this.f13148a = 0;
            this.f13148a = c0243a.f13148a;
        }

        public C0243a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13148a = 0;
        }
    }
}
