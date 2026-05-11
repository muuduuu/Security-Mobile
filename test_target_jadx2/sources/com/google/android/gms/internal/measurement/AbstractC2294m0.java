package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2294m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Method f24568a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f24569b;

    static {
        Method method;
        Method method2 = null;
        try {
            method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            method = null;
        }
        f24568a = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        f24569b = method2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Context context, JobInfo jobInfo, String str, String str2) {
        Integer num;
        int intValue;
        Method method;
        JobScheduler jobScheduler = (JobScheduler) g8.h.h((JobScheduler) context.getSystemService("jobscheduler"));
        if (f24568a == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        Method method2 = f24569b;
        if (method2 != null) {
            try {
                num = (Integer) method2.invoke(UserHandle.class, null);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e10);
                }
            }
            if (num != null) {
                intValue = num.intValue();
                method = f24568a;
                if (method != null) {
                    try {
                        Integer num2 = (Integer) method.invoke(jobScheduler, jobInfo, "com.google.android.gms", Integer.valueOf(intValue), "UploadAlarm");
                        if (num2 != null) {
                            return num2.intValue();
                        }
                        return 0;
                    } catch (IllegalAccessException | InvocationTargetException e11) {
                        Log.e("UploadAlarm", "error calling scheduleAsPackage", e11);
                    }
                }
                return jobScheduler.schedule(jobInfo);
            }
        }
        intValue = 0;
        method = f24568a;
        if (method != null) {
        }
        return jobScheduler.schedule(jobInfo);
    }
}
