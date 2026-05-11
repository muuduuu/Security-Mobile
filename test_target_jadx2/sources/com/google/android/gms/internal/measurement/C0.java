package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class C0 extends O implements E0 {
    C0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final int h() {
        Parcel p10 = p(2, k1());
        int readInt = p10.readInt();
        p10.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final void j(String str, String str2, Bundle bundle, long j10) {
        Parcel k12 = k1();
        k12.writeString(str);
        k12.writeString(str2);
        Q.c(k12, bundle);
        k12.writeLong(j10);
        l1(1, k12);
    }
}
