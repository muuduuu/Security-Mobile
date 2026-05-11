package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes2.dex */
final class L3 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ N3 f24276a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L3(N3 n32, Handler handler) {
        super(null);
        Objects.requireNonNull(n32);
        this.f24276a = n32;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f24276a.b().set(true);
    }
}
