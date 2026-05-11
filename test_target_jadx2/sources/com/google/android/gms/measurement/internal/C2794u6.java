package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.u6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2794u6 {

    /* renamed from: a, reason: collision with root package name */
    protected long f26387a;

    /* renamed from: b, reason: collision with root package name */
    protected long f26388b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2827z f26389c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2810w6 f26390d;

    public C2794u6(C2810w6 c2810w6) {
        Objects.requireNonNull(c2810w6);
        this.f26390d = c2810w6;
        this.f26389c = new C2778s6(this, c2810w6.f25694a);
        long c10 = c2810w6.f25694a.f().c();
        this.f26387a = c10;
        this.f26388b = c10;
    }

    final void a(long j10) {
        this.f26390d.h();
        this.f26389c.d();
        this.f26387a = j10;
        this.f26388b = j10;
    }

    final void b(long j10) {
        this.f26389c.d();
    }

    final void c() {
        this.f26389c.d();
        long c10 = this.f26390d.f25694a.f().c();
        this.f26387a = c10;
        this.f26388b = c10;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        C2810w6 c2810w6 = this.f26390d;
        c2810w6.h();
        c2810w6.j();
        if (c2810w6.f25694a.g()) {
            C2760q3 c2760q3 = c2810w6.f25694a;
            c2760q3.x().f25644q.b(c2760q3.f().a());
        }
        long j11 = j10 - this.f26387a;
        if (!z10 && j11 < 1000) {
            c2810w6.f25694a.a().w().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f26388b;
            this.f26388b = j10;
        }
        C2760q3 c2760q32 = c2810w6.f25694a;
        c2760q32.a().w().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !c2760q32.w().N();
        C2760q3 c2760q33 = c2810w6.f25694a;
        l7.k0(c2760q33.I().q(z12), bundle, true);
        if (!z11) {
            c2760q33.B().t("auto", "_e", bundle);
        }
        this.f26387a = j10;
        AbstractC2827z abstractC2827z = this.f26389c;
        abstractC2827z.d();
        abstractC2827z.b(((Long) AbstractC2671f2.f26034r0.b(null)).longValue());
        return true;
    }
}
