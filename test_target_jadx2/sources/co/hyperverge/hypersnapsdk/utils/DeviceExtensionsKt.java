package co.hyperverge.hypersnapsdk.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.o;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002\u001a,\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u0002H\u0000\u001a\u0016\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00060\u00060\u0010H\u0000\u001a0\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002\u001a\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0000\u001a0\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002\u001a\u001e\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00182\u0006\u0010\r\u001a\u00020\u0002H\u0000\u001a\b\u0010\u0019\u001a\u00020\u0006H\u0001\u001a0\u0010\u001a\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002\u001a\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0001\u001a\n\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0000\u001a0\u0010\u001d\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002\u001a0\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002\u001a\u001e\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00182\u0006\u0010\r\u001a\u00020\u0002H\u0000\u001a\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u0000\u001a\u00020\u0001H\u0002\u001a\b\u0010!\u001a\u00020\"H\u0001\u001a\b\u0010#\u001a\u00020\"H\u0001\u001a\u000f\u0010$\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0002\u0010%\u001a\u0010\u0010&\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u0002H\u0000\u001a\u000e\u0010'\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0000\u001a\u0013\u0010(\u001a\u0004\u0018\u00010)*\u00020\u0002H\u0000¢\u0006\u0002\u0010*\u001a\u0013\u0010+\u001a\u0004\u0018\u00010)*\u00020\u0002H\u0000¢\u0006\u0002\u0010*\u001a\u000e\u0010,\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0000\u001a\u0013\u0010-\u001a\u0004\u0018\u00010.*\u00020\u0002H\u0000¢\u0006\u0002\u0010/\u001a\u000e\u00100\u001a\u0004\u0018\u000101*\u00020\u0002H\u0000\u001a\u000e\u00102\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0000\u001a\u000e\u00103\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0000\u001a\u000e\u00104\u001a\u0004\u0018\u000105*\u00020\u0002H\u0000\u001a\u0013\u00106\u001a\u0004\u0018\u00010.*\u00020\u0002H\u0000¢\u0006\u0002\u0010/\u001a\u0013\u00107\u001a\u0004\u0018\u00010\"*\u00020\u0002H\u0000¢\u0006\u0002\u00108\u001a\f\u00109\u001a\u00020\"*\u00020\u0002H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006:"}, d2 = {"packageInfo", "Landroid/content/pm/PackageInfo;", "Landroid/content/Context;", "getPackageInfo", "(Landroid/content/Context;)Landroid/content/pm/PackageInfo;", "versionCodeString", BuildConfig.FLAVOR, "getVersionCodeString", "(Landroid/content/pm/PackageInfo;)Ljava/lang/String;", "getAdditionalInfoProperties", "Ljava/util/HashMap;", BuildConfig.FLAVOR, "Lkotlin/collections/HashMap;", "context", "getAdditionalLivenessMetadata", "getArchitectures", BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "getBatteryInfoProperties", "getBootTime", "Ljava/util/Date;", "getCarrierInfo", "getDeviceBasicProperties", "getDeviceProperties", BuildConfig.FLAVOR, "getDeviceSerialNumber", "getDisplayInfoProperties", "getInstalledApps", "getKernelVersion", "getMemoryInfoProperties", "getNetworkInfoProperties", "getOsProperties", "getVersionCodeDep", "isAPI21OrAbove", BuildConfig.FLAVOR, "isAPI23OrAbove", "isEmulator", "()Ljava/lang/Boolean;", "isVpnActive", "getAppName", "getBatteryPercentage", BuildConfig.FLAVOR, "(Landroid/content/Context;)Ljava/lang/Float;", "getBatteryTemperature", "getDeviceId", "getFreeStorage", BuildConfig.FLAVOR, "(Landroid/content/Context;)Ljava/lang/Long;", "getMemoryInfo", "Landroid/app/ActivityManager$MemoryInfo;", "getNetworkType", "getOrientation", "getTimeZone", "Ljava/util/TimeZone;", "getTotalStorage", "isCharging", "(Landroid/content/Context;)Ljava/lang/Boolean;", "isNetworkAvailable", "hypersnapsdk_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeviceExtensionsKt {
    private static final HashMap<String, Object> getAdditionalInfoProperties(Context context) {
        HashMap<String, Object> hashMap = new HashMap<>();
        TimeZone timeZone = getTimeZone(context);
        hashMap.put("timezone", timeZone != null ? timeZone.getID() : null);
        hashMap.put("language", Locale.getDefault().getDisplayName());
        hashMap.put("orientation", getOrientation(context));
        hashMap.put("bootTime", getBootTime());
        return hashMap;
    }

    public static final HashMap<String, Object> getAdditionalLivenessMetadata(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HashMap<String, Object> hashMap = new HashMap<>();
        HashMap<String, Object> deviceBasicProperties = getDeviceBasicProperties(context);
        deviceBasicProperties.put("bootLoaderVersion", Build.BOOTLOADER);
        deviceBasicProperties.put("deviceFingerprint", Build.FINGERPRINT);
        deviceBasicProperties.put("serialNumber", getDeviceSerialNumber());
        deviceBasicProperties.put("installedApps", getInstalledApps(context));
        hashMap.put("deviceInfo", deviceBasicProperties);
        HashMap<String, Object> networkInfoProperties = getNetworkInfoProperties(context);
        networkInfoProperties.put("carrierName", getCarrierInfo(context));
        networkInfoProperties.put("isVpnActive", Boolean.valueOf(isVpnActive(context)));
        hashMap.put("networkInfo", networkInfoProperties);
        hashMap.put("additionalInfo", getAdditionalInfoProperties(context));
        hashMap.put("batteryInfo", getBatteryInfoProperties(context));
        hashMap.put("memoryInfo", getMemoryInfoProperties(context));
        hashMap.put("displayInfo", getDisplayInfoProperties(context));
        hashMap.put("osInfo", getOsProperties(context));
        return hashMap;
    }

    public static final String getAppName(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "applicationInfo");
            int i10 = applicationInfo.labelRes;
            if (i10 != 0) {
                return context.getString(i10);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final List<String> getArchitectures() {
        if (!isAPI21OrAbove()) {
            return CollectionsKt.m(Build.CPU_ABI, Build.CPU_ABI2);
        }
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        return AbstractC3574i.v0(SUPPORTED_ABIS);
    }

    private static final HashMap<String, Object> getBatteryInfoProperties(Context context) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("level", getBatteryPercentage(context));
        hashMap.put("charging", isCharging(context));
        hashMap.put("temperature", getBatteryTemperature(context));
        return hashMap;
    }

    public static final Float getBatteryPercentage(Context context) {
        Object b10;
        int intExtra;
        int intExtra2;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            o.a aVar = lc.o.f37128b;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : -1;
            intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        if (intExtra != -1 && intExtra2 != -1) {
            b10 = lc.o.b(Float.valueOf((intExtra / intExtra2) * 100.0f));
            return (Float) (lc.o.f(b10) ? null : b10);
        }
        return null;
    }

    public static final Float getBatteryTemperature(Context context) {
        Object b10;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            o.a aVar = lc.o.f37128b;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("temperature", -1) : -1;
            b10 = lc.o.b(intExtra != -1 ? Float.valueOf(intExtra / 10) : null);
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        return (Float) (lc.o.f(b10) ? null : b10);
    }

    public static final Date getBootTime() {
        Object b10;
        try {
            o.a aVar = lc.o.f37128b;
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.setTimeInMillis(System.currentTimeMillis() - SystemClock.elapsedRealtime());
            b10 = lc.o.b(calendar.getTime());
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        if (lc.o.f(b10)) {
            b10 = null;
        }
        return (Date) b10;
    }

    public static final String getCarrierInfo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("phone");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String simOperatorName = ((TelephonyManager) systemService).getSimOperatorName();
        return simOperatorName == null ? "unknown" : simOperatorName;
    }

    private static final HashMap<String, Object> getDeviceBasicProperties(Context context) {
        String str;
        List j10;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("name", Settings.Global.getString(context.getContentResolver(), "device_name"));
        String model = Build.MODEL;
        hashMap.put("model", model);
        if (model != null) {
            Intrinsics.checkNotNullExpressionValue(model, "model");
            List split$default = StringsKt.split$default(model, new String[]{" "}, false, 0, 6, null);
            if (split$default != null) {
                if (!split$default.isEmpty()) {
                    ListIterator listIterator = split$default.listIterator(split$default.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            j10 = CollectionsKt.G0(split$default, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                j10 = CollectionsKt.j();
                if (j10 != null) {
                    str = (String) CollectionsKt.f0(j10, 0);
                    hashMap.put("family", str);
                    List<String> architectures = getArchitectures();
                    hashMap.put("archs", architectures);
                    hashMap.put("arch", CollectionsKt.f0(architectures, 0));
                    hashMap.put("manufacturer", Build.MANUFACTURER);
                    hashMap.put("brand", Build.BRAND);
                    hashMap.put("modelId", Build.ID);
                    hashMap.put("simulator", isEmulator());
                    return hashMap;
                }
            }
        }
        str = null;
        hashMap.put("family", str);
        List<String> architectures2 = getArchitectures();
        hashMap.put("archs", architectures2);
        hashMap.put("arch", CollectionsKt.f0(architectures2, 0));
        hashMap.put("manufacturer", Build.MANUFACTURER);
        hashMap.put("brand", Build.BRAND);
        hashMap.put("modelId", Build.ID);
        hashMap.put("simulator", isEmulator());
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getDeviceId(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            o.a aVar = lc.o.f37128b;
            Charset charset = Charset.forName("UTF-8");
            File file = new File(context.getFilesDir(), AppConstants.DEVICE_ID);
            if (file.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    byte[] bArr = new byte[(int) randomAccessFile.length()];
                    randomAccessFile.readFully(bArr);
                    Intrinsics.checkNotNullExpressionValue(charset, "charset");
                    String str = new String(bArr, charset);
                    kotlin.io.c.a(randomAccessFile, null);
                    return str;
                } finally {
                }
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                    Intrinsics.checkNotNullExpressionValue(charset, "charset");
                    byte[] bytes = uuid.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    fileOutputStream.write(bytes);
                    fileOutputStream.flush();
                    kotlin.io.c.a(fileOutputStream, null);
                    return uuid;
                } finally {
                }
            }
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            Object b10 = lc.o.b(lc.p.a(th));
            return (String) (lc.o.f(b10) ? null : b10);
        }
        o.a aVar22 = lc.o.f37128b;
        Object b102 = lc.o.b(lc.p.a(th));
        return (String) (lc.o.f(b102) ? null : b102);
    }

    public static final Map<String, Object> getDeviceProperties(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HashMap<String, Object> deviceBasicProperties = getDeviceBasicProperties(context);
        deviceBasicProperties.put("additionalInfo", getAdditionalInfoProperties(context));
        deviceBasicProperties.put("batteryInfo", getBatteryInfoProperties(context));
        deviceBasicProperties.put("memoryInfo", getMemoryInfoProperties(context));
        deviceBasicProperties.put("networkInfo", getNetworkInfoProperties(context));
        deviceBasicProperties.put("displayInfo", getDisplayInfoProperties(context));
        return deviceBasicProperties;
    }

    public static final String getDeviceSerialNumber() {
        try {
            String serial = Build.VERSION.SDK_INT >= 26 ? Build.getSerial() : Build.SERIAL;
            Intrinsics.checkNotNullExpressionValue(serial, "{\n    if (Build.VERSION.…     Build.SERIAL\n    }\n}");
            return serial;
        } catch (SecurityException unused) {
            return "unknown";
        }
    }

    private static final HashMap<String, Object> getDisplayInfoProperties(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("screenDensity", Float.valueOf(displayMetrics.density));
        hashMap.put("screenDpi", Integer.valueOf(displayMetrics.densityDpi));
        hashMap.put("heightPixels", Integer.valueOf(displayMetrics.heightPixels));
        hashMap.put("widthPixels", Integer.valueOf(displayMetrics.widthPixels));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(displayMetrics.heightPixels);
        sb2.append('x');
        sb2.append(displayMetrics.widthPixels);
        hashMap.put("screenResolution", sb2.toString());
        return hashMap;
    }

    public static final Long getFreeStorage(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            o.a aVar = lc.o.f37128b;
            File externalFilesDir = context.getExternalFilesDir(null);
            StatFs statFs = new StatFs(externalFilesDir != null ? externalFilesDir.getPath() : null);
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            Object b10 = lc.o.b(lc.p.a(th));
            return (Long) (lc.o.f(b10) ? null : b10);
        }
    }

    public static final List<String> getInstalledApps(Context context) {
        List<ApplicationInfo> installedApplications;
        PackageManager.ApplicationInfoFlags of;
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ApplicationInfoFlags.of(128L);
            installedApplications = packageManager.getInstalledApplications(of);
        } else {
            installedApplications = packageManager.getInstalledApplications(128);
        }
        Intrinsics.checkNotNullExpressionValue(installedApplications, "if (Build.VERSION.SDK_IN…ager.GET_META_DATA)\n    }");
        List<ApplicationInfo> list = installedApplications;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ApplicationInfo) it.next()).packageName);
        }
        return arrayList;
    }

    public static final String getKernelVersion() {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            o.a aVar = lc.o.f37128b;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String readLine = bufferedReader.readLine();
                kotlin.io.c.a(bufferedReader, null);
                return readLine;
            } finally {
            }
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            lc.o.b(lc.p.a(th));
            return property;
        }
    }

    public static final ActivityManager.MemoryInfo getMemoryInfo(Context context) {
        Object b10;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            o.a aVar = lc.o.f37128b;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            b10 = lc.o.b(memoryInfo);
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        return (ActivityManager.MemoryInfo) (lc.o.f(b10) ? null : b10);
    }

    private static final HashMap<String, Object> getMemoryInfoProperties(Context context) {
        ActivityManager.MemoryInfo memoryInfo = getMemoryInfo(context);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("lowMemory", Boolean.valueOf(memoryInfo != null ? memoryInfo.lowMemory : false));
        hashMap.put("memorySizeBytes", memoryInfo != null ? Long.valueOf(memoryInfo.totalMem) : null);
        hashMap.put("freeMemoryBytes", memoryInfo != null ? Long.valueOf(memoryInfo.availMem) : null);
        hashMap.put("storageSizeBytes", getTotalStorage(context));
        hashMap.put("freeStorageBytes", getFreeStorage(context));
        return hashMap;
    }

    private static final HashMap<String, Object> getNetworkInfoProperties(Context context) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("connectionType", getNetworkType(context));
        hashMap.put("online", Boolean.valueOf(isNetworkAvailable(context)));
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getNetworkType(Context context) {
        Object b10;
        ConnectivityManager connectivityManager;
        String str;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            o.a aVar = lc.o.f37128b;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            connectivityManager = (ConnectivityManager) systemService;
            str = "ethernet";
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        if (isAPI23OrAbove()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            Intrinsics.d(networkCapabilities);
            if (!networkCapabilities.hasTransport(1)) {
                if (!networkCapabilities.hasTransport(0)) {
                    if (networkCapabilities.hasTransport(3)) {
                        b10 = lc.o.b(str);
                        return (String) (lc.o.f(b10) ? null : b10);
                    }
                    str = null;
                    b10 = lc.o.b(str);
                    return (String) (lc.o.f(b10) ? null : b10);
                }
                str = "cellular";
                b10 = lc.o.b(str);
                return (String) (lc.o.f(b10) ? null : b10);
            }
            str = "wifi";
            b10 = lc.o.b(str);
            return (String) (lc.o.f(b10) ? null : b10);
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        Integer valueOf = activeNetworkInfo != null ? Integer.valueOf(activeNetworkInfo.getType()) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            str = "wifi";
            b10 = lc.o.b(str);
            return (String) (lc.o.f(b10) ? null : b10);
        }
        if (valueOf.intValue() == 9) {
            b10 = lc.o.b(str);
            return (String) (lc.o.f(b10) ? null : b10);
        }
        if (valueOf != null && valueOf.intValue() == 0) {
            str = "cellular";
            b10 = lc.o.b(str);
            return (String) (lc.o.f(b10) ? null : b10);
        }
        str = null;
        b10 = lc.o.b(str);
        return (String) (lc.o.f(b10) ? null : b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getOrientation(Context context) {
        Object b10;
        int i10;
        String str;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            o.a aVar = lc.o.f37128b;
            i10 = context.getResources().getConfiguration().orientation;
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        if (i10 != 0) {
            if (i10 == 1) {
                str = "portrait";
            } else if (i10 == 2) {
                str = "landscape";
            }
            b10 = lc.o.b(str);
            return (String) (lc.o.f(b10) ? null : b10);
        }
        str = null;
        b10 = lc.o.b(str);
        return (String) (lc.o.f(b10) ? null : b10);
    }

    public static final Map<String, Object> getOsProperties(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HashMap hashMap = new HashMap();
        hashMap.put("name", "Android");
        hashMap.put("version", Build.VERSION.RELEASE);
        hashMap.put("build", Build.DISPLAY);
        hashMap.put("kernelVersion", getKernelVersion());
        hashMap.put("rooted", Boolean.valueOf(new RootChecker(context).isDeviceRooted$hypersnapsdk_release()));
        return hashMap;
    }

    public static final PackageInfo getPackageInfo(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        Intrinsics.checkNotNullExpressionValue(packageInfo, "packageManager.getPackageInfo(packageName, 0)");
        return packageInfo;
    }

    public static final TimeZone getTimeZone(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        Intrinsics.checkNotNullExpressionValue(locales, "resources.configuration.locales");
        return !locales.isEmpty() ? Calendar.getInstance(locales.get(0)).getTimeZone() : Calendar.getInstance().getTimeZone();
    }

    public static final Long getTotalStorage(Context context) {
        Object b10;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            o.a aVar = lc.o.f37128b;
            File externalFilesDir = context.getExternalFilesDir(null);
            StatFs statFs = new StatFs(externalFilesDir != null ? externalFilesDir.getPath() : null);
            b10 = lc.o.b(Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong()));
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        return (Long) (lc.o.f(b10) ? null : b10);
    }

    private static final String getVersionCodeDep(PackageInfo packageInfo) {
        Object valueOf;
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = Long.valueOf(longVersionCode);
        } else {
            valueOf = Integer.valueOf(packageInfo.versionCode);
        }
        return valueOf.toString();
    }

    public static final String getVersionCodeString(PackageInfo packageInfo) {
        long longVersionCode;
        Intrinsics.checkNotNullParameter(packageInfo, "<this>");
        if (Build.VERSION.SDK_INT < 28) {
            return getVersionCodeDep(packageInfo);
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return String.valueOf(longVersionCode);
    }

    public static final boolean isAPI21OrAbove() {
        return true;
    }

    public static final boolean isAPI23OrAbove() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        if (r3.intValue() != 1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Boolean isCharging(Context context) {
        Object b10;
        Integer valueOf;
        boolean z10;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            o.a aVar = lc.o.f37128b;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            valueOf = registerReceiver != null ? Integer.valueOf(registerReceiver.getIntExtra("plugged", -1)) : null;
            z10 = true;
            if (valueOf != null) {
            }
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        if (valueOf != null && valueOf.intValue() == 2) {
            b10 = lc.o.b(Boolean.valueOf(z10));
            return (Boolean) (lc.o.f(b10) ? null : b10);
        }
        z10 = false;
        b10 = lc.o.b(Boolean.valueOf(z10));
        return (Boolean) (lc.o.f(b10) ? null : b10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d8, code lost:
    
        if (kotlin.text.StringsKt.K(r1, "simulator", false, 2, null) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Boolean isEmulator() {
        Object b10;
        String BRAND;
        boolean z10;
        try {
            o.a aVar = lc.o.f37128b;
            BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            z10 = false;
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        if (StringsKt.F(BRAND, "generic", false, 2, null)) {
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (!StringsKt.F(DEVICE, "generic", false, 2, null)) {
            }
            z10 = true;
            b10 = lc.o.b(Boolean.valueOf(z10));
            return (Boolean) (lc.o.f(b10) ? null : b10);
        }
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (!StringsKt.F(FINGERPRINT, "generic", false, 2, null)) {
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            if (!StringsKt.F(FINGERPRINT, "unknown", false, 2, null)) {
                String HARDWARE = Build.HARDWARE;
                Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                if (!StringsKt.K(HARDWARE, "goldfish", false, 2, null)) {
                    Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                    if (!StringsKt.K(HARDWARE, "ranchu", false, 2, null)) {
                        String MODEL = Build.MODEL;
                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                        if (!StringsKt.K(MODEL, "google_sdk", false, 2, null)) {
                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                            if (!StringsKt.K(MODEL, "Emulator", false, 2, null)) {
                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                if (!StringsKt.K(MODEL, "Android SDK built for x86", false, 2, null)) {
                                    String MANUFACTURER = Build.MANUFACTURER;
                                    Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                    if (!StringsKt.K(MANUFACTURER, "Genymotion", false, 2, null)) {
                                        String PRODUCT = Build.PRODUCT;
                                        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                        if (!StringsKt.K(PRODUCT, "sdk_google", false, 2, null)) {
                                            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                            if (!StringsKt.K(PRODUCT, "google_sdk", false, 2, null)) {
                                                Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                if (!StringsKt.K(PRODUCT, "sdk", false, 2, null)) {
                                                    Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                    if (!StringsKt.K(PRODUCT, "sdk_x86", false, 2, null)) {
                                                        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                        if (!StringsKt.K(PRODUCT, "vbox86p", false, 2, null)) {
                                                            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                            if (!StringsKt.K(PRODUCT, "emulator", false, 2, null)) {
                                                                Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        z10 = true;
        b10 = lc.o.b(Boolean.valueOf(z10));
        return (Boolean) (lc.o.f(b10) ? null : b10);
    }

    public static final boolean isNetworkAvailable(Context context) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 29) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(2);
    }

    public static final boolean isVpnActive(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network[] allNetworks = connectivityManager.getAllNetworks();
        Intrinsics.checkNotNullExpressionValue(allNetworks, "connectivityManager.allNetworks");
        for (Network network : allNetworks) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                return true;
            }
        }
        return false;
    }
}
