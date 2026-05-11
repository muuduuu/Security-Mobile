package com.horcrux.svg;

import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.horcrux.svg.SVGLength;

/* loaded from: classes2.dex */
public class FilterRegion {
    SVGLength mH;
    SVGLength mW;
    SVGLength mX;
    SVGLength mY;

    private double getRelativeOrDefault(VirtualView virtualView, SVGLength sVGLength, float f10, double d10) {
        return (sVGLength == null || sVGLength.f28947b == SVGLength.UnitType.UNKNOWN) ? d10 : virtualView.relativeOn(sVGLength, f10);
    }

    public Rect getCropRect(VirtualView virtualView, EnumC2917t enumC2917t, RectF rectF) {
        double relativeOrDefault;
        double d10;
        double d11;
        double d12;
        if (rectF == null) {
            return new Rect(0, 0, 0, 0);
        }
        if (enumC2917t == EnumC2917t.OBJECT_BOUNDING_BOX) {
            d10 = rectF.left + virtualView.relativeOnFraction(this.mX, rectF.width());
            d11 = rectF.top + virtualView.relativeOnFraction(this.mY, rectF.height());
            d12 = virtualView.relativeOnFraction(this.mW, rectF.width());
            relativeOrDefault = virtualView.relativeOnFraction(this.mH, rectF.height());
        } else {
            float canvasWidth = virtualView.getSvgView().getCanvasWidth();
            float canvasHeight = virtualView.getSvgView().getCanvasHeight();
            double relativeOrDefault2 = getRelativeOrDefault(virtualView, this.mX, canvasWidth, rectF.left);
            double relativeOrDefault3 = getRelativeOrDefault(virtualView, this.mY, canvasHeight, rectF.top);
            double relativeOrDefault4 = getRelativeOrDefault(virtualView, this.mW, canvasWidth, rectF.width());
            relativeOrDefault = getRelativeOrDefault(virtualView, this.mH, canvasHeight, rectF.height());
            d10 = relativeOrDefault2;
            d11 = relativeOrDefault3;
            d12 = relativeOrDefault4;
        }
        return new Rect((int) d10, (int) d11, (int) (d10 + d12), (int) (d11 + relativeOrDefault));
    }

    public void setHeight(Dynamic dynamic) {
        this.mH = SVGLength.b(dynamic);
    }

    public void setWidth(Dynamic dynamic) {
        this.mW = SVGLength.b(dynamic);
    }

    public void setX(Dynamic dynamic) {
        this.mX = SVGLength.b(dynamic);
    }

    public void setY(Dynamic dynamic) {
        this.mY = SVGLength.b(dynamic);
    }
}
