package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.horcrux.svg.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2900c extends C2923z {
    public C2900c(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.C2923z, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        AbstractC1721a.J("ReactNative", "RNSVG: ClipPath can't be drawn, it should be defined as a child component for `Defs` ");
    }

    @Override // com.horcrux.svg.C2923z, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        return -1;
    }

    @Override // com.horcrux.svg.VirtualView
    boolean isResponsible() {
        return false;
    }

    @Override // com.horcrux.svg.RenderableView
    void mergeProperties(RenderableView renderableView) {
    }

    @Override // com.horcrux.svg.C2923z, com.horcrux.svg.RenderableView
    void resetProperties() {
    }

    @Override // com.horcrux.svg.C2923z, com.horcrux.svg.VirtualView
    void saveDefinition() {
        getSvgView().defineClipPath(this, this.mName);
    }
}
