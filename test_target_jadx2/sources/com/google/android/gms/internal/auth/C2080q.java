package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import j0.C3476a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.auth.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2080q implements InterfaceC2091u {

    /* renamed from: h, reason: collision with root package name */
    private static final Map f23751h = new C3476a();

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f23752i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f23753a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f23754b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f23755c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentObserver f23756d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f23757e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Map f23758f;

    /* renamed from: g, reason: collision with root package name */
    private final List f23759g;

    private C2080q(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C2077p c2077p = new C2077p(this, null);
        this.f23756d = c2077p;
        this.f23757e = new Object();
        this.f23759g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f23753a = contentResolver;
        this.f23754b = uri;
        this.f23755c = runnable;
        contentResolver.registerContentObserver(uri, false, c2077p);
    }

    public static C2080q b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C2080q c2080q;
        synchronized (C2080q.class) {
            Map map = f23751h;
            c2080q = (C2080q) map.get(uri);
            if (c2080q == null) {
                try {
                    C2080q c2080q2 = new C2080q(contentResolver, uri, runnable);
                    try {
                        map.put(uri, c2080q2);
                    } catch (SecurityException unused) {
                    }
                    c2080q = c2080q2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c2080q;
    }

    static synchronized void d() {
        synchronized (C2080q.class) {
            try {
                for (C2080q c2080q : f23751h.values()) {
                    c2080q.f23753a.unregisterContentObserver(c2080q.f23756d);
                }
                f23751h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.InterfaceC2091u
    public final /* bridge */ /* synthetic */ Object a(String str) {
        Map map;
        Map map2;
        Map map3 = this.f23758f;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.f23757e) {
                Map map5 = this.f23758f;
                if (map5 != null) {
                    map2 = map5;
                } else {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) AbstractC2085s.a(new InterfaceC2088t() { // from class: com.google.android.gms.internal.auth.o
                                @Override // com.google.android.gms.internal.auth.InterfaceC2088t
                                public final Object zza() {
                                    return C2080q.this.c();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        }
                        this.f23758f = map;
                        allowThreadDiskReads = map;
                        map2 = allowThreadDiskReads;
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
            }
            map4 = map2;
        }
        if (map4 == null) {
            map4 = Collections.emptyMap();
        }
        return (String) map4.get(str);
    }

    final /* synthetic */ Map c() {
        Cursor query = this.f23753a.query(this.f23754b, f23752i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map c3476a = count <= 256 ? new C3476a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                c3476a.put(query.getString(0), query.getString(1));
            }
            return c3476a;
        } finally {
            query.close();
        }
    }

    public final void e() {
        synchronized (this.f23757e) {
            this.f23758f = null;
            M.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f23759g.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
