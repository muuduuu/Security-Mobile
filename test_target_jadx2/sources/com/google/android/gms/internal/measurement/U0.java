package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import java.util.Objects;

/* loaded from: classes2.dex */
final class U0 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f24386e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U0(C2411z1 c2411z1, long j10) {
        super(c2411z1, true);
        this.f24386e = j10;
        Objects.requireNonNull(c2411z1);
        this.f24387f = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24387f.n())).setSessionTimeoutDuration(this.f24386e);
    }
}
