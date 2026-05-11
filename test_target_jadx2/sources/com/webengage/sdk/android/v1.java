package com.webengage.sdk.android;

import android.content.Context;

/* loaded from: classes2.dex */
public class v1 {
    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
