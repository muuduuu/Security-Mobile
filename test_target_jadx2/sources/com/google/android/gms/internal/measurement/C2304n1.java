package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2304n1 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f24577e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24578f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2304n1(C2411z1 c2411z1, Bundle bundle) {
        super(c2411z1, true);
        this.f24577e = bundle;
        Objects.requireNonNull(c2411z1);
        this.f24578f = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24578f.n())).setDefaultEventParameters(this.f24577e);
    }
}
