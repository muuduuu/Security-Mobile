package io.invertase.firebase.app;

import android.content.Context;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static Context f34330a;

    public static Context a() {
        return f34330a;
    }

    public static void b(Context context) {
        Log.d("ReactNativeFirebaseApp", "received application context.");
        f34330a = context;
    }
}
