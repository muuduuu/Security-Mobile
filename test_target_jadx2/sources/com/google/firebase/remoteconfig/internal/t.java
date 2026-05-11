package com.google.firebase.remoteconfig.internal;

import J8.u;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class t {

    /* renamed from: f, reason: collision with root package name */
    static final Date f28425f = new Date(-1);

    /* renamed from: g, reason: collision with root package name */
    static final Date f28426g = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f28427a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f28428b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Object f28429c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Object f28430d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Object f28431e = new Object();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f28432a;

        /* renamed from: b, reason: collision with root package name */
        private Date f28433b;

        a(int i10, Date date) {
            this.f28432a = i10;
            this.f28433b = date;
        }

        Date a() {
            return this.f28433b;
        }

        int b() {
            return this.f28432a;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f28434a;

        /* renamed from: b, reason: collision with root package name */
        private Date f28435b;

        public b(int i10, Date date) {
            this.f28434a = i10;
            this.f28435b = date;
        }

        Date a() {
            return this.f28435b;
        }

        int b() {
            return this.f28434a;
        }
    }

    public t(SharedPreferences sharedPreferences) {
        this.f28427a = sharedPreferences;
    }

    public void a() {
        synchronized (this.f28428b) {
            this.f28427a.edit().clear().commit();
        }
    }

    a b() {
        a aVar;
        synchronized (this.f28429c) {
            aVar = new a(this.f28427a.getInt("num_failed_fetches", 0), new Date(this.f28427a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public Map c() {
        try {
            JSONObject jSONObject = new JSONObject(this.f28427a.getString("customSignals", "{}"));
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public long d() {
        return this.f28427a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public J8.s e() {
        w a10;
        synchronized (this.f28428b) {
            long j10 = this.f28427a.getLong("last_fetch_time_in_millis", -1L);
            int i10 = this.f28427a.getInt("last_fetch_status", 0);
            a10 = w.d().c(i10).d(j10).b(new u.b().d(this.f28427a.getLong("fetch_timeout_in_seconds", 60L)).e(this.f28427a.getLong("minimum_fetch_interval_in_seconds", m.f28360j)).c()).a();
        }
        return a10;
    }

    String f() {
        return this.f28427a.getString("last_fetch_etag", null);
    }

    Date g() {
        return new Date(this.f28427a.getLong("last_fetch_time_in_millis", -1L));
    }

    long h() {
        return this.f28427a.getLong("last_template_version", 0L);
    }

    public long i() {
        return this.f28427a.getLong("minimum_fetch_interval_in_seconds", m.f28360j);
    }

    public b j() {
        b bVar;
        synchronized (this.f28430d) {
            bVar = new b(this.f28427a.getInt("num_failed_realtime_streams", 0), new Date(this.f28427a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    void k() {
        m(0, f28426g);
    }

    void l() {
        s(0, f28426g);
    }

    void m(int i10, Date date) {
        synchronized (this.f28429c) {
            this.f28427a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void n(J8.u uVar) {
        synchronized (this.f28428b) {
            this.f28427a.edit().putLong("fetch_timeout_in_seconds", uVar.a()).putLong("minimum_fetch_interval_in_seconds", uVar.b()).commit();
        }
    }

    public void o(Map map) {
        synchronized (this.f28431e) {
            try {
                Map c10 = c();
                boolean z10 = false;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (str.length() <= 250 && (str2 == null || str2.length() <= 500)) {
                        boolean z11 = true;
                        if (str2 != null) {
                            z10 |= !Objects.equals(c10.put(str, str2), str2);
                        } else {
                            if (c10.remove(str) == null) {
                                z11 = false;
                            }
                            z10 |= z11;
                        }
                    }
                    Log.w("FirebaseRemoteConfig", String.format("Invalid custom signal: Custom signal keys must be %d characters or less, and values must be %d characters or less.", 250, 500));
                    return;
                }
                if (z10) {
                    if (c10.size() > 100) {
                        Log.w("FirebaseRemoteConfig", String.format("Invalid custom signal: Too many custom signals provided. The maximum allowed is %d.", 100));
                        return;
                    }
                    this.f28427a.edit().putString("customSignals", new JSONObject(c10).toString()).commit();
                    Log.d("FirebaseRemoteConfig", "Keys of updated custom signals: " + c().keySet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void p(String str) {
        synchronized (this.f28428b) {
            this.f28427a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    void q(long j10) {
        synchronized (this.f28428b) {
            this.f28427a.edit().putLong("last_template_version", j10).apply();
        }
    }

    public void r(Date date) {
        synchronized (this.f28430d) {
            this.f28427a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void s(int i10, Date date) {
        synchronized (this.f28430d) {
            this.f28427a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void t() {
        synchronized (this.f28428b) {
            this.f28427a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    void u(Date date) {
        synchronized (this.f28428b) {
            this.f28427a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    void v() {
        synchronized (this.f28428b) {
            this.f28427a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
