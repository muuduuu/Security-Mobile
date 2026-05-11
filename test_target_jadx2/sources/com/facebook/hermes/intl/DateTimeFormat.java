package com.facebook.hermes.intl;

import com.facebook.hermes.intl.b;
import com.facebook.hermes.intl.g;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class DateTimeFormat {

    /* renamed from: d, reason: collision with root package name */
    private boolean f20608d;

    /* renamed from: e, reason: collision with root package name */
    private String f20609e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20610f;

    /* renamed from: g, reason: collision with root package name */
    private String f20611g;

    /* renamed from: h, reason: collision with root package name */
    private Object f20612h;

    /* renamed from: i, reason: collision with root package name */
    private b.g f20613i;

    /* renamed from: j, reason: collision with root package name */
    private b.e f20614j;

    /* renamed from: k, reason: collision with root package name */
    private b.m f20615k;

    /* renamed from: l, reason: collision with root package name */
    private b.d f20616l;

    /* renamed from: m, reason: collision with root package name */
    private b.n f20617m;

    /* renamed from: n, reason: collision with root package name */
    private b.i f20618n;

    /* renamed from: o, reason: collision with root package name */
    private b.c f20619o;

    /* renamed from: p, reason: collision with root package name */
    private b.f f20620p;

    /* renamed from: q, reason: collision with root package name */
    private b.h f20621q;

    /* renamed from: r, reason: collision with root package name */
    private b.j f20622r;

    /* renamed from: s, reason: collision with root package name */
    private b.l f20623s;

    /* renamed from: t, reason: collision with root package name */
    private b.EnumC0365b f20624t;

    /* renamed from: u, reason: collision with root package name */
    private b.k f20625u;

    /* renamed from: b, reason: collision with root package name */
    private Q3.b f20606b = null;

    /* renamed from: c, reason: collision with root package name */
    private Q3.b f20607c = null;

    /* renamed from: v, reason: collision with root package name */
    private Object f20626v = null;

    /* renamed from: a, reason: collision with root package name */
    b f20605a = new i();

    public DateTimeFormat(List<String> list, Map<String, Object> map) {
        c(list, map);
        b bVar = this.f20605a;
        Q3.b bVar2 = this.f20606b;
        boolean z10 = this.f20608d;
        String str = BuildConfig.FLAVOR;
        bVar.e(bVar2, z10 ? BuildConfig.FLAVOR : this.f20609e, this.f20610f ? str : this.f20611g, this.f20614j, this.f20615k, this.f20616l, this.f20617m, this.f20618n, this.f20619o, this.f20620p, this.f20621q, this.f20622r, this.f20623s, this.f20613i, this.f20626v, this.f20624t, this.f20625u, this.f20612h);
    }

    private Object a() {
        return this.f20605a.d(this.f20606b);
    }

    private Object b(Object obj, String str, String str2) {
        if (!Q3.d.l(obj)) {
            throw new Q3.e("Invalid options object !");
        }
        boolean z10 = true;
        if (str.equals("date") || str.equals("any")) {
            String[] strArr = {"weekday", "year", "month", "day"};
            for (int i10 = 0; i10 < 4; i10++) {
                if (!Q3.d.n(Q3.d.a(obj, strArr[i10]))) {
                    z10 = false;
                }
            }
        }
        if (str.equals("time") || str.equals("any")) {
            String[] strArr2 = {"hour", "minute", "second"};
            for (int i11 = 0; i11 < 3; i11++) {
                if (!Q3.d.n(Q3.d.a(obj, strArr2[i11]))) {
                    z10 = false;
                }
            }
        }
        if (!Q3.d.n(Q3.d.a(obj, "dateStyle")) || !Q3.d.n(Q3.d.a(obj, "timeStyle"))) {
            z10 = false;
        }
        if (z10 && (str2.equals("date") || str2.equals("all"))) {
            String[] strArr3 = {"year", "month", "day"};
            for (int i12 = 0; i12 < 3; i12++) {
                Q3.d.c(obj, strArr3[i12], "numeric");
            }
        }
        if (z10 && (str2.equals("time") || str2.equals("all"))) {
            String[] strArr4 = {"hour", "minute", "second"};
            for (int i13 = 0; i13 < 3; i13++) {
                Q3.d.c(obj, strArr4[i13], "numeric");
            }
        }
        return obj;
    }

    private void c(List list, Map map) {
        List asList = Arrays.asList("ca", "nu", "hc");
        Object b10 = b(map, "any", "date");
        Object q10 = Q3.d.q();
        g.a aVar = g.a.STRING;
        Q3.d.c(q10, "localeMatcher", g.c(b10, "localeMatcher", aVar, Q3.a.f8141a, "best fit"));
        Object c10 = g.c(b10, "calendar", aVar, Q3.d.d(), Q3.d.d());
        if (!Q3.d.n(c10) && !d(Q3.d.h(c10))) {
            throw new Q3.e("Invalid calendar option !");
        }
        Q3.d.c(q10, "ca", c10);
        Object c11 = g.c(b10, "numberingSystem", aVar, Q3.d.d(), Q3.d.d());
        if (!Q3.d.n(c11) && !d(Q3.d.h(c11))) {
            throw new Q3.e("Invalid numbering system !");
        }
        Q3.d.c(q10, "nu", c11);
        Object c12 = g.c(b10, "hour12", g.a.BOOLEAN, Q3.d.d(), Q3.d.d());
        Object c13 = g.c(b10, "hourCycle", aVar, new String[]{"h11", "h12", "h23", "h24"}, Q3.d.d());
        if (!Q3.d.n(c12)) {
            c13 = Q3.d.b();
        }
        Q3.d.c(q10, "hc", c13);
        HashMap a10 = f.a(list, q10, asList);
        Q3.b bVar = (Q3.b) Q3.d.g(a10).get("locale");
        this.f20606b = bVar;
        this.f20607c = bVar.e();
        Object a11 = Q3.d.a(a10, "ca");
        if (Q3.d.j(a11)) {
            this.f20608d = true;
            this.f20609e = this.f20605a.f(this.f20606b);
        } else {
            this.f20608d = false;
            this.f20609e = Q3.d.h(a11);
        }
        Object a12 = Q3.d.a(a10, "nu");
        if (Q3.d.j(a12)) {
            this.f20610f = true;
            this.f20611g = this.f20605a.b(this.f20606b);
        } else {
            this.f20610f = false;
            this.f20611g = Q3.d.h(a12);
        }
        Object a13 = Q3.d.a(a10, "hc");
        Object a14 = Q3.d.a(b10, "timeZone");
        this.f20626v = Q3.d.n(a14) ? a() : e(a14.toString());
        this.f20614j = (b.e) g.d(b.e.class, Q3.d.h(g.c(b10, "formatMatcher", aVar, new String[]{"basic", "best fit"}, "best fit")));
        this.f20615k = (b.m) g.d(b.m.class, g.c(b10, "weekday", aVar, new String[]{"long", "short", "narrow"}, Q3.d.d()));
        this.f20616l = (b.d) g.d(b.d.class, g.c(b10, "era", aVar, new String[]{"long", "short", "narrow"}, Q3.d.d()));
        this.f20617m = (b.n) g.d(b.n.class, g.c(b10, "year", aVar, new String[]{"numeric", "2-digit"}, Q3.d.d()));
        this.f20618n = (b.i) g.d(b.i.class, g.c(b10, "month", aVar, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, Q3.d.d()));
        this.f20619o = (b.c) g.d(b.c.class, g.c(b10, "day", aVar, new String[]{"numeric", "2-digit"}, Q3.d.d()));
        Object c14 = g.c(b10, "hour", aVar, new String[]{"numeric", "2-digit"}, Q3.d.d());
        this.f20620p = (b.f) g.d(b.f.class, c14);
        this.f20621q = (b.h) g.d(b.h.class, g.c(b10, "minute", aVar, new String[]{"numeric", "2-digit"}, Q3.d.d()));
        this.f20622r = (b.j) g.d(b.j.class, g.c(b10, "second", aVar, new String[]{"numeric", "2-digit"}, Q3.d.d()));
        this.f20623s = (b.l) g.d(b.l.class, g.c(b10, "timeZoneName", aVar, new String[]{"long", "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, Q3.d.d()));
        this.f20624t = (b.EnumC0365b) g.d(b.EnumC0365b.class, g.c(b10, "dateStyle", aVar, new String[]{"full", "long", "medium", "short"}, Q3.d.d()));
        Object c15 = g.c(b10, "timeStyle", aVar, new String[]{"full", "long", "medium", "short"}, Q3.d.d());
        this.f20625u = (b.k) g.d(b.k.class, c15);
        if (Q3.d.n(c14) && Q3.d.n(c15)) {
            this.f20613i = b.g.UNDEFINED;
        } else {
            b.g h10 = this.f20605a.h(this.f20606b);
            b.g gVar = Q3.d.j(a13) ? h10 : (b.g) g.d(b.g.class, a13);
            if (!Q3.d.n(c12)) {
                if (Q3.d.e(c12)) {
                    gVar = b.g.H11;
                    if (h10 != gVar && h10 != b.g.H23) {
                        gVar = b.g.H12;
                    }
                } else {
                    gVar = (h10 == b.g.H11 || h10 == b.g.H23) ? b.g.H23 : b.g.H24;
                }
            }
            this.f20613i = gVar;
        }
        this.f20612h = c12;
    }

    private boolean d(String str) {
        return Q3.c.e(str, 0, str.length() - 1);
    }

    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String h10 = Q3.d.h(g.c(map, "localeMatcher", g.a.STRING, Q3.a.f8141a, "best fit"));
        String[] strArr = new String[list.size()];
        return h10.equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(strArr))) : Arrays.asList(e.h((String[]) list.toArray(strArr)));
    }

    public String e(String str) {
        for (String str2 : TimeZone.getAvailableIDs()) {
            if (f(str2).equals(f(str))) {
                return str2;
            }
        }
        throw new Q3.e("Invalid timezone name!");
    }

    public String f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < 'A' || charAt > 'Z') {
                sb2.append(charAt);
            } else {
                sb2.append((char) (charAt + ' '));
            }
        }
        return sb2.toString();
    }

    public String format(double d10) {
        return this.f20605a.c(d10);
    }

    public List<Map<String, String>> formatToParts(double d10) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator a10 = this.f20605a.a(d10);
        StringBuilder sb2 = new StringBuilder();
        for (char first = a10.first(); first != 65535; first = a10.next()) {
            sb2.append(first);
            if (a10.getIndex() + 1 == a10.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = a10.getAttributes().keySet().iterator();
                String g10 = it.hasNext() ? this.f20605a.g(it.next(), sb2.toString()) : "literal";
                String sb3 = sb2.toString();
                sb2.setLength(0);
                HashMap hashMap = new HashMap();
                hashMap.put("type", g10);
                hashMap.put("value", sb3);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f20607c.a());
        linkedHashMap.put("numberingSystem", this.f20611g);
        linkedHashMap.put("calendar", this.f20609e);
        linkedHashMap.put("timeZone", this.f20626v);
        b.g gVar = this.f20613i;
        if (gVar != b.g.UNDEFINED) {
            linkedHashMap.put("hourCycle", gVar.toString());
            b.g gVar2 = this.f20613i;
            if (gVar2 == b.g.H11 || gVar2 == b.g.H12) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        b.m mVar = this.f20615k;
        if (mVar != b.m.UNDEFINED) {
            linkedHashMap.put("weekday", mVar.toString());
        }
        b.d dVar = this.f20616l;
        if (dVar != b.d.UNDEFINED) {
            linkedHashMap.put("era", dVar.toString());
        }
        b.n nVar = this.f20617m;
        if (nVar != b.n.UNDEFINED) {
            linkedHashMap.put("year", nVar.toString());
        }
        b.i iVar = this.f20618n;
        if (iVar != b.i.UNDEFINED) {
            linkedHashMap.put("month", iVar.toString());
        }
        b.c cVar = this.f20619o;
        if (cVar != b.c.UNDEFINED) {
            linkedHashMap.put("day", cVar.toString());
        }
        b.f fVar = this.f20620p;
        if (fVar != b.f.UNDEFINED) {
            linkedHashMap.put("hour", fVar.toString());
        }
        b.h hVar = this.f20621q;
        if (hVar != b.h.UNDEFINED) {
            linkedHashMap.put("minute", hVar.toString());
        }
        b.j jVar = this.f20622r;
        if (jVar != b.j.UNDEFINED) {
            linkedHashMap.put("second", jVar.toString());
        }
        b.l lVar = this.f20623s;
        if (lVar != b.l.UNDEFINED) {
            linkedHashMap.put("timeZoneName", lVar.toString());
        }
        b.EnumC0365b enumC0365b = this.f20624t;
        if (enumC0365b != b.EnumC0365b.UNDEFINED) {
            linkedHashMap.put("dateStyle", enumC0365b.toString());
        }
        b.k kVar = this.f20625u;
        if (kVar != b.k.UNDEFINED) {
            linkedHashMap.put("timeStyle", kVar.toString());
        }
        return linkedHashMap;
    }
}
