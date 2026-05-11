package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f35602j = new String[128];

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f35603k;

    /* renamed from: a, reason: collision with root package name */
    private final Writer f35604a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f35605b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    private int f35606c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f35607d;

    /* renamed from: e, reason: collision with root package name */
    private String f35608e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f35609f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f35610g;

    /* renamed from: h, reason: collision with root package name */
    private String f35611h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f35612i;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f35602j[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f35602j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f35603k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        p(6);
        this.f35608e = ":";
        this.f35612i = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f35604a = writer;
    }

    private void C() {
        if (this.f35611h != null) {
            a();
            s(this.f35611h);
            this.f35611h = null;
        }
    }

    private void a() {
        int o10 = o();
        if (o10 == 5) {
            this.f35604a.write(44);
        } else if (o10 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        j();
        q(4);
    }

    private void b() {
        int o10 = o();
        if (o10 == 1) {
            q(2);
            j();
            return;
        }
        if (o10 == 2) {
            this.f35604a.append(',');
            j();
        } else {
            if (o10 == 4) {
                this.f35604a.append((CharSequence) this.f35608e);
                q(5);
                return;
            }
            if (o10 != 6) {
                if (o10 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f35609f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            q(7);
        }
    }

    private c e(int i10, int i11, char c10) {
        int o10 = o();
        if (o10 != i11 && o10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f35611h != null) {
            throw new IllegalStateException("Dangling name: " + this.f35611h);
        }
        this.f35606c--;
        if (o10 == i11) {
            j();
        }
        this.f35604a.write(c10);
        return this;
    }

    private void j() {
        if (this.f35607d == null) {
            return;
        }
        this.f35604a.write(10);
        int i10 = this.f35606c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f35604a.write(this.f35607d);
        }
    }

    private c n(int i10, char c10) {
        b();
        p(i10);
        this.f35604a.write(c10);
        return this;
    }

    private int o() {
        int i10 = this.f35606c;
        if (i10 != 0) {
            return this.f35605b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void p(int i10) {
        int i11 = this.f35606c;
        int[] iArr = this.f35605b;
        if (i11 == iArr.length) {
            this.f35605b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f35605b;
        int i12 = this.f35606c;
        this.f35606c = i12 + 1;
        iArr2[i12] = i10;
    }

    private void q(int i10) {
        this.f35605b[this.f35606c - 1] = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void s(String str) {
        int i10;
        String str2;
        String[] strArr = this.f35610g ? f35603k : f35602j;
        this.f35604a.write(34);
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i10 = str2 == null ? i10 + 1 : 0;
                if (i11 < i10) {
                    this.f35604a.write(str, i11, i10 - i11);
                }
                this.f35604a.write(str2);
                i11 = i10 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i10) {
                }
                this.f35604a.write(str2);
                i11 = i10 + 1;
            }
        }
        if (i11 < length) {
            this.f35604a.write(str, i11, length - i11);
        }
        this.f35604a.write(34);
    }

    public c c() {
        C();
        return n(1, '[');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f35604a.close();
        int i10 = this.f35606c;
        if (i10 > 1 || (i10 == 1 && this.f35605b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f35606c = 0;
    }

    public c d() {
        C();
        return n(3, '{');
    }

    public c f() {
        return e(1, 2, ']');
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f35606c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f35604a.flush();
    }

    public c g() {
        return e(3, 5, '}');
    }

    public c i(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f35611h != null) {
            throw new IllegalStateException();
        }
        if (this.f35606c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f35611h = str;
        return this;
    }

    public c l() {
        if (this.f35611h != null) {
            if (!this.f35612i) {
                this.f35611h = null;
                return this;
            }
            C();
        }
        b();
        this.f35604a.write("null");
        return this;
    }

    public final void r(String str) {
        if (str.length() == 0) {
            this.f35607d = null;
            this.f35608e = ":";
        } else {
            this.f35607d = str;
            this.f35608e = ": ";
        }
    }

    public c t(long j10) {
        C();
        b();
        this.f35604a.write(Long.toString(j10));
        return this;
    }

    public c u(Boolean bool) {
        if (bool == null) {
            return l();
        }
        C();
        b();
        this.f35604a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c x(Number number) {
        if (number == null) {
            return l();
        }
        C();
        String obj = number.toString();
        if (this.f35609f || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            b();
            this.f35604a.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c y(String str) {
        if (str == null) {
            return l();
        }
        C();
        b();
        s(str);
        return this;
    }

    public c z(boolean z10) {
        C();
        b();
        this.f35604a.write(z10 ? "true" : "false");
        return this;
    }
}
