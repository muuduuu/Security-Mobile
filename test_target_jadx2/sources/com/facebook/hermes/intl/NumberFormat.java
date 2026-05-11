package com.facebook.hermes.intl;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.hermes.intl.c;
import com.facebook.hermes.intl.g;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class NumberFormat {

    /* renamed from: v, reason: collision with root package name */
    private static String[] f20627v = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* renamed from: a, reason: collision with root package name */
    private c.h f20628a;

    /* renamed from: f, reason: collision with root package name */
    private c.i f20633f;

    /* renamed from: m, reason: collision with root package name */
    private c.f f20640m;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20643p;

    /* renamed from: s, reason: collision with root package name */
    private c.b f20646s;

    /* renamed from: b, reason: collision with root package name */
    private String f20629b = null;

    /* renamed from: c, reason: collision with root package name */
    private c.EnumC0366c f20630c = c.EnumC0366c.SYMBOL;

    /* renamed from: d, reason: collision with root package name */
    private c.d f20631d = c.d.STANDARD;

    /* renamed from: e, reason: collision with root package name */
    private String f20632e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20634g = true;

    /* renamed from: h, reason: collision with root package name */
    private int f20635h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f20636i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f20637j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f20638k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f20639l = -1;

    /* renamed from: n, reason: collision with root package name */
    private c.g f20641n = c.g.AUTO;

    /* renamed from: q, reason: collision with root package name */
    private String f20644q = null;

    /* renamed from: r, reason: collision with root package name */
    private c.e f20645r = null;

    /* renamed from: t, reason: collision with root package name */
    private Q3.b f20647t = null;

    /* renamed from: u, reason: collision with root package name */
    private Q3.b f20648u = null;

    /* renamed from: o, reason: collision with root package name */
    private c f20642o = new j();

    public NumberFormat(List<String> list, Map<String, Object> map) {
        a(list, map);
        this.f20642o.d(this.f20647t, this.f20643p ? BuildConfig.FLAVOR : this.f20644q, this.f20628a, this.f20631d, this.f20645r, this.f20646s).g(this.f20629b, this.f20630c).k(this.f20634g).j(this.f20635h).h(this.f20640m, this.f20638k, this.f20639l).l(this.f20640m, this.f20636i, this.f20637j).f(this.f20641n).e(this.f20632e, this.f20633f);
    }

    private void a(List list, Map map) {
        Object p10;
        Object p11;
        Object q10 = Q3.d.q();
        g.a aVar = g.a.STRING;
        Q3.d.c(q10, "localeMatcher", g.c(map, "localeMatcher", aVar, Q3.a.f8141a, "best fit"));
        Object c10 = g.c(map, "numberingSystem", aVar, Q3.d.d(), Q3.d.d());
        if (!Q3.d.n(c10) && !b(Q3.d.h(c10))) {
            throw new Q3.e("Invalid numbering system !");
        }
        Q3.d.c(q10, "nu", c10);
        HashMap a10 = f.a(list, q10, Collections.singletonList("nu"));
        Q3.b bVar = (Q3.b) Q3.d.g(a10).get("locale");
        this.f20647t = bVar;
        this.f20648u = bVar.e();
        Object a11 = Q3.d.a(a10, "nu");
        if (Q3.d.j(a11)) {
            this.f20643p = true;
            this.f20644q = this.f20642o.b(this.f20647t);
        } else {
            this.f20643p = false;
            this.f20644q = Q3.d.h(a11);
        }
        h(map);
        if (this.f20628a == c.h.CURRENCY) {
            double n10 = j.n(this.f20629b);
            p10 = Q3.d.p(n10);
            p11 = Q3.d.p(n10);
        } else {
            p10 = Q3.d.p(0.0d);
            p11 = this.f20628a == c.h.PERCENT ? Q3.d.p(0.0d) : Q3.d.p(3.0d);
        }
        this.f20645r = (c.e) g.d(c.e.class, Q3.d.h(g.c(map, "notation", aVar, new String[]{"standard", "scientific", "engineering", "compact"}, "standard")));
        g(map, p10, p11);
        Object c11 = g.c(map, "compactDisplay", aVar, new String[]{"short", "long"}, "short");
        if (this.f20645r == c.e.COMPACT) {
            this.f20646s = (c.b) g.d(c.b.class, Q3.d.h(c11));
        }
        this.f20634g = Q3.d.e(g.c(map, "useGrouping", g.a.BOOLEAN, Q3.d.d(), Q3.d.o(true)));
        this.f20641n = (c.g) g.d(c.g.class, Q3.d.h(g.c(map, "signDisplay", aVar, new String[]{"auto", "never", "always", "exceptZero"}, "auto")));
    }

    private boolean b(String str) {
        return Q3.c.e(str, 0, str.length() - 1);
    }

    private boolean c(String str) {
        return Arrays.binarySearch(f20627v, str) >= 0;
    }

    private boolean d(String str) {
        return f(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    private boolean e(String str) {
        if (c(str)) {
            return true;
        }
        int indexOf = str.indexOf("-per-");
        return indexOf >= 0 && str.indexOf("-per-", indexOf + 1) < 0 && c(str.substring(0, indexOf)) && c(str.substring(indexOf + 5));
    }

    private String f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < 'a' || charAt > 'z') {
                sb2.append(charAt);
            } else {
                sb2.append((char) (charAt - ' '));
            }
        }
        return sb2.toString();
    }

    private void g(Map map, Object obj, Object obj2) {
        Object b10 = g.b(map, "minimumIntegerDigits", Q3.d.p(1.0d), Q3.d.p(21.0d), Q3.d.p(1.0d));
        Object a10 = Q3.d.a(map, "minimumFractionDigits");
        Object a11 = Q3.d.a(map, "maximumFractionDigits");
        Object a12 = Q3.d.a(map, "minimumSignificantDigits");
        Object a13 = Q3.d.a(map, "maximumSignificantDigits");
        this.f20635h = (int) Math.floor(Q3.d.f(b10));
        if (!Q3.d.n(a12) || !Q3.d.n(a13)) {
            this.f20640m = c.f.SIGNIFICANT_DIGITS;
            Object a14 = g.a("minimumSignificantDigits", a12, Q3.d.p(1.0d), Q3.d.p(21.0d), Q3.d.p(1.0d));
            Object a15 = g.a("maximumSignificantDigits", a13, a14, Q3.d.p(21.0d), Q3.d.p(21.0d));
            this.f20638k = (int) Math.floor(Q3.d.f(a14));
            this.f20639l = (int) Math.floor(Q3.d.f(a15));
            return;
        }
        if (Q3.d.n(a10) && Q3.d.n(a11)) {
            c.e eVar = this.f20645r;
            if (eVar == c.e.COMPACT) {
                this.f20640m = c.f.COMPACT_ROUNDING;
                return;
            }
            if (eVar == c.e.ENGINEERING) {
                this.f20640m = c.f.FRACTION_DIGITS;
                this.f20637j = 5;
                return;
            } else {
                this.f20640m = c.f.FRACTION_DIGITS;
                this.f20636i = (int) Math.floor(Q3.d.f(obj));
                this.f20637j = (int) Math.floor(Q3.d.f(obj2));
                return;
            }
        }
        this.f20640m = c.f.FRACTION_DIGITS;
        Object a16 = g.a("minimumFractionDigits", a10, Q3.d.p(0.0d), Q3.d.p(20.0d), Q3.d.d());
        Object a17 = g.a("maximumFractionDigits", a11, Q3.d.p(0.0d), Q3.d.p(20.0d), Q3.d.d());
        if (Q3.d.n(a16)) {
            a16 = Q3.d.p(Math.min(Q3.d.f(obj), Q3.d.f(a17)));
        } else if (Q3.d.n(a17)) {
            a17 = Q3.d.p(Math.max(Q3.d.f(obj2), Q3.d.f(a16)));
        } else if (Q3.d.f(a16) > Q3.d.f(a17)) {
            throw new Q3.e("minimumFractionDigits is greater than maximumFractionDigits");
        }
        this.f20636i = (int) Math.floor(Q3.d.f(a16));
        this.f20637j = (int) Math.floor(Q3.d.f(a17));
    }

    private void h(Map map) {
        g.a aVar = g.a.STRING;
        this.f20628a = (c.h) g.d(c.h.class, Q3.d.h(g.c(map, "style", aVar, new String[]{"decimal", "percent", "currency", "unit"}, "decimal")));
        Object c10 = g.c(map, "currency", aVar, Q3.d.d(), Q3.d.d());
        if (Q3.d.n(c10)) {
            if (this.f20628a == c.h.CURRENCY) {
                throw new Q3.e("Expected currency style !");
            }
        } else if (!d(Q3.d.h(c10))) {
            throw new Q3.e("Malformed currency code !");
        }
        Object c11 = g.c(map, "currencyDisplay", aVar, new String[]{"symbol", "narrowSymbol", AppConstants.RETAKE_ERROR_CODE, "name"}, "symbol");
        Object c12 = g.c(map, "currencySign", aVar, new String[]{"accounting", "standard"}, "standard");
        Object c13 = g.c(map, "unit", aVar, Q3.d.d(), Q3.d.d());
        if (Q3.d.n(c13)) {
            if (this.f20628a == c.h.UNIT) {
                throw new Q3.e("Expected unit !");
            }
        } else if (!e(Q3.d.h(c13))) {
            throw new Q3.e("Malformed unit identifier !");
        }
        Object c14 = g.c(map, "unitDisplay", aVar, new String[]{"long", "short", "narrow"}, "short");
        c.h hVar = this.f20628a;
        if (hVar == c.h.CURRENCY) {
            this.f20629b = f(Q3.d.h(c10));
            this.f20630c = (c.EnumC0366c) g.d(c.EnumC0366c.class, Q3.d.h(c11));
            this.f20631d = (c.d) g.d(c.d.class, Q3.d.h(c12));
        } else if (hVar == c.h.UNIT) {
            this.f20632e = Q3.d.h(c13);
            this.f20633f = (c.i) g.d(c.i.class, Q3.d.h(c14));
        }
    }

    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String h10 = Q3.d.h(g.c(map, "localeMatcher", g.a.STRING, Q3.a.f8141a, "best fit"));
        String[] strArr = new String[list.size()];
        return h10.equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(strArr))) : Arrays.asList(e.h((String[]) list.toArray(strArr)));
    }

    public String format(double d10) {
        return this.f20642o.c(d10);
    }

    public List<Map<String, String>> formatToParts(double d10) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator a10 = this.f20642o.a(d10);
        StringBuilder sb2 = new StringBuilder();
        for (char first = a10.first(); first != 65535; first = a10.next()) {
            sb2.append(first);
            if (a10.getIndex() + 1 == a10.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = a10.getAttributes().keySet().iterator();
                String i10 = it.hasNext() ? this.f20642o.i(it.next(), d10) : "literal";
                String sb3 = sb2.toString();
                sb2.setLength(0);
                HashMap hashMap = new HashMap();
                hashMap.put("type", i10);
                hashMap.put("value", sb3);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f20648u.a());
        linkedHashMap.put("numberingSystem", this.f20644q);
        linkedHashMap.put("style", this.f20628a.toString());
        c.h hVar = this.f20628a;
        if (hVar == c.h.CURRENCY) {
            linkedHashMap.put("currency", this.f20629b);
            linkedHashMap.put("currencyDisplay", this.f20630c.toString());
            linkedHashMap.put("currencySign", this.f20631d.toString());
        } else if (hVar == c.h.UNIT) {
            linkedHashMap.put("unit", this.f20632e);
            linkedHashMap.put("unitDisplay", this.f20633f.toString());
        }
        int i10 = this.f20635h;
        if (i10 != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i10));
        }
        c.f fVar = this.f20640m;
        if (fVar == c.f.SIGNIFICANT_DIGITS) {
            int i11 = this.f20639l;
            if (i11 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i11));
            }
            int i12 = this.f20638k;
            if (i12 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i12));
            }
        } else if (fVar == c.f.FRACTION_DIGITS) {
            int i13 = this.f20636i;
            if (i13 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i13));
            }
            int i14 = this.f20637j;
            if (i14 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i14));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f20634g));
        linkedHashMap.put("notation", this.f20645r.toString());
        if (this.f20645r == c.e.COMPACT) {
            linkedHashMap.put("compactDisplay", this.f20646s.toString());
        }
        linkedHashMap.put("signDisplay", this.f20641n.toString());
        return linkedHashMap;
    }
}
