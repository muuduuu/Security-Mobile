package com.google.firebase.messaging;

import D7.AbstractC0789m;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.s;
import com.google.firebase.messaging.AbstractC2839d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2841f {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f28174a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f28175b;

    /* renamed from: c, reason: collision with root package name */
    private final N f28176c;

    public C2841f(Context context, N n10, ExecutorService executorService) {
        this.f28174a = executorService;
        this.f28175b = context;
        this.f28176c = n10;
    }

    private boolean b() {
        if (((KeyguardManager) this.f28175b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!com.google.android.gms.common.util.m.c()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f28175b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    private void c(AbstractC2839d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f28175b.getSystemService("notification")).notify(aVar.f28160b, aVar.f28161c, aVar.f28159a.c());
    }

    private J d() {
        J d10 = J.d(this.f28176c.p("gcm.n.image"));
        if (d10 != null) {
            d10.g(this.f28174a);
        }
        return d10;
    }

    private void e(s.e eVar, J j10) {
        if (j10 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) AbstractC0789m.b(j10.e(), 5L, TimeUnit.SECONDS);
            eVar.o(bitmap);
            eVar.w(new s.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            j10.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            j10.close();
        }
    }

    boolean a() {
        if (this.f28176c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        J d10 = d();
        AbstractC2839d.a e10 = AbstractC2839d.e(this.f28175b, this.f28176c);
        e(e10.f28159a, d10);
        c(e10);
        return true;
    }
}
