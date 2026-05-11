package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.AbstractC2285l0;
import com.google.android.gms.internal.measurement.AbstractC2294m0;

/* loaded from: classes2.dex */
public final class E6 extends M6 {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f25385d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC2827z f25386e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f25387f;

    protected E6(b7 b7Var) {
        super(b7Var);
        this.f25385d = (AlarmManager) this.f25694a.e().getSystemService("alarm");
    }

    private final AbstractC2827z o() {
        if (this.f25386e == null) {
            this.f25386e = new D6(this, this.f25405b.g0());
        }
        return this.f25386e;
    }

    private final void p() {
        JobScheduler jobScheduler = (JobScheduler) this.f25694a.e().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(q());
        }
    }

    private final int q() {
        if (this.f25387f == null) {
            this.f25387f = Integer.valueOf("measurement".concat(String.valueOf(this.f25694a.e().getPackageName())).hashCode());
        }
        return this.f25387f.intValue();
    }

    private final PendingIntent r() {
        Context e10 = this.f25694a.e();
        return PendingIntent.getBroadcast(e10, 0, new Intent().setClassName(e10, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC2285l0.f24558a);
    }

    @Override // com.google.android.gms.measurement.internal.M6
    protected final boolean l() {
        AlarmManager alarmManager = this.f25385d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        p();
        return false;
    }

    public final void m(long j10) {
        j();
        C2760q3 c2760q3 = this.f25694a;
        c2760q3.c();
        Context e10 = c2760q3.e();
        if (!l7.j0(e10)) {
            c2760q3.a().v().a("Receiver not registered/enabled");
        }
        if (!l7.E(e10, false)) {
            c2760q3.a().v().a("Service not registered/enabled");
        }
        n();
        c2760q3.a().w().b("Scheduling upload, millis", Long.valueOf(j10));
        c2760q3.f().c();
        c2760q3.w();
        if (j10 < Math.max(0L, ((Long) AbstractC2671f2.f25959M.b(null)).longValue()) && !o().c()) {
            o().b(j10);
        }
        c2760q3.c();
        Context e11 = c2760q3.e();
        ComponentName componentName = new ComponentName(e11, "com.google.android.gms.measurement.AppMeasurementJobService");
        int q10 = q();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        AbstractC2294m0.a(e11, new JobInfo.Builder(q10, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void n() {
        j();
        this.f25694a.a().w().a("Unscheduling upload");
        AlarmManager alarmManager = this.f25385d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        o().d();
        p();
    }
}
