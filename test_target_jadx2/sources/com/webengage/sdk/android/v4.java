package com.webengage.sdk.android;

import android.app.Service;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
abstract class v4 extends Service {

    /* renamed from: a, reason: collision with root package name */
    private w1 f31076a = null;

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f31077b = null;

    /* renamed from: c, reason: collision with root package name */
    private Messenger f31078c = null;

    /* renamed from: d, reason: collision with root package name */
    private a0 f31079d = null;

    v4() {
    }

    protected abstract void a(Intent intent);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f31078c.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName());
        this.f31077b = handlerThread;
        handlerThread.start();
        this.f31076a = new w1(this.f31077b.getLooper(), new WeakReference(this));
        this.f31079d = new a0(new WeakReference(this.f31076a), Looper.getMainLooper());
        this.f31078c = new Messenger(this.f31079d);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f31077b.quit();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        Message obtain = Message.obtain();
        obtain.arg1 = i11;
        obtain.obj = intent;
        obtain.what = 1;
        this.f31076a.sendMessage(obtain);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
