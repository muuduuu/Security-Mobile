package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.horcrux.svg.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2920w extends C2923z {

    /* renamed from: f, reason: collision with root package name */
    SVGLength f29082f;

    /* renamed from: g, reason: collision with root package name */
    SVGLength f29083g;

    /* renamed from: h, reason: collision with root package name */
    SVGLength f29084h;

    /* renamed from: i, reason: collision with root package name */
    SVGLength f29085i;

    /* renamed from: j, reason: collision with root package name */
    Bitmap f29086j;

    /* renamed from: k, reason: collision with root package name */
    Canvas f29087k;

    public C2920w(ReactContext reactContext) {
        super(reactContext);
        this.f29086j = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        this.f29087k = new Canvas(this.f29086j);
    }

    public void C(Dynamic dynamic) {
        this.f29085i = SVGLength.b(dynamic);
        invalidate();
    }

    public void D(Dynamic dynamic) {
        this.f29084h = SVGLength.b(dynamic);
        invalidate();
    }

    public void E(Dynamic dynamic) {
        this.f29082f = SVGLength.b(dynamic);
        invalidate();
    }

    public void F(Dynamic dynamic) {
        this.f29083g = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.f29087k);
    }

    @Override // com.horcrux.svg.C2923z, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        float relativeOnWidth = (float) relativeOnWidth(this.f29082f);
        float relativeOnHeight = (float) relativeOnHeight(this.f29083g);
        float relativeOnWidth2 = (float) relativeOnWidth(this.f29084h);
        float relativeOnHeight2 = (float) relativeOnHeight(this.f29085i);
        canvas.translate(relativeOnWidth, relativeOnHeight);
        canvas.clipRect(0.0f, 0.0f, relativeOnWidth2, relativeOnHeight2);
        super.draw(canvas, paint, f10);
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(this.f29087k, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // com.horcrux.svg.C2923z
    void r(Canvas canvas, Paint paint, float f10) {
        x();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof E)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z10 = virtualView instanceof RenderableView;
                        if (z10) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int saveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f10);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, saveAndSetupCanvas);
                        if (z10) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                } else {
                    childAt.draw(canvas);
                }
            }
        }
        setClientRect(rectF);
        w();
    }
}
