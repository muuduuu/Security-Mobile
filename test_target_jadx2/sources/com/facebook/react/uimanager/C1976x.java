package com.facebook.react.uimanager;

import android.graphics.BlendMode;
import android.os.Build;

/* renamed from: com.facebook.react.uimanager.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1976x {

    /* renamed from: a, reason: collision with root package name */
    public static final C1976x f22496a = new C1976x();

    private C1976x() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final BlendMode a(String str) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        if (str == null || Build.VERSION.SDK_INT < 29) {
            return null;
        }
        switch (str.hashCode()) {
            case -2120744511:
                if (str.equals("luminosity")) {
                    blendMode = BlendMode.LUMINOSITY;
                    return blendMode;
                }
                break;
            case -1427739212:
                if (str.equals("hard-light")) {
                    blendMode2 = BlendMode.HARD_LIGHT;
                    return blendMode2;
                }
                break;
            case -1338968417:
                if (str.equals("darken")) {
                    blendMode3 = BlendMode.DARKEN;
                    return blendMode3;
                }
                break;
            case -1247677005:
                if (str.equals("soft-light")) {
                    blendMode4 = BlendMode.SOFT_LIGHT;
                    return blendMode4;
                }
                break;
            case -1091287984:
                if (str.equals("overlay")) {
                    blendMode5 = BlendMode.OVERLAY;
                    return blendMode5;
                }
                break;
            case -1039745817:
                if (str.equals("normal")) {
                    return null;
                }
                break;
            case -907689876:
                if (str.equals("screen")) {
                    blendMode6 = BlendMode.SCREEN;
                    return blendMode6;
                }
                break;
            case -230491182:
                if (str.equals("saturation")) {
                    blendMode7 = BlendMode.SATURATION;
                    return blendMode7;
                }
                break;
            case -120580883:
                if (str.equals("color-dodge")) {
                    blendMode8 = BlendMode.COLOR_DODGE;
                    return blendMode8;
                }
                break;
            case 103672:
                if (str.equals("hue")) {
                    blendMode9 = BlendMode.HUE;
                    return blendMode9;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    blendMode10 = BlendMode.COLOR;
                    return blendMode10;
                }
                break;
            case 170546239:
                if (str.equals("lighten")) {
                    blendMode11 = BlendMode.LIGHTEN;
                    return blendMode11;
                }
                break;
            case 653829668:
                if (str.equals("multiply")) {
                    blendMode12 = BlendMode.MULTIPLY;
                    return blendMode12;
                }
                break;
            case 1242982905:
                if (str.equals("color-burn")) {
                    blendMode13 = BlendMode.COLOR_BURN;
                    return blendMode13;
                }
                break;
            case 1686617550:
                if (str.equals("exclusion")) {
                    blendMode14 = BlendMode.EXCLUSION;
                    return blendMode14;
                }
                break;
            case 1728361789:
                if (str.equals("difference")) {
                    blendMode15 = BlendMode.DIFFERENCE;
                    return blendMode15;
                }
                break;
        }
        throw new IllegalArgumentException("Invalid mix-blend-mode name: " + str);
    }
}
