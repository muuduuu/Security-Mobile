package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import java.util.Objects;

/* loaded from: classes2.dex */
final class R0 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Boolean f24348e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24349f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R0(C2411z1 c2411z1, Boolean bool) {
        super(c2411z1, true);
        this.f24348e = bool;
        Objects.requireNonNull(c2411z1);
        this.f24349f = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24349f.n())).setMeasurementEnabled(this.f24348e.booleanValue(), this.f24612a);
    }
}
