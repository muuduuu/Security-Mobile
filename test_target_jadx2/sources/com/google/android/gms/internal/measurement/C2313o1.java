package com.google.android.gms.internal.measurement;

import V6.AbstractC1287s;
import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2313o1 extends AbstractRunnableC2322p1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Long f24584e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f24585f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f24586g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Bundle f24587h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f24588i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f24589j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24590k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2313o1(C2411z1 c2411z1, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(c2411z1, true);
        this.f24584e = l10;
        this.f24585f = str;
        this.f24586g = str2;
        this.f24587h = bundle;
        this.f24588i = z10;
        this.f24589j = z11;
        Objects.requireNonNull(c2411z1);
        this.f24590k = c2411z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2322p1
    final void a() {
        Long l10 = this.f24584e;
        ((InterfaceC2374v0) AbstractC1287s.m(this.f24590k.n())).logEvent(this.f24585f, this.f24586g, this.f24587h, this.f24588i, this.f24589j, l10 == null ? this.f24612a : l10.longValue());
    }
}
