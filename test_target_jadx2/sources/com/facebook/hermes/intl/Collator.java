package com.facebook.hermes.intl;

import com.facebook.hermes.intl.a;
import com.facebook.hermes.intl.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Collator {

    /* renamed from: a, reason: collision with root package name */
    private a.d f20596a;

    /* renamed from: b, reason: collision with root package name */
    private a.c f20597b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20598c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20600e;

    /* renamed from: f, reason: collision with root package name */
    private a.b f20601f;

    /* renamed from: g, reason: collision with root package name */
    private Q3.b f20602g;

    /* renamed from: h, reason: collision with root package name */
    private Q3.b f20603h;

    /* renamed from: d, reason: collision with root package name */
    private String f20599d = "default";

    /* renamed from: i, reason: collision with root package name */
    private a f20604i = new h();

    public Collator(List<String> list, Map<String, Object> map) {
        a(list, map);
        this.f20604i.e(this.f20602g).d(this.f20600e).c(this.f20601f).f(this.f20597b).g(this.f20598c);
    }

    private void a(List list, Map map) {
        g.a aVar = g.a.STRING;
        this.f20596a = (a.d) g.d(a.d.class, Q3.d.h(g.c(map, "usage", aVar, Q3.a.f8145e, "sort")));
        Object q10 = Q3.d.q();
        Q3.d.c(q10, "localeMatcher", g.c(map, "localeMatcher", aVar, Q3.a.f8141a, "best fit"));
        Object c10 = g.c(map, "numeric", g.a.BOOLEAN, Q3.d.d(), Q3.d.d());
        if (!Q3.d.n(c10)) {
            c10 = Q3.d.r(String.valueOf(Q3.d.e(c10)));
        }
        Q3.d.c(q10, "kn", c10);
        Q3.d.c(q10, "kf", g.c(map, "caseFirst", aVar, Q3.a.f8144d, Q3.d.d()));
        HashMap a10 = f.a(list, q10, Arrays.asList("co", "kf", "kn"));
        Q3.b bVar = (Q3.b) Q3.d.g(a10).get("locale");
        this.f20602g = bVar;
        this.f20603h = bVar.e();
        Object a11 = Q3.d.a(a10, "co");
        if (Q3.d.j(a11)) {
            a11 = Q3.d.r("default");
        }
        this.f20599d = Q3.d.h(a11);
        Object a12 = Q3.d.a(a10, "kn");
        if (Q3.d.j(a12)) {
            this.f20600e = false;
        } else {
            this.f20600e = Boolean.parseBoolean(Q3.d.h(a12));
        }
        Object a13 = Q3.d.a(a10, "kf");
        if (Q3.d.j(a13)) {
            a13 = Q3.d.r("false");
        }
        this.f20601f = (a.b) g.d(a.b.class, Q3.d.h(a13));
        if (this.f20596a == a.d.SEARCH) {
            ArrayList c11 = this.f20602g.c("collation");
            ArrayList arrayList = new ArrayList();
            Iterator it = c11.iterator();
            while (it.hasNext()) {
                arrayList.add(Q3.h.e((String) it.next()));
            }
            arrayList.add(Q3.h.e("search"));
            this.f20602g.g("co", arrayList);
        }
        Object c12 = g.c(map, "sensitivity", g.a.STRING, Q3.a.f8143c, Q3.d.d());
        if (!Q3.d.n(c12)) {
            this.f20597b = (a.c) g.d(a.c.class, Q3.d.h(c12));
        } else if (this.f20596a == a.d.SORT) {
            this.f20597b = a.c.VARIANT;
        } else {
            this.f20597b = a.c.LOCALE;
        }
        this.f20598c = Q3.d.e(g.c(map, "ignorePunctuation", g.a.BOOLEAN, Q3.d.d(), Boolean.FALSE));
    }

    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        return Q3.d.h(g.c(map, "localeMatcher", g.a.STRING, Q3.a.f8141a, "best fit")).equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(new String[list.size()]))) : Arrays.asList(e.h((String[]) list.toArray(new String[list.size()])));
    }

    public double compare(String str, String str2) {
        return this.f20604i.a(str, str2);
    }

    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f20603h.a().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f20596a.toString());
        a.c cVar = this.f20597b;
        if (cVar == a.c.LOCALE) {
            linkedHashMap.put("sensitivity", this.f20604i.b().toString());
        } else {
            linkedHashMap.put("sensitivity", cVar.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f20598c));
        linkedHashMap.put("collation", this.f20599d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f20600e));
        linkedHashMap.put("caseFirst", this.f20601f.toString());
        return linkedHashMap;
    }
}
