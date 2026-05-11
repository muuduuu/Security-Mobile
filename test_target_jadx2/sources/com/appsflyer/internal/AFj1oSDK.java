package com.appsflyer.internal;

import android.content.Context;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1tSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class AFj1oSDK extends AFi1cSDK {
    public AFj1oSDK(AFc1oSDK aFc1oSDK, Runnable runnable) {
        super("store", "xiaomi", aFc1oSDK, runnable);
    }

    private boolean getCurrencyIso4217Code() {
        if (!getRevenue()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
            StringBuilder sb2 = new StringBuilder("Class ");
            sb2.append("com.miui.referrer.api.GetAppsReferrerClient");
            sb2.append(" not found");
            aFLogger.v(aFg1cSDK, sb2.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(final Context context) {
        if (getCurrencyIso4217Code()) {
            this.component1 = System.currentTimeMillis();
            this.component4 = AFj1tSDK.AFa1tSDK.STARTED;
            addObserver(new AFj1tSDK.AnonymousClass1());
            final GetAppsReferrerClient build = GetAppsReferrerClient.Companion.newBuilder(context).build();
            build.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFj1oSDK.5
                public final void onGetAppsReferrerSetupFinished(int i10) {
                    AFj1oSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, "com.xiaomi.mipicks")));
                    AFj1oSDK.this.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, "com.xiaomi.mipicks"));
                    if (i10 == -1) {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFj1oSDK.this.getMediationNetwork.put(Keys.RESPONSE, "SERVICE_DISCONNECTED");
                    } else if (i10 == 0) {
                        AFj1oSDK aFj1oSDK = AFj1oSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = build;
                        aFj1oSDK.getMediationNetwork.put(Keys.RESPONSE, "OK");
                        try {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
                            aFLogger.d(aFg1cSDK, "XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFj1oSDK.getMediationNetwork.put("referrer", installReferrer2);
                                }
                                aFj1oSDK.getMediationNetwork.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFj1oSDK.getMediationNetwork.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap hashMap = new HashMap();
                                hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                hashMap.put("install_version", installReferrer.getInstallVersion());
                                aFj1oSDK.getMediationNetwork.put("xiaomi_custom", hashMap);
                            } else {
                                aFLogger.w(aFg1cSDK, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                            StringBuilder sb2 = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb2.append(th.getMessage());
                            aFLogger2.w(aFg1cSDK2, sb2.toString());
                        }
                    } else if (i10 == 1) {
                        AFj1oSDK.this.getMediationNetwork.put(Keys.RESPONSE, "SERVICE_UNAVAILABLE");
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer not supported");
                    } else if (i10 == 2) {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFj1oSDK.this.getMediationNetwork.put(Keys.RESPONSE, "FEATURE_NOT_SUPPORTED");
                    } else if (i10 == 3) {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1oSDK.this.getMediationNetwork.put(Keys.RESPONSE, "DEVELOPER_ERROR");
                    } else if (i10 != 4) {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "responseCode not found.");
                    } else {
                        AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1oSDK.this.getMediationNetwork.put(Keys.RESPONSE, "PERMISSION_ERROR");
                    }
                    AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                    AFj1oSDK.this.getMediationNetwork();
                    build.endConnection();
                }

                public final void onGetAppsServiceDisconnected() {
                }
            });
        }
    }
}
