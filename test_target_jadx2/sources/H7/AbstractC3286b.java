package h7;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: h7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3286b extends AbstractC3285a {
    public static Boolean a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) o7.d.a(new CallableC3287c(sharedPreferences, str, bool));
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return bool;
        }
    }
}
