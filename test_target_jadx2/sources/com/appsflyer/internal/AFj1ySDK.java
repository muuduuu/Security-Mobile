package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1qSDK;
import com.appsflyer.internal.AFj1tSDK;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class AFj1ySDK extends AFi1cSDK {
    private final AFc1oSDK AFAdRevenueData;
    private final Runnable component2;
    private String equals;
    private final ExecutorService getCurrencyIso4217Code;
    private final AFj1zSDK getMonetizationNetwork;

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFj1zSDK.values().length];
            try {
                iArr[AFj1zSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1zSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1zSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getRevenue = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFj1ySDK(AFc1oSDK aFc1oSDK, ExecutorService executorService, AFj1zSDK aFj1zSDK, Runnable runnable, Runnable runnable2) {
        super("app", r0, aFc1oSDK, runnable);
        String str;
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1zSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i10 = AFj1qSDK.AFa1tSDK.getCurrencyIso4217Code[aFj1zSDK.ordinal()];
        if (i10 == 1) {
            str = "facebook";
        } else if (i10 == 2) {
            str = "instagram";
        } else {
            if (i10 != 3) {
                throw new lc.m();
            }
            str = "facebook_lite";
        }
        this.AFAdRevenueData = aFc1oSDK;
        this.getCurrencyIso4217Code = executorService;
        this.getMonetizationNetwork = aFj1zSDK;
        this.component2 = runnable2;
    }

    private static boolean AFAdRevenueData(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private static boolean component3(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private final boolean getCurrencyIso4217Code(Context context) {
        int i10 = AFa1vSDK.getRevenue[this.getMonetizationNetwork.ordinal()];
        if (i10 == 1) {
            return getMediationNetwork(context);
        }
        if (i10 == 2) {
            return AFAdRevenueData(context);
        }
        if (i10 == 3) {
            return component3(context);
        }
        throw new lc.m();
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r0 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getRevenue(Context context) {
        if (!getRevenue()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String currencyIso4217Code = this.AFAdRevenueData.getCurrencyIso4217Code("com.facebook.sdk.ApplicationId");
        String str = null;
        String o02 = currencyIso4217Code != null ? StringsKt.o0(currencyIso4217Code, "fb") : null;
        if (o02 == null || o02.length() == 0) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            o02 = null;
        }
        if (o02 == null) {
            String revenue = this.AFAdRevenueData.getRevenue("facebook_application_id");
            o02 = revenue != null ? StringsKt.o0(revenue, "fb") : null;
            if (o02 == null || o02.length() == 0) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                o02 = null;
            }
            if (o02 == null) {
                String currencyIso4217Code2 = this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.FacebookApplicationId");
                o02 = currencyIso4217Code2 != null ? StringsKt.o0(currencyIso4217Code2, "fb") : null;
                if (o02 == null || o02.length() == 0) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    o02 = null;
                }
            }
        }
        str = o02;
        this.equals = str;
        if (str == null) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getRevenue(context)) {
            this.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.T
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1ySDK.getMonetizationNetwork(AFj1ySDK.this, context);
                }
            });
        } else {
            this.component2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0247, code lost:
    
        if (r9 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0232, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0230, code lost:
    
        if (r9 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x027c, code lost:
    
        if (r9 != null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0102 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:3:0x002b, B:7:0x003e, B:9:0x0044, B:15:0x0102, B:81:0x0070, B:83:0x0082, B:84:0x0087, B:85:0x0088, B:87:0x008e, B:88:0x00b3, B:89:0x00c3, B:91:0x00c9, B:92:0x00ee), top: B:2:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getMonetizationNetwork(AFj1ySDK aFj1ySDK, Context context) {
        Throwable th;
        Cursor cursor;
        ContentProviderClient contentProviderClient;
        Uri parse;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1ySDK.component1 = System.currentTimeMillis();
        aFj1ySDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        aFj1ySDK.addObserver(new AFj1tSDK.AnonymousClass1());
        String str3 = aFj1ySDK.equals;
        Intrinsics.d(str3);
        try {
            AFj1zSDK aFj1zSDK = aFj1ySDK.getMonetizationNetwork;
            int[] iArr = AFa1vSDK.getRevenue;
            int i10 = iArr[aFj1zSDK.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (component3(context)) {
                            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                            parse = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/" + str3);
                            if (parse == null) {
                                contentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
                                try {
                                    Cursor query = contentProviderClient != null ? contentProviderClient.query(parse, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                                    if (query != null) {
                                        try {
                                            if (query.moveToFirst()) {
                                                int columnIndex = query.getColumnIndex("install_referrer");
                                                if (columnIndex != -1) {
                                                    str = query.getString(columnIndex);
                                                } else {
                                                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "No such column, " + aFj1ySDK.getMonetizationNetwork + " provider", false, 4, null);
                                                    str = null;
                                                }
                                                if (str != null) {
                                                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Collected " + aFj1ySDK.getMonetizationNetwork + " attribution data.", false, 4, null);
                                                    Map<String, Object> map = aFj1ySDK.getMediationNetwork;
                                                    Intrinsics.checkNotNullExpressionValue(map, "");
                                                    map.put(Keys.RESPONSE, "OK");
                                                    Map<String, Object> map2 = aFj1ySDK.getMediationNetwork;
                                                    Intrinsics.checkNotNullExpressionValue(map2, "");
                                                    map2.put("referrer", str);
                                                    int columnIndex2 = query.getColumnIndex("actual_timestamp");
                                                    Long valueOf = columnIndex2 != -1 ? Long.valueOf(query.getLong(columnIndex2)) : null;
                                                    if (valueOf != null) {
                                                        aFj1ySDK.getMediationNetwork.put("click_ts", Long.valueOf(valueOf.longValue()));
                                                    }
                                                    int columnIndex3 = query.getColumnIndex("is_ct");
                                                    Integer valueOf2 = columnIndex3 != -1 ? Integer.valueOf(query.getInt(columnIndex3)) : null;
                                                    if (valueOf2 != null) {
                                                        aFj1ySDK.getMediationNetwork.put("meta_custom", kotlin.collections.G.l(lc.t.a("is_ct", Integer.valueOf(valueOf2.intValue()))));
                                                    }
                                                    int i11 = iArr[aFj1ySDK.getMonetizationNetwork.ordinal()];
                                                    if (i11 == 1) {
                                                        str2 = "com.facebook.katana";
                                                    } else if (i11 == 2) {
                                                        str2 = "com.instagram.android";
                                                    } else {
                                                        if (i11 != 3) {
                                                            throw new lc.m();
                                                        }
                                                        str2 = "com.facebook.lite";
                                                    }
                                                    Map<String, Object> map3 = aFj1ySDK.getMediationNetwork;
                                                    Intrinsics.checkNotNullExpressionValue(map3, "");
                                                    map3.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, str2)));
                                                    Map<String, Object> map4 = aFj1ySDK.getMediationNetwork;
                                                    Intrinsics.checkNotNullExpressionValue(map4, "");
                                                    map4.put("api_ver_name", AFj1kSDK.getRevenue(context, str2));
                                                }
                                                query.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = query;
                                            try {
                                                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1ySDK.getMonetizationNetwork.name() + " provider", th, false, false, false, false, 120, null);
                                                Cursor cursor2 = cursor;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                            } catch (Throwable th3) {
                                                Cursor cursor3 = cursor;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                if (contentProviderClient != null) {
                                                    contentProviderClient.close();
                                                }
                                                throw th3;
                                            }
                                        }
                                    }
                                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                    if (query != null) {
                                        query.close();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    cursor = null;
                                }
                            }
                        } else {
                            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                            parse = null;
                            if (parse == null) {
                            }
                        }
                    } else {
                        throw new lc.m();
                    }
                } else if (AFAdRevenueData(context)) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                    parse = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str3);
                    if (parse == null) {
                    }
                } else {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                    parse = null;
                    if (parse == null) {
                    }
                }
            } else if (getMediationNetwork(context)) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                parse = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str3);
                if (parse == null) {
                }
            } else {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                parse = null;
                if (parse == null) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            cursor = null;
            contentProviderClient = null;
        }
        aFj1ySDK.getMediationNetwork();
        aFj1ySDK.component2.run();
    }
}
