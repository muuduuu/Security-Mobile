package S8;

import com.google.gson.r;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f8891l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f8892m = new String[128];

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f8893n;

    /* renamed from: a, reason: collision with root package name */
    private final Writer f8894a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f8895b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    private int f8896c = 0;

    /* renamed from: d, reason: collision with root package name */
    private com.google.gson.d f8897d;

    /* renamed from: e, reason: collision with root package name */
    private String f8898e;

    /* renamed from: f, reason: collision with root package name */
    private String f8899f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8900g;

    /* renamed from: h, reason: collision with root package name */
    private r f8901h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8902i;

    /* renamed from: j, reason: collision with root package name */
    private String f8903j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8904k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f8892m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f8892m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f8893n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        u(6);
        this.f8901h = r.LEGACY_STRICT;
        this.f8904k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f8894a = writer;
        y(com.google.gson.d.f28450d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void H(String str) {
        int i10;
        String str2;
        String[] strArr = this.f8902i ? f8893n : f8892m;
        this.f8894a.write(34);
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i10 = str2 == null ? i10 + 1 : 0;
                if (i11 < i10) {
                    this.f8894a.write(str, i11, i10 - i11);
                }
                this.f8894a.write(str2);
                i11 = i10 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i10) {
                }
                this.f8894a.write(str2);
                i11 = i10 + 1;
            }
        }
        if (i11 < length) {
            this.f8894a.write(str, i11, length - i11);
        }
        this.f8894a.write(34);
    }

    private void a() {
        int t10 = t();
        if (t10 == 5) {
            this.f8894a.write(this.f8899f);
        } else if (t10 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        q();
        x(4);
    }

    private void b() {
        int t10 = t();
        if (t10 == 1) {
            x(2);
            q();
            return;
        }
        if (t10 == 2) {
            this.f8894a.append((CharSequence) this.f8899f);
            q();
        } else {
            if (t10 == 4) {
                this.f8894a.append((CharSequence) this.f8898e);
                x(5);
                return;
            }
            if (t10 != 6) {
                if (t10 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f8901h != r.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            x(7);
        }
    }

    private c e(int i10, int i11, char c10) {
        int t10 = t();
        if (t10 != i11 && t10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f8903j != null) {
            throw new IllegalStateException("Dangling name: " + this.f8903j);
        }
        this.f8896c--;
        if (t10 == i11) {
            q();
        }
        this.f8894a.write(c10);
        return this;
    }

    private static boolean o(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void q() {
        if (this.f8900g) {
            return;
        }
        this.f8894a.write(this.f8897d.b());
        int i10 = this.f8896c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f8894a.write(this.f8897d.a());
        }
    }

    private c s(int i10, char c10) {
        b();
        u(i10);
        this.f8894a.write(c10);
        return this;
    }

    private int t() {
        int i10 = this.f8896c;
        if (i10 != 0) {
            return this.f8895b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void u(int i10) {
        int i11 = this.f8896c;
        int[] iArr = this.f8895b;
        if (i11 == iArr.length) {
            this.f8895b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f8895b;
        int i12 = this.f8896c;
        this.f8896c = i12 + 1;
        iArr2[i12] = i10;
    }

    private void x(int i10) {
        this.f8895b[this.f8896c - 1] = i10;
    }

    private void y0() {
        if (this.f8903j != null) {
            a();
            H(this.f8903j);
            this.f8903j = null;
        }
    }

    public final void C(boolean z10) {
        this.f8904k = z10;
    }

    public final void F(r rVar) {
        Objects.requireNonNull(rVar);
        this.f8901h = rVar;
    }

    public c I(double d10) {
        y0();
        if (this.f8901h == r.LENIENT || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            b();
            this.f8894a.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public c K(long j10) {
        y0();
        b();
        this.f8894a.write(Long.toString(j10));
        return this;
    }

    public c N(Boolean bool) {
        if (bool == null) {
            return r();
        }
        y0();
        b();
        this.f8894a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c Q(Number number) {
        if (number == null) {
            return r();
        }
        y0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!o(cls) && !f8891l.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (this.f8901h != r.LENIENT) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
        }
        b();
        this.f8894a.append((CharSequence) obj);
        return this;
    }

    public c c() {
        y0();
        return s(1, '[');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8894a.close();
        int i10 = this.f8896c;
        if (i10 > 1 || (i10 == 1 && this.f8895b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f8896c = 0;
    }

    public c d() {
        y0();
        return s(3, '{');
    }

    public c f() {
        return e(1, 2, ']');
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f8896c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f8894a.flush();
    }

    public c g() {
        return e(3, 5, '}');
    }

    public final boolean i() {
        return this.f8904k;
    }

    public c i0(String str) {
        if (str == null) {
            return r();
        }
        y0();
        b();
        H(str);
        return this;
    }

    public final r j() {
        return this.f8901h;
    }

    public final boolean l() {
        return this.f8902i;
    }

    public boolean n() {
        return this.f8901h == r.LENIENT;
    }

    public c o0(boolean z10) {
        y0();
        b();
        this.f8894a.write(z10 ? "true" : "false");
        return this;
    }

    public c p(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f8903j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int t10 = t();
        if (t10 != 3 && t10 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f8903j = str;
        return this;
    }

    public c r() {
        if (this.f8903j != null) {
            if (!this.f8904k) {
                this.f8903j = null;
                return this;
            }
            y0();
        }
        b();
        this.f8894a.write("null");
        return this;
    }

    public final void y(com.google.gson.d dVar) {
        Objects.requireNonNull(dVar);
        this.f8897d = dVar;
        this.f8899f = ",";
        if (dVar.c()) {
            this.f8898e = ": ";
            if (this.f8897d.b().isEmpty()) {
                this.f8899f = ", ";
            }
        } else {
            this.f8898e = ":";
        }
        this.f8900g = this.f8897d.b().isEmpty() && this.f8897d.a().isEmpty();
    }

    public final void z(boolean z10) {
        this.f8902i = z10;
    }
}
