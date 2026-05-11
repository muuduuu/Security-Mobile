package com.appsflyer.internal;

import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AFf1sSDK extends AFe1fSDK<String> {
    private static final AFe1pSDK[] registerClient = {AFe1pSDK.DLSDK, AFe1pSDK.ONELINK, AFe1pSDK.REGISTER};
    private final AFf1fSDK AFInAppEventType;
    private final AFc1hSDK AFKeystoreWrapper;
    protected final AFc1qSDK component2;
    private final AFh1mSDK copy;
    private final AFe1vSDK copydefault;
    private final AFc1oSDK equals;
    private final AFf1kSDK hashCode;
    protected final AFg1nSDK toString;

    public AFf1sSDK(AFh1mSDK aFh1mSDK, AFd1zSDK aFd1zSDK) {
        this(aFh1mSDK, aFd1zSDK, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0144  */
    @Override // com.appsflyer.internal.AFe1fSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFd1hSDK<String> AFAdRevenueData(String str) {
        double d10;
        JSONObject jSONObject;
        String str2;
        String str3;
        Exception exc;
        String str4 = BuildConfig.FLAVOR;
        AFAdRevenueData(this.copy);
        if (this.copy.AFAdRevenueData.containsKey("meta")) {
            try {
                d10 = this.hashCode.AFAdRevenueData.getCurrencyIso4217Code.getMonetizationNetwork.getMonetizationNetwork.getMonetizationNetwork;
            } catch (NullPointerException unused) {
                d10 = 1.0d;
            }
            if (AFh1mSDK.getRevenue(d10)) {
                this.copy.AFAdRevenueData.remove("meta");
            }
        }
        AFd1hSDK<String> currencyIso4217Code = ((AFe1fSDK) this).component4.getCurrencyIso4217Code(this.copy, str, this.AFKeystoreWrapper);
        Map<String, Object> map = this.copy.AFAdRevenueData;
        try {
            jSONObject = new JSONObject(map);
            try {
                str2 = jSONObject.toString();
                try {
                } catch (NullPointerException e10) {
                    e = e10;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e);
                    try {
                        Object[] objArr = {map};
                        Map map2 = AFa1hSDK.f20116d;
                        Object obj = map2.get(-226252430);
                        if (obj == null) {
                            obj = ((Class) AFa1hSDK.getRevenue(198 - View.resolveSize(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), View.resolveSizeAndState(0, 0, 0) + 37)).getMethod("getMonetizationNetwork", Map.class);
                            map2.put(-226252430, obj);
                        }
                        String str5 = (String) ((Method) obj).invoke(null, objArr);
                        try {
                        } catch (NullPointerException e11) {
                            e = e11;
                            str2 = str5;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
                            str3 = BuildConfig.FLAVOR;
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this);
                            sb2.append(": preparing data: ");
                            AFg1aSDK.getRevenue(sb2.toString(), jSONObject);
                            this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str3);
                            return currencyIso4217Code;
                        } catch (Exception e12) {
                            exc = e12;
                            str2 = str5;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            str3 = BuildConfig.FLAVOR;
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append(this);
                            sb22.append(": preparing data: ");
                            AFg1aSDK.getRevenue(sb22.toString(), jSONObject);
                            this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str3);
                            return currencyIso4217Code;
                        } catch (Throwable th) {
                            th = th;
                            str2 = str5;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                            str3 = BuildConfig.FLAVOR;
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append(this);
                            sb222.append(": preparing data: ");
                            AFg1aSDK.getRevenue(sb222.toString(), jSONObject);
                            this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str3);
                            return currencyIso4217Code;
                        }
                        if (str5 == null) {
                            throw new NullPointerException("JSON toString of eventParams map returns null");
                        }
                        str3 = str5.replaceAll("\\p{C}", "*Non-printing character*");
                        str2 = str5;
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        StringBuilder sb2222 = new StringBuilder();
                        sb2222.append(this);
                        sb2222.append(": preparing data: ");
                        AFg1aSDK.getRevenue(sb2222.toString(), jSONObject);
                        this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str3);
                        return currencyIso4217Code;
                    } catch (Throwable th2) {
                        try {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        } catch (NullPointerException e13) {
                            e = e13;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
                            str3 = BuildConfig.FLAVOR;
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb22222 = new StringBuilder();
                            sb22222.append(this);
                            sb22222.append(": preparing data: ");
                            AFg1aSDK.getRevenue(sb22222.toString(), jSONObject);
                            this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str3);
                            return currencyIso4217Code;
                        } catch (Exception e14) {
                            exc = e14;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            str3 = BuildConfig.FLAVOR;
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb222222 = new StringBuilder();
                            sb222222.append(this);
                            sb222222.append(": preparing data: ");
                            AFg1aSDK.getRevenue(sb222222.toString(), jSONObject);
                            this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str3);
                            return currencyIso4217Code;
                        } catch (Throwable th3) {
                            th = th3;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                            str3 = BuildConfig.FLAVOR;
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb2222222 = new StringBuilder();
                            sb2222222.append(this);
                            sb2222222.append(": preparing data: ");
                            AFg1aSDK.getRevenue(sb2222222.toString(), jSONObject);
                            this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str3);
                            return currencyIso4217Code;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                    str3 = BuildConfig.FLAVOR;
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb22222222 = new StringBuilder();
                    sb22222222.append(this);
                    sb22222222.append(": preparing data: ");
                    AFg1aSDK.getRevenue(sb22222222.toString(), jSONObject);
                    this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str3);
                    return currencyIso4217Code;
                }
            } catch (NullPointerException e15) {
                e = e15;
                str2 = null;
            } catch (Throwable th5) {
                th = th5;
                str2 = null;
            }
        } catch (NullPointerException e16) {
            e = e16;
            jSONObject = null;
            str2 = null;
        } catch (Throwable th6) {
            th = th6;
            jSONObject = null;
            str2 = null;
        }
        if (str2 == null) {
            throw new NullPointerException("JSON toString of eventParams map returns null");
        }
        str3 = str2.replaceAll("\\p{C}", "*Non-printing character*");
        if (str2 != null) {
            str4 = str2;
        }
        if (str3.equals(str4)) {
            str3 = str4;
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
            try {
                jSONObject = new JSONObject(str3);
            } catch (JSONException e17) {
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Couldn't parse the payload to a json object", e17);
            }
        }
        StringBuilder sb222222222 = new StringBuilder();
        sb222222222.append(this);
        sb222222222.append(": preparing data: ");
        AFg1aSDK.getRevenue(sb222222222.toString(), jSONObject);
        this.component3.getRevenue(currencyIso4217Code != null ? currencyIso4217Code.getMonetizationNetwork.getMediationNetwork : null, str3);
        return currencyIso4217Code;
    }

    protected void component1(AFh1mSDK aFh1mSDK) {
        this.toString.getMediationNetwork(aFh1mSDK);
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AppsFlyerRequestListener component2() {
        return this.copy.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected boolean copydefault() {
        return true;
    }

    protected void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        this.toString.AFAdRevenueData(aFh1mSDK);
    }

    protected void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        this.toString.getMonetizationNetwork(aFh1mSDK.AFAdRevenueData);
    }

    protected void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        this.toString.getRevenue(aFh1mSDK);
    }

    protected void getRevenue(AFh1mSDK aFh1mSDK) {
        this.toString.getCurrencyIso4217Code(aFh1mSDK);
    }

    public AFf1sSDK(AFh1mSDK aFh1mSDK, AFd1zSDK aFd1zSDK, String str) {
        super(aFh1mSDK.AFAdRevenueData(), new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, str);
        this.copy = aFh1mSDK;
        this.copydefault = aFd1zSDK.AFKeystoreWrapper();
        this.component2 = aFd1zSDK.component4();
        this.hashCode = aFd1zSDK.component1();
        this.AFKeystoreWrapper = aFd1zSDK.AFInAppEventParameterName();
        this.equals = aFd1zSDK.AFAdRevenueData();
        this.toString = aFd1zSDK.component3();
        this.AFInAppEventType = aFd1zSDK.afDebugLog();
        for (AFe1pSDK aFe1pSDK : registerClient) {
            if (this.getRevenue == aFe1pSDK) {
                return;
            }
        }
        int i10 = this.copy.component4;
        AFe1pSDK aFe1pSDK2 = this.getRevenue;
        if (i10 > 0) {
            this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
        } else {
            AFe1pSDK aFe1pSDK3 = AFe1pSDK.CONVERSION;
            if (aFe1pSDK2 != aFe1pSDK3) {
                this.AFAdRevenueData.add(aFe1pSDK3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x001e, B:5:0x0024, B:6:0x003f, B:8:0x0045, B:9:0x004e, B:11:0x0059, B:15:0x0065, B:18:0x006d, B:19:0x0078, B:21:0x007e, B:23:0x0098, B:24:0x009d, B:26:0x00b2, B:27:0x00b9, B:29:0x00bd, B:32:0x00c4, B:33:0x00cb, B:34:0x009b, B:35:0x00ce, B:37:0x00d8, B:38:0x00e5, B:46:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x001e, B:5:0x0024, B:6:0x003f, B:8:0x0045, B:9:0x004e, B:11:0x0059, B:15:0x0065, B:18:0x006d, B:19:0x0078, B:21:0x007e, B:23:0x0098, B:24:0x009d, B:26:0x00b2, B:27:0x00b9, B:29:0x00bd, B:32:0x00c4, B:33:0x00cb, B:34:0x009b, B:35:0x00ce, B:37:0x00d8, B:38:0x00e5, B:46:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        boolean z10;
        AFe1tSDK aFe1tSDK;
        try {
            try {
                getCurrencyIso4217Code(aFh1mSDK);
                getMediationNetwork(aFh1mSDK);
                getMonetizationNetwork(aFh1mSDK);
                getRevenue(aFh1mSDK);
                component1(aFh1mSDK);
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while collecting payload params", th, true, true, false);
            }
            if (aFh1mSDK.getMediationNetwork()) {
                aFh1mSDK.AFAdRevenueData((Map<String, ?>) ((AFe1fSDK) this).component1.getRevenue(aFh1mSDK.AFAdRevenueData));
                aFh1mSDK.AFAdRevenueData((Map<String, ?>) ((AFe1fSDK) this).component1.getMediationNetwork(aFh1mSDK.AFAdRevenueData));
            }
            if (aFh1mSDK.component1()) {
                aFh1mSDK.AFAdRevenueData((Map<String, ?>) ((AFe1fSDK) this).component1.getRevenue());
            }
            Set<AFe1pSDK> set = this.AFAdRevenueData;
            if (!set.contains(AFe1pSDK.LAUNCH) && !set.contains(AFe1pSDK.CONVERSION)) {
                z10 = false;
                if (areAllFieldsValid() && z10) {
                    aFh1mSDK.AFAdRevenueData(this.component2.getRevenue("appsFlyerCount", 0));
                }
                if (aFh1mSDK.areAllFieldsValid()) {
                    Map<String, Object> AFAdRevenueData = AFj1aSDK.AFAdRevenueData(aFh1mSDK.AFAdRevenueData);
                    AFe1vSDK aFe1vSDK = this.copydefault;
                    String AFAdRevenueData2 = aFe1vSDK.AFAdRevenueData();
                    String currencyIso4217Code = aFe1vSDK.getCurrencyIso4217Code();
                    if (AFe1vSDK.getMediationNetwork()) {
                        aFe1tSDK = AFe1tSDK.DEFAULT;
                    } else {
                        aFe1tSDK = AFe1tSDK.API;
                    }
                    HostMeta hostMeta = new HostMeta(AFAdRevenueData2, currencyIso4217Code, aFe1tSDK);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", hostMeta.name);
                    AFe1tSDK aFe1tSDK2 = hostMeta.method;
                    if (aFe1tSDK2 != AFe1tSDK.DEFAULT) {
                        jSONObject.put("method", aFe1tSDK2.getCurrencyIso4217Code);
                    }
                    String str = hostMeta.prefix;
                    if (str != null && !StringsKt.Z(str)) {
                        jSONObject.put("prefix", hostMeta.prefix);
                    }
                    AFAdRevenueData.put("host", jSONObject);
                }
                if (this.equals.getMediationNetwork("AF_PREINSTALL_DISABLED")) {
                    AFj1aSDK.AFAdRevenueData(aFh1mSDK.AFAdRevenueData).put("preinstall_disabled", Boolean.TRUE);
                }
                this.AFInAppEventType.getCurrencyIso4217Code(aFh1mSDK.AFAdRevenueData, aFh1mSDK.AFAdRevenueData());
            }
            z10 = true;
            if (areAllFieldsValid()) {
                aFh1mSDK.AFAdRevenueData(this.component2.getRevenue("appsFlyerCount", 0));
            }
            if (aFh1mSDK.areAllFieldsValid()) {
            }
            if (this.equals.getMediationNetwork("AF_PREINSTALL_DISABLED")) {
            }
            this.AFInAppEventType.getCurrencyIso4217Code(aFh1mSDK.AFAdRevenueData, aFh1mSDK.AFAdRevenueData());
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while preparing to send event", th2, true, true, false);
        }
    }
}
