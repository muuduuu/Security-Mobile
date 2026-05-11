package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C2731m6;
import com.google.android.gms.measurement.internal.InterfaceC2699i6;

/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements InterfaceC2699i6 {

    /* renamed from: a, reason: collision with root package name */
    private C2731m6 f25277a;

    private final C2731m6 d() {
        if (this.f25277a == null) {
            this.f25277a = new C2731m6(this);
        }
        return this.f25277a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2699i6
    public final void a(Intent intent) {
        X0.a.b(intent);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2699i6
    public final boolean b(int i10) {
        return stopSelfResult(i10);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2699i6
    public final void c(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return d().d(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        d().a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        d().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        d();
        C2731m6.i(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        d().c(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d();
        C2731m6.j(intent);
        return true;
    }
}
