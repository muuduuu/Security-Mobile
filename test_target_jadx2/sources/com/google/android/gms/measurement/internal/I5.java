package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class I5 extends AbstractC2827z {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25498e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I5(C2667e6 c2667e6, V3 v32) {
        super(v32);
        Objects.requireNonNull(c2667e6);
        this.f25498e = c2667e6;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2827z
    public final void a() {
        this.f25498e.f25694a.a().r().a("Tasks have been queued for a long time");
    }
}
