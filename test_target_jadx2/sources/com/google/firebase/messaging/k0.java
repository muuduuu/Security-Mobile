package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
class k0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f28216f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static Boolean f28217g;

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f28218h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f28219a;

    /* renamed from: b, reason: collision with root package name */
    private final M f28220b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f28221c;

    /* renamed from: d, reason: collision with root package name */
    private final j0 f28222d;

    /* renamed from: e, reason: collision with root package name */
    private final long f28223e;

    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private k0 f28224a;

        public a(k0 k0Var) {
            this.f28224a = k0Var;
        }

        public void a() {
            if (k0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            k0.this.f28219a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                k0 k0Var = this.f28224a;
                if (k0Var == null) {
                    return;
                }
                if (k0Var.i()) {
                    if (k0.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f28224a.f28222d.m(this.f28224a, 0L);
                    context.unregisterReceiver(this);
                    this.f28224a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    k0(j0 j0Var, Context context, M m10, long j10) {
        this.f28222d = j0Var;
        this.f28219a = context;
        this.f28223e = j10;
        this.f28220b = m10;
        this.f28221c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f28216f) {
            try {
                Boolean bool = f28218h;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f28218h = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f28216f) {
            try {
                Boolean bool = f28217g;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f28217g = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        boolean z10;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f28219a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z10 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f28219a)) {
            this.f28221c.acquire(AbstractC2840e.f28168a);
        }
        try {
            try {
                try {
                    this.f28222d.o(true);
                } catch (Throwable th) {
                    if (h(this.f28219a)) {
                        try {
                            this.f28221c.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                this.f28222d.o(false);
                if (!h(this.f28219a)) {
                    return;
                } else {
                    wakeLock = this.f28221c;
                }
            }
            if (!this.f28220b.g()) {
                this.f28222d.o(false);
                if (h(this.f28219a)) {
                    try {
                        this.f28221c.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (f(this.f28219a) && !i()) {
                new a(this).a();
                if (h(this.f28219a)) {
                    try {
                        this.f28221c.release();
                        return;
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (this.f28222d.s()) {
                this.f28222d.o(false);
            } else {
                this.f28222d.t(this.f28223e);
            }
            if (h(this.f28219a)) {
                wakeLock = this.f28221c;
                wakeLock.release();
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
