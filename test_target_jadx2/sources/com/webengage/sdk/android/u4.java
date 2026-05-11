package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class u4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f30853a;

    /* renamed from: b, reason: collision with root package name */
    private ScheduledFuture f30854b;

    /* renamed from: c, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f30855c;

    /* renamed from: d, reason: collision with root package name */
    private Intent f30856d;

    private u4() {
        this.f30853a = false;
        this.f30854b = null;
        this.f30855c = null;
        this.f30856d = null;
    }

    public synchronized void a() {
        BroadcastReceiver.PendingResult pendingResult = this.f30855c;
        if (pendingResult != null && !this.f30853a) {
            try {
                pendingResult.finish();
                this.f30854b.cancel(false);
                this.f30853a = true;
            } catch (Exception e10) {
                Logger.e("WebEngage", e10.toString());
            }
        }
    }

    public Intent b() {
        return this.f30856d;
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
    }

    u4(Intent intent, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, BroadcastReceiver.PendingResult pendingResult) {
        this.f30853a = false;
        this.f30854b = null;
        this.f30855c = null;
        this.f30856d = intent;
        this.f30854b = scheduledThreadPoolExecutor.schedule(this, 8000L, TimeUnit.MILLISECONDS);
        this.f30855c = pendingResult;
    }
}
