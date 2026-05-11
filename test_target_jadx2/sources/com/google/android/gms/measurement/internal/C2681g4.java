package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.g4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2681g4 implements InterfaceC2790u2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2760q3 f26071a;

    C2681g4(C2689h4 c2689h4, C2760q3 c2760q3) {
        this.f26071a = c2760q3;
        Objects.requireNonNull(c2689h4);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2790u2
    public final boolean zza() {
        return Log.isLoggable(this.f26071a.a().z(), 3);
    }
}
