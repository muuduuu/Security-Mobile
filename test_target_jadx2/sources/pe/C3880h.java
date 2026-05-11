package pe;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: pe.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3880h implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f38683d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final C3880h f38684e = new C3880h(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f38685a;

    /* renamed from: b, reason: collision with root package name */
    private transient int f38686b;

    /* renamed from: c, reason: collision with root package name */
    private transient String f38687c;

    /* renamed from: pe.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C3880h g(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = AbstractC3874b.c();
            }
            return aVar.f(bArr, i10, i11);
        }

        public final C3880h a(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] a10 = AbstractC3873a.a(str);
            if (a10 != null) {
                return new C3880h(a10);
            }
            return null;
        }

        public final C3880h b(String str) {
            int e10;
            int e11;
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                e10 = qe.b.e(str.charAt(i11));
                e11 = qe.b.e(str.charAt(i11 + 1));
                bArr[i10] = (byte) ((e10 << 4) + e11);
            }
            return new C3880h(bArr);
        }

        public final C3880h c(String str, Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new C3880h(bytes);
        }

        public final C3880h d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            C3880h c3880h = new C3880h(f0.a(str));
            c3880h.I(str);
            return c3880h;
        }

        public final C3880h e(byte... data) {
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            return new C3880h(copyOf);
        }

        public final C3880h f(byte[] bArr, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int f10 = AbstractC3874b.f(bArr, i11);
            AbstractC3874b.b(bArr.length, i10, f10);
            return new C3880h(AbstractC3574i.l(bArr, i10, f10 + i10));
        }

        private a() {
        }
    }

    public C3880h(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f38685a = data;
    }

    public static /* synthetic */ int C(C3880h c3880h, C3880h c3880h2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC3874b.c();
        }
        return c3880h.A(c3880h2, i10);
    }

    public static final C3880h E(byte... bArr) {
        return f38683d.e(bArr);
    }

    public static /* synthetic */ C3880h O(C3880h c3880h, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = AbstractC3874b.c();
        }
        return c3880h.N(i10, i11);
    }

    public static final C3880h d(String str) {
        return f38683d.a(str);
    }

    public static final C3880h n(String str) {
        return f38683d.d(str);
    }

    public static /* synthetic */ int x(C3880h c3880h, C3880h c3880h2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c3880h.v(c3880h2, i10);
    }

    public final int A(C3880h other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return B(other.y(), i10);
    }

    public int B(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int min = Math.min(AbstractC3874b.e(this, i10), q().length - other.length); -1 < min; min--) {
            if (AbstractC3874b.a(q(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public final C3880h D() {
        return e("MD5");
    }

    public boolean F(int i10, C3880h other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.G(i11, q(), i10, i12);
    }

    public boolean G(int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        return i10 >= 0 && i10 <= q().length - i12 && i11 >= 0 && i11 <= other.length - i12 && AbstractC3874b.a(q(), i10, other, i11, i12);
    }

    public final void H(int i10) {
        this.f38686b = i10;
    }

    public final void I(String str) {
        this.f38687c = str;
    }

    public final C3880h J() {
        return e("SHA-1");
    }

    public final C3880h K() {
        return e("SHA-256");
    }

    public final int L() {
        return s();
    }

    public final boolean M(C3880h prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return F(0, prefix, 0, prefix.L());
    }

    public C3880h N(int i10, int i11) {
        int e10 = AbstractC3874b.e(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (e10 <= q().length) {
            if (e10 - i10 >= 0) {
                return (i10 == 0 && e10 == q().length) ? this : new C3880h(AbstractC3574i.l(q(), i10, e10));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + q().length + ')').toString());
    }

    public C3880h P() {
        for (int i10 = 0; i10 < q().length; i10++) {
            byte b10 = q()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] q10 = q();
                byte[] copyOf = Arrays.copyOf(q10, q10.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                copyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b11 = copyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        copyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new C3880h(copyOf);
            }
        }
        return this;
    }

    public byte[] Q() {
        byte[] q10 = q();
        byte[] copyOf = Arrays.copyOf(q10, q10.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    public String R() {
        String t10 = t();
        if (t10 != null) {
            return t10;
        }
        String c10 = f0.c(y());
        I(c10);
        return c10;
    }

    public void S(C3877e buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        qe.b.d(this, buffer, i10, i11);
    }

    public String b() {
        return AbstractC3873a.c(q(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int compareTo(C3880h other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int L10 = L();
        int L11 = other.L();
        int min = Math.min(L10, L11);
        for (int i10 = 0; i10 < min; i10++) {
            int p10 = p(i10) & 255;
            int p11 = other.p(i10) & 255;
            if (p10 == p11) {
            }
        }
        if (L10 == L11) {
            return 0;
        }
    }

    public C3880h e(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f38685a, 0, L());
        byte[] digest = messageDigest.digest();
        Intrinsics.d(digest);
        return new C3880h(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3880h) {
            C3880h c3880h = (C3880h) obj;
            if (c3880h.L() == q().length && c3880h.G(0, q(), 0, q().length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int r10 = r();
        if (r10 != 0) {
            return r10;
        }
        int hashCode = Arrays.hashCode(q());
        H(hashCode);
        return hashCode;
    }

    public final boolean o(C3880h suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return F(L() - suffix.L(), suffix, 0, suffix.L());
    }

    public final byte p(int i10) {
        return z(i10);
    }

    public final byte[] q() {
        return this.f38685a;
    }

    public final int r() {
        return this.f38686b;
    }

    public int s() {
        return q().length;
    }

    public final String t() {
        return this.f38687c;
    }

    public String toString() {
        int c10;
        String str;
        if (q().length == 0) {
            str = "[size=0]";
        } else {
            c10 = qe.b.c(q(), 64);
            if (c10 != -1) {
                String R10 = R();
                String substring = R10.substring(0, c10);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                String z10 = StringsKt.z(StringsKt.z(StringsKt.z(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (c10 >= R10.length()) {
                    return "[text=" + z10 + ']';
                }
                return "[size=" + q().length + " text=" + z10 + "…]";
            }
            if (q().length > 64) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(q().length);
                sb2.append(" hex=");
                int e10 = AbstractC3874b.e(this, 64);
                if (e10 <= q().length) {
                    if (e10 < 0) {
                        throw new IllegalArgumentException("endIndex < beginIndex");
                    }
                    sb2.append((e10 == q().length ? this : new C3880h(AbstractC3574i.l(q(), 0, e10))).u());
                    sb2.append("…]");
                    return sb2.toString();
                }
                throw new IllegalArgumentException(("endIndex > length(" + q().length + ')').toString());
            }
            str = "[hex=" + u() + ']';
        }
        return str;
    }

    public String u() {
        char[] cArr = new char[q().length * 2];
        int i10 = 0;
        for (byte b10 : q()) {
            int i11 = i10 + 1;
            cArr[i10] = qe.b.f()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = qe.b.f()[b10 & 15];
        }
        return StringsKt.n(cArr);
    }

    public final int v(C3880h other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return w(other.y(), i10);
    }

    public int w(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = q().length - other.length;
        int max = Math.max(i10, 0);
        if (max <= length) {
            while (!AbstractC3874b.a(q(), max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] y() {
        return q();
    }

    public byte z(int i10) {
        return q()[i10];
    }
}
