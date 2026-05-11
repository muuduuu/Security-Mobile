package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1tSDK;

/* loaded from: classes.dex */
public final class AFj1uSDK extends AFj1tSDK {
    final ProviderInfo getCurrencyIso4217Code;
    private final AFd1zSDK getMonetizationNetwork;

    public AFj1uSDK(ProviderInfo providerInfo, Runnable runnable, AFd1zSDK aFd1zSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getMonetizationNetwork = aFd1zSDK;
        this.getCurrencyIso4217Code = providerInfo;
    }

    public static ContentProviderClient B_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e10, false, true, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(final Context context) {
        this.getMonetizationNetwork.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1uSDK.5
            /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0097  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor query;
                AFj1uSDK aFj1uSDK = AFj1uSDK.this;
                aFj1uSDK.component1 = System.currentTimeMillis();
                aFj1uSDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
                aFj1uSDK.addObserver(new AFj1tSDK.AnonymousClass1());
                StringBuilder sb2 = new StringBuilder("content://");
                sb2.append(AFj1uSDK.this.getCurrencyIso4217Code.authority);
                sb2.append("/transaction_id");
                Uri parse = Uri.parse(sb2.toString());
                ContentProviderClient B_ = AFj1uSDK.B_(context, parse);
                try {
                    if (B_ != null) {
                        try {
                            try {
                                try {
                                    StringBuilder sb3 = new StringBuilder("app_id=");
                                    sb3.append(context.getPackageName());
                                    query = B_.query(parse, null, sb3.toString(), null, null);
                                    B_.close();
                                } catch (RemoteException e10) {
                                    AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to query unstable content providerClient", e10, false, true, false);
                                    B_.close();
                                    query = null;
                                    if (query != null) {
                                    }
                                    AFj1uSDK aFj1uSDK2 = AFj1uSDK.this;
                                    aFj1uSDK2.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1uSDK2.getCurrencyIso4217Code).packageName)));
                                    AFj1uSDK aFj1uSDK3 = AFj1uSDK.this;
                                    aFj1uSDK3.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) aFj1uSDK3.getCurrencyIso4217Code).packageName));
                                    AFj1uSDK.this.getMediationNetwork();
                                }
                            } catch (Throwable th) {
                                AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Error to get data from providerClient ", th, false, true, false);
                                B_.close();
                                query = null;
                                if (query != null) {
                                }
                                AFj1uSDK aFj1uSDK22 = AFj1uSDK.this;
                                aFj1uSDK22.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1uSDK22.getCurrencyIso4217Code).packageName)));
                                AFj1uSDK aFj1uSDK32 = AFj1uSDK.this;
                                aFj1uSDK32.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) aFj1uSDK32.getCurrencyIso4217Code).packageName));
                                AFj1uSDK.this.getMediationNetwork();
                            }
                        } catch (DeadObjectException e11) {
                            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e11, false, true, false);
                            B_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFj1uSDK aFj1uSDK222 = AFj1uSDK.this;
                            aFj1uSDK222.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1uSDK222.getCurrencyIso4217Code).packageName)));
                            AFj1uSDK aFj1uSDK322 = AFj1uSDK.this;
                            aFj1uSDK322.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) aFj1uSDK322.getCurrencyIso4217Code).packageName));
                            AFj1uSDK.this.getMediationNetwork();
                        }
                        if (query != null) {
                            int columnIndex = query.getColumnIndex("transaction_id");
                            if (columnIndex == -1) {
                                AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "Wrong column name");
                                AFj1uSDK.this.getMediationNetwork.put(Keys.RESPONSE, "FEATURE_NOT_SUPPORTED");
                            } else {
                                AFj1uSDK.this.getMediationNetwork.put(Keys.RESPONSE, "OK");
                                if (query.moveToFirst()) {
                                    String string = query.getString(columnIndex);
                                    query.close();
                                    if (string != null && !string.isEmpty()) {
                                        AFj1uSDK.this.getMediationNetwork.put("referrer", string);
                                    }
                                }
                            }
                            query.close();
                        } else {
                            AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                            AFj1uSDK.this.getMediationNetwork.put(Keys.RESPONSE, "SERVICE_UNAVAILABLE");
                        }
                        AFj1uSDK aFj1uSDK2222 = AFj1uSDK.this;
                        aFj1uSDK2222.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1uSDK2222.getCurrencyIso4217Code).packageName)));
                        AFj1uSDK aFj1uSDK3222 = AFj1uSDK.this;
                        aFj1uSDK3222.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) aFj1uSDK3222.getCurrencyIso4217Code).packageName));
                        AFj1uSDK.this.getMediationNetwork();
                    }
                    query = null;
                    if (query != null) {
                    }
                    AFj1uSDK aFj1uSDK22222 = AFj1uSDK.this;
                    aFj1uSDK22222.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1uSDK22222.getCurrencyIso4217Code).packageName)));
                    AFj1uSDK aFj1uSDK32222 = AFj1uSDK.this;
                    aFj1uSDK32222.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, ((PackageItemInfo) aFj1uSDK32222.getCurrencyIso4217Code).packageName));
                    AFj1uSDK.this.getMediationNetwork();
                } catch (Throwable th2) {
                    B_.close();
                    throw th2;
                }
            }
        });
    }
}
