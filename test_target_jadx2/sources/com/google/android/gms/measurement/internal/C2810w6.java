package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC2338r0;

/* renamed from: com.google.android.gms.measurement.internal.w6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2810w6 extends AbstractC2687h2 {

    /* renamed from: c, reason: collision with root package name */
    private Handler f26441c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26442d;

    /* renamed from: e, reason: collision with root package name */
    protected final C2802v6 f26443e;

    /* renamed from: f, reason: collision with root package name */
    protected final C2794u6 f26444f;

    /* renamed from: g, reason: collision with root package name */
    protected final C2770r6 f26445g;

    C2810w6(C2760q3 c2760q3) {
        super(c2760q3);
        this.f26442d = true;
        this.f26443e = new C2802v6(this);
        this.f26444f = new C2794u6(this);
        this.f26445g = new C2770r6(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        h();
        if (this.f26441c == null) {
            this.f26441c = new HandlerC2338r0(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2687h2
    protected final boolean m() {
        return false;
    }

    final void o(boolean z10) {
        h();
        this.f26442d = z10;
    }

    final boolean p() {
        h();
        return this.f26442d;
    }

    final /* synthetic */ void r(long j10) {
        h();
        q();
        C2760q3 c2760q3 = this.f25694a;
        c2760q3.a().w().b("Activity resumed, time", Long.valueOf(j10));
        if (c2760q3.w().H(null, AbstractC2671f2.f25978V0)) {
            if (c2760q3.w().N() || this.f26442d) {
                this.f26444f.a(j10);
            }
        } else if (c2760q3.w().N() || c2760q3.x().f25647t.a()) {
            this.f26444f.a(j10);
        }
        this.f26445g.a();
        C2802v6 c2802v6 = this.f26443e;
        C2810w6 c2810w6 = c2802v6.f26416a;
        c2810w6.h();
        if (c2810w6.f25694a.g()) {
            c2802v6.b(c2810w6.f25694a.f().a(), false);
        }
    }

    final /* synthetic */ void s(long j10) {
        h();
        q();
        C2760q3 c2760q3 = this.f25694a;
        c2760q3.a().w().b("Activity paused, time", Long.valueOf(j10));
        this.f26445g.b(j10);
        if (c2760q3.w().N()) {
            this.f26444f.b(j10);
        }
    }

    final /* synthetic */ Handler t() {
        return this.f26441c;
    }
}
