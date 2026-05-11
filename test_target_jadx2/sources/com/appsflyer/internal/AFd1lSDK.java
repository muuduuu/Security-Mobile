package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFd1lSDK implements AFd1oSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] component3 = null;
    private static boolean copy = false;
    private static int copydefault = 1;
    private static int equals;
    private static final int getCurrencyIso4217Code;
    private static int hashCode;
    private static boolean toString;
    private final AFd1zSDK component2;
    private List<String> AFAdRevenueData = new ArrayList();
    private boolean getRevenue = true;
    private final Map<String, Object> getMediationNetwork = new HashMap();
    private SecureRandom areAllFieldsValid = new SecureRandom();
    private boolean component1 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMonetizationNetwork = 0;
    private boolean component4 = false;

    static {
        component3();
        getCurrencyIso4217Code = 98166;
        equals = (copydefault + 23) % 128;
    }

    public AFd1lSDK(AFd1zSDK aFd1zSDK) {
        this.component2 = aFd1zSDK;
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i10, int i11, int i12) {
        int i13 = i10 | i11;
        int i14 = (i10 * 503) + (i11 * 503) + (i13 * (-502));
        int i15 = ~i10;
        int i16 = ~((~i11) | i15);
        int i17 = i15 | (~i12);
        int i18 = i16 | (~i17);
        int i19 = ~(i12 | i13);
        int i20 = i14 + ((i18 | i19) * (-502)) + (((~(i17 | i11)) | i19) * 502);
        return i20 != 1 ? i20 != 2 ? i20 != 3 ? getMonetizationNetwork(objArr) : getRevenue(objArr) : getMediationNetwork(objArr) : getCurrencyIso4217Code(objArr);
    }

    private void AFInAppEventType() {
        copydefault = (equals + 119) % 128;
        this.component2.component4().AFAdRevenueData("participantInProxy");
        int i10 = copydefault + 89;
        equals = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 31 / 0;
        }
    }

    private boolean AFLogger() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, -916590221, 916590222, System.identityHashCode(this))).booleanValue();
    }

    private static void a(String str, int[] iArr, String str2, int i10, Object[] objArr) {
        int i11 = ($11 + 29) % 128;
        $10 = i11;
        char[] cArr = str2;
        if (str2 != null) {
            int i12 = i11 + 95;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr3 = component3;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i13 = 0; i13 < length; i13++) {
                cArr4[i13] = (char) (cArr3[i13] ^ 1825820251896122634L);
            }
            cArr3 = cArr4;
        }
        int i14 = (int) (1825820251896122634L ^ hashCode);
        if (copy) {
            int length2 = bArr2.length;
            aFk1oSDK.getMonetizationNetwork = length2;
            char[] cArr5 = new char[length2];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i15 = aFk1oSDK.AFAdRevenueData;
                int i16 = aFk1oSDK.getMonetizationNetwork;
                if (i15 >= i16) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i15] = (char) (cArr3[bArr2[(i16 - 1) - i15] + i10] - i14);
                    aFk1oSDK.AFAdRevenueData = i15 + 1;
                }
            }
        } else if (toString) {
            int length3 = cArr2.length;
            aFk1oSDK.getMonetizationNetwork = length3;
            char[] cArr6 = new char[length3];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i17 = aFk1oSDK.AFAdRevenueData;
                int i18 = aFk1oSDK.getMonetizationNetwork;
                if (i17 >= i18) {
                    String str3 = new String(cArr6);
                    $11 = ($10 + 51) % 128;
                    objArr[0] = str3;
                    return;
                } else {
                    int i19 = $11 + 55;
                    $10 = i19 % 128;
                    if (i19 % 2 != 0) {
                        cArr6[i17] = (char) (cArr3[cArr2[(i18 % 1) / i17] - i10] % i14);
                    } else {
                        cArr6[i17] = (char) (cArr3[cArr2[(i18 - 1) - i17] - i10] - i14);
                        i17++;
                    }
                    aFk1oSDK.AFAdRevenueData = i17;
                }
            }
        } else {
            int length4 = iArr.length;
            aFk1oSDK.getMonetizationNetwork = length4;
            char[] cArr7 = new char[length4];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i20 = aFk1oSDK.AFAdRevenueData;
                int i21 = aFk1oSDK.getMonetizationNetwork;
                if (i20 >= i21) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i20] = (char) (cArr3[iArr[(i21 - 1) - i20] - i10] - i14);
                    aFk1oSDK.AFAdRevenueData = i20 + 1;
                }
            }
        }
    }

    private synchronized void component1() {
        int i10 = copydefault + 51;
        equals = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.component4) {
            return;
        }
        this.component4 = true;
        try {
            getCurrencyIso4217Code("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            equals = (copydefault + 83) % 128;
            return;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
            return;
        }
    }

    private float component2() {
        int i10 = copydefault + 115;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            return this.areAllFieldsValid.nextFloat();
        }
        this.areAllFieldsValid.nextFloat();
        throw null;
    }

    static void component3() {
        component3 = new char[]{36322, 36338, 36333, 36350, 36320};
        hashCode = 1912311180;
        toString = true;
        copy = true;
    }

    private static String component4() {
        int i10 = equals + 83;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            return "6.17.5";
        }
        throw null;
    }

    private synchronized void copy() {
        this.AFAdRevenueData = new ArrayList();
        this.getMonetizationNetwork = 0;
        copydefault = (equals + 29) % 128;
    }

    private synchronized Map<String, Object> copydefault() {
        Map<String, Object> map;
        copydefault = (equals + 37) % 128;
        this.getMediationNetwork.put("data", this.AFAdRevenueData);
        copy();
        map = this.getMediationNetwork;
        copydefault = (equals + 111) % 128;
        return map;
    }

    private boolean equals() {
        if (this.component1) {
            int i10 = copydefault;
            equals = (i10 + 31) % 128;
            if (this.getRevenue) {
                return true;
            }
            int i11 = i10 + 37;
            equals = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            if (this.component4) {
                return true;
            }
        }
        int i12 = copydefault + 39;
        equals = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean areAllFieldsValid() {
        int i10 = copydefault + 105;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            return this.component4;
        }
        int i11 = 7 / 0;
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getCurrencyIso4217Code() {
        int i10 = copydefault;
        this.component1 = false;
        equals = (i10 + 13) % 128;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getMediationNetwork() {
        if (!this.component4 && !this.getRevenue) {
            copydefault = (equals + 85) % 128;
            return;
        }
        this.component4 = false;
        this.getRevenue = false;
        try {
            getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            equals = (copydefault + 91) % 128;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getMonetizationNetwork() {
        equals = (copydefault + 29) % 128;
        this.getMediationNetwork.clear();
        this.AFAdRevenueData.clear();
        this.getMonetizationNetwork = 0;
        int i10 = equals + 61;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getRevenue(String str, String... strArr) {
        int i10 = copydefault + 47;
        equals = i10 % 128;
        if (i10 % 2 != 0) {
            getCurrencyIso4217Code("public_api_call", str, strArr);
            int i11 = 67 / 0;
        } else {
            getCurrencyIso4217Code("public_api_call", str, strArr);
        }
        equals = (copydefault + 3) % 128;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void q_(String str, PackageManager packageManager) {
        int i10 = copydefault + 33;
        equals = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.component2.getRevenue().getMediationNetwork(AFAdRevenueData(str), this.component2.AFInAppEventType().getMediationNetwork());
                throw null;
            }
            final AFd1kSDK mediationNetwork = this.component2.getRevenue().getMediationNetwork(AFAdRevenueData(str), this.component2.AFInAppEventType().getMediationNetwork());
            if (mediationNetwork == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
            } else {
                this.component2.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFd1kSDK.this.AFAdRevenueData();
                    }
                });
                equals = (copydefault + 61) % 128;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean AFAdRevenueData() {
        equals = (copydefault + 67) % 128;
        boolean monetizationNetwork = getMonetizationNetwork(getMonetizationNetwork(this.component2.component1().AFAdRevenueData.getCurrencyIso4217Code), getMonetizationNetwork(this.component2.component1().AFAdRevenueData.getMediationNetwork));
        if (monetizationNetwork) {
            equals = (copydefault + 13) % 128;
            component1();
        } else {
            getRevenue();
            getMediationNetwork();
        }
        copydefault = (equals + 119) % 128;
        return monetizationNetwork;
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a("\u0085\u0084\u0083\u0082\u0081", null, null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.getMediationNetwork.put("model", Build.MODEL);
            this.getMediationNetwork.put("platform", "Android");
            this.getMediationNetwork.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                int i10 = copydefault + 19;
                equals = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                if (str.length() > 0) {
                    this.getMediationNetwork.put("advertiserId", str);
                    copydefault = (equals + 55) % 128;
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.getMediationNetwork.put("imei", str2);
            }
            if (str3 != null) {
                equals = (copydefault + 111) % 128;
                if (str3.length() > 0) {
                    this.getMediationNetwork.put("android_id", str3);
                    equals = (copydefault + 123) % 128;
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getMonetizationNetwork(String str, String str2) {
        int i10 = equals + 109;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            getCurrencyIso4217Code((String) null, str, str2);
        } else {
            getCurrencyIso4217Code((String) null, str, str2);
        }
        int i11 = equals + HVFrameRecorder.FRAME_DURATION;
        copydefault = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r2 = r4.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        r2 = r0.getMessage();
     */
    @Override // com.appsflyer.internal.AFd1oSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getRevenue(Throwable th) {
        Throwable cause;
        String simpleName;
        String message;
        StackTraceElement[] stackTrace;
        int i10 = equals + 103;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            cause = th.getCause();
            simpleName = th.getClass().getSimpleName();
            int i11 = 82 / 0;
        } else {
            cause = th.getCause();
            simpleName = th.getClass().getSimpleName();
        }
        if (cause == null) {
            stackTrace = th.getStackTrace();
        } else {
            stackTrace = cause.getStackTrace();
            equals = (copydefault + 47) % 128;
        }
        getCurrencyIso4217Code("exception", simpleName, getCurrencyIso4217Code(message, stackTrace));
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        boolean mediationNetwork;
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        AFi1xSDK aFi1xSDK = (AFi1xSDK) objArr[1];
        AFi1xSDK aFi1xSDK2 = (AFi1xSDK) objArr[2];
        int i10 = equals + 87;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            aFi1xSDK.equals(aFi1xSDK2);
            throw null;
        }
        if (aFi1xSDK.equals(aFi1xSDK2)) {
            mediationNetwork = aFd1lSDK.AFLogger();
        } else {
            mediationNetwork = aFd1lSDK.getMediationNetwork(aFi1xSDK.getCurrencyIso4217Code);
            aFd1lSDK.getMediationNetwork(mediationNetwork);
        }
        int i11 = copydefault + 63;
        equals = i11 % 128;
        if (i11 % 2 == 0) {
            return Boolean.valueOf(mediationNetwork);
        }
        throw null;
    }

    private synchronized boolean getMonetizationNetwork(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        if (aFi1xSDK == null) {
            AFInAppEventType();
            return false;
        }
        if (!aFi1xSDK.AFAdRevenueData()) {
            return false;
        }
        if (this.component2.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0) > aFi1xSDK.getMonetizationNetwork) {
            return false;
        }
        equals = (copydefault + 113) % 128;
        if (!AFAdRevenueData(aFi1xSDK, aFi1xSDK2)) {
            return false;
        }
        if (!getMonetizationNetwork(aFi1xSDK.getMediationNetwork)) {
            return false;
        }
        if (getCurrencyIso4217Code(aFi1xSDK.getRevenue)) {
            return true;
        }
        int i10 = copydefault + 115;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void AFAdRevenueData(String str, int i10, String str2) {
        int i11 = copydefault + 3;
        equals = i11 % 128;
        if (i11 % 2 != 0) {
            String[] strArr = new String[4];
            strArr[1] = String.valueOf(i10);
            strArr[0] = str2;
            getCurrencyIso4217Code("server_response", str, strArr);
        } else {
            getCurrencyIso4217Code("server_response", str, String.valueOf(i10), str2);
        }
        int i12 = copydefault + 113;
        equals = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 72 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getRevenue(String str, String str2) {
        int i10 = equals + 19;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            getCurrencyIso4217Code("server_request", str, strArr);
        } else {
            getCurrencyIso4217Code("server_request", str, str2);
        }
        int i11 = copydefault + 115;
        equals = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private void getMediationNetwork(boolean z10) {
        int i10 = equals + 57;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            this.component2.component4().AFAdRevenueData("participantInProxy", z10);
        } else {
            this.component2.component4().AFAdRevenueData("participantInProxy", z10);
            throw null;
        }
    }

    private Map<String, Object> AFAdRevenueData(String str) {
        int i10 = equals + 7;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            AFAdRevenueData(str, this.component2.AFInAppEventType(), this.component2.force());
            return copydefault();
        }
        AFAdRevenueData(str, this.component2.AFInAppEventType(), this.component2.force());
        copydefault();
        throw null;
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3, String str4) {
        try {
            int i10 = equals + 5;
            copydefault = i10 % 128;
            try {
                if (i10 % 2 != 0) {
                    this.getMediationNetwork.put("sdk_version", str);
                    if (str2 != null) {
                        equals = (copydefault + 29) % 128;
                        if (str2.length() > 0) {
                            this.getMediationNetwork.put("devkey", str2);
                        }
                    }
                    if (str3 != null && str3.length() > 0) {
                        int i11 = copydefault + 61;
                        equals = i11 % 128;
                        if (i11 % 2 == 0) {
                            this.getMediationNetwork.put("originalAppsFlyerId", str3);
                        } else {
                            this.getMediationNetwork.put("originalAppsFlyerId", str3);
                            throw null;
                        }
                    }
                    if (str4 != null) {
                        int i12 = equals + 79;
                        copydefault = i12 % 128;
                        if (i12 % 2 != 0) {
                            if (str4.length() > 0) {
                                this.getMediationNetwork.put("uid", str4);
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    this.getMediationNetwork.put("sdk_version", str);
                    throw null;
                }
            } catch (Throwable unused) {
            }
        } finally {
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getRevenue() {
        try {
            int i10 = copydefault + 23;
            equals = i10 % 128;
            if (i10 % 2 != 0) {
                this.getRevenue = false;
                getMonetizationNetwork();
            } else {
                this.getRevenue = false;
                getMonetizationNetwork();
            }
            copy();
            int i11 = equals + 31;
            copydefault = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 15 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean getMediationNetwork(float f10) {
        return ((Boolean) AFAdRevenueData(new Object[]{this, Float.valueOf(f10)}, 1140261820, -1140261820, System.identityHashCode(this))).booleanValue();
    }

    private synchronized void AFAdRevenueData(String str, AFf1eSDK aFf1eSDK, AFc1eSDK aFc1eSDK) {
        try {
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.getMediationNetwork.clear();
            if (string != null) {
                try {
                    this.getMediationNetwork.putAll(AFg1eSDK.getRevenue(new JSONObject(string)));
                } catch (Throwable unused) {
                }
            } else {
                getCurrencyIso4217Code(this.component2.AFAdRevenueData().areAllFieldsValid(), aFf1eSDK.AFAdRevenueData(), aFc1eSDK.getCurrencyIso4217Code);
                StringBuilder sb2 = new StringBuilder("6.17.5.");
                sb2.append(AFa1ySDK.getMonetizationNetwork);
                getCurrencyIso4217Code(sb2.toString(), this.component2.AFInAppEventType().getMediationNetwork(), appsFlyerProperties.getString("KSAppsFlyerId"), AFb1kSDK.getCurrencyIso4217Code(this.component2.AFAdRevenueData().getMediationNetwork));
                try {
                    int i10 = this.component2.AFAdRevenueData().n_().versionCode;
                    getRevenue(str, String.valueOf(i10), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                    copydefault = (equals + 29) % 128;
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getMediationNetwork).toString());
            }
            this.getMediationNetwork.put("launch_counter", String.valueOf(this.component2.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0)));
            copydefault = (equals + 41) % 128;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r3) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        com.appsflyer.internal.AFd1lSDK.equals = (com.appsflyer.internal.AFd1lSDK.copydefault + 89) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r3 = r3.equals(r2.component2.AFAdRevenueData().n_().versionName);
        com.appsflyer.internal.AFd1lSDK.copydefault = (com.appsflyer.internal.AFd1lSDK.equals + 83) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean getMonetizationNetwork(String str) {
        int i10 = equals + 47;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 2 / 0;
        }
    }

    private synchronized void getRevenue(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    copydefault = (equals + 65) % 128;
                    this.getMediationNetwork.put("app_id", str);
                    equals = (copydefault + 37) % 128;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            int i10 = equals + 19;
            copydefault = i10 % 128;
            if (i10 % 2 != 0) {
                this.getMediationNetwork.put("app_version", str2);
            } else {
                this.getMediationNetwork.put("app_version", str2);
                throw null;
            }
        }
        if (str3 != null) {
            equals = (copydefault + 105) % 128;
            if (str3.length() > 0) {
                int i11 = equals + 123;
                copydefault = i11 % 128;
                if (i11 % 2 != 0) {
                    this.getMediationNetwork.put(AppsFlyerProperties.CHANNEL, str3);
                } else {
                    this.getMediationNetwork.put(AppsFlyerProperties.CHANNEL, str3);
                    throw null;
                }
            }
        }
        if (str4 != null && str4.length() > 0) {
            this.getMediationNetwork.put("preInstall", str4);
        }
        copydefault = (equals + 57) % 128;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        float floatValue = ((Number) objArr[1]).floatValue();
        double d10 = floatValue;
        if (d10 >= 1.0d) {
            int i10 = copydefault + 109;
            equals = i10 % 128;
            if (i10 % 2 == 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        if (d10 <= 0.0d) {
            return Boolean.FALSE;
        }
        if (aFd1lSDK.component2() <= floatValue) {
            int i11 = equals + 47;
            copydefault = i11 % 128;
            return i11 % 2 == 0 ? Boolean.FALSE : Boolean.TRUE;
        }
        int i12 = equals + 71;
        copydefault = i12 % 128;
        if (i12 % 2 != 0) {
            return Boolean.FALSE;
        }
        int i13 = 5 / 0;
        return Boolean.FALSE;
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String... strArr) {
        String obj;
        try {
            if (equals() && this.getMonetizationNetwork < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" _/AppsFlyer_6.17.5 [");
                        sb2.append(str);
                        sb2.append("] ");
                        sb2.append(str2);
                        sb2.append(" ");
                        sb2.append(join);
                        obj = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(currentTimeMillis);
                        sb3.append(" ");
                        sb3.append(Thread.currentThread().getId());
                        sb3.append(" ");
                        sb3.append(str2);
                        sb3.append("/AppsFlyer_6.17.5 ");
                        sb3.append(join);
                        obj = sb3.toString();
                    }
                    int length = this.getMonetizationNetwork + (obj.length() << 1);
                    int i10 = getCurrencyIso4217Code;
                    boolean z10 = false;
                    if (length > i10) {
                        copydefault = (equals + 55) % 128;
                        obj = obj.substring(0, (i10 - this.getMonetizationNetwork) / 2);
                        z10 = true;
                    }
                    this.AFAdRevenueData.add(obj);
                    this.getMonetizationNetwork += obj.length() << 1;
                    if (z10) {
                        int i11 = equals + 113;
                        copydefault = i11 % 128;
                        if (i11 % 2 == 0) {
                            this.AFAdRevenueData.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                            this.getMonetizationNetwork *= 26120;
                        } else {
                            this.AFAdRevenueData.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                            this.getMonetizationNetwork += 138;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        } finally {
        }
    }

    private static AFi1xSDK getMonetizationNetwork(AFi1vSDK aFi1vSDK) {
        int i10 = copydefault + 83;
        int i11 = i10 % 128;
        equals = i11;
        if (i10 % 2 != 0) {
            int i12 = 4 / 0;
            if (aFi1vSDK == null) {
                return null;
            }
        } else if (aFi1vSDK == null) {
            return null;
        }
        AFi1zSDK aFi1zSDK = aFi1vSDK.getMonetizationNetwork;
        if (aFi1zSDK == null) {
            return null;
        }
        copydefault = (i11 + 33) % 128;
        return aFi1zSDK.getMediationNetwork;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        String str = (String) objArr[0];
        int i10 = equals + 87;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            if (!AFk1wSDK.getCurrencyIso4217Code(str)) {
                new AFd1pSDK();
                return Boolean.valueOf(AFd1pSDK.getCurrencyIso4217Code(component4(), str));
            }
            int i11 = equals + 123;
            copydefault = i11 % 128;
            return Boolean.valueOf(i11 % 2 != 0);
        }
        AFk1wSDK.getCurrencyIso4217Code(str);
        throw null;
    }

    private boolean AFAdRevenueData(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        return ((Boolean) AFAdRevenueData(new Object[]{this, aFi1xSDK, aFi1xSDK2}, 322554097, -322554095, System.identityHashCode(this))).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r0[r2] = r4[r2].toString();
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r0[r2] = r4[r2].toString();
        r2 = r2 + 43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0019, code lost:
    
        return new java.lang.String[]{r3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0013, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r2 = 1;
        r0 = new java.lang.String[r4.length + 1];
        r0[0] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r2 >= r4.length) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r3 = com.appsflyer.internal.AFd1lSDK.copydefault + 61;
        com.appsflyer.internal.AFd1lSDK.equals = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if ((r3 % 2) == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String[] getCurrencyIso4217Code(String str, StackTraceElement[] stackTraceElementArr) {
        int i10 = copydefault + 105;
        equals = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 86 / 0;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        copydefault = (equals + 117) % 128;
        boolean mediationNetwork = aFd1lSDK.component2.component4().getMediationNetwork("participantInProxy", false);
        int i10 = copydefault + 37;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            return Boolean.valueOf(mediationNetwork);
        }
        throw null;
    }

    private static boolean getCurrencyIso4217Code(String str) {
        return ((Boolean) AFAdRevenueData(new Object[]{str}, -1244422585, 1244422588, (int) System.currentTimeMillis())).booleanValue();
    }
}
