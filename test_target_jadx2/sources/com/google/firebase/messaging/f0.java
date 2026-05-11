package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import c7.ThreadFactoryC1738b;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class f0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final long f28177a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f28178b;

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseMessaging f28179c;

    /* renamed from: d, reason: collision with root package name */
    ExecutorService f28180d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1738b("firebase-iid-executor"));

    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private f0 f28181a;

        /* renamed from: b, reason: collision with root package name */
        private Context f28182b;

        public a(f0 f0Var) {
            this.f28181a = f0Var;
        }

        public void a() {
            if (f0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            f0 f0Var = this.f28181a;
            if (f0Var != null) {
                Context b10 = f0Var.b();
                this.f28182b = b10;
                b10.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            f0 f0Var = this.f28181a;
            if (f0Var != null && f0Var.d()) {
                if (f0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f28181a.f28179c.r(this.f28181a, 0L);
                Context context2 = this.f28182b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f28181a = null;
            }
        }
    }

    public f0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f28179c = firebaseMessaging;
        this.f28177a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f28178b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    Context b() {
        return this.f28179c.s();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() {
        try {
            if (this.f28179c.o() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            if (!H.i(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (b0.b().e(b())) {
            this.f28178b.acquire();
        }
        try {
            try {
                this.f28179c.V(true);
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f28179c.V(false);
                if (!b0.b().e(b())) {
                    return;
                }
            }
            if (!this.f28179c.D()) {
                this.f28179c.V(false);
                if (b0.b().e(b())) {
                    this.f28178b.release();
                    return;
                }
                return;
            }
            if (b0.b().d(b()) && !d()) {
                new a(this).a();
                if (b0.b().e(b())) {
                    this.f28178b.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f28179c.V(false);
            } else {
                this.f28179c.a0(this.f28177a);
            }
            if (!b0.b().e(b())) {
                return;
            }
            this.f28178b.release();
        } catch (Throwable th) {
            if (b0.b().e(b())) {
                this.f28178b.release();
            }
            throw th;
        }
    }
}
