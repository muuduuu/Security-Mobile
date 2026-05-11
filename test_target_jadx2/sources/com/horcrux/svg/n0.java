package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes2.dex */
class n0 extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    private String f29050a;

    /* renamed from: b, reason: collision with root package name */
    private SVGLength f29051b;

    /* renamed from: c, reason: collision with root package name */
    private SVGLength f29052c;

    /* renamed from: d, reason: collision with root package name */
    private SVGLength f29053d;

    /* renamed from: e, reason: collision with root package name */
    private SVGLength f29054e;

    public n0(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f29050a);
        if (definedTemplate == null) {
            AbstractC1721a.J("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f29050a + " is not defined.");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f29051b), (float) relativeOnHeight(this.f29052c));
        boolean z10 = definedTemplate instanceof RenderableView;
        if (z10) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int saveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof Q) {
            ((Q) definedTemplate).C(canvas, paint, f10, (float) relativeOnWidth(this.f29053d), (float) relativeOnHeight(this.f29054e));
        } else {
            definedTemplate.draw(canvas, paint, f10 * this.mOpacity);
        }
        setClientRect(definedTemplate.getClientRect());
        definedTemplate.restoreCanvas(canvas, saveAndSetupCanvas);
        if (z10) {
            ((RenderableView) definedTemplate).resetProperties();
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f29050a);
        if (definedTemplate == null) {
            AbstractC1721a.J("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f29050a + " is not defined.");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f29051b), (float) relativeOnHeight(this.f29052c));
        path.transform(matrix, path2);
        return path2;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f29050a);
            if (definedTemplate == null) {
                AbstractC1721a.J("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f29050a + " is not defined.");
                return -1;
            }
            int hitTest = definedTemplate.hitTest(fArr2);
            if (hitTest != -1) {
                return (definedTemplate.isResponsible() || hitTest != definedTemplate.getId()) ? hitTest : getId();
            }
        }
        return -1;
    }

    public void r(Dynamic dynamic) {
        this.f29054e = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(String str) {
        this.f29050a = str;
        invalidate();
    }

    public void t(Dynamic dynamic) {
        this.f29053d = SVGLength.b(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f29051b = SVGLength.b(dynamic);
        invalidate();
    }

    public void v(Dynamic dynamic) {
        this.f29052c = SVGLength.b(dynamic);
        invalidate();
    }
}
