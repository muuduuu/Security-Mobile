package De;

import Td.A;
import Td.D;
import Td.t;
import Td.v;
import Td.w;
import java.util.regex.Pattern;
import pe.C3877e;
import pe.InterfaceC3878f;

/* loaded from: classes3.dex */
final class x {

    /* renamed from: l, reason: collision with root package name */
    private static final char[] f1746l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f1747m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    private final String f1748a;

    /* renamed from: b, reason: collision with root package name */
    private final Td.w f1749b;

    /* renamed from: c, reason: collision with root package name */
    private String f1750c;

    /* renamed from: d, reason: collision with root package name */
    private w.a f1751d;

    /* renamed from: e, reason: collision with root package name */
    private final D.a f1752e = new D.a();

    /* renamed from: f, reason: collision with root package name */
    private final v.a f1753f;

    /* renamed from: g, reason: collision with root package name */
    private Td.z f1754g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f1755h;

    /* renamed from: i, reason: collision with root package name */
    private A.a f1756i;

    /* renamed from: j, reason: collision with root package name */
    private t.a f1757j;

    /* renamed from: k, reason: collision with root package name */
    private Td.E f1758k;

    private static class a extends Td.E {

        /* renamed from: a, reason: collision with root package name */
        private final Td.E f1759a;

        /* renamed from: b, reason: collision with root package name */
        private final Td.z f1760b;

        a(Td.E e10, Td.z zVar) {
            this.f1759a = e10;
            this.f1760b = zVar;
        }

        @Override // Td.E
        public long contentLength() {
            return this.f1759a.contentLength();
        }

        @Override // Td.E
        /* renamed from: contentType */
        public Td.z getContentType() {
            return this.f1760b;
        }

        @Override // Td.E
        public void writeTo(InterfaceC3878f interfaceC3878f) {
            this.f1759a.writeTo(interfaceC3878f);
        }
    }

    x(String str, Td.w wVar, String str2, Td.v vVar, Td.z zVar, boolean z10, boolean z11, boolean z12) {
        this.f1748a = str;
        this.f1749b = wVar;
        this.f1750c = str2;
        this.f1754g = zVar;
        this.f1755h = z10;
        if (vVar != null) {
            this.f1753f = vVar.m();
        } else {
            this.f1753f = new v.a();
        }
        if (z11) {
            this.f1757j = new t.a();
        } else if (z12) {
            A.a aVar = new A.a();
            this.f1756i = aVar;
            aVar.f(Td.A.f9780k);
        }
    }

    private static String i(String str, boolean z10) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                C3877e c3877e = new C3877e();
                c3877e.e1(str, 0, i10);
                j(c3877e, str, i10, length, z10);
                return c3877e.F1();
            }
            i10 += Character.charCount(codePointAt);
        }
        return str;
    }

    private static void j(C3877e c3877e, String str, int i10, int i11, boolean z10) {
        C3877e c3877e2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                    if (c3877e2 == null) {
                        c3877e2 = new C3877e();
                    }
                    c3877e2.g0(codePointAt);
                    while (!c3877e2.p0()) {
                        byte readByte = c3877e2.readByte();
                        c3877e.q0(37);
                        char[] cArr = f1746l;
                        c3877e.q0(cArr[((readByte & 255) >> 4) & 15]);
                        c3877e.q0(cArr[readByte & 15]);
                    }
                } else {
                    c3877e.g0(codePointAt);
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    void a(String str, String str2, boolean z10) {
        if (z10) {
            this.f1757j.b(str, str2);
        } else {
            this.f1757j.a(str, str2);
        }
    }

    void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f1753f.a(str, str2);
            return;
        }
        try {
            this.f1754g = Td.z.c(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    void c(Td.v vVar) {
        this.f1753f.b(vVar);
    }

    void d(Td.v vVar, Td.E e10) {
        this.f1756i.c(vVar, e10);
    }

    void e(A.c cVar) {
        this.f1756i.d(cVar);
    }

    void f(String str, String str2, boolean z10) {
        if (this.f1750c == null) {
            throw new AssertionError();
        }
        String i10 = i(str2, z10);
        String replace = this.f1750c.replace("{" + str + "}", i10);
        if (!f1747m.matcher(replace).matches()) {
            this.f1750c = replace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    void g(String str, String str2, boolean z10) {
        String str3 = this.f1750c;
        if (str3 != null) {
            w.a k10 = this.f1749b.k(str3);
            this.f1751d = k10;
            if (k10 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f1749b + ", Relative: " + this.f1750c);
            }
            this.f1750c = null;
        }
        if (z10) {
            this.f1751d.a(str, str2);
        } else {
            this.f1751d.b(str, str2);
        }
    }

    void h(Class cls, Object obj) {
        this.f1752e.u(cls, obj);
    }

    D.a k() {
        Td.w t10;
        w.a aVar = this.f1751d;
        if (aVar != null) {
            t10 = aVar.c();
        } else {
            t10 = this.f1749b.t(this.f1750c);
            if (t10 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f1749b + ", Relative: " + this.f1750c);
            }
        }
        Td.E e10 = this.f1758k;
        if (e10 == null) {
            t.a aVar2 = this.f1757j;
            if (aVar2 != null) {
                e10 = aVar2.c();
            } else {
                A.a aVar3 = this.f1756i;
                if (aVar3 != null) {
                    e10 = aVar3.e();
                } else if (this.f1755h) {
                    e10 = Td.E.create((Td.z) null, new byte[0]);
                }
            }
        }
        Td.z zVar = this.f1754g;
        if (zVar != null) {
            if (e10 != null) {
                e10 = new a(e10, zVar);
            } else {
                this.f1753f.a("Content-Type", zVar.toString());
            }
        }
        return this.f1752e.w(t10).m(this.f1753f.f()).n(this.f1748a, e10);
    }

    void l(Td.E e10) {
        this.f1758k = e10;
    }

    void m(Object obj) {
        this.f1750c = obj.toString();
    }
}
