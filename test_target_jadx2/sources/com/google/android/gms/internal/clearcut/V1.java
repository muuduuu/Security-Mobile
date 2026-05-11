package com.google.android.gms.internal.clearcut;

import Q6.a;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.clearcut.J1;
import d7.C2998d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class V1 implements a.b {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f23944b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    private static final C2150o f23945c;

    /* renamed from: d, reason: collision with root package name */
    private static final C2150o f23946d;

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f23947e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f23948f;

    /* renamed from: g, reason: collision with root package name */
    private static Boolean f23949g;

    /* renamed from: h, reason: collision with root package name */
    private static Long f23950h;

    /* renamed from: i, reason: collision with root package name */
    private static final AbstractC2120e f23951i;

    /* renamed from: a, reason: collision with root package name */
    private final Context f23952a;

    static {
        C2150o h10 = new C2150o(z7.b.a("com.google.android.gms.clearcut.public")).f("gms:playlog:service:samplingrules_").h("LogSamplingRules__");
        f23945c = h10;
        f23946d = new C2150o(z7.b.a("com.google.android.gms.clearcut.public")).f("gms:playlog:service:sampling_").h("LogSampling__");
        f23947e = new ConcurrentHashMap();
        f23948f = new HashMap();
        f23949g = null;
        f23950h = null;
        f23951i = h10.e("enable_log_sampling_rules", false);
    }

    public V1(Context context) {
        this.f23952a = context;
        if (context != null) {
            AbstractC2120e.b(context);
        }
    }

    private static long b(String str, long j10) {
        if (str == null || str.isEmpty()) {
            return Q1.c(ByteBuffer.allocate(8).putLong(j10).array());
        }
        byte[] bytes = str.getBytes(f23944b);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j10);
        return Q1.c(allocate.array());
    }

    private static J1.b c(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(44);
        int i10 = 0;
        if (indexOf >= 0) {
            i10 = indexOf + 1;
            str2 = str.substring(0, indexOf);
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        int indexOf2 = str.indexOf(47, i10);
        if (indexOf2 <= 0) {
            Log.e("LogSamplerImpl", str.length() != 0 ? "Failed to parse the rule: ".concat(str) : new String("Failed to parse the rule: "));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i10, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong >= 0 && parseLong2 >= 0) {
                return (J1.b) J1.b.x().q(str2).s(parseLong).v(parseLong2).l();
            }
            StringBuilder sb2 = new StringBuilder(72);
            sb2.append("negative values not supported: ");
            sb2.append(parseLong);
            sb2.append("/");
            sb2.append(parseLong2);
            Log.e("LogSamplerImpl", sb2.toString());
            return null;
        } catch (NumberFormatException e10) {
            Log.e("LogSamplerImpl", str.length() != 0 ? "parseLong() failed while parsing: ".concat(str) : new String("parseLong() failed while parsing: "), e10);
            return null;
        }
    }

    private static boolean d(long j10, long j11, long j12) {
        if (j11 < 0 || j12 <= 0) {
            return true;
        }
        return ((j10 > 0L ? 1 : (j10 == 0L ? 0 : -1)) >= 0 ? j10 % j12 : (((Long.MAX_VALUE % j12) + 1) + ((j10 & Long.MAX_VALUE) % j12)) % j12) < j11;
    }

    private static boolean e(Context context) {
        if (f23949g == null) {
            f23949g = Boolean.valueOf(C2998d.a(context).a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f23949g.booleanValue();
    }

    private static long f(Context context) {
        if (f23950h == null) {
            if (context == null) {
                return 0L;
            }
            f23950h = Long.valueOf(e(context) ? Z1.a(context.getContentResolver(), "android_id", 0L) : 0L);
        }
        return f23950h.longValue();
    }

    @Override // Q6.a.b
    public final boolean a(Q6.f fVar) {
        List<J1.b> l10;
        X1 x12 = fVar.f8270a;
        String str = x12.f23964g;
        int i10 = x12.f23960c;
        M1 m12 = fVar.f8278i;
        int i11 = m12 != null ? m12.f23871f : 0;
        String str2 = null;
        if (!((Boolean) f23951i.a()).booleanValue()) {
            if (str == null || str.isEmpty()) {
                str = i10 >= 0 ? String.valueOf(i10) : null;
            }
            if (str == null) {
                return true;
            }
            Context context = this.f23952a;
            if (context != null && e(context)) {
                HashMap hashMap = f23948f;
                AbstractC2120e abstractC2120e = (AbstractC2120e) hashMap.get(str);
                if (abstractC2120e == null) {
                    abstractC2120e = f23946d.b(str, null);
                    hashMap.put(str, abstractC2120e);
                }
                str2 = (String) abstractC2120e.a();
            }
            J1.b c10 = c(str2);
            if (c10 != null) {
                return d(b(c10.u(), f(this.f23952a)), c10.v(), c10.w());
            }
            return true;
        }
        if (str == null || str.isEmpty()) {
            str = i10 >= 0 ? String.valueOf(i10) : null;
        }
        if (str == null) {
            return true;
        }
        if (this.f23952a == null) {
            l10 = Collections.emptyList();
        } else {
            ConcurrentHashMap concurrentHashMap = f23947e;
            AbstractC2120e abstractC2120e2 = (AbstractC2120e) concurrentHashMap.get(str);
            if (abstractC2120e2 == null) {
                abstractC2120e2 = f23945c.a(str, J1.q(), W1.f23954a);
                AbstractC2120e abstractC2120e3 = (AbstractC2120e) concurrentHashMap.putIfAbsent(str, abstractC2120e2);
                if (abstractC2120e3 != null) {
                    abstractC2120e2 = abstractC2120e3;
                }
            }
            l10 = ((J1) abstractC2120e2.a()).l();
        }
        for (J1.b bVar : l10) {
            if (!bVar.t() || bVar.l() == 0 || bVar.l() == i11) {
                if (!d(b(bVar.u(), f(this.f23952a)), bVar.v(), bVar.w())) {
                    return false;
                }
            }
        }
        return true;
    }
}
