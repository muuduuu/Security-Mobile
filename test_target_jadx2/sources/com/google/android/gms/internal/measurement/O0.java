package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import java.util.Objects;

/* loaded from: classes2.dex */
final class O0 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f24311e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f24312f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ BinderC2347s0 f24313g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24314h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O0(C2411z1 c2411z1, String str, String str2, BinderC2347s0 binderC2347s0) {
        super(c2411z1, true);
        this.f24311e = str;
        this.f24312f = str2;
        this.f24313g = binderC2347s0;
        Objects.requireNonNull(c2411z1);
        this.f24314h = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24314h.n())).getConditionalUserProperties(this.f24311e, this.f24312f, this.f24313g);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    protected final void b() {
        this.f24313g.r0(null);
    }
}
