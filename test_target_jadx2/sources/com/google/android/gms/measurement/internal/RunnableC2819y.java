package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2819y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ V3 f26459a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC2827z f26460b;

    RunnableC2819y(AbstractC2827z abstractC2827z, V3 v32) {
        this.f26459a = v32;
        Objects.requireNonNull(abstractC2827z);
        this.f26460b = abstractC2827z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V3 v32 = this.f26459a;
        v32.c();
        if (C2668f.a()) {
            v32.b().t(this);
            return;
        }
        AbstractC2827z abstractC2827z = this.f26460b;
        boolean c10 = abstractC2827z.c();
        abstractC2827z.e(0L);
        if (c10) {
            abstractC2827z.a();
        }
    }
}
