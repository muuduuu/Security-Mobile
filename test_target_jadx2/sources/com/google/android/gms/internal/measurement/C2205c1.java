package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2205c1 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC2347s0 f24466e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24467f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2205c1(C2411z1 c2411z1, BinderC2347s0 binderC2347s0) {
        super(c2411z1, true);
        this.f24466e = binderC2347s0;
        Objects.requireNonNull(c2411z1);
        this.f24467f = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24467f.n())).generateEventId(this.f24466e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    protected final void b() {
        this.f24466e.r0(null);
    }
}
