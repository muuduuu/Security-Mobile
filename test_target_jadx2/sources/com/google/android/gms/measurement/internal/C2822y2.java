package com.google.android.gms.measurement.internal;

import D7.InterfaceC0782f;
import V6.AbstractC1292x;
import V6.C1285p;
import V6.C1291w;
import V6.C1294z;
import V6.InterfaceC1293y;
import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2822y2 {

    /* renamed from: d, reason: collision with root package name */
    private static C2822y2 f26463d;

    /* renamed from: a, reason: collision with root package name */
    private final C2760q3 f26464a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1293y f26465b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f26466c = new AtomicLong(-1);

    private C2822y2(Context context, C2760q3 c2760q3) {
        this.f26465b = AbstractC1292x.b(context, C1294z.a().b("measurement:api").a());
        this.f26464a = c2760q3;
    }

    static C2822y2 a(C2760q3 c2760q3) {
        if (f26463d == null) {
            f26463d = new C2822y2(c2760q3.e(), c2760q3);
        }
        return f26463d;
    }

    public final synchronized void b(int i10, int i11, long j10, long j11, int i12) {
        final long c10 = this.f26464a.f().c();
        AtomicLong atomicLong = this.f26466c;
        if (atomicLong.get() != -1 && c10 - atomicLong.get() <= 1800000) {
            return;
        }
        this.f26465b.h(new C1291w(0, Arrays.asList(new C1285p(36301, i11, 0, j10, j11, null, null, 0, i12)))).d(new InterfaceC0782f() { // from class: com.google.android.gms.measurement.internal.x2
            @Override // D7.InterfaceC0782f
            public final /* synthetic */ void b(Exception exc) {
                C2822y2.this.c(c10, exc);
            }
        });
    }

    final /* synthetic */ void c(long j10, Exception exc) {
        this.f26466c.set(j10);
    }
}
