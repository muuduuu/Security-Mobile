package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2911n extends AbstractC2913p {

    /* renamed from: c, reason: collision with root package name */
    private ReadableArray f29049c;

    public C2911n(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC2913p
    public Bitmap r(HashMap hashMap, Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int size = this.f29049c.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = this.f29049c.getString(i10);
            Bitmap bitmap2 = string.isEmpty() ? bitmap : (Bitmap) hashMap.get(string);
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint());
            }
        }
        return createBitmap;
    }

    public void z(ReadableArray readableArray) {
        this.f29049c = readableArray;
        invalidate();
    }
}
