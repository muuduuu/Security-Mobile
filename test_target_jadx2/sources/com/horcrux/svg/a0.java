package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes2.dex */
class a0 extends m0 {

    /* renamed from: q, reason: collision with root package name */
    private String f29010q;

    /* renamed from: r, reason: collision with root package name */
    private k0 f29011r;

    /* renamed from: s, reason: collision with root package name */
    private j0 f29012s;

    /* renamed from: t, reason: collision with root package name */
    private SVGLength f29013t;

    /* renamed from: u, reason: collision with root package name */
    private i0 f29014u;

    /* renamed from: v, reason: collision with root package name */
    private l0 f29015v;

    public a0(ReactContext reactContext) {
        super(reactContext);
        this.f29014u = i0.align;
        this.f29015v = l0.exact;
    }

    @Override // com.horcrux.svg.m0
    public void N(String str) {
        this.f29014u = i0.valueOf(str);
        invalidate();
    }

    j0 T() {
        return this.f29012s;
    }

    k0 U() {
        return this.f29011r;
    }

    SVGLength V() {
        return this.f29013t;
    }

    Path W(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f29010q);
        if (definedTemplate instanceof RenderableView) {
            return ((RenderableView) definedTemplate).getPath(canvas, paint);
        }
        return null;
    }

    public void X(String str) {
        this.f29010q = str;
        invalidate();
    }

    public void Y(String str) {
        this.f29012s = j0.valueOf(str);
        invalidate();
    }

    public void Z(String str) {
        this.f29011r = k0.valueOf(str);
        invalidate();
    }

    public void a0(String str) {
        this.f29015v = l0.valueOf(str);
        invalidate();
    }

    public void b0(Dynamic dynamic) {
        this.f29013t = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.m0, com.horcrux.svg.C2923z, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        r(canvas, paint, f10);
    }

    @Override // com.horcrux.svg.m0, com.horcrux.svg.C2923z, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return E(canvas, paint);
    }

    @Override // com.horcrux.svg.C2923z
    void w() {
    }

    @Override // com.horcrux.svg.m0, com.horcrux.svg.C2923z
    void x() {
    }
}
