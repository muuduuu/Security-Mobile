package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.common.C2017i;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFj1kSDK {
    public static long AFAdRevenueData(Context context, String str) {
        long longVersionCode;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT < 28) {
                return packageInfo.versionCode;
            }
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
            return 0L;
        }
    }

    public static boolean L_(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, String> M_(PackageInfo packageInfo, Map<String, String> map, Uri uri) {
        char c10;
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            String str = "media_source";
            if (it.hasNext()) {
                String next = it.next();
                String queryParameter = uri.getQueryParameter(next);
                if (!map.containsKey(next)) {
                    int hashCode = next.hashCode();
                    if (hashCode == -1420799080) {
                        if (next.equals("af_prt")) {
                            c10 = 2;
                            if (c10 != 0) {
                            }
                        }
                        c10 = 65535;
                        if (c10 != 0) {
                        }
                    } else if (hashCode != 99) {
                        if (hashCode == 110987 && next.equals("pid")) {
                            c10 = 1;
                            if (c10 != 0) {
                                str = "campaign";
                            } else if (c10 != 1) {
                                if (c10 == 2) {
                                    str = "agency";
                                }
                            }
                        }
                        c10 = 65535;
                        if (c10 != 0) {
                        }
                    } else {
                        if (next.equals("c")) {
                            c10 = 0;
                            if (c10 != 0) {
                            }
                        }
                        c10 = 65535;
                        if (c10 != 0) {
                        }
                    }
                    map.put(str, queryParameter);
                }
                str = next;
                map.put(str, queryParameter);
            } else {
                try {
                    break;
                } catch (Exception e10) {
                    AFLogger.afErrorLog("Could not fetch install time. ", e10);
                }
            }
        }
        if (!map.containsKey("install_time")) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long j10 = packageInfo.firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("install_time", simpleDateFormat.format(new Date(j10)));
        }
        if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
            map.put("af_status", "Non-organic");
        }
        if (map.containsKey("agency")) {
            map.remove("media_source");
        }
        String path = uri.getPath();
        if (path != null) {
            map.put("path", path);
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            map.put("scheme", scheme);
        }
        String host = uri.getHost();
        if (host != null) {
            map.put("host", host);
        }
        return map;
    }

    public static String N_(PackageManager packageManager, String str) {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    public static Application O_(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        try {
            return (Application) context.getApplicationContext();
        } catch (ClassCastException unused) {
            AFLogger.afErrorLog("Application or Activity Context should be used", new IllegalStateException(), true, true);
            return null;
        }
    }

    public static boolean getCurrencyIso4217Code(Context context) {
        if (context == null) {
            return false;
        }
        try {
            IntegrityManagerFactory.create(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean getMediationNetwork(Context context) {
        if (context != null) {
            try {
                if (C2017i.q().i(context) == 0) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean getMonetizationNetwork(Context context) {
        if (context == null) {
            return false;
        }
        try {
            AppSet.getClient(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean getRevenue(Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 33) {
            try {
                return androidx.privacysandbox.ads.adservices.measurement.f.a(context.getApplicationContext().getSystemService(androidx.privacysandbox.ads.adservices.measurement.e.a())) != null;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, th.getMessage() != null ? th.getMessage() : BuildConfig.FLAVOR, th, false, false);
            }
        }
        return false;
    }

    public static boolean getMonetizationNetwork(Context context, String str) {
        int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb2 = new StringBuilder("is Permission Available: ");
        sb2.append(str);
        sb2.append("; res: ");
        sb2.append(checkPermission);
        AFLogger.afRDLog(sb2.toString());
        return checkPermission == 0;
    }

    public static Pair<Long, String> getMediationNetwork(Context context, String str) {
        long j10;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                j10 = packageInfo.getLongVersionCode();
            } else {
                j10 = packageInfo.versionCode;
            }
            return new Pair<>(Long.valueOf(j10), packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            return new Pair<>(0L, BuildConfig.FLAVOR);
        }
    }

    public static boolean getRevenue() {
        return Build.BRAND.equals("OPPO");
    }

    public static String getRevenue(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
            return BuildConfig.FLAVOR;
        }
    }
}
