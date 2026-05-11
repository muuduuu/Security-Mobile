package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.auth.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2062k extends ContentObserver {
    C2062k(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = AbstractC2065l.f23731e;
        atomicBoolean.set(true);
    }
}
