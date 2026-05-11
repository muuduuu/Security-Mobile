package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2412z2 {
    public static void a(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void b(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void c(String str, int i10, List list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean d(InterfaceC2329q interfaceC2329q) {
        if (interfaceC2329q == null) {
            return false;
        }
        Double f10 = interfaceC2329q.f();
        return !f10.isNaN() && f10.doubleValue() >= 0.0d && f10.equals(Double.valueOf(Math.floor(f10.doubleValue())));
    }

    public static N e(String str) {
        N n10 = null;
        if (str != null && !str.isEmpty()) {
            n10 = N.zza(Integer.parseInt(str));
        }
        if (n10 != null) {
            return n10;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static boolean f(InterfaceC2329q interfaceC2329q, InterfaceC2329q interfaceC2329q2) {
        if (!interfaceC2329q.getClass().equals(interfaceC2329q2.getClass())) {
            return false;
        }
        if ((interfaceC2329q instanceof C2373v) || (interfaceC2329q instanceof C2311o)) {
            return true;
        }
        if (!(interfaceC2329q instanceof C2266j)) {
            return interfaceC2329q instanceof C2364u ? interfaceC2329q.a().equals(interfaceC2329q2.a()) : interfaceC2329q instanceof C2239g ? interfaceC2329q.g().equals(interfaceC2329q2.g()) : interfaceC2329q == interfaceC2329q2;
        }
        if (Double.isNaN(interfaceC2329q.f().doubleValue()) || Double.isNaN(interfaceC2329q2.f().doubleValue())) {
            return false;
        }
        return interfaceC2329q.f().equals(interfaceC2329q2.f());
    }

    public static int g(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) (((d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static long h(double d10) {
        return g(d10) & 4294967295L;
    }

    public static double i(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return (d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10));
    }

    public static Object j(InterfaceC2329q interfaceC2329q) {
        if (InterfaceC2329q.f24621V.equals(interfaceC2329q)) {
            return null;
        }
        if (InterfaceC2329q.f24620U.equals(interfaceC2329q)) {
            return BuildConfig.FLAVOR;
        }
        if (interfaceC2329q instanceof C2302n) {
            return k((C2302n) interfaceC2329q);
        }
        if (!(interfaceC2329q instanceof C2230f)) {
            return !interfaceC2329q.f().isNaN() ? interfaceC2329q.f() : interfaceC2329q.a();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C2230f) interfaceC2329q).iterator();
        while (it.hasNext()) {
            Object j10 = j((InterfaceC2329q) it.next());
            if (j10 != null) {
                arrayList.add(j10);
            }
        }
        return arrayList;
    }

    public static Map k(C2302n c2302n) {
        HashMap hashMap = new HashMap();
        for (String str : c2302n.b()) {
            Object j10 = j(c2302n.e(str));
            if (j10 != null) {
                hashMap.put(str, j10);
            }
        }
        return hashMap;
    }

    public static int l(Y1 y12) {
        int g10 = g(y12.h("runtime.counter").f().doubleValue() + 1.0d);
        if (g10 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        y12.e("runtime.counter", new C2266j(Double.valueOf(g10)));
        return g10;
    }
}
