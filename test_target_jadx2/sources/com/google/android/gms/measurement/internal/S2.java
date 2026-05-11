package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class S2 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f25680a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ T2 f25681b;

    S2(T2 t22, String str) {
        Objects.requireNonNull(t22);
        this.f25681b = t22;
        this.f25680a = str;
    }

    final /* synthetic */ String a() {
        return this.f25680a;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f25681b.f25693a.a().r().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.U k12 = com.google.android.gms.internal.measurement.T.k1(iBinder);
            if (k12 == null) {
                this.f25681b.f25693a.a().r().a("Install Referrer Service implementation was not found");
                return;
            }
            C2760q3 c2760q3 = this.f25681b.f25693a;
            c2760q3.a().w().a("Install Referrer Service connected");
            c2760q3.b().t(new R2(this, k12, this));
        } catch (RuntimeException e10) {
            this.f25681b.f25693a.a().r().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f25681b.f25693a.a().w().a("Install Referrer Service disconnected");
    }
}
