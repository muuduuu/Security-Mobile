package com.google.android.gms.common.util;

import android.os.StrictMode;

/* loaded from: classes2.dex */
abstract class v {
    static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        permitUnsafeIntentLaunch = builder.permitUnsafeIntentLaunch();
        return permitUnsafeIntentLaunch;
    }
}
