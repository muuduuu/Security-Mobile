package za;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: za.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5269d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f45852a = C5268c.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(ClipData.Item item, Context context) {
        if (item.getText() != null || item.getHtmlText() == null) {
            return item.coerceToText(context).toString();
        }
        String htmlText = item.getHtmlText();
        Intrinsics.checkNotNullExpressionValue(htmlText, "getHtmlText(...)");
        return g(htmlText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(ClipDescription clipDescription) {
        return clipDescription.hasMimeType("text/plain") || clipDescription.hasMimeType("text/html");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(String str) {
        Spanned fromHtml = Html.fromHtml(str, 0);
        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
        char[] cArr = new char[fromHtml.length()];
        TextUtils.getChars(fromHtml, 0, fromHtml.length(), cArr, 0);
        return new String(cArr);
    }
}
