package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.EnumC2315o3;

/* renamed from: com.google.android.gms.measurement.internal.i5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2698i5 extends AbstractC2687h2 {

    /* renamed from: c, reason: collision with root package name */
    private JobScheduler f26125c;

    public C2698i5(C2760q3 c2760q3) {
        super(c2760q3);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2687h2
    protected final boolean m() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2687h2
    protected final void n() {
        this.f26125c = (JobScheduler) this.f25694a.e().getSystemService("jobscheduler");
    }

    public final void o(long j10) {
        j();
        h();
        JobScheduler jobScheduler = this.f26125c;
        if (jobScheduler != null && jobScheduler.getPendingJob(p()) != null) {
            this.f25694a.a().w().a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        EnumC2315o3 q10 = q();
        if (q10 != EnumC2315o3.CLIENT_UPLOAD_ELIGIBLE) {
            this.f25694a.a().w().b("[sgtm] Not eligible for Scion upload", q10.name());
            return;
        }
        C2760q3 c2760q3 = this.f25694a;
        c2760q3.a().w().b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j10));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        c2760q3.a().w().b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) AbstractC1287s.m(this.f26125c)).schedule(new JobInfo.Builder(p(), new ComponentName(c2760q3.e(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }

    final int p() {
        return "measurement-client".concat(String.valueOf(this.f25694a.e().getPackageName())).hashCode();
    }

    final EnumC2315o3 q() {
        j();
        h();
        if (this.f26125c == null) {
            return EnumC2315o3.MISSING_JOB_SCHEDULER;
        }
        C2760q3 c2760q3 = this.f25694a;
        if (!c2760q3.w().P()) {
            return EnumC2315o3.NOT_ENABLED_IN_MANIFEST;
        }
        C2760q3 c2760q32 = this.f25694a;
        return c2760q32.L().u() >= 119000 ? !l7.F(c2760q3.e(), "com.google.android.gms.measurement.AppMeasurementJobService") ? EnumC2315o3.MEASUREMENT_SERVICE_NOT_ENABLED : !c2760q32.J().y() ? EnumC2315o3.NON_PLAY_MODE : EnumC2315o3.CLIENT_UPLOAD_ELIGIBLE : EnumC2315o3.SDK_TOO_OLD;
    }
}
