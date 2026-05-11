package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class g {
    public static void a(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
