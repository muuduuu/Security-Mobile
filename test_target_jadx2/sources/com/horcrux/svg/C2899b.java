package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2899b extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    private SVGLength f29016a;

    /* renamed from: b, reason: collision with root package name */
    private SVGLength f29017b;

    /* renamed from: c, reason: collision with root package name */
    private SVGLength f29018c;

    public C2899b(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f29016a);
        double relativeOnHeight = relativeOnHeight(this.f29017b);
        double relativeOnOther = relativeOnOther(this.f29018c);
        path.addCircle((float) relativeOnWidth, (float) relativeOnHeight, (float) relativeOnOther, Path.Direction.CW);
        ArrayList<F> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d10 = relativeOnHeight - relativeOnOther;
        arrayList.add(new F(EnumC2904g.kCGPathElementMoveToPoint, new J[]{new J(relativeOnWidth, d10)}));
        ArrayList<F> arrayList2 = this.elements;
        EnumC2904g enumC2904g = EnumC2904g.kCGPathElementAddLineToPoint;
        J j10 = new J(relativeOnWidth, d10);
        double d11 = relativeOnWidth + relativeOnOther;
        arrayList2.add(new F(enumC2904g, new J[]{j10, new J(d11, relativeOnHeight)}));
        double d12 = relativeOnHeight + relativeOnOther;
        this.elements.add(new F(enumC2904g, new J[]{new J(d11, relativeOnHeight), new J(relativeOnWidth, d12)}));
        double d13 = relativeOnWidth - relativeOnOther;
        this.elements.add(new F(enumC2904g, new J[]{new J(relativeOnWidth, d12), new J(d13, relativeOnHeight)}));
        this.elements.add(new F(enumC2904g, new J[]{new J(d13, relativeOnHeight), new J(relativeOnWidth, d10)}));
        return path;
    }

    public void r(Dynamic dynamic) {
        this.f29016a = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f29017b = SVGLength.b(dynamic);
        invalidate();
    }

    public void t(Dynamic dynamic) {
        this.f29018c = SVGLength.b(dynamic);
        invalidate();
    }
}
