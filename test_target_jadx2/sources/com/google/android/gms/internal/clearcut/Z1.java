package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public abstract class Z1 {

    /* renamed from: f, reason: collision with root package name */
    private static HashMap f23979f;

    /* renamed from: k, reason: collision with root package name */
    private static Object f23984k;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f23985l;

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f23974a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f23975b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f23976c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f23977d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f23978e = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap f23980g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private static final HashMap f23981h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private static final HashMap f23982i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private static final HashMap f23983j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    private static String[] f23986m = new String[0];

    public static long a(ContentResolver contentResolver, String str, long j10) {
        Object i10 = i(contentResolver);
        long j11 = 0;
        Long l10 = (Long) b(f23982i, str, 0L);
        if (l10 != null) {
            return l10.longValue();
        }
        String c10 = c(contentResolver, str, null);
        if (c10 != null) {
            try {
                long parseLong = Long.parseLong(c10);
                l10 = Long.valueOf(parseLong);
                j11 = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        g(i10, f23982i, str, l10);
        return j11;
    }

    private static Object b(HashMap hashMap, String str, Object obj) {
        synchronized (Z1.class) {
            try {
                if (!hashMap.containsKey(str)) {
                    return null;
                }
                Object obj2 = hashMap.get(str);
                if (obj2 != null) {
                    obj = obj2;
                }
                return obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String c(ContentResolver contentResolver, String str, String str2) {
        synchronized (Z1.class) {
            try {
                e(contentResolver);
                Object obj = f23984k;
                if (f23979f.containsKey(str)) {
                    String str3 = (String) f23979f.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : f23986m) {
                    if (str.startsWith(str4)) {
                        if (!f23985l || f23979f.isEmpty()) {
                            f23979f.putAll(d(contentResolver, f23986m));
                            f23985l = true;
                            if (f23979f.containsKey(str)) {
                                String str5 = (String) f23979f.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                Cursor query = contentResolver.query(f23974a, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(1);
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            f(obj, str, string);
                            String str6 = string != null ? string : null;
                            query.close();
                            return str6;
                        }
                    } finally {
                        if (query != null) {
                            query.close();
                        }
                    }
                }
                f(obj, str, null);
                if (query != null) {
                    query.close();
                }
                return null;
            } finally {
            }
        }
    }

    private static Map d(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f23975b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void e(ContentResolver contentResolver) {
        if (f23979f == null) {
            f23978e.set(false);
            f23979f = new HashMap();
            f23984k = new Object();
            f23985l = false;
            contentResolver.registerContentObserver(f23974a, true, new a2(null));
            return;
        }
        if (f23978e.getAndSet(false)) {
            f23979f.clear();
            f23980g.clear();
            f23981h.clear();
            f23982i.clear();
            f23983j.clear();
            f23984k = new Object();
            f23985l = false;
        }
    }

    private static void f(Object obj, String str, String str2) {
        synchronized (Z1.class) {
            try {
                if (obj == f23984k) {
                    f23979f.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void g(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (Z1.class) {
            try {
                if (obj == f23984k) {
                    hashMap.put(str, obj2);
                    f23979f.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean h(ContentResolver contentResolver, String str, boolean z10) {
        Object i10 = i(contentResolver);
        HashMap hashMap = f23980g;
        Boolean bool = (Boolean) b(hashMap, str, Boolean.valueOf(z10));
        if (bool != null) {
            return bool.booleanValue();
        }
        String c10 = c(contentResolver, str, null);
        if (c10 != null && !c10.equals(BuildConfig.FLAVOR)) {
            if (f23976c.matcher(c10).matches()) {
                bool = Boolean.TRUE;
                z10 = true;
            } else if (f23977d.matcher(c10).matches()) {
                bool = Boolean.FALSE;
                z10 = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + c10 + "\") as boolean");
            }
        }
        g(i10, hashMap, str, bool);
        return z10;
    }

    private static Object i(ContentResolver contentResolver) {
        Object obj;
        synchronized (Z1.class) {
            e(contentResolver);
            obj = f23984k;
        }
        return obj;
    }
}
