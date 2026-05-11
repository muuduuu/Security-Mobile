package com.google.android.gms.measurement.internal;

import android.content.Intent;
import java.util.Objects;

/* loaded from: classes2.dex */
final class S6 extends AbstractC2827z {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b7 f25689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S6(b7 b7Var, V3 v32) {
        super(v32);
        Objects.requireNonNull(b7Var);
        this.f25689e = b7Var;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2827z
    public final void a() {
        b7 b7Var = this.f25689e;
        b7Var.b().h();
        String str = (String) b7Var.y0().pollFirst();
        if (str != null) {
            b7Var.z0(b7Var.f().c());
            b7Var.a().w().b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            b7.W(b7Var.e(), intent);
        }
        b7Var.v0();
    }
}
