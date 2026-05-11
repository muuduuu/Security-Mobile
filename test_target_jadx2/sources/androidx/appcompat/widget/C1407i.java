package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.view.AbstractC1484a0;
import g.AbstractC3179j;
import h.AbstractC3220a;

/* renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1407i {

    /* renamed from: a, reason: collision with root package name */
    private final CheckedTextView f14164a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f14165b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f14166c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14167d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14168e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14169f;

    C1407i(CheckedTextView checkedTextView) {
        this.f14164a = checkedTextView;
    }

    void a() {
        Drawable a10 = androidx.core.widget.b.a(this.f14164a);
        if (a10 != null) {
            if (this.f14167d || this.f14168e) {
                Drawable mutate = androidx.core.graphics.drawable.a.l(a10).mutate();
                if (this.f14167d) {
                    androidx.core.graphics.drawable.a.i(mutate, this.f14165b);
                }
                if (this.f14168e) {
                    androidx.core.graphics.drawable.a.j(mutate, this.f14166c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f14164a.getDrawableState());
                }
                this.f14164a.setCheckMarkDrawable(mutate);
            }
        }
    }

    ColorStateList b() {
        return this.f14165b;
    }

    PorterDuff.Mode c() {
        return this.f14166c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005c, B:11:0x0064, B:12:0x006f, B:14:0x0077, B:21:0x003f, B:23:0x0047, B:25:0x004f), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005c, B:11:0x0064, B:12:0x006f, B:14:0x0077, B:21:0x003f, B:23:0x0047, B:25:0x004f), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void d(AttributeSet attributeSet, int i10) {
        int n10;
        int n11;
        h0 v10 = h0.v(this.f14164a.getContext(), attributeSet, AbstractC3179j.f33316P0, i10, 0);
        CheckedTextView checkedTextView = this.f14164a;
        AbstractC1484a0.o0(checkedTextView, checkedTextView.getContext(), AbstractC3179j.f33316P0, attributeSet, v10.r(), i10, 0);
        try {
            if (v10.s(AbstractC3179j.f33326R0) && (n11 = v10.n(AbstractC3179j.f33326R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f14164a;
                    checkedTextView2.setCheckMarkDrawable(AbstractC3220a.b(checkedTextView2.getContext(), n11));
                } catch (Resources.NotFoundException unused) {
                }
                if (v10.s(AbstractC3179j.f33331S0)) {
                    androidx.core.widget.b.b(this.f14164a, v10.c(AbstractC3179j.f33331S0));
                }
                if (v10.s(AbstractC3179j.f33335T0)) {
                    androidx.core.widget.b.c(this.f14164a, O.e(v10.k(AbstractC3179j.f33335T0, -1), null));
                }
            }
            if (v10.s(AbstractC3179j.f33321Q0) && (n10 = v10.n(AbstractC3179j.f33321Q0, 0)) != 0) {
                CheckedTextView checkedTextView3 = this.f14164a;
                checkedTextView3.setCheckMarkDrawable(AbstractC3220a.b(checkedTextView3.getContext(), n10));
            }
            if (v10.s(AbstractC3179j.f33331S0)) {
            }
            if (v10.s(AbstractC3179j.f33335T0)) {
            }
        } finally {
            v10.x();
        }
    }

    void e() {
        if (this.f14169f) {
            this.f14169f = false;
        } else {
            this.f14169f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f14165b = colorStateList;
        this.f14167d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f14166c = mode;
        this.f14168e = true;
        a();
    }
}
