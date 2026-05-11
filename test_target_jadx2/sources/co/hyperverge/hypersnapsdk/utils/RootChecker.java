package co.hyperverge.hypersnapsdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.o;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lco/hyperverge/hypersnapsdk/utils/RootChecker;", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isDeviceRooted", BuildConfig.FLAVOR, "isDeviceRooted$hypersnapsdk_release", "()Z", "checkRootFiles", "checkRootPackages", "checkSUExist", "checkTestKeys", "Companion", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RootChecker {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final String[] rootFiles = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
    private static final String[] rootPackages = {"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
    private final Context context;

    public RootChecker(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final boolean checkRootFiles() {
        for (String str : rootFiles) {
            try {
                o.a aVar = lc.o.f37128b;
            } catch (Throwable th) {
                o.a aVar2 = lc.o.f37128b;
                lc.o.b(lc.p.a(th));
            }
            if (new File(str).exists()) {
                return true;
            }
            lc.o.b(Unit.f36324a);
        }
        return false;
    }

    private final boolean checkRootPackages() {
        PackageManager packageManager = this.context.getPackageManager();
        if (packageManager != null) {
            for (String str : rootPackages) {
                try {
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    private final boolean checkSUExist() {
        Process process = null;
        try {
            Process exec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream(), UTF_8));
                try {
                    boolean z10 = bufferedReader.readLine() != null;
                    kotlin.io.c.a(bufferedReader, null);
                    exec.destroy();
                    return z10;
                } finally {
                }
            } catch (Exception unused) {
                process = exec;
                if (process != null) {
                    process.destroy();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                process = exec;
                if (process != null) {
                    process.destroy();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final boolean checkTestKeys() {
        String str = Build.TAGS;
        return str != null && StringsKt.K(str, "test-keys", false, 2, null);
    }

    public final boolean isDeviceRooted$hypersnapsdk_release() {
        return checkTestKeys() || checkRootFiles() || checkSUExist() || checkRootPackages();
    }
}
