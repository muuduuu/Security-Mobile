package h7;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: h7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3292h extends AbstractC3285a {
    public static String a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) o7.d.a(new CallableC3293i(sharedPreferences, str, str2));
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }
}
