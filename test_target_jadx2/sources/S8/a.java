package S8;

import P8.f;
import P8.o;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.google.gson.r;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Reader f8876a;

    /* renamed from: i, reason: collision with root package name */
    private long f8884i;

    /* renamed from: j, reason: collision with root package name */
    private int f8885j;

    /* renamed from: k, reason: collision with root package name */
    private String f8886k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f8887l;

    /* renamed from: n, reason: collision with root package name */
    private String[] f8889n;

    /* renamed from: o, reason: collision with root package name */
    private int[] f8890o;

    /* renamed from: b, reason: collision with root package name */
    private r f8877b = r.LEGACY_STRICT;

    /* renamed from: c, reason: collision with root package name */
    private final char[] f8878c = new char[1024];

    /* renamed from: d, reason: collision with root package name */
    private int f8879d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f8880e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f8881f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f8882g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f8883h = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f8888m = 1;

    /* renamed from: S8.a$a, reason: collision with other inner class name */
    class C0175a extends f {
        C0175a() {
        }

        @Override // P8.f
        public void a(a aVar) {
            int i10 = aVar.f8883h;
            if (i10 == 0) {
                i10 = aVar.f();
            }
            if (i10 == 13) {
                aVar.f8883h = 9;
            } else if (i10 == 12) {
                aVar.f8883h = 8;
            } else {
                if (i10 != 14) {
                    throw aVar.l1("a name");
                }
                aVar.f8883h = 10;
            }
        }
    }

    static {
        f.f7590a = new C0175a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f8887l = iArr;
        iArr[0] = 6;
        this.f8889n = new String[32];
        this.f8890o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f8876a = reader;
    }

    private void A0(char c10) {
        char[] cArr = this.f8878c;
        do {
            int i10 = this.f8879d;
            int i11 = this.f8880e;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f8879d = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f8879d = i12;
                    y0();
                    i10 = this.f8879d;
                    i11 = this.f8880e;
                } else {
                    if (c11 == '\n') {
                        this.f8881f++;
                        this.f8882g = i12;
                    }
                    i10 = i12;
                }
            }
            this.f8879d = i10;
        } while (j(1));
        throw i1("Unterminated string");
    }

    private int C(boolean z10) {
        char[] cArr = this.f8878c;
        int i10 = this.f8879d;
        int i11 = this.f8880e;
        while (true) {
            if (i10 == i11) {
                this.f8879d = i10;
                if (!j(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + s());
                }
                i10 = this.f8879d;
                i11 = this.f8880e;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f8881f++;
                this.f8882g = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f8879d = i12;
                    if (i12 == i11) {
                        this.f8879d = i10;
                        boolean j10 = j(2);
                        this.f8879d++;
                        if (!j10) {
                            return c10;
                        }
                    }
                    d();
                    int i13 = this.f8879d;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f8879d = i13 + 1;
                        if (!O0("*/")) {
                            throw i1("Unterminated comment");
                        }
                        i10 = this.f8879d + 2;
                        i11 = this.f8880e;
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f8879d = i13 + 1;
                        Z0();
                        i10 = this.f8879d;
                        i11 = this.f8880e;
                    }
                } else {
                    if (c10 != '#') {
                        this.f8879d = i12;
                        return c10;
                    }
                    this.f8879d = i12;
                    d();
                    Z0();
                    i10 = this.f8879d;
                    i11 = this.f8880e;
                }
            }
            i10 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r10.f8879d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String H(char c10) {
        char[] cArr = this.f8878c;
        StringBuilder sb2 = null;
        do {
            int i10 = this.f8879d;
            int i11 = this.f8880e;
            while (true) {
                int i12 = i11;
                int i13 = i10;
                while (i10 < i12) {
                    int i14 = i10 + 1;
                    char c11 = cArr[i10];
                    if (this.f8877b == r.STRICT && c11 < ' ') {
                        throw i1("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                    }
                    if (c11 == c10) {
                        this.f8879d = i14;
                        int i15 = (i14 - i13) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i13, i15);
                        }
                        sb2.append(cArr, i13, i15);
                        return sb2.toString();
                    }
                    if (c11 == '\\') {
                        this.f8879d = i14;
                        int i16 = i14 - i13;
                        int i17 = i16 - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max(i16 * 2, 16));
                        }
                        sb2.append(cArr, i13, i17);
                        sb2.append(y0());
                        i10 = this.f8879d;
                        i11 = this.f8880e;
                    } else {
                        if (c11 == '\n') {
                            this.f8881f++;
                            this.f8882g = i14;
                        }
                        i10 = i14;
                    }
                }
                break;
            }
        } while (j(1));
        throw i1("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String K() {
        String sb2;
        StringBuilder sb3 = null;
        int i10 = 0;
        do {
            int i11 = 0;
            while (true) {
                int i12 = this.f8879d;
                if (i12 + i11 < this.f8880e) {
                    char c10 = this.f8878c[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i11 >= this.f8878c.length) {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb3.append(this.f8878c, this.f8879d, i11);
                    this.f8879d += i11;
                } else if (j(i11 + 1)) {
                }
            }
            i10 = i11;
            if (sb3 != null) {
                sb2 = new String(this.f8878c, this.f8879d, i10);
            } else {
                sb3.append(this.f8878c, this.f8879d, i10);
                sb2 = sb3.toString();
            }
            this.f8879d += i10;
            return sb2;
        } while (j(1));
        if (sb3 != null) {
        }
        this.f8879d += i10;
        return sb2;
    }

    private boolean O0(String str) {
        int length = str.length();
        while (true) {
            if (this.f8879d + length > this.f8880e && !j(length)) {
                return false;
            }
            char[] cArr = this.f8878c;
            int i10 = this.f8879d;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f8878c[this.f8879d + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f8881f++;
            this.f8882g = i10 + 1;
            this.f8879d++;
        }
    }

    private int Q() {
        String str;
        String str2;
        int i10;
        char c10 = this.f8878c[this.f8879d];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        boolean z10 = this.f8877b != r.STRICT;
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f8879d + i11 >= this.f8880e && !j(i11 + 1)) {
                return 0;
            }
            char c11 = this.f8878c[this.f8879d + i11];
            if (c11 != str.charAt(i11) && (!z10 || c11 != str2.charAt(i11))) {
                return 0;
            }
        }
        if ((this.f8879d + length < this.f8880e || j(length + 1)) && r(this.f8878c[this.f8879d + length])) {
            return 0;
        }
        this.f8879d += length;
        this.f8883h = i10;
        return i10;
    }

    private void Z0() {
        char c10;
        do {
            if (this.f8879d >= this.f8880e && !j(1)) {
                return;
            }
            char[] cArr = this.f8878c;
            int i10 = this.f8879d;
            int i11 = i10 + 1;
            this.f8879d = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f8881f++;
                this.f8882g = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a1() {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f8879d;
                if (i11 + i10 < this.f8880e) {
                    char c10 = this.f8878c[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f8879d = i11 + i10;
                }
            }
            this.f8879d += i10;
            return;
        } while (j(1));
    }

    private void d() {
        if (this.f8877b != r.LENIENT) {
            throw i1("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void e() {
        C(true);
        int i10 = this.f8879d;
        this.f8879d = i10 - 1;
        if (i10 + 4 <= this.f8880e || j(5)) {
            int i11 = this.f8879d;
            char[] cArr = this.f8878c;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                this.f8879d = i11 + 5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0093, code lost:
    
        if (r9 != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if (r10 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        if (r13 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        if (r13 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        r18.f8884i = r11;
        r18.f8879d += r8;
        r18.f8883h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b7, code lost:
    
        if (r9 == 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
    
        if (r9 == 4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (r9 != 7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        r18.f8885j = r8;
        r18.f8883h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0091, code lost:
    
        if (r(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c9, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int i0() {
        char c10;
        char[] cArr = this.f8878c;
        int i10 = this.f8879d;
        int i11 = this.f8880e;
        int i12 = 0;
        int i13 = 0;
        char c11 = 0;
        boolean z10 = false;
        boolean z11 = true;
        long j10 = 0;
        while (true) {
            if (i10 + i13 == i11) {
                if (i13 == cArr.length) {
                    return i12;
                }
                if (!j(i13 + 1)) {
                    break;
                }
                i10 = this.f8879d;
                i11 = this.f8880e;
            }
            char c12 = cArr[i10 + i13];
            if (c12 != '+') {
                if (c12 == 'E' || c12 == 'e') {
                    i12 = 0;
                    if (c11 != 2 && c11 != 4) {
                        return 0;
                    }
                    c11 = 5;
                } else if (c12 != '-') {
                    c10 = 3;
                    if (c12 == '.') {
                        i12 = 0;
                        if (c11 != 2) {
                            return 0;
                        }
                    } else {
                        if (c12 < '0' || c12 > '9') {
                            break;
                        }
                        if (c11 == 1 || c11 == 0) {
                            j10 = -(c12 - '0');
                            c11 = 2;
                        } else if (c11 == 2) {
                            if (j10 == 0) {
                                return 0;
                            }
                            long j11 = (10 * j10) - (c12 - '0');
                            z11 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                            j10 = j11;
                        } else if (c11 == 3) {
                            i12 = 0;
                            c11 = 4;
                        } else if (c11 == 5 || c11 == 6) {
                            i12 = 0;
                            c11 = 7;
                        }
                        i12 = 0;
                    }
                } else {
                    c10 = 6;
                    i12 = 0;
                    if (c11 == 0) {
                        c11 = 1;
                        z10 = true;
                    } else if (c11 != 5) {
                        return 0;
                    }
                }
                i13++;
            } else {
                c10 = 6;
                i12 = 0;
                if (c11 != 5) {
                    return 0;
                }
            }
            c11 = c10;
            i13++;
        }
    }

    private d i1(String str) {
        throw new d(str + s() + "\nSee " + o.a("malformed-json"));
    }

    private boolean j(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f8878c;
        int i13 = this.f8882g;
        int i14 = this.f8879d;
        this.f8882g = i13 - i14;
        int i15 = this.f8880e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f8880e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f8880e = 0;
        }
        this.f8879d = 0;
        do {
            Reader reader = this.f8876a;
            int i17 = this.f8880e;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f8880e + read;
            this.f8880e = i11;
            if (this.f8881f == 0 && (i12 = this.f8882g) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f8879d++;
                this.f8882g = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private String l(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f8888m;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f8887l[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f8890o[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f8889n[i10];
                    if (str == null) {
                        break;
                    } else {
                        sb2.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i12);
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IllegalStateException l1(String str) {
        return new IllegalStateException("Expected " + str + " but was " + N() + s() + "\nSee " + o.a(N() == b.NULL ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    private void o0(int i10) {
        int i11 = this.f8888m;
        int[] iArr = this.f8887l;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f8887l = Arrays.copyOf(iArr, i12);
            this.f8890o = Arrays.copyOf(this.f8890o, i12);
            this.f8889n = (String[]) Arrays.copyOf(this.f8889n, i12);
        }
        int[] iArr2 = this.f8887l;
        int i13 = this.f8888m;
        this.f8888m = i13 + 1;
        iArr2[i13] = i10;
    }

    private boolean r(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    private char y0() {
        int i10;
        if (this.f8879d == this.f8880e && !j(1)) {
            throw i1("Unterminated escape sequence");
        }
        char[] cArr = this.f8878c;
        int i11 = this.f8879d;
        int i12 = i11 + 1;
        this.f8879d = i12;
        char c10 = cArr[i11];
        if (c10 != '\n') {
            if (c10 != '\"') {
                if (c10 != '\'') {
                    if (c10 != '/' && c10 != '\\') {
                        if (c10 == 'b') {
                            return '\b';
                        }
                        if (c10 == 'f') {
                            return '\f';
                        }
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 == 'r') {
                            return '\r';
                        }
                        if (c10 == 't') {
                            return '\t';
                        }
                        if (c10 != 'u') {
                            throw i1("Invalid escape sequence");
                        }
                        if (i11 + 5 > this.f8880e && !j(4)) {
                            throw i1("Unterminated escape sequence");
                        }
                        int i13 = this.f8879d;
                        int i14 = i13 + 4;
                        int i15 = 0;
                        while (i13 < i14) {
                            char c11 = this.f8878c[i13];
                            int i16 = i15 << 4;
                            if (c11 >= '0' && c11 <= '9') {
                                i10 = c11 - '0';
                            } else if (c11 >= 'a' && c11 <= 'f') {
                                i10 = c11 - 'W';
                            } else {
                                if (c11 < 'A' || c11 > 'F') {
                                    throw i1("Malformed Unicode escape \\u" + new String(this.f8878c, this.f8879d, 4));
                                }
                                i10 = c11 - '7';
                            }
                            i15 = i16 + i10;
                            i13++;
                        }
                        this.f8879d += 4;
                        return (char) i15;
                    }
                }
            }
            return c10;
        }
        if (this.f8877b == r.STRICT) {
            throw i1("Cannot escape a newline character in strict mode");
        }
        this.f8881f++;
        this.f8882g = i12;
        if (this.f8877b == r.STRICT) {
            throw i1("Invalid escaped character \"'\" in strict mode");
        }
        return c10;
    }

    public void F() {
        int i10 = this.f8883h;
        if (i10 == 0) {
            i10 = f();
        }
        if (i10 != 7) {
            throw l1("null");
        }
        this.f8883h = 0;
        int[] iArr = this.f8890o;
        int i11 = this.f8888m - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public String I() {
        String str;
        int i10 = this.f8883h;
        if (i10 == 0) {
            i10 = f();
        }
        if (i10 == 10) {
            str = K();
        } else if (i10 == 8) {
            str = H('\'');
        } else if (i10 == 9) {
            str = H('\"');
        } else if (i10 == 11) {
            str = this.f8886k;
            this.f8886k = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f8884i);
        } else {
            if (i10 != 16) {
                throw l1("a string");
            }
            str = new String(this.f8878c, this.f8879d, this.f8885j);
            this.f8879d += this.f8885j;
        }
        this.f8883h = 0;
        int[] iArr = this.f8890o;
        int i11 = this.f8888m - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public String J() {
        return l(false);
    }

    public b N() {
        int i10 = this.f8883h;
        if (i10 == 0) {
            i10 = f();
        }
        switch (i10) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return b.NAME;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return b.NUMBER;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void b() {
        int i10 = this.f8883h;
        if (i10 == 0) {
            i10 = f();
        }
        if (i10 != 3) {
            throw l1("BEGIN_ARRAY");
        }
        o0(1);
        this.f8890o[this.f8888m - 1] = 0;
        this.f8883h = 0;
    }

    public void c() {
        int i10 = this.f8883h;
        if (i10 == 0) {
            i10 = f();
        }
        if (i10 != 1) {
            throw l1("BEGIN_OBJECT");
        }
        o0(3);
        this.f8883h = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8883h = 0;
        this.f8887l[0] = 8;
        this.f8888m = 1;
        this.f8876a.close();
    }

    int f() {
        int C10;
        int[] iArr = this.f8887l;
        int i10 = this.f8888m;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int C11 = C(true);
            if (C11 != 44) {
                if (C11 != 59) {
                    if (C11 != 93) {
                        throw i1("Unterminated array");
                    }
                    this.f8883h = 4;
                    return 4;
                }
                d();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (C10 = C(true)) != 44) {
                    if (C10 != 59) {
                        if (C10 != 125) {
                            throw i1("Unterminated object");
                        }
                        this.f8883h = 2;
                        return 2;
                    }
                    d();
                }
                int C12 = C(true);
                if (C12 == 34) {
                    this.f8883h = 13;
                    return 13;
                }
                if (C12 == 39) {
                    d();
                    this.f8883h = 12;
                    return 12;
                }
                if (C12 == 125) {
                    if (i11 == 5) {
                        throw i1("Expected name");
                    }
                    this.f8883h = 2;
                    return 2;
                }
                d();
                this.f8879d--;
                if (!r((char) C12)) {
                    throw i1("Expected name");
                }
                this.f8883h = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int C13 = C(true);
                if (C13 != 58) {
                    if (C13 != 61) {
                        throw i1("Expected ':'");
                    }
                    d();
                    if (this.f8879d < this.f8880e || j(1)) {
                        char[] cArr = this.f8878c;
                        int i12 = this.f8879d;
                        if (cArr[i12] == '>') {
                            this.f8879d = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f8877b == r.LENIENT) {
                    e();
                }
                this.f8887l[this.f8888m - 1] = 7;
            } else if (i11 == 7) {
                if (C(false) == -1) {
                    this.f8883h = 17;
                    return 17;
                }
                d();
                this.f8879d--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int C14 = C(true);
        if (C14 == 34) {
            this.f8883h = 9;
            return 9;
        }
        if (C14 == 39) {
            d();
            this.f8883h = 8;
            return 8;
        }
        if (C14 != 44 && C14 != 59) {
            if (C14 == 91) {
                this.f8883h = 3;
                return 3;
            }
            if (C14 != 93) {
                if (C14 == 123) {
                    this.f8883h = 1;
                    return 1;
                }
                this.f8879d--;
                int Q10 = Q();
                if (Q10 != 0) {
                    return Q10;
                }
                int i02 = i0();
                if (i02 != 0) {
                    return i02;
                }
                if (!r(this.f8878c[this.f8879d])) {
                    throw i1("Expected value");
                }
                d();
                this.f8883h = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f8883h = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw i1("Unexpected value");
        }
        d();
        this.f8879d--;
        this.f8883h = 7;
        return 7;
    }

    public void g() {
        int i10 = this.f8883h;
        if (i10 == 0) {
            i10 = f();
        }
        if (i10 != 4) {
            throw l1("END_ARRAY");
        }
        int i11 = this.f8888m;
        this.f8888m = i11 - 1;
        int[] iArr = this.f8890o;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f8883h = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void g1() {
        int i10 = 0;
        do {
            int i11 = this.f8883h;
            if (i11 == 0) {
                i11 = f();
            }
            switch (i11) {
                case 1:
                    o0(3);
                    i10++;
                    this.f8883h = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f8889n[this.f8888m - 1] = null;
                    }
                    this.f8888m--;
                    i10--;
                    this.f8883h = 0;
                    break;
                case 3:
                    o0(1);
                    i10++;
                    this.f8883h = 0;
                    break;
                case 4:
                    this.f8888m--;
                    i10--;
                    this.f8883h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                default:
                    this.f8883h = 0;
                    break;
                case 8:
                    A0('\'');
                    this.f8883h = 0;
                    break;
                case 9:
                    A0('\"');
                    this.f8883h = 0;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    a1();
                    this.f8883h = 0;
                    break;
                case 12:
                    A0('\'');
                    if (i10 == 0) {
                        this.f8889n[this.f8888m - 1] = "<skipped>";
                    }
                    this.f8883h = 0;
                    break;
                case 13:
                    A0('\"');
                    if (i10 == 0) {
                        this.f8889n[this.f8888m - 1] = "<skipped>";
                    }
                    this.f8883h = 0;
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    a1();
                    if (i10 == 0) {
                        this.f8889n[this.f8888m - 1] = "<skipped>";
                    }
                    this.f8883h = 0;
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    this.f8879d += this.f8885j;
                    this.f8883h = 0;
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f8890o;
        int i12 = this.f8888m - 1;
        iArr[i12] = iArr[i12] + 1;
    }

    public void i() {
        int i10 = this.f8883h;
        if (i10 == 0) {
            i10 = f();
        }
        if (i10 != 2) {
            throw l1("END_OBJECT");
        }
        int i11 = this.f8888m;
        int i12 = i11 - 1;
        this.f8888m = i12;
        this.f8889n[i12] = null;
        int[] iArr = this.f8890o;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f8883h = 0;
    }

    public String n() {
        return l(true);
    }

    public final r o() {
        return this.f8877b;
    }

    public boolean p() {
        int i10 = this.f8883h;
        if (i10 == 0) {
            i10 = f();
        }
        return (i10 == 2 || i10 == 4 || i10 == 17) ? false : true;
    }

    public final boolean q() {
        return this.f8877b == r.LENIENT;
    }

    String s() {
        return " at line " + (this.f8881f + 1) + " column " + ((this.f8879d - this.f8882g) + 1) + " path " + J();
    }

    public boolean t() {
        int i10 = this.f8883h;
        if (i10 == 0) {
            i10 = f();
        }
        if (i10 == 5) {
            this.f8883h = 0;
            int[] iArr = this.f8890o;
            int i11 = this.f8888m - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 != 6) {
            throw l1("a boolean");
        }
        this.f8883h = 0;
        int[] iArr2 = this.f8890o;
        int i12 = this.f8888m - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return false;
    }

    public String toString() {
        return getClass().getSimpleName() + s();
    }

    public double u() {
        int i10 = this.f8883h;
        if (i10 == 0) {
            i10 = f();
        }
        if (i10 == 15) {
            this.f8883h = 0;
            int[] iArr = this.f8890o;
            int i11 = this.f8888m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f8884i;
        }
        if (i10 == 16) {
            this.f8886k = new String(this.f8878c, this.f8879d, this.f8885j);
            this.f8879d += this.f8885j;
        } else if (i10 == 8 || i10 == 9) {
            this.f8886k = H(i10 == 8 ? '\'' : '\"');
        } else if (i10 == 10) {
            this.f8886k = K();
        } else if (i10 != 11) {
            throw l1("a double");
        }
        this.f8883h = 11;
        double parseDouble = Double.parseDouble(this.f8886k);
        if (this.f8877b != r.LENIENT && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw i1("JSON forbids NaN and infinities: " + parseDouble);
        }
        this.f8886k = null;
        this.f8883h = 0;
        int[] iArr2 = this.f8890o;
        int i12 = this.f8888m - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    public int x() {
        int i10 = this.f8883h;
        if (i10 == 0) {
            i10 = f();
        }
        if (i10 == 15) {
            long j10 = this.f8884i;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f8883h = 0;
                int[] iArr = this.f8890o;
                int i12 = this.f8888m - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f8884i + s());
        }
        if (i10 == 16) {
            this.f8886k = new String(this.f8878c, this.f8879d, this.f8885j);
            this.f8879d += this.f8885j;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw l1("an int");
            }
            if (i10 == 10) {
                this.f8886k = K();
            } else {
                this.f8886k = H(i10 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f8886k);
                this.f8883h = 0;
                int[] iArr2 = this.f8890o;
                int i13 = this.f8888m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f8883h = 11;
        double parseDouble = Double.parseDouble(this.f8886k);
        int i14 = (int) parseDouble;
        if (i14 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f8886k + s());
        }
        this.f8886k = null;
        this.f8883h = 0;
        int[] iArr3 = this.f8890o;
        int i15 = this.f8888m - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long y() {
        int i10 = this.f8883h;
        if (i10 == 0) {
            i10 = f();
        }
        if (i10 == 15) {
            this.f8883h = 0;
            int[] iArr = this.f8890o;
            int i11 = this.f8888m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f8884i;
        }
        if (i10 == 16) {
            this.f8886k = new String(this.f8878c, this.f8879d, this.f8885j);
            this.f8879d += this.f8885j;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw l1("a long");
            }
            if (i10 == 10) {
                this.f8886k = K();
            } else {
                this.f8886k = H(i10 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f8886k);
                this.f8883h = 0;
                int[] iArr2 = this.f8890o;
                int i12 = this.f8888m - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f8883h = 11;
        double parseDouble = Double.parseDouble(this.f8886k);
        long j10 = (long) parseDouble;
        if (j10 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f8886k + s());
        }
        this.f8886k = null;
        this.f8883h = 0;
        int[] iArr3 = this.f8890o;
        int i13 = this.f8888m - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return j10;
    }

    public String z() {
        String H10;
        int i10 = this.f8883h;
        if (i10 == 0) {
            i10 = f();
        }
        if (i10 == 14) {
            H10 = K();
        } else if (i10 == 12) {
            H10 = H('\'');
        } else {
            if (i10 != 13) {
                throw l1("a name");
            }
            H10 = H('\"');
        }
        this.f8883h = 0;
        this.f8889n[this.f8888m - 1] = H10;
        return H10;
    }

    public final void z0(r rVar) {
        Objects.requireNonNull(rVar);
        this.f8877b = rVar;
    }
}
