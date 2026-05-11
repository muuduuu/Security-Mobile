package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2905h extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    private SVGLength f29019a;

    /* renamed from: b, reason: collision with root package name */
    private SVGLength f29020b;

    /* renamed from: c, reason: collision with root package name */
    private SVGLength f29021c;

    /* renamed from: d, reason: collision with root package name */
    private SVGLength f29022d;

    public C2905h(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f29019a);
        double relativeOnHeight = relativeOnHeight(this.f29020b);
        double relativeOnWidth2 = relativeOnWidth(this.f29021c);
        double relativeOnHeight2 = relativeOnHeight(this.f29022d);
        double d10 = relativeOnWidth - relativeOnWidth2;
        double d11 = relativeOnHeight - relativeOnHeight2;
        double d12 = relativeOnWidth2 + relativeOnWidth;
        double d13 = relativeOnHeight2 + relativeOnHeight;
        path.addOval(new RectF((float) d10, (float) d11, (float) d12, (float) d13), Path.Direction.CW);
        ArrayList<F> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new F(EnumC2904g.kCGPathElementMoveToPoint, new J[]{new J(relativeOnWidth, d11)}));
        ArrayList<F> arrayList2 = this.elements;
        EnumC2904g enumC2904g = EnumC2904g.kCGPathElementAddLineToPoint;
        arrayList2.add(new F(enumC2904g, new J[]{new J(relativeOnWidth, d11), new J(d12, relativeOnHeight)}));
        this.elements.add(new F(enumC2904g, new J[]{new J(d12, relativeOnHeight), new J(relativeOnWidth, d13)}));
        this.elements.add(new F(enumC2904g, new J[]{new J(relativeOnWidth, d13), new J(d10, relativeOnHeight)}));
        this.elements.add(new F(enumC2904g, new J[]{new J(d10, relativeOnHeight), new J(relativeOnWidth, d11)}));
        return path;
    }

    public void r(Dynamic dynamic) {
        this.f29019a = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f29020b = SVGLength.b(dynamic);
        invalidate();
    }

    public void t(Dynamic dynamic) {
        this.f29021c = SVGLength.b(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f29022d = SVGLength.b(dynamic);
        invalidate();
    }
}
