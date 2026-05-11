package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.AbstractC1484a0;
import g.AbstractC3179j;
import h.AbstractC3220a;

/* renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1415q {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f14238a;

    /* renamed from: b, reason: collision with root package name */
    private f0 f14239b;

    /* renamed from: c, reason: collision with root package name */
    private f0 f14240c;

    /* renamed from: d, reason: collision with root package name */
    private f0 f14241d;

    /* renamed from: e, reason: collision with root package name */
    private int f14242e = 0;

    public C1415q(ImageView imageView) {
        this.f14238a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f14241d == null) {
            this.f14241d = new f0();
        }
        f0 f0Var = this.f14241d;
        f0Var.a();
        ColorStateList a10 = androidx.core.widget.g.a(this.f14238a);
        if (a10 != null) {
            f0Var.f14151d = true;
            f0Var.f14148a = a10;
        }
        PorterDuff.Mode b10 = androidx.core.widget.g.b(this.f14238a);
        if (b10 != null) {
            f0Var.f14150c = true;
            f0Var.f14149b = b10;
        }
        if (!f0Var.f14151d && !f0Var.f14150c) {
            return false;
        }
        C1409k.i(drawable, f0Var, this.f14238a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f14239b != null;
    }

    void b() {
        if (this.f14238a.getDrawable() != null) {
            this.f14238a.getDrawable().setLevel(this.f14242e);
        }
    }

    void c() {
        Drawable drawable = this.f14238a.getDrawable();
        if (drawable != null) {
            O.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            f0 f0Var = this.f14240c;
            if (f0Var != null) {
                C1409k.i(drawable, f0Var, this.f14238a.getDrawableState());
                return;
            }
            f0 f0Var2 = this.f14239b;
            if (f0Var2 != null) {
                C1409k.i(drawable, f0Var2, this.f14238a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        f0 f0Var = this.f14240c;
        if (f0Var != null) {
            return f0Var.f14148a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        f0 f0Var = this.f14240c;
        if (f0Var != null) {
            return f0Var.f14149b;
        }
        return null;
    }

    boolean f() {
        return !(this.f14238a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int n10;
        h0 v10 = h0.v(this.f14238a.getContext(), attributeSet, AbstractC3179j.f33315P, i10, 0);
        ImageView imageView = this.f14238a;
        AbstractC1484a0.o0(imageView, imageView.getContext(), AbstractC3179j.f33315P, attributeSet, v10.r(), i10, 0);
        try {
            Drawable drawable = this.f14238a.getDrawable();
            if (drawable == null && (n10 = v10.n(AbstractC3179j.f33320Q, -1)) != -1 && (drawable = AbstractC3220a.b(this.f14238a.getContext(), n10)) != null) {
                this.f14238a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                O.b(drawable);
            }
            if (v10.s(AbstractC3179j.f33325R)) {
                androidx.core.widget.g.c(this.f14238a, v10.c(AbstractC3179j.f33325R));
            }
            if (v10.s(AbstractC3179j.f33330S)) {
                androidx.core.widget.g.d(this.f14238a, O.e(v10.k(AbstractC3179j.f33330S, -1), null));
            }
            v10.x();
        } catch (Throwable th) {
            v10.x();
            throw th;
        }
    }

    void h(Drawable drawable) {
        this.f14242e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable b10 = AbstractC3220a.b(this.f14238a.getContext(), i10);
            if (b10 != null) {
                O.b(b10);
            }
            this.f14238a.setImageDrawable(b10);
        } else {
            this.f14238a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f14240c == null) {
            this.f14240c = new f0();
        }
        f0 f0Var = this.f14240c;
        f0Var.f14148a = colorStateList;
        f0Var.f14151d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f14240c == null) {
            this.f14240c = new f0();
        }
        f0 f0Var = this.f14240c;
        f0Var.f14149b = mode;
        f0Var.f14150c = true;
        c();
    }
}
