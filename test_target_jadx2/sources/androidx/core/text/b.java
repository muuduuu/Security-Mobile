package androidx.core.text;

import android.text.Html;
import android.text.Spanned;

/* loaded from: classes.dex */
public abstract class b {

    static class a {
        static Spanned a(String str, int i10) {
            return Html.fromHtml(str, i10);
        }

        static Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i10, imageGetter, tagHandler);
        }

        static String c(Spanned spanned, int i10) {
            return Html.toHtml(spanned, i10);
        }
    }

    public static Spanned a(String str, int i10) {
        return a.a(str, i10);
    }
}
