package com.google.android.gms.common.util;

import V6.AbstractC1287s;
import android.content.Context;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f23528a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            AbstractC1287s.m(context);
            AbstractC1287s.m(th);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
