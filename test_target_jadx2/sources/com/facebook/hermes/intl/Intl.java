package com.facebook.hermes.intl;

import android.icu.lang.UCharacter;
import android.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Intl {
    private static List a(List list) {
        if (list.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                throw new Q3.e("Incorrect locale information provided");
            }
            if (str.isEmpty()) {
                throw new Q3.e("Incorrect locale information provided");
            }
            String a10 = d.a(str);
            if (!a10.isEmpty() && !arrayList.contains(a10)) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    public static List<String> getCanonicalLocales(List<String> list) {
        return a(list);
    }

    public static String toLocaleLowerCase(List<String> list, String str) {
        return UCharacter.toLowerCase((ULocale) e.c((String[]) list.toArray(new String[list.size()])).f20672a.h(), str);
    }

    public static String toLocaleUpperCase(List<String> list, String str) {
        return UCharacter.toUpperCase((ULocale) e.c((String[]) list.toArray(new String[list.size()])).f20672a.h(), str);
    }
}
