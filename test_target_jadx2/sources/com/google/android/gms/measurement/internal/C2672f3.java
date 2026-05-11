package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import java.lang.Thread;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2672f3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f26051a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2696i3 f26052b;

    public C2672f3(C2696i3 c2696i3, String str) {
        Objects.requireNonNull(c2696i3);
        this.f26052b = c2696i3;
        AbstractC1287s.m(str);
        this.f26051a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f26052b.f25694a.a().o().b(this.f26051a, th);
    }
}
