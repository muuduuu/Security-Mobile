package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes2.dex */
final class X3 extends ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X3(Z3 z32, Handler handler) {
        super(null);
        Objects.requireNonNull(z32);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        AbstractC2316o4.c();
    }
}
