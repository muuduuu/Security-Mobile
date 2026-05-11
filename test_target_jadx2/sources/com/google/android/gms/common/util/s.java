package com.google.android.gms.common.util;

import V6.AbstractC1287s;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import d7.C2998d;
import java.lang.reflect.Method;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f23540a = Process.myUid();

    /* renamed from: b, reason: collision with root package name */
    private static final Method f23541b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f23542c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f23543d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f23544e;

    /* renamed from: f, reason: collision with root package name */
    private static final Method f23545f;

    /* renamed from: g, reason: collision with root package name */
    private static final Method f23546g;

    /* renamed from: h, reason: collision with root package name */
    private static final Method f23547h;

    /* renamed from: i, reason: collision with root package name */
    private static final Method f23548i;

    /* renamed from: j, reason: collision with root package name */
    private static Boolean f23549j;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f23541b = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f23542c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f23543d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        f23544e = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
            method5 = null;
        }
        f23545f = method5;
        if (m.f()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
            }
            f23546g = method6;
            if (m.f()) {
                try {
                    method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
                } catch (Exception e11) {
                    Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
                }
                f23547h = method7;
                if (m.f()) {
                    try {
                        method8 = WorkSource.class.getMethod("isEmpty", null);
                        try {
                            method8.setAccessible(true);
                        } catch (Exception unused6) {
                        }
                    } catch (Exception unused7) {
                    }
                    f23548i = method8;
                    f23549j = null;
                }
                method8 = null;
                f23548i = method8;
                f23549j = null;
            }
            method7 = null;
            f23547h = method7;
            if (m.f()) {
            }
            method8 = null;
            f23548i = method8;
            f23549j = null;
        }
        method6 = null;
        f23546g = method6;
        if (m.f()) {
        }
        method7 = null;
        f23547h = method7;
        if (m.f()) {
        }
        method8 = null;
        f23548i = method8;
        f23549j = null;
    }

    public static void a(WorkSource workSource, int i10, String str) {
        Method method = f23542c;
        if (method != null) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f23541b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo c10 = C2998d.a(context).c(str, 0);
                if (c10 == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = c10.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static synchronized boolean c(Context context) {
        synchronized (s.class) {
            Boolean bool = f23549j;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (context == null) {
                return false;
            }
            boolean z10 = androidx.core.content.a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
            f23549j = Boolean.valueOf(z10);
            return z10;
        }
    }

    public static boolean d(WorkSource workSource) {
        Method method = f23548i;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                AbstractC1287s.m(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
        }
        return e(workSource) == 0;
    }

    public static int e(WorkSource workSource) {
        Method method = f23543d;
        if (method == null) {
            return 0;
        }
        try {
            Object invoke = method.invoke(workSource, null);
            AbstractC1287s.m(invoke);
            return ((Integer) invoke).intValue();
        } catch (Exception e10) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            return 0;
        }
    }
}
