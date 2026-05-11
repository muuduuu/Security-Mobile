package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class D6 extends AbstractC2827z {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ E6 f25364e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D6(E6 e62, V3 v32) {
        super(v32);
        Objects.requireNonNull(e62);
        this.f25364e = e62;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2827z
    public final void a() {
        E6 e62 = this.f25364e;
        e62.n();
        e62.f25694a.a().w().a("Starting upload from DelayedRunnable");
        e62.f25405b.r();
    }
}
