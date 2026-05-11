package io.sentry.vendor.gson.stream;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Reader f35587a;

    /* renamed from: i, reason: collision with root package name */
    private long f35595i;

    /* renamed from: j, reason: collision with root package name */
    private int f35596j;

    /* renamed from: k, reason: collision with root package name */
    private String f35597k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f35598l;

    /* renamed from: n, reason: collision with root package name */
    private String[] f35600n;

    /* renamed from: o, reason: collision with root package name */
    private int[] f35601o;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35588b = false;

    /* renamed from: c, reason: collision with root package name */
    private final char[] f35589c = new char[1024];

    /* renamed from: d, reason: collision with root package name */
    private int f35590d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f35591e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f35592f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f35593g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f35594h = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f35599m = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f35598l = iArr;
        iArr[0] = 6;
        this.f35600n = new String[32];
        this.f35601o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f35587a = reader;
    }

    private int C() {
        String str;
        String str2;
        int i10;
        char c10 = this.f35589c[this.f35590d];
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
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f35590d + i11 >= this.f35591e && !i(i11 + 1)) {
                return 0;
            }
            char c11 = this.f35589c[this.f35590d + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f35590d + length < this.f35591e || i(length + 1)) && j(this.f35589c[this.f35590d + length])) {
            return 0;
        }
        this.f35590d += length;
        this.f35594h = i10;
        return i10;
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
    
        r18.f35595i = r11;
        r18.f35590d += r8;
        r18.f35594h = 15;
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
    
        r18.f35596j = r8;
        r18.f35594h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0091, code lost:
    
        if (j(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c9, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int F() {
        char c10;
        char[] cArr = this.f35589c;
        int i10 = this.f35590d;
        int i11 = this.f35591e;
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
                if (!i(i13 + 1)) {
                    break;
                }
                i10 = this.f35590d;
                i11 = this.f35591e;
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

    private void H(int i10) {
        int i11 = this.f35599m;
        int[] iArr = this.f35598l;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f35598l = Arrays.copyOf(iArr, i12);
            this.f35601o = Arrays.copyOf(this.f35601o, i12);
            this.f35600n = (String[]) Arrays.copyOf(this.f35600n, i12);
        }
        int[] iArr2 = this.f35598l;
        int i13 = this.f35599m;
        this.f35599m = i13 + 1;
        iArr2[i13] = i10;
    }

    private char I() {
        int i10;
        if (this.f35590d == this.f35591e && !i(1)) {
            throw y0("Unterminated escape sequence");
        }
        char[] cArr = this.f35589c;
        int i11 = this.f35590d;
        int i12 = i11 + 1;
        this.f35590d = i12;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f35592f++;
            this.f35593g = i12;
        } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
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
                throw y0("Invalid escape sequence");
            }
            if (i11 + 5 > this.f35591e && !i(4)) {
                throw y0("Unterminated escape sequence");
            }
            int i13 = this.f35590d;
            int i14 = i13 + 4;
            char c11 = 0;
            while (i13 < i14) {
                char c12 = this.f35589c[i13];
                char c13 = (char) (c11 << 4);
                if (c12 >= '0' && c12 <= '9') {
                    i10 = c12 - '0';
                } else if (c12 >= 'a' && c12 <= 'f') {
                    i10 = c12 - 'W';
                } else {
                    if (c12 < 'A' || c12 > 'F') {
                        throw new NumberFormatException("\\u" + new String(this.f35589c, this.f35590d, 4));
                    }
                    i10 = c12 - '7';
                }
                c11 = (char) (c13 + i10);
                i13++;
            }
            this.f35590d += 4;
            return c11;
        }
        return c10;
    }

    private void K(char c10) {
        char[] cArr = this.f35589c;
        do {
            int i10 = this.f35590d;
            int i11 = this.f35591e;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f35590d = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f35590d = i12;
                    I();
                    i10 = this.f35590d;
                    i11 = this.f35591e;
                } else {
                    if (c11 == '\n') {
                        this.f35592f++;
                        this.f35593g = i12;
                    }
                    i10 = i12;
                }
            }
            this.f35590d = i10;
        } while (i(1));
        throw y0("Unterminated string");
    }

    private boolean N(String str) {
        int length = str.length();
        while (true) {
            if (this.f35590d + length > this.f35591e && !i(length)) {
                return false;
            }
            char[] cArr = this.f35589c;
            int i10 = this.f35590d;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f35589c[this.f35590d + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f35592f++;
            this.f35593g = i10 + 1;
            this.f35590d++;
        }
    }

    private void Q() {
        char c10;
        do {
            if (this.f35590d >= this.f35591e && !i(1)) {
                return;
            }
            char[] cArr = this.f35589c;
            int i10 = this.f35590d;
            int i11 = i10 + 1;
            this.f35590d = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f35592f++;
                this.f35593g = i11;
                return;
            }
        } while (c10 != '\r');
    }

    private void c() {
        if (!this.f35588b) {
            throw y0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void d() {
        s(true);
        int i10 = this.f35590d;
        int i11 = i10 - 1;
        this.f35590d = i11;
        if (i10 + 4 <= this.f35591e || i(5)) {
            char[] cArr = this.f35589c;
            if (cArr[i11] == ')' && cArr[i10] == ']' && cArr[i10 + 1] == '}' && cArr[i10 + 2] == '\'' && cArr[i10 + 3] == '\n') {
                this.f35590d += 5;
            }
        }
    }

    private boolean i(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f35589c;
        int i13 = this.f35593g;
        int i14 = this.f35590d;
        this.f35593g = i13 - i14;
        int i15 = this.f35591e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f35591e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f35591e = 0;
        }
        this.f35590d = 0;
        do {
            Reader reader = this.f35587a;
            int i17 = this.f35591e;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f35591e + read;
            this.f35591e = i11;
            if (this.f35592f == 0 && (i12 = this.f35593g) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f35590d++;
                this.f35593g = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i0() {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f35590d;
                if (i11 + i10 < this.f35591e) {
                    char c10 = this.f35589c[i11 + i10];
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
                    this.f35590d = i11 + i10;
                }
            }
            this.f35590d += i10;
            return;
        } while (i(1));
    }

    private boolean j(char c10) {
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
        c();
        return false;
    }

    private int s(boolean z10) {
        char[] cArr = this.f35589c;
        int i10 = this.f35590d;
        int i11 = this.f35591e;
        while (true) {
            if (i10 == i11) {
                this.f35590d = i10;
                if (!i(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + l());
                }
                i10 = this.f35590d;
                i11 = this.f35591e;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f35592f++;
                this.f35593g = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f35590d = i12;
                    if (i12 == i11) {
                        this.f35590d = i10;
                        boolean i13 = i(2);
                        this.f35590d++;
                        if (!i13) {
                            return c10;
                        }
                    }
                    c();
                    int i14 = this.f35590d;
                    char c11 = cArr[i14];
                    if (c11 == '*') {
                        this.f35590d = i14 + 1;
                        if (!N("*/")) {
                            throw y0("Unterminated comment");
                        }
                        i10 = this.f35590d + 2;
                        i11 = this.f35591e;
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f35590d = i14 + 1;
                        Q();
                        i10 = this.f35590d;
                        i11 = this.f35591e;
                    }
                } else {
                    if (c10 != '#') {
                        this.f35590d = i12;
                        return c10;
                    }
                    this.f35590d = i12;
                    c();
                    Q();
                    i10 = this.f35590d;
                    i11 = this.f35591e;
                }
            }
            i10 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f35590d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String u(char c10) {
        char[] cArr = this.f35589c;
        StringBuilder sb2 = null;
        do {
            int i10 = this.f35590d;
            int i11 = this.f35591e;
            while (true) {
                int i12 = i11;
                int i13 = i10;
                while (i10 < i12) {
                    int i14 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f35590d = i14;
                        int i15 = (i14 - i13) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i13, i15);
                        }
                        sb2.append(cArr, i13, i15);
                        return sb2.toString();
                    }
                    if (c11 == '\\') {
                        this.f35590d = i14;
                        int i16 = i14 - i13;
                        int i17 = i16 - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max(i16 * 2, 16));
                        }
                        sb2.append(cArr, i13, i17);
                        sb2.append(I());
                        i10 = this.f35590d;
                        i11 = this.f35591e;
                    } else {
                        if (c11 == '\n') {
                            this.f35592f++;
                            this.f35593g = i14;
                        }
                        i10 = i14;
                    }
                }
                break;
            }
        } while (i(1));
        throw y0("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String y() {
        String sb2;
        StringBuilder sb3 = null;
        int i10 = 0;
        do {
            int i11 = 0;
            while (true) {
                int i12 = this.f35590d;
                if (i12 + i11 < this.f35591e) {
                    char c10 = this.f35589c[i12 + i11];
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
                } else if (i11 >= this.f35589c.length) {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb3.append(this.f35589c, this.f35590d, i11);
                    this.f35590d += i11;
                } else if (i(i11 + 1)) {
                }
            }
            i10 = i11;
            if (sb3 != null) {
                sb2 = new String(this.f35589c, this.f35590d, i10);
            } else {
                sb3.append(this.f35589c, this.f35590d, i10);
                sb2 = sb3.toString();
            }
            this.f35590d += i10;
            return sb2;
        } while (i(1));
        if (sb3 != null) {
        }
        this.f35590d += i10;
        return sb2;
    }

    private IOException y0(String str) {
        throw new d(str + l());
    }

    public String J() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = this.f35599m;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f35598l[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(this.f35601o[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f35600n[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public void a() {
        int i10 = this.f35594h;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 3) {
            H(1);
            this.f35601o[this.f35599m - 1] = 0;
            this.f35594h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + z() + l());
        }
    }

    public void b() {
        int i10 = this.f35594h;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 1) {
            H(3);
            this.f35594h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + z() + l());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f35594h = 0;
        this.f35598l[0] = 8;
        this.f35599m = 1;
        this.f35587a.close();
    }

    int e() {
        int s10;
        int[] iArr = this.f35598l;
        int i10 = this.f35599m;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int s11 = s(true);
            if (s11 != 44) {
                if (s11 != 59) {
                    if (s11 != 93) {
                        throw y0("Unterminated array");
                    }
                    this.f35594h = 4;
                    return 4;
                }
                c();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (s10 = s(true)) != 44) {
                    if (s10 != 59) {
                        if (s10 != 125) {
                            throw y0("Unterminated object");
                        }
                        this.f35594h = 2;
                        return 2;
                    }
                    c();
                }
                int s12 = s(true);
                if (s12 == 34) {
                    this.f35594h = 13;
                    return 13;
                }
                if (s12 == 39) {
                    c();
                    this.f35594h = 12;
                    return 12;
                }
                if (s12 == 125) {
                    if (i11 == 5) {
                        throw y0("Expected name");
                    }
                    this.f35594h = 2;
                    return 2;
                }
                c();
                this.f35590d--;
                if (!j((char) s12)) {
                    throw y0("Expected name");
                }
                this.f35594h = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int s13 = s(true);
                if (s13 != 58) {
                    if (s13 != 61) {
                        throw y0("Expected ':'");
                    }
                    c();
                    if (this.f35590d < this.f35591e || i(1)) {
                        char[] cArr = this.f35589c;
                        int i12 = this.f35590d;
                        if (cArr[i12] == '>') {
                            this.f35590d = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f35588b) {
                    d();
                }
                this.f35598l[this.f35599m - 1] = 7;
            } else if (i11 == 7) {
                if (s(false) == -1) {
                    this.f35594h = 17;
                    return 17;
                }
                c();
                this.f35590d--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int s14 = s(true);
        if (s14 == 34) {
            this.f35594h = 9;
            return 9;
        }
        if (s14 == 39) {
            c();
            this.f35594h = 8;
            return 8;
        }
        if (s14 != 44 && s14 != 59) {
            if (s14 == 91) {
                this.f35594h = 3;
                return 3;
            }
            if (s14 != 93) {
                if (s14 == 123) {
                    this.f35594h = 1;
                    return 1;
                }
                this.f35590d--;
                int C10 = C();
                if (C10 != 0) {
                    return C10;
                }
                int F10 = F();
                if (F10 != 0) {
                    return F10;
                }
                if (!j(this.f35589c[this.f35590d])) {
                    throw y0("Expected value");
                }
                c();
                this.f35594h = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f35594h = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw y0("Unexpected value");
        }
        c();
        this.f35590d--;
        this.f35594h = 7;
        return 7;
    }

    public void f() {
        int i10 = this.f35594h;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + z() + l());
        }
        int i11 = this.f35599m;
        this.f35599m = i11 - 1;
        int[] iArr = this.f35601o;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f35594h = 0;
    }

    public void g() {
        int i10 = this.f35594h;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + z() + l());
        }
        int i11 = this.f35599m;
        int i12 = i11 - 1;
        this.f35599m = i12;
        this.f35600n[i12] = null;
        int[] iArr = this.f35601o;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f35594h = 0;
    }

    String l() {
        return " at line " + (this.f35592f + 1) + " column " + ((this.f35590d - this.f35593g) + 1) + " path " + J();
    }

    public boolean n() {
        int i10 = this.f35594h;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 5) {
            this.f35594h = 0;
            int[] iArr = this.f35601o;
            int i11 = this.f35599m - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f35594h = 0;
            int[] iArr2 = this.f35601o;
            int i12 = this.f35599m - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + z() + l());
    }

    public double o() {
        int i10 = this.f35594h;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 15) {
            this.f35594h = 0;
            int[] iArr = this.f35601o;
            int i11 = this.f35599m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f35595i;
        }
        if (i10 == 16) {
            this.f35597k = new String(this.f35589c, this.f35590d, this.f35596j);
            this.f35590d += this.f35596j;
        } else if (i10 == 8 || i10 == 9) {
            this.f35597k = u(i10 == 8 ? '\'' : '\"');
        } else if (i10 == 10) {
            this.f35597k = y();
        } else if (i10 != 11) {
            throw new IllegalStateException("Expected a double but was " + z() + l());
        }
        this.f35594h = 11;
        double parseDouble = Double.parseDouble(this.f35597k);
        if (!this.f35588b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + l());
        }
        this.f35597k = null;
        this.f35594h = 0;
        int[] iArr2 = this.f35601o;
        int i12 = this.f35599m - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    public void o0() {
        int i10 = 0;
        do {
            int i11 = this.f35594h;
            if (i11 == 0) {
                i11 = e();
            }
            if (i11 == 3) {
                H(1);
            } else if (i11 == 1) {
                H(3);
            } else {
                if (i11 == 4) {
                    this.f35599m--;
                } else if (i11 == 2) {
                    this.f35599m--;
                } else {
                    if (i11 == 14 || i11 == 10) {
                        i0();
                    } else if (i11 == 8 || i11 == 12) {
                        K('\'');
                    } else if (i11 == 9 || i11 == 13) {
                        K('\"');
                    } else if (i11 == 16) {
                        this.f35590d += this.f35596j;
                    }
                    this.f35594h = 0;
                }
                i10--;
                this.f35594h = 0;
            }
            i10++;
            this.f35594h = 0;
        } while (i10 != 0);
        int[] iArr = this.f35601o;
        int i12 = this.f35599m;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f35600n[i12 - 1] = "null";
    }

    public int p() {
        int i10 = this.f35594h;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 15) {
            long j10 = this.f35595i;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f35594h = 0;
                int[] iArr = this.f35601o;
                int i12 = this.f35599m - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f35595i + l());
        }
        if (i10 == 16) {
            this.f35597k = new String(this.f35589c, this.f35590d, this.f35596j);
            this.f35590d += this.f35596j;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw new IllegalStateException("Expected an int but was " + z() + l());
            }
            if (i10 == 10) {
                this.f35597k = y();
            } else {
                this.f35597k = u(i10 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f35597k);
                this.f35594h = 0;
                int[] iArr2 = this.f35601o;
                int i13 = this.f35599m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f35594h = 11;
        double parseDouble = Double.parseDouble(this.f35597k);
        int i14 = (int) parseDouble;
        if (i14 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f35597k + l());
        }
        this.f35597k = null;
        this.f35594h = 0;
        int[] iArr3 = this.f35601o;
        int i15 = this.f35599m - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long q() {
        int i10 = this.f35594h;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 15) {
            this.f35594h = 0;
            int[] iArr = this.f35601o;
            int i11 = this.f35599m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f35595i;
        }
        if (i10 == 16) {
            this.f35597k = new String(this.f35589c, this.f35590d, this.f35596j);
            this.f35590d += this.f35596j;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw new IllegalStateException("Expected a long but was " + z() + l());
            }
            if (i10 == 10) {
                this.f35597k = y();
            } else {
                this.f35597k = u(i10 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f35597k);
                this.f35594h = 0;
                int[] iArr2 = this.f35601o;
                int i12 = this.f35599m - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f35594h = 11;
        double parseDouble = Double.parseDouble(this.f35597k);
        long j10 = (long) parseDouble;
        if (j10 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f35597k + l());
        }
        this.f35597k = null;
        this.f35594h = 0;
        int[] iArr3 = this.f35601o;
        int i13 = this.f35599m - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return j10;
    }

    public String r() {
        String u10;
        int i10 = this.f35594h;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 14) {
            u10 = y();
        } else if (i10 == 12) {
            u10 = u('\'');
        } else {
            if (i10 != 13) {
                throw new IllegalStateException("Expected a name but was " + z() + l());
            }
            u10 = u('\"');
        }
        this.f35594h = 0;
        this.f35600n[this.f35599m - 1] = u10;
        return u10;
    }

    public void t() {
        int i10 = this.f35594h;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 7) {
            this.f35594h = 0;
            int[] iArr = this.f35601o;
            int i11 = this.f35599m - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + z() + l());
    }

    public String toString() {
        return getClass().getSimpleName() + l();
    }

    public String x() {
        String str;
        int i10 = this.f35594h;
        if (i10 == 0) {
            i10 = e();
        }
        if (i10 == 10) {
            str = y();
        } else if (i10 == 8) {
            str = u('\'');
        } else if (i10 == 9) {
            str = u('\"');
        } else if (i10 == 11) {
            str = this.f35597k;
            this.f35597k = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f35595i);
        } else {
            if (i10 != 16) {
                throw new IllegalStateException("Expected a string but was " + z() + l());
            }
            str = new String(this.f35589c, this.f35590d, this.f35596j);
            this.f35590d += this.f35596j;
        }
        this.f35594h = 0;
        int[] iArr = this.f35601o;
        int i11 = this.f35599m - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public b z() {
        int i10 = this.f35594h;
        if (i10 == 0) {
            i10 = e();
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
}
