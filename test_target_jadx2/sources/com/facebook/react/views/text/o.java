package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.appsflyer.attribution.RequestError;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
import w4.C5036a;

/* loaded from: classes2.dex */
public abstract class o {
    public static Typeface a(Typeface typeface, int i10, int i11, String str, AssetManager assetManager) {
        C5036a.c cVar = new C5036a.c(i10, i11);
        if (str != null) {
            return C5036a.d().g(str, cVar, assetManager);
        }
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return cVar.a(typeface);
    }

    public static int b(String str) {
        if (str == null) {
            return -1;
        }
        if ("italic".equals(str)) {
            return 2;
        }
        return "normal".equals(str) ? 0 : -1;
    }

    public static String c(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            String string = readableArray.getString(i10);
            if (string != null) {
                switch (string) {
                    case "stylistic-thirteen":
                        arrayList.add("'ss13'");
                        break;
                    case "stylistic-fifteen":
                        arrayList.add("'ss15'");
                        break;
                    case "stylistic-eighteen":
                        arrayList.add("'ss18'");
                        break;
                    case "proportional-nums":
                        arrayList.add("'pnum'");
                        break;
                    case "lining-nums":
                        arrayList.add("'lnum'");
                        break;
                    case "historical-ligatures":
                        arrayList.add("'hlig'");
                        break;
                    case "tabular-nums":
                        arrayList.add("'tnum'");
                        break;
                    case "discretionary-ligatures":
                        arrayList.add("'dlig'");
                        break;
                    case "oldstyle-nums":
                        arrayList.add("'onum'");
                        break;
                    case "no-contextual":
                        arrayList.add("'calt' off");
                        break;
                    case "contextual":
                        arrayList.add("'calt'");
                        break;
                    case "no-common-ligatures":
                        arrayList.add("'liga' off");
                        arrayList.add("'clig' off");
                        break;
                    case "stylistic-eight":
                        arrayList.add("'ss08'");
                        break;
                    case "stylistic-seven":
                        arrayList.add("'ss07'");
                        break;
                    case "stylistic-three":
                        arrayList.add("'ss03'");
                        break;
                    case "stylistic-eleven":
                        arrayList.add("'ss11'");
                        break;
                    case "no-historical-ligatures":
                        arrayList.add("'hlig' off");
                        break;
                    case "stylistic-five":
                        arrayList.add("'ss05'");
                        break;
                    case "stylistic-four":
                        arrayList.add("'ss04'");
                        break;
                    case "stylistic-nine":
                        arrayList.add("'ss09'");
                        break;
                    case "stylistic-one":
                        arrayList.add("'ss01'");
                        break;
                    case "stylistic-six":
                        arrayList.add("'ss06'");
                        break;
                    case "stylistic-ten":
                        arrayList.add("'ss10'");
                        break;
                    case "stylistic-two":
                        arrayList.add("'ss02'");
                        break;
                    case "stylistic-sixteen":
                        arrayList.add("'ss16'");
                        break;
                    case "stylistic-twelve":
                        arrayList.add("'ss12'");
                        break;
                    case "stylistic-twenty":
                        arrayList.add("'ss20'");
                        break;
                    case "no-discretionary-ligatures":
                        arrayList.add("'dlig' off");
                        break;
                    case "small-caps":
                        arrayList.add("'smcp'");
                        break;
                    case "common-ligatures":
                        arrayList.add("'liga'");
                        arrayList.add("'clig'");
                        break;
                    case "stylistic-nineteen":
                        arrayList.add("'ss19'");
                        break;
                    case "stylistic-fourteen":
                        arrayList.add("'ss14'");
                        break;
                    case "stylistic-seventeen":
                        arrayList.add("'ss17'");
                        break;
                }
            }
        }
        return TextUtils.join(", ", arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int d(String str) {
        char c10;
        if (str != null) {
            switch (str.hashCode()) {
                case -1039745817:
                    if (str.equals("normal")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 48625:
                    if (str.equals("100")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 49586:
                    if (str.equals("200")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 50547:
                    if (str.equals("300")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 51508:
                    if (str.equals("400")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 52469:
                    if (str.equals("500")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 53430:
                    if (str.equals("600")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 54391:
                    if (str.equals("700")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 55352:
                    if (str.equals("800")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 56313:
                    if (str.equals("900")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3029637:
                    if (str.equals("bold")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                case 4:
                    return 400;
                case 1:
                    return 100;
                case 2:
                    return 200;
                case 3:
                    return 300;
                case 5:
                    return 500;
                case 6:
                    return 600;
                case 7:
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    return 700;
                case '\b':
                    return 800;
                case '\t':
                    return 900;
            }
        }
        return -1;
    }
}
