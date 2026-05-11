package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2731m6;
import com.google.android.gms.measurement.internal.InterfaceC2699i6;

/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC2699i6 {

    /* renamed from: a, reason: collision with root package name */
    private C2731m6 f25275a;

    private final C2731m6 d() {
        if (this.f25275a == null) {
            this.f25275a = new C2731m6(this);
        }
        return this.f25275a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2699i6
    public final void a(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2699i6
    public final boolean b(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2699i6
    public final void c(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
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

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        d().e(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d();
        C2731m6.j(intent);
        return true;
    }
}
