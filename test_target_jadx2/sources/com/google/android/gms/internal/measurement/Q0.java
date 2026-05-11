package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import java.util.Objects;

/* loaded from: classes2.dex */
final class Q0 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J0 f24336e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f24337f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f24338g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24339h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q0(C2411z1 c2411z1, J0 j02, String str, String str2) {
        super(c2411z1, true);
        this.f24336e = j02;
        this.f24337f = str;
        this.f24338g = str2;
        Objects.requireNonNull(c2411z1);
        this.f24339h = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24339h.n())).setCurrentScreenByScionActivityInfo(this.f24336e, this.f24337f, this.f24338g, this.f24612a);
    }
}
