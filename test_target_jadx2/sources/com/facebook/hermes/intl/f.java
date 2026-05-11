package com.facebook.hermes.intl;

import com.facebook.hermes.intl.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f {
    public static HashMap a(List list, Object obj, List list2) {
        HashMap hashMap = new HashMap();
        e.a f10 = Q3.d.h(Q3.d.a(obj, "localeMatcher")).equals("lookup") ? e.f((String[]) list.toArray(new String[list.size()])) : e.c((String[]) list.toArray(new String[list.size()]));
        HashSet<String> hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object b10 = Q3.d.b();
            Object obj2 = b10;
            if (!f10.f20673b.isEmpty()) {
                obj2 = b10;
                if (f10.f20673b.containsKey(str)) {
                    String str2 = (String) f10.f20673b.get(str);
                    boolean isEmpty = str2.isEmpty();
                    Object obj3 = str2;
                    if (isEmpty) {
                        obj3 = Q3.d.r("true");
                    }
                    hashSet.add(str);
                    obj2 = obj3;
                }
            }
            Object obj4 = obj2;
            if (Q3.d.g(obj).containsKey(str)) {
                Object a10 = Q3.d.a(obj, str);
                boolean m10 = Q3.d.m(a10);
                Object obj5 = a10;
                if (m10) {
                    boolean isEmpty2 = Q3.d.h(a10).isEmpty();
                    obj5 = a10;
                    if (isEmpty2) {
                        obj5 = Q3.d.o(true);
                    }
                }
                obj4 = obj2;
                if (!Q3.d.n(obj5)) {
                    boolean equals = obj5.equals(obj2);
                    obj4 = obj2;
                    if (!equals) {
                        hashSet.remove(str);
                        obj4 = obj5;
                    }
                }
            }
            boolean j10 = Q3.d.j(obj4);
            Object obj6 = obj4;
            if (!j10) {
                obj6 = Q3.h.f(str, obj4);
            }
            if (!Q3.d.m(obj6) || Q3.h.c(str, Q3.d.h(obj6), f10.f20672a)) {
                hashMap.put(str, obj6);
            } else {
                hashMap.put(str, Q3.d.b());
            }
        }
        for (String str3 : hashSet) {
            ArrayList arrayList = new ArrayList();
            String h10 = Q3.d.h(Q3.h.f(str3, Q3.d.r((String) f10.f20673b.get(str3))));
            if (!Q3.d.m(h10) || Q3.h.c(str3, Q3.d.h(h10), f10.f20672a)) {
                arrayList.add(h10);
                f10.f20672a.g(str3, arrayList);
            }
        }
        hashMap.put("locale", f10.f20672a);
        return hashMap;
    }
}
