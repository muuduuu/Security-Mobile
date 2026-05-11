package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.horcrux.svg.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2902e extends VirtualView {
    AbstractC2902e(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
    }

    @Override // com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return null;
    }

    @Override // com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        return -1;
    }

    @Override // com.horcrux.svg.VirtualView
    boolean isResponsible() {
        return false;
    }
}
