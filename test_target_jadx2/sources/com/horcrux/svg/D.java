package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes2.dex */
class D extends C2923z {

    /* renamed from: f, reason: collision with root package name */
    private SVGLength f28854f;

    /* renamed from: g, reason: collision with root package name */
    private SVGLength f28855g;

    /* renamed from: h, reason: collision with root package name */
    private SVGLength f28856h;

    /* renamed from: i, reason: collision with root package name */
    private SVGLength f28857i;

    /* renamed from: j, reason: collision with root package name */
    private String f28858j;

    /* renamed from: k, reason: collision with root package name */
    private String f28859k;

    /* renamed from: l, reason: collision with root package name */
    private float f28860l;

    /* renamed from: m, reason: collision with root package name */
    private float f28861m;

    /* renamed from: n, reason: collision with root package name */
    private float f28862n;

    /* renamed from: o, reason: collision with root package name */
    private float f28863o;

    /* renamed from: p, reason: collision with root package name */
    String f28864p;

    /* renamed from: q, reason: collision with root package name */
    int f28865q;

    /* renamed from: r, reason: collision with root package name */
    Matrix f28866r;

    public D(ReactContext reactContext) {
        super(reactContext);
        this.f28866r = new Matrix();
    }

    void C(Canvas canvas, Paint paint, float f10, L l10, float f11) {
        int saveAndSetupCanvas = saveAndSetupCanvas(canvas, this.mCTM);
        this.f28866r.reset();
        J j10 = l10.f28915b;
        this.f28866r.setTranslate((float) j10.f28904a, (float) j10.f28905b);
        double parseDouble = "auto".equals(this.f28859k) ? -1.0d : Double.parseDouble(this.f28859k);
        if (parseDouble == -1.0d) {
            parseDouble = l10.f28916c;
        }
        this.f28866r.preRotate(((float) parseDouble) + 180.0f);
        if ("strokeWidth".equals(this.f28858j)) {
            Matrix matrix = this.f28866r;
            float f12 = this.mScale;
            matrix.preScale(f11 / f12, f11 / f12);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) (relativeOnWidth(this.f28856h) / this.mScale), (float) (relativeOnHeight(this.f28857i) / this.mScale));
        if (this.f28864p != null) {
            float f13 = this.f28860l;
            float f14 = this.mScale;
            float f15 = this.f28861m;
            Matrix a10 = o0.a(new RectF(f13 * f14, f15 * f14, (f13 + this.f28862n) * f14, (f15 + this.f28863o) * f14), rectF, this.f28864p, this.f28865q);
            float[] fArr = new float[9];
            a10.getValues(fArr);
            this.f28866r.preScale(fArr[0], fArr[4]);
        }
        this.f28866r.preTranslate((float) (-relativeOnWidth(this.f28854f)), (float) (-relativeOnHeight(this.f28855g)));
        canvas.concat(this.f28866r);
        r(canvas, paint, f10);
        restoreCanvas(canvas, saveAndSetupCanvas);
    }

    public void D(Dynamic dynamic) {
        this.f28857i = SVGLength.b(dynamic);
        invalidate();
    }

    public void E(String str) {
        this.f28858j = str;
        invalidate();
    }

    public void F(Dynamic dynamic) {
        this.f28856h = SVGLength.b(dynamic);
        invalidate();
    }

    public void G(String str) {
        this.f28859k = str;
        invalidate();
    }

    public void H(Dynamic dynamic) {
        this.f28854f = SVGLength.b(dynamic);
        invalidate();
    }

    public void I(Dynamic dynamic) {
        this.f28855g = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.C2923z, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }

    public void setAlign(String str) {
        this.f28864p = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f28865q = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f28860l = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f28861m = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f28863o = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f28862n = f10;
        invalidate();
    }
}
