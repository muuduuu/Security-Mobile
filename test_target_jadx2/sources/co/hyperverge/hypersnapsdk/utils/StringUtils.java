package co.hyperverge.hypersnapsdk.utils;

import android.text.Spanned;
import android.webkit.URLUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public class StringUtils {
    private StringUtils() {
    }

    public static String capitalize(String str, char... cArr) {
        int length = cArr == null ? -1 : cArr.length;
        if (isEmptyOrNull(str) || length == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        boolean z10 = true;
        for (int i10 = 0; i10 < charArray.length; i10++) {
            char c10 = charArray[i10];
            if (isDelimiter(c10, cArr)) {
                z10 = true;
            } else if (z10) {
                charArray[i10] = Character.toTitleCase(c10);
                z10 = false;
            }
        }
        return new String(charArray);
    }

    public static boolean contains(char[] cArr, char c10) {
        return indexOf(cArr, c10) != -1;
    }

    public static String getCurrentTimestampAsString() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date(System.currentTimeMillis()));
    }

    public static Spanned getHTML(String str) {
        return androidx.core.text.b.a(str, 0);
    }

    public static int indexOf(char[] cArr, char c10) {
        if (cArr == null) {
            return -1;
        }
        for (int i10 = 0; i10 < cArr.length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    private static boolean isDelimiter(char c10, char[] cArr) {
        return cArr == null ? Character.isWhitespace(c10) : contains(cArr, c10);
    }

    public static boolean isEmptyOrNull(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isURL(String str) {
        return URLUtil.isNetworkUrl(str);
    }
}
