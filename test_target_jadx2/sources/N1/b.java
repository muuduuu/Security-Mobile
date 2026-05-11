package N1;

import android.webkit.MimeTypeMap;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static String f6531a = "application/octet-stream";

    public static String a(String str) {
        return str != null ? str.equals(f6531a) ? "bin" : MimeTypeMap.getSingleton().getExtensionFromMimeType(str) : BuildConfig.FLAVOR;
    }

    public static String b(String str, String str2) {
        String a10 = a(str2);
        if (a10 == null || a10.isEmpty()) {
            return str;
        }
        if (str.endsWith("." + a10)) {
            return str;
        }
        String str3 = str + "." + a10;
        return str3.endsWith(".") ? we.a.a(str3, ".") : str3;
    }
}
