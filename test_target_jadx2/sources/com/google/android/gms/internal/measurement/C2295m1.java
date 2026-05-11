package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2295m1 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f24570e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24571f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2295m1(C2411z1 c2411z1, boolean z10) {
        super(c2411z1, true);
        this.f24570e = z10;
        Objects.requireNonNull(c2411z1);
        this.f24571f = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24571f.n())).setDataCollectionEnabled(this.f24570e);
    }
}
