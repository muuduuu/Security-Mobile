package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.n5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2738n5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f26185a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2730m5 f26186b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2730m5 f26187c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f26188d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2793u5 f26189e;

    RunnableC2738n5(C2793u5 c2793u5, Bundle bundle, C2730m5 c2730m5, C2730m5 c2730m52, long j10) {
        this.f26185a = bundle;
        this.f26186b = c2730m5;
        this.f26187c = c2730m52;
        this.f26188d = j10;
        Objects.requireNonNull(c2793u5);
        this.f26189e = c2793u5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26189e.A(this.f26185a, this.f26186b, this.f26187c, this.f26188d);
    }
}
