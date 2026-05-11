package com.horcrux.svg;

import android.graphics.Matrix;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C2898a;

/* loaded from: classes2.dex */
class C extends AbstractC2902e {

    /* renamed from: h, reason: collision with root package name */
    private static final float[] f28846h = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private SVGLength f28847a;

    /* renamed from: b, reason: collision with root package name */
    private SVGLength f28848b;

    /* renamed from: c, reason: collision with root package name */
    private SVGLength f28849c;

    /* renamed from: d, reason: collision with root package name */
    private SVGLength f28850d;

    /* renamed from: e, reason: collision with root package name */
    private ReadableArray f28851e;

    /* renamed from: f, reason: collision with root package name */
    private C2898a.b f28852f;

    /* renamed from: g, reason: collision with root package name */
    private Matrix f28853g;

    public C(ReactContext reactContext) {
        super(reactContext);
        this.f28853g = null;
    }

    public void r(ReadableArray readableArray) {
        this.f28851e = readableArray;
        invalidate();
    }

    public void s(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f28846h;
            int c10 = K.c(readableArray, fArr, this.mScale);
            if (c10 == 6) {
                if (this.f28853g == null) {
                    this.f28853g = new Matrix();
                }
                this.f28853g.setValues(fArr);
            } else if (c10 != -1) {
                AbstractC1721a.J("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f28853g = null;
        }
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            C2898a c2898a = new C2898a(C2898a.EnumC0429a.LINEAR_GRADIENT, new SVGLength[]{this.f28847a, this.f28848b, this.f28849c, this.f28850d}, this.f28852f);
            c2898a.e(this.f28851e);
            Matrix matrix = this.f28853g;
            if (matrix != null) {
                c2898a.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f28852f == C2898a.b.USER_SPACE_ON_USE) {
                c2898a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c2898a, this.mName);
        }
    }

    public void t(int i10) {
        if (i10 == 0) {
            this.f28852f = C2898a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f28852f = C2898a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f28847a = SVGLength.b(dynamic);
        invalidate();
    }

    public void v(Dynamic dynamic) {
        this.f28849c = SVGLength.b(dynamic);
        invalidate();
    }

    public void w(Dynamic dynamic) {
        this.f28848b = SVGLength.b(dynamic);
        invalidate();
    }

    public void x(Dynamic dynamic) {
        this.f28850d = SVGLength.b(dynamic);
        invalidate();
    }
}
