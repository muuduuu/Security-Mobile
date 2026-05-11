package com.horcrux.svg;

import android.graphics.Matrix;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C2898a;

/* loaded from: classes2.dex */
class N extends AbstractC2902e {

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f28919j = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private SVGLength f28920a;

    /* renamed from: b, reason: collision with root package name */
    private SVGLength f28921b;

    /* renamed from: c, reason: collision with root package name */
    private SVGLength f28922c;

    /* renamed from: d, reason: collision with root package name */
    private SVGLength f28923d;

    /* renamed from: e, reason: collision with root package name */
    private SVGLength f28924e;

    /* renamed from: f, reason: collision with root package name */
    private SVGLength f28925f;

    /* renamed from: g, reason: collision with root package name */
    private ReadableArray f28926g;

    /* renamed from: h, reason: collision with root package name */
    private C2898a.b f28927h;

    /* renamed from: i, reason: collision with root package name */
    private Matrix f28928i;

    public N(ReactContext reactContext) {
        super(reactContext);
        this.f28928i = null;
    }

    public void r(Dynamic dynamic) {
        this.f28924e = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f28925f = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            C2898a c2898a = new C2898a(C2898a.EnumC0429a.RADIAL_GRADIENT, new SVGLength[]{this.f28920a, this.f28921b, this.f28922c, this.f28923d, this.f28924e, this.f28925f}, this.f28927h);
            c2898a.e(this.f28926g);
            Matrix matrix = this.f28928i;
            if (matrix != null) {
                c2898a.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f28927h == C2898a.b.USER_SPACE_ON_USE) {
                c2898a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c2898a, this.mName);
        }
    }

    public void t(Dynamic dynamic) {
        this.f28920a = SVGLength.b(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f28921b = SVGLength.b(dynamic);
        invalidate();
    }

    public void v(ReadableArray readableArray) {
        this.f28926g = readableArray;
        invalidate();
    }

    public void w(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f28919j;
            int c10 = K.c(readableArray, fArr, this.mScale);
            if (c10 == 6) {
                if (this.f28928i == null) {
                    this.f28928i = new Matrix();
                }
                this.f28928i.setValues(fArr);
            } else if (c10 != -1) {
                AbstractC1721a.J("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f28928i = null;
        }
        invalidate();
    }

    public void x(int i10) {
        if (i10 == 0) {
            this.f28927h = C2898a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f28927h = C2898a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void y(Dynamic dynamic) {
        this.f28922c = SVGLength.b(dynamic);
        invalidate();
    }

    public void z(Dynamic dynamic) {
        this.f28923d = SVGLength.b(dynamic);
        invalidate();
    }
}
