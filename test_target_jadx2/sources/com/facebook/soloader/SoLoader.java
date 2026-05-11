package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import p5.AbstractC3794a;
import p5.C3796c;
import q5.AbstractC3922b;
import r5.C4018f;
import r5.InterfaceC4020h;
import r5.InterfaceC4021i;

/* loaded from: classes2.dex */
public class SoLoader {

    /* renamed from: b, reason: collision with root package name */
    static x f23025b;

    /* renamed from: m, reason: collision with root package name */
    private static int f23036m;

    /* renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock f23026c = new ReentrantReadWriteLock();

    /* renamed from: d, reason: collision with root package name */
    static Context f23027d = null;

    /* renamed from: e, reason: collision with root package name */
    private static volatile E[] f23028e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicInteger f23029f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    private static InterfaceC4021i f23030g = null;

    /* renamed from: h, reason: collision with root package name */
    private static final Set f23031h = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: i, reason: collision with root package name */
    private static final Map f23032i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private static final Set f23033j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k, reason: collision with root package name */
    private static final Map f23034k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    private static boolean f23035l = true;

    /* renamed from: n, reason: collision with root package name */
    private static int f23037n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static l f23038o = null;

    /* renamed from: a, reason: collision with root package name */
    static final boolean f23024a = true;

    public static final class a extends UnsatisfiedLinkError {
        a(Throwable th, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.j()) + " error: " + str);
            initCause(th);
        }
    }

    private static int A() {
        ReentrantReadWriteLock reentrantReadWriteLock = f23026c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i10 = f23036m;
            int i11 = (i10 & 2) != 0 ? 1 : 0;
            if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                i11 |= 4;
            }
            if ((i10 & 128) == 0) {
                i11 |= 8;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i11;
        } catch (Throwable th) {
            f23026c.writeLock().unlock();
            throw th;
        }
    }

    private static int B(int i10) {
        return (i10 & 2048) != 0 ? 1 : 0;
    }

    private static InterfaceC4020h C(String str, UnsatisfiedLinkError unsatisfiedLinkError, InterfaceC4020h interfaceC4020h) {
        p.g("SoLoader", "Running a recovery step for " + str + " due to " + unsatisfiedLinkError.toString());
        ReentrantReadWriteLock reentrantReadWriteLock = f23026c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (interfaceC4020h == null) {
                try {
                    interfaceC4020h = j();
                    if (interfaceC4020h == null) {
                        p.g("SoLoader", "No recovery strategy");
                        throw unsatisfiedLinkError;
                    }
                } catch (v e10) {
                    p.c("SoLoader", "Base APK not found during recovery", e10);
                    throw e10;
                } catch (Exception e11) {
                    p.c("SoLoader", "Got an exception during recovery, will throw the initial error instead", e11);
                    throw unsatisfiedLinkError;
                }
            }
            if (D(unsatisfiedLinkError, interfaceC4020h)) {
                f23029f.getAndIncrement();
                reentrantReadWriteLock.writeLock().unlock();
                return interfaceC4020h;
            }
            reentrantReadWriteLock.writeLock().unlock();
            p.g("SoLoader", "Failed to recover");
            throw unsatisfiedLinkError;
        } catch (Throwable th) {
            f23026c.writeLock().unlock();
            throw th;
        }
    }

    private static boolean D(UnsatisfiedLinkError unsatisfiedLinkError, InterfaceC4020h interfaceC4020h) {
        AbstractC3922b.h(interfaceC4020h);
        try {
            boolean a10 = interfaceC4020h.a(unsatisfiedLinkError, f23028e);
            AbstractC3922b.g(null);
            return a10;
        } finally {
        }
    }

    private static void a(ArrayList arrayList, int i10) {
        C1998a c1998a = new C1998a(f23027d, i10);
        p.a("SoLoader", "Adding application source: " + c1998a.toString());
        arrayList.add(0, c1998a);
    }

    private static void b(Context context, ArrayList arrayList, boolean z10) {
        if ((f23036m & 8) != 0) {
            return;
        }
        arrayList.add(0, new C2000c(context, "lib-main", !z10));
    }

    private static void c(Context context, ArrayList arrayList) {
        C2001d c2001d = new C2001d(context);
        p.a("SoLoader", "validating/adding directApk source: " + c2001d.toString());
        if (c2001d.o()) {
            arrayList.add(0, c2001d);
        }
    }

    private static void d(ArrayList arrayList) {
        String str = SysUtil.k() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals(BuildConfig.FLAVOR)) {
            str = str2 + ":" + str;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(":")))) {
            p.a("SoLoader", "adding system library source: " + str3);
            arrayList.add(new C2003f(new File(str3), 2));
        }
    }

    private static void e(Context context, ArrayList arrayList) {
        F f10 = new F();
        p.a("SoLoader", "adding systemLoadWrapper source: " + f10);
        arrayList.add(0, f10);
    }

    private static void f() {
        if (!r()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    private static void g(String str, String str2, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z10;
        ReentrantReadWriteLock reentrantReadWriteLock = f23026c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f23028e == null) {
                p.b("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z10 = true;
            } else {
                z10 = false;
            }
            if (f23024a) {
                if (str2 != null) {
                    Api18TraceUtils.a("SoLoader.loadLibrary[", str2, "]");
                }
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (E e10 : f23028e) {
                            if (x(e10, str, i10, threadPolicy)) {
                                if (z10) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        throw B.b(str, f23027d, f23028e);
                    } catch (IOException e11) {
                        C c10 = new C(str, e11.toString());
                        c10.initCause(e11);
                        throw c10;
                    }
                } finally {
                }
            } finally {
                if (f23024a) {
                    if (str2 != null) {
                        Api18TraceUtils.b();
                    }
                    Api18TraceUtils.b();
                }
                if (z10) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        } finally {
        }
    }

    private static int h(Context context) {
        int i10 = f23037n;
        if (i10 != 0) {
            return i10;
        }
        if (context == null) {
            p.a("SoLoader", "context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i11 = applicationInfo.flags;
        int i12 = (i11 & 1) != 0 ? (i11 & 128) != 0 ? 3 : 2 : 1;
        p.a("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i12);
        return i12;
    }

    private static int i() {
        int i10 = f23037n;
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    public static void init(Context context, int i10) {
        k(context, i10, null);
    }

    private static synchronized InterfaceC4020h j() {
        InterfaceC4020h interfaceC4020h;
        synchronized (SoLoader.class) {
            InterfaceC4021i interfaceC4021i = f23030g;
            interfaceC4020h = interfaceC4021i == null ? null : interfaceC4021i.get();
        }
        return interfaceC4020h;
    }

    public static void k(Context context, int i10, x xVar) {
        if (r()) {
            p.g("SoLoader", "SoLoader already initialized");
            return;
        }
        p.g("SoLoader", "Initializing SoLoader: " + i10);
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean o10 = o(context);
            f23035l = o10;
            if (o10) {
                int h10 = h(context);
                f23037n = h10;
                if ((i10 & 128) == 0 && SysUtil.l(context, h10)) {
                    i10 |= 8;
                }
                p(context, xVar, i10);
                q(context, i10);
                p.f("SoLoader", "Init SoLoader delegate");
                AbstractC3794a.b(new u());
            } else {
                n();
                p.f("SoLoader", "Init System Loader delegate");
                AbstractC3794a.b(new C3796c());
            }
            p.g("SoLoader", "SoLoader initialized: " + i10);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static void l(Context context, l lVar) {
        synchronized (SoLoader.class) {
            f23038o = lVar;
        }
        init(context, 0);
    }

    public static void m(Context context, boolean z10) {
        try {
            k(context, z10 ? 1 : 0, null);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void n() {
        if (f23028e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f23026c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f23028e != null) {
                reentrantReadWriteLock.writeLock().unlock();
            } else {
                f23028e = new E[0];
                reentrantReadWriteLock.writeLock().unlock();
            }
        } catch (Throwable th) {
            f23026c.writeLock().unlock();
            throw th;
        }
    }

    private static boolean o(Context context) {
        String str;
        if (f23038o != null) {
            return true;
        }
        Bundle bundle = null;
        try {
            str = context.getPackageName();
        } catch (Exception e10) {
            e = e10;
            str = null;
        }
        try {
            bundle = context.getPackageManager().getApplicationInfo(str, 128).metaData;
        } catch (Exception e11) {
            e = e11;
            p.h("SoLoader", "Unexpected issue with package manager (" + str + ")", e);
            return bundle == null ? true : true;
        }
        if (bundle == null && !bundle.getBoolean("com.facebook.soloader.enabled", true)) {
            return false;
        }
    }

    private static synchronized void p(Context context, x xVar, int i10) {
        synchronized (SoLoader.class) {
            if (context != null) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        p.g("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                    } else {
                        context = applicationContext;
                    }
                    f23027d = context;
                    f23030g = new C4018f(context, B(i10));
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (xVar != null || f23025b == null) {
                if (xVar != null) {
                    f23025b = xVar;
                } else {
                    f23025b = new o(new y());
                }
            }
        }
    }

    private static void q(Context context, int i10) {
        if (f23028e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f23026c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f23028e != null) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            f23036m = i10;
            ArrayList arrayList = new ArrayList();
            boolean z10 = true;
            boolean z11 = (i10 & 512) != 0;
            boolean z12 = (i10 & 1024) != 0;
            if (z11) {
                e(context, arrayList);
            } else if (z12) {
                d(arrayList);
                arrayList.add(0, new C2002e("base"));
            } else {
                d(arrayList);
                if (context != null) {
                    if ((i10 & 1) != 0) {
                        a(arrayList, i());
                        p.a("SoLoader", "Adding exo package source: lib-main");
                        arrayList.add(0, new k(context, "lib-main"));
                    } else {
                        if (SysUtil.l(context, f23037n)) {
                            c(context, arrayList);
                        }
                        a(arrayList, i());
                        if ((i10 & 4096) == 0) {
                            z10 = false;
                        }
                        b(context, arrayList, z10);
                    }
                }
            }
            E[] eArr = (E[]) arrayList.toArray(new E[arrayList.size()]);
            int A10 = A();
            int length = eArr.length;
            while (true) {
                int i11 = length - 1;
                if (length <= 0) {
                    f23028e = eArr;
                    f23029f.getAndIncrement();
                    p.d("SoLoader", "init finish: " + f23028e.length + " SO sources prepared");
                    f23026c.writeLock().unlock();
                    return;
                }
                p.d("SoLoader", "Preparing SO source: " + eArr[i11]);
                boolean z13 = f23024a;
                if (z13) {
                    Api18TraceUtils.a("SoLoader", "_", eArr[i11].getClass().getSimpleName());
                }
                eArr[i11].e(A10);
                if (z13) {
                    Api18TraceUtils.b();
                }
                length = i11;
            }
        } catch (Throwable th) {
            f23026c.writeLock().unlock();
            throw th;
        }
    }

    public static boolean r() {
        if (f23028e != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f23026c;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z10 = f23028e != null;
            reentrantReadWriteLock.readLock().unlock();
            return z10;
        } catch (Throwable th) {
            f23026c.readLock().unlock();
            throw th;
        }
    }

    static void s(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        AbstractC3922b.d(str, i10);
        try {
            AbstractC3922b.c(null, w(str, null, null, i10 | 1, threadPolicy));
        } finally {
        }
    }

    public static boolean t(String str) {
        return f23035l ? u(str, 0) : AbstractC3794a.d(str);
    }

    public static boolean u(String str, int i10) {
        Boolean z10 = z(str);
        if (z10 != null) {
            return z10.booleanValue();
        }
        if (!f23035l) {
            return AbstractC3794a.d(str);
        }
        if (f23037n != 2) {
        }
        return y(str, i10);
    }

    private static boolean v(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        InterfaceC4020h interfaceC4020h = null;
        while (true) {
            try {
                return w(str, str2, str3, i10, threadPolicy);
            } catch (UnsatisfiedLinkError e10) {
                interfaceC4020h = C(str, e10, interfaceC4020h);
            }
        }
    }

    private static boolean w(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z10;
        Object obj;
        Object obj2;
        if (!TextUtils.isEmpty(str2) && f23033j.contains(str2)) {
            return false;
        }
        Set set = f23031h;
        if (set.contains(str) && str3 == null) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                if (!set.contains(str)) {
                    z10 = false;
                } else {
                    if (str3 == null) {
                        return false;
                    }
                    z10 = true;
                }
                Map map = f23032i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj3 = new Object();
                    map.put(str, obj3);
                    obj = obj3;
                }
                Map map2 = f23034k;
                if (map2.containsKey(str2)) {
                    obj2 = map2.get(str2);
                } else {
                    Object obj4 = new Object();
                    map2.put(str2, obj4);
                    obj2 = obj4;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = f23026c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        if (!z10) {
                            if (set.contains(str)) {
                                if (str3 == null) {
                                    reentrantReadWriteLock.readLock().unlock();
                                    return false;
                                }
                                z10 = true;
                            }
                            if (!z10) {
                                try {
                                    p.a("SoLoader", "About to load: " + str);
                                    g(str, str2, i10, threadPolicy);
                                    p.a("SoLoader", "Loaded: " + str);
                                    set.add(str);
                                } catch (UnsatisfiedLinkError e10) {
                                    String message = e10.getMessage();
                                    if (message == null || !message.contains("unexpected e_machine:")) {
                                        throw e10;
                                    }
                                    throw new a(e10, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                }
                            }
                        }
                        synchronized (obj2) {
                            if ((i10 & 16) == 0 && str3 != null) {
                                try {
                                    if (TextUtils.isEmpty(str2) || !f23033j.contains(str2)) {
                                        boolean z11 = f23024a;
                                        if (z11 && f23038o == null) {
                                            Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                        }
                                        try {
                                            p.a("SoLoader", "About to invoke JNI_OnLoad for merged library " + str2 + ", which was merged into " + str);
                                            l lVar = f23038o;
                                            if (lVar != null) {
                                                lVar.a(str2);
                                            } else {
                                                r.a(str2);
                                            }
                                            f23033j.add(str2);
                                            if (z11 && f23038o == null) {
                                                Api18TraceUtils.b();
                                            }
                                        } catch (UnsatisfiedLinkError e11) {
                                            throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e11);
                                        }
                                    }
                                } catch (Throwable th) {
                                    if (f23024a && f23038o == null) {
                                        Api18TraceUtils.b();
                                    }
                                    throw th;
                                } finally {
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return !z10;
                    }
                } catch (Throwable th2) {
                    f23026c.readLock().unlock();
                    throw th2;
                }
            } finally {
            }
        }
    }

    private static boolean x(E e10, String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        AbstractC3922b.l(e10);
        try {
            boolean z10 = e10.d(str, i10, threadPolicy) != 0;
            AbstractC3922b.k(null);
            return z10;
        } finally {
        }
    }

    private static boolean y(String str, int i10) {
        l lVar = f23038o;
        String b10 = lVar != null ? lVar.b(str) : r.b(str);
        String str2 = b10 != null ? b10 : str;
        AbstractC3922b.f(str, b10, i10);
        try {
            boolean v10 = v(System.mapLibraryName(str2), str, b10, i10, null);
            AbstractC3922b.e(null, v10);
            return v10;
        } finally {
        }
    }

    private static Boolean z(String str) {
        Boolean valueOf;
        if (f23028e != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f23026c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f23028e == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        try {
                            boolean contains = f23031h.contains(str);
                            boolean z10 = !contains;
                            if (!contains) {
                                System.loadLibrary(str);
                            }
                            valueOf = Boolean.valueOf(z10);
                        } finally {
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return valueOf;
                }
                f();
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th) {
            f23026c.readLock().unlock();
            throw th;
        }
    }
}
