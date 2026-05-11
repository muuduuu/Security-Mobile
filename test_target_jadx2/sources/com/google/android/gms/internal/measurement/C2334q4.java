package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import j0.C3476a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.q4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2334q4 implements W3 {

    /* renamed from: f, reason: collision with root package name */
    private static final Map f24633f = new C3476a();

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f24634a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f24635b;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map f24637d;

    /* renamed from: c, reason: collision with root package name */
    private final Object f24636c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final List f24638e = new ArrayList();

    private C2334q4(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f24634a = sharedPreferences;
    }

    static C2334q4 c(Context context, String str, Runnable runnable) {
        final C2334q4 c2334q4;
        SharedPreferences a10;
        if (O3.a() && !str.startsWith("direct_boot:") && !O3.c(context)) {
            return null;
        }
        synchronized (C2334q4.class) {
            Map map = f24633f;
            c2334q4 = (C2334q4) map.get(str);
            if (c2334q4 == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (O3.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        a10 = AbstractC2276k0.a(context, str.substring(12), 0, AbstractC2240g0.f24505a);
                    } else {
                        a10 = AbstractC2276k0.a(context, str, 0, AbstractC2240g0.f24505a);
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    c2334q4 = new C2334q4(a10, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.p4
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            C2334q4.this.e(sharedPreferences, str2);
                        }
                    };
                    c2334q4.f24635b = onSharedPreferenceChangeListener;
                    c2334q4.f24634a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, c2334q4);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
            }
        }
        return c2334q4;
    }

    static synchronized void d() {
        synchronized (C2334q4.class) {
            try {
                Map map = f24633f;
                for (C2334q4 c2334q4 : map.values()) {
                    c2334q4.f24634a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) g8.h.h(c2334q4.f24635b));
                }
                map.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.W3
    public final Object a(String str) {
        Map<String, ?> map = this.f24637d;
        if (map == null) {
            synchronized (this.f24636c) {
                try {
                    map = this.f24637d;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f24634a.getAll();
                            this.f24637d = all;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    final /* synthetic */ void e(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f24636c) {
            this.f24637d = null;
            AbstractC2316o4.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f24638e.iterator();
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
