package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class Q6 implements E2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f25662a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f25663b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b7 f25664c;

    Q6(b7 b7Var, String str, List list) {
        this.f25662a = str;
        this.f25663b = list;
        Objects.requireNonNull(b7Var);
        this.f25664c = b7Var;
    }

    @Override // com.google.android.gms.measurement.internal.E2
    public final void a(String str, int i10, Throwable th, byte[] bArr, Map map) {
        this.f25664c.A(true, i10, th, bArr, this.f25662a, this.f25663b);
    }
}
