package Q3;

import android.icu.text.Collator;
import android.icu.text.NumberingSystem;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static String f8151a = "calendar";

    /* renamed from: b, reason: collision with root package name */
    public static String f8152b = "ca";

    /* renamed from: c, reason: collision with root package name */
    public static String f8153c = "numbers";

    /* renamed from: d, reason: collision with root package name */
    public static String f8154d = "nu";

    /* renamed from: e, reason: collision with root package name */
    public static String f8155e = "hours";

    /* renamed from: f, reason: collision with root package name */
    public static String f8156f = "hc";

    /* renamed from: g, reason: collision with root package name */
    public static String f8157g = "collation";

    /* renamed from: h, reason: collision with root package name */
    public static String f8158h = "co";

    /* renamed from: i, reason: collision with root package name */
    public static String f8159i = "colnumeric";

    /* renamed from: j, reason: collision with root package name */
    public static String f8160j = "kn";

    /* renamed from: k, reason: collision with root package name */
    public static String f8161k = "colcasefirst";

    /* renamed from: l, reason: collision with root package name */
    public static String f8162l = "kf";

    /* renamed from: m, reason: collision with root package name */
    private static HashMap f8163m = new a();

    /* renamed from: n, reason: collision with root package name */
    private static HashMap f8164n = new b();

    /* renamed from: o, reason: collision with root package name */
    private static final Map f8165o = new c();

    /* renamed from: p, reason: collision with root package name */
    private static Map f8166p = new d();

    /* renamed from: q, reason: collision with root package name */
    private static Map f8167q = new e();

    /* renamed from: r, reason: collision with root package name */
    private static Map f8168r = new f();

    class a extends HashMap {
        a() {
            put(h.f8152b, h.f8151a);
            put(h.f8154d, h.f8153c);
            put(h.f8156f, h.f8155e);
            put(h.f8158h, h.f8157g);
            put(h.f8160j, h.f8159i);
            put(h.f8162l, h.f8161k);
        }
    }

    class b extends HashMap {
        b() {
            put(h.f8151a, h.f8152b);
            put(h.f8153c, h.f8154d);
            put(h.f8155e, h.f8156f);
            put(h.f8157g, h.f8158h);
            put(h.f8159i, h.f8160j);
            put(h.f8161k, h.f8162l);
        }
    }

    class c extends HashMap {
        c() {
            put("dictionary", "dict");
            put("phonebook", "phonebk");
            put("traditional", "trad");
            put("gb2312han", "gb2312");
        }
    }

    class d extends HashMap {
        d() {
            put("gregorian", "gregory");
        }
    }

    class e extends HashMap {
        e() {
            put("traditional", "traditio");
        }
    }

    class f extends HashMap {
        f() {
            put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
            put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
            put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
        }
    }

    public static String a(String str) {
        return f8163m.containsKey(str) ? (String) f8163m.get(str) : str;
    }

    public static String b(String str) {
        return f8164n.containsKey(str) ? (String) f8164n.get(str) : str;
    }

    public static boolean c(String str, String str2, Q3.b bVar) {
        ULocale uLocale = (ULocale) bVar.h();
        String[] strArr = new String[0];
        if (str.equals("co")) {
            if (str2.equals("standard") || str2.equals("search")) {
                return false;
            }
            strArr = Collator.getKeywordValuesForLocale("co", uLocale, false);
        } else if (str.equals("ca")) {
            strArr = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
        } else if (str.equals("nu")) {
            strArr = NumberingSystem.getAvailableNames();
        }
        if (strArr.length == 0) {
            return true;
        }
        return Arrays.asList(strArr).contains(str2);
    }

    public static String d(String str) {
        return !f8166p.containsKey(str) ? str : (String) f8166p.get(str);
    }

    public static String e(String str) {
        Map map = f8165o;
        return !map.containsKey(str) ? str : (String) map.get(str);
    }

    public static Object f(String str, Object obj) {
        return (str.equals("ca") && Q3.d.m(obj)) ? d((String) obj) : (str.equals("nu") && Q3.d.m(obj)) ? g((String) obj) : (str.equals("co") && Q3.d.m(obj)) ? e((String) obj) : (str.equals("kn") && Q3.d.m(obj) && obj.equals("yes")) ? Q3.d.r("true") : ((str.equals("kn") || str.equals("kf")) && Q3.d.m(obj) && obj.equals("no")) ? Q3.d.r("false") : obj;
    }

    public static String g(String str) {
        return !f8167q.containsKey(str) ? str : (String) f8167q.get(str);
    }
}
