package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2912o extends AbstractC2913p {

    /* renamed from: c, reason: collision with root package name */
    String f29055c;

    /* renamed from: d, reason: collision with root package name */
    SVGLength f29056d;

    /* renamed from: e, reason: collision with root package name */
    SVGLength f29057e;

    public C2912o(ReactContext reactContext) {
        super(reactContext);
    }

    public void A(Dynamic dynamic) {
        this.f29057e = SVGLength.b(dynamic);
        invalidate();
    }

    public void B(String str) {
        this.f29055c = str;
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC2913p
    public Bitmap r(HashMap hashMap, Bitmap bitmap) {
        Bitmap t10 = AbstractC2913p.t(hashMap, bitmap, this.f29055c);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        SVGLength sVGLength = this.f29056d;
        float relativeOnWidth = sVGLength != null ? (float) relativeOnWidth(sVGLength) : 0.0f;
        SVGLength sVGLength2 = this.f29057e;
        RectF rectF = new RectF(0.0f, 0.0f, relativeOnWidth, sVGLength2 != null ? (float) relativeOnHeight(sVGLength2) : 0.0f);
        getSvgView().getCtm().mapRect(rectF);
        canvas.drawBitmap(t10, rectF.width(), rectF.height(), (Paint) null);
        return createBitmap;
    }

    public void z(Dynamic dynamic) {
        this.f29056d = SVGLength.b(dynamic);
        invalidate();
    }
}
