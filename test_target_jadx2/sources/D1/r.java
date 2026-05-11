package D1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x1.AbstractC5094A;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1153a;

    static {
        String i10 = x1.n.i("ProcessUtils");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"ProcessUtils\")");
        f1153a = i10;
    }

    private static final String a(Context context) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            return C0771a.f1136a.a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, AbstractC5094A.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            Intrinsics.d(invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            x1.n.e().b(f1153a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    public static final boolean b(Context context, androidx.work.a configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        String a10 = a(context);
        String c10 = configuration.c();
        return (c10 == null || c10.length() == 0) ? Intrinsics.b(a10, context.getApplicationInfo().processName) : Intrinsics.b(a10, configuration.c());
    }
}
