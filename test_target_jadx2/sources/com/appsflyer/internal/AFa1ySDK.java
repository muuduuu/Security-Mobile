package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFa1ySDK;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFe1oSDK.AnonymousClass1;
import com.appsflyer.internal.AFj1tSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.C2017i;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1ySDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean AFInAppEventParameterName = false;
    private static boolean AFInAppEventType = false;
    private static int AFKeystoreWrapper = 0;
    private static char[] AFLogger = null;
    private static AFa1ySDK areAllFieldsValid = null;
    static AppsFlyerInAppPurchaseValidatorListener getCurrencyIso4217Code = null;
    public static final String getMediationNetwork;
    public static final String getMonetizationNetwork;

    /* renamed from: i, reason: collision with root package name */
    private static int f20121i = 1;
    private static int registerClient;
    Application component2;
    private Map<Long, String> copydefault;
    private AFf1mSDK equals;
    private boolean hashCode;
    private volatile SharedPreferences toString;
    public volatile AppsFlyerConversionListener getRevenue = null;
    private long component3 = -1;
    long AFAdRevenueData = -1;
    private long component4 = TimeUnit.SECONDS.toMillis(5);
    boolean component1 = false;
    private final AFc1bSDK copy = new AFc1bSDK();

    /* renamed from: com.appsflyer.internal.AFa1ySDK$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getCurrencyIso4217Code = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getCurrencyIso4217Code[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        component2();
        getMonetizationNetwork = "366";
        getMediationNetwork = "6.17";
        getCurrencyIso4217Code = null;
        areAllFieldsValid = new AFa1ySDK();
        f20121i = (AFKeystoreWrapper + 87) % 128;
    }

    public AFa1ySDK() {
        getMonetizationNetwork().afInfoLog().getRevenue();
        getMonetizationNetwork().afInfoLog().getMonetizationNetwork();
        AFe1oSDK copydefault = getMonetizationNetwork().copydefault();
        copydefault.getMediationNetwork.add(new AFa1zSDK());
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        String str = (String) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = AFKeystoreWrapper + 37;
        f20121i = i10 % 128;
        if (i10 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, booleanValue);
            return null;
        }
        AppsFlyerProperties.getInstance().set(str, booleanValue);
        throw null;
    }

    private static void c_(Context context, PackageInfo packageInfo) {
        try {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 32768) == 0) {
                return;
            }
            if (Build.VERSION.SDK_INT < 31) {
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    return;
                } else {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                    return;
                }
            }
            if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) == 0) {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                AFKeystoreWrapper = (f20121i + 49) % 128;
                return;
            }
            int i10 = f20121i + 65;
            AFKeystoreWrapper = i10 % 128;
            if (i10 % 2 != 0) {
                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
            } else {
                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while checking BackupRules: ", th);
        }
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        String str = (String) objArr[0];
        try {
            if (!new JSONObject(str).has("pid")) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                int i10 = AFKeystoreWrapper + 113;
                f20121i = i10 % 128;
                if (i10 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            int i11 = f20121i + 97;
            AFKeystoreWrapper = i11 % 128;
            if (i11 % 2 == 0) {
                getMediationNetwork("preInstallName", str);
                return null;
            }
            getMediationNetwork("preInstallName", str);
            throw null;
        } catch (JSONException e10) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e10);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        r4 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 75;
        com.appsflyer.internal.AFa1ySDK.f20121i = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        r1.AFAdRevenueData.put("api_name", r7.toString());
        r1.getRevenue(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        r1.AFAdRevenueData.put("api_name", r7.toString());
        r1.getRevenue(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r1.AFAdRevenueData() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r1.AFAdRevenueData() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object component3(Object[] objArr) {
        AFh1xSDK areAllFieldsValid2;
        AFh1vSDK mediationNetwork;
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        Context context = (Context) objArr[1];
        AFh1tSDK aFh1tSDK = (AFh1tSDK) objArr[2];
        int i10 = AFKeystoreWrapper + 77;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            aFa1ySDK.AFAdRevenueData(context);
            areAllFieldsValid2 = aFa1ySDK.getMonetizationNetwork().areAllFieldsValid();
            mediationNetwork = AFh1vSDK.getMediationNetwork(context);
            int i11 = 14 / 0;
        } else {
            aFa1ySDK.AFAdRevenueData(context);
            areAllFieldsValid2 = aFa1ySDK.getMonetizationNetwork().areAllFieldsValid();
            mediationNetwork = AFh1vSDK.getMediationNetwork(context);
        }
        areAllFieldsValid2.getMonetizationNetwork();
        int i12 = AFKeystoreWrapper + 61;
        f20121i = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 2 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007c, code lost:
    
        com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = (com.appsflyer.internal.AFa1ySDK.f20121i + 123) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        r7 = new org.json.JSONArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r0 = new org.json.JSONObject();
        r7 = new org.json.JSONArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (r7 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (r7 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0066, code lost:
    
        r0 = new org.json.JSONObject(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006f, code lost:
    
        if (r0.has(r12) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
    
        r7 = new org.json.JSONArray((java.lang.String) r0.get(r12));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object component4(Object[] objArr) {
        long currentTimeMillis;
        String monetizationNetwork;
        JSONObject jSONObject;
        JSONArray jSONArray;
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        int i10 = AFKeystoreWrapper + 83;
        f20121i = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
                currentTimeMillis = System.currentTimeMillis();
                monetizationNetwork = aFa1ySDK.getMonetizationNetwork(context).getMonetizationNetwork("extraReferrers", (String) null);
                int i11 = 25 / 0;
            } else {
                AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
                currentTimeMillis = System.currentTimeMillis();
                monetizationNetwork = aFa1ySDK.getMonetizationNetwork(context).getMonetizationNetwork("extraReferrers", (String) null);
            }
            if (jSONArray.length() < 5) {
                AFKeystoreWrapper = (f20121i + 75) % 128;
                jSONArray.put(currentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                f20121i = (AFKeystoreWrapper + 67) % 128;
                AFAdRevenueData(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            aFa1ySDK.getMonetizationNetwork(context).getRevenue("extraReferrers", jSONObject.toString());
            return null;
        } catch (JSONException e10) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e10);
            return null;
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Couldn't save referrer - ");
            sb2.append(str);
            sb2.append(": ");
            AFLogger.afErrorLog(sb2.toString(), th);
            return null;
        }
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        Context context = (Context) objArr[0];
        try {
            List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!asList.contains("android.permission.INTERNET")) {
                int i10 = AFKeystoreWrapper + 73;
                f20121i = i10 % 128;
                if (i10 % 2 == 0) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                    int i11 = 51 / 0;
                } else {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
            }
            if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32) {
                f20121i = (AFKeystoreWrapper + 11) % 128;
                if (!asList.contains("com.google.android.gms.permission.AD_ID")) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                }
            }
            AFKeystoreWrapper = (f20121i + 61) % 128;
            return null;
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while validation permissions. ", e10);
            return null;
        }
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        f20121i = (AFKeystoreWrapper + 121) % 128;
        String currencyIso4217Code = getCurrencyIso4217Code(AppsFlyerProperties.APP_USER_ID);
        int i10 = f20121i + 115;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    public static SharedPreferences d_(Context context) {
        return (SharedPreferences) getRevenue(new Object[]{context}, 1916447333, -1916447320, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void e_(Context context, Intent intent) {
        Uri uri;
        boolean z10;
        f20121i = (AFKeystoreWrapper + 69) % 128;
        AFAdRevenueData(context);
        AFa1mSDK i10 = getMonetizationNetwork().i();
        AFc1qSDK component4 = getMonetizationNetwork().component4();
        if (intent != null) {
            f20121i = (AFKeystoreWrapper + 95) % 128;
            if ("android.intent.action.VIEW".equals(intent.getAction())) {
                uri = intent.getData();
                if (uri != null) {
                    AFKeystoreWrapper = (f20121i + 33) % 128;
                    if (!uri.toString().isEmpty()) {
                        int i11 = f20121i + 27;
                        AFKeystoreWrapper = i11 % 128;
                        if (i11 % 2 == 0) {
                            z10 = true;
                            if (component4.getMediationNetwork("ddl_sent", false) && (!z10)) {
                                i10.getMediationNetwork("No direct deep link", null);
                                return;
                            } else {
                                i10.f_(AFa1jSDK.getMediationNetwork(i10.areAllFieldsValid.afVerboseLog()), intent, context);
                            }
                        }
                    }
                }
                z10 = false;
                if (component4.getMediationNetwork("ddl_sent", false)) {
                    i10.getMediationNetwork("No direct deep link", null);
                    return;
                }
                i10.f_(AFa1jSDK.getMediationNetwork(i10.areAllFieldsValid.afVerboseLog()), intent, context);
            }
        }
        uri = null;
        if (uri != null) {
        }
        z10 = false;
        if (component4.getMediationNetwork("ddl_sent", false)) {
        }
        i10.f_(AFa1jSDK.getMediationNetwork(i10.areAllFieldsValid.afVerboseLog()), intent, context);
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        int i10 = AFKeystoreWrapper + 93;
        f20121i = i10 % 128;
        if (i10 % 2 != 0) {
            aFa1ySDK.getMonetizationNetwork().v().getMonetizationNetwork();
            return null;
        }
        aFa1ySDK.getMonetizationNetwork().v().getMonetizationNetwork();
        throw null;
    }

    private static String getCurrencyIso4217Code(String str) {
        String string;
        int i10 = AFKeystoreWrapper + 59;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            string = AppsFlyerProperties.getInstance().getString(str);
            int i11 = 57 / 0;
        } else {
            string = AppsFlyerProperties.getInstance().getString(str);
        }
        f20121i = (AFKeystoreWrapper + 41) % 128;
        return string;
    }

    private static void getMediationNetwork(String str, String str2) {
        int i10 = f20121i + 19;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
            int i11 = 77 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, str2);
        }
        int i12 = AFKeystoreWrapper + 73;
        f20121i = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i10, int i11, int i12) {
        String concat;
        int i13 = (i10 * (-755)) + (i11 * (-755));
        int i14 = ~((~i10) | (~i11));
        int i15 = i10 | i11;
        boolean z10 = true;
        switch (i13 + (i14 * 1512) + (((~(i15 | i12)) | i14) * (-756)) + ((i15 | (~i12)) * 756)) {
            case 1:
                AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
                String str = (String) objArr[1];
                Map map = (Map) objArr[2];
                f20121i = (AFKeystoreWrapper + 117) % 128;
                AFc1eSDK force = aFa1ySDK.getMonetizationNetwork().force();
                if (force.AFAdRevenueData == null) {
                    force.AFAdRevenueData = new AFb1rSDK();
                }
                AFb1rSDK aFb1rSDK = force.AFAdRevenueData;
                if (str == null || str.isEmpty()) {
                    AFLogger.afWarnLog("Partner ID is missing or `null`");
                    return null;
                }
                if (map == null || map.isEmpty()) {
                    if (aFb1rSDK.getCurrencyIso4217Code.remove(str) == null) {
                        AFKeystoreWrapper = (f20121i + 39) % 128;
                        concat = "Partner data is missing or `null`";
                    } else {
                        concat = "Cleared partner data for ".concat(str);
                    }
                    AFLogger.afWarnLog(concat);
                    return null;
                }
                StringBuilder sb2 = new StringBuilder("Setting partner data for ");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(map);
                AFLogger.afDebugLog(sb2.toString());
                int length = new JSONObject(map).toString().length();
                if (length <= 1000) {
                    aFb1rSDK.getCurrencyIso4217Code.put(str, map);
                    aFb1rSDK.getMonetizationNetwork.remove(str);
                    return null;
                }
                AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                HashMap hashMap = new HashMap();
                hashMap.put(AppConstants.VIDEO_RECORDING_ERROR, "limit exceeded: ".concat(String.valueOf(length)));
                aFb1rSDK.getMonetizationNetwork.put(str, hashMap);
                return null;
            case 2:
                return getMonetizationNetwork(objArr);
            case 3:
                AFa1ySDK aFa1ySDK2 = (AFa1ySDK) objArr[0];
                String[] strArr = (String[]) objArr[1];
                f20121i = (AFKeystoreWrapper + 19) % 128;
                aFa1ySDK2.setSharingFilterForPartners(strArr);
                f20121i = (AFKeystoreWrapper + 21) % 128;
                return null;
            case 4:
                return getCurrencyIso4217Code(objArr);
            case 5:
                AFa1ySDK aFa1ySDK3 = (AFa1ySDK) objArr[0];
                Context context = (Context) objArr[1];
                String str2 = (String) objArr[2];
                f20121i = (AFKeystoreWrapper + 77) % 128;
                aFa1ySDK3.start(context, str2, null);
                AFKeystoreWrapper = (f20121i + 65) % 128;
                return null;
            case 6:
                return getRevenue(objArr);
            case 7:
                return AFAdRevenueData(objArr);
            case 8:
                AFa1ySDK aFa1ySDK4 = (AFa1ySDK) objArr[0];
                String str3 = (String) objArr[1];
                int i16 = f20121i + 91;
                AFKeystoreWrapper = i16 % 128;
                if (i16 % 2 != 0) {
                    AFd1oSDK copy = aFa1ySDK4.getMonetizationNetwork().copy();
                    String[] strArr2 = new String[0];
                    strArr2[1] = str3;
                    copy.getRevenue("setCurrencyCode", strArr2);
                } else {
                    aFa1ySDK4.getMonetizationNetwork().copy().getRevenue("setCurrencyCode", str3);
                }
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str3);
                return null;
            case 9:
                AFa1ySDK aFa1ySDK5 = (AFa1ySDK) objArr[0];
                AFe1aSDK aFe1aSDK = new AFe1aSDK((AFi1hSDK) objArr[1], aFa1ySDK5.getMonetizationNetwork().AFAdRevenueData(), aFa1ySDK5.getMonetizationNetwork(), aFa1ySDK5.getMonetizationNetwork().component3(), aFa1ySDK5.getMonetizationNetwork().AFInAppEventParameterName());
                AFe1oSDK copydefault = aFa1ySDK5.getMonetizationNetwork().copydefault();
                copydefault.getCurrencyIso4217Code.execute(copydefault.new AnonymousClass1(aFe1aSDK));
                f20121i = (AFKeystoreWrapper + 77) % 128;
                return null;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return areAllFieldsValid(objArr);
            case 11:
                return component3(objArr);
            case 12:
                AFa1ySDK aFa1ySDK6 = (AFa1ySDK) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                aFa1ySDK6.AFAdRevenueData((Context) objArr[2]);
                final AFd1zSDK monetizationNetwork = aFa1ySDK6.getMonetizationNetwork();
                monetizationNetwork.AFInAppEventType().getMonetizationNetwork(booleanValue);
                monetizationNetwork.getMonetizationNetwork().submit(new Runnable() { // from class: com.appsflyer.internal.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFa1ySDK.getMediationNetwork(AFd1zSDK.this);
                    }
                });
                if (!booleanValue) {
                    return null;
                }
                AFKeystoreWrapper = (f20121i + 81) % 128;
                monetizationNetwork.component4().AFAdRevenueData("is_stop_tracking_used", true);
                f20121i = (AFKeystoreWrapper + 73) % 128;
                return null;
            case 13:
                return component1(objArr);
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                AFd1zSDK aFd1zSDK = (AFd1zSDK) objArr[0];
                AFKeystoreWrapper = (f20121i + 79) % 128;
                aFd1zSDK.registerClient().getRevenue();
                f20121i = (AFKeystoreWrapper + 121) % 128;
                return null;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return component4(objArr);
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return component2(objArr);
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                AFa1ySDK aFa1ySDK7 = (AFa1ySDK) objArr[0];
                Context context2 = (Context) objArr[1];
                int i17 = AFKeystoreWrapper;
                f20121i = (i17 + 69) % 128;
                if (context2 instanceof Activity) {
                    return new AFh1qSDK((Activity) context2, aFa1ySDK7.getMonetizationNetwork().w());
                }
                f20121i = (i17 + 105) % 128;
                return null;
            case 18:
                AFa1ySDK aFa1ySDK8 = (AFa1ySDK) objArr[0];
                Context context3 = (Context) objArr[1];
                String str4 = (String) objArr[2];
                aFa1ySDK8.AFAdRevenueData(context3);
                AFg1sSDK aFg1sSDK = new AFg1sSDK(context3);
                if (str4 == null || str4.trim().isEmpty()) {
                    AFLogger.INSTANCE.w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
                    return null;
                }
                AFLogger.INSTANCE.i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str4));
                AFf1aSDK revenue = aFg1sSDK.getRevenue();
                if (revenue != null && str4.equals(revenue.getRevenue)) {
                    return null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (revenue != null && currentTimeMillis - revenue.getMonetizationNetwork <= TimeUnit.SECONDS.toMillis(2L)) {
                    z10 = false;
                }
                AFf1aSDK aFf1aSDK = new AFf1aSDK(str4, currentTimeMillis, !z10);
                aFg1sSDK.getCurrencyIso4217Code.getRevenue("afUninstallToken", aFf1aSDK.getRevenue);
                aFg1sSDK.getCurrencyIso4217Code.AFAdRevenueData("afUninstallToken_received_time", aFf1aSDK.getMonetizationNetwork);
                aFg1sSDK.getCurrencyIso4217Code.AFAdRevenueData("afUninstallToken_queued", aFf1aSDK.getMediationNetwork);
                if (!z10) {
                    return null;
                }
                AFd1zSDK monetizationNetwork2 = getRevenue().getMonetizationNetwork();
                AFf1oSDK aFf1oSDK = new AFf1oSDK(str4, monetizationNetwork2);
                AFe1oSDK copydefault2 = monetizationNetwork2.copydefault();
                copydefault2.getCurrencyIso4217Code.execute(copydefault2.new AnonymousClass1(aFf1oSDK));
                return null;
            case 19:
                return copy(objArr);
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                AFa1ySDK aFa1ySDK9 = (AFa1ySDK) objArr[0];
                Context context4 = (Context) objArr[1];
                AFj1gSDK aFj1gSDK = new AFj1gSDK((Intent) objArr[2]);
                if (aFj1gSDK.AFAdRevenueData("appsflyer_preinstall") != null) {
                    AFKeystoreWrapper = (f20121i + 105) % 128;
                    getRevenue(new Object[]{aFj1gSDK.AFAdRevenueData("appsflyer_preinstall")}, -374487647, 374487663, (int) System.currentTimeMillis());
                    AFKeystoreWrapper = (f20121i + 29) % 128;
                }
                AFLogger.afInfoLog("****** onReceive called *******");
                AppsFlyerProperties.getInstance();
                String AFAdRevenueData = aFj1gSDK.AFAdRevenueData("referrer");
                AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(AFAdRevenueData)));
                if (AFAdRevenueData == null) {
                    return null;
                }
                aFa1ySDK9.getMonetizationNetwork(context4).getRevenue("referrer", AFAdRevenueData);
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                appsFlyerProperties.set("AF_REFERRER", AFAdRevenueData);
                appsFlyerProperties.getRevenue = AFAdRevenueData;
                if (!AppsFlyerProperties.getInstance().getMediationNetwork()) {
                    return null;
                }
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                getRevenue(new Object[]{aFa1ySDK9, context4, AFh1tSDK.onReceive}, -268043806, 268043817, System.identityHashCode(aFa1ySDK9));
                aFa1ySDK9.AFAdRevenueData(AFAdRevenueData);
                return null;
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                AFa1ySDK aFa1ySDK10 = (AFa1ySDK) objArr[0];
                int i18 = AFKeystoreWrapper + 9;
                f20121i = i18 % 128;
                if (i18 % 2 == 0) {
                    aFa1ySDK10.setSharingFilterForPartners("all");
                    return null;
                }
                aFa1ySDK10.setSharingFilterForPartners("all");
                return null;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                return copydefault(objArr);
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                return hashCode(objArr);
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                return equals(objArr);
            default:
                return getMediationNetwork(objArr);
        }
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        f20121i = (AFKeystoreWrapper + 93) % 128;
        aFa1ySDK.getMonetizationNetwork().copy().getRevenue("setCollectOaid", String.valueOf(booleanValue));
        getMediationNetwork(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(booleanValue));
        int i10 = f20121i + 89;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void AFAdRevenueData(Context context) {
        int i10 = (f20121i + 27) % 128;
        AFKeystoreWrapper = i10;
        AFc1bSDK aFc1bSDK = this.copy;
        if (context != null) {
            int i11 = i10 + 101;
            f20121i = i11 % 128;
            if (i11 % 2 == 0) {
                AFc1hSDK aFc1hSDK = aFc1bSDK.getCurrencyIso4217Code;
                throw null;
            }
            aFc1bSDK.getCurrencyIso4217Code.getMonetizationNetwork = context.getApplicationContext();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i10 = AFKeystoreWrapper + 83;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            getMonetizationNetwork().i().getRevenue.contains(Arrays.asList(strArr));
            throw null;
        }
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = getMonetizationNetwork().i().getRevenue;
        if (!list.contains(asList)) {
            list.add(asList);
        }
        int i11 = AFKeystoreWrapper + 97;
        f20121i = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z10) {
        int i10 = f20121i + 91;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            AFd1oSDK copy = getMonetizationNetwork().copy();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z10);
            copy.getRevenue("anonymizeUser", strArr);
        } else {
            getMonetizationNetwork().copy().getRevenue("anonymizeUser", String.valueOf(z10));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z10);
        int i11 = f20121i + 35;
        AFKeystoreWrapper = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i10 = AFKeystoreWrapper + 53;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            AFa1mSDK i11 = getMonetizationNetwork().i();
            i11.getMonetizationNetwork = str;
            i11.getMediationNetwork = map;
            int i12 = 47 / 0;
        } else {
            AFa1mSDK i13 = getMonetizationNetwork().i();
            i13.getMonetizationNetwork = str;
            i13.getMediationNetwork = map;
        }
        AFKeystoreWrapper = (f20121i + 113) % 128;
    }

    public final void b_(Context context, Intent intent) {
        getRevenue(new Object[]{this, context, intent}, -1498667330, 1498667350, System.identityHashCode(this));
    }

    final void component1() {
        if (AFe1bSDK.component3()) {
            f20121i = (AFKeystoreWrapper + 107) % 128;
            return;
        }
        AFd1zSDK monetizationNetwork = getMonetizationNetwork();
        AFe1oSDK copydefault = monetizationNetwork.copydefault();
        copydefault.getCurrencyIso4217Code.execute(copydefault.new AnonymousClass1(new AFe1bSDK(monetizationNetwork)));
        f20121i = (AFKeystoreWrapper + 13) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        f20121i = (AFKeystoreWrapper + 87) % 128;
        getMonetizationNetwork().force().areAllFieldsValid = true;
        f20121i = (AFKeystoreWrapper + 111) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z10) {
        f20121i = (AFKeystoreWrapper + 69) % 128;
        getMonetizationNetwork().e().getCurrencyIso4217Code(z10);
        f20121i = (AFKeystoreWrapper + 75) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z10) {
        int i10 = AFKeystoreWrapper + 43;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z10));
            int i11 = 6 / 0;
        } else {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z10));
        }
        AFKeystoreWrapper = (f20121i + 39) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) {
        getMonetizationNetwork().copy().getRevenue("getAppsFlyerUID", new String[0]);
        if (context == null) {
            int i10 = AFKeystoreWrapper + 45;
            f20121i = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 58 / 0;
            }
            return null;
        }
        AFAdRevenueData(context);
        String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(getMonetizationNetwork().AFAdRevenueData().getMediationNetwork);
        int i12 = f20121i + 117;
        AFKeystoreWrapper = i12 % 128;
        if (i12 % 2 == 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        AFKeystoreWrapper = (f20121i + 21) % 128;
        AFAdRevenueData(context);
        String AFAdRevenueData = getMonetizationNetwork().AFAdRevenueData().AFAdRevenueData(context);
        int i10 = f20121i + 19;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 45 / 0;
        }
        return AFAdRevenueData;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i10 = f20121i + 29;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            return getMonetizationNetwork().AFKeystoreWrapper().AFAdRevenueData();
        }
        int i11 = 24 / 0;
        return getMonetizationNetwork().AFKeystoreWrapper().AFAdRevenueData();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i10 = f20121i + 17;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            return getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code();
        }
        getMonetizationNetwork().AFKeystoreWrapper().getCurrencyIso4217Code();
        throw null;
    }

    public final AFd1zSDK getMonetizationNetwork() {
        int i10 = (f20121i + 91) % 128;
        AFKeystoreWrapper = i10;
        AFc1bSDK aFc1bSDK = this.copy;
        f20121i = (i10 + 109) % 128;
        return aFc1bSDK;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            int i10 = AFKeystoreWrapper + 99;
            f20121i = i10 % 128;
            if (i10 % 2 != 0) {
                return string;
            }
            throw null;
        }
        String currencyIso4217Code = getCurrencyIso4217Code(context, "AF_STORE");
        if (currencyIso4217Code != null) {
            f20121i = (AFKeystoreWrapper + 51) % 128;
            return currencyIso4217Code;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i10 = f20121i + 9;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            getMonetizationNetwork().copy().getRevenue("getSdkVersion", new String[1]);
        } else {
            getMonetizationNetwork().copy().getRevenue("getSdkVersion", new String[0]);
        }
        String component4 = AFc1oSDK.component4();
        AFKeystoreWrapper = (f20121i + 87) % 128;
        return component4;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        String str2;
        if (this.hashCode) {
            AFKeystoreWrapper = (f20121i + 123) % 128;
            return this;
        }
        this.hashCode = true;
        getMonetizationNetwork().AFInAppEventType().AFAdRevenueData(str);
        if (context != null) {
            AFAdRevenueData(context);
            Application O_ = AFj1kSDK.O_(context);
            if (O_ == null) {
                return this;
            }
            int i10 = f20121i;
            int i11 = i10 + 77;
            AFKeystoreWrapper = i11 % 128;
            if (i11 % 2 != 0) {
                this.component2 = O_;
                throw null;
            }
            this.component2 = O_;
            AFKeystoreWrapper = (i10 + 91) % 128;
            getMonetizationNetwork().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.c
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1ySDK.this.copy();
                }
            });
            AFe1oSDK copydefault = getMonetizationNetwork().copydefault();
            copydefault.getCurrencyIso4217Code.execute(copydefault.new AnonymousClass1(new AFe1eSDK(getMonetizationNetwork())));
            getMonetizationNetwork().afErrorLogForExcManagerOnly().getMonetizationNetwork(new AFd1xSDK.AFa1vSDK() { // from class: com.appsflyer.internal.d
                @Override // com.appsflyer.internal.AFd1xSDK.AFa1vSDK
                public final void onConfigurationChanged(boolean z10) {
                    AFa1ySDK.this.getMediationNetwork(z10);
                }
            });
            getMonetizationNetwork().component1().AFAdRevenueData(AFAdRevenueData());
            AFj1sSDK AFLogger2 = getMonetizationNetwork().AFLogger();
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.e
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1ySDK.this.equals();
                }
            };
            AFi1aSDK currencyIso4217Code = AFLogger2.getCurrencyIso4217Code(runnable);
            Runnable AFAdRevenueData = AFLogger2.AFAdRevenueData(currencyIso4217Code, runnable);
            AFLogger2.getRevenue.add(currencyIso4217Code);
            AFLogger2.getRevenue.add(new AFj1oSDK(AFLogger2.getCurrencyIso4217Code.AFAdRevenueData(), AFAdRevenueData));
            AFLogger2.getRevenue.add(new AFj1wSDK(AFAdRevenueData, AFLogger2.getCurrencyIso4217Code, new AFj1xSDK()));
            AFLogger2.getRevenue.add(new AFj1mSDK(AFAdRevenueData, AFLogger2.getCurrencyIso4217Code));
            AFLogger2.getRevenue.add(new AFj1rSDK(AFLogger2.getCurrencyIso4217Code.getMonetizationNetwork(), AFLogger2.getCurrencyIso4217Code.AFAdRevenueData(), AFAdRevenueData));
            AFLogger2.getMediationNetwork(AFAdRevenueData);
            for (AFj1tSDK aFj1tSDK : (AFj1tSDK[]) AFLogger2.getRevenue.toArray(new AFj1tSDK[0])) {
                aFj1tSDK.getMonetizationNetwork(AFLogger2.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork);
            }
            if (!AFLogger2.getCurrencyIso4217Code()) {
                AFKeystoreWrapper = (f20121i + 67) % 128;
                AFLogger2.getRevenue(AFLogger2.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork, AFAdRevenueData, AFLogger2.getCurrencyIso4217Code);
            }
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFd1oSDK copy = getMonetizationNetwork().copy();
        if (appsFlyerConversionListener == null) {
            AFKeystoreWrapper = (f20121i + 87) % 128;
            str2 = "null";
        } else {
            str2 = "conversionDataListener";
        }
        copy.getRevenue("init", str, str2);
        AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.17.5", getMonetizationNetwork));
        this.getRevenue = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        int i10 = f20121i + 77;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            AFAdRevenueData(context);
            return getMonetizationNetwork().AFAdRevenueData().getMonetizationNetwork(context);
        }
        AFAdRevenueData(context);
        getMonetizationNetwork().AFAdRevenueData().getMonetizationNetwork(context);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        boolean currencyIso4217Code;
        int i10 = f20121i + 123;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            currencyIso4217Code = getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code();
            int i11 = 45 / 0;
        } else {
            currencyIso4217Code = getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code();
        }
        f20121i = (AFKeystoreWrapper + 55) % 128;
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        if (!this.hashCode) {
            getRevenue("logAdRevenue");
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            f20121i = (AFKeystoreWrapper + 91) % 128;
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
        } else if (getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
        } else if (!AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().AFInAppEventType().getMediationNetwork())) {
            AFAdRevenueData(new AFh1lSDK(aFAdRevenueData, map));
        } else {
            f20121i = (AFKeystoreWrapper + 23) % 128;
            getRevenue(new Object[0], -516060765, 516060769, (int) System.currentTimeMillis());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i10 = f20121i + 87;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            logEvent(context, str, map, null);
            throw null;
        }
        logEvent(context, str, map, null);
        int i11 = AFKeystoreWrapper + 27;
        f20121i = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d10, double d11) {
        getMonetizationNetwork().copy().getRevenue("logLocation", String.valueOf(d10), String.valueOf(d11));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d11));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d10));
        AFAdRevenueData(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        AFKeystoreWrapper = (f20121i + 3) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        f20121i = (AFKeystoreWrapper + 15) % 128;
        getMonetizationNetwork().copy().getRevenue("logSession", new String[0]);
        getMonetizationNetwork().copy().getCurrencyIso4217Code();
        getRevenue(new Object[]{this, context, AFh1tSDK.logSession}, -268043806, 268043817, System.identityHashCode(this));
        AFAdRevenueData(context, null, null);
        int i10 = AFKeystoreWrapper + 33;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 69 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        getRevenue(new Object[]{this, context}, 537134056, -537134032, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        if (uri != null) {
            AFKeystoreWrapper = (f20121i + 5) % 128;
            if (!uri.toString().isEmpty()) {
                if (context == null) {
                    AFa1mSDK i10 = getMonetizationNetwork().i();
                    StringBuilder sb2 = new StringBuilder("Context is \"");
                    sb2.append(context);
                    sb2.append("\"");
                    i10.getMediationNetwork(sb2.toString(), DeepLinkResult.Error.NETWORK);
                    return;
                }
                AFAdRevenueData(context);
                getMonetizationNetwork().i().g_(AFa1jSDK.getMediationNetwork(getMonetizationNetwork().afVerboseLog()), Uri.parse(uri.toString()));
                int i11 = f20121i + 73;
                AFKeystoreWrapper = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        AFa1mSDK i12 = getMonetizationNetwork().i();
        StringBuilder sb3 = new StringBuilder("Link is \"");
        sb3.append(uri);
        sb3.append("\"");
        i12.getMediationNetwork(sb3.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(final Intent intent, Context context) {
        if (intent == null) {
            AFKeystoreWrapper = (f20121i + 15) % 128;
            getMonetizationNetwork().i().getMediationNetwork("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context == null) {
            int i10 = f20121i + 115;
            AFKeystoreWrapper = i10 % 128;
            if (i10 % 2 == 0) {
                getMonetizationNetwork().i().getMediationNetwork("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            } else {
                getMonetizationNetwork().i().getMediationNetwork("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                throw null;
            }
        }
        final Context applicationContext = context.getApplicationContext();
        AFAdRevenueData(applicationContext);
        getMonetizationNetwork().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.f
            @Override // java.lang.Runnable
            public final void run() {
                AFa1ySDK.this.e_(applicationContext, intent);
            }
        });
        int i11 = f20121i + 121;
        AFKeystoreWrapper = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        AFKeystoreWrapper = (f20121i + 23) % 128;
        getMonetizationNetwork().copy().getRevenue("registerConversionListener", new String[0]);
        getRevenue(appsFlyerConversionListener);
        f20121i = (AFKeystoreWrapper + 77) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0045, code lost:
    
        com.appsflyer.internal.AFa1ySDK.getCurrencyIso4217Code = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
        com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = (com.appsflyer.internal.AFa1ySDK.f20121i + 113) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int i10 = AFKeystoreWrapper + 7;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            getMonetizationNetwork().copy().getRevenue("registerValidatorListener", new String[1]);
            AFLogger.afDebugLog("registerValidatorListener called");
        } else {
            getMonetizationNetwork().copy().getRevenue("registerValidatorListener", new String[0]);
            AFLogger.afDebugLog("registerValidatorListener called");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        getRevenue(new Object[]{this, context, map, purchaseValidationCallback}, 1567165248, -1567165246, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFKeystoreWrapper = (f20121i + 63) % 128;
        AFAdRevenueData(context);
        PurchaseHandler component2 = getMonetizationNetwork().component2();
        if (component2.getRevenue(map, purchaseValidationCallback, "subscriptions")) {
            AFe1kSDK aFe1kSDK = new AFe1kSDK(map, purchaseValidationCallback, component2.AFAdRevenueData);
            AFe1oSDK aFe1oSDK = component2.getCurrencyIso4217Code;
            aFe1oSDK.getCurrencyIso4217Code.execute(aFe1oSDK.new AnonymousClass1(aFe1kSDK));
            AFKeystoreWrapper = (f20121i + 43) % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0169  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        long j10;
        if (activity != null && activity.getIntent() != null) {
            AFd1oSDK copy = getMonetizationNetwork().copy();
            String localClassName = activity.getLocalClassName();
            StringBuilder sb2 = new StringBuilder("activity_intent_");
            sb2.append(activity.getIntent().toString());
            copy.getRevenue("sendPushNotificationData", localClassName, sb2.toString());
        } else if (activity != null) {
            f20121i = (AFKeystoreWrapper + 55) % 128;
            getMonetizationNetwork().copy().getRevenue("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            getMonetizationNetwork().copy().getRevenue("sendPushNotificationData", "activity_null");
            f20121i = (AFKeystoreWrapper + 119) % 128;
        }
        AFc1eSDK force = getMonetizationNetwork().force();
        String revenue = getRevenue(activity);
        force.getMonetizationNetwork = revenue;
        if (revenue != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.copydefault == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.copydefault = new ConcurrentHashMap();
                j10 = currentTimeMillis;
            } else {
                try {
                    long j11 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    Iterator<Long> it = this.copydefault.keySet().iterator();
                    j10 = currentTimeMillis;
                    while (it.hasNext()) {
                        try {
                            Long next = it.next();
                            JSONObject jSONObject = new JSONObject(force.getMonetizationNetwork);
                            JSONObject jSONObject2 = new JSONObject(this.copydefault.get(next));
                            Iterator<Long> it2 = it;
                            if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                StringBuilder sb3 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                sb3.append(jSONObject2);
                                sb3.append(", new: ");
                                sb3.append(jSONObject);
                                sb3.append(")");
                                AFLogger.afInfoLog(sb3.toString());
                                force.getMonetizationNetwork = null;
                                return;
                            }
                            if (currentTimeMillis - next.longValue() > j11) {
                                AFKeystoreWrapper = (f20121i + 69) % 128;
                                this.copydefault.remove(next);
                            }
                            if (next.longValue() <= j10) {
                                j10 = next.longValue();
                            }
                            it = it2;
                        } catch (Throwable th) {
                            th = th;
                            StringBuilder sb4 = new StringBuilder("Error while handling push notification measurement: ");
                            sb4.append(th.getClass().getSimpleName());
                            AFLogger.afErrorLog(sb4.toString(), th);
                            if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                            }
                            this.copydefault.put(Long.valueOf(currentTimeMillis), force.getMonetizationNetwork);
                            start(activity);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j10 = currentTimeMillis;
                }
            }
            if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                StringBuilder sb5 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb5.append(j10);
                sb5.append(")");
                AFLogger.afInfoLog(sb5.toString());
                this.copydefault.remove(Long.valueOf(j10));
            }
            this.copydefault.put(Long.valueOf(currentTimeMillis), force.getMonetizationNetwork);
            start(activity);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        getMonetizationNetwork().copy().getRevenue("setAdditionalData", r4.toString());
        com.appsflyer.AppsFlyerProperties.getInstance().setCustomData(new org.json.JSONObject(r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r4 != null) goto L8;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAdditionalData(Map<String, Object> map) {
        int i10 = f20121i + 81;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 94 / 0;
        }
        AFKeystoreWrapper = (f20121i + 43) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        f20121i = (AFKeystoreWrapper + 23) % 128;
        getMonetizationNetwork().copy().getRevenue("setAndroidIdData", str);
        getMonetizationNetwork().force().getCurrencyIso4217Code = str;
        AFKeystoreWrapper = (f20121i + 29) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i10 = f20121i + 3;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            getMonetizationNetwork().copy().getRevenue("setAppId", str);
        } else {
            getMonetizationNetwork().copy().getRevenue("setAppId", str);
        }
        getMediationNetwork(AppsFlyerProperties.APP_ID, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0036, code lost:
    
        if (r4.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) == false) goto L6;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAppInviteOneLink(String str) {
        getMonetizationNetwork().copy().getRevenue("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str != null) {
            f20121i = (AFKeystoreWrapper + 13) % 128;
        }
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        AFKeystoreWrapper = (f20121i + 101) % 128;
        getMediationNetwork(AppsFlyerProperties.ONELINK_ID, str);
        f20121i = (AFKeystoreWrapper + 9) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z10) {
        AFKeystoreWrapper = (f20121i + 57) % 128;
        getMonetizationNetwork().copy().getRevenue("setCollectAndroidID", String.valueOf(z10));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z10));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z10));
        f20121i = (AFKeystoreWrapper + 13) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z10) {
        getRevenue(new Object[]{this, Boolean.valueOf(z10)}, -312979490, 312979496, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z10) {
        getRevenue(new Object[]{this, Boolean.valueOf(z10)}, -1241724786, 1241724809, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        int i10 = f20121i + 41;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            Objects.requireNonNull(appsFlyerConsent);
            getMonetizationNetwork().force().component1 = appsFlyerConsent;
        } else {
            Objects.requireNonNull(appsFlyerConsent);
            getMonetizationNetwork().force().component1 = appsFlyerConsent;
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        getRevenue(new Object[]{this, str}, -1717702056, 1717702064, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        int i10 = (AFKeystoreWrapper + 41) % 128;
        f20121i = i10;
        if (context != null) {
            AFKeystoreWrapper = (i10 + 35) % 128;
            if (!getCurrencyIso4217Code()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb2 = new StringBuilder("CustomerUserId set: ");
            sb2.append(str);
            sb2.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb2.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(getMonetizationNetwork().component4());
            getRevenue(new Object[]{this, context, AFh1tSDK.setCustomerIdAndLogSession}, -268043806, 268043817, System.identityHashCode(this));
            getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
            if (referrer == null) {
                referrer = BuildConfig.FLAVOR;
            }
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
            }
            getRevenue(context, referrer);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        f20121i = (AFKeystoreWrapper + 53) % 128;
        getMonetizationNetwork().copy().getRevenue("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMediationNetwork(AppsFlyerProperties.APP_USER_ID, str);
        getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.FALSE}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        int i10 = AFKeystoreWrapper + 117;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z10) {
        getRevenue(new Object[]{this, Boolean.valueOf(z10)}, -451136324, 451136331, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z10) {
        boolean z11;
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z10)));
        if (z10) {
            z11 = false;
        } else {
            f20121i = (AFKeystoreWrapper + 39) % 128;
            z11 = true;
        }
        AFb1lSDK.AFAdRevenueData = Boolean.valueOf(z11);
        AFd1zSDK monetizationNetwork = getMonetizationNetwork();
        monetizationNetwork.force().component2 = z10;
        if (!z10) {
            AFe1oSDK copydefault = monetizationNetwork.copydefault();
            copydefault.getCurrencyIso4217Code.execute(copydefault.new AnonymousClass1(new AFe1eSDK(getMonetizationNetwork())));
        } else {
            monetizationNetwork.force().component3 = null;
            int i10 = AFKeystoreWrapper + 25;
            f20121i = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z10) {
        f20121i = (AFKeystoreWrapper + 111) % 128;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z10)));
        getRevenue(new Object[]{AppsFlyerProperties.DISABLE_NETWORK_DATA, Boolean.valueOf(z10)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        int i10 = f20121i + 103;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        AFKeystoreWrapper = (f20121i + 23) % 128;
        getMonetizationNetwork().copy().getRevenue("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i10 = AFKeystoreWrapper + 123;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 71 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String str3;
        if (AFk1wSDK.getCurrencyIso4217Code(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        if (str != null) {
            str3 = str.trim();
            AFKeystoreWrapper = (f20121i + 21) % 128;
        } else {
            str3 = BuildConfig.FLAVOR;
        }
        AFe1vSDK.getMonetizationNetwork(new AFe1ySDK(str3, str2.trim()));
        AFKeystoreWrapper = (f20121i + 63) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i10 = AFKeystoreWrapper + 57;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            getMonetizationNetwork().copy().getRevenue("setImeiData", str);
            AFf1eSDK AFInAppEventType2 = getMonetizationNetwork().AFInAppEventType();
            AFf1eSDK.getCurrencyIso4217Code(new Object[]{AFInAppEventType2, str}, -1410448561, 1410448563, System.identityHashCode(AFInAppEventType2));
        } else {
            getMonetizationNetwork().copy().getRevenue("setImeiData", str);
            AFf1eSDK AFInAppEventType3 = getMonetizationNetwork().AFInAppEventType();
            AFf1eSDK.getCurrencyIso4217Code(new Object[]{AFInAppEventType3, str}, -1410448561, 1410448563, System.identityHashCode(AFInAppEventType3));
        }
        f20121i = (AFKeystoreWrapper + 31) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setInstallId(String str) {
        getMonetizationNetwork().copy().getRevenue("setInstallId", new String[0]);
        if (!this.hashCode) {
            f20121i = (AFKeystoreWrapper + 1) % 128;
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
            return;
        }
        if (!getMonetizationNetwork().AFAdRevenueData().getMediationNetwork("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID")) {
            f20121i = (AFKeystoreWrapper + 47) % 128;
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
            AFKeystoreWrapper = (f20121i + 109) % 128;
        } else if (str == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
            AFKeystoreWrapper = (f20121i + 75) % 128;
        } else {
            AFb1kSDK.getCurrencyIso4217Code(str, getMonetizationNetwork().component4());
            f20121i = (AFKeystoreWrapper + 41) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z10) {
        AFKeystoreWrapper = (f20121i + 87) % 128;
        getMonetizationNetwork().copy().getRevenue("setIsUpdate", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z10);
        AFKeystoreWrapper = (f20121i + 57) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z10 = false;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            int i10 = f20121i + 79;
            AFKeystoreWrapper = i10 % 128;
            if (i10 % 2 == 0) {
                z10 = true;
            }
        }
        getMonetizationNetwork().copy().getRevenue("log", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (z10) {
            getMonetizationNetwork().afInfoLog().areAllFieldsValid();
            return;
        }
        int i11 = AFKeystoreWrapper + 27;
        f20121i = i11 % 128;
        if (i11 % 2 != 0) {
            getMonetizationNetwork().afInfoLog().getMonetizationNetwork();
        } else {
            getMonetizationNetwork().afInfoLog().getMonetizationNetwork();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i10) {
        int i11 = f20121i + 65;
        AFKeystoreWrapper = i11 % 128;
        if (i11 % 2 != 0) {
            this.component4 = TimeUnit.SECONDS.toMillis(i10);
            throw null;
        }
        this.component4 = TimeUnit.SECONDS.toMillis(i10);
        int i12 = AFKeystoreWrapper + 15;
        f20121i = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        AFKeystoreWrapper = (f20121i + 77) % 128;
        getMonetizationNetwork().copy().getRevenue("setOaidData", str);
        AFb1lSDK.getMonetizationNetwork = str;
        int i10 = f20121i + 85;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        f20121i = (AFKeystoreWrapper + 85) % 128;
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        getMonetizationNetwork().i().component3 = strArr;
        int i10 = AFKeystoreWrapper + 103;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        f20121i = (AFKeystoreWrapper + 19) % 128;
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        int i10 = f20121i + 105;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        getRevenue(new Object[]{this, str, map}, 252063752, -252063751, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i10 = f20121i + 13;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            getMonetizationNetwork().force().getMediationNetwork = AFj1dSDK.getCurrencyIso4217Code(str);
            int i11 = 11 / 0;
        } else {
            getMonetizationNetwork().force().getMediationNetwork = AFj1dSDK.getCurrencyIso4217Code(str);
        }
        AFKeystoreWrapper = (f20121i + 25) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        AFKeystoreWrapper = (f20121i + 3) % 128;
        Objects.requireNonNull(pluginInfo);
        getMonetizationNetwork().unregisterClient().getRevenue(pluginInfo);
        AFKeystoreWrapper = (f20121i + 115) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            AFKeystoreWrapper = (f20121i + 115) % 128;
            try {
                jSONObject.put("pid", str);
            } catch (JSONException e10) {
                AFLogger.afErrorLog(e10.getMessage(), e10);
            }
        }
        if (str2 != null) {
            int i10 = AFKeystoreWrapper + 117;
            f20121i = i10 % 128;
            if (i10 % 2 == 0) {
                jSONObject.put("c", str2);
                throw null;
            }
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            f20121i = (AFKeystoreWrapper + 93) % 128;
            jSONObject.put("af_siteid", str3);
        }
        if (jSONObject.has("pid")) {
            getMediationNetwork("preInstallName", jSONObject.toString());
        } else {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFKeystoreWrapper = (f20121i + 25) % 128;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFa1mSDK i10 = getMonetizationNetwork().i();
        i10.component1.clear();
        i10.component1.addAll(Arrays.asList(strArr));
        int i11 = AFKeystoreWrapper + 85;
        f20121i = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        getRevenue(new Object[]{this, strArr}, 1586087259, -1586087256, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        getRevenue(new Object[]{this}, -1362959156, 1362959177, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        getMonetizationNetwork().force().getRevenue = new AFb1tSDK(strArr);
        AFKeystoreWrapper = (f20121i + 39) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i10 = f20121i + 61;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            getMonetizationNetwork().copy().getRevenue("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i11 = 44 / 0;
        } else {
            getMonetizationNetwork().copy().getRevenue("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        }
        f20121i = (AFKeystoreWrapper + 71) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        int i10 = AFKeystoreWrapper + 39;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            start(context, null);
            throw null;
        }
        start(context, null);
        int i11 = f20121i + 7;
        AFKeystoreWrapper = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z10, Context context) {
        getRevenue(new Object[]{this, Boolean.valueOf(z10), context}, -1981102572, 1981102584, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        f20121i = (AFKeystoreWrapper + 27) % 128;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        f20121i = (AFKeystoreWrapper + 45) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        AFKeystoreWrapper = (f20121i + 91) % 128;
        getMonetizationNetwork().copy().getRevenue("unregisterConversionListener", new String[0]);
        this.getRevenue = null;
        int i10 = AFKeystoreWrapper + 21;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 12 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getRevenue(new Object[]{this, context, str}, -38035383, 38035401, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        getMonetizationNetwork().copy().getRevenue("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, map == null ? BuildConfig.FLAVOR : map.toString());
        if (!getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PURCHASE_VALIDATION;
            StringBuilder sb2 = new StringBuilder("Validate in app called with parameters: ");
            sb2.append(str3);
            sb2.append(" ");
            sb2.append(str4);
            sb2.append(" ");
            sb2.append(str5);
            aFLogger.i(aFg1cSDK, sb2.toString());
        }
        if (str != null && str4 != null) {
            int i10 = f20121i + 105;
            int i11 = i10 % 128;
            AFKeystoreWrapper = i11;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (str2 != null && str5 != null) {
                f20121i = (i11 + 5) % 128;
                if (str3 != null) {
                    new Thread(new com.appsflyer.internal.AFa1zSDK(context.getApplicationContext(), getMonetizationNetwork().AFInAppEventType().getMediationNetwork(), str, str2, str3, str4, str5, map)).start();
                    return;
                }
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getCurrencyIso4217Code;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            int i12 = AFKeystoreWrapper + 91;
            f20121i = i12 % 128;
            if (i12 % 2 != 0) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
            } else {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z10) {
        int i10 = f20121i + 67;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z10)), true);
            getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.valueOf(z10)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        } else {
            AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z10)), true);
            getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.valueOf(z10)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        }
    }

    private static void a(String str, int[] iArr, String str2, int i10, Object[] objArr) {
        char[] cArr = str2;
        if (str2 != null) {
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        byte[] bArr = str;
        if (str != null) {
            int i11 = $10 + 79;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 41 / 0;
                bArr = str.getBytes("ISO-8859-1");
            } else {
                bArr = str.getBytes("ISO-8859-1");
            }
        }
        byte[] bArr2 = bArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr3 = AFLogger;
        if (cArr3 != null) {
            $11 = ($10 + 29) % 128;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i13 = 0; i13 < length; i13++) {
                cArr4[i13] = (char) (cArr3[i13] ^ 1825820251896122634L);
            }
            cArr3 = cArr4;
        }
        int i14 = (int) (1825820251896122634L ^ registerClient);
        if (AFInAppEventType) {
            int length2 = bArr2.length;
            aFk1oSDK.getMonetizationNetwork = length2;
            char[] cArr5 = new char[length2];
            aFk1oSDK.AFAdRevenueData = 0;
            $11 = ($10 + 43) % 128;
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
        } else if (AFInAppEventParameterName) {
            int length3 = cArr2.length;
            aFk1oSDK.getMonetizationNetwork = length3;
            char[] cArr6 = new char[length3];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i17 = aFk1oSDK.AFAdRevenueData;
                int i18 = aFk1oSDK.getMonetizationNetwork;
                if (i17 >= i18) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i17] = (char) (cArr3[cArr2[(i18 - 1) - i17] - i10] - i14);
                    aFk1oSDK.AFAdRevenueData = i17 + 1;
                }
            }
        } else {
            int length4 = iArr.length;
            aFk1oSDK.getMonetizationNetwork = length4;
            char[] cArr7 = new char[length4];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i19 = aFk1oSDK.AFAdRevenueData;
                int i20 = aFk1oSDK.getMonetizationNetwork;
                if (i19 >= i20) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i19] = (char) (cArr3[iArr[(i20 - 1) - i19] - i10] - i14);
                    aFk1oSDK.AFAdRevenueData = i19 + 1;
                }
            }
        }
    }

    private static void copydefault() {
        getRevenue(new Object[0], -516060765, 516060769, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        r1 = new com.appsflyer.internal.AFe1cSDK(r4, r7, r0.AFAdRevenueData);
        r7 = r0.getCurrencyIso4217Code;
        r7.getCurrencyIso4217Code.execute(new com.appsflyer.internal.AFe1oSDK.AnonymousClass1(r7, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r0.getRevenue(r4, r7, "purchases") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if (r0.getRevenue(r4, r7, r2) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        PurchaseHandler component2;
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        Context context = (Context) objArr[1];
        Map<String, Object> map = (Map) objArr[2];
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback = (PurchaseHandler.PurchaseValidationCallback) objArr[3];
        int i10 = f20121i + 59;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            aFa1ySDK.AFAdRevenueData(context);
            component2 = aFa1ySDK.getMonetizationNetwork().component2();
            String[] strArr = new String[1];
            strArr[1] = "purchases";
        } else {
            aFa1ySDK.AFAdRevenueData(context);
            component2 = aFa1ySDK.getMonetizationNetwork().component2();
        }
        int i11 = AFKeystoreWrapper + 63;
        f20121i = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final boolean getCurrencyIso4217Code() {
        if ((!getMediationNetwork(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) || ((String) getRevenue(new Object[0], 131288073, -131288051, (int) System.currentTimeMillis())) != null) {
            f20121i = (AFKeystoreWrapper + 41) % 128;
            return false;
        }
        f20121i = (AFKeystoreWrapper + 123) % 128;
        return true;
    }

    final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK, AFh1qSDK aFh1qSDK) {
        getMediationNetwork(aFh1mSDK, aFh1qSDK);
        if (getMonetizationNetwork().AFInAppEventType().getMediationNetwork() == null) {
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
            if (appsFlyerRequestListener != null) {
                f20121i = (AFKeystoreWrapper + 5) % 128;
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(getMonetizationNetwork().component4());
        if (referrer == null) {
            referrer = BuildConfig.FLAVOR;
        } else {
            f20121i = (AFKeystoreWrapper + 65) % 128;
        }
        aFh1mSDK.component1 = referrer;
        AFAdRevenueData(aFh1mSDK);
    }

    private void areAllFieldsValid() {
        f20121i = (AFKeystoreWrapper + 73) % 128;
        try {
            final AFi1hSDK afErrorLog = getMonetizationNetwork().afErrorLog();
            if (afErrorLog == null) {
                return;
            }
            if (!(!afErrorLog.getCurrencyIso4217Code())) {
                int i10 = f20121i + 101;
                AFKeystoreWrapper = i10 % 128;
                if (i10 % 2 == 0) {
                    afErrorLog.getMediationNetwork(new AFi1dSDK() { // from class: com.appsflyer.internal.a
                        @Override // com.appsflyer.internal.AFi1dSDK
                        public final void onRequestFinished() {
                            AFa1ySDK.this.AFAdRevenueData(afErrorLog);
                        }
                    });
                    return;
                } else {
                    afErrorLog.getMediationNetwork(new AFi1dSDK() { // from class: com.appsflyer.internal.a
                        @Override // com.appsflyer.internal.AFi1dSDK
                        public final void onRequestFinished() {
                            AFa1ySDK.this.AFAdRevenueData(afErrorLog);
                        }
                    });
                    throw null;
                }
            }
            if (afErrorLog.AFAdRevenueData()) {
                return;
            }
            getRevenue(new Object[]{this, afErrorLog}, 608861720, -608861711, System.identityHashCode(this));
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() {
        getMediationNetwork(new AFh1kSDK());
        AFKeystoreWrapper = (f20121i + 81) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j10) {
        int i10 = AFKeystoreWrapper + 89;
        f20121i = i10 % 128;
        if (i10 % 2 != 0) {
            getMonetizationNetwork().i().getCurrencyIso4217Code = deepLinkListener;
            getMonetizationNetwork().i().component2 = j10;
        } else {
            getMonetizationNetwork().i().getCurrencyIso4217Code = deepLinkListener;
            getMonetizationNetwork().i().component2 = j10;
            throw null;
        }
    }

    private static boolean getMediationNetwork(String str) {
        f20121i = (AFKeystoreWrapper + 51) % 128;
        boolean z10 = AppsFlyerProperties.getInstance().getBoolean(str, false);
        int i10 = AFKeystoreWrapper + 117;
        f20121i = i10 % 128;
        if (i10 % 2 != 0) {
            return z10;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        AFAdRevenueData(context);
        AFh1hSDK aFh1hSDK = new AFh1hSDK();
        aFh1hSDK.areAllFieldsValid = str;
        aFh1hSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put(AppConstants.VIDEO_RECORDING_ERROR, "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFg1cSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1hSDK.AFAdRevenueData(singletonMap);
        }
        aFh1hSDK.getRevenue = hashMap;
        AFd1oSDK copy = getMonetizationNetwork().copy();
        Map map2 = aFh1hSDK.getRevenue;
        if (map2 == null) {
            map2 = new HashMap();
        }
        copy.getRevenue("logEvent", str, new JSONObject(map2).toString());
        if (str == null) {
            getRevenue(new Object[]{this, context, AFh1tSDK.logEvent}, -268043806, 268043817, System.identityHashCode(this));
        }
        getCurrencyIso4217Code(aFh1hSDK, (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        r12.onError(41, "No dev key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        AFAdRevenueData(r10);
        r0 = getMonetizationNetwork().areAllFieldsValid();
        r0.getRevenue(com.appsflyer.internal.AFh1vSDK.getMediationNetwork(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (r9.component2 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        r5 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 53;
        com.appsflyer.internal.AFa1ySDK.f20121i = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if ((r5 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        r5 = com.appsflyer.internal.AFj1kSDK.O_(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        r7 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 69;
        com.appsflyer.internal.AFa1ySDK.f20121i = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if ((r7 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        r9.component2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        r9.component2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        com.appsflyer.internal.AFj1kSDK.O_(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        getMonetizationNetwork().copy().getRevenue("start", r11);
        r4 = com.appsflyer.AFLogger.INSTANCE;
        r5 = com.appsflyer.internal.AFg1cSDK.GENERAL;
        r6 = com.appsflyer.internal.AFa1ySDK.getMonetizationNetwork;
        r4.i(r5, java.lang.String.format("Starting AppsFlyer: (v%s.%s)", "6.17.5", r6));
        r7 = new java.lang.StringBuilder("Build Number: ");
        r7.append(r6);
        r4.i(r5, r7.toString());
        com.appsflyer.AppsFlyerProperties.getInstance().loadProperties(getMonetizationNetwork().component4());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if (android.text.TextUtils.isEmpty(r11) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
    
        getMonetizationNetwork().AFInAppEventType().AFAdRevenueData(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0110, code lost:
    
        getMonetizationNetwork().component1().AFAdRevenueData(AFAdRevenueData());
        component1();
        c_(r9.component2.getBaseContext(), r9.copy.AFAdRevenueData().n_());
        getMonetizationNetwork().e().getMonetizationNetwork();
        r9.copy.v().AFAdRevenueData(r10, new com.appsflyer.internal.AFa1ySDK.AnonymousClass2(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x014e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f0, code lost:
    
        if (android.text.TextUtils.isEmpty(getMonetizationNetwork().AFInAppEventType().getMediationNetwork()) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f2, code lost:
    
        getRevenue(new java.lang.Object[0], -516060765, 516060769, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0102, code lost:
    
        if (r12 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0104, code lost:
    
        com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = (com.appsflyer.internal.AFa1ySDK.f20121i + 49) % 128;
        r12.onError(41, "No dev key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002c, code lost:
    
        com.appsflyer.internal.AFa1ySDK.f20121i = (com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 31) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x002a, code lost:
    
        if (getMonetizationNetwork().v().getMediationNetwork() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (getMonetizationNetwork().v().getMediationNetwork() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if (r9.hashCode != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        getRevenue("start");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r11 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        if (r12 == null) goto L43;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        int i10 = f20121i + 93;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 4 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r1 = android.os.StrictMode.allowThreadDiskReads();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        getRevenue().toString = r4.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        android.os.StrictMode.setThreadPolicy(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0023, code lost:
    
        if (getRevenue().toString == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (getRevenue().toString == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object component1(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i10 = f20121i + 9;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 95 / 0;
        }
        SharedPreferences sharedPreferences = getRevenue().toString;
        int i12 = AFKeystoreWrapper + 7;
        f20121i = i12 % 128;
        if (i12 % 2 != 0) {
            return sharedPreferences;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(boolean z10) {
        if (z10) {
            int i10 = AFKeystoreWrapper + 67;
            f20121i = i10 % 128;
            if (i10 % 2 != 0) {
                getMonetizationNetwork().afInfoLog().getMediationNetwork();
                return;
            } else {
                getMonetizationNetwork().afInfoLog().getMediationNetwork();
                throw null;
            }
        }
        getMonetizationNetwork().afInfoLog().AFAdRevenueData();
        AFKeystoreWrapper = (f20121i + 7) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFf1pSDK aFf1pSDK) {
        int i10 = AFKeystoreWrapper + 77;
        f20121i = i10 % 128;
        if (i10 % 2 != 0) {
            AFd1zSDK monetizationNetwork = getMonetizationNetwork();
            if (aFf1pSDK == AFf1pSDK.SUCCESS) {
                monetizationNetwork.afErrorLogForExcManagerOnly().getMonetizationNetwork();
            }
            if (!monetizationNetwork.copy().AFAdRevenueData()) {
                f20121i = (AFKeystoreWrapper + 7) % 128;
                monetizationNetwork.afInfoLog().getCurrencyIso4217Code();
                int i11 = f20121i + 103;
                AFKeystoreWrapper = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 20 / 0;
                    return;
                }
                return;
            }
            monetizationNetwork.afInfoLog().getRevenue();
            return;
        }
        getMonetizationNetwork();
        AFf1pSDK aFf1pSDK2 = AFf1pSDK.SUCCESS;
        throw null;
    }

    static void component2() {
        AFLogger = new char[]{35848, 35853, 35850, 35871, 35840, 35844, 35852, 35870, 35867};
        registerClient = 1912311211;
        AFInAppEventParameterName = true;
        AFInAppEventType = true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        getMonetizationNetwork().copy().getRevenue("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            f20121i = (AFKeystoreWrapper + 107) % 128;
            if (AnonymousClass3.getCurrencyIso4217Code[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1dSDK.getCurrencyIso4217Code(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                f20121i = (AFKeystoreWrapper + 103) % 128;
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
        AFKeystoreWrapper = (f20121i + 117) % 128;
    }

    private static void getMediationNetwork(AFh1mSDK aFh1mSDK, AFh1qSDK aFh1qSDK) {
        int i10 = (AFKeystoreWrapper + 61) % 128;
        f20121i = i10;
        if (aFh1qSDK != null) {
            aFh1mSDK.getMonetizationNetwork = aFh1qSDK.getCurrencyIso4217Code;
            aFh1mSDK.copydefault = aFh1qSDK.AFAdRevenueData;
        }
        int i11 = i10 + 41;
        AFKeystoreWrapper = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private static void areAllFieldsValid(Context context) {
        getRevenue(new Object[]{context}, 750744286, -750744267, (int) System.currentTimeMillis());
    }

    private String getCurrencyIso4217Code(Context context, String str) {
        int i10 = AFKeystoreWrapper + 55;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (context == null) {
            return null;
        }
        AFAdRevenueData(context);
        String currencyIso4217Code = getMonetizationNetwork().AFAdRevenueData().getCurrencyIso4217Code(str);
        AFKeystoreWrapper = (f20121i + 89) % 128;
        return currencyIso4217Code;
    }

    public static String getMonetizationNetwork(SimpleDateFormat simpleDateFormat, long j10) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j10));
        int i10 = f20121i + 3;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 88 / 0;
        }
        return format;
    }

    final Map<String, Object> getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        String str;
        Context context = getMonetizationNetwork().AFInAppEventParameterName().getMonetizationNetwork;
        AFc1qSDK monetizationNetwork = getMonetizationNetwork(context);
        AFg1nSDK component3 = getMonetizationNetwork().component3();
        boolean currencyIso4217Code = getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code();
        boolean revenue = aFh1mSDK.getRevenue();
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        long time = new Date().getTime();
        boolean z10 = false;
        Object[] objArr = new Object[1];
        a("\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 128, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (currencyIso4217Code) {
                int i10 = f20121i + 63;
                AFKeystoreWrapper = i10 % 128;
                if (i10 % 2 != 0) {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", false);
                } else {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
                }
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb2 = new StringBuilder("******* sendTrackingWithEvent: ");
                if (!revenue) {
                    str = aFh1mSDK.areAllFieldsValid;
                } else {
                    int i11 = f20121i + 105;
                    AFKeystoreWrapper = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 15 / 0;
                    }
                    str = "Launch";
                }
                sb2.append(str);
                aFLogger.i(aFg1cSDK, sb2.toString(), true);
                f20121i = (AFKeystoreWrapper + 71) % 128;
            }
            getRevenue(new Object[]{context}, 750744286, -750744267, (int) System.currentTimeMillis());
            int currencyIso4217Code2 = getCurrencyIso4217Code(monetizationNetwork, revenue);
            if (aFh1mSDK.areAllFieldsValid != null) {
                int i13 = f20121i + 75;
                AFKeystoreWrapper = i13 % 128;
                if (i13 % 2 == 0) {
                    z10 = true;
                }
            }
            int revenue2 = getRevenue(monetizationNetwork, z10);
            if (!(!revenue) && currencyIso4217Code2 == 1) {
                AppsFlyerProperties.getInstance().getCurrencyIso4217Code = true;
            }
            component3.getCurrencyIso4217Code(map, currencyIso4217Code2, revenue2);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
        }
        return map;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1oSDK copydefault = this.copy.copydefault();
        copydefault.getCurrencyIso4217Code.execute(copydefault.new AnonymousClass1(new AFf1ySDK(this.copy, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i10 = f20121i + 111;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 96 / 0;
        }
    }

    private AFj1tSDK[] component3() {
        Object[] array;
        int i10 = AFKeystoreWrapper + 71;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            array = getMonetizationNetwork().AFLogger().getRevenue.toArray(new AFj1tSDK[0]);
        } else {
            array = getMonetizationNetwork().AFLogger().getRevenue.toArray(new AFj1tSDK[0]);
        }
        AFj1tSDK[] aFj1tSDKArr = (AFj1tSDK[]) array;
        f20121i = (AFKeystoreWrapper + 107) % 128;
        return aFj1tSDKArr;
    }

    public static int getCurrencyIso4217Code(AFc1qSDK aFc1qSDK, boolean z10) {
        int i10 = AFKeystoreWrapper + 65;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            getMediationNetwork(aFc1qSDK, "appsFlyerCount", z10);
            throw null;
        }
        int mediationNetwork = getMediationNetwork(aFc1qSDK, "appsFlyerCount", z10);
        AFKeystoreWrapper = (f20121i + 71) % 128;
        return mediationNetwork;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
        AFKeystoreWrapper = (f20121i + 31) % 128;
        aFa1ySDK.getMediationNetwork(aFh1mSDK);
        int i10 = f20121i + 27;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copy() {
        int i10 = f20121i + 121;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            if (getMonetizationNetwork().afLogForce().AFAdRevenueData()) {
                AFKeystoreWrapper = (f20121i + 21) % 128;
                getMonetizationNetwork().afLogForce().getMonetizationNetwork();
            }
            AFi1pSDK d10 = getMonetizationNetwork().d();
            d10.getMonetizationNetwork = Build.VERSION.SDK_INT >= 31 ? new AFi1mSDK(d10.getMediationNetwork) : new AFi1tSDK(d10.getMediationNetwork);
            getMonetizationNetwork().AFInAppEventType().getRevenue(getMonetizationNetwork().AFAdRevenueData());
            AFh1xSDK areAllFieldsValid2 = getMonetizationNetwork().areAllFieldsValid();
            areAllFieldsValid2.areAllFieldsValid = System.currentTimeMillis();
            int revenue = areAllFieldsValid2.getCurrencyIso4217Code.getMediationNetwork.getRevenue("appsFlyerCount", 0);
            if (revenue == 1) {
                AFKeystoreWrapper = (f20121i + 89) % 128;
                if (areAllFieldsValid2.getMonetizationNetwork.getMonetizationNetwork("first_launch")) {
                    areAllFieldsValid2.AFAdRevenueData.putAll(areAllFieldsValid2.getCurrencyIso4217Code("first_launch"));
                }
            }
            if (revenue > 0 && areAllFieldsValid2.getMonetizationNetwork.getMonetizationNetwork("gcd")) {
                int i11 = AFKeystoreWrapper + 85;
                f20121i = i11 % 128;
                if (i11 % 2 == 0) {
                    areAllFieldsValid2.getRevenue.putAll(areAllFieldsValid2.getCurrencyIso4217Code("gcd"));
                    int i12 = 79 / 0;
                } else {
                    areAllFieldsValid2.getRevenue.putAll(areAllFieldsValid2.getCurrencyIso4217Code("gcd"));
                }
            }
            areAllFieldsValid2.copydefault = areAllFieldsValid2.getMonetizationNetwork.getMonetizationNetwork("prev_session_dur", 0L);
            areAllFieldsValid();
            getMonetizationNetwork().registerClient().getMediationNetwork();
            return;
        }
        getMonetizationNetwork().afLogForce().AFAdRevenueData();
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        f20121i = (AFKeystoreWrapper + 123) % 128;
        AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        int i10 = AFKeystoreWrapper + 113;
        f20121i = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        Context context = getMonetizationNetwork().AFInAppEventParameterName().getMonetizationNetwork;
        boolean z10 = true;
        if (context == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
            return;
        }
        String mediationNetwork = getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
        AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
        if (mediationNetwork != null) {
            int i10 = AFKeystoreWrapper + 49;
            f20121i = i10 % 128;
            if (i10 % 2 != 0) {
                if (mediationNetwork.length() != 0) {
                    AFc1qSDK monetizationNetwork = getMonetizationNetwork(context);
                    AppsFlyerProperties.getInstance().saveProperties(monetizationNetwork);
                    if (!getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                        StringBuilder sb2 = new StringBuilder("sendWithEvent from activity: ");
                        sb2.append(context.getClass().getName());
                        aFLogger.i(aFg1cSDK, sb2.toString(), true);
                    }
                    boolean revenue = aFh1mSDK.getRevenue();
                    Map<String, ?> monetizationNetwork2 = getMonetizationNetwork(aFh1mSDK);
                    if (getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
                        AFKeystoreWrapper = (f20121i + 31) % 128;
                        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyerLib.sendWithEvent");
                    }
                    int currencyIso4217Code = getCurrencyIso4217Code(monetizationNetwork, false);
                    getRevenue(monetizationNetwork2);
                    AFa1tSDK aFa1tSDK = new AFa1tSDK(getMonetizationNetwork(), aFh1mSDK.AFAdRevenueData(monetizationNetwork2).AFAdRevenueData(currencyIso4217Code), getMonetizationNetwork().e().getMediationNetwork());
                    if (revenue) {
                        boolean z11 = false;
                        for (AFj1tSDK aFj1tSDK : component3()) {
                            if (aFj1tSDK.component4 == AFj1tSDK.AFa1tSDK.STARTED) {
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                                StringBuilder sb3 = new StringBuilder("Failed to get ");
                                sb3.append(aFj1tSDK.component3);
                                sb3.append(" referrer, wait ...");
                                aFLogger2.d(aFg1cSDK2, sb3.toString());
                                z11 = true;
                            }
                        }
                        if (getMonetizationNetwork().e().AFAdRevenueData()) {
                            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "fetching Facebook deferred AppLink data, wait ...");
                            z11 = true;
                        }
                        if (!getMonetizationNetwork().AFInAppEventType().getMonetizationNetwork()) {
                            z10 = z11;
                        }
                    } else {
                        z10 = false;
                    }
                    AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), aFa1tSDK, !z10 ? 0L : 500L, TimeUnit.MILLISECONDS);
                    return;
                }
            } else {
                throw null;
            }
        }
        AFLogger aFLogger3 = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK3 = AFg1cSDK.GENERAL;
        aFLogger3.i(aFg1cSDK3, "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ", true);
        aFLogger3.i(aFg1cSDK3, "AppsFlyer will not track this event.", true);
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        }
        AFKeystoreWrapper = (f20121i + 35) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        r2.equals = new com.appsflyer.internal.C1822h(r2);
        com.appsflyer.internal.AFa1ySDK.f20121i = (com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 81) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x001c, code lost:
    
        if (r2.equals == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r2.equals == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized AFf1mSDK AFAdRevenueData() {
        try {
            int i10 = f20121i + 11;
            AFKeystoreWrapper = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 9 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.equals;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        getRevenue(new Object[]{this, aFh1mSDK}, -316162006, 316162006, System.identityHashCode(this));
    }

    private static void AFAdRevenueData(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i10)));
                }
            } catch (JSONException e10) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e10);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (keys2.hasNext()) {
                f20121i = (AFKeystoreWrapper + 7) % 128;
                if (str != null) {
                    break loop2;
                }
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i11 = 0;
                    while (i11 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i11) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i11) != ((Long) arrayList.get(1)).longValue()) {
                            AFKeystoreWrapper = (f20121i + 61) % 128;
                            if (jSONArray2.getLong(i11) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            }
                            i11++;
                            str = next;
                        }
                    }
                } catch (JSONException e11) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e11);
                }
            }
            break loop2;
        }
        if (str != null) {
            AFKeystoreWrapper = (f20121i + 111) % 128;
            jSONObject.remove(str);
        }
    }

    private boolean component4() {
        f20121i = (AFKeystoreWrapper + 101) % 128;
        if (this.component3 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.component3;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String monetizationNetwork = getMonetizationNetwork(simpleDateFormat, this.component3);
            String monetizationNetwork2 = getMonetizationNetwork(simpleDateFormat, this.AFAdRevenueData);
            if (currentTimeMillis < this.component4 && !isStopped()) {
                AFKeystoreWrapper = (f20121i + 25) % 128;
                AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", monetizationNetwork, monetizationNetwork2, Long.valueOf(currentTimeMillis), Long.valueOf(this.component4)));
                return true;
            }
            if (isStopped()) {
                return false;
            }
            AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", monetizationNetwork, monetizationNetwork2, Long.valueOf(currentTimeMillis)));
            return false;
        }
        if (!(!isStopped())) {
            return false;
        }
        f20121i = (AFKeystoreWrapper + 113) % 128;
        AFLogger.afInfoLog("Sending first launch for this session!");
        f20121i = (AFKeystoreWrapper + 121) % 128;
        return false;
    }

    class AFa1zSDK implements AFe1qSDK {
        AFa1zSDK() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit getMediationNetwork() {
            AFa1ySDK.this.getMediationNetwork(new AFh1kSDK());
            return Unit.f36324a;
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getCurrencyIso4217Code(AFe1mSDK<?> aFe1mSDK) {
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getRevenue(AFe1mSDK<?> aFe1mSDK, AFe1uSDK aFe1uSDK) {
            JSONObject monetizationNetwork;
            AFf1aSDK revenue;
            if (!(aFe1mSDK instanceof AFf1sSDK)) {
                if (!(aFe1mSDK instanceof AFg1kSDK) || aFe1uSDK == AFe1uSDK.SUCCESS) {
                    return;
                }
                AFg1pSDK aFg1pSDK = new AFg1pSDK(AFa1ySDK.this.getMonetizationNetwork());
                AFe1oSDK copydefault = AFa1ySDK.this.getMonetizationNetwork().copydefault();
                copydefault.getCurrencyIso4217Code.execute(copydefault.new AnonymousClass1(aFg1pSDK));
                return;
            }
            AFf1sSDK aFf1sSDK = (AFf1sSDK) aFe1mSDK;
            boolean z10 = aFe1mSDK instanceof AFf1rSDK;
            if (z10 && getRevenue()) {
                AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1mSDK;
                if (aFf1rSDK.getMonetizationNetwork == AFe1uSDK.SUCCESS || aFf1rSDK.getMediationNetwork == 1) {
                    AFg1kSDK aFg1kSDK = new AFg1kSDK(aFf1rSDK, AFa1ySDK.this.getMonetizationNetwork().component4());
                    AFe1oSDK copydefault2 = AFa1ySDK.this.getMonetizationNetwork().copydefault();
                    copydefault2.getCurrencyIso4217Code.execute(copydefault2.new AnonymousClass1(aFg1kSDK));
                }
            }
            AFh1pSDK afWarnLog = AFa1ySDK.this.getMonetizationNetwork().afWarnLog();
            if (afWarnLog != null && z10) {
                afWarnLog.getMonetizationNetwork((AFf1rSDK) aFe1mSDK, new Function0() { // from class: com.appsflyer.internal.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit mediationNetwork;
                        mediationNetwork = AFa1ySDK.AFa1zSDK.this.getMediationNetwork();
                        return mediationNetwork;
                    }
                });
            }
            if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                AFa1ySDK aFa1ySDK = AFa1ySDK.this;
                aFa1ySDK.getMonetizationNetwork(aFa1ySDK.component2).getRevenue("sentSuccessfully", "true");
                if (!(aFe1mSDK instanceof AFf1oSDK) && (revenue = new AFg1sSDK(AFa1ySDK.this.component2).getRevenue()) != null && revenue.getMediationNetwork) {
                    String str = revenue.getRevenue;
                    AFLogger.INSTANCE.d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFd1zSDK monetizationNetwork2 = AFa1ySDK.getRevenue().getMonetizationNetwork();
                    AFf1oSDK aFf1oSDK = new AFf1oSDK(str, monetizationNetwork2);
                    AFe1oSDK copydefault3 = monetizationNetwork2.copydefault();
                    copydefault3.getCurrencyIso4217Code.execute(copydefault3.new AnonymousClass1(aFf1oSDK));
                }
                ResponseNetwork responseNetwork = ((AFe1fSDK) aFf1sSDK).areAllFieldsValid;
                if (responseNetwork != null && (monetizationNetwork = AFa1qSDK.getMonetizationNetwork((String) responseNetwork.getBody())) != null) {
                    AFa1ySDK.this.component1 = monetizationNetwork.optBoolean("send_background", false);
                }
                if (z10) {
                    AFa1ySDK.this.AFAdRevenueData = System.currentTimeMillis();
                }
            }
        }

        private boolean getRevenue() {
            return AFa1ySDK.this.getRevenue != null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        getRevenue(new Object[]{this, context, str}, -973034294, 973034299, System.identityHashCode(this));
    }

    public final AFc1qSDK getMonetizationNetwork(Context context) {
        f20121i = (AFKeystoreWrapper + 13) % 128;
        AFAdRevenueData(context);
        AFc1qSDK component4 = getMonetizationNetwork().component4();
        int i10 = AFKeystoreWrapper + 85;
        f20121i = i10 % 128;
        if (i10 % 2 != 0) {
            return component4;
        }
        throw null;
    }

    private static void getMonetizationNetwork(String str) {
        getRevenue(new Object[]{str}, -374487647, 374487663, (int) System.currentTimeMillis());
    }

    private void getMonetizationNetwork(AFi1hSDK aFi1hSDK) {
        getRevenue(new Object[]{this, aFi1hSDK}, 608861720, -608861711, System.identityHashCode(this));
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = AFKeystoreWrapper + 5;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        aFa1ySDK.setLogLevel(!booleanValue ? AFLogger.LogLevel.NONE : AFLogger.LogLevel.DEBUG);
        AFKeystoreWrapper = (f20121i + 117) % 128;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFi1hSDK aFi1hSDK) {
        int i10 = AFKeystoreWrapper + 25;
        f20121i = i10 % 128;
        Object[] objArr = {this, aFi1hSDK};
        if (i10 % 2 == 0) {
            getRevenue(objArr, 608861720, -608861711, System.identityHashCode(this));
            throw null;
        }
        getRevenue(objArr, 608861720, -608861711, System.identityHashCode(this));
        AFKeystoreWrapper = (f20121i + 15) % 128;
    }

    private void AFAdRevenueData(Context context, String str, Map<String, Object> map) {
        AFh1hSDK aFh1hSDK = new AFh1hSDK();
        aFh1hSDK.areAllFieldsValid = str;
        aFh1hSDK.getRevenue = map;
        getCurrencyIso4217Code(aFh1hSDK, (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this)));
        f20121i = (AFKeystoreWrapper + HVFrameRecorder.FRAME_DURATION) % 128;
    }

    @Deprecated
    public static Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        if (map.containsKey("meta")) {
            f20121i = (AFKeystoreWrapper + 115) % 128;
            Map<String, Object> map2 = (Map) map.get("meta");
            AFKeystoreWrapper = (f20121i + 81) % 128;
            return map2;
        }
        HashMap hashMap = new HashMap();
        map.put("meta", hashMap);
        return hashMap;
    }

    private void AFAdRevenueData(String str) {
        final AFh1mSDK AFAdRevenueData = new AFh1nSDK().AFAdRevenueData(getMonetizationNetwork().AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0));
        AFAdRevenueData.component1 = str;
        if (str == null || str.length() <= 5 || !getMonetizationNetwork().AFLogger().getMediationNetwork(AFAdRevenueData)) {
            return;
        }
        int i10 = f20121i + 15;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), new Runnable() { // from class: com.appsflyer.internal.b
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1ySDK.this.getCurrencyIso4217Code(AFAdRevenueData);
                }
            }, 5L, TimeUnit.MILLISECONDS);
            f20121i = (AFKeystoreWrapper + 21) % 128;
        } else {
            AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), new Runnable() { // from class: com.appsflyer.internal.b
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1ySDK.this.getCurrencyIso4217Code(AFAdRevenueData);
                }
            }, 5L, TimeUnit.MILLISECONDS);
            throw null;
        }
    }

    private static int getMediationNetwork(AFc1qSDK aFc1qSDK, String str, boolean z10) {
        int revenue;
        int i10 = f20121i + 15;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            revenue = aFc1qSDK.getRevenue(str, 0);
            if (!z10) {
                return revenue;
            }
        } else {
            revenue = aFc1qSDK.getRevenue(str, 0);
            if (!z10) {
                return revenue;
            }
        }
        AFKeystoreWrapper = (f20121i + 13) % 128;
        int i11 = revenue + 1;
        aFc1qSDK.getMediationNetwork(str, i11);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMediationNetwork(AFd1zSDK aFd1zSDK) {
        getRevenue(new Object[]{aFd1zSDK}, 757923489, -757923475, (int) System.currentTimeMillis());
    }

    private AFh1qSDK getMediationNetwork(Context context) {
        return (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this));
    }

    private void getMediationNetwork(Context context, AFh1tSDK aFh1tSDK) {
        getRevenue(new Object[]{this, context, aFh1tSDK}, -268043806, 268043817, System.identityHashCode(this));
    }

    public static String getMediationNetwork() {
        return (String) getRevenue(new Object[0], 131288073, -131288051, (int) System.currentTimeMillis());
    }

    public static String AFAdRevenueData(AFc1qSDK aFc1qSDK, String str) {
        f20121i = (AFKeystoreWrapper + 71) % 128;
        String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
        if (monetizationNetwork != null) {
            int i10 = f20121i + 87;
            AFKeystoreWrapper = i10 % 128;
            if (i10 % 2 == 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        aFc1qSDK.getRevenue("CACHED_CHANNEL", str);
        f20121i = (AFKeystoreWrapper + 37) % 128;
        return str;
    }

    private void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        boolean z10;
        if (aFh1mSDK.areAllFieldsValid == null) {
            AFKeystoreWrapper = (f20121i + 73) % 128;
            z10 = true;
        } else {
            z10 = false;
        }
        if (!getCurrencyIso4217Code()) {
            if (z10) {
                if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                    f20121i = (AFKeystoreWrapper + 7) % 128;
                    if (component4()) {
                        AFKeystoreWrapper = (f20121i + 39) % 128;
                        AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
                        if (appsFlyerRequestListener != null) {
                            appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                            return;
                        }
                        return;
                    }
                } else {
                    AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                }
                this.component3 = System.currentTimeMillis();
            }
            getMediationNetwork(aFh1mSDK);
            return;
        }
        f20121i = (AFKeystoreWrapper + 33) % 128;
        AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
    }

    public static AFa1ySDK getRevenue() {
        int i10 = AFKeystoreWrapper;
        AFa1ySDK aFa1ySDK = areAllFieldsValid;
        int i11 = i10 + 9;
        f20121i = i11 % 128;
        if (i11 % 2 != 0) {
            return aFa1ySDK;
        }
        throw null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        AFKeystoreWrapper = (f20121i + 11) % 128;
        aFa1ySDK.getMonetizationNetwork().copy().getRevenue("setCollectIMEI", String.valueOf(booleanValue));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(booleanValue));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(booleanValue));
        int i10 = f20121i + 115;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 60 / 0;
        }
        return null;
    }

    private void getRevenue(AppsFlyerConversionListener appsFlyerConversionListener) {
        AFKeystoreWrapper = (f20121i + 53) % 128;
        if (appsFlyerConversionListener == null) {
            return;
        }
        this.getRevenue = appsFlyerConversionListener;
        f20121i = (AFKeystoreWrapper + 101) % 128;
    }

    private static void AFAdRevenueData(String str, boolean z10) {
        getRevenue(new Object[]{str, Boolean.valueOf(z10)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
    }

    public final void AFAdRevenueData(Context context, String str) {
        getRevenue(new Object[]{this, context, str}, 1454368071, -1454368056, System.identityHashCode(this));
    }

    private void getRevenue(Context context, String str) {
        AFh1eSDK aFh1eSDK = new AFh1eSDK();
        AFAdRevenueData(context);
        aFh1eSDK.areAllFieldsValid = null;
        aFh1eSDK.getRevenue = null;
        aFh1eSDK.component1 = str;
        aFh1eSDK.getMonetizationNetwork = null;
        AFAdRevenueData(aFh1eSDK);
        f20121i = (AFKeystoreWrapper + 29) % 128;
    }

    private void getRevenue(Map<String, Object> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return;
        }
        AFKeystoreWrapper = (f20121i + 115) % 128;
        if (!(!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false))) {
            return;
        }
        f20121i = (AFKeystoreWrapper + 115) % 128;
        if (map.get("advertiserId") != null) {
            try {
                if (AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().force().getCurrencyIso4217Code) && map.remove("android_id") != null) {
                    AFKeystoreWrapper = (f20121i + 65) % 128;
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().AFInAppEventType().AFAdRevenueData())) {
                    f20121i = (AFKeystoreWrapper + 67) % 128;
                    if (map.remove("imei") != null) {
                        int i10 = f20121i + 33;
                        AFKeystoreWrapper = i10 % 128;
                        if (i10 % 2 == 0) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        } else {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                            throw null;
                        }
                    }
                }
            } catch (Exception e10) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e10);
            }
        }
    }

    private static String getRevenue(Activity activity) {
        Intent intent;
        AFKeystoreWrapper = (f20121i + 117) % 128;
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i10 = AFKeystoreWrapper + 75;
                    f20121i = i10 % 128;
                    if (i10 % 2 != 0) {
                        str = extras.getString("af");
                        if (str != null) {
                            AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(str)));
                            extras.remove("af");
                            activity.setIntent(intent.putExtras(extras));
                            AFKeystoreWrapper = (f20121i + 45) % 128;
                        }
                    } else {
                        String string = extras.getString("af");
                        try {
                            throw null;
                        } catch (Throwable th) {
                            str = string;
                            th = th;
                            AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, th.getMessage(), th);
                            return str;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return str;
    }

    public static boolean getRevenue(Context context) {
        f20121i = (AFKeystoreWrapper + 103) % 128;
        try {
            if (C2017i.q().i(context) == 0) {
                AFKeystoreWrapper = (f20121i + 83) % 128;
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e10);
            return false;
        }
    }

    private static int getRevenue(AFc1qSDK aFc1qSDK, boolean z10) {
        int i10 = AFKeystoreWrapper + HVFrameRecorder.FRAME_DURATION;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            getMediationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z10);
            throw null;
        }
        int mediationNetwork = getMediationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z10);
        f20121i = (AFKeystoreWrapper + 33) % 128;
        return mediationNetwork;
    }

    private static void getRevenue(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.SDK_LIFECYCLE;
        StringBuilder sb2 = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb2.append(str);
        sb2.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFg1cSDK, sb2.toString());
        int i10 = AFKeystoreWrapper + 99;
        f20121i = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }
}
