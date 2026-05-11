package X8;

import V6.C1279j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* renamed from: X8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1297c {

    /* renamed from: a, reason: collision with root package name */
    private static final C1279j f11784a = new C1279j("CommonUtils", BuildConfig.FLAVOR);

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            f11784a.c("CommonUtils", "Exception thrown when trying to get app version ".concat(e10.toString()));
            return BuildConfig.FLAVOR;
        }
    }

    public static String b(Locale locale) {
        if (com.google.android.gms.common.util.m.c()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb2 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb2.append("-");
            sb2.append(locale.getVariant());
        }
        return sb2.toString();
    }
}
