package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes2.dex */
final class W6 implements k7 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b7 f25725a;

    W6(b7 b7Var) {
        Objects.requireNonNull(b7Var);
        this.f25725a = b7Var;
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f25725a.b().t(new V6(this, str, str2, bundle));
            return;
        }
        b7 b7Var = this.f25725a;
        if (b7Var.x0() != null) {
            b7Var.x0().a().o().b("AppId not known when logging event", str2);
        }
    }
}
