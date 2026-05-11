package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes2.dex */
final class w extends l7.l {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f23454b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(x xVar, Looper looper) {
        super(looper);
        this.f23454b = xVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            ((v) message.obj).b(this.f23454b);
        } else {
            if (i10 == 2) {
                throw ((RuntimeException) message.obj);
            }
            Log.w("GACStateManager", "Unknown message id: " + i10);
        }
    }
}
