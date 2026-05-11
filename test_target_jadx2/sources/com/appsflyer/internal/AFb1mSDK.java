package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class AFb1mSDK extends AFb1uSDK<String> {
    public AFb1mSDK(Context context, Executor executor) {
        super(context, executor, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFb1uSDK
    /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
    public String getRevenue() {
        Cursor cursor;
        Throwable th;
        try {
            ContentResolver contentResolver = this.getMonetizationNetwork.getContentResolver();
            StringBuilder sb2 = new StringBuilder("content://");
            sb2.append(this.getMediationNetwork);
            cursor = contentResolver.query(Uri.parse(sb2.toString()), new String[]{"aid"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("aid"));
                        cursor.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
        }
    }

    public final String getMediationNetwork() {
        this.AFAdRevenueData.execute(this.getRevenue);
        return (String) super.getMonetizationNetwork();
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    public final /* synthetic */ String getMonetizationNetwork() {
        this.AFAdRevenueData.execute(this.getRevenue);
        return (String) super.getMonetizationNetwork();
    }
}
