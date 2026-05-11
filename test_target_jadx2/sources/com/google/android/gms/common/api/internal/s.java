package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes2.dex */
final class s extends l7.l {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f23427b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(u uVar, Looper looper) {
        super(looper);
        this.f23427b = uVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            u.v(this.f23427b);
            return;
        }
        if (i10 == 2) {
            u.u(this.f23427b);
            return;
        }
        Log.w("GoogleApiClientImpl", "Unknown message id: " + i10);
    }
}
