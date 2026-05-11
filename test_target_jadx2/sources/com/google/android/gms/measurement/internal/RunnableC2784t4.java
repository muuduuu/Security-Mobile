package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.t4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2784t4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f26356a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f26357b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f26358c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f26359d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2642b5 f26360e;

    RunnableC2784t4(C2642b5 c2642b5, String str, String str2, Object obj, long j10) {
        this.f26356a = str;
        this.f26357b = str2;
        this.f26358c = obj;
        this.f26359d = j10;
        Objects.requireNonNull(c2642b5);
        this.f26360e = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26360e.B(this.f26356a, this.f26357b, this.f26358c, this.f26359d);
    }
}
