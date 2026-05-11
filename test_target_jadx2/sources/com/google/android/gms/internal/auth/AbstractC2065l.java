package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.auth.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2065l {

    /* renamed from: f, reason: collision with root package name */
    static HashMap f23732f;

    /* renamed from: k, reason: collision with root package name */
    private static Object f23737k;

    /* renamed from: l, reason: collision with root package name */
    static boolean f23738l;

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f23727a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f23728b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f23729c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f23730d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f23731e = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    static final HashMap f23733g = new HashMap(16, 1.0f);

    /* renamed from: h, reason: collision with root package name */
    static final HashMap f23734h = new HashMap(16, 1.0f);

    /* renamed from: i, reason: collision with root package name */
    static final HashMap f23735i = new HashMap(16, 1.0f);

    /* renamed from: j, reason: collision with root package name */
    static final HashMap f23736j = new HashMap(16, 1.0f);

    /* renamed from: m, reason: collision with root package name */
    static final String[] f23739m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (AbstractC2065l.class) {
            try {
                String str3 = null;
                if (f23732f == null) {
                    f23731e.set(false);
                    f23732f = new HashMap(16, 1.0f);
                    f23737k = new Object();
                    f23738l = false;
                    contentResolver.registerContentObserver(f23727a, true, new C2062k(null));
                } else if (f23731e.getAndSet(false)) {
                    f23732f.clear();
                    f23733g.clear();
                    f23734h.clear();
                    f23735i.clear();
                    f23736j.clear();
                    f23737k = new Object();
                    f23738l = false;
                }
                Object obj = f23737k;
                if (f23732f.containsKey(str)) {
                    String str4 = (String) f23732f.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = f23739m.length;
                Cursor query = contentResolver.query(f23727a, null, null, new String[]{str}, null);
                if (query == null) {
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        c(obj, str, null);
                        return null;
                    }
                    String string = query.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    c(obj, str, string);
                    if (string != null) {
                        return string;
                    }
                    return null;
                } finally {
                    query.close();
                }
            } finally {
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (AbstractC2065l.class) {
            try {
                if (obj == f23737k) {
                    f23732f.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
