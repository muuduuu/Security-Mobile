package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class B extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    private SVGLength f28842a;

    /* renamed from: b, reason: collision with root package name */
    private SVGLength f28843b;

    /* renamed from: c, reason: collision with root package name */
    private SVGLength f28844c;

    /* renamed from: d, reason: collision with root package name */
    private SVGLength f28845d;

    public B(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f28842a);
        double relativeOnHeight = relativeOnHeight(this.f28843b);
        double relativeOnWidth2 = relativeOnWidth(this.f28844c);
        double relativeOnHeight2 = relativeOnHeight(this.f28845d);
        path.moveTo((float) relativeOnWidth, (float) relativeOnHeight);
        path.lineTo((float) relativeOnWidth2, (float) relativeOnHeight2);
        ArrayList<F> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new F(EnumC2904g.kCGPathElementMoveToPoint, new J[]{new J(relativeOnWidth, relativeOnHeight)}));
        this.elements.add(new F(EnumC2904g.kCGPathElementAddLineToPoint, new J[]{new J(relativeOnWidth2, relativeOnHeight2)}));
        return path;
    }

    public void r(Dynamic dynamic) {
        this.f28842a = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f28844c = SVGLength.b(dynamic);
        invalidate();
    }

    public void t(Dynamic dynamic) {
        this.f28843b = SVGLength.b(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f28845d = SVGLength.b(dynamic);
        invalidate();
    }
}
