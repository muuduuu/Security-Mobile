package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.v4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2800v4 extends AbstractC2827z {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2642b5 f26409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2800v4(C2642b5 c2642b5, V3 v32) {
        super(v32);
        Objects.requireNonNull(c2642b5);
        this.f26409e = c2642b5;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2827z
    public final void a() {
        C2642b5 c2642b5 = this.f26409e;
        if (c2642b5.f25694a.n()) {
            c2642b5.c0().b(2000L);
        }
    }
}
