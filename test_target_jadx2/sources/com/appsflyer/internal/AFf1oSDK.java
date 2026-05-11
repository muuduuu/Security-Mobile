package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFf1oSDK extends AFf1sSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFLogger = 1;
    private static int registerClient;
    private final AFc1hSDK copy;
    private final String copydefault;
    private final AFg1nSDK equals;
    private final AFc1oSDK hashCode;
    private static char[] AFKeystoreWrapper = {52730, 63488, 52732, 63493, 63494, 52733, 63510, 52735, 63498};
    private static char AFInAppEventType = 52733;

    public AFf1oSDK(String str, AFd1zSDK aFd1zSDK) {
        super(new AFg1tSDK(), aFd1zSDK, str);
        this.hashCode = aFd1zSDK.AFAdRevenueData();
        this.copy = aFd1zSDK.AFInAppEventParameterName();
        this.copydefault = str;
        this.equals = aFd1zSDK.component3();
    }

    private static void a(byte b10, String str, int i10, Object[] objArr) {
        int i11;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        char[] cArr3 = AFKeystoreWrapper;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i12 = 0; i12 < length; i12++) {
                cArr4[i12] = (char) (cArr3[i12] ^ (-9203380046050046466L));
            }
            cArr3 = cArr4;
        }
        char c10 = (char) ((-9203380046050046466L) ^ AFInAppEventType);
        char[] cArr5 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr5[i11] = (char) (cArr2[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            int i13 = $10 + 65;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            aFk1pSDK.getMonetizationNetwork = 0;
            while (true) {
                int i15 = aFk1pSDK.getMonetizationNetwork;
                if (i15 >= i11) {
                    break;
                }
                char c11 = cArr2[i15];
                aFk1pSDK.getRevenue = c11;
                char c12 = cArr2[i15 + 1];
                aFk1pSDK.getCurrencyIso4217Code = c12;
                if (c11 == c12) {
                    int i16 = $11 + 115;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        cArr5[i15] = (char) (c11 >>> b10);
                        cArr5[i15 >> 1] = (char) (c12 << b10);
                    } else {
                        cArr5[i15] = (char) (c11 - b10);
                        cArr5[i15 + 1] = (char) (c12 - b10);
                    }
                } else {
                    int i17 = c11 / c10;
                    aFk1pSDK.getMediationNetwork = i17;
                    int i18 = c11 % c10;
                    aFk1pSDK.component2 = i18;
                    int i19 = c12 / c10;
                    aFk1pSDK.AFAdRevenueData = i19;
                    int i20 = c12 % c10;
                    aFk1pSDK.component3 = i20;
                    if (i18 == i20) {
                        int i21 = ((i17 + c10) - 1) % c10;
                        aFk1pSDK.getMediationNetwork = i21;
                        int i22 = ((i19 + c10) - 1) % c10;
                        aFk1pSDK.AFAdRevenueData = i22;
                        cArr5[i15] = cArr3[(i21 * c10) + i18];
                        cArr5[i15 + 1] = cArr3[(i22 * c10) + i20];
                    } else if (i17 == i19) {
                        int i23 = ((i18 + c10) - 1) % c10;
                        aFk1pSDK.component2 = i23;
                        int i24 = ((i20 + c10) - 1) % c10;
                        aFk1pSDK.component3 = i24;
                        cArr5[i15] = cArr3[(i17 * c10) + i23];
                        cArr5[i15 + 1] = cArr3[(i19 * c10) + i24];
                    } else {
                        cArr5[i15] = cArr3[(i17 * c10) + i20];
                        cArr5[i15 + 1] = cArr3[(i19 * c10) + i18];
                    }
                }
                aFk1pSDK.getMonetizationNetwork = i15 + 2;
            }
        }
        $10 = ($11 + 5) % 128;
        for (int i25 = 0; i25 < i10; i25++) {
            cArr5[i25] = (char) (cArr5[i25] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    private void equals() {
        int i10 = AFLogger + 33;
        registerClient = i10 % 128;
        int i11 = i10 % 2;
        ((AFf1sSDK) this).component2.AFAdRevenueData("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ~i12;
        return ((((i10 * 495) + (i11 * (-493))) + ((i10 | i13) * (-988))) + (((i11 | i14) | i15) * 494)) + (((~(i10 | i11)) | ((~(i15 | i11)) | (~(i13 | i14)))) * 494) != 1 ? getMonetizationNetwork(objArr) : getMediationNetwork(objArr);
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1oSDK aFf1oSDK = (AFf1oSDK) objArr[0];
        int i10 = registerClient + 109;
        AFLogger = i10 % 128;
        if (i10 % 2 == 0) {
            super.getCurrencyIso4217Code();
            throw null;
        }
        super.getCurrencyIso4217Code();
        ResponseNetwork responseNetwork = ((AFe1fSDK) aFf1oSDK).areAllFieldsValid;
        if (responseNetwork != null) {
            int i11 = registerClient + 3;
            AFLogger = i11 % 128;
            if (i11 % 2 == 0) {
                responseNetwork.isSuccessful();
                throw null;
            }
            if (responseNetwork.isSuccessful()) {
                aFf1oSDK.equals();
                registerClient = (AFLogger + 17) % 128;
            }
        }
        return null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFf1oSDK aFf1oSDK = (AFf1oSDK) objArr[0];
        AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
        super.AFAdRevenueData(aFh1mSDK);
        Context context = aFf1oSDK.copy.getMonetizationNetwork;
        AFa1ySDK revenue = AFa1ySDK.getRevenue();
        if (context == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (revenue.getCurrencyIso4217Code()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        try {
            aFh1mSDK.getMonetizationNetwork("app_version_code", Integer.toString(aFf1oSDK.hashCode.n_().versionCode));
            aFh1mSDK.getMonetizationNetwork("app_version_name", aFf1oSDK.hashCode.n_().versionName);
            aFh1mSDK.getMonetizationNetwork("app_name", aFf1oSDK.s_(context.getPackageManager()));
            aFh1mSDK.getMonetizationNetwork("installDate", AFa1ySDK.getMonetizationNetwork(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), aFf1oSDK.hashCode.n_().firstInstallTime));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        aFf1oSDK.equals.getRevenue(aFh1mSDK.AFAdRevenueData);
        aFh1mSDK.AFAdRevenueData.remove("ivc");
        String mediationNetwork = AFa1ySDK.getMediationNetwork();
        if (mediationNetwork != null) {
            int i10 = AFLogger + 47;
            registerClient = i10 % 128;
            if (i10 % 2 != 0) {
                aFh1mSDK.getMonetizationNetwork("appUserId", mediationNetwork);
                int i11 = 83 / 0;
            } else {
                aFh1mSDK.getMonetizationNetwork("appUserId", mediationNetwork);
            }
        }
        try {
            aFh1mSDK.getMonetizationNetwork("model", Build.MODEL);
            Object[] objArr2 = new Object[1];
            a((byte) (3 - (ViewConfiguration.getTouchSlop() >> 8)), "\u0003\u0007\u0005\u0006㘁", 5 - (Process.myPid() >> 22), objArr2);
            aFh1mSDK.getMonetizationNetwork(((String) objArr2[0]).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i12 = AFLogger + 89;
            registerClient = i12 % 128;
            if (i12 % 2 != 0) {
                aFh1mSDK.getMonetizationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                int i13 = 47 / 0;
            } else {
                aFh1mSDK.getMonetizationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            }
        }
        AFb1jSDK l_ = AFb1lSDK.l_(context.getContentResolver());
        if (l_ != null) {
            registerClient = (AFLogger + 35) % 128;
            aFh1mSDK.getMonetizationNetwork("amazon_aid", l_.getRevenue);
            aFh1mSDK.getMonetizationNetwork("amazon_aid_limit", String.valueOf(l_.getCurrencyIso4217Code));
        }
        aFh1mSDK.getMonetizationNetwork("devkey", ((AFe1fSDK) aFf1oSDK).component1.getMediationNetwork());
        aFh1mSDK.getMonetizationNetwork("uid", AFb1kSDK.getCurrencyIso4217Code(aFf1oSDK.hashCode.getMediationNetwork));
        aFh1mSDK.getMonetizationNetwork("af_gcm_token", aFf1oSDK.copydefault);
        aFh1mSDK.getMonetizationNetwork("launch_counter", Integer.toString(((AFf1sSDK) aFf1oSDK).component2.getRevenue("appsFlyerCount", 0)));
        aFh1mSDK.getMonetizationNetwork("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String component3 = aFf1oSDK.hashCode.component3();
        if (component3 == null) {
            return null;
        }
        aFh1mSDK.getMonetizationNetwork(AppsFlyerProperties.CHANNEL, component3);
        AFLogger = (registerClient + 61) % 128;
        return null;
    }

    private String s_(PackageManager packageManager) {
        ApplicationInfo applicationInfo = this.hashCode.n_().applicationInfo;
        if (applicationInfo != null) {
            String charSequence = packageManager.getApplicationLabel(applicationInfo).toString();
            int i10 = AFLogger + 95;
            registerClient = i10 % 128;
            if (i10 % 2 == 0) {
                return charSequence;
            }
            throw null;
        }
        int i11 = AFLogger;
        int i12 = i11 + 119;
        registerClient = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        registerClient = (i11 + 71) % 128;
        return BuildConfig.FLAVOR;
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    protected final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        getCurrencyIso4217Code(new Object[]{this, aFh1mSDK}, 908933800, -908933800, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    protected final void component1(AFh1mSDK aFh1mSDK) {
        String areAllFieldsValid;
        int i10 = AFLogger + 13;
        registerClient = i10 % 128;
        if (i10 % 2 != 0) {
            areAllFieldsValid = this.hashCode.areAllFieldsValid();
            int i11 = 83 / 0;
            if (areAllFieldsValid == null) {
                return;
            }
        } else {
            areAllFieldsValid = this.hashCode.areAllFieldsValid();
            if (areAllFieldsValid == null) {
                return;
            }
        }
        registerClient = (AFLogger + 19) % 128;
        aFh1mSDK.getMonetizationNetwork("advertiserId", areAllFieldsValid);
        AFLogger = (registerClient + 39) % 128;
    }

    @Override // com.appsflyer.internal.AFf1sSDK, com.appsflyer.internal.AFe1fSDK
    protected final boolean copydefault() {
        int i10 = registerClient + 87;
        int i11 = i10 % 128;
        AFLogger = i11;
        boolean z10 = i10 % 2 == 0;
        registerClient = (i11 + 117) % 128;
        return z10;
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    protected final void getRevenue(AFh1mSDK aFh1mSDK) {
        int i10 = AFLogger + 51;
        registerClient = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    protected final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        registerClient = (AFLogger + 67) % 128;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        getCurrencyIso4217Code(new Object[]{this}, 838739924, -838739923, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    protected final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        registerClient = (AFLogger + 21) % 128;
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    protected final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        AFLogger = (registerClient + 1) % 128;
    }
}
