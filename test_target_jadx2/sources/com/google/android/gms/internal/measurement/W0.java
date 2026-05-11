package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import java.util.Objects;

/* loaded from: classes2.dex */
final class W0 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f24399e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24400f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W0(C2411z1 c2411z1, String str) {
        super(c2411z1, true);
        this.f24399e = str;
        Objects.requireNonNull(c2411z1);
        this.f24400f = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24400f.n())).beginAdUnitExposure(this.f24399e, this.f24613b);
    }
}
