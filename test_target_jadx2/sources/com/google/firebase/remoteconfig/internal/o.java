package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f28378e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    static final Pattern f28379f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g, reason: collision with root package name */
    static final Pattern f28380g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a, reason: collision with root package name */
    private final Set f28381a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Executor f28382b;

    /* renamed from: c, reason: collision with root package name */
    private final f f28383c;

    /* renamed from: d, reason: collision with root package name */
    private final f f28384d;

    public o(Executor executor, f fVar, f fVar2) {
        this.f28382b = executor;
        this.f28383c = fVar;
        this.f28384d = fVar2;
    }

    private void c(final String str, final g gVar) {
        if (gVar == null) {
            return;
        }
        synchronized (this.f28381a) {
            try {
                for (final com.google.android.gms.common.util.d dVar : this.f28381a) {
                    this.f28382b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.android.gms.common.util.d.this.a(str, gVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static g e(f fVar) {
        return fVar.f();
    }

    private static Set f(f fVar) {
        HashSet hashSet = new HashSet();
        g e10 = e(fVar);
        if (e10 == null) {
            return hashSet;
        }
        Iterator<String> keys = e10.g().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static String g(f fVar, String str) {
        g e10 = e(fVar);
        if (e10 == null) {
            return null;
        }
        try {
            return e10.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void j(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(com.google.android.gms.common.util.d dVar) {
        synchronized (this.f28381a) {
            this.f28381a.add(dVar);
        }
    }

    public Map d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(f(this.f28383c));
        hashSet.addAll(f(this.f28384d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, h(str));
        }
        return hashMap;
    }

    public J8.v h(String str) {
        String g10 = g(this.f28383c, str);
        if (g10 != null) {
            c(str, e(this.f28383c));
            return new x(g10, 2);
        }
        String g11 = g(this.f28384d, str);
        if (g11 != null) {
            return new x(g11, 1);
        }
        j(str, "FirebaseRemoteConfigValue");
        return new x(BuildConfig.FLAVOR, 0);
    }
}
