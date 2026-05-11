package com.facebook.hermes.intl;

import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class g {

    public enum a {
        BOOLEAN,
        STRING
    }

    public static Object a(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (Q3.d.n(obj)) {
            return obj4;
        }
        if (!Q3.d.k(obj)) {
            throw new Q3.e(str + " value is invalid.");
        }
        double f10 = Q3.d.f(obj);
        if (!Double.isNaN(f10) && f10 <= Q3.d.f(obj3) && f10 >= Q3.d.f(obj2)) {
            return obj;
        }
        throw new Q3.e(str + " value is invalid.");
    }

    public static Object b(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        return a(str, Q3.d.a(obj, str), obj2, obj3, obj4);
    }

    public static Object c(Object obj, String str, a aVar, Object obj2, Object obj3) {
        Object a10 = Q3.d.a(obj, str);
        if (Q3.d.n(a10)) {
            return obj3;
        }
        if (Q3.d.j(a10)) {
            a10 = BuildConfig.FLAVOR;
        }
        if (aVar == a.BOOLEAN && !Q3.d.i(a10)) {
            throw new Q3.e("Boolean option expected but not found");
        }
        if (aVar == a.STRING && !Q3.d.m(a10)) {
            throw new Q3.e("String option expected but not found");
        }
        if (Q3.d.n(obj2) || Arrays.asList((Object[]) obj2).contains(a10)) {
            return a10;
        }
        throw new Q3.e("String option expected but not found");
    }

    public static Enum d(Class cls, Object obj) {
        if (Q3.d.n(obj)) {
            return Enum.valueOf(cls, "UNDEFINED");
        }
        if (Q3.d.j(obj)) {
            return null;
        }
        String h10 = Q3.d.h(obj);
        if (h10.equals("2-digit")) {
            return Enum.valueOf(cls, "DIGIT2");
        }
        for (Enum r32 : (Enum[]) cls.getEnumConstants()) {
            if (r32.name().compareToIgnoreCase(h10) == 0) {
                return r32;
            }
        }
        return null;
    }
}
