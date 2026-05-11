package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.AbstractC1484a0;
import g.AbstractC3179j;

/* renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1403e {

    /* renamed from: a, reason: collision with root package name */
    private final View f14135a;

    /* renamed from: d, reason: collision with root package name */
    private f0 f14138d;

    /* renamed from: e, reason: collision with root package name */
    private f0 f14139e;

    /* renamed from: f, reason: collision with root package name */
    private f0 f14140f;

    /* renamed from: c, reason: collision with root package name */
    private int f14137c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final C1409k f14136b = C1409k.b();

    C1403e(View view) {
        this.f14135a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f14140f == null) {
            this.f14140f = new f0();
        }
        f0 f0Var = this.f14140f;
        f0Var.a();
        ColorStateList r10 = AbstractC1484a0.r(this.f14135a);
        if (r10 != null) {
            f0Var.f14151d = true;
            f0Var.f14148a = r10;
        }
        PorterDuff.Mode s10 = AbstractC1484a0.s(this.f14135a);
        if (s10 != null) {
            f0Var.f14150c = true;
            f0Var.f14149b = s10;
        }
        if (!f0Var.f14151d && !f0Var.f14150c) {
            return false;
        }
        C1409k.i(drawable, f0Var, this.f14135a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f14138d != null;
    }

    void b() {
        Drawable background = this.f14135a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            f0 f0Var = this.f14139e;
            if (f0Var != null) {
                C1409k.i(background, f0Var, this.f14135a.getDrawableState());
                return;
            }
            f0 f0Var2 = this.f14138d;
            if (f0Var2 != null) {
                C1409k.i(background, f0Var2, this.f14135a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        f0 f0Var = this.f14139e;
        if (f0Var != null) {
            return f0Var.f14148a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        f0 f0Var = this.f14139e;
        if (f0Var != null) {
            return f0Var.f14149b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        h0 v10 = h0.v(this.f14135a.getContext(), attributeSet, AbstractC3179j.f33294K3, i10, 0);
        View view = this.f14135a;
        AbstractC1484a0.o0(view, view.getContext(), AbstractC3179j.f33294K3, attributeSet, v10.r(), i10, 0);
        try {
            if (v10.s(AbstractC3179j.f33299L3)) {
                this.f14137c = v10.n(AbstractC3179j.f33299L3, -1);
                ColorStateList f10 = this.f14136b.f(this.f14135a.getContext(), this.f14137c);
                if (f10 != null) {
                    h(f10);
                }
            }
            if (v10.s(AbstractC3179j.f33304M3)) {
                AbstractC1484a0.v0(this.f14135a, v10.c(AbstractC3179j.f33304M3));
            }
            if (v10.s(AbstractC3179j.f33309N3)) {
                AbstractC1484a0.w0(this.f14135a, O.e(v10.k(AbstractC3179j.f33309N3, -1), null));
            }
            v10.x();
        } catch (Throwable th) {
            v10.x();
            throw th;
        }
    }

    void f(Drawable drawable) {
        this.f14137c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f14137c = i10;
        C1409k c1409k = this.f14136b;
        h(c1409k != null ? c1409k.f(this.f14135a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f14138d == null) {
                this.f14138d = new f0();
            }
            f0 f0Var = this.f14138d;
            f0Var.f14148a = colorStateList;
            f0Var.f14151d = true;
        } else {
            this.f14138d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f14139e == null) {
            this.f14139e = new f0();
        }
        f0 f0Var = this.f14139e;
        f0Var.f14148a = colorStateList;
        f0Var.f14151d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f14139e == null) {
            this.f14139e = new f0();
        }
        f0 f0Var = this.f14139e;
        f0Var.f14149b = mode;
        f0Var.f14150c = true;
        b();
    }
}
