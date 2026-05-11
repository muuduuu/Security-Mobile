package Td;

import be.AbstractC1681c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: k, reason: collision with root package name */
    public static final b f10161k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f10162l = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f10163m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f10164n = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f10165o = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    private final String f10166a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10167b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10168c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10169d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10170e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f10171f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f10172g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f10173h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f10174i;

    /* renamed from: j, reason: collision with root package name */
    private final String f10175j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f10176a;

        /* renamed from: b, reason: collision with root package name */
        private String f10177b;

        /* renamed from: d, reason: collision with root package name */
        private String f10179d;

        /* renamed from: f, reason: collision with root package name */
        private boolean f10181f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f10182g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f10183h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f10184i;

        /* renamed from: j, reason: collision with root package name */
        private String f10185j;

        /* renamed from: c, reason: collision with root package name */
        private long f10178c = 253402300799999L;

        /* renamed from: e, reason: collision with root package name */
        private String f10180e = "/";

        private final a c(String str, boolean z10) {
            String k10 = Wd.f.k(str);
            if (k10 != null) {
                this.f10179d = k10;
                this.f10184i = z10;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        public final n a() {
            String str = this.f10176a;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.f10177b;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j10 = this.f10178c;
            String str3 = this.f10179d;
            if (str3 != null) {
                return new n(str, str2, j10, str3, this.f10180e, this.f10181f, this.f10182g, this.f10183h, this.f10184i, this.f10185j, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        public final a b(String domain) {
            Intrinsics.checkNotNullParameter(domain, "domain");
            return c(domain, false);
        }

        public final a d(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (!Intrinsics.b(StringsKt.S0(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f10176a = name;
            return this;
        }

        public final a e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!Intrinsics.b(StringsKt.S0(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.f10177b = value;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private final boolean b(String str, String str2) {
            if (Intrinsics.b(str, str2)) {
                return true;
            }
            return StringsKt.q(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Wd.f.a(str);
        }

        private final String f(String str) {
            if (StringsKt.q(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String k10 = Wd.f.k(StringsKt.o0(str, "."));
            if (k10 != null) {
                return k10;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i10, int i11) {
            int a10 = a(str, i10, i11, false);
            Matcher matcher = n.f10165o.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            while (a10 < i11) {
                int a11 = a(str, a10 + 1, i11, true);
                matcher.region(a10, a11);
                if (i13 == -1 && matcher.usePattern(n.f10165o).matches()) {
                    String group = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group, "group(...)");
                    i13 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(group2, "group(...)");
                    i16 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(group3, "group(...)");
                    i17 = Integer.parseInt(group3);
                } else if (i14 == -1 && matcher.usePattern(n.f10164n).matches()) {
                    String group4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group4, "group(...)");
                    i14 = Integer.parseInt(group4);
                } else if (i15 == -1 && matcher.usePattern(n.f10163m).matches()) {
                    String group5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group5, "group(...)");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = group5.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    String pattern = n.f10163m.pattern();
                    Intrinsics.checkNotNullExpressionValue(pattern, "pattern(...)");
                    i15 = StringsKt.X(pattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(n.f10162l).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group6, "group(...)");
                    i12 = Integer.parseInt(group6);
                }
                a10 = a(str, a11 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (i12 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || i14 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i17 < 0 || i17 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Wd.p.f11600d);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, i15 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i16);
            gregorianCalendar.set(13, i17);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e10) {
                if (new Regex("-?\\d+").d(str)) {
                    return StringsKt.F(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final n c(w url, String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code restructure failed: missing block: B:87:0x010a, code lost:
        
            if (r1 > 253402300799999L) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final n d(long j10, w url, String setCookie) {
            long j11;
            String h10;
            n nVar;
            String str;
            String str2;
            String str3;
            int c02;
            String str4;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int l10 = Wd.m.l(setCookie, ';', 0, 0, 6, null);
            int l11 = Wd.m.l(setCookie, '=', 0, l10, 2, null);
            if (l11 == l10) {
                return null;
            }
            String J10 = Wd.m.J(setCookie, 0, l11, 1, null);
            if (J10.length() == 0 || Wd.m.s(J10) != -1) {
                return null;
            }
            String I10 = Wd.m.I(setCookie, l11 + 1, l10);
            if (Wd.m.s(I10) != -1) {
                return null;
            }
            int i10 = l10 + 1;
            int length = setCookie.length();
            String str5 = null;
            String str6 = null;
            String str7 = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long j12 = -1;
            long j13 = 253402300799999L;
            while (i10 < length) {
                int j14 = Wd.m.j(setCookie, ';', i10, length);
                int j15 = Wd.m.j(setCookie, '=', i10, j14);
                String I11 = Wd.m.I(setCookie, i10, j15);
                String I12 = j15 < j14 ? Wd.m.I(setCookie, j15 + 1, j14) : BuildConfig.FLAVOR;
                if (StringsKt.r(I11, "expires", true)) {
                    try {
                        j13 = g(I12, 0, I12.length());
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (StringsKt.r(I11, "max-age", true)) {
                    j12 = h(I12);
                } else {
                    if (StringsKt.r(I11, "domain", true)) {
                        str5 = f(I12);
                        z13 = false;
                    } else if (StringsKt.r(I11, "path", true)) {
                        str7 = I12;
                    } else if (StringsKt.r(I11, "secure", true)) {
                        z10 = true;
                    } else if (StringsKt.r(I11, "httponly", true)) {
                        z11 = true;
                    } else if (StringsKt.r(I11, "samesite", true)) {
                        str6 = I12;
                    }
                    i10 = j14 + 1;
                }
                z12 = true;
                i10 = j14 + 1;
            }
            long j16 = Long.MIN_VALUE;
            if (j12 != Long.MIN_VALUE) {
                if (j12 != -1) {
                    j16 = j10 + (j12 <= 9223372036854775L ? j12 * 1000 : Long.MAX_VALUE);
                    long j17 = j16 >= j10 ? 253402300799999L : 253402300799999L;
                    j11 = j17;
                } else {
                    j11 = j13;
                }
                h10 = url.h();
                if (str5 != null) {
                    str = h10;
                    nVar = null;
                } else {
                    if (!b(h10, str5)) {
                        return null;
                    }
                    nVar = null;
                    str = str5;
                }
                if (h10.length() == str.length() && okhttp3.internal.publicsuffix.a.f38054g.c().c(str) == null) {
                    return nVar;
                }
                str2 = "/";
                str3 = str7;
                if (str3 == null && StringsKt.F(str3, "/", false, 2, nVar)) {
                    str4 = str3;
                } else {
                    String c10 = url.c();
                    c02 = StringsKt.c0(c10, '/', 0, false, 6, null);
                    if (c02 != 0) {
                        str2 = c10.substring(0, c02);
                        Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
                    }
                    str4 = str2;
                }
                return new n(J10, I10, j11, str, str4, z10, z11, z12, z13, str6, null);
            }
            j11 = j16;
            h10 = url.h();
            if (str5 != null) {
            }
            if (h10.length() == str.length()) {
            }
            str2 = "/";
            str3 = str7;
            if (str3 == null) {
            }
            String c102 = url.c();
            c02 = StringsKt.c0(c102, '/', 0, false, 6, null);
            if (c02 != 0) {
            }
            str4 = str2;
            return new n(J10, I10, j11, str, str4, z10, z11, z12, z13, str6, null);
        }

        public final List e(w url, v headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List w10 = headers.w("Set-Cookie");
            int size = w10.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                n c10 = c(url, (String) w10.get(i10));
                if (c10 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c10);
                }
            }
            if (arrayList == null) {
                return CollectionsKt.j();
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.d(unmodifiableList);
            return unmodifiableList;
        }

        private b() {
        }
    }

    public /* synthetic */ n(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13, str5);
    }

    public final String e() {
        return this.f10166a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (Intrinsics.b(nVar.f10166a, this.f10166a) && Intrinsics.b(nVar.f10167b, this.f10167b) && nVar.f10168c == this.f10168c && Intrinsics.b(nVar.f10169d, this.f10169d) && Intrinsics.b(nVar.f10170e, this.f10170e) && nVar.f10171f == this.f10171f && nVar.f10172g == this.f10172g && nVar.f10173h == this.f10173h && nVar.f10174i == this.f10174i && Intrinsics.b(nVar.f10175j, this.f10175j)) {
                return true;
            }
        }
        return false;
    }

    public final String f(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10166a);
        sb2.append('=');
        sb2.append(this.f10167b);
        if (this.f10173h) {
            if (this.f10168c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(AbstractC1681c.b(new Date(this.f10168c)));
            }
        }
        if (!this.f10174i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f10169d);
        }
        sb2.append("; path=");
        sb2.append(this.f10170e);
        if (this.f10171f) {
            sb2.append("; secure");
        }
        if (this.f10172g) {
            sb2.append("; httponly");
        }
        if (this.f10175j != null) {
            sb2.append("; samesite=");
            sb2.append(this.f10175j);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final String g() {
        return this.f10167b;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((527 + this.f10166a.hashCode()) * 31) + this.f10167b.hashCode()) * 31) + Long.hashCode(this.f10168c)) * 31) + this.f10169d.hashCode()) * 31) + this.f10170e.hashCode()) * 31) + Boolean.hashCode(this.f10171f)) * 31) + Boolean.hashCode(this.f10172g)) * 31) + Boolean.hashCode(this.f10173h)) * 31) + Boolean.hashCode(this.f10174i)) * 31;
        String str = this.f10175j;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return f(false);
    }

    private n(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5) {
        this.f10166a = str;
        this.f10167b = str2;
        this.f10168c = j10;
        this.f10169d = str3;
        this.f10170e = str4;
        this.f10171f = z10;
        this.f10172g = z11;
        this.f10173h = z12;
        this.f10174i = z13;
        this.f10175j = str5;
    }
}
