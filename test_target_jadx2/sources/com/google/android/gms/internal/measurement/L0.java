package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import e7.BinderC3090b;
import java.util.Objects;

/* loaded from: classes2.dex */
final class L0 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f24271e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f24272f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f24273g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f24274h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24275i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L0(C2411z1 c2411z1, String str, String str2, Object obj, boolean z10) {
        super(c2411z1, true);
        this.f24271e = str;
        this.f24272f = str2;
        this.f24273g = obj;
        this.f24274h = z10;
        Objects.requireNonNull(c2411z1);
        this.f24275i = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24275i.n())).setUserProperty(this.f24271e, this.f24272f, BinderC3090b.m1(this.f24273g), this.f24274h, this.f24612a);
    }
}
