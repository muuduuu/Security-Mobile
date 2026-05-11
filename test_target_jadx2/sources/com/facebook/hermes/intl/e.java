package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class e {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Q3.b f20672a;

        /* renamed from: b, reason: collision with root package name */
        public HashMap f20673b = new HashMap();
    }

    public static String a(String[] strArr, String str) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int lastIndexOf = str.lastIndexOf("-");
            if (lastIndexOf < 0) {
                return BuildConfig.FLAVOR;
            }
            if (lastIndexOf >= 2 && str.charAt(lastIndexOf - 2) == '-') {
                lastIndexOf -= 2;
            }
            str = str.substring(0, lastIndexOf);
        }
        return str;
    }

    public static ULocale b(Q3.b bVar) {
        boolean[] zArr = new boolean[1];
        ULocale acceptLanguage = ULocale.acceptLanguage(new ULocale[]{(ULocale) bVar.d()}, ULocale.getAvailableLocales(), zArr);
        if (zArr[0] || acceptLanguage == null) {
            return null;
        }
        return acceptLanguage;
    }

    public static a c(String[] strArr) {
        a aVar = new a();
        for (String str : strArr) {
            Q3.b b10 = Q3.f.b(str);
            ULocale b11 = b(b10);
            if (b11 != null) {
                aVar.f20672a = Q3.g.k(b11);
                aVar.f20673b = b10.b();
                return aVar;
            }
        }
        aVar.f20672a = Q3.g.i();
        return aVar;
    }

    public static String[] d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (b(Q3.f.b(str)) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] e() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static a f(String[] strArr) {
        return g(strArr, e());
    }

    public static a g(String[] strArr, String[] strArr2) {
        a aVar = new a();
        for (String str : strArr) {
            Q3.b b10 = Q3.f.b(str);
            String a10 = a(strArr2, b10.f());
            if (!a10.isEmpty()) {
                aVar.f20672a = Q3.f.b(a10);
                aVar.f20673b = b10.b();
                return aVar;
            }
        }
        aVar.f20672a = Q3.f.a();
        return aVar;
    }

    public static String[] h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] e10 = e();
        for (String str : strArr) {
            String a10 = a(e10, Q3.f.b(str).f());
            if (a10 != null && !a10.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
