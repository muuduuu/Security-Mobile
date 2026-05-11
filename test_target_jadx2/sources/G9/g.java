package G9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes2.dex */
public abstract class g {
    public static void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z10) {
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, z10 ? 2 : 4);
        }
    }

    public static boolean b(Context context) {
        return androidx.core.content.a.a(context, "android.permission.ACCESS_WIFI_STATE") == 0;
    }

    public static void c(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[(bArr.length - i10) - 1];
            bArr[(bArr.length - i10) - 1] = b10;
        }
    }
}
