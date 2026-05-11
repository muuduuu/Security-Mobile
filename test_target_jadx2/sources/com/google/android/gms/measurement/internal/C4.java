package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes2.dex */
final class C4 implements k7 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2642b5 f25343a;

    C4(C2642b5 c2642b5) {
        Objects.requireNonNull(c2642b5);
        this.f25343a = c2642b5;
    }

    @Override // com.google.android.gms.measurement.internal.k7
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f25343a.p("auto", "_err", bundle);
        } else {
            this.f25343a.w("auto", "_err", bundle, str);
        }
    }
}
