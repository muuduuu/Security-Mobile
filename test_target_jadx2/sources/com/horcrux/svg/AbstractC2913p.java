package com.horcrux.svg;

import android.graphics.Bitmap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2913p extends AbstractC2902e {

    /* renamed from: a, reason: collision with root package name */
    private String f29058a;

    /* renamed from: b, reason: collision with root package name */
    public final FilterRegion f29059b;

    public AbstractC2913p(ReactContext reactContext) {
        super(reactContext);
        this.f29059b = new FilterRegion();
    }

    protected static Bitmap t(HashMap hashMap, Bitmap bitmap, String str) {
        Bitmap bitmap2 = str != null ? (Bitmap) hashMap.get(str) : null;
        return bitmap2 != null ? bitmap2 : bitmap;
    }

    public abstract Bitmap r(HashMap hashMap, Bitmap bitmap);

    public String s() {
        return this.f29058a;
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
    }

    public void u(Dynamic dynamic) {
        this.f29059b.setHeight(dynamic);
        invalidate();
    }

    public void v(String str) {
        this.f29058a = str;
        invalidate();
    }

    public void w(Dynamic dynamic) {
        this.f29059b.setWidth(dynamic);
        invalidate();
    }

    public void x(Dynamic dynamic) {
        this.f29059b.setX(dynamic);
        invalidate();
    }

    public void y(Dynamic dynamic) {
        this.f29059b.setY(dynamic);
        invalidate();
    }
}
