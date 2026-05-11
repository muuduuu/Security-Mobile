package h7;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: h7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3288d extends AbstractC3285a {
    public static Integer a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) o7.d.a(new CallableC3289e(sharedPreferences, str, num));
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return num;
        }
    }
}
