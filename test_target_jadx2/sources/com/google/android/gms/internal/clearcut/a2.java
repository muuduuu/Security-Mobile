package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
final class a2 extends ContentObserver {
    a2(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = Z1.f23978e;
        atomicBoolean.set(true);
    }
}
