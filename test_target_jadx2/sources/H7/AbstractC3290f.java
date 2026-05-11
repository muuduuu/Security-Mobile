package h7;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: h7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3290f extends AbstractC3285a {
    public static Long a(SharedPreferences sharedPreferences, String str, Long l10) {
        try {
            return (Long) o7.d.a(new CallableC3291g(sharedPreferences, str, l10));
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return l10;
        }
    }
}
