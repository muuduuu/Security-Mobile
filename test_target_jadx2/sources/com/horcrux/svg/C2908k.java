package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2908k extends AbstractC2913p {

    /* renamed from: c, reason: collision with root package name */
    String f29027c;

    /* renamed from: d, reason: collision with root package name */
    EnumC2916s f29028d;

    /* renamed from: e, reason: collision with root package name */
    ReadableArray f29029e;

    /* renamed from: com.horcrux.svg.k$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29030a;

        static {
            int[] iArr = new int[EnumC2916s.values().length];
            f29030a = iArr;
            try {
                iArr[EnumC2916s.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29030a[EnumC2916s.SATURATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29030a[EnumC2916s.HUE_ROTATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29030a[EnumC2916s.LUMINANCE_TO_ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C2908k(ReactContext reactContext) {
        super(reactContext);
    }

    public void A(String str) {
        this.f29028d = EnumC2916s.getEnum(str);
        invalidate();
    }

    public void B(ReadableArray readableArray) {
        this.f29029e = readableArray;
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC2913p
    public Bitmap r(HashMap hashMap, Bitmap bitmap) {
        Bitmap t10 = AbstractC2913p.t(hashMap, bitmap, this.f29027c);
        ColorMatrix colorMatrix = new ColorMatrix();
        int i10 = a.f29030a[this.f29028d.ordinal()];
        if (i10 == 1) {
            if (this.f29029e.size() < 20) {
                return t10;
            }
            float[] fArr = new float[this.f29029e.size()];
            for (int i11 = 0; i11 < this.f29029e.size(); i11++) {
                fArr[i11] = ((float) this.f29029e.getDouble(i11)) * (i11 % 5 == 4 ? 255 : 1);
            }
            colorMatrix.set(fArr);
        } else if (i10 == 2) {
            if (this.f29029e.size() != 1) {
                return t10;
            }
            colorMatrix.setSaturation((float) this.f29029e.getDouble(0));
        } else if (i10 == 3) {
            if (this.f29029e.size() != 1) {
                return t10;
            }
            double d10 = (((float) this.f29029e.getDouble(0)) * 3.141592653589793d) / 180.0d;
            float cos = (float) Math.cos(d10);
            float sin = (float) Math.sin(d10);
            float f10 = 0.715f - (cos * 0.715f);
            float f11 = sin * 0.715f;
            float f12 = 0.072f - (cos * 0.072f);
            float f13 = 0.213f - (cos * 0.213f);
            colorMatrix.set(new float[]{((cos * 0.787f) + 0.213f) - (sin * 0.213f), f10 - f11, f12 + (sin * 0.928f), 0.0f, 0.0f, f13 + (0.143f * sin), (0.285f * cos) + 0.715f + (0.14f * sin), f12 - (0.283f * sin), 0.0f, 0.0f, f13 - (0.787f * sin), f10 + f11, (cos * 0.928f) + 0.072f + (sin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        } else if (i10 == 4) {
            colorMatrix.set(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f});
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, t10);
    }

    public void z(String str) {
        this.f29027c = str;
        invalidate();
    }
}
