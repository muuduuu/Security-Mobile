package com.reactnativecommunity.netinfo;

import G9.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private final Context f29247b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0430a f29248c;

    /* renamed from: e, reason: collision with root package name */
    private Handler f29250e;

    /* renamed from: a, reason: collision with root package name */
    private final c f29246a = new c();

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f29249d = new b();

    /* renamed from: f, reason: collision with root package name */
    private boolean f29251f = false;

    /* renamed from: com.reactnativecommunity.netinfo.a$a, reason: collision with other inner class name */
    public interface InterfaceC0430a {
        void onAmazonFireDeviceConnectivityChanged(boolean z10);
    }

    private class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f29251f) {
                a.this.f29247b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
                a.this.f29250e.postDelayed(a.this.f29249d, 10000L);
            }
        }

        private b() {
        }
    }

    private class c extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        boolean f29253a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f29254b;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z10;
            String action = intent == null ? null : intent.getAction();
            if ("com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(action)) {
                z10 = false;
            } else if (!"com.amazon.tv.networkmonitor.INTERNET_UP".equals(action)) {
                return;
            } else {
                z10 = true;
            }
            Boolean bool = this.f29254b;
            if (bool == null || bool.booleanValue() != z10) {
                this.f29254b = Boolean.valueOf(z10);
                a.this.f29248c.onAmazonFireDeviceConnectivityChanged(z10);
            }
        }

        private c() {
            this.f29253a = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    a(Context context, InterfaceC0430a interfaceC0430a) {
        this.f29247b = context;
        this.f29248c = interfaceC0430a;
    }

    private boolean f() {
        if (Build.MANUFACTURER.equals("Amazon")) {
            String str = Build.MODEL;
            if (str.startsWith("AF") || str.startsWith("KF")) {
                return true;
            }
        }
        return false;
    }

    private void h() {
        if (this.f29246a.f29253a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
        g.a(this.f29247b, this.f29246a, intentFilter, false);
        this.f29246a.f29253a = true;
    }

    private void i() {
        if (this.f29251f) {
            return;
        }
        Handler handler = new Handler();
        this.f29250e = handler;
        this.f29251f = true;
        handler.post(this.f29249d);
    }

    private void j() {
        if (this.f29251f) {
            this.f29251f = false;
            this.f29250e.removeCallbacksAndMessages(null);
            this.f29250e = null;
        }
    }

    private void l() {
        c cVar = this.f29246a;
        if (cVar.f29253a) {
            this.f29247b.unregisterReceiver(cVar);
            this.f29246a.f29253a = false;
        }
    }

    public void g() {
        if (f()) {
            h();
            i();
        }
    }

    public void k() {
        if (f()) {
            j();
            l();
        }
    }
}
