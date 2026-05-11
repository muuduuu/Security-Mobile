package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
final class S0 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f24358e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24359f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S0(C2411z1 c2411z1, Bundle bundle) {
        super(c2411z1, true);
        this.f24358e = bundle;
        Objects.requireNonNull(c2411z1);
        this.f24359f = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24359f.n())).setConsentThirdParty(this.f24358e, this.f24612a);
    }
}
