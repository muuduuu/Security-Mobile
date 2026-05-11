package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import android.app.Activity;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.r1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2339r1 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f24641e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2402y1 f24642f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2339r1(C2402y1 c2402y1, Activity activity) {
        super(c2402y1.f24696a, true);
        this.f24641e = activity;
        Objects.requireNonNull(c2402y1);
        this.f24642f = c2402y1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24642f.f24696a.n())).onActivityStartedByScionActivityInfo(J0.j(this.f24641e), this.f24613b);
    }
}
