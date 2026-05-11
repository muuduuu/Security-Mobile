package de;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import pe.C3877e;
import pe.C3880h;
import pe.InterfaceC3879g;
import pe.M;
import pe.b0;

/* renamed from: de.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3048e {

    /* renamed from: a, reason: collision with root package name */
    public static final C3048e f31908a;

    /* renamed from: b, reason: collision with root package name */
    private static final C3047d[] f31909b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f31910c;

    static {
        C3048e c3048e = new C3048e();
        f31908a = c3048e;
        C3047d c3047d = new C3047d(C3047d.f31904j, BuildConfig.FLAVOR);
        C3880h c3880h = C3047d.f31901g;
        C3047d c3047d2 = new C3047d(c3880h, "GET");
        C3047d c3047d3 = new C3047d(c3880h, "POST");
        C3880h c3880h2 = C3047d.f31902h;
        C3047d c3047d4 = new C3047d(c3880h2, "/");
        C3047d c3047d5 = new C3047d(c3880h2, "/index.html");
        C3880h c3880h3 = C3047d.f31903i;
        C3047d c3047d6 = new C3047d(c3880h3, "http");
        C3047d c3047d7 = new C3047d(c3880h3, "https");
        C3880h c3880h4 = C3047d.f31900f;
        f31909b = new C3047d[]{c3047d, c3047d2, c3047d3, c3047d4, c3047d5, c3047d6, c3047d7, new C3047d(c3880h4, "200"), new C3047d(c3880h4, "204"), new C3047d(c3880h4, "206"), new C3047d(c3880h4, "304"), new C3047d(c3880h4, "400"), new C3047d(c3880h4, "404"), new C3047d(c3880h4, "500"), new C3047d("accept-charset", BuildConfig.FLAVOR), new C3047d("accept-encoding", "gzip, deflate"), new C3047d("accept-language", BuildConfig.FLAVOR), new C3047d("accept-ranges", BuildConfig.FLAVOR), new C3047d("accept", BuildConfig.FLAVOR), new C3047d("access-control-allow-origin", BuildConfig.FLAVOR), new C3047d("age", BuildConfig.FLAVOR), new C3047d("allow", BuildConfig.FLAVOR), new C3047d("authorization", BuildConfig.FLAVOR), new C3047d("cache-control", BuildConfig.FLAVOR), new C3047d("content-disposition", BuildConfig.FLAVOR), new C3047d("content-encoding", BuildConfig.FLAVOR), new C3047d("content-language", BuildConfig.FLAVOR), new C3047d("content-length", BuildConfig.FLAVOR), new C3047d("content-location", BuildConfig.FLAVOR), new C3047d("content-range", BuildConfig.FLAVOR), new C3047d(Keys.CONTENT_TYPE, BuildConfig.FLAVOR), new C3047d("cookie", BuildConfig.FLAVOR), new C3047d("date", BuildConfig.FLAVOR), new C3047d("etag", BuildConfig.FLAVOR), new C3047d("expect", BuildConfig.FLAVOR), new C3047d("expires", BuildConfig.FLAVOR), new C3047d("from", BuildConfig.FLAVOR), new C3047d("host", BuildConfig.FLAVOR), new C3047d("if-match", BuildConfig.FLAVOR), new C3047d("if-modified-since", BuildConfig.FLAVOR), new C3047d("if-none-match", BuildConfig.FLAVOR), new C3047d("if-range", BuildConfig.FLAVOR), new C3047d("if-unmodified-since", BuildConfig.FLAVOR), new C3047d("last-modified", BuildConfig.FLAVOR), new C3047d("link", BuildConfig.FLAVOR), new C3047d("location", BuildConfig.FLAVOR), new C3047d("max-forwards", BuildConfig.FLAVOR), new C3047d("proxy-authenticate", BuildConfig.FLAVOR), new C3047d("proxy-authorization", BuildConfig.FLAVOR), new C3047d("range", BuildConfig.FLAVOR), new C3047d("referer", BuildConfig.FLAVOR), new C3047d("refresh", BuildConfig.FLAVOR), new C3047d("retry-after", BuildConfig.FLAVOR), new C3047d("server", BuildConfig.FLAVOR), new C3047d("set-cookie", BuildConfig.FLAVOR), new C3047d("strict-transport-security", BuildConfig.FLAVOR), new C3047d("transfer-encoding", BuildConfig.FLAVOR), new C3047d("user-agent", BuildConfig.FLAVOR), new C3047d("vary", BuildConfig.FLAVOR), new C3047d("via", BuildConfig.FLAVOR), new C3047d("www-authenticate", BuildConfig.FLAVOR)};
        f31910c = c3048e.d();
    }

    private C3048e() {
    }

    private final Map d() {
        C3047d[] c3047dArr = f31909b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c3047dArr.length);
        int length = c3047dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            C3047d[] c3047dArr2 = f31909b;
            if (!linkedHashMap.containsKey(c3047dArr2[i10].f31905a)) {
                linkedHashMap.put(c3047dArr2[i10].f31905a, Integer.valueOf(i10));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }

    public final C3880h a(C3880h name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int L10 = name.L();
        for (int i10 = 0; i10 < L10; i10++) {
            byte p10 = name.p(i10);
            if (65 <= p10 && p10 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.R());
            }
        }
        return name;
    }

    public final Map b() {
        return f31910c;
    }

    public final C3047d[] c() {
        return f31909b;
    }

    /* renamed from: de.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f31911a;

        /* renamed from: b, reason: collision with root package name */
        private int f31912b;

        /* renamed from: c, reason: collision with root package name */
        private final List f31913c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC3879g f31914d;

        /* renamed from: e, reason: collision with root package name */
        public C3047d[] f31915e;

        /* renamed from: f, reason: collision with root package name */
        private int f31916f;

        /* renamed from: g, reason: collision with root package name */
        public int f31917g;

        /* renamed from: h, reason: collision with root package name */
        public int f31918h;

        public a(b0 source, int i10, int i11) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f31911a = i10;
            this.f31912b = i11;
            this.f31913c = new ArrayList();
            this.f31914d = M.c(source);
            this.f31915e = new C3047d[8];
            this.f31916f = r2.length - 1;
        }

        private final void a() {
            int i10 = this.f31912b;
            int i11 = this.f31918h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            AbstractC3574i.p(this.f31915e, null, 0, 0, 6, null);
            this.f31916f = this.f31915e.length - 1;
            this.f31917g = 0;
            this.f31918h = 0;
        }

        private final int c(int i10) {
            return this.f31916f + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f31915e.length;
                while (true) {
                    length--;
                    i11 = this.f31916f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C3047d c3047d = this.f31915e[length];
                    Intrinsics.d(c3047d);
                    int i13 = c3047d.f31907c;
                    i10 -= i13;
                    this.f31918h -= i13;
                    this.f31917g--;
                    i12++;
                }
                C3047d[] c3047dArr = this.f31915e;
                System.arraycopy(c3047dArr, i11 + 1, c3047dArr, i11 + 1 + i12, this.f31917g);
                this.f31916f += i12;
            }
            return i12;
        }

        private final C3880h f(int i10) {
            if (h(i10)) {
                return C3048e.f31908a.c()[i10].f31905a;
            }
            int c10 = c(i10 - C3048e.f31908a.c().length);
            if (c10 >= 0) {
                C3047d[] c3047dArr = this.f31915e;
                if (c10 < c3047dArr.length) {
                    C3047d c3047d = c3047dArr[c10];
                    Intrinsics.d(c3047d);
                    return c3047d.f31905a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void g(int i10, C3047d c3047d) {
            this.f31913c.add(c3047d);
            int i11 = c3047d.f31907c;
            if (i10 != -1) {
                C3047d c3047d2 = this.f31915e[c(i10)];
                Intrinsics.d(c3047d2);
                i11 -= c3047d2.f31907c;
            }
            int i12 = this.f31912b;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f31918h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f31917g + 1;
                C3047d[] c3047dArr = this.f31915e;
                if (i13 > c3047dArr.length) {
                    C3047d[] c3047dArr2 = new C3047d[c3047dArr.length * 2];
                    System.arraycopy(c3047dArr, 0, c3047dArr2, c3047dArr.length, c3047dArr.length);
                    this.f31916f = this.f31915e.length - 1;
                    this.f31915e = c3047dArr2;
                }
                int i14 = this.f31916f;
                this.f31916f = i14 - 1;
                this.f31915e[i14] = c3047d;
                this.f31917g++;
            } else {
                this.f31915e[i10 + c(i10) + d10] = c3047d;
            }
            this.f31918h += i11;
        }

        private final boolean h(int i10) {
            return i10 >= 0 && i10 <= C3048e.f31908a.c().length - 1;
        }

        private final int i() {
            return Wd.m.b(this.f31914d.readByte(), 255);
        }

        private final void l(int i10) {
            if (h(i10)) {
                this.f31913c.add(C3048e.f31908a.c()[i10]);
                return;
            }
            int c10 = c(i10 - C3048e.f31908a.c().length);
            if (c10 >= 0) {
                C3047d[] c3047dArr = this.f31915e;
                if (c10 < c3047dArr.length) {
                    List list = this.f31913c;
                    C3047d c3047d = c3047dArr[c10];
                    Intrinsics.d(c3047d);
                    list.add(c3047d);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void n(int i10) {
            g(-1, new C3047d(f(i10), j()));
        }

        private final void o() {
            g(-1, new C3047d(C3048e.f31908a.a(j()), j()));
        }

        private final void p(int i10) {
            this.f31913c.add(new C3047d(f(i10), j()));
        }

        private final void q() {
            this.f31913c.add(new C3047d(C3048e.f31908a.a(j()), j()));
        }

        public final List e() {
            List O02 = CollectionsKt.O0(this.f31913c);
            this.f31913c.clear();
            return O02;
        }

        public final C3880h j() {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            long m10 = m(i10, 127);
            if (!z10) {
                return this.f31914d.Y(m10);
            }
            C3877e c3877e = new C3877e();
            C3055l.f32069a.b(this.f31914d, m10, c3877e);
            return c3877e.K();
        }

        public final void k() {
            while (!this.f31914d.p0()) {
                int b10 = Wd.m.b(this.f31914d.readByte(), 255);
                if (b10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b10 & 128) == 128) {
                    l(m(b10, 127) - 1);
                } else if (b10 == 64) {
                    o();
                } else if ((b10 & 64) == 64) {
                    n(m(b10, 63) - 1);
                } else if ((b10 & 32) == 32) {
                    int m10 = m(b10, 31);
                    this.f31912b = m10;
                    if (m10 < 0 || m10 > this.f31911a) {
                        throw new IOException("Invalid dynamic table size update " + this.f31912b);
                    }
                    a();
                } else if (b10 == 16 || b10 == 0) {
                    q();
                } else {
                    p(m(b10, 15) - 1);
                }
            }
        }

        public final int m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        public /* synthetic */ a(b0 b0Var, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(b0Var, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    /* renamed from: de.e$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f31919a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f31920b;

        /* renamed from: c, reason: collision with root package name */
        private final C3877e f31921c;

        /* renamed from: d, reason: collision with root package name */
        private int f31922d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f31923e;

        /* renamed from: f, reason: collision with root package name */
        public int f31924f;

        /* renamed from: g, reason: collision with root package name */
        public C3047d[] f31925g;

        /* renamed from: h, reason: collision with root package name */
        private int f31926h;

        /* renamed from: i, reason: collision with root package name */
        public int f31927i;

        /* renamed from: j, reason: collision with root package name */
        public int f31928j;

        public b(int i10, boolean z10, C3877e out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f31919a = i10;
            this.f31920b = z10;
            this.f31921c = out;
            this.f31922d = Integer.MAX_VALUE;
            this.f31924f = i10;
            this.f31925g = new C3047d[8];
            this.f31926h = r2.length - 1;
        }

        private final void a() {
            int i10 = this.f31924f;
            int i11 = this.f31928j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            AbstractC3574i.p(this.f31925g, null, 0, 0, 6, null);
            this.f31926h = this.f31925g.length - 1;
            this.f31927i = 0;
            this.f31928j = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f31925g.length;
                while (true) {
                    length--;
                    i11 = this.f31926h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C3047d c3047d = this.f31925g[length];
                    Intrinsics.d(c3047d);
                    i10 -= c3047d.f31907c;
                    int i13 = this.f31928j;
                    C3047d c3047d2 = this.f31925g[length];
                    Intrinsics.d(c3047d2);
                    this.f31928j = i13 - c3047d2.f31907c;
                    this.f31927i--;
                    i12++;
                }
                C3047d[] c3047dArr = this.f31925g;
                System.arraycopy(c3047dArr, i11 + 1, c3047dArr, i11 + 1 + i12, this.f31927i);
                C3047d[] c3047dArr2 = this.f31925g;
                int i14 = this.f31926h;
                Arrays.fill(c3047dArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f31926h += i12;
            }
            return i12;
        }

        private final void d(C3047d c3047d) {
            int i10 = c3047d.f31907c;
            int i11 = this.f31924f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f31928j + i10) - i11);
            int i12 = this.f31927i + 1;
            C3047d[] c3047dArr = this.f31925g;
            if (i12 > c3047dArr.length) {
                C3047d[] c3047dArr2 = new C3047d[c3047dArr.length * 2];
                System.arraycopy(c3047dArr, 0, c3047dArr2, c3047dArr.length, c3047dArr.length);
                this.f31926h = this.f31925g.length - 1;
                this.f31925g = c3047dArr2;
            }
            int i13 = this.f31926h;
            this.f31926h = i13 - 1;
            this.f31925g[i13] = c3047d;
            this.f31927i++;
            this.f31928j += i10;
        }

        public final void e(int i10) {
            this.f31919a = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f31924f;
            if (i11 == min) {
                return;
            }
            if (min < i11) {
                this.f31922d = Math.min(this.f31922d, min);
            }
            this.f31923e = true;
            this.f31924f = min;
            a();
        }

        public final void f(C3880h data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.f31920b) {
                C3055l c3055l = C3055l.f32069a;
                if (c3055l.d(data) < data.L()) {
                    C3877e c3877e = new C3877e();
                    c3055l.c(data, c3877e);
                    C3880h K10 = c3877e.K();
                    h(K10.L(), 127, 128);
                    this.f31921c.Q1(K10);
                    return;
                }
            }
            h(data.L(), 127, 0);
            this.f31921c.Q1(data);
        }

        public final void g(List headerBlock) {
            int i10;
            int i11;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f31923e) {
                int i12 = this.f31922d;
                if (i12 < this.f31924f) {
                    h(i12, 31, 32);
                }
                this.f31923e = false;
                this.f31922d = Integer.MAX_VALUE;
                h(this.f31924f, 31, 32);
            }
            int size = headerBlock.size();
            for (int i13 = 0; i13 < size; i13++) {
                C3047d c3047d = (C3047d) headerBlock.get(i13);
                C3880h P10 = c3047d.f31905a.P();
                C3880h c3880h = c3047d.f31906b;
                C3048e c3048e = C3048e.f31908a;
                Integer num = (Integer) c3048e.b().get(P10);
                if (num != null) {
                    int intValue = num.intValue();
                    i11 = intValue + 1;
                    if (2 <= i11 && i11 < 8) {
                        if (Intrinsics.b(c3048e.c()[intValue].f31906b, c3880h)) {
                            i10 = i11;
                        } else if (Intrinsics.b(c3048e.c()[i11].f31906b, c3880h)) {
                            i10 = i11;
                            i11 = intValue + 2;
                        }
                    }
                    i10 = i11;
                    i11 = -1;
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                if (i11 == -1) {
                    int i14 = this.f31926h + 1;
                    int length = this.f31925g.length;
                    while (true) {
                        if (i14 >= length) {
                            break;
                        }
                        C3047d c3047d2 = this.f31925g[i14];
                        Intrinsics.d(c3047d2);
                        if (Intrinsics.b(c3047d2.f31905a, P10)) {
                            C3047d c3047d3 = this.f31925g[i14];
                            Intrinsics.d(c3047d3);
                            if (Intrinsics.b(c3047d3.f31906b, c3880h)) {
                                i11 = C3048e.f31908a.c().length + (i14 - this.f31926h);
                                break;
                            } else if (i10 == -1) {
                                i10 = (i14 - this.f31926h) + C3048e.f31908a.c().length;
                            }
                        }
                        i14++;
                    }
                }
                if (i11 != -1) {
                    h(i11, 127, 128);
                } else if (i10 == -1) {
                    this.f31921c.q0(64);
                    f(P10);
                    f(c3880h);
                    d(c3047d);
                } else if (!P10.M(C3047d.f31899e) || Intrinsics.b(C3047d.f31904j, P10)) {
                    h(i10, 63, 64);
                    f(c3880h);
                    d(c3047d);
                } else {
                    h(i10, 15, 0);
                    f(c3880h);
                }
            }
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f31921c.q0(i10 | i12);
                return;
            }
            this.f31921c.q0(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f31921c.q0(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f31921c.q0(i13);
        }

        public /* synthetic */ b(int i10, boolean z10, C3877e c3877e, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, c3877e);
        }
    }
}
