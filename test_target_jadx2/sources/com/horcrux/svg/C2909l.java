package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.horcrux.svg.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2909l extends AbstractC2913p {

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f29031e = Pattern.compile("[0-9.-]+");

    /* renamed from: c, reason: collision with root package name */
    public ReadableArray f29032c;

    /* renamed from: d, reason: collision with root package name */
    public float f29033d;

    public C2909l(ReactContext reactContext) {
        super(reactContext);
        this.f29033d = 1.0f;
    }

    private void setupPaint(Paint paint, float f10, ReadableArray readableArray) {
        if (readableArray.getInt(0) != 0) {
            return;
        }
        if (readableArray.size() != 2) {
            paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * f10 * 255.0d : f10 * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
        } else {
            paint.setColor((Math.round((r13 >>> 24) * f10) << 24) | ((readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1)) & 16777215));
        }
    }

    public void A(ReadableMap readableMap) {
        if (readableMap == null) {
            this.f29032c = null;
            invalidate();
            return;
        }
        int i10 = readableMap.getInt("type");
        if (i10 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.f29032c = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.f29032c = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i10 == 1) {
            this.f29032c = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.f29032c = JavaOnlyArray.of(Integer.valueOf(i10));
        }
        invalidate();
    }

    public void B(float f10) {
        this.f29033d = f10;
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC2913p
    public Bitmap r(HashMap hashMap, Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setFlags(129);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, this.f29033d, this.f29032c);
        canvas.drawPaint(paint);
        return createBitmap;
    }

    public void z(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.f29032c = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Map)) {
            A(dynamic.asMap());
            return;
        }
        ReadableType type = dynamic.getType();
        int i10 = 0;
        if (type.equals(ReadableType.Number)) {
            this.f29032c = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.f29032c = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = f29031e.matcher(dynamic.asString());
            while (matcher.find()) {
                double parseDouble = Double.parseDouble(matcher.group());
                int i11 = i10 + 1;
                if (i10 < 3) {
                    parseDouble /= 255.0d;
                }
                javaOnlyArray.pushDouble(parseDouble);
                i10 = i11;
            }
            this.f29032c = javaOnlyArray;
        }
        invalidate();
    }
}
