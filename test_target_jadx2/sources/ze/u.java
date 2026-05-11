package ze;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private BufferedReader f45990a;

    /* renamed from: c, reason: collision with root package name */
    private transient int f45992c;

    /* renamed from: h, reason: collision with root package name */
    private transient boolean f45997h;

    /* renamed from: i, reason: collision with root package name */
    private transient o f45998i;

    /* renamed from: j, reason: collision with root package name */
    private transient F f45999j;

    /* renamed from: n, reason: collision with root package name */
    private boolean f46003n;

    /* renamed from: o, reason: collision with root package name */
    private String f46004o;

    /* renamed from: p, reason: collision with root package name */
    private s f46005p;

    /* renamed from: q, reason: collision with root package name */
    private C5283h f46006q;

    /* renamed from: r, reason: collision with root package name */
    private i f46007r;

    /* renamed from: s, reason: collision with root package name */
    private C5282g f46008s;

    /* renamed from: b, reason: collision with root package name */
    private char[] f45991b = new char[1024];

    /* renamed from: d, reason: collision with root package name */
    private transient int f45993d = -1;

    /* renamed from: e, reason: collision with root package name */
    private transient int f45994e = 1;

    /* renamed from: f, reason: collision with root package name */
    private transient int f45995f = 1;

    /* renamed from: g, reason: collision with root package name */
    private transient StringBuffer f45996g = new StringBuffer(512);

    /* renamed from: k, reason: collision with root package name */
    private transient List f46000k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private transient Set f46001l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    private boolean f46002m = true;

    public u(s sVar, Reader reader, C5282g c5282g) {
        this.f45990a = new BufferedReader(reader);
        this.f46005p = sVar;
        this.f46006q = sVar.p();
        this.f46007r = sVar.s();
        this.f46008s = c5282g;
    }

    private boolean A() {
        if (J("</") || J("<!") || J("<?")) {
            return true;
        }
        return J("<") && t(this.f45992c + 1);
    }

    private boolean B() {
        return C(this.f45992c);
    }

    private boolean C(int i10) {
        int i11 = this.f45993d;
        if (i11 < 0 || i10 < i11) {
            return Character.isWhitespace(this.f45991b[i10]);
        }
        return false;
    }

    private void D(int i10) {
        if (this.f45993d != -1) {
            return;
        }
        int i11 = this.f45992c;
        if (i10 + i11 < 1024) {
            return;
        }
        int i12 = 1024 - i11;
        char[] cArr = this.f45991b;
        int i13 = 0;
        System.arraycopy(cArr, i11, cArr, 0, i12);
        this.f45992c = 0;
        int i14 = 1024 - i12;
        int i15 = i12;
        int i16 = 0;
        do {
            int read = this.f45990a.read(this.f45991b, i15, i14);
            if (read >= 0) {
                i16 += read;
                i15 += read;
                i14 -= read;
            }
            if (read < 0) {
                break;
            }
        } while (i14 > 0);
        if (i14 > 0) {
            this.f45993d = i16 + i12;
        }
        while (true) {
            int i17 = this.f45993d;
            if (i17 < 0) {
                i17 = 1024;
            }
            if (i13 >= i17) {
                return;
            }
            char[] cArr2 = this.f45991b;
            char c10 = cArr2[i13];
            if (c10 >= 1 && c10 <= ' ' && c10 != '\n' && c10 != '\r') {
                cArr2[i13] = ' ';
            }
            if (c10 == 0) {
                cArr2[i13] = 65533;
            }
            i13++;
        }
    }

    private void E(char c10) {
        N(c10);
        this.f45996g.append(c10);
    }

    private void F() {
        if (q()) {
            return;
        }
        E(this.f45991b[this.f45992c]);
    }

    private void G(int i10) {
        D(i10);
        int i11 = this.f45992c;
        while (!q() && i10 > 0) {
            E(this.f45991b[i11]);
            i11++;
            i10--;
        }
    }

    private void H() {
        while (!q() && B()) {
            F();
            l();
        }
    }

    private boolean J(String str) {
        int length = str.length();
        D(length);
        int i10 = this.f45993d;
        if (i10 >= 0 && this.f45992c + length > i10) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (Character.toLowerCase(str.charAt(i11)) != Character.toLowerCase(this.f45991b[this.f45992c + i11])) {
                return false;
            }
        }
        return true;
    }

    private void K() {
        String str;
        while (!q() && this.f46002m && !r('>') && !J("/>")) {
            if (Thread.currentThread().isInterrupted()) {
                n();
                return;
            }
            H();
            String o10 = o(true);
            if (this.f46002m) {
                H();
                if (r('=')) {
                    F();
                    l();
                    str = c();
                } else {
                    str = "empty".equals(this.f46006q.g()) ? BuildConfig.FLAVOR : "true".equals(this.f46006q.g()) ? "true" : o10;
                }
                if (this.f46002m) {
                    this.f45999j.d(o10, str);
                }
            } else {
                if (!r('<') && !r('>') && !J("/>")) {
                    F();
                    l();
                }
                if (!r('<')) {
                    this.f46002m = true;
                }
            }
        }
    }

    private void L() {
        C q10;
        G c10;
        G(2);
        m(2);
        this.f45995f += 2;
        if (q()) {
            return;
        }
        String o10 = o(false);
        i iVar = this.f46007r;
        if (iVar != null && iVar.d(o10) && (c10 = this.f46007r.c(o10)) != null) {
            o10 = c10.d();
        }
        if (o10 != null && (((q10 = this.f46005p.q(o10, this.f46008s)) == null && !this.f46006q.w() && this.f46006q.z() && !z(o10) && !this.f46006q.r()) || (q10 != null && q10.v() && !this.f46006q.u() && this.f46006q.y()))) {
            g();
            return;
        }
        this.f45999j = new p(o10);
        if (!this.f46002m) {
            a();
            return;
        }
        H();
        K();
        if (o10 != null) {
            b(this.f45999j);
        }
        if (r('>')) {
            l();
        }
        if (this.f46006q.B(o10)) {
            this.f46003n = false;
            this.f46004o = o10;
        }
        if (o10 != null && o10.equalsIgnoreCase("html")) {
            H();
        }
        this.f45999j = null;
    }

    private void M() {
        C q10;
        F();
        l();
        if (q()) {
            return;
        }
        String o10 = o(false);
        String b10 = this.f46007r.b(o10);
        if (b10 != null && (((q10 = this.f46005p.q(b10, this.f46008s)) == null && !this.f46006q.w() && this.f46006q.z() && !z(b10) && !this.f46006q.r()) || (q10 != null && q10.v() && !this.f46006q.u() && this.f46006q.y()))) {
            g();
            return;
        }
        D d10 = new D(b10);
        d10.J(this.f46006q.A());
        this.f45999j = d10;
        if (!this.f46002m) {
            a();
            return;
        }
        H();
        K();
        if (b10 != null) {
            i iVar = this.f46007r;
            if (iVar != null) {
                d10.B(iVar.e(o10, d10.n()));
            }
            b(this.f45999j);
        }
        if (r('>')) {
            l();
            if (this.f46006q.B(b10)) {
                this.f46003n = true;
                this.f46004o = b10;
            }
        } else if (J("/>")) {
            m(2);
            b(new p(b10));
        }
        this.f45999j = null;
    }

    private void N(char c10) {
        if (c10 != '\n') {
            this.f45995f++;
        } else {
            this.f45994e++;
            this.f45995f = 1;
        }
    }

    private boolean a() {
        if (this.f45996g.length() <= 0) {
            return false;
        }
        b(new l(this.f46006q.o() ? H.d(this.f45996g.toString(), this.f46006q.x()) : this.f45996g.toString()));
        StringBuffer stringBuffer = this.f45996g;
        stringBuffer.delete(0, stringBuffer.length());
        return true;
    }

    private void b(InterfaceC5277b interfaceC5277b) {
        interfaceC5277b.b(this.f45994e);
        interfaceC5277b.a(this.f45995f);
        this.f46000k.add(interfaceC5277b);
        s sVar = this.f46005p;
        List list = this.f46000k;
        sVar.B(list, list.listIterator(list.size() - 1), this.f46008s);
    }

    private String c() {
        H();
        if (r('<') || r('>') || J("/>")) {
            return BuildConfig.FLAVOR;
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean z10 = true;
        boolean z11 = false;
        if (r('\'')) {
            F();
            l();
        } else if (r('\"')) {
            F();
            l();
            z11 = true;
            z10 = false;
        } else {
            z10 = false;
        }
        boolean n10 = this.f46006q.n();
        boolean m10 = this.f46006q.m();
        while (!q() && ((z10 && !r('\'') && ((m10 || (!r('>') && !r('<'))) && (n10 || !B()))) || ((z11 && !r('\"') && ((m10 || (!r('>') && !r('<'))) && (n10 || !B()))) || (!z10 && !z11 && !B() && !r('>') && !r('<'))))) {
            stringBuffer.append(this.f45991b[this.f45992c]);
            F();
            l();
        }
        if (r('\'') && z10) {
            F();
            l();
        } else if (r('\"') && z11) {
            F();
            l();
        }
        return this.f46006q.o() ? H.d(stringBuffer.toString(), this.f46006q.x()) : stringBuffer.toString();
    }

    private void d() {
        if (!this.f46003n && !this.f46006q.s()) {
            g();
            return;
        }
        if (J("/*<![CDATA[*/")) {
            m(13);
        } else if (J("//<![CDATA[")) {
            m(11);
        } else {
            m(9);
        }
        int length = this.f45996g.length();
        if (!f()) {
            m(length - this.f45996g.length());
            return;
        }
        while (!q() && !J("/*]]>*/") && !J("]]>") && !J("//]]>")) {
            F();
            l();
        }
        if (J("/*]]>*/")) {
            m(7);
        } else if (J("//]]>")) {
            m(5);
        } else {
            if (!J("]]>")) {
                m(length - this.f45996g.length());
                return;
            }
            m(3);
        }
        if (this.f45996g.length() > 0 && (this.f46003n || !this.f46006q.s())) {
            b(new C5280e(this.f45996g.toString().substring(length)));
        }
        StringBuffer stringBuffer = this.f45996g;
        stringBuffer.delete(length, stringBuffer.length());
    }

    private void e() {
        m(4);
        while (!q() && !J("-->")) {
            F();
            l();
        }
        if (J("-->")) {
            m(3);
        }
        if (this.f45996g.length() > 0) {
            if (!this.f46006q.t()) {
                String j10 = this.f46006q.j();
                String replaceAll = this.f45996g.toString().replaceAll("--", j10 + j10);
                if (replaceAll.length() > 0 && replaceAll.charAt(0) == '-') {
                    replaceAll = j10 + replaceAll.substring(1);
                }
                int length = replaceAll.length();
                if (length > 0) {
                    int i10 = length - 1;
                    if (replaceAll.charAt(i10) == '-') {
                        replaceAll = replaceAll.substring(0, i10) + j10;
                    }
                }
                b(new k(replaceAll));
            }
            StringBuffer stringBuffer = this.f45996g;
            stringBuffer.delete(0, stringBuffer.length());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        r9.f45990a.reset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean f() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f45991b);
        String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2.contains("]]>") || stringBuffer2.contains("/*]]>*/") || stringBuffer2.contains("//]]>")) {
            return true;
        }
        if (!this.f45990a.markSupported()) {
            return false;
        }
        this.f45990a.mark(524288);
        StringBuffer stringBuffer3 = new StringBuffer();
        int i10 = 0;
        while (true) {
            int read = this.f45990a.read();
            if (read == -1 || i10 >= 524287) {
                break;
            }
            i10++;
            stringBuffer3.append((char) read);
            String stringBuffer4 = stringBuffer3.toString();
            if (stringBuffer4.contains("]]>") || stringBuffer4.contains("/*]]>*/") || stringBuffer4.contains("//]]>")) {
                break;
            }
            if (stringBuffer3.length() > 16) {
                stringBuffer3.delete(0, 8);
            }
        }
        this.f45990a.reset();
        return true;
    }

    private boolean g() {
        while (!q()) {
            F();
            l();
            if (J("/*<![CDATA[*/") || J("<![CDATA[") || J("//<![CDATA[") || A()) {
                break;
            }
        }
        return a();
    }

    private void h() {
        m(9);
        H();
        String o10 = o(false);
        H();
        String o11 = o(false);
        H();
        String c10 = c();
        H();
        String c11 = c();
        H();
        String c12 = c();
        p('<');
        if (c12 == null || c12.length() == 0) {
            this.f45998i = new o(o10, o11, c10, c11);
        } else {
            this.f45998i = new o(o10, o11, c10, c11, c12);
        }
    }

    private void l() {
        m(1);
    }

    private void m(int i10) {
        this.f45992c += i10;
        D(i10 - 1);
        if (this.f45992c < 0) {
            this.f45992c = 0;
        }
    }

    private String o(boolean z10) {
        this.f46002m = true;
        if (!w()) {
            this.f46002m = false;
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (!q() && ((z10 && u()) || (!z10 && x()))) {
            F();
            stringBuffer.append(this.f45991b[this.f45992c]);
            l();
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        String stringBuffer2 = stringBuffer.toString();
        int indexOf = stringBuffer2.indexOf(58);
        if (indexOf >= 0) {
            String substring = stringBuffer2.substring(0, indexOf);
            stringBuffer2 = stringBuffer2.substring(indexOf + 1);
            int indexOf2 = stringBuffer2.indexOf(58);
            if (indexOf2 >= 0) {
                stringBuffer2 = stringBuffer2.substring(0, indexOf2);
            }
            if (this.f46006q.r()) {
                stringBuffer2 = substring + ":" + stringBuffer2;
                if (!"xmlns".equalsIgnoreCase(substring)) {
                    this.f46001l.add(substring.toLowerCase());
                }
            }
        }
        return stringBuffer2;
    }

    private void p(char c10) {
        while (!q()) {
            l();
            N(this.f45991b[this.f45992c]);
            if (r(c10)) {
                return;
            }
        }
    }

    private boolean q() {
        int i10 = this.f45993d;
        return i10 >= 0 && this.f45992c >= i10;
    }

    private boolean r(char c10) {
        return s(this.f45992c, c10);
    }

    private boolean s(int i10, char c10) {
        int i11 = this.f45993d;
        return (i11 < 0 || i10 < i11) && Character.toLowerCase(c10) == Character.toLowerCase(this.f45991b[i10]);
    }

    private boolean t(int i10) {
        int i11 = this.f45993d;
        if (i11 < 0 || i10 < i11) {
            return Character.isUnicodeIdentifierStart(this.f45991b[i10]);
        }
        return false;
    }

    private boolean u() {
        return v(this.f45992c);
    }

    private boolean v(int i10) {
        int i11 = this.f45993d;
        if (i11 >= 0 && i10 >= i11) {
            return false;
        }
        char c10 = this.f45991b[i10];
        return (Character.isWhitespace(c10) || c10 == 0 || c10 == 65533 || c10 == '\"' || c10 == "'".charAt(0) || c10 == '>' || c10 == '/' || c10 == '=' || Character.isISOControl(c10) || !Character.isDefined(c10)) ? false : true;
    }

    private boolean w() {
        if (this.f45991b[this.f45992c] == '<') {
            return false;
        }
        return u();
    }

    private boolean x() {
        return y(this.f45992c);
    }

    private boolean y(int i10) {
        char c10;
        if (!v(i10)) {
            return false;
        }
        int i11 = this.f45993d;
        return ((i11 >= 0 && i10 >= i11) || (c10 = this.f45991b[i10]) == '>' || c10 == '/' || c10 == ' ' || c10 == '<' || Character.isSpaceChar(c10)) ? false : true;
    }

    private boolean z(String str) {
        return "html".equalsIgnoreCase(str) || "head".equalsIgnoreCase(str) || "body".equalsIgnoreCase(str);
    }

    void I() {
        String obj;
        this.f45999j = null;
        this.f46000k.clear();
        this.f46002m = true;
        this.f46003n = false;
        this.f45997h = false;
        this.f46001l.clear();
        this.f45992c = 1024;
        D(0);
        while (true) {
            boolean z10 = true;
            while (!q()) {
                if (Thread.currentThread().isInterrupted()) {
                    n();
                    this.f46000k.clear();
                    this.f46001l.clear();
                    this.f45990a.close();
                    return;
                }
                StringBuffer stringBuffer = this.f45996g;
                stringBuffer.delete(0, stringBuffer.length());
                this.f45999j = null;
                this.f46002m = true;
                D(10);
                if (this.f46003n) {
                    int length = this.f46004o.length();
                    if (J("</" + this.f46004o) && (C(this.f45992c + length + 2) || s(this.f45992c + length + 2, '>'))) {
                        L();
                    } else if (z10 && J("<!--")) {
                        e();
                    } else if (J("/*<![CDATA[*/") || J("<![CDATA[") || J("//<![CDATA[")) {
                        d();
                    } else {
                        boolean g10 = g();
                        if (z10 && g10) {
                            List list = this.f46000k;
                            InterfaceC5277b interfaceC5277b = (InterfaceC5277b) list.get(list.size() - 1);
                            if (interfaceC5277b != null && (obj = interfaceC5277b.toString()) != null && obj.trim().length() > 0) {
                                z10 = false;
                            }
                        }
                    }
                    if (!this.f46003n) {
                        break;
                    }
                } else if (J("<!doctype")) {
                    if (this.f45997h) {
                        p('<');
                    } else {
                        h();
                        this.f45997h = true;
                    }
                } else if (J("</") && t(this.f45992c + 2)) {
                    this.f45997h = true;
                    L();
                } else if (J("/*<![CDATA[*/") || J("<![CDATA[") || J("//<![CDATA[")) {
                    d();
                } else if (J("<!--")) {
                    e();
                } else if (J("<") && t(this.f45992c + 1)) {
                    this.f45997h = true;
                    M();
                } else if (this.f46006q.p() && (J("<!") || J("<?"))) {
                    p('<');
                    if (r('>')) {
                        l();
                    }
                } else if (J("<?xml")) {
                    p('<');
                } else {
                    g();
                }
            }
            this.f45990a.close();
            return;
        }
    }

    public o i() {
        return this.f45998i;
    }

    Set j() {
        return this.f46001l;
    }

    List k() {
        return this.f46000k;
    }

    private void n() {
    }
}
