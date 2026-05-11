package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public abstract class b {
    public static WritableArray a(CharSequence charSequence, Layout layout, TextPaint textPaint, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray createArray = Arguments.createArray();
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(textPaint2.getTextSize() * 100.0f);
        int i10 = 0;
        int i11 = 1;
        textPaint2.getTextBounds("T", 0, 1, new Rect());
        double height = (r5.height() / 100.0f) / displayMetrics.density;
        textPaint2.getTextBounds("x", 0, 1, new Rect());
        double height2 = (r5.height() / 100.0f) / displayMetrics.density;
        while (i10 < layout.getLineCount()) {
            float lineWidth = (charSequence.length() <= 0 || charSequence.charAt(layout.getLineEnd(i10) - i11) != '\n') ? layout.getLineWidth(i10) : layout.getLineMax(i10);
            layout.getLineBounds(i10, new Rect());
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("x", layout.getLineLeft(i10) / displayMetrics.density);
            createMap.putDouble("y", r12.top / displayMetrics.density);
            createMap.putDouble("width", lineWidth / displayMetrics.density);
            createMap.putDouble("height", r12.height() / displayMetrics.density);
            createMap.putDouble("descender", layout.getLineDescent(i10) / displayMetrics.density);
            createMap.putDouble("ascender", (-layout.getLineAscent(i10)) / displayMetrics.density);
            createMap.putDouble("baseline", layout.getLineBaseline(i10) / displayMetrics.density);
            createMap.putDouble("capHeight", height);
            createMap.putDouble("xHeight", height2);
            createMap.putString("text", charSequence.subSequence(layout.getLineStart(i10), layout.getLineEnd(i10)).toString());
            createArray.pushMap(createMap);
            i10++;
            i11 = 1;
        }
        return createArray;
    }
}
