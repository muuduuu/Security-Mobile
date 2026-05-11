package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1tSDK;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFj1mSDK extends AFi1eSDK {
    private final AFd1zSDK getCurrencyIso4217Code;

    public AFj1mSDK(Runnable runnable, AFd1zSDK aFd1zSDK) {
        super("store", "samsung", runnable);
        this.getCurrencyIso4217Code = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(Context context) {
        AFb1uSDK<Map<String, Object>> aFb1uSDK = new AFb1uSDK<Map<String, Object>>(context, this.getCurrencyIso4217Code.getMonetizationNetwork(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1mSDK.1
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
            
                if (r2 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
            
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00dc, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.getMonetizationNetwork.getPackageManager().resolveContentProvider(r10.getMediationNetwork, 128)).packageName;
                r10.getCurrencyIso4217Code.getMediationNetwork.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFj1kSDK.AFAdRevenueData(r10.getMonetizationNetwork, r0)));
                r10.getCurrencyIso4217Code.getMediationNetwork.put("api_ver_name", com.appsflyer.internal.AFj1kSDK.getRevenue(r10.getMonetizationNetwork, r0));
                r10.getCurrencyIso4217Code.getMediationNetwork();
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0117, code lost:
            
                return r10.getCurrencyIso4217Code.getMediationNetwork;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
            
                if (0 == 0) goto L26;
             */
            @Override // com.appsflyer.internal.AFb1uSDK
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> getRevenue() {
                String string;
                Cursor cursor = null;
                try {
                    try {
                        ContentResolver contentResolver = this.getMonetizationNetwork.getContentResolver();
                        StringBuilder sb2 = new StringBuilder("content://");
                        sb2.append(this.getMediationNetwork);
                        cursor = contentResolver.query(Uri.parse(sb2.toString()), null, null, null, null);
                        if (cursor == null) {
                            AFj1mSDK.this.getMediationNetwork.put(Keys.RESPONSE, "SERVICE_UNAVAILABLE");
                        } else if (cursor.moveToFirst()) {
                            AFj1mSDK.this.getMediationNetwork.put(Keys.RESPONSE, "OK");
                            E_("referrer", AFj1mSDK.this.getMediationNetwork, cursor);
                            D_("click_ts", AFj1mSDK.this.getMediationNetwork, cursor);
                            D_("install_begin_ts", AFj1mSDK.this.getMediationNetwork, cursor);
                            D_("install_end_ts", AFj1mSDK.this.getMediationNetwork, cursor);
                            E_("organic_keywords", AFj1mSDK.this.getMediationNetwork, cursor);
                            E_("attr_type", AFj1mSDK.this.getMediationNetwork, cursor);
                            HashMap hashMap = new HashMap();
                            int columnIndex = cursor.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                                hashMap.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            D_("click_server_ts", hashMap, cursor);
                            D_("install_begin_server_ts", hashMap, cursor);
                            E_("install_version", hashMap, cursor);
                            if (!hashMap.isEmpty()) {
                                AFj1mSDK.this.getMediationNetwork.put("custom", hashMap);
                            }
                        } else {
                            AFj1mSDK.this.getMediationNetwork.put(Keys.RESPONSE, "FEATURE_NOT_SUPPORTED");
                        }
                    } catch (Exception e10) {
                        AFj1mSDK.this.getMediationNetwork.put(Keys.RESPONSE, "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e10.getMessage(), e10, false, true);
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            private static void D_(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j10 = cursor.getLong(columnIndex);
                if (j10 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j10));
            }

            private static void E_(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        };
        AFc1qSDK component4 = this.getCurrencyIso4217Code.component4();
        AFa1ySDK.getRevenue();
        if (AFa1ySDK.getCurrencyIso4217Code(component4, false) > 0 || !aFb1uSDK.getCurrencyIso4217Code()) {
            return;
        }
        aFb1uSDK.AFAdRevenueData.execute(aFb1uSDK.getRevenue);
        this.component1 = System.currentTimeMillis();
        this.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        addObserver(new AFj1tSDK.AnonymousClass1());
    }
}
