package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C2898a;

/* loaded from: classes2.dex */
class I extends C2923z {

    /* renamed from: s, reason: collision with root package name */
    private static final float[] f28890s = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: f, reason: collision with root package name */
    private SVGLength f28891f;

    /* renamed from: g, reason: collision with root package name */
    private SVGLength f28892g;

    /* renamed from: h, reason: collision with root package name */
    private SVGLength f28893h;

    /* renamed from: i, reason: collision with root package name */
    private SVGLength f28894i;

    /* renamed from: j, reason: collision with root package name */
    private C2898a.b f28895j;

    /* renamed from: k, reason: collision with root package name */
    private C2898a.b f28896k;

    /* renamed from: l, reason: collision with root package name */
    private float f28897l;

    /* renamed from: m, reason: collision with root package name */
    private float f28898m;

    /* renamed from: n, reason: collision with root package name */
    private float f28899n;

    /* renamed from: o, reason: collision with root package name */
    private float f28900o;

    /* renamed from: p, reason: collision with root package name */
    String f28901p;

    /* renamed from: q, reason: collision with root package name */
    int f28902q;

    /* renamed from: r, reason: collision with root package name */
    private Matrix f28903r;

    public I(ReactContext reactContext) {
        super(reactContext);
        this.f28903r = null;
    }

    public void C(Dynamic dynamic) {
        this.f28894i = SVGLength.b(dynamic);
        invalidate();
    }

    public void D(int i10) {
        if (i10 == 0) {
            this.f28896k = C2898a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f28896k = C2898a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void E(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f28890s;
            int c10 = K.c(readableArray, fArr, this.mScale);
            if (c10 == 6) {
                if (this.f28903r == null) {
                    this.f28903r = new Matrix();
                }
                this.f28903r.setValues(fArr);
            } else if (c10 != -1) {
                AbstractC1721a.J("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f28903r = null;
        }
        invalidate();
    }

    public void F(int i10) {
        if (i10 == 0) {
            this.f28895j = C2898a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f28895j = C2898a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void G(Dynamic dynamic) {
        this.f28893h = SVGLength.b(dynamic);
        invalidate();
    }

    public void H(Dynamic dynamic) {
        this.f28891f = SVGLength.b(dynamic);
        invalidate();
    }

    public void I(Dynamic dynamic) {
        this.f28892g = SVGLength.b(dynamic);
        invalidate();
    }

    RectF getViewBox() {
        float f10 = this.f28897l;
        float f11 = this.mScale;
        float f12 = this.f28898m;
        return new RectF(f10 * f11, f12 * f11, (f10 + this.f28899n) * f11, (f12 + this.f28900o) * f11);
    }

    @Override // com.horcrux.svg.C2923z, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            C2898a c2898a = new C2898a(C2898a.EnumC0429a.PATTERN, new SVGLength[]{this.f28891f, this.f28892g, this.f28893h, this.f28894i}, this.f28895j);
            c2898a.d(this.f28896k);
            c2898a.g(this);
            Matrix matrix = this.f28903r;
            if (matrix != null) {
                c2898a.f(matrix);
            }
            SvgView svgView = getSvgView();
            C2898a.b bVar = this.f28895j;
            C2898a.b bVar2 = C2898a.b.USER_SPACE_ON_USE;
            if (bVar == bVar2 || this.f28896k == bVar2) {
                c2898a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c2898a, this.mName);
        }
    }

    public void setAlign(String str) {
        this.f28901p = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f28902q = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f28897l = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f28898m = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f28900o = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f28899n = f10;
        invalidate();
    }
}
