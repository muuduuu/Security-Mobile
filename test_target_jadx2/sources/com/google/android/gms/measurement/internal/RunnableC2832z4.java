package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.z4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2832z4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f26493a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f26494b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f26495c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2642b5 f26496d;

    RunnableC2832z4(C2642b5 c2642b5, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f26493a = atomicReference;
        this.f26494b = str2;
        this.f26495c = str3;
        Objects.requireNonNull(c2642b5);
        this.f26496d = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26496d.f25694a.J().e0(this.f26493a, null, this.f26494b, this.f26495c);
    }
}
