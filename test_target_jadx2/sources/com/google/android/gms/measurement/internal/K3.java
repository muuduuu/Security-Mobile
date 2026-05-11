package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class K3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f25519a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f25520b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ S3 f25521c;

    K3(S3 s32, n7 n7Var, Bundle bundle) {
        this.f25519a = n7Var;
        this.f25520b = bundle;
        Objects.requireNonNull(s32);
        this.f25521c = s32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        S3 s32 = this.f25521c;
        s32.r1().E();
        return s32.r1().q0(this.f25519a, this.f25520b);
    }
}
