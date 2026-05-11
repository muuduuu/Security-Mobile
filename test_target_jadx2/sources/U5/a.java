package U5;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class a {
    public static boolean a(Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdbEnabled: ");
        sb2.append(Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) == 1);
        Log.i("AdbEnabled", sb2.toString());
        return Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 1;
    }
}
