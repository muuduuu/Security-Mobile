package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
class H extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    private Path f28889a;

    public H(ReactContext reactContext) {
        super(reactContext);
        G.f28876a = this.mScale;
        this.f28889a = new Path();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return this.f28889a;
    }

    public void r(String str) {
        this.f28889a = G.o(str);
        ArrayList<F> arrayList = G.f28881f;
        this.elements = arrayList;
        Iterator<F> it = arrayList.iterator();
        while (it.hasNext()) {
            for (J j10 : it.next().f28875b) {
                double d10 = j10.f28904a;
                float f10 = this.mScale;
                j10.f28904a = d10 * f10;
                j10.f28905b *= f10;
            }
        }
        invalidate();
    }
}
