package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class m0 extends C2923z {

    /* renamed from: f, reason: collision with root package name */
    SVGLength f29038f;

    /* renamed from: g, reason: collision with root package name */
    SVGLength f29039g;

    /* renamed from: h, reason: collision with root package name */
    private String f29040h;

    /* renamed from: i, reason: collision with root package name */
    h0 f29041i;

    /* renamed from: j, reason: collision with root package name */
    private b0 f29042j;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f29043k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList f29044l;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f29045m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f29046n;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList f29047o;

    /* renamed from: p, reason: collision with root package name */
    double f29048p;

    public m0(ReactContext reactContext) {
        super(reactContext);
        this.f29038f = null;
        this.f29039g = null;
        this.f29040h = null;
        this.f29041i = h0.spacing;
        this.f29048p = Double.NaN;
    }

    b0 C() {
        b0 b0Var;
        if (this.f29042j == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof m0) && (b0Var = ((m0) parent).f29042j) != null) {
                    this.f29042j = b0Var;
                    return b0Var;
                }
            }
        }
        if (this.f29042j == null) {
            this.f29042j = b0.baseline;
        }
        return this.f29042j;
    }

    String D() {
        String str;
        if (this.f29040h == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof m0) && (str = ((m0) parent).f29040h) != null) {
                    this.f29040h = str;
                    return str;
                }
            }
        }
        return this.f29040h;
    }

    Path E(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        x();
        ((VirtualView) this).mPath = super.getPath(canvas, paint);
        w();
        return ((VirtualView) this).mPath;
    }

    double F(Paint paint) {
        if (!Double.isNaN(this.f29048p)) {
            return this.f29048p;
        }
        double d10 = 0.0d;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof m0) {
                d10 += ((m0) childAt).F(paint);
            }
        }
        this.f29048p = d10;
        return d10;
    }

    m0 G() {
        ArrayList arrayList = v().f29103a;
        ViewParent parent = getParent();
        m0 m0Var = this;
        for (int size = arrayList.size() - 1; size >= 0 && (parent instanceof m0) && ((C2919v) arrayList.get(size)).f29074j != f0.start && m0Var.f29043k == null; size--) {
            m0Var = (m0) parent;
            parent = m0Var.getParent();
        }
        return m0Var;
    }

    m0 H() {
        ViewParent parent = getParent();
        m0 m0Var = this;
        while (parent instanceof m0) {
            m0Var = (m0) parent;
            parent = m0Var.getParent();
        }
        return m0Var;
    }

    public void I(Dynamic dynamic) {
        this.f29040h = SVGLength.c(dynamic);
        invalidate();
    }

    public void J(Dynamic dynamic) {
        this.f29046n = SVGLength.a(dynamic);
        invalidate();
    }

    public void K(Dynamic dynamic) {
        this.f29047o = SVGLength.a(dynamic);
        invalidate();
    }

    public void L(Dynamic dynamic) {
        this.f29038f = SVGLength.b(dynamic);
        invalidate();
    }

    public void M(String str) {
        this.f29041i = h0.valueOf(str);
        invalidate();
    }

    public void N(String str) {
        this.f29042j = b0.getEnum(str);
        invalidate();
    }

    public void O(Dynamic dynamic) {
        this.f29043k = SVGLength.a(dynamic);
        invalidate();
    }

    public void P(Dynamic dynamic) {
        this.f29044l = SVGLength.a(dynamic);
        invalidate();
    }

    public void Q(Dynamic dynamic) {
        this.f29045m = SVGLength.a(dynamic);
        invalidate();
    }

    public void R(Dynamic dynamic) {
        this.f29039g = SVGLength.b(dynamic);
        invalidate();
    }

    public void S(Dynamic dynamic) {
        String c10 = SVGLength.c(dynamic);
        if (c10 != null) {
            String trim = c10.trim();
            int lastIndexOf = trim.lastIndexOf(32);
            try {
                this.f29042j = b0.getEnum(trim.substring(lastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.f29042j = b0.baseline;
            }
            try {
                this.f29040h = trim.substring(0, lastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.f29040h = null;
            }
        } else {
            this.f29042j = b0.baseline;
            this.f29040h = null;
        }
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void clearCache() {
        this.f29048p = Double.NaN;
        super.clearCache();
    }

    @Override // com.horcrux.svg.C2923z, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        B(canvas);
        clip(canvas, paint);
        E(canvas, paint);
        x();
        r(canvas, paint, f10);
        w();
    }

    @Override // com.horcrux.svg.C2923z, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        B(canvas);
        return E(canvas, paint);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (((VirtualView) this).mPath == null) {
            return;
        }
        super.invalidate();
        H().clearChildCache();
    }

    @Override // com.horcrux.svg.C2923z
    Path u(Canvas canvas, Paint paint, Region.Op op) {
        return getPath(canvas, paint);
    }

    @Override // com.horcrux.svg.C2923z
    void x() {
        v().p(((this instanceof a0) || (this instanceof Z)) ? false : true, this, this.f29132a, this.f29043k, this.f29044l, this.f29046n, this.f29047o, this.f29045m);
    }
}
