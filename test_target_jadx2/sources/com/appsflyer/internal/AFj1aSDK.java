package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFj1aSDK;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p0", "AFAdRevenueData", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "p1", BuildConfig.FLAVOR, "p2", "Ljava/util/concurrent/TimeUnit;", "p3", BuildConfig.FLAVOR, "getCurrencyIso4217Code", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFj1aSDK {
    public static final AFj1aSDK INSTANCE = new AFj1aSDK();

    private AFj1aSDK() {
    }

    public static final Map<String, Object> AFAdRevenueData(Map<String, Object> p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        Object obj = p02.get("meta");
        Map<String, Object> map = kotlin.jvm.internal.a.n(obj) ? (Map) obj : null;
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        p02.put("meta", linkedHashMap);
        return linkedHashMap;
    }

    public static final void getCurrencyIso4217Code(ScheduledExecutorService p02, Runnable p12, long p22, TimeUnit p32) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p32, "");
        try {
            p02.schedule(p12, p22, p32);
        } catch (RejectedExecutionException e10) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e10);
        } catch (Throwable th) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th);
        }
    }
}
