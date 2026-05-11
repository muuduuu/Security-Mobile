package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.AbstractC1484a0;
import g.AbstractC3179j;
import h.AbstractC3220a;

/* renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1408j {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f14171a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f14172b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f14173c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14174d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14175e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14176f;

    C1408j(CompoundButton compoundButton) {
        this.f14171a = compoundButton;
    }

    void a() {
        Drawable a10 = androidx.core.widget.c.a(this.f14171a);
        if (a10 != null) {
            if (this.f14174d || this.f14175e) {
                Drawable mutate = androidx.core.graphics.drawable.a.l(a10).mutate();
                if (this.f14174d) {
                    androidx.core.graphics.drawable.a.i(mutate, this.f14172b);
                }
                if (this.f14175e) {
                    androidx.core.graphics.drawable.a.j(mutate, this.f14173c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f14171a.getDrawableState());
                }
                this.f14171a.setButtonDrawable(mutate);
            }
        }
    }

    ColorStateList b() {
        return this.f14172b;
    }

    PorterDuff.Mode c() {
        return this.f14173c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005c, B:11:0x0064, B:12:0x006f, B:14:0x0077, B:21:0x003f, B:23:0x0047, B:25:0x004f), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005c, B:11:0x0064, B:12:0x006f, B:14:0x0077, B:21:0x003f, B:23:0x0047, B:25:0x004f), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void d(AttributeSet attributeSet, int i10) {
        int n10;
        int n11;
        h0 v10 = h0.v(this.f14171a.getContext(), attributeSet, AbstractC3179j.f33339U0, i10, 0);
        CompoundButton compoundButton = this.f14171a;
        AbstractC1484a0.o0(compoundButton, compoundButton.getContext(), AbstractC3179j.f33339U0, attributeSet, v10.r(), i10, 0);
        try {
            if (v10.s(AbstractC3179j.f33347W0) && (n11 = v10.n(AbstractC3179j.f33347W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f14171a;
                    compoundButton2.setButtonDrawable(AbstractC3220a.b(compoundButton2.getContext(), n11));
                } catch (Resources.NotFoundException unused) {
                }
                if (v10.s(AbstractC3179j.f33351X0)) {
                    androidx.core.widget.c.c(this.f14171a, v10.c(AbstractC3179j.f33351X0));
                }
                if (v10.s(AbstractC3179j.f33355Y0)) {
                    androidx.core.widget.c.d(this.f14171a, O.e(v10.k(AbstractC3179j.f33355Y0, -1), null));
                }
            }
            if (v10.s(AbstractC3179j.f33343V0) && (n10 = v10.n(AbstractC3179j.f33343V0, 0)) != 0) {
                CompoundButton compoundButton3 = this.f14171a;
                compoundButton3.setButtonDrawable(AbstractC3220a.b(compoundButton3.getContext(), n10));
            }
            if (v10.s(AbstractC3179j.f33351X0)) {
            }
            if (v10.s(AbstractC3179j.f33355Y0)) {
            }
        } finally {
            v10.x();
        }
    }

    void e() {
        if (this.f14176f) {
            this.f14176f = false;
        } else {
            this.f14176f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f14172b = colorStateList;
        this.f14174d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f14173c = mode;
        this.f14175e = true;
        a();
    }
}
