package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class A4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f25297a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f25298b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f25299c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f25300d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2642b5 f25301e;

    A4(C2642b5 c2642b5, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f25297a = atomicReference;
        this.f25298b = str2;
        this.f25299c = str3;
        this.f25300d = z10;
        Objects.requireNonNull(c2642b5);
        this.f25301e = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25301e.f25694a.J().g0(this.f25297a, null, this.f25298b, this.f25299c, this.f25300d);
    }
}
