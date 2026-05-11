package com.facebook.react.views.view;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.core.view.AbstractC1484a0;
import c5.C1729b;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private C1729b f22992a;

    /* renamed from: b, reason: collision with root package name */
    private View f22993b;

    /* renamed from: c, reason: collision with root package name */
    private int f22994c = 0;

    /* renamed from: d, reason: collision with root package name */
    private a f22995d = a.VISIBLE;

    private enum a {
        VISIBLE,
        HIDDEN,
        SCROLL
    }

    public g(View view) {
        this.f22993b = view;
    }

    private C1729b c() {
        if (this.f22992a == null) {
            this.f22992a = new C1729b(this.f22993b.getContext());
            Drawable background = this.f22993b.getBackground();
            AbstractC1484a0.u0(this.f22993b, null);
            if (background == null) {
                AbstractC1484a0.u0(this.f22993b, this.f22992a);
            } else {
                AbstractC1484a0.u0(this.f22993b, new LayerDrawable(new Drawable[]{this.f22992a, background}));
            }
        }
        return this.f22992a;
    }

    public void a() {
        AbstractC1484a0.u0(this.f22993b, null);
        this.f22993b = null;
        this.f22992a = null;
    }

    public int b() {
        return this.f22994c;
    }

    public void d(Canvas canvas) {
        if (this.f22995d == a.VISIBLE) {
            return;
        }
        Rect rect = new Rect();
        this.f22993b.getDrawingRect(rect);
        C1729b c1729b = this.f22992a;
        if (c1729b == null) {
            canvas.clipRect(rect);
            return;
        }
        Path q10 = c1729b.q();
        if (q10 != null) {
            q10.offset(rect.left, rect.top);
            canvas.clipPath(q10);
        } else {
            RectF r10 = c1729b.r();
            r10.offset(rect.left, rect.top);
            canvas.clipRect(r10);
        }
    }

    public void e(int i10) {
        if (i10 == 0 && this.f22992a == null) {
            return;
        }
        c().E(i10);
    }

    public void f(int i10, Integer num) {
        c().y(i10, num);
    }

    public void g(float f10) {
        c().G(f10);
    }

    public void h(float f10, int i10) {
        c().H(f10, i10);
    }

    public void i(String str) {
        c().C(str);
    }

    public void j(int i10, float f10) {
        c().D(i10, f10);
    }

    public void k(String str) {
        a aVar = this.f22995d;
        if ("hidden".equals(str)) {
            this.f22995d = a.HIDDEN;
        } else if ("scroll".equals(str)) {
            this.f22995d = a.SCROLL;
        } else {
            this.f22995d = a.VISIBLE;
        }
        if (aVar != this.f22995d) {
            this.f22993b.invalidate();
        }
    }
}
