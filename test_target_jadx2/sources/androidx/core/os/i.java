package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    private static final i f15973b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private final j f15974a;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Locale[] f15975a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale locale2 : f15975a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String a10 = androidx.core.text.c.a(locale);
            if (!a10.isEmpty()) {
                return a10.equals(androidx.core.text.c.a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private i(j jVar) {
        this.f15974a = jVar;
    }

    public static i a(Locale... localeArr) {
        return i(b.a(localeArr));
    }

    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(split[i10]);
        }
        return a(localeArr);
    }

    public static i d() {
        return f15973b;
    }

    public static i i(LocaleList localeList) {
        return new i(new k(localeList));
    }

    public Locale c(int i10) {
        return this.f15974a.get(i10);
    }

    public boolean e() {
        return this.f15974a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f15974a.equals(((i) obj).f15974a);
    }

    public int f() {
        return this.f15974a.size();
    }

    public String g() {
        return this.f15974a.a();
    }

    public Object h() {
        return this.f15974a.b();
    }

    public int hashCode() {
        return this.f15974a.hashCode();
    }

    public String toString() {
        return this.f15974a.toString();
    }
}
