package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class E5 extends AbstractC2827z {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E5(C2667e6 c2667e6, V3 v32) {
        super(v32);
        Objects.requireNonNull(c2667e6);
        this.f25384e = c2667e6;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2827z
    public final void a() {
        C2667e6 c2667e6 = this.f25384e;
        c2667e6.h();
        if (c2667e6.W()) {
            c2667e6.f25694a.a().w().a("Inactivity, disconnecting from the service");
            c2667e6.A();
        }
    }
}
