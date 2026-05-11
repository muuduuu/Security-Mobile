package com.google.firebase.analytics;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FirebaseAnalytics f27947a;

    c(FirebaseAnalytics firebaseAnalytics) {
        Objects.requireNonNull(firebaseAnalytics);
        this.f27947a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return this.f27947a.k().g();
    }
}
