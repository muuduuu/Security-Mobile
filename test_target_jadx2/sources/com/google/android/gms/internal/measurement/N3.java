package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class N3 implements J3 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f24296a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private HashMap f24297b = null;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f24298c = new HashMap(16, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f24299d = new HashMap(16, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f24300e = new HashMap(16, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f24301f = new HashMap(16, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    private Object f24302g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f24303h = false;

    /* renamed from: i, reason: collision with root package name */
    private final String[] f24304i = new String[0];

    @Override // com.google.android.gms.internal.measurement.J3
    public final String a(ContentResolver contentResolver, String str, String str2) {
        String str3;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str4 = null;
                if (this.f24297b == null) {
                    this.f24296a.set(false);
                    this.f24297b = new HashMap(16, 1.0f);
                    this.f24302g = new Object();
                    contentResolver.registerContentObserver(I3.f24236a, true, new L3(this, null));
                } else if (this.f24296a.getAndSet(false)) {
                    this.f24297b.clear();
                    this.f24298c.clear();
                    this.f24299d.clear();
                    this.f24300e.clear();
                    this.f24301f.clear();
                    this.f24302g = new Object();
                    this.f24303h = false;
                }
                Object obj = this.f24302g;
                if (this.f24297b.containsKey(str)) {
                    String str5 = (String) this.f24297b.get(str);
                    if (str5 != null) {
                        str4 = str5;
                    }
                    return str4;
                }
                try {
                    Uri uri = I3.f24236a;
                    ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (acquireUnstableContentProviderClient == null) {
                            throw new M3("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (query == null) {
                                    throw new M3("ContentProvider query returned null cursor");
                                }
                                if (query.moveToFirst()) {
                                    str3 = query.getString(1);
                                    query.close();
                                } else {
                                    query.close();
                                    str3 = null;
                                }
                                if (str3 != null && str3.equals(null)) {
                                    str3 = null;
                                }
                                synchronized (this) {
                                    try {
                                        if (obj == this.f24302g) {
                                            this.f24297b.put(str, str3);
                                        }
                                    } finally {
                                    }
                                }
                                if (str3 != null) {
                                    return str3;
                                }
                                return null;
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
                            throw new M3("ContentProvider query failed", e10);
                        }
                    } finally {
                        acquireUnstableContentProviderClient.release();
                    }
                } catch (M3 unused) {
                    return null;
                }
            } finally {
            }
        }
    }

    final /* synthetic */ AtomicBoolean b() {
        return this.f24296a;
    }
}
