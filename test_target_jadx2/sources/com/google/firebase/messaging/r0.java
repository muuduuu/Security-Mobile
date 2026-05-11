package com.google.firebase.messaging;

import D7.C0787k;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import b7.C1653b;
import c7.ThreadFactoryC1738b;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.r0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class r0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28241a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f28242b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f28243c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue f28244d;

    /* renamed from: e, reason: collision with root package name */
    private o0 f28245e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f28246f;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f28247a;

        /* renamed from: b, reason: collision with root package name */
        private final C0787k f28248b = new C0787k();

        a(Intent intent) {
            this.f28247a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f28247a.getAction() + " finishing.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.p0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.a.this.f();
                }
            }, 20L, TimeUnit.SECONDS);
            e().c(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.q0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f28248b.e(null);
        }

        Task e() {
            return this.f28248b.a();
        }
    }

    r0(Context context, String str) {
        this(context, str, a());
    }

    private static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1738b("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    private void b() {
        while (!this.f28244d.isEmpty()) {
            ((a) this.f28244d.poll()).d();
        }
    }

    private synchronized void c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f28244d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                o0 o0Var = this.f28245e;
                if (o0Var == null || !o0Var.isBinderAlive()) {
                    e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f28245e.c((a) this.f28244d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f28246f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f28246f) {
            return;
        }
        this.f28246f = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (C1653b.b().a(this.f28241a, this.f28242b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f28246f = false;
        b();
    }

    synchronized Task d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f28243c);
            this.f28244d.add(aVar);
            c();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f28246f = false;
            if (iBinder instanceof o0) {
                this.f28245e = (o0) iBinder;
                c();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        c();
    }

    r0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f28244d = new ArrayDeque();
        this.f28246f = false;
        Context applicationContext = context.getApplicationContext();
        this.f28241a = applicationContext;
        this.f28242b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f28243c = scheduledExecutorService;
    }
}
