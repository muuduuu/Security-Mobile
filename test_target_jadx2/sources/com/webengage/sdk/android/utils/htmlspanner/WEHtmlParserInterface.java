package com.webengage.sdk.android.utils.htmlspanner;

import android.graphics.Color;
import android.text.Spannable;
import com.webengage.sdk.android.f1;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class WEHtmlParserInterface {
    private String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(BuildConfig.FLAVOR);
        for (String str2 : str.split(">")) {
            if (str2.contains("<") && str2.contains(" ") && !str2.contains("</")) {
                str2 = b(str2);
            } else if ((!str2.contains("<") || str2.contains("</")) && !str2.contains("</")) {
                sb2.append(str2);
            }
            sb2.append(str2);
            sb2.append(">");
        }
        return sb2.toString();
    }

    private String b(String str) {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(BuildConfig.FLAVOR);
        int length = str.length();
        boolean z10 = false;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt == ' ') {
                i10 = z10 ? i10 + 1 : 0;
            } else if (str.charAt(i10) == '=') {
                z10 = true;
            } else {
                str.charAt(i10);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public Spannable fromHtml(String str) {
        return fromHtml(str, Color.parseColor("#000000"), Color.parseColor("#00000000"), 12.0f);
    }

    public Spannable fromHtml(String str, float f10) {
        return fromHtml(str, Color.parseColor("#000000"), Color.parseColor("#00000000"), f10);
    }

    public Spannable fromHtml(String str, int i10, int i11, float f10) {
        f1 f1Var = new f1(i10, f10);
        f1Var.a(i11);
        return f1Var.a(a(str));
    }
}
