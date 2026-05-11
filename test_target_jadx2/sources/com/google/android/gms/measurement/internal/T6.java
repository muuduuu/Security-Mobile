package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class T6 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f25698a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b7 f25699b;

    T6(b7 b7Var, n7 n7Var) {
        this.f25698a = n7Var;
        Objects.requireNonNull(b7Var);
        this.f25699b = b7Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        n7 n7Var = this.f25698a;
        String str = (String) AbstractC1287s.m(n7Var.f26197a);
        b7 b7Var = this.f25699b;
        C2633a4 g10 = b7Var.g(str);
        Z3 z32 = Z3.ANALYTICS_STORAGE;
        if (g10.o(z32) && C2633a4.f(n7Var.f26215s, 100).o(z32)) {
            return b7Var.o0(n7Var).p0();
        }
        b7Var.a().w().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
