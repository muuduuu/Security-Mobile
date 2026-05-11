package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFj1tSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFf1xSDK extends AFe1fSDK<DdlResponse> {
    private int AFInAppEventParameterName;
    private final CountDownLatch AFInAppEventType;
    private int AFKeystoreWrapper;
    private final List<AFj1tSDK> AFLogger;
    private final AFa1rSDK component2;
    private final AFh1xSDK copy;
    private final AFc1oSDK copydefault;
    private final AFj1sSDK equals;
    private final AFa1mSDK hashCode;
    private int registerClient;
    private final AFc1eSDK toString;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getMonetizationNetwork;
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFe1uSDK.values().length];
            try {
                iArr[AFe1uSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1uSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getRevenue = iArr;
            int[] iArr2 = new int[AFj1tSDK.AFa1tSDK.values().length];
            try {
                iArr2[AFj1tSDK.AFa1tSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1tSDK.AFa1tSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            getMonetizationNetwork = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1xSDK(AFa1rSDK aFa1rSDK, AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.DLSDK, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.component2 = aFa1rSDK;
        this.AFInAppEventType = new CountDownLatch(1);
        this.AFLogger = new ArrayList();
        AFc1oSDK AFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        this.copydefault = AFAdRevenueData;
        AFc1eSDK force = aFd1zSDK.force();
        Intrinsics.checkNotNullExpressionValue(force, "");
        this.toString = force;
        AFa1mSDK i10 = aFd1zSDK.i();
        Intrinsics.checkNotNullExpressionValue(i10, "");
        this.hashCode = i10;
        AFh1xSDK areAllFieldsValid = aFd1zSDK.areAllFieldsValid();
        Intrinsics.checkNotNullExpressionValue(areAllFieldsValid, "");
        this.copy = areAllFieldsValid;
        AFj1sSDK AFLogger = aFd1zSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(AFLogger, "");
        this.equals = AFLogger;
        AFj1tSDK[] aFj1tSDKArr = (AFj1tSDK[]) AFLogger.getRevenue.toArray(new AFj1tSDK[0]);
        Intrinsics.checkNotNullExpressionValue(aFj1tSDKArr, "");
        ArrayList<AFj1tSDK> arrayList = new ArrayList();
        for (AFj1tSDK aFj1tSDK : aFj1tSDKArr) {
            if (aFj1tSDK != null && aFj1tSDK.component4 != AFj1tSDK.AFa1tSDK.NOT_STARTED) {
                arrayList.add(aFj1tSDK);
            }
        }
        this.AFInAppEventParameterName = arrayList.size();
        for (final AFj1tSDK aFj1tSDK2 : arrayList) {
            AFj1tSDK.AFa1tSDK aFa1tSDK = aFj1tSDK2.component4;
            int i11 = aFa1tSDK == null ? -1 : AFa1uSDK.getMonetizationNetwork[aFa1tSDK.ordinal()];
            if (i11 == 1) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1tSDK2.getMediationNetwork.get("source") + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1tSDK2, "");
                getCurrencyIso4217Code(aFj1tSDK2);
            } else if (i11 == 2) {
                aFj1tSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.w
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1xSDK.getRevenue(AFj1tSDK.this, this, observable, obj);
                    }
                });
            }
        }
    }

    private final boolean equals() {
        Object obj = this.component2.AFAdRevenueData.get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.AFInAppEventParameterName && !this.component2.AFAdRevenueData.containsKey("referrers");
    }

    private final void getCurrencyIso4217Code(AFj1tSDK aFj1tSDK) {
        if (!getRevenue(aFj1tSDK)) {
            int i10 = this.AFKeystoreWrapper + 1;
            this.AFKeystoreWrapper = i10;
            if (i10 == this.AFInAppEventParameterName) {
                this.AFInAppEventType.countDown();
                return;
            }
            return;
        }
        this.AFLogger.add(aFj1tSDK);
        this.AFInAppEventType.countDown();
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Added non-organic " + aFj1tSDK.getClass().getSimpleName(), false, 4, null);
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return this.hashCode.component2;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:5:0x000d, B:9:0x0019, B:11:0x002a, B:12:0x006a, B:18:0x0078, B:20:0x0080, B:21:0x008a, B:24:0x00b8, B:26:0x00ca, B:28:0x00df, B:30:0x00e3, B:32:0x00e9, B:34:0x00ef, B:36:0x010f, B:37:0x0121, B:39:0x0127, B:41:0x013d, B:43:0x011c, B:44:0x0142, B:46:0x003f, B:47:0x0056), top: B:4:0x000d }] */
    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFe1uSDK getRevenue() {
        int i10;
        AFe1uSDK aFe1uSDK = AFe1uSDK.FAILURE;
        try {
            AFe1uSDK revenue = super.getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            try {
                AFh1xSDK aFh1xSDK = this.copy;
                int i11 = this.registerClient;
                if (i11 > 0 && i11 <= 2) {
                    int i12 = i11 - 1;
                    aFh1xSDK.component2[i12] = System.currentTimeMillis();
                    long j10 = aFh1xSDK.component3[i12];
                    if (j10 != 0) {
                        long[] jArr = aFh1xSDK.component1;
                        jArr[i12] = aFh1xSDK.component2[i12] - j10;
                        aFh1xSDK.getMediationNetwork.put("net", jArr);
                    } else {
                        StringBuilder sb2 = new StringBuilder("Metrics: ddlStart[");
                        sb2.append(i12);
                        sb2.append("] ts is missing");
                        AFLogger.afInfoLog(sb2.toString());
                    }
                    i10 = AFa1uSDK.getRevenue[revenue.ordinal()];
                    if (i10 == 1) {
                        if (i10 != 2) {
                            return revenue;
                        }
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
                        ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
                        AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                        DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                        this.copy.getCurrencyIso4217Code(deepLinkResult, this.hashCode.component2);
                        this.hashCode.getRevenue(deepLinkResult);
                        return revenue;
                    }
                    ResponseNetwork responseNetwork2 = ((AFe1fSDK) this).areAllFieldsValid;
                    Intrinsics.d(responseNetwork2);
                    Object body = responseNetwork2.getBody();
                    Intrinsics.checkNotNullExpressionValue(body, "");
                    DdlResponse ddlResponse = (DdlResponse) body;
                    DeepLink deepLink = ddlResponse.deepLink;
                    if (deepLink != null) {
                        DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                        this.copy.getCurrencyIso4217Code(deepLinkResult2, this.hashCode.component2);
                        this.hashCode.getRevenue(deepLinkResult2);
                        return revenue;
                    }
                    if (this.registerClient > 1 || !ddlResponse.getSecondPing() || !equals()) {
                        DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                        this.copy.getCurrencyIso4217Code(deepLinkResult3, this.hashCode.component2);
                        this.hashCode.getRevenue(deepLinkResult3);
                        return revenue;
                    }
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Waiting for referrers...", false, 4, null);
                    this.AFInAppEventType.await();
                    AFh1xSDK aFh1xSDK2 = this.copy;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = aFh1xSDK2.component2[0];
                    if (j11 != 0) {
                        aFh1xSDK2.getMediationNetwork.put("rfr_wait", Long.valueOf(currentTimeMillis - j11));
                    } else {
                        AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                    }
                    if (this.AFKeystoreWrapper != this.AFInAppEventParameterName) {
                        return getRevenue();
                    }
                    DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                    this.copy.getCurrencyIso4217Code(deepLinkResult4, this.hashCode.component2);
                    this.hashCode.getRevenue(deepLinkResult4);
                    return AFe1uSDK.SUCCESS;
                }
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i11))));
                i10 = AFa1uSDK.getRevenue[revenue.ordinal()];
                if (i10 == 1) {
                }
            } catch (Exception e10) {
                e = e10;
                aFe1uSDK = revenue;
                Throwable cause = e.getCause();
                if (!(cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException)) {
                    if (cause instanceof IOException) {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                        DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                        this.copy.getCurrencyIso4217Code(deepLinkResult5, this.hashCode.component2);
                        this.hashCode.getRevenue(deepLinkResult5);
                    } else {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
                        DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                        this.copy.getCurrencyIso4217Code(deepLinkResult6, this.hashCode.component2);
                        this.hashCode.getRevenue(deepLinkResult6);
                    }
                    return aFe1uSDK;
                }
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.registerClient + " attempt(s) within " + this.hashCode.component2 + " milliseconds", false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.copy.getCurrencyIso4217Code(deepLinkResult7, this.hashCode.component2);
                this.hashCode.getRevenue(deepLinkResult7);
                return AFe1uSDK.TIMEOUT;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFe1fSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFd1hSDK<DdlResponse> AFAdRevenueData(String str) {
        Map map;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        int i10 = this.registerClient + 1;
        this.registerClient = i10;
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Preparing request " + i10, false, 4, null);
        Map<String, Object> map2 = this.component2.AFAdRevenueData;
        if (this.registerClient == 1) {
            map2.put("is_first", Boolean.valueOf(this.copydefault.getMediationNetwork.getRevenue("appsFlyerCount", 0) == 0));
            map2.put("lang", Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
            map2.put("os", Build.VERSION.RELEASE);
            map2.put("type", Build.MODEL);
            map2.put("request_id", AFb1kSDK.getCurrencyIso4217Code(this.copydefault.getMediationNetwork));
            AFb1tSDK aFb1tSDK = this.toString.getRevenue;
            if (aFb1tSDK != null && (strArr = aFb1tSDK.AFAdRevenueData) != null) {
                Intrinsics.checkNotNullExpressionValue(strArr, "");
                map2.put("sharing_filter", strArr);
            }
            AdvertisingIdData advertisingIdData = this.copydefault.getMonetizationNetwork.component3;
            Map<String, String> currencyIso4217Code = getCurrencyIso4217Code(advertisingIdData != null ? new AFb1jSDK(advertisingIdData.advertisingId, advertisingIdData.isLimited) : null);
            if (currencyIso4217Code != null) {
                map2.put("gaid", currencyIso4217Code);
            }
            Map<String, String> currencyIso4217Code2 = getCurrencyIso4217Code(AFb1lSDK.getMediationNetwork(this.copydefault.getCurrencyIso4217Code.getMonetizationNetwork));
            if (currencyIso4217Code2 != null) {
                map2.put("oaid", currencyIso4217Code2);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map2.put("timestamp", simpleDateFormat.format(new Date(currentTimeMillis)));
        map2.put("request_count", Integer.valueOf(this.registerClient));
        List<AFj1tSDK> list = this.AFLogger;
        ArrayList arrayList = new ArrayList();
        for (AFj1tSDK aFj1tSDK : list) {
            if (aFj1tSDK.component4 == AFj1tSDK.AFa1tSDK.FINISHED) {
                Object obj = aFj1tSDK.getMediationNetwork.get("referrer");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = aFj1tSDK.getMediationNetwork.get("source");
                    Intrinsics.e(obj2, "");
                    map = kotlin.collections.G.k(lc.t.a("source", (String) obj2), lc.t.a("value", str2));
                    if (map == null) {
                        arrayList.add(map);
                    }
                }
            }
            map = null;
            if (map == null) {
            }
        }
        if (!arrayList.isEmpty()) {
            map2.put("referrers", arrayList);
        }
        AFa1rSDK aFa1rSDK = this.component2;
        AFj1cSDK aFj1cSDK = new AFj1cSDK(this.copydefault, null, 2, null);
        String mediationNetwork = ((AFe1fSDK) this).component1.getMediationNetwork();
        Object obj3 = this.component2.AFAdRevenueData.get("timestamp");
        Intrinsics.e(obj3, "");
        aFa1rSDK.component2 = aFj1cSDK.getMonetizationNetwork(mediationNetwork, (String) obj3);
        AFh1xSDK aFh1xSDK = this.copy;
        int i11 = this.registerClient;
        if (i11 > 0 && i11 <= 2) {
            int i12 = i11 - 1;
            aFh1xSDK.component3[i12] = System.currentTimeMillis();
            if (i12 == 0) {
                long j10 = aFh1xSDK.component4;
                if (j10 != 0) {
                    aFh1xSDK.getMediationNetwork.put("from_fg", Long.valueOf(aFh1xSDK.component3[i12] - j10));
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        } else {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i11))));
        }
        AFd1hSDK<DdlResponse> monetizationNetwork = ((AFe1fSDK) this).component4.getMonetizationNetwork(this.component2);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        return monetizationNetwork;
    }

    private static Map<String, String> getCurrencyIso4217Code(AFb1jSDK aFb1jSDK) {
        String str;
        if (aFb1jSDK == null || (str = aFb1jSDK.getRevenue) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1jSDK.getCurrencyIso4217Code;
        if (bool == null || !bool.booleanValue()) {
            return kotlin.collections.G.k(lc.t.a("type", "unhashed"), lc.t.a("value", str));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFj1tSDK aFj1tSDK, AFf1xSDK aFf1xSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1xSDK, "");
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1tSDK.getMediationNetwork.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.e(observable, "");
        aFf1xSDK.getCurrencyIso4217Code((AFj1tSDK) observable);
    }

    private static boolean getRevenue(AFj1tSDK aFj1tSDK) {
        Object obj = aFj1tSDK.getMediationNetwork.get("click_ts");
        Long l10 = obj instanceof Long ? (Long) obj : null;
        if (l10 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l10.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }
}
