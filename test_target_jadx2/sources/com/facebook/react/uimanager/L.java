package com.facebook.react.uimanager;

import android.graphics.BlendMode;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public static final L f22176a = new L();

    private L() {
    }

    private final ColorMatrix b(float f10) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(f10, f10, f10, 1.0f);
        return colorMatrix;
    }

    private final RenderEffect d(ColorMatrix colorMatrix, RenderEffect renderEffect) {
        RenderEffect createColorFilterEffect;
        RenderEffect createColorFilterEffect2;
        if (renderEffect == null) {
            createColorFilterEffect2 = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            Intrinsics.d(createColorFilterEffect2);
            return createColorFilterEffect2;
        }
        createColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffect);
        Intrinsics.d(createColorFilterEffect);
        return createColorFilterEffect;
    }

    private final ColorMatrix e(float f10) {
        float f11 = 255 * ((-(f10 / 2.0f)) + 0.5f);
        return new ColorMatrix(new float[]{f10, 0.0f, 0.0f, 0.0f, f11, 0.0f, f10, 0.0f, 0.0f, f11, 0.0f, 0.0f, f10, 0.0f, f11, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix h(float f10) {
        float f11 = 1 - f10;
        float f12 = 0.7152f - (f11 * 0.7152f);
        float f13 = 0.0722f - (f11 * 0.0722f);
        float f14 = 0.2126f - (f11 * 0.2126f);
        return new ColorMatrix(new float[]{(0.7874f * f11) + 0.2126f, f12, f13, 0.0f, 0.0f, f14, (0.2848f * f11) + 0.7152f, f13, 0.0f, 0.0f, f14, f12, (f11 * 0.9278f) + 0.0722f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix j(float f10) {
        double radians = Math.toRadians(f10);
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);
        float f11 = 0.715f - (cos * 0.715f);
        float f12 = sin * 0.715f;
        float f13 = 0.072f - (cos * 0.072f);
        float f14 = 0.213f - (cos * 0.213f);
        return new ColorMatrix(new float[]{((cos * 0.787f) + 0.213f) - (sin * 0.213f), f11 - f12, (sin * 0.928f) + f13, 0.0f, 0.0f, (0.143f * sin) + f14, (0.285f * cos) + 0.715f + (0.14f * sin), f13 - (0.283f * sin), 0.0f, 0.0f, f14 - (0.787f * sin), f11 + f12, (cos * 0.928f) + 0.072f + (sin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix l(float f10) {
        float f11 = 1 - (2 * f10);
        float f12 = f10 * 255;
        return new ColorMatrix(new float[]{f11, 0.0f, 0.0f, 0.0f, f12, 0.0f, f11, 0.0f, 0.0f, f12, 0.0f, 0.0f, f11, 0.0f, f12, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix p(float f10) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(f10);
        return colorMatrix;
    }

    private final ColorMatrix r(float f10) {
        float f11 = 1 - f10;
        return new ColorMatrix(new float[]{(0.607f * f11) + 0.393f, 0.769f - (f11 * 0.769f), 0.189f - (f11 * 0.189f), 0.0f, 0.0f, 0.349f - (f11 * 0.349f), (0.314f * f11) + 0.686f, 0.168f - (f11 * 0.168f), 0.0f, 0.0f, 0.272f - (f11 * 0.272f), 0.534f - (f11 * 0.534f), (f11 * 0.869f) + 0.131f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static final boolean t(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return false;
        }
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            String key = readableArray.getMap(i10).getEntryIterator().next().getKey();
            if (Intrinsics.b(key, "blur") || Intrinsics.b(key, "dropShadow")) {
                return false;
            }
        }
        return true;
    }

    public static final ColorMatrixColorFilter v(ReadableArray readableArray) {
        ColorMatrix p10;
        if (readableArray == null) {
            return null;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            Map.Entry<String, Object> next = readableArray.getMap(i10).getEntryIterator().next();
            String key = next.getKey();
            Object value = next.getValue();
            Intrinsics.e(value, "null cannot be cast to non-null type kotlin.Double");
            float doubleValue = (float) ((Double) value).doubleValue();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    p10 = f22176a.p(doubleValue);
                    colorMatrix.preConcat(p10);
                case -1267206133:
                    if (!key.equals("opacity")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    p10 = f22176a.n(doubleValue);
                    colorMatrix.preConcat(p10);
                case -1183703082:
                    if (!key.equals("invert")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    p10 = f22176a.l(doubleValue);
                    colorMatrix.preConcat(p10);
                case -905411385:
                    if (!key.equals("grayscale")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    p10 = f22176a.h(doubleValue);
                    colorMatrix.preConcat(p10);
                case -566947070:
                    if (!key.equals("contrast")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    p10 = f22176a.e(doubleValue);
                    colorMatrix.preConcat(p10);
                case 109324790:
                    if (!key.equals("sepia")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    p10 = f22176a.r(doubleValue);
                    colorMatrix.preConcat(p10);
                case 648162385:
                    if (!key.equals("brightness")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    p10 = f22176a.b(doubleValue);
                    colorMatrix.preConcat(p10);
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    p10 = f22176a.j(doubleValue);
                    colorMatrix.preConcat(p10);
                default:
                    throw new IllegalArgumentException("Invalid color matrix filter: " + key);
            }
        }
        return new ColorMatrixColorFilter(colorMatrix);
    }

    public static final RenderEffect w(ReadableArray readableArray) {
        RenderEffect renderEffect = null;
        if (readableArray == null) {
            return null;
        }
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            Map.Entry<String, Object> next = readableArray.getMap(i10).getEntryIterator().next();
            String key = next.getKey();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    L l10 = f22176a;
                    Object value = next.getValue();
                    Intrinsics.e(value, "null cannot be cast to non-null type kotlin.Double");
                    renderEffect = l10.q((float) ((Double) value).doubleValue(), renderEffect);
                case -1267206133:
                    if (!key.equals("opacity")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    L l11 = f22176a;
                    Object value2 = next.getValue();
                    Intrinsics.e(value2, "null cannot be cast to non-null type kotlin.Double");
                    renderEffect = l11.o((float) ((Double) value2).doubleValue(), renderEffect);
                case -1183703082:
                    if (!key.equals("invert")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    L l12 = f22176a;
                    Object value3 = next.getValue();
                    Intrinsics.e(value3, "null cannot be cast to non-null type kotlin.Double");
                    renderEffect = l12.m((float) ((Double) value3).doubleValue(), renderEffect);
                case -905411385:
                    if (!key.equals("grayscale")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    L l13 = f22176a;
                    Object value4 = next.getValue();
                    Intrinsics.e(value4, "null cannot be cast to non-null type kotlin.Double");
                    renderEffect = l13.i((float) ((Double) value4).doubleValue(), renderEffect);
                case -566947070:
                    if (!key.equals("contrast")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    L l14 = f22176a;
                    Object value5 = next.getValue();
                    Intrinsics.e(value5, "null cannot be cast to non-null type kotlin.Double");
                    renderEffect = l14.f((float) ((Double) value5).doubleValue(), renderEffect);
                case 3027047:
                    if (!key.equals("blur")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    L l15 = f22176a;
                    Object value6 = next.getValue();
                    Intrinsics.e(value6, "null cannot be cast to non-null type kotlin.Double");
                    renderEffect = l15.a((float) ((Double) value6).doubleValue(), renderEffect);
                case 109324790:
                    if (!key.equals("sepia")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    L l16 = f22176a;
                    Object value7 = next.getValue();
                    Intrinsics.e(value7, "null cannot be cast to non-null type kotlin.Double");
                    renderEffect = l16.s((float) ((Double) value7).doubleValue(), renderEffect);
                case 648162385:
                    if (!key.equals("brightness")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    L l17 = f22176a;
                    Object value8 = next.getValue();
                    Intrinsics.e(value8, "null cannot be cast to non-null type kotlin.Double");
                    renderEffect = l17.c((float) ((Double) value8).doubleValue(), renderEffect);
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    L l18 = f22176a;
                    Object value9 = next.getValue();
                    Intrinsics.e(value9, "null cannot be cast to non-null type kotlin.Double");
                    renderEffect = l18.k((float) ((Double) value9).doubleValue(), renderEffect);
                case 906978543:
                    if (!key.equals("dropShadow")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    L l19 = f22176a;
                    Object value10 = next.getValue();
                    Intrinsics.e(value10, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
                    renderEffect = l19.u((ReadableMap) value10, renderEffect);
                default:
                    throw new IllegalArgumentException("Invalid filter name: " + key);
            }
        }
        return renderEffect;
    }

    public final RenderEffect a(float f10, RenderEffect renderEffect) {
        Shader.TileMode tileMode;
        RenderEffect createBlurEffect;
        Shader.TileMode tileMode2;
        RenderEffect createBlurEffect2;
        if (f10 <= 0.5d) {
            return null;
        }
        float x10 = x(f10);
        if (renderEffect == null) {
            tileMode2 = Shader.TileMode.DECAL;
            createBlurEffect2 = RenderEffect.createBlurEffect(x10, x10, tileMode2);
            return createBlurEffect2;
        }
        tileMode = Shader.TileMode.DECAL;
        createBlurEffect = RenderEffect.createBlurEffect(x10, x10, renderEffect, tileMode);
        return createBlurEffect;
    }

    public final RenderEffect c(float f10, RenderEffect renderEffect) {
        return d(b(f10), renderEffect);
    }

    public final RenderEffect f(float f10, RenderEffect renderEffect) {
        return d(e(f10), renderEffect);
    }

    public final RenderEffect g(float f10, float f11, float f12, int i10, RenderEffect renderEffect) {
        RenderEffect createOffsetEffect;
        RenderEffect createOffsetEffect2;
        RenderEffect renderEffect2;
        BlendMode blendMode;
        RenderEffect createColorFilterEffect;
        Shader.TileMode tileMode;
        RenderEffect createBlurEffect;
        BlendMode blendMode2;
        RenderEffect createBlendModeEffect;
        if (renderEffect == null) {
            renderEffect2 = RenderEffect.createOffsetEffect(0.0f, 0.0f);
            Intrinsics.checkNotNullExpressionValue(renderEffect2, "createOffsetEffect(...)");
            createOffsetEffect2 = RenderEffect.createOffsetEffect(f10, f11);
            Intrinsics.checkNotNullExpressionValue(createOffsetEffect2, "createOffsetEffect(...)");
        } else {
            createOffsetEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f, renderEffect);
            Intrinsics.checkNotNullExpressionValue(createOffsetEffect, "createOffsetEffect(...)");
            createOffsetEffect2 = RenderEffect.createOffsetEffect(f10, f11, renderEffect);
            Intrinsics.checkNotNullExpressionValue(createOffsetEffect2, "createOffsetEffect(...)");
            renderEffect2 = createOffsetEffect;
        }
        C.a();
        blendMode = BlendMode.SRC_IN;
        createColorFilterEffect = RenderEffect.createColorFilterEffect(AbstractC1980z.a(i10, blendMode), createOffsetEffect2);
        Intrinsics.checkNotNullExpressionValue(createColorFilterEffect, "createColorFilterEffect(...)");
        tileMode = Shader.TileMode.DECAL;
        createBlurEffect = RenderEffect.createBlurEffect(f12, f12, createColorFilterEffect, tileMode);
        Intrinsics.checkNotNullExpressionValue(createBlurEffect, "createBlurEffect(...)");
        blendMode2 = BlendMode.SRC_OVER;
        createBlendModeEffect = RenderEffect.createBlendModeEffect(createBlurEffect, renderEffect2, blendMode2);
        Intrinsics.checkNotNullExpressionValue(createBlendModeEffect, "createBlendModeEffect(...)");
        return createBlendModeEffect;
    }

    public final RenderEffect i(float f10, RenderEffect renderEffect) {
        return d(h(f10), renderEffect);
    }

    public final RenderEffect k(float f10, RenderEffect renderEffect) {
        return d(j(f10), renderEffect);
    }

    public final RenderEffect m(float f10, RenderEffect renderEffect) {
        return d(l(f10), renderEffect);
    }

    public final ColorMatrix n(float f10) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(1.0f, 1.0f, 1.0f, f10);
        return colorMatrix;
    }

    public final RenderEffect o(float f10, RenderEffect renderEffect) {
        return d(n(f10), renderEffect);
    }

    public final RenderEffect q(float f10, RenderEffect renderEffect) {
        return d(p(f10), renderEffect);
    }

    public final RenderEffect s(float f10, RenderEffect renderEffect) {
        return d(r(f10), renderEffect);
    }

    public final RenderEffect u(ReadableMap filterValues, RenderEffect renderEffect) {
        Intrinsics.checkNotNullParameter(filterValues, "filterValues");
        C1944g0 c1944g0 = C1944g0.f22418a;
        return g(c1944g0.a(filterValues.getDouble("offsetX")), c1944g0.a(filterValues.getDouble("offsetY")), filterValues.hasKey("standardDeviation") ? x((float) filterValues.getDouble("standardDeviation")) : 0.0f, filterValues.hasKey("color") ? filterValues.getInt("color") : -16777216, renderEffect);
    }

    public final float x(float f10) {
        return (C1944g0.g(f10) - 0.5f) / 0.57735f;
    }
}
