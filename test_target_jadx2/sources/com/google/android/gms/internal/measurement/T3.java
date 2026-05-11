package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import j0.C3476a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final class T3 implements W3 {

    /* renamed from: i, reason: collision with root package name */
    private static final ConcurrentMap f24370i = new ConcurrentHashMap();

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f24371j = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f24372a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f24373b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f24374c;

    /* renamed from: g, reason: collision with root package name */
    private volatile Map f24378g;

    /* renamed from: d, reason: collision with root package name */
    private ContentObserver f24375d = null;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f24376e = true;

    /* renamed from: f, reason: collision with root package name */
    private final Object f24377f = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final List f24379h = new ArrayList();

    private T3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        g8.h.h(contentResolver);
        g8.h.h(uri);
        this.f24372a = contentResolver;
        this.f24373b = uri;
        this.f24374c = runnable;
    }

    public static T3 c(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        T3 t32 = (T3) f24370i.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.S3
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return T3.g(contentResolver, uri, runnable, (Uri) obj);
            }
        });
        try {
            if (t32.f24376e) {
                synchronized (t32) {
                    try {
                        if (t32.f24376e) {
                            Q3 q32 = new Q3(t32, null);
                            t32.f24372a.registerContentObserver(t32.f24373b, false, q32);
                            t32.f24375d = q32;
                            t32.f24376e = false;
                        }
                    } finally {
                    }
                }
            }
            return t32;
        } catch (SecurityException unused) {
            return null;
        }
    }

    static void f() {
        Iterator it = f24370i.values().iterator();
        while (it.hasNext()) {
            T3 t32 = (T3) it.next();
            synchronized (t32) {
                try {
                    if (t32.f24376e) {
                        t32.f24376e = false;
                    } else {
                        ContentObserver contentObserver = t32.f24375d;
                        if (contentObserver != null) {
                            t32.f24372a.unregisterContentObserver(contentObserver);
                            t32.f24375d = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    static /* synthetic */ T3 g(ContentResolver contentResolver, Uri uri, Runnable runnable, Uri uri2) {
        return new T3(contentResolver, uri, runnable);
    }

    @Override // com.google.android.gms.internal.measurement.W3
    public final /* bridge */ /* synthetic */ Object a(String str) {
        return (String) d().get(str);
    }

    public final Map d() {
        Map emptyMap;
        Map map = this.f24378g;
        if (map == null) {
            synchronized (this.f24377f) {
                map = this.f24378g;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            emptyMap = (Map) W3.b(new V3() { // from class: com.google.android.gms.internal.measurement.R3
                                @Override // com.google.android.gms.internal.measurement.V3
                                public final /* synthetic */ Object zza() {
                                    return T3.this.h();
                                }
                            });
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException e10) {
                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e10);
                        emptyMap = Collections.emptyMap();
                    }
                    this.f24378g = emptyMap;
                    map = emptyMap;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    public final void e() {
        synchronized (this.f24377f) {
            this.f24378g = null;
            this.f24374c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f24379h.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ Map h() {
        Map emptyMap;
        Cursor query;
        Map emptyMap2;
        ContentResolver contentResolver = this.f24372a;
        Uri uri = this.f24373b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.emptyMap();
            }
            try {
                query = acquireUnstableContentProviderClient.query(uri, f24371j, null, null, null);
                try {
                } catch (Throwable th) {
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e10) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
                emptyMap = Collections.emptyMap();
            }
            if (query == null) {
                Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                emptyMap = Collections.emptyMap();
                acquireUnstableContentProviderClient.release();
                return emptyMap;
            }
            int count = query.getCount();
            if (count == 0) {
                emptyMap2 = Collections.emptyMap();
            } else {
                Map c3476a = count <= 256 ? new C3476a(count) : new HashMap(count, 1.0f);
                while (query.moveToNext()) {
                    c3476a.put(query.getString(0), query.getString(1));
                }
                if (query.isAfterLast()) {
                    query.close();
                    acquireUnstableContentProviderClient.release();
                    return c3476a;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                emptyMap2 = Collections.emptyMap();
            }
            query.close();
            acquireUnstableContentProviderClient.release();
            return emptyMap2;
        } catch (Throwable th3) {
            acquireUnstableContentProviderClient.release();
            throw th3;
        }
    }
}
