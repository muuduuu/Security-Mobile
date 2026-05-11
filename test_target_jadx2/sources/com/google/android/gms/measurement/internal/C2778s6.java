package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.s6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2778s6 extends AbstractC2827z {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2794u6 f26343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2778s6(C2794u6 c2794u6, V3 v32) {
        super(v32);
        Objects.requireNonNull(c2794u6);
        this.f26343e = c2794u6;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2827z
    public final void a() {
        C2794u6 c2794u6 = this.f26343e;
        C2810w6 c2810w6 = c2794u6.f26390d;
        c2810w6.h();
        C2760q3 c2760q3 = c2810w6.f25694a;
        c2794u6.d(false, false, c2760q3.f().c());
        c2810w6.f25694a.M().k(c2760q3.f().c());
    }
}
