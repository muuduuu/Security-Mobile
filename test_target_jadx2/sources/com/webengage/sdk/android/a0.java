package com.webengage.sdk.android;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class a0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<w1> f30269a;

    public a0(WeakReference<w1> weakReference, Looper looper) {
        super(looper);
        this.f30269a = weakReference;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            Message obtain = Message.obtain();
            obtain.copyFrom(message);
            obtain.what = 0;
            this.f30269a.get().sendMessage(obtain);
        } catch (Exception e10) {
            Logger.e("WebEngage", "YAIS: Exception while sending message from Messenger to Service: " + e10.toString(), e10);
        }
    }
}
