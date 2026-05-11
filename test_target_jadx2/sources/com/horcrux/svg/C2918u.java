package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2918u extends AbstractC2902e {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f29060a;

    /* renamed from: b, reason: collision with root package name */
    private EnumC2917t f29061b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC2917t f29062c;

    /* renamed from: d, reason: collision with root package name */
    private final FilterRegion f29063d;

    public C2918u(ReactContext reactContext) {
        super(reactContext);
        this.f29060a = new HashMap();
        this.f29063d = new FilterRegion();
    }

    public Bitmap r(Bitmap bitmap, Bitmap bitmap2, RectF rectF) {
        this.f29060a.clear();
        this.f29060a.put("SourceGraphic", bitmap);
        this.f29060a.put("SourceAlpha", FilterUtils.applySourceAlphaFilter(bitmap));
        this.f29060a.put("BackgroundImage", bitmap2);
        this.f29060a.put("BackgroundAlpha", FilterUtils.applySourceAlphaFilter(bitmap2));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Rect cropRect = this.f29063d.getCropRect(this, this.f29061b, rectF);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof AbstractC2913p) {
                AbstractC2913p abstractC2913p = (AbstractC2913p) childAt;
                createBitmap.eraseColor(0);
                FilterRegion filterRegion = abstractC2913p.f29059b;
                EnumC2917t enumC2917t = this.f29062c;
                Rect cropRect2 = filterRegion.getCropRect(abstractC2913p, enumC2917t, enumC2917t == EnumC2917t.USER_SPACE_ON_USE ? new RectF(cropRect) : rectF);
                canvas.drawBitmap(abstractC2913p.r(this.f29060a, bitmap), cropRect2, cropRect2, (Paint) null);
                bitmap = createBitmap.copy(Bitmap.Config.ARGB_8888, true);
                String s10 = abstractC2913p.s();
                if (s10 != null) {
                    this.f29060a.put(s10, bitmap);
                }
            } else {
                Log.e("RNSVG", "Invalid `Filter` child: Filter children can only be `Fe...` components");
            }
        }
        createBitmap.eraseColor(0);
        canvas.drawBitmap(bitmap, cropRect, cropRect, (Paint) null);
        return createBitmap;
    }

    public void s(String str) {
        this.f29061b = EnumC2917t.getEnum(str);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        SvgView svgView;
        if (this.mName == null || (svgView = getSvgView()) == null) {
            return;
        }
        svgView.defineFilter(this, this.mName);
    }

    public void t(Dynamic dynamic) {
        this.f29063d.setHeight(dynamic);
        invalidate();
    }

    public void u(String str) {
        this.f29062c = EnumC2917t.getEnum(str);
        invalidate();
    }

    public void v(Dynamic dynamic) {
        this.f29063d.setWidth(dynamic);
        invalidate();
    }

    public void w(Dynamic dynamic) {
        this.f29063d.setX(dynamic);
        invalidate();
    }

    public void x(Dynamic dynamic) {
        this.f29063d.setY(dynamic);
        invalidate();
    }
}
