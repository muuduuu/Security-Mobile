package Td;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: j, reason: collision with root package name */
    public static final b f10220j = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f10221a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10222b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10223c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10224d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10225e;

    /* renamed from: f, reason: collision with root package name */
    private final List f10226f;

    /* renamed from: g, reason: collision with root package name */
    private final List f10227g;

    /* renamed from: h, reason: collision with root package name */
    private final String f10228h;

    /* renamed from: i, reason: collision with root package name */
    private final String f10229i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f10230a;

        /* renamed from: d, reason: collision with root package name */
        private String f10233d;

        /* renamed from: g, reason: collision with root package name */
        private List f10236g;

        /* renamed from: h, reason: collision with root package name */
        private String f10237h;

        /* renamed from: b, reason: collision with root package name */
        private String f10231b = BuildConfig.FLAVOR;

        /* renamed from: c, reason: collision with root package name */
        private String f10232c = BuildConfig.FLAVOR;

        /* renamed from: e, reason: collision with root package name */
        private int f10234e = -1;

        /* renamed from: f, reason: collision with root package name */
        private final List f10235f = CollectionsKt.p(BuildConfig.FLAVOR);

        private final int B(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        private final void C(List list, StringBuilder sb2) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append((String) list.get(i10));
            }
        }

        private final List D(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int W10 = StringsKt.W(str, '&', i10, false, 4, null);
                if (W10 == -1) {
                    W10 = str.length();
                }
                int i11 = W10;
                int W11 = StringsKt.W(str, '=', i10, false, 4, null);
                if (W11 == -1 || W11 > i11) {
                    String substring = str.substring(i10, i11);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str.substring(i10, W11);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(W11 + 1, i11);
                    Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                    arrayList.add(substring3);
                }
                i10 = i11 + 1;
            }
            return arrayList;
        }

        private final int d() {
            int i10 = this.f10234e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = w.f10220j;
            String str = this.f10230a;
            Intrinsics.d(str);
            return bVar.b(str);
        }

        private final boolean h(String str) {
            return Intrinsics.b(str, ".") || StringsKt.r(str, "%2e", true);
        }

        private final boolean i(String str) {
            return Intrinsics.b(str, "..") || StringsKt.r(str, "%2e.", true) || StringsKt.r(str, ".%2e", true) || StringsKt.r(str, "%2e%2e", true);
        }

        private final int k(String str, int i10, int i11) {
            String a10;
            try {
                a10 = ke.a.a(str, (r18 & 1) != 0 ? 0 : i10, (r18 & 2) != 0 ? str.length() : i11, BuildConfig.FLAVOR, (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
                int parseInt = Integer.parseInt(a10);
                if (1 > parseInt || parseInt >= 65536) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private final void m() {
            if (((String) this.f10235f.remove(r0.size() - 1)).length() != 0 || this.f10235f.isEmpty()) {
                this.f10235f.add(BuildConfig.FLAVOR);
            } else {
                this.f10235f.set(r0.size() - 1, BuildConfig.FLAVOR);
            }
        }

        private final int o(String str, int i10, int i11) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt == '[') {
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                    } while (str.charAt(i10) != ']');
                } else if (charAt == ':') {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private final void p(String str, int i10, int i11, boolean z10, boolean z11) {
            String a10;
            a10 = ke.a.a(str, (r18 & 1) != 0 ? 0 : i10, (r18 & 2) != 0 ? str.length() : i11, " \"<>^`{}|/\\?#", (r18 & 8) != 0 ? false : z11, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
            if (h(a10)) {
                return;
            }
            if (i(a10)) {
                m();
                return;
            }
            if (((CharSequence) this.f10235f.get(r12.size() - 1)).length() == 0) {
                this.f10235f.set(r12.size() - 1, a10);
            } else {
                this.f10235f.add(a10);
            }
            if (z10) {
                this.f10235f.add(BuildConfig.FLAVOR);
            }
        }

        private final void s(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char charAt = str.charAt(i10);
            if (charAt == '/' || charAt == '\\') {
                this.f10235f.clear();
                this.f10235f.add(BuildConfig.FLAVOR);
                i10++;
            } else {
                List list = this.f10235f;
                list.set(list.size() - 1, BuildConfig.FLAVOR);
            }
            while (true) {
                int i12 = i10;
                while (i12 < i11) {
                    i10 = Wd.m.k(str, "/\\", i12, i11);
                    boolean z10 = i10 < i11;
                    p(str, i12, i10, z10, true);
                    if (z10) {
                        i12 = i10 + 1;
                    }
                }
                return;
            }
        }

        private final int u(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char charAt = str.charAt(i10);
            if ((Intrinsics.g(charAt, 97) < 0 || Intrinsics.g(charAt, 122) > 0) && (Intrinsics.g(charAt, 65) < 0 || Intrinsics.g(charAt, 90) > 0)) {
                return -1;
            }
            while (true) {
                i10++;
                if (i10 >= i11) {
                    return -1;
                }
                char charAt2 = str.charAt(i10);
                if ('a' > charAt2 || charAt2 >= '{') {
                    if ('A' > charAt2 || charAt2 >= '[') {
                        if ('0' > charAt2 || charAt2 >= ':') {
                            if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                if (charAt2 == ':') {
                                    return i10;
                                }
                                return -1;
                            }
                        }
                    }
                }
            }
        }

        public final void A(String str) {
            this.f10230a = str;
        }

        public final a E(String username) {
            String a10;
            Intrinsics.checkNotNullParameter(username, "username");
            a10 = ke.a.a(username, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? username.length() : 0, " \"':;<=>@[]^`{}|/\\?#", (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
            this.f10231b = a10;
            return this;
        }

        public final a a(String encodedName, String str) {
            String a10;
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.f10236g == null) {
                this.f10236g = new ArrayList();
            }
            List list = this.f10236g;
            Intrinsics.d(list);
            a10 = ke.a.a(encodedName, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? encodedName.length() : 0, " \"'<>#&=", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
            list.add(a10);
            List list2 = this.f10236g;
            Intrinsics.d(list2);
            list2.add(str != null ? ke.a.a(str, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? str.length() : 0, " \"'<>#&=", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false) : null);
            return this;
        }

        public final a b(String name, String str) {
            String a10;
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.f10236g == null) {
                this.f10236g = new ArrayList();
            }
            List list = this.f10236g;
            Intrinsics.d(list);
            a10 = ke.a.a(name, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? name.length() : 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
            list.add(a10);
            List list2 = this.f10236g;
            Intrinsics.d(list2);
            list2.add(str != null ? ke.a.a(str, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? str.length() : 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false) : null);
            return this;
        }

        public final w c() {
            ArrayList arrayList;
            String str = this.f10230a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String g10 = ke.a.g(this.f10231b, 0, 0, false, 7, null);
            String g11 = ke.a.g(this.f10232c, 0, 0, false, 7, null);
            String str2 = this.f10233d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int d10 = d();
            List list = this.f10235f;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(ke.a.g((String) it.next(), 0, 0, false, 7, null));
            }
            List list2 = this.f10236g;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.u(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? ke.a.g(str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f10237h;
            return new w(str, g10, g11, str2, d10, arrayList2, arrayList, str4 != null ? ke.a.g(str4, 0, 0, false, 7, null) : null, toString(), null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
        
            r11 = ke.a.a(r11, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? r11.length() : 0, " \"'<>#", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final a e(String str) {
            String a10;
            List D10 = (str == null || a10 == null) ? null : D(a10);
            this.f10236g = D10;
            return this;
        }

        public final List f() {
            return this.f10235f;
        }

        public final a g(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String k10 = Wd.f.k(ke.a.g(host, 0, 0, false, 7, null));
            if (k10 != null) {
                this.f10233d = k10;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final a j(w wVar, String input) {
            String str;
            int k10;
            int i10;
            int i11;
            int i12;
            String a10;
            String a11;
            String a12;
            char c10;
            String a13;
            String a14;
            Intrinsics.checkNotNullParameter(input, "input");
            int u10 = Wd.m.u(input, 0, 0, 3, null);
            int w10 = Wd.m.w(input, u10, 0, 2, null);
            int u11 = u(input, u10, w10);
            char c11 = 65535;
            if (u11 != -1) {
                if (StringsKt.C(input, "https:", u10, true)) {
                    this.f10230a = "https";
                    u10 += 6;
                } else {
                    if (!StringsKt.C(input, "http:", u10, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, u11);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        sb2.append(substring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f10230a = "http";
                    u10 += 5;
                }
            } else {
                if (wVar == null) {
                    if (input.length() > 6) {
                        str = StringsKt.W0(input, 6) + "...";
                    } else {
                        str = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str);
                }
                this.f10230a = wVar.u();
            }
            int B10 = B(input, u10, w10);
            char c12 = '?';
            char c13 = '#';
            if (B10 >= 2 || wVar == null || !Intrinsics.b(wVar.u(), this.f10230a)) {
                boolean z10 = false;
                boolean z11 = false;
                int i13 = u10 + B10;
                while (true) {
                    k10 = Wd.m.k(input, "@/\\?#", i13, w10);
                    char charAt = k10 != w10 ? input.charAt(k10) : c11;
                    if (charAt == c11 || charAt == c13 || charAt == '/' || charAt == '\\' || charAt == c12) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z10) {
                            i11 = k10;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f10232c);
                            sb3.append("%40");
                            i12 = w10;
                            a10 = ke.a.a(input, (r18 & 1) != 0 ? 0 : i13, (r18 & 2) != 0 ? input.length() : i11, " \"':;<=>@[]^`{}|/\\?#", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
                            sb3.append(a10);
                            this.f10232c = sb3.toString();
                        } else {
                            int j10 = Wd.m.j(input, ':', i13, k10);
                            a11 = ke.a.a(input, (r18 & 1) != 0 ? 0 : i13, (r18 & 2) != 0 ? input.length() : j10, " \"':;<=>@[]^`{}|/\\?#", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
                            if (z11) {
                                a11 = this.f10231b + "%40" + a11;
                            }
                            this.f10231b = a11;
                            if (j10 != k10) {
                                a12 = ke.a.a(input, (r18 & 1) != 0 ? 0 : j10 + 1, (r18 & 2) != 0 ? input.length() : k10, " \"':;<=>@[]^`{}|/\\?#", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
                                this.f10232c = a12;
                                z10 = true;
                            }
                            i12 = w10;
                            i11 = k10;
                            z11 = true;
                        }
                        i13 = i11 + 1;
                        w10 = i12;
                        c13 = '#';
                        c12 = '?';
                        c11 = 65535;
                    }
                }
                i10 = w10;
                int o10 = o(input, i13, k10);
                int i14 = o10 + 1;
                if (i14 < k10) {
                    this.f10233d = Wd.f.k(ke.a.g(input, i13, o10, false, 4, null));
                    int k11 = k(input, i14, k10);
                    this.f10234e = k11;
                    if (k11 == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = input.substring(i14, k10);
                        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    this.f10233d = Wd.f.k(ke.a.g(input, i13, o10, false, 4, null));
                    b bVar = w.f10220j;
                    String str2 = this.f10230a;
                    Intrinsics.d(str2);
                    this.f10234e = bVar.b(str2);
                }
                if (this.f10233d == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = input.substring(i13, o10);
                    Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                u10 = k10;
            } else {
                this.f10231b = wVar.f();
                this.f10232c = wVar.b();
                this.f10233d = wVar.h();
                this.f10234e = wVar.n();
                this.f10235f.clear();
                this.f10235f.addAll(wVar.d());
                if (u10 == w10 || input.charAt(u10) == '#') {
                    e(wVar.e());
                }
                i10 = w10;
            }
            int i15 = i10;
            int k12 = Wd.m.k(input, "?#", u10, i15);
            s(input, u10, k12);
            if (k12 >= i15 || input.charAt(k12) != '?') {
                c10 = '#';
            } else {
                c10 = '#';
                int j11 = Wd.m.j(input, '#', k12, i15);
                a14 = ke.a.a(input, (r18 & 1) != 0 ? 0 : k12 + 1, (r18 & 2) != 0 ? input.length() : j11, " \"'<>#", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
                this.f10236g = D(a14);
                k12 = j11;
            }
            if (k12 < i15 && input.charAt(k12) == c10) {
                a13 = ke.a.a(input, (r18 & 1) != 0 ? 0 : 1 + k12, (r18 & 2) != 0 ? input.length() : i15, BuildConfig.FLAVOR, (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : true);
                this.f10237h = a13;
            }
            return this;
        }

        public final a l(String password) {
            String a10;
            Intrinsics.checkNotNullParameter(password, "password");
            a10 = ke.a.a(password, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? password.length() : 0, " \"':;<=>@[]^`{}|/\\?#", (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
            this.f10232c = a10;
            return this;
        }

        public final a n(int i10) {
            if (1 <= i10 && i10 < 65536) {
                this.f10234e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
        
            r11 = ke.a.a(r11, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? r11.length() : 0, " \"'<>#", (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final a q(String str) {
            String a10;
            List D10 = (str == null || a10 == null) ? null : D(a10);
            this.f10236g = D10;
            return this;
        }

        public final a r() {
            String a10;
            String str = this.f10233d;
            this.f10233d = str != null ? new Regex("[\"<>^`{|}]").replace(str, BuildConfig.FLAVOR) : null;
            int size = this.f10235f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f10235f;
                a10 = ke.a.a(r7, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? ((String) list.get(i10)).length() : 0, "[]", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : true, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
                list.set(i10, a10);
            }
            List list2 = this.f10236g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? ke.a.a(str2, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? str2.length() : 0, "\\^`{|}", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : true, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false) : null);
                }
            }
            String str3 = this.f10237h;
            this.f10237h = str3 != null ? ke.a.a(str3, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? str3.length() : 0, " \"#<>\\^`{|}", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : true, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : true) : null;
            return this;
        }

        public final a t(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.r(scheme, "http", true)) {
                this.f10230a = "http";
            } else {
                if (!StringsKt.r(scheme, "https", true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.f10230a = "https";
            }
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
        
            if (r1 != r4.b(r3)) goto L29;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f10230a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.f10231b.length() > 0 || this.f10232c.length() > 0) {
                sb2.append(this.f10231b);
                if (this.f10232c.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.f10232c);
                }
                sb2.append('@');
            }
            String str2 = this.f10233d;
            if (str2 != null) {
                Intrinsics.d(str2);
                if (StringsKt.J(str2, ':', false, 2, null)) {
                    sb2.append('[');
                    sb2.append(this.f10233d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f10233d);
                }
            }
            if (this.f10234e != -1 || this.f10230a != null) {
                int d10 = d();
                String str3 = this.f10230a;
                if (str3 != null) {
                    b bVar = w.f10220j;
                    Intrinsics.d(str3);
                }
                sb2.append(':');
                sb2.append(d10);
            }
            C(this.f10235f, sb2);
            if (this.f10236g != null) {
                sb2.append('?');
                b bVar2 = w.f10220j;
                List list = this.f10236g;
                Intrinsics.d(list);
                bVar2.e(list, sb2);
            }
            if (this.f10237h != null) {
                sb2.append('#');
                sb2.append(this.f10237h);
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }

        public final void v(String str) {
            this.f10237h = str;
        }

        public final void w(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f10232c = str;
        }

        public final void x(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f10231b = str;
        }

        public final void y(String str) {
            this.f10233d = str;
        }

        public final void z(int i10) {
            this.f10234e = i10;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(List list, StringBuilder sb2) {
            kotlin.ranges.a n10 = kotlin.ranges.d.n(kotlin.ranges.d.p(0, list.size()), 2);
            int c10 = n10.c();
            int e10 = n10.e();
            int h10 = n10.h();
            if ((h10 <= 0 || c10 > e10) && (h10 >= 0 || e10 > c10)) {
                return;
            }
            while (true) {
                String str = (String) list.get(c10);
                String str2 = (String) list.get(c10 + 1);
                if (c10 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (c10 == e10) {
                    return;
                } else {
                    c10 += h10;
                }
            }
        }

        public final int b(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.b(scheme, "http")) {
                return 80;
            }
            return Intrinsics.b(scheme, "https") ? 443 : -1;
        }

        public final w c(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new a().j(null, str).c();
        }

        public final w d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private b() {
        }
    }

    public /* synthetic */ w(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i10, list, list2, str5, str6);
    }

    public static final w g(String str) {
        return f10220j.c(str);
    }

    public static final w l(String str) {
        return f10220j.d(str);
    }

    public final String a() {
        if (this.f10228h == null) {
            return null;
        }
        String substring = this.f10229i.substring(StringsKt.W(this.f10229i, '#', 0, false, 6, null) + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String b() {
        if (this.f10223c.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        String substring = this.f10229i.substring(StringsKt.W(this.f10229i, ':', this.f10221a.length() + 3, false, 4, null) + 1, StringsKt.W(this.f10229i, '@', 0, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String c() {
        int W10 = StringsKt.W(this.f10229i, '/', this.f10221a.length() + 3, false, 4, null);
        String str = this.f10229i;
        String substring = this.f10229i.substring(W10, Wd.m.k(str, "?#", W10, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final List d() {
        int W10 = StringsKt.W(this.f10229i, '/', this.f10221a.length() + 3, false, 4, null);
        String str = this.f10229i;
        int k10 = Wd.m.k(str, "?#", W10, str.length());
        ArrayList arrayList = new ArrayList();
        while (W10 < k10) {
            int i10 = W10 + 1;
            int j10 = Wd.m.j(this.f10229i, '/', i10, k10);
            String substring = this.f10229i.substring(i10, j10);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            arrayList.add(substring);
            W10 = j10;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f10227g == null) {
            return null;
        }
        int W10 = StringsKt.W(this.f10229i, '?', 0, false, 6, null) + 1;
        String str = this.f10229i;
        String substring = this.f10229i.substring(W10, Wd.m.j(str, '#', W10, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof w) && Intrinsics.b(((w) obj).f10229i, this.f10229i);
    }

    public final String f() {
        if (this.f10222b.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.f10221a.length() + 3;
        String str = this.f10229i;
        String substring = this.f10229i.substring(length, Wd.m.k(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String h() {
        return this.f10224d;
    }

    public int hashCode() {
        return this.f10229i.hashCode();
    }

    public final boolean i() {
        return Intrinsics.b(this.f10221a, "https");
    }

    public final a j() {
        a aVar = new a();
        aVar.A(this.f10221a);
        aVar.x(f());
        aVar.w(b());
        aVar.y(this.f10224d);
        aVar.z(this.f10225e != f10220j.b(this.f10221a) ? this.f10225e : -1);
        aVar.f().clear();
        aVar.f().addAll(d());
        aVar.e(e());
        aVar.v(a());
        return aVar;
    }

    public final a k(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new a().j(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List m() {
        return this.f10226f;
    }

    public final int n() {
        return this.f10225e;
    }

    public final String o() {
        if (this.f10227g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f10220j.e(this.f10227g, sb2);
        return sb2.toString();
    }

    public final String p(int i10) {
        List list = this.f10227g;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        Object obj = list.get(i10 * 2);
        Intrinsics.d(obj);
        return (String) obj;
    }

    public final String q(int i10) {
        List list = this.f10227g;
        if (list != null) {
            return (String) list.get((i10 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int r() {
        List list = this.f10227g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String s() {
        a k10 = k("/...");
        Intrinsics.d(k10);
        return k10.E(BuildConfig.FLAVOR).l(BuildConfig.FLAVOR).c().toString();
    }

    public final w t(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        a k10 = k(link);
        if (k10 != null) {
            return k10.c();
        }
        return null;
    }

    public String toString() {
        return this.f10229i;
    }

    public final String u() {
        return this.f10221a;
    }

    public final URI v() {
        String aVar = j().r().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(aVar, BuildConfig.FLAVOR));
                Intrinsics.d(create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL w() {
        try {
            return new URL(this.f10229i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    private w(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6) {
        this.f10221a = str;
        this.f10222b = str2;
        this.f10223c = str3;
        this.f10224d = str4;
        this.f10225e = i10;
        this.f10226f = list;
        this.f10227g = list2;
        this.f10228h = str5;
        this.f10229i = str6;
    }
}
