package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class R6 implements E2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f25674a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e7 f25675b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b7 f25676c;

    R6(b7 b7Var, String str, e7 e7Var) {
        this.f25674a = str;
        this.f25675b = e7Var;
        Objects.requireNonNull(b7Var);
        this.f25676c = b7Var;
    }

    @Override // com.google.android.gms.measurement.internal.E2
    public final void a(String str, int i10, Throwable th, byte[] bArr, Map map) {
        this.f25676c.v(this.f25674a, i10, th, bArr, this.f25675b);
    }
}
