package com.google.android.gms.common.util;

import android.os.Looper;

/* loaded from: classes2.dex */
public abstract class x {
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
