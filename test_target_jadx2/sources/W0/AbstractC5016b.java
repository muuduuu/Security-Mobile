package w0;

import android.os.Handler;
import android.os.Looper;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5016b {
    static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
