package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class x4 {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, w4> f31153a = new HashMap();

    private static synchronized w4 a(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        synchronized (x4.class) {
            try {
                ResolveInfo resolveService = context.getApplicationContext().getPackageManager().resolveService(intent, 0);
                if (resolveService == null || (serviceInfo = resolveService.serviceInfo) == null) {
                    return null;
                }
                String str = serviceInfo.name;
                if (f31153a.get(str) == null) {
                    f31153a.put(str, new w4(context, intent));
                }
                return f31153a.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(Context context, Intent intent, BroadcastReceiver broadcastReceiver) {
        try {
            try {
                context.getApplicationContext().startService(intent);
            } catch (IllegalStateException unused) {
                if (Build.VERSION.SDK_INT >= 26) {
                    a(context, intent, broadcastReceiver);
                }
            }
        } catch (Exception unused2) {
        }
    }

    private static void a(Context context, Intent intent, BroadcastReceiver broadcastReceiver) {
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver != null ? broadcastReceiver.goAsync() : null;
        w4 a10 = a(context.getApplicationContext(), intent);
        if (a10 != null) {
            a10.a(intent, goAsync);
        }
    }
}
