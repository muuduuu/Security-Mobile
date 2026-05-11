package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import java.util.Objects;

/* loaded from: classes2.dex */
final class T0 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24369e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T0(C2411z1 c2411z1) {
        super(c2411z1, true);
        Objects.requireNonNull(c2411z1);
        this.f24369e = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24369e.n())).resetAnalyticsData(this.f24612a);
    }
}
