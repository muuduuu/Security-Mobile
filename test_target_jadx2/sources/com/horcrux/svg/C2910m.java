package com.horcrux.svg;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2910m extends AbstractC2913p {

    /* renamed from: c, reason: collision with root package name */
    String f29034c;

    /* renamed from: d, reason: collision with root package name */
    float f29035d;

    /* renamed from: e, reason: collision with root package name */
    float f29036e;

    /* renamed from: f, reason: collision with root package name */
    EnumC2914q f29037f;

    public C2910m(ReactContext reactContext) {
        super(reactContext);
    }

    private Bitmap z(Context context, Bitmap bitmap) {
        float max = Math.max(this.f29035d, this.f29036e) * 2.0f;
        if (max <= 0.0f) {
            return bitmap;
        }
        float min = Math.min(max, 25.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap);
        RenderScript create = RenderScript.create(context);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        create2.setRadius(min);
        create2.setInput(createFromBitmap);
        create2.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        createFromBitmap.destroy();
        createFromBitmap2.destroy();
        create.destroy();
        return Bitmap.createScaledBitmap(createBitmap, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public void A(String str) {
        this.f29037f = EnumC2914q.getEnum(str);
        invalidate();
    }

    public void B(String str) {
        this.f29034c = str;
        invalidate();
    }

    public void C(float f10) {
        this.f29035d = f10;
        invalidate();
    }

    public void D(float f10) {
        this.f29036e = f10;
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC2913p
    public Bitmap r(HashMap hashMap, Bitmap bitmap) {
        return z(getContext(), AbstractC2913p.t(hashMap, bitmap, this.f29034c));
    }
}
