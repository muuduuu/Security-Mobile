package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
final class N0 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f24291e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f24292f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Bundle f24293g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24294h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N0(C2411z1 c2411z1, String str, String str2, Bundle bundle) {
        super(c2411z1, true);
        this.f24291e = str;
        this.f24292f = str2;
        this.f24293g = bundle;
        Objects.requireNonNull(c2411z1);
        this.f24294h = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24294h.n())).clearConditionalUserProperty(this.f24291e, this.f24292f, this.f24293g);
    }
}
