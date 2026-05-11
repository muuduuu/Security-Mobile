package io.invertase.firebase.config;

import D7.AbstractC0789m;
import D7.C0787k;
import J8.s;
import J8.u;
import J8.v;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.a;
import j8.C3511e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class o extends io.invertase.firebase.common.b {
    o(Context context, String str) {
        super(context, str);
    }

    private Bundle k(v vVar) {
        Bundle bundle = new Bundle(2);
        bundle.putString("value", vVar.asString());
        int j10 = vVar.j();
        if (j10 == 1) {
            bundle.putString("source", "default");
        } else if (j10 != 2) {
            bundle.putString("source", "static");
        } else {
            bundle.putString("source", "remote");
        }
        return bundle;
    }

    private int q(String str) {
        return a().getResources().getIdentifier(str, "xml", a().getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void r(C3511e c3511e, long j10) {
        com.google.firebase.remoteconfig.b s10 = com.google.firebase.remoteconfig.b.s(c3511e);
        AbstractC0789m.a(j10 == -1 ? s10.n() : s10.o(j10));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void s(Bundle bundle, C3511e c3511e) {
        u.b bVar = new u.b();
        if (bundle.containsKey("minimumFetchInterval")) {
            bVar.e((long) bundle.getDouble("minimumFetchInterval"));
        }
        if (bundle.containsKey("fetchTimeout")) {
            bVar.d((long) bundle.getDouble("fetchTimeout"));
        }
        com.google.firebase.remoteconfig.b.s(c3511e).F(bVar.c());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(HashMap hashMap, C3511e c3511e, C0787k c0787k) {
        try {
            a.C0416a c0416a = new a.C0416a();
            for (Map.Entry entry : hashMap.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    c0416a.e((String) entry.getKey(), (String) value);
                } else if (value instanceof Long) {
                    c0416a.d((String) entry.getKey(), ((Long) value).longValue());
                } else if (value instanceof Integer) {
                    c0416a.d((String) entry.getKey(), ((Integer) value).longValue());
                } else if (value instanceof Double) {
                    c0416a.c((String) entry.getKey(), ((Double) value).doubleValue());
                } else if (value == null) {
                    c0416a.e((String) entry.getKey(), null);
                }
            }
            AbstractC0789m.a(com.google.firebase.remoteconfig.b.s(c3511e).H(c0416a.b()));
            c0787k.c(null);
        } catch (Exception e10) {
            c0787k.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void u(String str, C3511e c3511e) {
        XmlResourceParser xmlResourceParser;
        int q10 = q(str);
        try {
            xmlResourceParser = a().getResources().getXml(q10);
        } catch (Resources.NotFoundException unused) {
            xmlResourceParser = null;
        }
        if (xmlResourceParser == null) {
            throw new Exception("resource_not_found");
        }
        AbstractC0789m.a(com.google.firebase.remoteconfig.b.s(c3511e).I(q10));
        return null;
    }

    private String v(int i10) {
        return i10 != -1 ? i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "throttled" : "failure" : "no_fetch_yet" : "success";
    }

    Task A(String str, final String str2) {
        final C3511e o10 = C3511e.o(str);
        return AbstractC0789m.d(d(), new Callable() { // from class: io.invertase.firebase.config.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void u10;
                u10 = o.this.u(str2, o10);
                return u10;
            }
        });
    }

    Task j(String str) {
        return com.google.firebase.remoteconfig.b.s(C3511e.o(str)).k();
    }

    Task l(String str) {
        Task m10 = com.google.firebase.remoteconfig.b.s(C3511e.o(str)).m();
        try {
            AbstractC0789m.a(n(str));
        } catch (Exception unused) {
        }
        return m10;
    }

    Task m(String str, final long j10) {
        final C3511e o10 = C3511e.o(str);
        return AbstractC0789m.d(d(), new Callable() { // from class: io.invertase.firebase.config.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void r10;
                r10 = o.r(C3511e.this, j10);
                return r10;
            }
        });
    }

    Task n(String str) {
        return com.google.firebase.remoteconfig.b.s(C3511e.o(str)).p();
    }

    Map o(String str) {
        Map q10 = com.google.firebase.remoteconfig.b.s(C3511e.o(str)).q();
        HashMap hashMap = new HashMap(q10.size());
        for (Map.Entry entry : q10.entrySet()) {
            hashMap.put((String) entry.getKey(), k((v) entry.getValue()));
        }
        return hashMap;
    }

    public Map p(String str) {
        HashMap hashMap = new HashMap();
        s r10 = com.google.firebase.remoteconfig.b.s(C3511e.o(str)).r();
        u c10 = r10.c();
        hashMap.put("values", o(str));
        hashMap.put("lastFetchTime", Long.valueOf(r10.b()));
        hashMap.put("lastFetchStatus", v(r10.a()));
        hashMap.put("minimumFetchInterval", Long.valueOf(c10.b()));
        hashMap.put("fetchTimeout", Long.valueOf(c10.a()));
        return hashMap;
    }

    Task w(String str) {
        return com.google.firebase.remoteconfig.b.s(C3511e.o(str)).E();
    }

    Task x(String str, final Bundle bundle) {
        final C3511e o10 = C3511e.o(str);
        return AbstractC0789m.d(d(), new Callable() { // from class: io.invertase.firebase.config.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void s10;
                s10 = o.s(bundle, o10);
                return s10;
            }
        });
    }

    Task y(String str, final HashMap hashMap) {
        final C0787k c0787k = new C0787k();
        final C3511e o10 = C3511e.o(str);
        d().execute(new Runnable() { // from class: io.invertase.firebase.config.m
            @Override // java.lang.Runnable
            public final void run() {
                o.t(hashMap, o10, c0787k);
            }
        });
        return c0787k.a();
    }

    Task z(String str, HashMap hashMap) {
        return com.google.firebase.remoteconfig.b.s(C3511e.o(str)).J(hashMap);
    }
}
