package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes2.dex */
final class Q3 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ T3 f24340a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q3(T3 t32, Handler handler) {
        super(null);
        Objects.requireNonNull(t32);
        this.f24340a = t32;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f24340a.e();
    }
}
