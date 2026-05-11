package com.appsflyer.internal;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.conscrypt.BuildConfig;
import xc.C5146G;

/* loaded from: classes.dex */
public final class AFd1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char areAllFieldsValid = 0;
    private static char component3 = 0;
    private static char copy = 0;
    private static int copydefault = 0;
    private static char equals = 0;
    public static String getMonetizationNetwork = null;
    private static String getRevenue = null;
    private static int hashCode = 1;
    private final AppsFlyerProperties AFAdRevenueData;
    private final AFj1cSDK component1;
    private final AFf1eSDK component2;
    private final AFe1vSDK component4;
    private final AFd1mSDK getCurrencyIso4217Code;
    private final AFc1oSDK getMediationNetwork;

    static {
        getMediationNetwork();
        getMonetizationNetwork = "https://%sgcdsdk.%s/install_data/v5.0/";
        getRevenue = "https://%sonelink.%s/shortlink-sdk/v2";
        int i10 = copydefault + 31;
        hashCode = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 46 / 0;
        }
    }

    public AFd1nSDK(AFd1mSDK aFd1mSDK, AFc1oSDK aFc1oSDK, AppsFlyerProperties appsFlyerProperties, AFe1vSDK aFe1vSDK, AFj1cSDK aFj1cSDK, AFf1eSDK aFf1eSDK) {
        this.getCurrencyIso4217Code = aFd1mSDK;
        this.getMediationNetwork = aFc1oSDK;
        this.AFAdRevenueData = appsFlyerProperties;
        this.component4 = aFe1vSDK;
        this.component1 = aFj1cSDK;
        this.component2 = aFf1eSDK;
    }

    private static void a(String str, int i10, Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i11 = $11 + 87;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr3 = new char[cArr2.length];
        aFk1qSDK.getRevenue = 0;
        char[] cArr4 = new char[2];
        while (true) {
            int i12 = aFk1qSDK.getRevenue;
            if (i12 >= cArr2.length) {
                objArr[0] = new String(cArr3, 0, i10);
                return;
            }
            int i13 = $10 + 97;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                cArr4[1] = cArr2[i12];
                cArr4[1] = cArr2[i12];
            } else {
                cArr4[0] = cArr2[i12];
                cArr4[1] = cArr2[i12 + 1];
            }
            int i14 = 58224;
            for (int i15 = 0; i15 < 16; i15++) {
                $11 = ($10 + 75) % 128;
                char c10 = cArr4[1];
                char c11 = cArr4[0];
                char c12 = (char) (c10 - (((c11 + i14) ^ ((c11 << 4) + ((char) (equals ^ (-1199070254561146252L))))) ^ ((c11 >>> 5) + ((char) (copy ^ (-1199070254561146252L))))));
                cArr4[1] = c12;
                cArr4[0] = (char) (c11 - (((c12 >>> 5) + ((char) (areAllFieldsValid ^ (-1199070254561146252L)))) ^ ((c12 + i14) ^ ((c12 << 4) + ((char) (component3 ^ (-1199070254561146252L)))))));
                i14 -= 40503;
            }
            int i16 = aFk1qSDK.getRevenue;
            cArr3[i16] = cArr4[0];
            cArr3[i16 + 1] = cArr4[1];
            aFk1qSDK.getRevenue = i16 + 2;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String mediationNetwork;
        String mediationNetwork2;
        AFd1nSDK aFd1nSDK = (AFd1nSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        hashCode = (copydefault + 1) % 128;
        try {
            Object[] objArr2 = {map, str};
            Map map2 = AFa1hSDK.f20116d;
            Object obj = map2.get(1320791325);
            if (obj == null) {
                obj = ((Class) AFa1hSDK.getRevenue(((byte) KeyEvent.getModifierMetaStateMask()) + 199, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 37 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("getRevenue", Map.class, String.class);
                map2.put(1320791325, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr2);
            AFj1cSDK aFj1cSDK = aFd1nSDK.component1;
            if (str2 == null || str2.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").d(str2) || new Regex("3.?(\\d+)?.?(\\d+)").d(str2)) {
                int i10 = copydefault + 57;
                hashCode = i10 % 128;
                if (i10 % 2 == 0) {
                    aFj1cSDK.getRevenue.getMediationNetwork("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
                    throw null;
                }
                mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
            } else {
                hashCode = (copydefault + 11) % 128;
                mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
            }
            mediationNetwork2 = aFj1cSDK.getMediationNetwork(aFj1cSDK.getMediationNetwork(mediationNetwork), false);
            return aFd1nSDK.getRevenue(new AFd1bSDK(mediationNetwork2, bArr, "POST", Collections.emptyMap(), true), new AFd1dSDK());
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i11;
        int i16 = (i10 * 615) + (i11 * (-613)) + ((i12 | i14 | (~(i15 | i10))) * 614);
        int i17 = ~i12;
        int i18 = i16 + ((i14 | (~(i13 | i17)) | (~(i17 | i11))) * (-1228)) + (((~(i10 | i17 | i11)) | (~(i13 | i15 | i17))) * 614);
        if (i18 != 1) {
            return i18 != 2 ? AFAdRevenueData(objArr) : getCurrencyIso4217Code(objArr);
        }
        AFd1nSDK aFd1nSDK = (AFd1nSDK) objArr[0];
        copydefault = (hashCode + 113) % 128;
        if (!aFd1nSDK.AFAdRevenueData.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            int i19 = copydefault + 69;
            hashCode = i19 % 128;
            if (i19 % 2 != 0) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public final AFd1hSDK<String> AFAdRevenueData(Map<String, Object> map, String str, String str2) {
        String mediationNetwork;
        String mediationNetwork2;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1hSDK.f20116d;
            Object obj = map2.get(1320791325);
            if (obj == null) {
                obj = ((Class) AFa1hSDK.getRevenue(KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 198, (char) View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 38)).getMethod("getRevenue", Map.class, String.class);
                map2.put(1320791325, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            AFj1cSDK aFj1cSDK = this.component1;
            if (str2 != null) {
                hashCode = (copydefault + 87) % 128;
                if (str2.length() != 0) {
                    if (!new Regex("4.?(\\d+)?.?(\\d+)").d(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").d(str2)) {
                        mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                        mediationNetwork2 = aFj1cSDK.getMediationNetwork(aFj1cSDK.getMediationNetwork(mediationNetwork), false);
                        return getRevenue(new AFd1bSDK(mediationNetwork2, bArr, "POST", Collections.emptyMap(), true), new AFd1dSDK());
                    }
                    mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                    mediationNetwork2 = aFj1cSDK.getMediationNetwork(aFj1cSDK.getMediationNetwork(mediationNetwork), false);
                    return getRevenue(new AFd1bSDK(mediationNetwork2, bArr, "POST", Collections.emptyMap(), true), new AFd1dSDK());
                }
            }
            copydefault = (hashCode + 37) % 128;
            mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
            mediationNetwork2 = aFj1cSDK.getMediationNetwork(aFj1cSDK.getMediationNetwork(mediationNetwork), false);
            return getRevenue(new AFd1bSDK(mediationNetwork2, bArr, "POST", Collections.emptyMap(), true), new AFd1dSDK());
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    public final AFd1hSDK<String> getMonetizationNetwork(Map<String, Object> map, String str) {
        int i10 = hashCode + 111;
        copydefault = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1hSDK.f20116d;
                    Object obj = map2.get(1320791325);
                    if (obj == null) {
                        obj = ((Class) AFa1hSDK.getRevenue(198 - KeyEvent.getDeadChar(0, 0), (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 1), 38 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getMethod("getRevenue", Map.class, String.class);
                        map2.put(1320791325, obj);
                    }
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map map3 = AFa1hSDK.f20116d;
                Object obj2 = map3.get(1320791325);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1hSDK.getRevenue(197 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), (char) (ViewConfiguration.getEdgeSlop() >> 16), 37 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR))).getMethod("getRevenue", Map.class, String.class);
                    map3.put(1320791325, obj2);
                }
                byte[] bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                AFj1cSDK aFj1cSDK = this.component1;
                AFd1hSDK<String> revenue = getRevenue(new AFd1bSDK(aFj1cSDK.getMediationNetwork(aFj1cSDK.getRevenue.getMediationNetwork("https://%svalidate-and-log.%s/api/v4.0/android/one_time_purchase/validateAndLog?app_id=")), bArr, "POST", Collections.emptyMap(), true), new AFd1dSDK());
                copydefault = (hashCode + 53) % 128;
                return revenue;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
            return null;
        }
        AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
        return null;
    }

    public final AFd1hSDK<AFi1vSDK> getRevenue(boolean z10, boolean z11, String str, int i10) {
        String str2;
        String str3;
        AFe1vSDK aFe1vSDK = this.component4;
        Intrinsics.checkNotNullParameter(str, "");
        String str4 = !z10 ? AFe1vSDK.getMonetizationNetwork : AFe1vSDK.getCurrencyIso4217Code;
        if (z11) {
            copydefault = (hashCode + 17) % 128;
            str2 = "stg";
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        C5146G c5146g = C5146G.f44966a;
        if (AFe1vSDK.getMediationNetwork()) {
            copydefault = (hashCode + 93) % 128;
            str3 = (String) aFe1vSDK.getMonetizationNetwork.getValue();
        } else {
            str3 = BuildConfig.FLAVOR;
        }
        String format = String.format(str4, Arrays.copyOf(new Object[]{str3, str2, aFe1vSDK.AFAdRevenueData(), str}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "");
        AFd1bSDK aFd1bSDK = new AFd1bSDK(format, "GET");
        aFd1bSDK.component4 = 1500;
        return getRevenue(aFd1bSDK, new AFd1cSDK());
    }

    public final AFd1hSDK<Map<String, String>> getMediationNetwork(String str, String str2, UUID uuid, String str3) {
        String obj = uuid.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName()));
        sb2.append("/");
        sb2.append(str);
        sb2.append("?id=");
        sb2.append(str2);
        String obj2 = sb2.toString();
        Map<String, Object> revenue = getRevenue();
        String valueOf = String.valueOf(revenue.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf);
        hashMap.put("Af-Meta-Counter", String.valueOf(revenue.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(revenue.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(revenue.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(revenue.get("sdk")));
        Object[] objArr = new Object[1];
        a("ꪹᇎ䪙佧ퟬ\ueecf脛ᒬ襵㗗݁詼", TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 13, objArr);
        hashMap.put(((String) objArr[0]).intern(), getMonetizationNetwork(str3, obj, "GET", obj, str, str2, valueOf));
        AFd1hSDK<Map<String, String>> revenue2 = getRevenue(new AFd1bSDK(obj2, null, "GET", hashMap, false), new AFd1eSDK());
        hashCode = (copydefault + 73) % 128;
        return revenue2;
    }

    public final AFd1hSDK<String> getRevenue(AFh1gSDK aFh1gSDK) {
        AFd1hSDK<String> revenue = getRevenue(new AFd1bSDK(aFh1gSDK.component2, aFh1gSDK.getMonetizationNetwork(), "POST", aFh1gSDK.getMediationNetwork, true), new AFd1dSDK());
        copydefault = (hashCode + 35) % 128;
        return revenue;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFd1nSDK aFd1nSDK = (AFd1nSDK) objArr[0];
        AFd1bSDK aFd1bSDK = new AFd1bSDK((String) objArr[1], null, "GET", Collections.emptyMap(), false);
        aFd1bSDK.component4 = ModuleDescriptor.MODULE_VERSION;
        aFd1bSDK.getRevenue = false;
        AFd1hSDK revenue = aFd1nSDK.getRevenue(aFd1bSDK, new AFd1dSDK());
        int i10 = hashCode + 41;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    public final AFd1hSDK<Map<String, Object>> getMonetizationNetwork(String str, String str2) {
        AFd1hSDK<Map<String, Object>> revenue = getRevenue(AFd1fSDK.getRevenue(this.getMediationNetwork.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName(), AFb1kSDK.getCurrencyIso4217Code(this.getMediationNetwork.getMediationNetwork), str, str2), new AFd1iSDK());
        copydefault = (hashCode + 23) % 128;
        return revenue;
    }

    public final AFd1kSDK getMediationNetwork(Map<String, Object> map, String str) {
        hashCode = (copydefault + 43) % 128;
        try {
            try {
                Object[] objArr = {map, str};
                Map map2 = AFa1hSDK.f20116d;
                Object obj = map2.get(1320791325);
                if (obj == null) {
                    obj = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 197, (char) KeyEvent.getDeadChar(0, 0), 37 - (Process.myTid() >> 22))).getMethod("getRevenue", Map.class, String.class);
                    map2.put(1320791325, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                if (bArr != null) {
                    return new AFd1kSDK(this.getMediationNetwork, bArr);
                }
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: failed to create bytes.", new IllegalArgumentException("Failed to create bytes from proxyData, bytes are null"), false, false);
                copydefault = (hashCode + 77) % 128;
                return null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
            return null;
        }
    }

    private boolean AFAdRevenueData() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, -221532825, 221532826, System.identityHashCode(this))).booleanValue();
    }

    private <T> AFd1hSDK<T> getRevenue(AFd1bSDK aFd1bSDK, AFe1zSDK<T> aFe1zSDK) {
        copydefault = (hashCode + 37) % 128;
        AFd1hSDK<T> revenue = getRevenue(aFd1bSDK, aFe1zSDK, AFAdRevenueData());
        int i10 = hashCode + 51;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 10 / 0;
        }
        return revenue;
    }

    public final AFd1hSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str) {
        copydefault = (hashCode + 9) % 128;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1hSDK.f20116d;
            Object obj = map2.get(1320791325);
            if (obj == null) {
                obj = ((Class) AFa1hSDK.getRevenue(AndroidCharacter.getMirror('0') + 150, (char) View.combineMeasuredStates(0, 0), 37 - (ViewConfiguration.getEdgeSlop() >> 16))).getMethod("getRevenue", Map.class, String.class);
                map2.put(1320791325, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            AFj1cSDK aFj1cSDK = this.component1;
            AFd1hSDK<String> revenue = getRevenue(new AFd1bSDK(aFj1cSDK.getMediationNetwork(aFj1cSDK.getRevenue.getMediationNetwork("https://%svalidate-and-log.%s/api/v4.0/android/subscription/validateAndLog?app_id=")), bArr, "POST", Collections.emptyMap(), true), new AFd1dSDK());
            int i10 = hashCode + 49;
            copydefault = i10 % 128;
            if (i10 % 2 == 0) {
                return revenue;
            }
            throw null;
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    private Map<String, Object> getRevenue() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.17.5");
        hashMap.put("counter", Integer.valueOf(this.getMediationNetwork.getMediationNetwork.getRevenue("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a("ĒⒾ〟圌\uea94狦", 5 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        hashMap.put("app_version_name", this.getMediationNetwork.n_().versionName);
        hashMap.put("app_id", this.getMediationNetwork.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName());
        hashMap.put("platformextension", new AFa1uSDK().AFAdRevenueData());
        copydefault = (hashCode + 69) % 128;
        return hashMap;
    }

    public final AFd1hSDK<String> getMonetizationNetwork(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put(AppConstants.PARAMS_UUID, obj);
        hashMap.put("data", map);
        hashMap.put("meta", getRevenue());
        if (str2 != null) {
            copydefault = (hashCode + 85) % 128;
            hashMap.put("brand_domain", str2);
            copydefault = (hashCode + 75) % 128;
        }
        String jSONObject = AFg1eSDK.getMediationNetwork(hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        a("ꪹᇎ䪙佧ퟬ\ueecf脛ᒬ襵㗗݁詼", 12 - View.MeasureSpec.getSize(0), objArr);
        hashMap2.put(((String) objArr[0]).intern(), getMonetizationNetwork(str3, obj, "POST", jSONObject));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName()));
        sb2.append("/");
        sb2.append(str);
        return getRevenue(new AFd1bSDK(sb2.toString(), jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), new AFd1dSDK(), true);
    }

    static void getMediationNetwork() {
        component3 = (char) 38421;
        areAllFieldsValid = (char) 15473;
        equals = (char) 49306;
        copy = (char) 12673;
    }

    public final AFd1hSDK<String> getMediationNetwork(Map<String, Object> map, String str, String str2) {
        return (AFd1hSDK) getMediationNetwork(new Object[]{this, map, str, str2}, -1130573825, 1130573827, System.identityHashCode(this));
    }

    public final AFd1hSDK<String> getCurrencyIso4217Code(AFh1mSDK aFh1mSDK, String str, AFc1hSDK aFc1hSDK) {
        String mediationNetwork;
        String mediationNetwork2;
        try {
            try {
                Object[] objArr = {aFh1mSDK, str, aFc1hSDK};
                Map map = AFa1hSDK.f20116d;
                Object obj = map.get(-1034782704);
                if (obj == null) {
                    obj = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 198, (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 37)).getMethod("AFAdRevenueData", AFh1mSDK.class, String.class, AFc1hSDK.class);
                    map.put(-1034782704, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                getCurrencyIso4217Code(aFh1mSDK, bArr);
                hashCode = (copydefault + 67) % 128;
                AFj1cSDK aFj1cSDK = this.component1;
                Intrinsics.checkNotNullParameter(aFh1mSDK, "");
                boolean revenue = aFh1mSDK.getRevenue();
                boolean z10 = aFh1mSDK instanceof AFh1lSDK;
                boolean z11 = aFh1mSDK instanceof AFh1nSDK;
                boolean z12 = aFh1mSDK instanceof AFh1kSDK;
                boolean z13 = aFh1mSDK instanceof AFh1cSDK;
                boolean z14 = aFh1mSDK instanceof AFh1bSDK;
                boolean z15 = aFh1mSDK instanceof AFg1tSDK;
                if (aFh1mSDK instanceof AFh1iSDK) {
                    mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork("https://%spia.%s/api/v1.0/pia-android-event?app_id=");
                } else {
                    if (!z12) {
                        int i10 = copydefault + 5;
                        int i11 = i10 % 128;
                        hashCode = i11;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                        if (!z11) {
                            if (z10) {
                                copydefault = (i11 + 63) % 128;
                                mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.AFAdRevenueData);
                            } else if (z13) {
                                mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.component1);
                            } else {
                                if (z14) {
                                    mediationNetwork2 = aFj1cSDK.getRevenue.getMediationNetwork("https://%ssdk-services.%s/validate-android-signature");
                                    return getRevenue(new AFd1bSDK(mediationNetwork2, bArr, "POST", aFh1mSDK.getMediationNetwork, aFh1mSDK.getCurrencyIso4217Code()), new AFd1dSDK());
                                }
                                if (z15) {
                                    mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.component2);
                                    copydefault = (hashCode + 91) % 128;
                                } else if (revenue) {
                                    if (aFh1mSDK.component4 < 2) {
                                        mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.getMonetizationNetwork);
                                    } else {
                                        mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.areAllFieldsValid);
                                    }
                                } else {
                                    mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.component4);
                                }
                            }
                        }
                    }
                    mediationNetwork = aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.getMediationNetwork);
                }
                mediationNetwork2 = aFj1cSDK.getMediationNetwork(AFj1cSDK.getRevenue(aFj1cSDK.getMediationNetwork(mediationNetwork), z10), z15);
                copydefault = (hashCode + 41) % 128;
                return getRevenue(new AFd1bSDK(mediationNetwork2, bArr, "POST", aFh1mSDK.getMediationNetwork, aFh1mSDK.getCurrencyIso4217Code()), new AFd1dSDK());
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
            return null;
        }
    }

    private static String getMonetizationNetwork(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String join = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("v2");
        String monetizationNetwork = AFj1dSDK.getMonetizationNetwork(join, sb2.toString());
        int i10 = hashCode + 9;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 60 / 0;
        }
        return monetizationNetwork;
    }

    private <T> AFd1hSDK<T> getRevenue(AFd1bSDK aFd1bSDK, AFe1zSDK<T> aFe1zSDK, boolean z10) {
        aFd1bSDK.getCurrencyIso4217Code = z10;
        AFd1mSDK aFd1mSDK = this.getCurrencyIso4217Code;
        AFd1hSDK<T> aFd1hSDK = new AFd1hSDK<>(aFd1bSDK, aFd1mSDK.getRevenue, aFd1mSDK.getMonetizationNetwork, aFe1zSDK);
        int i10 = copydefault + 1;
        hashCode = i10 % 128;
        if (i10 % 2 != 0) {
            return aFd1hSDK;
        }
        throw null;
    }

    public final AFd1hSDK<DdlResponse> getMonetizationNetwork(AFa1rSDK aFa1rSDK) {
        AFd1hSDK<DdlResponse> revenue = getRevenue(new AFd1bSDK(aFa1rSDK.component2, AFg1eSDK.getMediationNetwork(aFa1rSDK.AFAdRevenueData).toString().getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), aFa1rSDK.getCurrencyIso4217Code()), new AFa1pSDK());
        int i10 = hashCode + 73;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    private void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK, byte[] bArr) {
        int i10 = copydefault + 79;
        hashCode = i10 % 128;
        if (i10 % 2 != 0) {
            boolean mediationNetwork = this.getMediationNetwork.getMediationNetwork("com.appsflyer.security.enable");
            if (aFh1mSDK.getMediationNetwork() && mediationNetwork) {
                hashCode = (copydefault + 73) % 128;
                if (AFf1eSDK.getRevenue(aFh1mSDK, this.getMediationNetwork)) {
                    int i11 = hashCode + 103;
                    copydefault = i11 % 128;
                    if (i11 % 2 != 0) {
                        AFf1eSDK.getMonetizationNetwork(aFh1mSDK, bArr);
                        int i12 = 88 / 0;
                    } else {
                        AFf1eSDK.getMonetizationNetwork(aFh1mSDK, bArr);
                    }
                    copydefault = (hashCode + 89) % 128;
                    return;
                }
                return;
            }
            return;
        }
        this.getMediationNetwork.getMediationNetwork("com.appsflyer.security.enable");
        aFh1mSDK.getMediationNetwork();
        throw null;
    }

    public final AFd1hSDK<String> getCurrencyIso4217Code(String str) {
        return (AFd1hSDK) getMediationNetwork(new Object[]{this, str}, 1535622589, -1535622589, System.identityHashCode(this));
    }
}
