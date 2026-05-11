package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2114c {

    /* renamed from: h, reason: collision with root package name */
    private static final ConcurrentHashMap f24009h = new ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f24010i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f24011a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f24012b;

    /* renamed from: e, reason: collision with root package name */
    private volatile Map f24015e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f24014d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Object f24016f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final List f24017g = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final ContentObserver f24013c = new C2117d(this, null);

    private C2114c(ContentResolver contentResolver, Uri uri) {
        this.f24011a = contentResolver;
        this.f24012b = uri;
    }

    public static C2114c a(ContentResolver contentResolver, Uri uri) {
        ConcurrentHashMap concurrentHashMap = f24009h;
        C2114c c2114c = (C2114c) concurrentHashMap.get(uri);
        if (c2114c != null) {
            return c2114c;
        }
        C2114c c2114c2 = new C2114c(contentResolver, uri);
        C2114c c2114c3 = (C2114c) concurrentHashMap.putIfAbsent(uri, c2114c2);
        if (c2114c3 != null) {
            return c2114c3;
        }
        c2114c2.f24011a.registerContentObserver(c2114c2.f24012b, false, c2114c2.f24013c);
        return c2114c2;
    }

    private final Map e() {
        try {
            HashMap hashMap = new HashMap();
            Cursor query = this.f24011a.query(this.f24012b, f24010i, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        hashMap.put(query.getString(0), query.getString(1));
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        synchronized (this.f24016f) {
            try {
                Iterator it = this.f24017g.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map c() {
        Map e10 = AbstractC2120e.h("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? e() : this.f24015e;
        if (e10 == null) {
            synchronized (this.f24014d) {
                try {
                    e10 = this.f24015e;
                    if (e10 == null) {
                        e10 = e();
                        this.f24015e = e10;
                    }
                } finally {
                }
            }
        }
        return e10 != null ? e10 : Collections.emptyMap();
    }

    public final void d() {
        synchronized (this.f24014d) {
            this.f24015e = null;
        }
    }
}
