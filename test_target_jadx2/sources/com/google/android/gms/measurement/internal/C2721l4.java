package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import h8.InterfaceC3296a;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.l4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2721l4 implements InterfaceC3296a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f26150a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2642b5 f26151b;

    C2721l4(C2642b5 c2642b5, B6 b62) {
        this.f26150a = b62;
        Objects.requireNonNull(c2642b5);
        this.f26151b = c2642b5;
    }

    private final void a() {
        C2760q3 c2760q3 = this.f26151b.f25694a;
        SparseArray r10 = c2760q3.x().r();
        B6 b62 = this.f26150a;
        r10.put(b62.f25324c, Long.valueOf(b62.f25323b));
        Q2 x10 = c2760q3.x();
        int[] iArr = new int[r10.size()];
        long[] jArr = new long[r10.size()];
        for (int i10 = 0; i10 < r10.size(); i10++) {
            iArr[i10] = r10.keyAt(i10);
            jArr[i10] = ((Long) r10.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        x10.f25642o.b(bundle);
    }

    @Override // h8.InterfaceC3296a
    public final void onFailure(Throwable th) {
        C2642b5 c2642b5 = this.f26151b;
        c2642b5.h();
        c2642b5.Z(false);
        C2760q3 c2760q3 = c2642b5.f25694a;
        int d02 = (c2760q3.w().H(null, AbstractC2671f2.f25976U0) ? c2642b5.d0(th) : 2) - 1;
        if (d02 == 0) {
            c2760q3.a().r().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C2.x(c2642b5.f25694a.L().q()), C2.x(th.toString()));
            c2642b5.b0(1);
            c2642b5.w0().add(this.f26150a);
            return;
        }
        if (d02 != 1) {
            c2760q3.a().o().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C2.x(c2642b5.f25694a.L().q()), th);
            a();
            c2642b5.b0(1);
            c2642b5.x0();
            return;
        }
        c2642b5.w0().add(this.f26150a);
        if (c2642b5.a0() > ((Integer) AbstractC2671f2.f26046x0.b(null)).intValue()) {
            c2642b5.b0(1);
            c2760q3.a().r().c("registerTriggerAsync failed. May try later. App ID, throwable", C2.x(c2642b5.f25694a.L().q()), C2.x(th.toString()));
        } else {
            c2760q3.a().r().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", C2.x(c2642b5.f25694a.L().q()), C2.x(String.valueOf(c2642b5.a0())), C2.x(th.toString()));
            c2642b5.V(c2642b5.a0());
            int a02 = c2642b5.a0();
            c2642b5.b0(a02 + a02);
        }
    }

    @Override // h8.InterfaceC3296a
    public final void onSuccess(Object obj) {
        C2642b5 c2642b5 = this.f26151b;
        c2642b5.h();
        a();
        c2642b5.Z(false);
        c2642b5.b0(1);
        c2642b5.f25694a.a().v().b("Successfully registered trigger URI", this.f26150a.f25322a);
        c2642b5.x0();
    }
}
