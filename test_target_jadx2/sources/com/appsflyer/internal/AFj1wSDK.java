package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1tSDK;
import java.util.HashMap;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFj1wSDK extends AFi1cSDK {
    private final AFd1zSDK AFAdRevenueData;
    private final AFj1vSDK getCurrencyIso4217Code;

    public AFj1wSDK(Runnable runnable, AFd1zSDK aFd1zSDK, AFj1vSDK aFj1vSDK) {
        super("store", "huawei", aFd1zSDK.AFAdRevenueData(), runnable);
        this.AFAdRevenueData = aFd1zSDK;
        this.getCurrencyIso4217Code = aFj1vSDK;
    }

    private boolean getCurrencyIso4217Code(Context context) {
        if (!getRevenue()) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getCurrencyIso4217Code.getCurrencyIso4217Code(context)) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getCurrencyIso4217Code.getRevenue(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0105, code lost:
    
        getMediationNetwork();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0108, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0102, code lost:
    
        if (0 == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void getRevenue(Context context) {
        this.component1 = System.currentTimeMillis();
        this.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        addObserver(new AFj1tSDK.AnonymousClass1());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, str)));
        this.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(context, str));
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursor == null) {
                this.getMediationNetwork.put(Keys.RESPONSE, "SERVICE_UNAVAILABLE");
            } else if (cursor.moveToFirst()) {
                this.getMediationNetwork.put(Keys.RESPONSE, "OK");
                this.getMediationNetwork.put("referrer", cursor.getString(0));
                this.getMediationNetwork.put("click_ts", Long.valueOf(cursor.getLong(1)));
                this.getMediationNetwork.put("install_end_ts", Long.valueOf(cursor.getLong(2)));
                if (cursor.getColumnCount() > 3) {
                    this.getMediationNetwork.put("install_begin_ts", Long.valueOf(cursor.getLong(3)));
                    HashMap hashMap = new HashMap();
                    String string = cursor.getString(4);
                    if (string != null) {
                        hashMap.put("track_id", string);
                    }
                    hashMap.put("referrer_ex", cursor.getString(5));
                    this.getMediationNetwork.put("huawei_custom", hashMap);
                }
            } else {
                this.getMediationNetwork.put(Keys.RESPONSE, "FEATURE_NOT_SUPPORTED");
            }
        } catch (Throwable th) {
            try {
                this.getMediationNetwork.put(Keys.RESPONSE, "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, th.getMessage() != null ? th.getMessage() : BuildConfig.FLAVOR, th, false, true);
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(final Context context) {
        if (getCurrencyIso4217Code(context)) {
            this.AFAdRevenueData.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.P
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1wSDK.this.getRevenue(context);
                }
            });
        }
    }
}
