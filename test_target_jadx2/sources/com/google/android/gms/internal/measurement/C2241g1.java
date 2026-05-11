package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2241g1 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f24506e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f24507f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f24508g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinderC2347s0 f24509h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24510i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2241g1(C2411z1 c2411z1, String str, String str2, boolean z10, BinderC2347s0 binderC2347s0) {
        super(c2411z1, true);
        this.f24506e = str;
        this.f24507f = str2;
        this.f24508g = z10;
        this.f24509h = binderC2347s0;
        Objects.requireNonNull(c2411z1);
        this.f24510i = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24510i.n())).getUserProperties(this.f24506e, this.f24507f, this.f24508g, this.f24509h);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    protected final void b() {
        this.f24509h.r0(null);
    }
}
