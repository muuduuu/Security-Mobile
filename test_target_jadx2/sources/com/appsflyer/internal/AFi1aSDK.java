package com.appsflyer.internal;

import android.content.Context;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFj1tSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* loaded from: classes.dex */
public class AFi1aSDK extends AFi1cSDK {
    final ExecutorService AFAdRevenueData;
    public final Map<String, Object> getMonetizationNetwork;

    /* renamed from: com.appsflyer.internal.AFi1aSDK$3, reason: invalid class name */
    final class AnonymousClass3 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        AnonymousClass3(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i10) {
            AFi1aSDK.this.getMonetizationNetwork(installReferrerClient, context, i10);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i10) {
            ExecutorService executorService = AFi1aSDK.this.AFAdRevenueData;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.C
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1aSDK.AnonymousClass3.this.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i10);
                }
            });
        }
    }

    public AFi1aSDK(Runnable runnable, ExecutorService executorService, AFc1oSDK aFc1oSDK) {
        super("store", "google", aFc1oSDK, runnable);
        this.getMonetizationNetwork = new HashMap();
        this.AFAdRevenueData = executorService;
    }

    private boolean getRevenue(Context context) {
        if (!getRevenue()) {
            return false;
        }
        try {
            if (AFj1kSDK.getMonetizationNetwork(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e10) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e10);
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
            StringBuilder sb2 = new StringBuilder("Class ");
            sb2.append("com.android.installreferrer.api.InstallReferrerClient");
            sb2.append(" not found");
            aFLogger.v(aFg1cSDK, sb2.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(Context context) {
        if (getRevenue(context)) {
            this.component1 = System.currentTimeMillis();
            this.component4 = AFj1tSDK.AFa1tSDK.STARTED;
            addObserver(new AFj1tSDK.AnonymousClass1());
            try {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Connecting to Install Referrer Library...");
                build.startConnection(new AnonymousClass3(build, context));
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "referrerClient -> startConnection", th);
            }
        }
    }

    protected final void getMonetizationNetwork(InstallReferrerClient installReferrerClient, Context context, int i10) {
        this.getMonetizationNetwork.put(AppConstants.RETAKE_ERROR_CODE, String.valueOf(i10));
        Pair<Long, String> mediationNetwork = AFj1kSDK.getMediationNetwork(context, "com.android.vending");
        this.getMediationNetwork.put("api_ver", mediationNetwork.c());
        this.getMediationNetwork.put("api_ver_name", mediationNetwork.d());
        if (i10 == -1) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.getMediationNetwork.put(Keys.RESPONSE, "SERVICE_DISCONNECTED");
        } else if (i10 == 0) {
            this.getMediationNetwork.put(Keys.RESPONSE, "OK");
            try {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
                aFLogger.d(aFg1cSDK, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.getMonetizationNetwork.put("val", installReferrer2);
                        this.getMediationNetwork.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.getMonetizationNetwork.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.getMediationNetwork.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.getMonetizationNetwork.put("install", Long.toString(installBeginTimestampSeconds));
                    this.getMediationNetwork.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap hashMap = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.getMonetizationNetwork.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e10) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e10);
                    }
                    try {
                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        hashMap.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e11) {
                        AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "some method not exist", e11, false, false);
                    }
                    if (!hashMap.isEmpty()) {
                        this.getMediationNetwork.put("google_custom", hashMap);
                    }
                    installReferrerClient.endConnection();
                } else {
                    aFLogger.w(aFg1cSDK, "ReferrerClient: InstallReferrer is not ready");
                    this.getMonetizationNetwork.put("err", "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                StringBuilder sb2 = new StringBuilder("Failed to get install referrer: ");
                sb2.append(th.getMessage());
                aFLogger2.w(aFg1cSDK2, sb2.toString());
                this.getMonetizationNetwork.put("err", th.getMessage());
                aFLogger2.e(aFg1cSDK2, "Failed to get install referrer", th, false, false);
            }
        } else if (i10 == 1) {
            this.getMediationNetwork.put(Keys.RESPONSE, "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer not supported");
        } else if (i10 == 2) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.getMediationNetwork.put(Keys.RESPONSE, "FEATURE_NOT_SUPPORTED");
        } else if (i10 != 3) {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "responseCode not found.");
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.getMediationNetwork.put(Keys.RESPONSE, "DEVELOPER_ERROR");
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install Referrer collected locally");
        getMediationNetwork();
    }
}
