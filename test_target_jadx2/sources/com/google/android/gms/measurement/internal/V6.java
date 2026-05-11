package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
final class V6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f25714a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f25715b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Bundle f25716c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ W6 f25717d;

    V6(W6 w62, String str, String str2, Bundle bundle) {
        this.f25714a = str;
        this.f25715b = str2;
        this.f25716c = bundle;
        Objects.requireNonNull(w62);
        this.f25717d = w62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b7 b7Var = this.f25717d.f25725a;
        l7 N02 = b7Var.N0();
        long a10 = b7Var.f().a();
        String str = this.f25714a;
        b7Var.i((I) AbstractC1287s.m(N02.R(str, this.f25715b, this.f25716c, "auto", a10, false, true)), str);
    }
}
