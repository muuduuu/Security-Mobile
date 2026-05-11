package com.webengage.sdk.android;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class x2 {

    /* renamed from: a, reason: collision with root package name */
    Context f31150a;

    x2(Context context) {
        this.f31150a = null;
        this.f31150a = context.getApplicationContext();
    }

    private int c() {
        return (this.f31150a.getPackageName() + WebEngage.get().getWebEngageConfig().getWebEngageKey()).hashCode();
    }

    protected void a() {
        ((AlarmManager) this.f31150a.getSystemService("alarm")).cancel(PendingIntentFactory.e(this.f31150a));
    }

    protected void b() {
        ((AlarmManager) this.f31150a.getSystemService("alarm")).cancel(PendingIntentFactory.f(this.f31150a));
    }

    protected void d(long j10) {
        ((AlarmManager) this.f31150a.getSystemService("alarm")).setAndAllowWhileIdle(0, j10, PendingIntentFactory.e(this.f31150a));
    }

    protected void e(long j10) {
        ((AlarmManager) this.f31150a.getSystemService("alarm")).set(1, j10, PendingIntentFactory.f(this.f31150a));
    }

    void a(long j10) {
        int c10 = c();
        int i10 = Build.VERSION.SDK_INT;
        JobScheduler jobScheduler = (JobScheduler) this.f31150a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            JobInfo.Builder builder = new JobInfo.Builder(c10, new ComponentName(this.f31150a, (Class<?>) WebEngageJobService.class));
            builder.setMinimumLatency(j10);
            builder.setRequiredNetworkType(1);
            builder.setRequiresCharging(false);
            if (i10 >= 26) {
                builder.setRequiresBatteryNotLow(true);
            }
            if (i10 >= 28) {
                builder.setPrefetch(true);
            }
            if (v1.a("android.permission.RECEIVE_BOOT_COMPLETED", this.f31150a)) {
                builder.setPersisted(true);
            } else {
                Logger.d("WebEngage", "For WebEngage push amplification to work even after boot-up, add RECEIVE_BOOT_COMPLETED permission in the AndroidManifest.");
            }
            jobScheduler.schedule(builder.build());
        }
    }

    protected void b(long j10) {
        ((AlarmManager) this.f31150a.getSystemService("alarm")).set(1, j10, PendingIntentFactory.a(this.f31150a));
    }

    protected void c(long j10) {
        ((AlarmManager) this.f31150a.getSystemService("alarm")).setAndAllowWhileIdle(1, j10, PendingIntentFactory.d(this.f31150a));
    }

    protected void d(List<Object> list) {
        b("we_wk_session_delay", list);
    }

    private void a(String str, List<Object> list) {
        PendingIntent a10;
        if (list != null) {
            AlarmManager alarmManager = (AlarmManager) this.f31150a.getSystemService("alarm");
            for (int i10 = 0; i10 < list.size(); i10++) {
                Long l10 = (Long) list.get(i10);
                if (l10 != null && (a10 = PendingIntentFactory.a(str, l10.longValue(), this.f31150a)) != null) {
                    alarmManager.cancel(a10);
                }
            }
        }
    }

    private void b(String str, List<Object> list) {
        PendingIntent a10;
        if (list != null) {
            AlarmManager alarmManager = (AlarmManager) this.f31150a.getSystemService("alarm");
            for (int i10 = 0; i10 < list.size(); i10++) {
                Long l10 = (Long) list.get(i10);
                if (l10 != null && (a10 = PendingIntentFactory.a(str, l10.longValue(), this.f31150a)) != null) {
                    alarmManager.setAndAllowWhileIdle(0, System.currentTimeMillis() + l10.longValue(), a10);
                }
            }
        }
    }

    protected void c(List<Object> list) {
        b("we_wk_page_delay", list);
    }

    boolean d() {
        int c10 = c();
        JobScheduler jobScheduler = (JobScheduler) this.f31150a.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            return false;
        }
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == c10) {
                return true;
            }
        }
        return false;
    }

    protected void a(List<Object> list) {
        a("we_wk_page_delay", list);
    }

    protected void b(List<Object> list) {
        a("we_wk_session_delay", list);
    }
}
