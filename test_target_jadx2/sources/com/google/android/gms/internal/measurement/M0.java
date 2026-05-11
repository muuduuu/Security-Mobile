package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
final class M0 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f24284e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24285f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M0(C2411z1 c2411z1, Bundle bundle) {
        super(c2411z1, true);
        this.f24284e = bundle;
        Objects.requireNonNull(c2411z1);
        this.f24285f = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24285f.n())).setConditionalUserProperty(this.f24284e, this.f24612a);
    }
}
