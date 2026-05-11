package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1aSDK;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lc.o;

/* loaded from: classes.dex */
final class AFb1iSDK implements Application.ActivityLifecycleCallbacks {
    private final AFi1oSDK AFAdRevenueData;
    private final Runnable areAllFieldsValid;
    private ScheduledFuture<?> component4;
    private final ScheduledExecutorService getCurrencyIso4217Code;
    private volatile boolean getMediationNetwork;
    private final AFa1mSDK getMonetizationNetwork;
    final AFb1aSDK.AFa1tSDK getRevenue;

    public AFb1iSDK(ScheduledExecutorService scheduledExecutorService, AFa1mSDK aFa1mSDK, AFi1oSDK aFi1oSDK, AFb1aSDK.AFa1tSDK aFa1tSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        Intrinsics.checkNotNullParameter(aFi1oSDK, "");
        Intrinsics.checkNotNullParameter(aFa1tSDK, "");
        this.getCurrencyIso4217Code = scheduledExecutorService;
        this.getMonetizationNetwork = aFa1mSDK;
        this.AFAdRevenueData = aFi1oSDK;
        this.getRevenue = aFa1tSDK;
        this.areAllFieldsValid = new Runnable() { // from class: com.appsflyer.internal.k
            @Override // java.lang.Runnable
            public final void run() {
                AFb1iSDK.getMediationNetwork(AFb1iSDK.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFb1iSDK aFb1iSDK) {
        Object b10;
        Intrinsics.checkNotNullParameter(aFb1iSDK, "");
        aFb1iSDK.getMediationNetwork = false;
        try {
            o.a aVar = lc.o.f37128b;
            aFb1iSDK.getRevenue.getMediationNetwork();
            b10 = lc.o.b(Unit.f36324a);
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        Throwable d10 = lc.o.d(b10);
        if (d10 != null) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", d10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFb1iSDK aFb1iSDK, AFh1qSDK aFh1qSDK) {
        Object b10;
        Intrinsics.checkNotNullParameter(aFb1iSDK, "");
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        try {
            o.a aVar = lc.o.f37128b;
            aFb1iSDK.getRevenue.getRevenue(aFh1qSDK);
            b10 = lc.o.b(Unit.f36324a);
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        Throwable d10 = lc.o.d(b10);
        if (d10 != null) {
            AFLogger.afErrorLog("Listener thrown an exception: ", d10, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFa1mSDK aFa1mSDK = this.getMonetizationNetwork;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1mSDK.AFAdRevenueData) {
            aFa1mSDK.AFAdRevenueData = intent;
        }
        this.AFAdRevenueData.getMonetizationNetwork(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.getMediationNetwork) {
            ScheduledExecutorService scheduledExecutorService = this.getCurrencyIso4217Code;
            Runnable runnable = this.areAllFieldsValid;
            AFb1aSDK.Companion companion = AFb1aSDK.INSTANCE;
            this.component4 = scheduledExecutorService.schedule(runnable, AFb1aSDK.Companion.getMediationNetwork(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (!this.getMediationNetwork) {
            this.getMediationNetwork = true;
            final AFh1qSDK aFh1qSDK = new AFh1qSDK(activity, this.AFAdRevenueData);
            this.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.l
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1iSDK.getMonetizationNetwork(AFb1iSDK.this, aFh1qSDK);
                }
            });
        } else {
            ScheduledFuture<?> scheduledFuture = this.component4;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}
