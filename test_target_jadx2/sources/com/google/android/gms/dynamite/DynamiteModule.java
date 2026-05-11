package com.google.android.gms.dynamite;

import V6.AbstractC1286q;
import V6.AbstractC1287s;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C2018j;
import e7.BinderC3090b;
import e7.InterfaceC3089a;
import f7.AbstractC3149a;
import f7.AbstractC3150b;
import f7.AbstractC3152d;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class DynamiteModule {

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f23559h = null;

    /* renamed from: i, reason: collision with root package name */
    private static String f23560i = null;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f23561j = false;

    /* renamed from: k, reason: collision with root package name */
    private static int f23562k = -1;

    /* renamed from: l, reason: collision with root package name */
    private static Boolean f23563l;

    /* renamed from: r, reason: collision with root package name */
    private static n f23569r;

    /* renamed from: s, reason: collision with root package name */
    private static o f23570s;

    /* renamed from: a, reason: collision with root package name */
    private final Context f23571a;

    /* renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f23564m = new ThreadLocal();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f23565n = new c();

    /* renamed from: o, reason: collision with root package name */
    private static final b.a f23566o = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final b f23553b = new e();

    /* renamed from: c, reason: collision with root package name */
    public static final b f23554c = new f();

    /* renamed from: d, reason: collision with root package name */
    public static final b f23555d = new g();

    /* renamed from: e, reason: collision with root package name */
    public static final b f23556e = new h();

    /* renamed from: f, reason: collision with root package name */
    public static final b f23557f = new i();

    /* renamed from: g, reason: collision with root package name */
    public static final b f23558g = new j();

    /* renamed from: p, reason: collision with root package name */
    public static final b f23567p = new k();

    /* renamed from: q, reason: collision with root package name */
    public static final b f23568q = new com.google.android.gms.dynamite.a();

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, Throwable th, byte[] bArr) {
            super(str, th);
        }

        /* synthetic */ a(String str, byte[] bArr) {
            super(str);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z10);

            int b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0394b {

            /* renamed from: a, reason: collision with root package name */
            public int f23572a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f23573b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f23574c = 0;
        }

        C0394b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        AbstractC1287s.m(context);
        this.f23571a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC1286q.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(valueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return e(context, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02e4 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02db A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DynamiteModule d(Context context, b bVar, String str) {
        Context context2;
        int i10;
        DynamiteModule i11;
        int i12;
        Boolean bool;
        InterfaceC3089a m12;
        o oVar;
        boolean z10;
        InterfaceC3089a m13;
        ?? r42 = ":";
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context", null);
        }
        ThreadLocal threadLocal = f23564m;
        l lVar = (l) threadLocal.get();
        l lVar2 = new l(null);
        threadLocal.set(lVar2);
        ThreadLocal threadLocal2 = f23565n;
        Long l10 = (Long) threadLocal2.get();
        long longValue = l10.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            b.C0394b a10 = bVar.a(context, str, f23566o);
            int i13 = a10.f23572a;
            int i14 = a10.f23573b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(i13).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(i14).length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i13);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i14);
            Log.i("DynamiteModule", sb2.toString());
            int i15 = a10.f23574c;
            if (i15 != 0) {
                if (i15 == -1) {
                    if (a10.f23572a != 0) {
                        i15 = -1;
                    }
                }
                if (i15 != 1 || a10.f23573b != 0) {
                    if (i15 == -1) {
                        DynamiteModule i16 = i(applicationContext, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l10);
                        }
                        Cursor cursor = lVar2.f23575a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(lVar);
                        return i16;
                    }
                    if (i15 != 1) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i15).length() + 36);
                        sb3.append("VersionPolicy returned invalid code:");
                        sb3.append(i15);
                        throw new a(sb3.toString(), null);
                    }
                    try {
                        try {
                            i12 = a10.f23573b;
                        } catch (a e10) {
                            e = e10;
                            context2 = r42;
                            String message = e.getMessage();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + 30);
                            sb4.append("Failed to load remote module: ");
                            sb4.append(message);
                            Log.w("DynamiteModule", sb4.toString());
                            i10 = a10.f23572a;
                            if (i10 != 0 || bVar.a(context2, str, new m(i10, 0)).f23574c != -1) {
                                throw new a("Remote load failed. No local fallback found.", e, null);
                            }
                            i11 = i(applicationContext, str);
                            return i11;
                        }
                    } catch (a e11) {
                        e = e11;
                        context2 = context;
                        String message2 = e.getMessage();
                        StringBuilder sb42 = new StringBuilder(String.valueOf(message2).length() + 30);
                        sb42.append("Failed to load remote module: ");
                        sb42.append(message2);
                        Log.w("DynamiteModule", sb42.toString());
                        i10 = a10.f23572a;
                        if (i10 != 0) {
                        }
                        throw new a("Remote load failed. No local fallback found.", e, null);
                    }
                    try {
                        synchronized (DynamiteModule.class) {
                            if (!f(context)) {
                                throw new a("Remote loading disabled", null);
                            }
                            bool = f23559h;
                        }
                        if (bool == null) {
                            throw new a("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i12).length());
                            sb5.append("Selected remote version of ");
                            sb5.append(str);
                            sb5.append(", version >= ");
                            sb5.append(i12);
                            Log.i("DynamiteModule", sb5.toString());
                            synchronized (DynamiteModule.class) {
                                oVar = f23570s;
                            }
                            if (oVar == null) {
                                throw new a("DynamiteLoaderV2 was not cached.", null);
                            }
                            l lVar3 = (l) threadLocal.get();
                            if (lVar3 == null || lVar3.f23575a == null) {
                                throw new a("No result cursor", null);
                            }
                            Context applicationContext2 = context.getApplicationContext();
                            Cursor cursor2 = lVar3.f23575a;
                            BinderC3090b.m1(null);
                            synchronized (DynamiteModule.class) {
                                z10 = f23562k >= 2;
                            }
                            if (z10) {
                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                m13 = oVar.n1(BinderC3090b.m1(applicationContext2), str, i12, BinderC3090b.m1(cursor2));
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                m13 = oVar.m1(BinderC3090b.m1(applicationContext2), str, i12, BinderC3090b.m1(cursor2));
                            }
                            Context context3 = (Context) BinderC3090b.l1(m13);
                            if (context3 == null) {
                                throw new a("Failed to get module context", null);
                            }
                            i11 = new DynamiteModule(context3);
                        } else {
                            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i12).length());
                            sb6.append("Selected remote version of ");
                            sb6.append(str);
                            sb6.append(", version >= ");
                            sb6.append(i12);
                            Log.i("DynamiteModule", sb6.toString());
                            n k10 = k(context);
                            if (k10 == null) {
                                throw new a("Failed to create IDynamiteLoader.", null);
                            }
                            int q12 = k10.q1();
                            if (q12 >= 3) {
                                l lVar4 = (l) threadLocal.get();
                                if (lVar4 == null) {
                                    throw new a("No cached result cursor holder", null);
                                }
                                m12 = k10.s1(BinderC3090b.m1(context), str, i12, BinderC3090b.m1(lVar4.f23575a));
                            } else if (q12 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                m12 = k10.o1(BinderC3090b.m1(context), str, i12);
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                m12 = k10.m1(BinderC3090b.m1(context), str, i12);
                            }
                            Object l12 = BinderC3090b.l1(m12);
                            if (l12 == null) {
                                throw new a("Failed to load remote module.", null);
                            }
                            i11 = new DynamiteModule((Context) l12);
                        }
                        return i11;
                    } catch (RemoteException e12) {
                        throw new a("Failed to load remote module.", e12, null);
                    } catch (a e13) {
                        throw e13;
                    } catch (Throwable th) {
                        com.google.android.gms.common.util.h.a(context, th);
                        throw new a("Failed to load remote module.", th, null);
                    }
                }
            }
            int i17 = a10.f23572a;
            int i18 = a10.f23573b;
            StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i17).length() + 23 + String.valueOf(i18).length() + 1);
            sb7.append("No acceptable module ");
            sb7.append(str);
            sb7.append(" found. Local version is ");
            sb7.append(i17);
            sb7.append(" and remote version is ");
            sb7.append(i18);
            sb7.append(".");
            throw new a(sb7.toString(), null);
        } finally {
            if (longValue == 0) {
                f23565n.remove();
            } else {
                f23565n.set(l10);
            }
            Cursor cursor3 = lVar2.f23575a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f23564m.set(lVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0172, code lost:
    
        if (r0 != 0) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01da -> B:25:0x01df). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01dc -> B:25:0x01df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(Context context, String str, boolean z10) {
        Field declaredField;
        Throwable th;
        RemoteException e10;
        String str2;
        String str3;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f23559h;
                Cursor cursor2 = null;
                int i10 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        String obj = e11.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(obj);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                j(classLoader);
                            } catch (a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!f(context)) {
                                return 0;
                            }
                            if (!f23561j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int g10 = g(context, str, z10, true);
                                        String str4 = f23560i;
                                        if (str4 != null && !str4.isEmpty()) {
                                            ClassLoader a10 = AbstractC3152d.a();
                                            if (a10 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    AbstractC3150b.a();
                                                    String str5 = f23560i;
                                                    AbstractC1287s.m(str5);
                                                    a10 = AbstractC3149a.a(str5, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str6 = f23560i;
                                                    AbstractC1287s.m(str6);
                                                    a10 = new com.google.android.gms.dynamite.b(str6, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            j(a10);
                                            declaredField.set(null, a10);
                                            f23559h = bool2;
                                            return g10;
                                        }
                                        return g10;
                                    } catch (a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f23559h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return g(context, str, z10, false);
                    } catch (a e12) {
                        String message = e12.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb3.append("Failed to retrieve remote module version: ");
                        sb3.append(message);
                        Log.w("DynamiteModule", sb3.toString());
                        return 0;
                    }
                }
                String str7 = "Failed to retrieve remote module version: ";
                n k10 = k(context);
                try {
                    if (k10 != null) {
                        try {
                            int q12 = k10.q1();
                            if (q12 >= 3) {
                                l lVar = (l) f23564m.get();
                                if (lVar == null || (cursor = lVar.f23575a) == null) {
                                    Cursor cursor3 = (Cursor) BinderC3090b.l1(k10.r1(BinderC3090b.m1(context), str, z10, ((Long) f23565n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i11 = cursor3.getInt(0);
                                                String str8 = str7;
                                                if (i11 > 0) {
                                                    boolean h10 = h(cursor3);
                                                    str3 = h10;
                                                    str8 = h10;
                                                }
                                                cursor2 = cursor3;
                                                str3 = str8;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i10 = i11;
                                                str7 = str3;
                                            }
                                        } catch (RemoteException e13) {
                                            e10 = e13;
                                            cursor2 = cursor3;
                                            str2 = str7;
                                            String message2 = e10.getMessage();
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + 42);
                                            sb4.append(str2);
                                            sb4.append(message2);
                                            Log.w("DynamiteModule", sb4.toString());
                                            str7 = str2;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                                str7 = str2;
                                            }
                                            return i10;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    str7 = str7;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                        str7 = str7;
                                    }
                                } else {
                                    i10 = cursor.getInt(0);
                                    str7 = str7;
                                }
                            } else if (q12 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i10 = k10.p1(BinderC3090b.m1(context), str, z10);
                                str7 = str7;
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i10 = k10.n1(BinderC3090b.m1(context), str, z10);
                                str7 = str7;
                            }
                        } catch (RemoteException e14) {
                            e10 = e14;
                            str2 = str7;
                        }
                    }
                    return i10;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            com.google.android.gms.common.util.h.a(context, th4);
            throw th4;
        }
    }

    private static boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f23563l)) {
            return true;
        }
        boolean z10 = false;
        if (f23563l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != com.google.android.gms.common.util.m.g() ? 0 : 268435456);
            if (C2018j.h().j(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            f23563l = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f23561j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0149, code lost:
    
        r9.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0145: MOVE (r2 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:326), block:B:112:0x0145 */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161 A[Catch: all -> 0x0141, TryCatch #1 {all -> 0x0141, blocks: (B:15:0x00f0, B:17:0x00f6, B:20:0x00fe, B:33:0x012a, B:40:0x0133, B:44:0x0139, B:45:0x0140, B:11:0x014d, B:12:0x015b, B:50:0x015d, B:52:0x0161, B:53:0x0183, B:54:0x0184), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184 A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #1 {all -> 0x0141, blocks: (B:15:0x00f0, B:17:0x00f6, B:20:0x00fe, B:33:0x012a, B:40:0x0133, B:44:0x0139, B:45:0x0140, B:11:0x014d, B:12:0x015b, B:50:0x015d, B:52:0x0161, B:53:0x0183, B:54:0x0184), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int g(Context context, String str, boolean z10, boolean z11) {
        Cursor cursor;
        Cursor query;
        MatrixCursor matrixCursor;
        Cursor cursor2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            try {
                boolean z12 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f23565n.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z13 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th) {
                        acquireUnstableContentProviderClient.release();
                        throw th;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                            for (int i10 = 0; i10 < count; i10++) {
                                if (!query.moveToPosition(i10)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr4 = new Object[columnCount];
                                for (int i11 = 0; i11 < columnCount; i11++) {
                                    int type = query.getType(i11);
                                    if (type == 0) {
                                        objArr4[i11] = null;
                                    } else if (type == 1) {
                                        objArr4[i11] = Long.valueOf(query.getLong(i11));
                                    } else if (type == 2) {
                                        objArr4[i11] = Double.valueOf(query.getDouble(i11));
                                    } else if (type == 3) {
                                        objArr4[i11] = query.getString(i11);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr4[i11] = query.getBlob(i11);
                                    }
                                }
                                matrixCursor.addRow(objArr4);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i12 = matrixCursor.getInt(0);
                                        if (i12 > 0) {
                                            synchronized (DynamiteModule.class) {
                                                try {
                                                    f23560i = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        f23562k = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        if (matrixCursor.getInt(columnIndex2) == 0) {
                                                            z12 = false;
                                                        }
                                                        f23561j = z12;
                                                        z13 = z12;
                                                    }
                                                } finally {
                                                }
                                            }
                                            if (h(matrixCursor)) {
                                                matrixCursor = null;
                                            }
                                        }
                                        if (z11 && z13) {
                                            throw new a("forcing fallback to container DynamiteLoader impl", objArr2 == true ? 1 : 0);
                                        }
                                        return i12;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    if (!(e instanceof a)) {
                                        throw e;
                                    }
                                    String message = e.getMessage();
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25);
                                    sb2.append("V2 version check failed: ");
                                    sb2.append(message);
                                    throw new a(sb2.toString(), e, objArr == true ? 1 : 0);
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            throw new a("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
                        } finally {
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            if (!(e instanceof a)) {
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    private static boolean h(Cursor cursor) {
        l lVar = (l) f23564m.get();
        if (lVar == null || lVar.f23575a != null) {
            return false;
        }
        lVar.f23575a = cursor;
        return true;
    }

    private static DynamiteModule i(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void j(ClassLoader classLoader) {
        o oVar;
        byte[] bArr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                oVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                oVar = queryLocalInterface instanceof o ? (o) queryLocalInterface : new o(iBinder);
            }
            f23570s = oVar;
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (InstantiationException e12) {
            e = e12;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new a("Failed to instantiate dynamite loader", e, bArr);
        }
    }

    private static n k(Context context) {
        n nVar;
        synchronized (DynamiteModule.class) {
            n nVar2 = f23569r;
            if (nVar2 != null) {
                return nVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    nVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    nVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder);
                }
                if (nVar != null) {
                    f23569r = nVar;
                    return nVar;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public IBinder c(String str) {
        try {
            return (IBinder) this.f23571a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
