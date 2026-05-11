package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class J3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f25504a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f25505b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ S3 f25506c;

    J3(S3 s32, n7 n7Var, Bundle bundle) {
        this.f25504a = n7Var;
        this.f25505b = bundle;
        Objects.requireNonNull(s32);
        this.f25506c = s32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        S3 s32 = this.f25506c;
        s32.r1().E();
        return s32.r1().q0(this.f25504a, this.f25505b);
    }
}
