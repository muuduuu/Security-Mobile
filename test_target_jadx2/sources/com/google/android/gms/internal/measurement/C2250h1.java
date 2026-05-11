package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import e7.BinderC3090b;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2250h1 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f24520e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f24521f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24522g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2250h1(C2411z1 c2411z1, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(c2411z1, false);
        this.f24520e = str;
        this.f24521f = obj;
        Objects.requireNonNull(c2411z1);
        this.f24522g = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24522g.n())).logHealthData(5, this.f24520e, BinderC3090b.m1(this.f24521f), BinderC3090b.m1(null), BinderC3090b.m1(null));
    }
}
