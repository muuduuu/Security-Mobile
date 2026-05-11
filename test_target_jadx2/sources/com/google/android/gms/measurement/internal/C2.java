package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.text.TextUtils;
import android.util.Log;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class C2 extends U3 {

    /* renamed from: c, reason: collision with root package name */
    private char f25329c;

    /* renamed from: d, reason: collision with root package name */
    private long f25330d;

    /* renamed from: e, reason: collision with root package name */
    private String f25331e;

    /* renamed from: f, reason: collision with root package name */
    private final A2 f25332f;

    /* renamed from: g, reason: collision with root package name */
    private final A2 f25333g;

    /* renamed from: h, reason: collision with root package name */
    private final A2 f25334h;

    /* renamed from: i, reason: collision with root package name */
    private final A2 f25335i;

    /* renamed from: j, reason: collision with root package name */
    private final A2 f25336j;

    /* renamed from: k, reason: collision with root package name */
    private final A2 f25337k;

    /* renamed from: l, reason: collision with root package name */
    private final A2 f25338l;

    /* renamed from: m, reason: collision with root package name */
    private final A2 f25339m;

    /* renamed from: n, reason: collision with root package name */
    private final A2 f25340n;

    C2(C2760q3 c2760q3) {
        super(c2760q3);
        this.f25329c = (char) 0;
        this.f25330d = -1L;
        this.f25332f = new A2(this, 6, false, false);
        this.f25333g = new A2(this, 6, true, false);
        this.f25334h = new A2(this, 6, false, true);
        this.f25335i = new A2(this, 5, false, false);
        this.f25336j = new A2(this, 5, true, false);
        this.f25337k = new A2(this, 5, false, true);
        this.f25338l = new A2(this, 4, false, false);
        this.f25339m = new A2(this, 3, false, false);
        this.f25340n = new A2(this, 2, false, false);
    }

    static String A(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String B10 = B(z10, obj);
        String B11 = B(z10, obj2);
        String B12 = B(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B10)) {
            sb2.append(str2);
            sb2.append(B10);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(B11)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(B11);
        }
        if (!TextUtils.isEmpty(B12)) {
            sb2.append(str3);
            sb2.append(B12);
        }
        return sb2.toString();
    }

    static String B(boolean z10, Object obj) {
        String className;
        String str = BuildConfig.FLAVOR;
        if (obj == null) {
            return BuildConfig.FLAVOR;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            if (charAt == '-') {
                str = "-";
            }
            StringBuilder sb2 = new StringBuilder(str.length() + length + 3 + str.length() + String.valueOf(round2).length());
            sb2.append(str);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof B2 ? ((B2) obj).a() : z10 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
        String C10 = C(C2760q3.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        while (true) {
            if (i10 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(C10)) {
                sb3.append(": ");
                sb3.append(stackTraceElement);
                break;
            }
            i10++;
        }
        return sb3.toString();
    }

    static String C(String str) {
        int lastIndexOf;
        return (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(46)) == -1) ? BuildConfig.FLAVOR : str.substring(0, lastIndexOf);
    }

    protected static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new B2(str);
    }

    final /* synthetic */ char D() {
        return this.f25329c;
    }

    final /* synthetic */ void E(char c10) {
        this.f25329c = c10;
    }

    final /* synthetic */ long F() {
        return this.f25330d;
    }

    final /* synthetic */ void G(long j10) {
        this.f25330d = 133005L;
    }

    @Override // com.google.android.gms.measurement.internal.U3
    protected final boolean i() {
        return false;
    }

    public final A2 o() {
        return this.f25332f;
    }

    public final A2 p() {
        return this.f25333g;
    }

    public final A2 q() {
        return this.f25334h;
    }

    public final A2 r() {
        return this.f25335i;
    }

    public final A2 s() {
        return this.f25336j;
    }

    public final A2 t() {
        return this.f25337k;
    }

    public final A2 u() {
        return this.f25338l;
    }

    public final A2 v() {
        return this.f25339m;
    }

    public final A2 w() {
        return this.f25340n;
    }

    protected final void y(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(z(), i10)) {
            Log.println(i10, z(), A(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        AbstractC1287s.m(str);
        C2696i3 A10 = this.f25694a.A();
        if (A10 == null) {
            Log.println(6, z(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!A10.k()) {
                Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            A10.t(new RunnableC2830z2(this, i10, str, obj, obj2, obj3));
        }
    }

    protected final String z() {
        String str;
        synchronized (this) {
            try {
                if (this.f25331e == null) {
                    this.f25331e = this.f25694a.w().u();
                }
                AbstractC1287s.m(this.f25331e);
                str = this.f25331e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
