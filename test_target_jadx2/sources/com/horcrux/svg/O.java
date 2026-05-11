package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class O extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    private SVGLength f28929a;

    /* renamed from: b, reason: collision with root package name */
    private SVGLength f28930b;

    /* renamed from: c, reason: collision with root package name */
    private SVGLength f28931c;

    /* renamed from: d, reason: collision with root package name */
    private SVGLength f28932d;

    /* renamed from: e, reason: collision with root package name */
    private SVGLength f28933e;

    /* renamed from: f, reason: collision with root package name */
    private SVGLength f28934f;

    public O(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Path getPath(Canvas canvas, Paint paint) {
        double relativeOnWidth;
        double relativeOnHeight;
        double d10;
        double d11;
        double d12;
        Path path = new Path();
        double relativeOnWidth2 = relativeOnWidth(this.f28929a);
        double relativeOnHeight2 = relativeOnHeight(this.f28930b);
        double relativeOnWidth3 = relativeOnWidth(this.f28931c);
        double relativeOnHeight3 = relativeOnHeight(this.f28932d);
        SVGLength sVGLength = this.f28933e;
        if (sVGLength == null && this.f28934f == null) {
            path.addRect((float) relativeOnWidth2, (float) relativeOnHeight2, (float) (relativeOnWidth2 + relativeOnWidth3), (float) (relativeOnHeight2 + relativeOnHeight3), Path.Direction.CW);
            path.close();
            d12 = relativeOnWidth3;
        } else {
            if (sVGLength == null) {
                relativeOnWidth = relativeOnHeight(this.f28934f);
            } else if (this.f28934f == null) {
                relativeOnWidth = relativeOnWidth(sVGLength);
            } else {
                relativeOnWidth = relativeOnWidth(sVGLength);
                relativeOnHeight = relativeOnHeight(this.f28934f);
                d10 = relativeOnWidth3 / 2.0d;
                if (relativeOnWidth > d10) {
                    relativeOnWidth = d10;
                }
                d11 = relativeOnHeight3 / 2.0d;
                if (relativeOnHeight > d11) {
                    relativeOnHeight = d11;
                }
                d12 = relativeOnWidth3;
                path.addRoundRect((float) relativeOnWidth2, (float) relativeOnHeight2, (float) (relativeOnWidth2 + relativeOnWidth3), (float) (relativeOnHeight2 + relativeOnHeight3), (float) relativeOnWidth, (float) relativeOnHeight, Path.Direction.CW);
            }
            relativeOnHeight = relativeOnWidth;
            d10 = relativeOnWidth3 / 2.0d;
            if (relativeOnWidth > d10) {
            }
            d11 = relativeOnHeight3 / 2.0d;
            if (relativeOnHeight > d11) {
            }
            d12 = relativeOnWidth3;
            path.addRoundRect((float) relativeOnWidth2, (float) relativeOnHeight2, (float) (relativeOnWidth2 + relativeOnWidth3), (float) (relativeOnHeight2 + relativeOnHeight3), (float) relativeOnWidth, (float) relativeOnHeight, Path.Direction.CW);
        }
        ArrayList<F> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new F(EnumC2904g.kCGPathElementMoveToPoint, new J[]{new J(relativeOnWidth2, relativeOnHeight2)}));
        ArrayList<F> arrayList2 = this.elements;
        EnumC2904g enumC2904g = EnumC2904g.kCGPathElementAddLineToPoint;
        double d13 = relativeOnWidth2 + d12;
        arrayList2.add(new F(enumC2904g, new J[]{new J(d13, relativeOnHeight2)}));
        double d14 = relativeOnHeight2 + relativeOnHeight3;
        this.elements.add(new F(enumC2904g, new J[]{new J(d13, d14)}));
        this.elements.add(new F(enumC2904g, new J[]{new J(relativeOnWidth2, d14)}));
        this.elements.add(new F(enumC2904g, new J[]{new J(relativeOnWidth2, relativeOnHeight2)}));
        return path;
    }

    public void r(Dynamic dynamic) {
        this.f28932d = SVGLength.b(dynamic);
        invalidate();
    }

    public void s(Dynamic dynamic) {
        this.f28933e = SVGLength.b(dynamic);
        invalidate();
    }

    public void t(Dynamic dynamic) {
        this.f28934f = SVGLength.b(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f28931c = SVGLength.b(dynamic);
        invalidate();
    }

    public void v(Dynamic dynamic) {
        this.f28929a = SVGLength.b(dynamic);
        invalidate();
    }

    public void w(Dynamic dynamic) {
        this.f28930b = SVGLength.b(dynamic);
        invalidate();
    }
}
