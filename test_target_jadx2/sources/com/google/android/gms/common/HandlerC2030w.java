package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: com.google.android.gms.common.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class HandlerC2030w extends l7.l {

    /* renamed from: b, reason: collision with root package name */
    private final Context f23551b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2017i f23552c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2030w(C2017i c2017i, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f23552c = c2017i;
        this.f23551b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        C2017i c2017i = this.f23552c;
        int i11 = c2017i.i(this.f23551b);
        if (c2017i.m(i11)) {
            this.f23552c.t(this.f23551b, i11);
        }
    }
}
