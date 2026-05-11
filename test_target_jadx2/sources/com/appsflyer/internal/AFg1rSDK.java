package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.AFg1uSDK;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.o;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFg1rSDK implements AFg1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: e, reason: collision with root package name */
    private static int f20134e = 1;
    private static int unregisterClient;
    private final String AFAdRevenueData;
    private final Lazy AFKeystoreWrapper;
    private final AFh1xSDK areAllFieldsValid;
    private final AFc1qSDK component1;
    private final AFg1vSDK component2;
    private final AFi1pSDK component3;
    private final AFc1oSDK component4;
    private final AFc1hSDK copy;
    private final AFg1zSDK copydefault;
    private final Lazy equals;
    private final Context getCurrencyIso4217Code;
    private final AFi1kSDK getMediationNetwork;
    private final AFg1uSDK getMonetizationNetwork;
    private final AFj1lSDK getRevenue;
    private final AFf1eSDK hashCode;
    private final AFc1eSDK toString;
    private static char[] AFInAppEventParameterName = {35909, 35928, 35921, 35926, 35927, 35903, 35904, 35924, 35933, 35910, 35931, 35879, 35908, 35905, 35911};
    private static int registerClient = 1912311267;
    private static boolean AFLogger = true;
    private static boolean AFInAppEventType = true;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/text/SimpleDateFormat;", "AFAdRevenueData", "()Ljava/text/SimpleDateFormat;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFg1rSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends xc.m implements Function0<SimpleDateFormat> {
        public static final AnonymousClass4 getMonetizationNetwork = new AnonymousClass4();

        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/AppsFlyerProperties;", "getCurrencyIso4217Code", "()Lcom/appsflyer/AppsFlyerProperties;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFg1rSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends xc.m implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass5 getMediationNetwork = new AnonymousClass5();

        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    public AFg1rSDK(String str, Context context, AFi1kSDK aFi1kSDK, AFg1uSDK aFg1uSDK, AFj1lSDK aFj1lSDK, AFg1vSDK aFg1vSDK, AFh1xSDK aFh1xSDK, AFc1qSDK aFc1qSDK, AFc1oSDK aFc1oSDK, AFi1pSDK aFi1pSDK, AFf1eSDK aFf1eSDK, AFc1hSDK aFc1hSDK, AFg1zSDK aFg1zSDK, AFc1eSDK aFc1eSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        Intrinsics.checkNotNullParameter(aFg1uSDK, "");
        Intrinsics.checkNotNullParameter(aFj1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFi1pSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFg1zSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = context;
        this.getMediationNetwork = aFi1kSDK;
        this.getMonetizationNetwork = aFg1uSDK;
        this.getRevenue = aFj1lSDK;
        this.component2 = aFg1vSDK;
        this.areAllFieldsValid = aFh1xSDK;
        this.component1 = aFc1qSDK;
        this.component4 = aFc1oSDK;
        this.component3 = aFi1pSDK;
        this.hashCode = aFf1eSDK;
        this.copy = aFc1hSDK;
        this.copydefault = aFg1zSDK;
        this.toString = aFc1eSDK;
        this.equals = lc.i.a(AnonymousClass5.getMediationNetwork);
        this.AFKeystoreWrapper = lc.i.a(AnonymousClass4.getMonetizationNetwork);
    }

    private String AFAdRevenueData() {
        int i10 = unregisterClient + 69;
        f20134e = i10 % 128;
        if (i10 % 2 == 0) {
            AFj1kSDK.N_(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager(), this.getCurrencyIso4217Code.getApplicationContext().getPackageName());
            throw null;
        }
        String N_ = AFj1kSDK.N_(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager(), this.getCurrencyIso4217Code.getApplicationContext().getPackageName());
        unregisterClient = (f20134e + 55) % 128;
        return N_;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFInAppEventParameterName(Map<String, Object> map) {
        boolean z10;
        int i10;
        f20134e = (unregisterClient + 113) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
        if (string != null) {
            unregisterClient = (f20134e + 59) % 128;
            if (string.length() != 0) {
                z10 = false;
                if (!z10) {
                    map.put(AppsFlyerProperties.EXTENSION, string);
                }
                i10 = f20134e + 19;
                unregisterClient = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 35 / 0;
                    return;
                }
                return;
            }
        }
        z10 = true;
        if (!z10) {
        }
        i10 = f20134e + 19;
        unregisterClient = i10 % 128;
        if (i10 % 2 == 0) {
        }
    }

    private void AFInAppEventType(Map<String, Object> map) {
        unregisterClient = (f20134e + 71) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.copydefault.AFAdRevenueData());
        f20134e = (unregisterClient + 111) % 128;
    }

    private static void AFKeystoreWrapper(Map<String, Object> map) {
        getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
    }

    private static void AFLogger(Map<String, Object> map) {
        getRevenue(new Object[]{map}, -1520031212, 1520031215, (int) System.currentTimeMillis());
    }

    private static void a(String str, int[] iArr, String str2, int i10, Object[] objArr) {
        char[] cArr;
        char[] cArr2 = str2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            $11 = ($10 + 103) % 128;
            cArr2 = charArray;
        }
        char[] cArr3 = cArr2;
        byte[] bArr = str;
        if (str != null) {
            $11 = ($10 + 67) % 128;
            byte[] bytes = str.getBytes("ISO-8859-1");
            $10 = ($11 + 25) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr4 = AFInAppEventParameterName;
        if (cArr4 != null) {
            $10 = ($11 + 111) % 128;
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                int i12 = $10 + 117;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr5[i11] = (char) (cArr4[i11] - 1825820251896122634L);
                } else {
                    cArr5[i11] = (char) (cArr4[i11] ^ 1825820251896122634L);
                    i11++;
                }
            }
            cArr4 = cArr5;
        }
        int i13 = (int) (1825820251896122634L ^ registerClient);
        if (AFInAppEventType) {
            int i14 = $11 + 25;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                int length2 = bArr2.length;
                aFk1oSDK.getMonetizationNetwork = length2;
                cArr = new char[length2];
                aFk1oSDK.AFAdRevenueData = 1;
            } else {
                int length3 = bArr2.length;
                aFk1oSDK.getMonetizationNetwork = length3;
                cArr = new char[length3];
                aFk1oSDK.AFAdRevenueData = 0;
            }
            while (true) {
                int i15 = aFk1oSDK.AFAdRevenueData;
                int i16 = aFk1oSDK.getMonetizationNetwork;
                if (i15 >= i16) {
                    objArr[0] = new String(cArr);
                    return;
                } else {
                    cArr[i15] = (char) (cArr4[bArr2[(i16 - 1) - i15] + i10] - i13);
                    aFk1oSDK.AFAdRevenueData = i15 + 1;
                    $11 = ($10 + 17) % 128;
                }
            }
        } else if (AFLogger) {
            int i17 = $11 + 23;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            int length4 = cArr3.length;
            aFk1oSDK.getMonetizationNetwork = length4;
            char[] cArr6 = new char[length4];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i19 = aFk1oSDK.AFAdRevenueData;
                int i20 = aFk1oSDK.getMonetizationNetwork;
                if (i19 >= i20) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i19] = (char) (cArr4[cArr3[(i20 - 1) - i19] - i10] - i13);
                    aFk1oSDK.AFAdRevenueData = i19 + 1;
                }
            }
        } else {
            int length5 = iArr.length;
            aFk1oSDK.getMonetizationNetwork = length5;
            char[] cArr7 = new char[length5];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i21 = aFk1oSDK.AFAdRevenueData;
                int i22 = aFk1oSDK.getMonetizationNetwork;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i21] = (char) (cArr4[iArr[(i22 - 1) - i21] - i10] - i13);
                    aFk1oSDK.AFAdRevenueData = i21 + 1;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        r0 = getMonetizationNetwork("AF_STORE");
        com.appsflyer.internal.AFg1rSDK.f20134e = (com.appsflyer.internal.AFg1rSDK.unregisterClient + 31) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String areAllFieldsValid() {
        String string;
        int i10 = unregisterClient + 109;
        f20134e = i10 % 128;
        if (i10 % 2 == 0) {
            string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            int i11 = 81 / 0;
        } else {
            string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
        }
        unregisterClient = (f20134e + 111) % 128;
        return string;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        int i10 = unregisterClient + 83;
        f20134e = i10 % 128;
        int i11 = i10 % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) aFg1rSDK.equals.getValue();
        if (i11 != 0) {
            return appsFlyerProperties;
        }
        throw null;
    }

    private static String component2() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
        int i10 = f20134e + 113;
        unregisterClient = i10 % 128;
        if (i10 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private void component3(Map<String, Object> map) {
        int i10 = f20134e + 99;
        unregisterClient = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            int i11 = f20134e + 75;
            unregisterClient = i11 % 128;
            if (i11 % 2 == 0) {
                map.put("onelink_ver", string2);
            } else {
                map.put("onelink_ver", string2);
                int i12 = 0 / 0;
            }
        }
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        try {
            long longValue = ((Long) getRevenue(new Object[]{aFg1rSDK}, 1297709710, -1297709700, System.identityHashCode(aFg1rSDK))).longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(longValue)));
            int i10 = unregisterClient + 109;
            f20134e = i10 % 128;
            if (i10 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e10);
            return null;
        }
    }

    private final void copy(Map<String, Object> map) {
        f20134e = (unregisterClient + 59) % 128;
        UiModeManager uiModeManager = (UiModeManager) this.getCurrencyIso4217Code.getSystemService(UiModeManager.class);
        if (uiModeManager != null) {
            int i10 = unregisterClient + 27;
            f20134e = i10 % 128;
            if (i10 % 2 == 0) {
                if (uiModeManager.getCurrentModeType() != 2) {
                    return;
                }
            } else if (uiModeManager.getCurrentModeType() != 4) {
                return;
            }
            int i11 = unregisterClient + 65;
            f20134e = i11 % 128;
            if (i11 % 2 != 0) {
                map.put("tv", Boolean.TRUE);
            } else {
                map.put("tv", Boolean.TRUE);
                throw null;
            }
        }
    }

    private static List<AFe1pSDK> copydefault() {
        unregisterClient = (f20134e + 47) % 128;
        List<AFe1pSDK> m10 = CollectionsKt.m(AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.ADREVENUE);
        int i10 = f20134e + 109;
        unregisterClient = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 56 / 0;
        }
        return m10;
    }

    private void d(Map<String, Object> map) {
        String str;
        int i10 = unregisterClient + 119;
        f20134e = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (!((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, false)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            if (!((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                return;
            }
        }
        try {
            this.getCurrencyIso4217Code.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
            str = this.component4.AFAdRevenueData(this.getCurrencyIso4217Code);
            unregisterClient = (f20134e + 23) % 128;
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            unregisterClient = (f20134e + 123) % 128;
            map.put("fb", str);
        }
    }

    private void e(Map<String, Object> map) {
        unregisterClient = (f20134e + 5) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        boolean monetizationNetwork = AFg1sSDK.getMonetizationNetwork(this.getCurrencyIso4217Code);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + monetizationNetwork);
        if (!monetizationNetwork) {
            map.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1sSDK.AFAdRevenueData(this.component1)));
        unregisterClient = (f20134e + 45) % 128;
    }

    private void equals(Map<String, Object> map) {
        int i10 = f20134e + 107;
        unregisterClient = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            int i11 = 75 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getCurrencyIso4217Code.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        }
        f20134e = (unregisterClient + 89) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r9.component4.n_().versionCode > r9.component1.getRevenue("versionCode", 0)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getMediationNetwork(Map<String, Object> map, int i10) {
        int i11 = f20134e + 1;
        unregisterClient = i11 % 128;
        try {
            if (i11 % 2 != 0) {
                if (this.component4.n_().versionCode > this.component1.getRevenue("versionCode", 0)) {
                    int i12 = f20134e + 103;
                    unregisterClient = i12 % 128;
                    if (i12 % 2 != 0) {
                        this.component1.getMediationNetwork("versionCode", this.component4.n_().versionCode);
                        int i13 = 78 / 0;
                    } else {
                        this.component1.getMediationNetwork("versionCode", this.component4.n_().versionCode);
                    }
                }
                map.put("app_version_code", String.valueOf(this.component4.n_().versionCode));
                map.put("app_version_name", this.component4.n_().versionName);
                map.put("targetSDKver", Integer.valueOf(this.component4.getCurrencyIso4217Code.getMonetizationNetwork.getApplicationInfo().targetSdkVersion));
                map.put("date1", getRevenue().format(new Date(((Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this))).longValue())));
                map.put("date2", getRevenue().format(new Date(this.component4.n_().lastUpdateTime)));
                Object[] objArr = new Object[1];
                a("\u008d\u0085\u0087\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                String intern = ((String) objArr[0]).intern();
                SimpleDateFormat revenue = getRevenue();
                Intrinsics.checkNotNullExpressionValue(revenue, "");
                map.put(intern, getMediationNetwork(revenue, i10));
                return;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
        AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object getRevenue(Object[] objArr, int i10, int i11, int i12) {
        String AFAdRevenueData;
        AFb1jSDK mediationNetwork;
        int i13 = ~i12;
        int i14 = (i10 * 522) + (i11 * (-520)) + (((~(i13 | i11)) | i10) * (-1042)) + ((i11 | i12) * 521);
        int i15 = ~i10;
        int i16 = i14 + (((~(i10 | i13 | i11)) | (~(i12 | i15)) | (~((~i11) | i15))) * 521);
        boolean z10 = true;
        switch (i16) {
            case 1:
                return getMediationNetwork(objArr);
            case 2:
                return getMonetizationNetwork(objArr);
            case 3:
                return getRevenue(objArr);
            case 4:
                AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
                Map map = (Map) objArr[1];
                Intrinsics.checkNotNullParameter(map, "");
                AFh1xSDK aFh1xSDK = aFg1rSDK.areAllFieldsValid;
                HashMap hashMap = new HashMap(aFh1xSDK.getRevenue);
                aFh1xSDK.getRevenue.clear();
                aFh1xSDK.getMonetizationNetwork.AFAdRevenueData("gcd");
                Intrinsics.checkNotNullExpressionValue(hashMap, "");
                if (hashMap.isEmpty()) {
                    z10 = false;
                } else {
                    f20134e = (unregisterClient + 39) % 128;
                }
                if (!z10) {
                    return null;
                }
                f20134e = (unregisterClient + 61) % 128;
                Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork((Map<String, Object>) map);
                Intrinsics.checkNotNullExpressionValue(mediationNetwork2, "");
                mediationNetwork2.put("gcd", hashMap);
                return null;
            case 5:
                AFg1rSDK aFg1rSDK2 = (AFg1rSDK) objArr[0];
                Map map2 = (Map) objArr[1];
                String str = (String) objArr[2];
                Intrinsics.checkNotNullParameter(map2, "");
                if (((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK2}, -854454525, 854454532, System.identityHashCode(aFg1rSDK2))).getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
                    map2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                    return null;
                }
                String monetizationNetwork = aFg1rSDK2.hashCode.getMonetizationNetwork(aFg1rSDK2.component1);
                if (monetizationNetwork != null) {
                    f20134e = (unregisterClient + 103) % 128;
                    if (monetizationNetwork.length() != 0) {
                        map2.put("imei", monetizationNetwork);
                        AFAdRevenueData = aFg1rSDK2.AFAdRevenueData(str);
                        if (AFAdRevenueData == null) {
                            aFg1rSDK2.component1.getRevenue("androidIdCached", AFAdRevenueData);
                            map2.put("android_id", AFAdRevenueData);
                        } else {
                            AFLogger.afInfoLog("Android ID was not collected.");
                        }
                        mediationNetwork = AFb1lSDK.getMediationNetwork(aFg1rSDK2.getCurrencyIso4217Code);
                        if (mediationNetwork != null) {
                            return null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Boolean bool = mediationNetwork.getMonetizationNetwork;
                        Intrinsics.checkNotNullExpressionValue(bool, "");
                        linkedHashMap.put("isManual", bool);
                        String str2 = mediationNetwork.getRevenue;
                        Intrinsics.checkNotNullExpressionValue(str2, "");
                        linkedHashMap.put("val", str2);
                        Boolean bool2 = mediationNetwork.getCurrencyIso4217Code;
                        if (bool2 != null) {
                            unregisterClient = (f20134e + 93) % 128;
                            linkedHashMap.put("isLat", bool2);
                            unregisterClient = (f20134e + 79) % 128;
                        }
                        map2.put("oaid", linkedHashMap);
                        return null;
                    }
                }
                f20134e = (unregisterClient + 95) % 128;
                AFAdRevenueData = aFg1rSDK2.AFAdRevenueData(str);
                if (AFAdRevenueData == null) {
                }
                mediationNetwork = AFb1lSDK.getMediationNetwork(aFg1rSDK2.getCurrencyIso4217Code);
                if (mediationNetwork != null) {
                }
            case 6:
                return AFAdRevenueData(objArr);
            case 7:
                return component1(objArr);
            case 8:
                return component4(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                AFg1rSDK aFg1rSDK3 = (AFg1rSDK) objArr[0];
                f20134e = (unregisterClient + 41) % 128;
                Long valueOf = Long.valueOf(aFg1rSDK3.component4.n_().firstInstallTime);
                f20134e = (unregisterClient + 73) % 128;
                return valueOf;
            case 11:
                AFg1rSDK aFg1rSDK4 = (AFg1rSDK) objArr[0];
                AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
                f20134e = (unregisterClient + 109) % 128;
                Intrinsics.checkNotNullParameter(aFh1mSDK, "");
                Map<String, Object> map3 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map3, "");
                getRevenue(new Object[]{aFg1rSDK4, map3}, -539509618, 539509626, System.identityHashCode(aFg1rSDK4));
                Map<String, Object> map4 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map4, "");
                aFg1rSDK4.getMediationNetwork(map4, aFh1mSDK.component4);
                Map<String, Object> map5 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map5, "");
                int i17 = aFh1mSDK.component4;
                getRevenue(new Object[]{aFg1rSDK4, map5, Integer.valueOf(i17)}, 1731268052, -1731268046, i17);
                Map<String, Object> map6 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map6, "");
                aFg1rSDK4.registerClient(map6);
                Map<String, Object> map7 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map7, "");
                aFg1rSDK4.d(map7);
                Map<String, Object> map8 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map8, "");
                AFe1pSDK AFAdRevenueData2 = aFh1mSDK.AFAdRevenueData();
                Intrinsics.checkNotNullExpressionValue(AFAdRevenueData2, "");
                aFg1rSDK4.getMediationNetwork(map8, AFAdRevenueData2);
                f20134e = (unregisterClient + 67) % 128;
                return null;
            case 12:
                AFg1rSDK aFg1rSDK5 = (AFg1rSDK) objArr[0];
                Map map9 = (Map) objArr[1];
                unregisterClient = (f20134e + 49) % 128;
                AFg1uSDK.AFa1zSDK currencyIso4217Code = aFg1rSDK5.getMonetizationNetwork.getCurrencyIso4217Code(aFg1rSDK5.getCurrencyIso4217Code);
                float f10 = currencyIso4217Code.getMonetizationNetwork;
                String str3 = currencyIso4217Code.AFAdRevenueData;
                map9.put("btl", String.valueOf(f10));
                if (str3 == null) {
                    return null;
                }
                map9.put("btch", str3);
                unregisterClient = (f20134e + 73) % 128;
                return null;
            default:
                return getCurrencyIso4217Code(objArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r0 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        com.appsflyer.internal.AFg1rSDK.f20134e = (com.appsflyer.internal.AFg1rSDK.unregisterClient + 49) % 128;
        r5.put("prev_session_dur", java.lang.Long.valueOf(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void hashCode(Map<String, Object> map) {
        long j10;
        int i10 = f20134e + 71;
        unregisterClient = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            j10 = this.areAllFieldsValid.copydefault;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            j10 = this.areAllFieldsValid.copydefault;
        }
        f20134e = (unregisterClient + 101) % 128;
    }

    private void i(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component1.getMonetizationNetwork("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.component1.getMediationNetwork("is_stop_tracking_used", false)));
            f20134e = (unregisterClient + 33) % 128;
        }
        unregisterClient = (f20134e + 3) % 128;
    }

    private void registerClient(Map<String, Object> map) {
        int i10 = f20134e + 91;
        unregisterClient = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(this.component4.getMonetizationNetwork(this.getCurrencyIso4217Code)));
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(this.component4.getMonetizationNetwork(this.getCurrencyIso4217Code)));
        unregisterClient = (f20134e + 37) % 128;
    }

    private final void toString(Map<String, Object> map) {
        int i10 = unregisterClient + 89;
        f20134e = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 38 / 0;
            if (!AFg1iSDK.getMonetizationNetwork(this.getCurrencyIso4217Code)) {
                return;
            }
        } else if (!AFg1iSDK.getMonetizationNetwork(this.getCurrencyIso4217Code)) {
            return;
        }
        int i12 = unregisterClient + 25;
        f20134e = i12 % 128;
        if (i12 % 2 == 0) {
            map.put("inst_app", Boolean.TRUE);
            throw null;
        }
        map.put("inst_app", Boolean.TRUE);
        f20134e = (unregisterClient + 91) % 128;
    }

    private void unregisterClient(Map<String, Object> map) {
        int i10 = unregisterClient + 105;
        f20134e = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFb1lSDK.l_(this.getCurrencyIso4217Code.getContentResolver());
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        AFb1jSDK l_ = AFb1lSDK.l_(this.getCurrencyIso4217Code.getContentResolver());
        if (l_ == null) {
            unregisterClient = (f20134e + 121) % 128;
            return;
        }
        int i11 = unregisterClient + 49;
        f20134e = i11 % 128;
        if (i11 % 2 != 0) {
            map.put("amazon_aid", l_.getRevenue);
            map.put("amazon_aid_limit", String.valueOf(l_.getCurrencyIso4217Code));
        } else {
            map.put("amazon_aid", l_.getRevenue);
            map.put("amazon_aid_limit", String.valueOf(l_.getCurrencyIso4217Code));
            int i12 = 37 / 0;
        }
    }

    private void w(Map<String, Object> map) {
        int i10 = unregisterClient + 113;
        f20134e = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.hashCode.getMediationNetwork();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String mediationNetwork = this.hashCode.getMediationNetwork();
        if (mediationNetwork == null || mediationNetwork.length() == 0) {
            return;
        }
        f20134e = (unregisterClient + 109) % 128;
        map.put("appsflyerKey", mediationNetwork);
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        f20134e = (unregisterClient + 103) % 128;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        AFAdRevenueData(map, aFh1mSDK.getRevenue());
        areAllFieldsValid(map);
        getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
        getRevenue(map);
        getRevenue(new Object[]{this, map, this.toString.getCurrencyIso4217Code}, 274047423, -274047418, System.identityHashCode(this));
        unregisterClient(map);
        map.put("cell", kotlin.collections.G.k(lc.t.a("mcc", Integer.valueOf(this.getCurrencyIso4217Code.getResources().getConfiguration().mcc)), lc.t.a("mnc", Integer.valueOf(this.getCurrencyIso4217Code.getResources().getConfiguration().mnc))));
        map.put("sig", AFAdRevenueData());
        map.put("last_boot_time", Long.valueOf(component1()));
        map.put("disk", component2());
        unregisterClient = (f20134e + 73) % 128;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMonetizationNetwork(Map<String, Object> map) {
        Object obj;
        unregisterClient = (f20134e + 13) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            int i10 = unregisterClient + 109;
            f20134e = i10 % 128;
            if (i10 % 2 == 0) {
                map.put(AppsFlyerProperties.APP_ID, string);
                int i11 = 21 / 0;
            } else {
                map.put(AppsFlyerProperties.APP_ID, string);
            }
        }
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            int i12 = f20134e + 93;
            unregisterClient = i12 % 128;
            if (i12 % 2 == 0 ? string2.length() != 3 : string2.length() != 2) {
                StringBuilder sb2 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb2.append(string2);
                sb2.append("' is not a legal value.");
                String obj2 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(obj2, "");
                AFLogger.afWarnLog(obj2);
            }
            map.put("currency", string2);
        }
        Object string3 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            f20134e = (unregisterClient + 113) % 128;
            map.put("isUpdate", string3);
            f20134e = (unregisterClient + 27) % 128;
        }
        Object string4 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        }
        Object string5 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            int i13 = unregisterClient + 85;
            f20134e = i13 % 128;
            if (i13 % 2 == 0) {
                map.put("appUserId", string5);
                int i14 = 2 / 0;
            } else {
                map.put("appUserId", string5);
            }
        }
        Object string6 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            int i15 = unregisterClient + 31;
            f20134e = i15 % 128;
            if (i15 % 2 == 0) {
                map.put("user_emails", string6);
                throw null;
            }
            map.put("user_emails", string6);
        }
        AFb1tSDK aFb1tSDK = this.toString.getRevenue;
        if (aFb1tSDK == null || (obj = aFb1tSDK.AFAdRevenueData) == null) {
            return;
        }
        map.put("sharing_filter", obj);
    }

    private void AFAdRevenueData(Map<String, Object> map, boolean z10) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", getCurrencyIso4217Code("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", getCurrencyIso4217Code("ro.product.cpu.abi2"));
        hashMap.put("arch", getCurrencyIso4217Code("os.arch"));
        hashMap.put("build_display_id", getCurrencyIso4217Code("ro.build.display.id"));
        if (!(!z10)) {
            getRevenue(new Object[]{this, hashMap}, -753773633, 753773645, System.identityHashCode(this));
            if (this.component4.getMediationNetwork.getRevenue("appsFlyerCount", 0) <= 2) {
                int i10 = unregisterClient + 43;
                f20134e = i10 % 128;
                if (i10 % 2 == 0) {
                    hashMap.putAll(this.getRevenue.getMediationNetwork());
                    throw null;
                }
                hashMap.putAll(this.getRevenue.getMediationNetwork());
            }
        }
        hashMap.put("dim", this.component2.getMediationNetwork(this.getCurrencyIso4217Code));
        map.put("deviceData", hashMap);
        unregisterClient = (f20134e + 119) % 128;
    }

    private static long component1() {
        int i10 = f20134e + 101;
        unregisterClient = i10 % 128;
        long currentTimeMillis = i10 % 2 != 0 ? System.currentTimeMillis() & SystemClock.elapsedRealtime() : System.currentTimeMillis() - SystemClock.elapsedRealtime();
        int i11 = f20134e + 31;
        unregisterClient = i11 % 128;
        if (i11 % 2 == 0) {
            return currentTimeMillis;
        }
        throw null;
    }

    private void component1(Map<String, ? extends Object> map) {
        getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        String str;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        int intValue = ((Number) objArr[1]).intValue();
        int i10 = unregisterClient + 123;
        f20134e = i10 % 128;
        if (i10 % 2 != 0) {
            String string = ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).getString("preInstallName");
            if (string != null) {
                return string;
            }
            if (aFg1rSDK.component1.getMonetizationNetwork("preInstallName")) {
                int i11 = f20134e + 71;
                unregisterClient = i11 % 128;
                if (i11 % 2 != 0) {
                    str = aFg1rSDK.component1.getMonetizationNetwork("preInstallName", (String) null);
                    int i12 = 30 / 0;
                } else {
                    str = aFg1rSDK.component1.getMonetizationNetwork("preInstallName", (String) null);
                }
            } else {
                if (intValue <= 1) {
                    unregisterClient = (f20134e + 99) % 128;
                    String equals = aFg1rSDK.equals();
                    if (equals == null) {
                        int i13 = f20134e + 79;
                        unregisterClient = i13 % 128;
                        if (i13 % 2 == 0) {
                            equals = aFg1rSDK.getMonetizationNetwork("AF_PRE_INSTALL_NAME");
                        } else {
                            aFg1rSDK.getMonetizationNetwork("AF_PRE_INSTALL_NAME");
                            throw null;
                        }
                    }
                    string = equals;
                }
                if (string != null) {
                    aFg1rSDK.component1.getRevenue("preInstallName", string);
                }
                str = string;
            }
            if (str != null) {
                unregisterClient = (f20134e + 89) % 128;
                ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).set("preInstallName", str);
            }
            return str;
        }
        ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).getString("preInstallName");
        throw null;
    }

    private final void component2(Map<String, Object> map) {
        int i10 = f20134e + 107;
        unregisterClient = i10 % 128;
        if (i10 % 2 != 0) {
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled();
            throw null;
        }
        if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled()) {
            return;
        }
        map.put("batteryLevel", String.valueOf(this.getMonetizationNetwork.getCurrencyIso4217Code(this.getCurrencyIso4217Code).getMonetizationNetwork));
        f20134e = (unregisterClient + 95) % 128;
    }

    private final boolean copy() {
        int i10 = unregisterClient + 15;
        f20134e = i10 % 128;
        if (i10 % 2 != 0 ? !((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) : !((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, true)) {
            if (!((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                int i11 = (unregisterClient + 33) % 128;
                f20134e = i11;
                int i12 = i11 + 81;
                unregisterClient = i12 % 128;
                if (i12 % 2 == 0) {
                    AFa1ySDK.getRevenue();
                    if (AFa1ySDK.getRevenue(this.getCurrencyIso4217Code)) {
                        return false;
                    }
                } else {
                    AFa1ySDK.getRevenue();
                    AFa1ySDK.getRevenue(this.getCurrencyIso4217Code);
                    throw null;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String component4() {
        String str;
        int i10 = f20134e + 119;
        unregisterClient = i10 % 128;
        int i11 = i10 % 2;
        try {
        } catch (Exception e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
            str = i11;
        }
        if (i11 == 0) {
            String monetizationNetwork = this.component1.getMonetizationNetwork("androidIdCached", (String) null);
            String string = Settings.Secure.getString(this.getCurrencyIso4217Code.getContentResolver(), "android_id");
            str = monetizationNetwork;
            if (string != null) {
                unregisterClient = (f20134e + 29) % 128;
                return string;
            }
            if (str == 0) {
                return null;
            }
            AFLogger.afDebugLog("use cached AndroidId: " + str);
            return str;
        }
        this.component1.getMonetizationNetwork("androidIdCached", (String) null);
        Settings.Secure.getString(this.getCurrencyIso4217Code.getContentResolver(), "android_id");
        throw null;
    }

    private void copydefault(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
    }

    private final String equals() {
        int i10 = unregisterClient + 111;
        f20134e = i10 % 128;
        if (i10 % 2 != 0) {
            File mediationNetwork = getMediationNetwork(getCurrencyIso4217Code("ro.appsflyer.preinstall.path"));
            if (getCurrencyIso4217Code(mediationNetwork)) {
                mediationNetwork = getMediationNetwork(getMonetizationNetwork("AF_PRE_INSTALL_PATH"));
                unregisterClient = (f20134e + HVFrameRecorder.FRAME_DURATION) % 128;
            }
            if (getCurrencyIso4217Code(mediationNetwork)) {
                mediationNetwork = getMediationNetwork("/data/local/tmp/pre_install.appsflyer");
            }
            if (getCurrencyIso4217Code(mediationNetwork)) {
                mediationNetwork = getMediationNetwork("/etc/pre_install.appsflyer");
            }
            if (getCurrencyIso4217Code(mediationNetwork)) {
                return null;
            }
            String packageName = this.getCurrencyIso4217Code.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return getMediationNetwork(mediationNetwork, packageName);
        }
        getCurrencyIso4217Code(getMediationNetwork(getCurrencyIso4217Code("ro.appsflyer.preinstall.path")));
        throw null;
    }

    private boolean component3() {
        unregisterClient = (f20134e + 73) % 128;
        boolean parseBoolean = Boolean.parseBoolean(this.component1.getMonetizationNetwork("sentSuccessfully", (String) null));
        int i10 = f20134e + 13;
        unregisterClient = i10 % 128;
        if (i10 % 2 == 0) {
            return parseBoolean;
        }
        throw null;
    }

    private final String AFAdRevenueData(String str) {
        int i10 = f20134e + 43;
        unregisterClient = i10 % 128;
        boolean z10 = false;
        if (i10 % 2 == 0 ? ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false) : ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, true)) {
            if (str == null || str.length() == 0) {
                f20134e = (unregisterClient + 13) % 128;
                z10 = true;
            }
            if (z10) {
                if (copy()) {
                    int i11 = f20134e + 105;
                    unregisterClient = i11 % 128;
                    if (i11 % 2 == 0) {
                        return component4();
                    }
                    component4();
                    throw null;
                }
                return null;
            }
        }
        if (str != null) {
            return str;
        }
        return null;
    }

    private static void areAllFieldsValid(Map<String, Object> map) {
        f20134e = (unregisterClient + 91) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("\u008f\u0089\u0087\u0083\u008e", null, null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        f20134e = (unregisterClient + 19) % 128;
    }

    private final void component4(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -753773633, 753773645, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final long getCurrencyIso4217Code() {
        f20134e = (unregisterClient + 57) % 128;
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = f20134e + 121;
        unregisterClient = i10 % 128;
        if (i10 % 2 == 0) {
            return currentTimeMillis;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map, int i10, int i11) {
        boolean z10;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i10));
        map.put("iaecounter", String.valueOf(i11));
        if (component3()) {
            unregisterClient = (f20134e + 67) % 128;
            z10 = false;
        } else {
            unregisterClient = (f20134e + 109) % 128;
            z10 = true;
        }
        map.put("isFirstCall", String.valueOf(z10));
    }

    private void AFAdRevenueData(AFh1mSDK aFh1mSDK, String str, String str2, AFb1rSDK aFb1rSDK) {
        f20134e = (unregisterClient + 61) % 128;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        if (aFh1mSDK.AFAdRevenueData() == AFe1pSDK.CONVERSION) {
            Intrinsics.checkNotNullExpressionValue(map, "");
            component2(map);
            copy(map);
            toString(map);
            AFa1vSDK.getMonetizationNetwork(this.copy, this.component4);
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
        component3(map);
        getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
        getMonetizationNetwork(map, str2);
        AFAdRevenueData(map, str);
        hashCode(map);
        if (aFb1rSDK != null) {
            f20134e = (unregisterClient + 31) % 128;
            aFb1rSDK.getCurrencyIso4217Code(map);
            return;
        }
        int i10 = f20134e + 35;
        unregisterClient = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 41 / 0;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        f20134e = (unregisterClient + 69) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        long monetizationNetwork = aFg1rSDK.component1.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        aFg1rSDK.component1.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        map.put("timepassedsincelastlaunch", String.valueOf(monetizationNetwork > 0 ? TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - monetizationNetwork) : -1L));
        int i10 = f20134e + 107;
        unregisterClient = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 45 / 0;
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        AFd1aSDK aFd1aSDK;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        if (!this.component4.component2()) {
            Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            mediationNetwork.put("ad_ids_disabled", Boolean.TRUE);
        } else {
            AdvertisingIdData advertisingIdData = this.component4.getMonetizationNetwork.component3;
            if (advertisingIdData == null) {
                return;
            }
            String str = advertisingIdData.gaidError;
            if (str != null && str.length() != 0) {
                unregisterClient = (f20134e + 121) % 128;
                aFh1mSDK.getMonetizationNetwork("gaidError", advertisingIdData.gaidError);
            }
            String str2 = advertisingIdData.advertisingId;
            if (str2 != null && advertisingIdData.isEnabled != null) {
                aFh1mSDK.getMonetizationNetwork("advertiserId", str2);
                aFh1mSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(advertisingIdData.isEnabled));
                aFh1mSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(advertisingIdData.isGaidWithGps));
            }
        }
        AdvertisingIdData advertisingIdData2 = this.component4.getMonetizationNetwork.component3;
        aFh1mSDK.getMonetizationNetwork("GAID_retry", String.valueOf(advertisingIdData2 != null ? Intrinsics.b(advertisingIdData2.retry, Boolean.TRUE) : false));
        if (!CollectionsKt.m(AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH).contains(aFh1mSDK.AFAdRevenueData()) || (aFd1aSDK = this.toString.component4) == null) {
            return;
        }
        int i10 = unregisterClient + 57;
        f20134e = i10 % 128;
        if (i10 % 2 != 0) {
            Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork2, "");
            mediationNetwork2.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getMediationNetwork));
        } else {
            Map<String, Object> mediationNetwork3 = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork3, "");
            mediationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getMediationNetwork));
            throw null;
        }
    }

    private static String getCurrencyIso4217Code(String str) {
        unregisterClient = (f20134e + 75) % 128;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.e(invoke, "");
            String str2 = (String) invoke;
            f20134e = (unregisterClient + 123) % 128;
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private void getMonetizationNetwork(Map<String, Object> map, boolean z10) {
        f20134e = (unregisterClient + 19) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.AFAdRevenueData);
        if (z10) {
            map.put("platform_extension_v2", this.getMediationNetwork.getCurrencyIso4217Code());
        }
        unregisterClient = (f20134e + 3) % 128;
    }

    private void AFAdRevenueData(Map<String, Object> map, String str) {
        f20134e = (unregisterClient + 7) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            f20134e = (unregisterClient + 89) % 128;
            if (str.length() != 0) {
                map.put("referrer", str);
            }
        }
        Object monetizationNetwork = this.component1.getMonetizationNetwork("extraReferrers", (String) null);
        if (monetizationNetwork != null) {
            map.put("extraReferrers", monetizationNetwork);
        }
        String referrer = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getReferrer(this.component1);
        if (referrer != null && referrer.length() != 0) {
            unregisterClient = (f20134e + 27) % 128;
            if (map.get("referrer") == null) {
                map.put("referrer", referrer);
                return;
            }
            return;
        }
        f20134e = (unregisterClient + 111) % 128;
    }

    private static boolean getCurrencyIso4217Code(File file) {
        int i10 = f20134e;
        unregisterClient = (i10 + 33) % 128;
        if (file == null) {
            return true;
        }
        unregisterClient = (i10 + 79) % 128;
        if (!file.exists()) {
            return true;
        }
        int i11 = unregisterClient + 59;
        f20134e = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private String getMonetizationNetwork(int i10) {
        String str = null;
        if (this.component1.getMonetizationNetwork("INSTALL_STORE")) {
            unregisterClient = (f20134e + 83) % 128;
            String monetizationNetwork = this.component1.getMonetizationNetwork("INSTALL_STORE", (String) null);
            int i11 = f20134e + 21;
            unregisterClient = i11 % 128;
            if (i11 % 2 == 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        if (i10 <= 1) {
            int i12 = unregisterClient + 103;
            f20134e = i12 % 128;
            if (i12 % 2 != 0) {
                str = areAllFieldsValid();
                this.component1.getRevenue("INSTALL_STORE", str);
                return str;
            }
        }
        unregisterClient = (f20134e + 77) % 128;
        this.component1.getRevenue("INSTALL_STORE", str);
        return str;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 528204691, -528204690, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2.put("phone", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r3 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getMonetizationNetwork(Map<String, Object> map, String str) {
        int i10 = f20134e + 87;
        unregisterClient = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            int i11 = 86 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
        }
        int i12 = f20134e + 61;
        unregisterClient = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 36 / 0;
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        Map map = (Map) objArr[0];
        f20134e = (unregisterClient + 11) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
        } catch (Exception e10) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e10);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e11) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e11);
        }
        try {
            map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            unregisterClient = (f20134e + 85) % 128;
            return null;
        } catch (Exception e12) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e12);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r0 != true) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        boolean z10;
        boolean z11 = false;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int intValue = ((Number) objArr[2]).intValue();
        Intrinsics.checkNotNullParameter(map, "");
        String component3 = aFg1rSDK.component4.component3();
        String AFAdRevenueData = AFAdRevenueData(aFg1rSDK.component1, component3);
        if (AFAdRevenueData == null || Intrinsics.b(AFAdRevenueData, component3)) {
            z10 = false;
        } else {
            unregisterClient = (f20134e + HVFrameRecorder.FRAME_DURATION) % 128;
            z10 = true;
        }
        if (AFAdRevenueData == null && component3 != null) {
            z11 = true;
        }
        if (!z10) {
            int i10 = unregisterClient + 83;
            f20134e = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }
        map.put("af_latestchannel", component3);
        String monetizationNetwork = aFg1rSDK.getMonetizationNetwork(intValue);
        if (monetizationNetwork != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = monetizationNetwork.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String str = (String) getRevenue(new Object[]{aFg1rSDK, Integer.valueOf(intValue)}, -994471321, 994471330, intValue);
        if (str != null) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase2 = str.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_preinstall_name", lowerCase2);
            f20134e = (unregisterClient + 19) % 128;
        }
        String areAllFieldsValid = aFg1rSDK.areAllFieldsValid();
        if (areAllFieldsValid != null) {
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            String lowerCase3 = areAllFieldsValid.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_currentstore", lowerCase3);
        }
        return null;
    }

    private final String getMonetizationNetwork(String str) {
        f20134e = (unregisterClient + 119) % 128;
        String currencyIso4217Code = this.component4.getCurrencyIso4217Code(str);
        f20134e = (unregisterClient + 69) % 128;
        return currencyIso4217Code;
    }

    private final SimpleDateFormat getRevenue() {
        int i10 = unregisterClient + 71;
        f20134e = i10 % 128;
        if (i10 % 2 != 0) {
            return (SimpleDateFormat) this.AFKeystoreWrapper.getValue();
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFg1nSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        int i10;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put("open_referrer", aFh1mSDK.getMonetizationNetwork);
        String str = aFh1mSDK.copydefault;
        if (str != null) {
            int i11 = unregisterClient + 37;
            f20134e = i11 % 128;
            if (i11 % 2 != 0) {
                if (!StringsKt.Z(str)) {
                    int i12 = unregisterClient + 111;
                    f20134e = i12 % 128;
                    if (i12 % 2 == 0) {
                        map.put("af_web_referrer", aFh1mSDK.copydefault);
                        int i13 = 19 / 0;
                    } else {
                        map.put("af_web_referrer", aFh1mSDK.copydefault);
                    }
                    i10 = unregisterClient + 61;
                    f20134e = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i14 = 77 / 0;
                        return;
                    }
                    return;
                }
            } else {
                StringsKt.Z(str);
                throw null;
            }
        }
        unregisterClient = (f20134e + 23) % 128;
        i10 = unregisterClient + 61;
        f20134e = i10 % 128;
        if (i10 % 2 != 0) {
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getRevenue(AFh1mSDK aFh1mSDK) {
        int i10 = unregisterClient + 75;
        f20134e = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
            if (aFh1mSDK.getRevenue()) {
                unregisterClient = (f20134e + 47) % 128;
                String str = aFh1mSDK.component1;
                AFc1eSDK aFc1eSDK = this.toString;
                AFAdRevenueData(aFh1mSDK, str, aFc1eSDK.getMediationNetwork, aFc1eSDK.AFAdRevenueData);
            } else if (!(aFh1mSDK instanceof AFh1fSDK)) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                String str2 = aFh1mSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                getMediationNetwork(map, str2);
            }
            if (CollectionsKt.m(AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP).contains(aFh1mSDK.AFAdRevenueData())) {
                int i11 = f20134e + 107;
                unregisterClient = i11 % 128;
                if (i11 % 2 != 0) {
                    Intrinsics.checkNotNullExpressionValue(map, "");
                    equals(map);
                    int i12 = 37 / 0;
                } else {
                    Intrinsics.checkNotNullExpressionValue(map, "");
                    equals(map);
                }
            }
            Intrinsics.checkNotNullExpressionValue(map, "");
            w(map);
            getRevenue(new Object[]{map}, -1520031212, 1520031215, (int) System.currentTimeMillis());
            AFInAppEventType(map);
            AFInAppEventParameterName(map);
            AFAdRevenueData(map);
            getMonetizationNetwork(map, aFh1mSDK.getRevenue());
            e(map);
            i(map);
            getMediationNetwork(map, aFh1mSDK);
            map.put("af_events_api", "1");
            return;
        }
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
        aFh1mSDK.getRevenue();
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void AFAdRevenueData(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.component4.getMediationNetwork);
        if (currencyIso4217Code != null) {
            map.put("uid", currencyIso4217Code);
            boolean mediationNetwork = this.component4.getMediationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", false);
            Intrinsics.checkNotNullExpressionValue(Boolean.valueOf(mediationNetwork), "");
            if (!(!mediationNetwork)) {
                f20134e = (unregisterClient + 97) % 128;
                map.put("custom_install_id", Boolean.TRUE);
            }
            int i10 = unregisterClient + 87;
            f20134e = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 63 / 0;
            }
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        Object b10;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        unregisterClient = (f20134e + 91) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String str = aFg1rSDK.toString.getMonetizationNetwork;
        if (str != null) {
            f20134e = (unregisterClient + 107) % 128;
            if (map.get("af_deeplink") != null) {
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    o.a aVar = lc.o.f37128b;
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    b10 = lc.o.b(Unit.f36324a);
                    unregisterClient = (f20134e + 59) % 128;
                } catch (Throwable th) {
                    o.a aVar2 = lc.o.f37128b;
                    b10 = lc.o.b(lc.p.a(th));
                }
                Throwable d10 = lc.o.d(b10);
                if (d10 != null) {
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", d10, false, false, false, false, 120, null);
                } else {
                    unregisterClient = (f20134e + 3) % 128;
                }
                lc.o.a(b10);
            }
        }
        aFg1rSDK.toString.getMonetizationNetwork = null;
        return null;
    }

    private static String AFAdRevenueData(AFc1qSDK aFc1qSDK, String str) {
        int i10 = unregisterClient + 73;
        f20134e = i10 % 128;
        if (i10 % 2 != 0) {
            String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
            if (monetizationNetwork != null) {
                f20134e = (unregisterClient + 39) % 128;
                return monetizationNetwork;
            }
            aFc1qSDK.getRevenue("CACHED_CHANNEL", str);
            return str;
        }
        aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final Long getMonetizationNetwork() {
        return (Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this));
    }

    private void AFAdRevenueData(Map<String, Object> map, int i10) {
        getRevenue(new Object[]{this, map, Integer.valueOf(i10)}, 1731268052, -1731268046, i10);
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        getRevenue(new Object[]{this, aFh1mSDK}, 572486758, -572486747, System.identityHashCode(this));
    }

    private void getMediationNetwork(Map<String, Object> map, String str) {
        unregisterClient = (f20134e + 49) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String monetizationNetwork = this.component1.getMonetizationNetwork("prev_event_name", (String) null);
            if (monetizationNetwork != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.component1.getMonetizationNetwork("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", monetizationNetwork);
                map.put("prev_event", jSONObject);
            }
            this.component1.getRevenue("prev_event_name", str);
            this.component1.AFAdRevenueData("prev_event_timestamp", System.currentTimeMillis());
            int i10 = unregisterClient + 113;
            f20134e = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (Exception e10) {
            AFLogger.afErrorLog("Error while processing previous event.", e10);
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getRevenue(Map<String, Object> map) {
        AFi1rSDK aFi1rSDK;
        Intrinsics.checkNotNullParameter(map, "");
        AFi1qSDK aFi1qSDK = this.component3.getMonetizationNetwork;
        if (aFi1qSDK != null) {
            unregisterClient = (f20134e + 107) % 128;
            aFi1rSDK = aFi1qSDK.getMonetizationNetwork();
        } else {
            aFi1rSDK = null;
        }
        if (aFi1rSDK != null) {
            map.put("network", aFi1rSDK.getCurrencyIso4217Code);
            map.put("ivc", Boolean.valueOf(aFi1rSDK.getMediationNetwork()));
            if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                return;
            }
            int i10 = (f20134e + 65) % 128;
            unregisterClient = i10;
            int i11 = i10 + 99;
            f20134e = i11 % 128;
            if (i11 % 2 != 0) {
                String str = aFi1rSDK.getMonetizationNetwork;
                if (str != null) {
                    map.put("operator", str);
                }
                String str2 = aFi1rSDK.getRevenue;
                if (str2 != null) {
                    map.put("carrier", str2);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    private String getMediationNetwork(SimpleDateFormat simpleDateFormat, int i10) {
        int i11 = f20134e + 7;
        unregisterClient = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            String monetizationNetwork = this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
            if (monetizationNetwork == null) {
                int i12 = unregisterClient;
                f20134e = (i12 + 93) % 128;
                if (i10 <= 1) {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    monetizationNetwork = simpleDateFormat.format(new Date());
                } else {
                    f20134e = (i12 + 41) % 128;
                    monetizationNetwork = BuildConfig.FLAVOR;
                }
                this.component1.getRevenue("appsFlyerFirstInstall", monetizationNetwork);
            }
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "AppsFlyer: first launch date: " + monetizationNetwork, false, 4, null);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return monetizationNetwork;
        }
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        com.appsflyer.internal.AFg1rSDK.unregisterClient = (com.appsflyer.internal.AFg1rSDK.f20134e + 67) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (java.lang.Integer.parseInt(r2) <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        r3 = com.appsflyer.internal.AFg1rSDK.unregisterClient + 109;
        com.appsflyer.internal.AFg1rSDK.f20134e = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if ((r3 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r6.put("reinstallCounter", r2);
        r6.put("originalAppsflyerId", r1);
        r6 = 28 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r6.put("reinstallCounter", r2);
        r6.put("originalAppsflyerId", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        String monetizationNetwork;
        String currencyIso4217Code;
        Map map = (Map) objArr[0];
        int i10 = f20134e + 79;
        unregisterClient = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            monetizationNetwork = AFa1vSDK.getMonetizationNetwork();
            currencyIso4217Code = AFa1vSDK.getCurrencyIso4217Code();
            int i11 = 20 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            monetizationNetwork = AFa1vSDK.getMonetizationNetwork();
            currencyIso4217Code = AFa1vSDK.getCurrencyIso4217Code();
        }
        int i12 = f20134e + 57;
        unregisterClient = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(Map<String, Object> map, AFe1pSDK aFe1pSDK) {
        f20134e = (unregisterClient + 43) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1pSDK, "");
        if (!copydefault().contains(aFe1pSDK)) {
            unregisterClient = (f20134e + 57) % 128;
            return;
        }
        if (this.toString.getMediationNetwork()) {
            map.put("app_set_id", kotlin.collections.G.e(lc.t.a("app_set_id_disabled", Boolean.TRUE)));
            if (this.toString.copydefault != null) {
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
                return;
            } else {
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
                return;
            }
        }
        AFb1gSDK aFb1gSDK = this.toString.copydefault;
        if (aFb1gSDK != null) {
            map.put("app_set_id", kotlin.collections.G.k(lc.t.a("scope", Integer.valueOf(aFb1gSDK.getMonetizationNetwork)), lc.t.a("id", aFb1gSDK.getMediationNetwork)));
        }
    }

    private void getRevenue(Map<String, Object> map, String str) {
        getRevenue(new Object[]{this, map, str}, 274047423, -274047418, System.identityHashCode(this));
    }

    private String getRevenue(int i10) {
        return (String) getRevenue(new Object[]{this, Integer.valueOf(i10)}, -994471321, 994471330, i10);
    }

    private static File getMediationNetwork(String str) {
        int i10 = f20134e + 5;
        unregisterClient = i10 % 128;
        try {
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
        if (i10 % 2 == 0) {
            if (str != null && StringsKt.S0(str).toString().length() > 0) {
                File file = new File(StringsKt.S0(str).toString());
                int i11 = f20134e + 55;
                unregisterClient = i11 % 128;
                if (i11 % 2 == 0) {
                    return file;
                }
                throw null;
            }
            return null;
        }
        throw null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x005c -> B:27:0x0084). Please report as a decompilation issue!!! */
    private static String getMediationNetwork(File file, String str) {
        InputStreamReader inputStreamReader;
        try {
            try {
                if (file == null) {
                    int i10 = unregisterClient + 65;
                    f20134e = i10 % 128;
                    if (i10 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                try {
                    Properties properties = new Properties();
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                    try {
                        properties.load(inputStreamReader);
                        AFLogger.afInfoLog("Found PreInstall property!");
                        String property = properties.getProperty(str);
                        try {
                            inputStreamReader.close();
                        } catch (Throwable th) {
                            AFLogger.afErrorLog(th.getMessage(), th);
                        }
                        int i11 = unregisterClient + 55;
                        f20134e = i11 % 128;
                        if (i11 % 2 != 0) {
                            return property;
                        }
                        throw null;
                    } catch (FileNotFoundException unused) {
                        AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        return null;
                    }
                } catch (FileNotFoundException unused2) {
                    inputStreamReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                }
            } catch (Throwable th4) {
                if (inputStreamReader != null) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th5) {
                        AFLogger.afErrorLog(th5.getMessage(), th5);
                    }
                }
                throw th4;
            }
        } catch (Throwable th6) {
            AFLogger.afErrorLog(th6.getMessage(), th6);
        }
    }

    private static void getMediationNetwork(Map<String, Object> map, AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        String str = aFh1mSDK.areAllFieldsValid;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFh1mSDK.getRevenue;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private final void getMediationNetwork(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -539509618, 539509626, System.identityHashCode(this));
    }

    private final AppsFlyerProperties getMediationNetwork() {
        return (AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this));
    }
}
