package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import android.app.Activity;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2375v1 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f24667e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ BinderC2347s0 f24668f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C2402y1 f24669g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2375v1(C2402y1 c2402y1, Activity activity, BinderC2347s0 binderC2347s0) {
        super(c2402y1.f24696a, true);
        this.f24667e = activity;
        this.f24668f = binderC2347s0;
        Objects.requireNonNull(c2402y1);
        this.f24669g = c2402y1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24669g.f24696a.n())).onActivitySaveInstanceStateByScionActivityInfo(J0.j(this.f24667e), this.f24668f, this.f24613b);
    }
}
