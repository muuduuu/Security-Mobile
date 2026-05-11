package com.webengage.sdk.android;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.BroadcastReceiver;

/* loaded from: classes2.dex */
public class WebEngageJobService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        q2.b(true);
        WebEngage.get().a((BroadcastReceiver) null);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return q2.c();
    }
}
