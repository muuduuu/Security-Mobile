package a2;

import a2.AbstractC1346c;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.io.EOFException;
import pe.C3877e;
import pe.C3880h;
import pe.InterfaceC3879g;

/* loaded from: classes.dex */
final class e extends AbstractC1346c {

    /* renamed from: n, reason: collision with root package name */
    private static final C3880h f12557n = C3880h.n("'\\");

    /* renamed from: o, reason: collision with root package name */
    private static final C3880h f12558o = C3880h.n("\"\\");

    /* renamed from: p, reason: collision with root package name */
    private static final C3880h f12559p = C3880h.n("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: q, reason: collision with root package name */
    private static final C3880h f12560q = C3880h.n("\n\r");

    /* renamed from: r, reason: collision with root package name */
    private static final C3880h f12561r = C3880h.n("*/");

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3879g f12562h;

    /* renamed from: i, reason: collision with root package name */
    private final C3877e f12563i;

    /* renamed from: j, reason: collision with root package name */
    private int f12564j = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f12565k;

    /* renamed from: l, reason: collision with root package name */
    private int f12566l;

    /* renamed from: m, reason: collision with root package name */
    private String f12567m;

    e(InterfaceC3879g interfaceC3879g) {
        if (interfaceC3879g == null) {
            throw new NullPointerException("source == null");
        }
        this.f12562h = interfaceC3879g;
        this.f12563i = interfaceC3879g.X();
        q(6);
    }

    private void A0() {
        long W02 = this.f12562h.W0(f12559p);
        C3877e c3877e = this.f12563i;
        if (W02 == -1) {
            W02 = c3877e.size();
        }
        c3877e.skip(W02);
    }

    private int C(String str, AbstractC1346c.a aVar) {
        int length = aVar.f12555a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f12555a[i10])) {
                this.f12564j = 0;
                this.f12551c[this.f12549a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    private boolean F(int i10) {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        y();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.f12563i.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2 != 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        y();
        z0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r6.f12562h.n1(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        y();
        r3 = r6.f12563i.p(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r3 == 42) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r6.f12563i.readByte();
        r6.f12563i.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (y0() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw x("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r6.f12563i.readByte();
        r6.f12563i.readByte();
        z0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0039, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int H(boolean z10) {
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (!this.f12562h.n1(i11)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                byte p10 = this.f12563i.p(i10);
                if (p10 != 10 && p10 != 32 && p10 != 13 && p10 != 9) {
                    break;
                }
                i10 = i11;
            }
        }
    }

    private String I(C3880h c3880h) {
        StringBuilder sb2 = null;
        while (true) {
            long W02 = this.f12562h.W0(c3880h);
            if (W02 == -1) {
                throw x("Unterminated string");
            }
            if (this.f12563i.p(W02) != 92) {
                if (sb2 == null) {
                    String R10 = this.f12563i.R(W02);
                    this.f12563i.readByte();
                    return R10;
                }
                sb2.append(this.f12563i.R(W02));
                this.f12563i.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f12563i.R(W02));
            this.f12563i.readByte();
            sb2.append(i0());
        }
    }

    private String K() {
        long W02 = this.f12562h.W0(f12559p);
        return W02 != -1 ? this.f12563i.R(W02) : this.f12563i.F1();
    }

    private int N() {
        String str;
        String str2;
        int i10;
        byte p10 = this.f12563i.p(0L);
        if (p10 == 116 || p10 == 84) {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (p10 == 102 || p10 == 70) {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (p10 != 110 && p10 != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.f12562h.n1(i12)) {
                return 0;
            }
            byte p11 = this.f12563i.p(i11);
            if (p11 != str.charAt(i11) && p11 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f12562h.n1(length + 1) && F(this.f12563i.p(length))) {
            return 0;
        }
        this.f12563i.skip(length);
        this.f12564j = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
    
        if (F(r11) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if (r6 != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0085, code lost:
    
        if (r7 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008b, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0091, code lost:
    
        if (r8 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0093, code lost:
    
        if (r10 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0095, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0098, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0099, code lost:
    
        r16.f12565k = r8;
        r16.f12563i.skip(r5);
        r16.f12564j = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a6, code lost:
    
        if (r6 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a9, code lost:
    
        if (r6 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ac, code lost:
    
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00af, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b0, code lost:
    
        r16.f12566l = r5;
        r16.f12564j = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b6, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int Q() {
        char c10;
        boolean z10 = true;
        long j10 = 0;
        int i10 = 0;
        char c11 = 0;
        boolean z11 = false;
        boolean z12 = true;
        while (true) {
            int i11 = i10 + 1;
            if (!this.f12562h.n1(i11)) {
                break;
            }
            byte p10 = this.f12563i.p(i10);
            if (p10 != 43) {
                if (p10 == 69 || p10 == 101) {
                    if (c11 != 2 && c11 != 4) {
                        return 0;
                    }
                    c11 = 5;
                } else if (p10 == 45) {
                    c10 = 6;
                    if (c11 == 0) {
                        c11 = 1;
                        z11 = true;
                    } else if (c11 != 5) {
                        return 0;
                    }
                } else if (p10 != 46) {
                    if (p10 < 48 || p10 > 57) {
                        break;
                    }
                    if (c11 == z10 || c11 == 0) {
                        j10 = -(p10 - 48);
                        c11 = 2;
                    } else if (c11 == 2) {
                        if (j10 == 0) {
                            return 0;
                        }
                        long j11 = (10 * j10) - (p10 - 48);
                        z12 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                        j10 = j11;
                    } else if (c11 == 3) {
                        c11 = 4;
                    } else if (c11 == 5 || c11 == 6) {
                        c11 = 7;
                    }
                } else {
                    if (c11 != 2) {
                        return 0;
                    }
                    c11 = 3;
                }
                i10 = i11;
                z10 = true;
            } else {
                c10 = 6;
                if (c11 != 5) {
                    return 0;
                }
            }
            c11 = c10;
            i10 = i11;
            z10 = true;
        }
    }

    private char i0() {
        int i10;
        if (!this.f12562h.n1(1L)) {
            throw x("Unterminated escape sequence");
        }
        byte readByte = this.f12563i.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            if (this.f12553e) {
                return (char) readByte;
            }
            throw x("Invalid escape sequence: \\" + ((char) readByte));
        }
        if (!this.f12562h.n1(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + J());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte p10 = this.f12563i.p(i11);
            char c11 = (char) (c10 << 4);
            if (p10 >= 48 && p10 <= 57) {
                i10 = p10 - 48;
            } else if (p10 >= 97 && p10 <= 102) {
                i10 = p10 - 87;
            } else {
                if (p10 < 65 || p10 > 70) {
                    throw x("\\u" + this.f12563i.R(4L));
                }
                i10 = p10 - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f12563i.skip(4L);
        return c10;
    }

    private void o0(C3880h c3880h) {
        while (true) {
            long W02 = this.f12562h.W0(c3880h);
            if (W02 == -1) {
                throw x("Unterminated string");
            }
            if (this.f12563i.p(W02) != 92) {
                this.f12563i.skip(W02 + 1);
                return;
            } else {
                this.f12563i.skip(W02 + 1);
                i0();
            }
        }
    }

    private void y() {
        if (!this.f12553e) {
            throw x("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private boolean y0() {
        long O10 = this.f12562h.O(f12561r);
        boolean z10 = O10 != -1;
        C3877e c3877e = this.f12563i;
        c3877e.skip(z10 ? O10 + r1.L() : c3877e.size());
        return z10;
    }

    private int z() {
        int[] iArr = this.f12550b;
        int i10 = this.f12549a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int H10 = H(true);
            this.f12563i.readByte();
            if (H10 != 44) {
                if (H10 != 59) {
                    if (H10 != 93) {
                        throw x("Unterminated array");
                    }
                    this.f12564j = 4;
                    return 4;
                }
                y();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int H11 = H(true);
                    this.f12563i.readByte();
                    if (H11 != 44) {
                        if (H11 != 59) {
                            if (H11 != 125) {
                                throw x("Unterminated object");
                            }
                            this.f12564j = 2;
                            return 2;
                        }
                        y();
                    }
                }
                int H12 = H(true);
                if (H12 == 34) {
                    this.f12563i.readByte();
                    this.f12564j = 13;
                    return 13;
                }
                if (H12 == 39) {
                    this.f12563i.readByte();
                    y();
                    this.f12564j = 12;
                    return 12;
                }
                if (H12 != 125) {
                    y();
                    if (!F((char) H12)) {
                        throw x("Expected name");
                    }
                    this.f12564j = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw x("Expected name");
                }
                this.f12563i.readByte();
                this.f12564j = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int H13 = H(true);
                this.f12563i.readByte();
                if (H13 != 58) {
                    if (H13 != 61) {
                        throw x("Expected ':'");
                    }
                    y();
                    if (this.f12562h.n1(1L) && this.f12563i.p(0L) == 62) {
                        this.f12563i.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (H(false) == -1) {
                    this.f12564j = 18;
                    return 18;
                }
                y();
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int H14 = H(true);
        if (H14 == 34) {
            this.f12563i.readByte();
            this.f12564j = 9;
            return 9;
        }
        if (H14 == 39) {
            y();
            this.f12563i.readByte();
            this.f12564j = 8;
            return 8;
        }
        if (H14 != 44 && H14 != 59) {
            if (H14 == 91) {
                this.f12563i.readByte();
                this.f12564j = 3;
                return 3;
            }
            if (H14 != 93) {
                if (H14 == 123) {
                    this.f12563i.readByte();
                    this.f12564j = 1;
                    return 1;
                }
                int N10 = N();
                if (N10 != 0) {
                    return N10;
                }
                int Q10 = Q();
                if (Q10 != 0) {
                    return Q10;
                }
                if (!F(this.f12563i.p(0L))) {
                    throw x("Expected value");
                }
                y();
                this.f12564j = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f12563i.readByte();
                this.f12564j = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw x("Unexpected value");
        }
        y();
        this.f12564j = 7;
        return 7;
    }

    private void z0() {
        long W02 = this.f12562h.W0(f12560q);
        C3877e c3877e = this.f12563i;
        c3877e.skip(W02 != -1 ? W02 + 1 : c3877e.size());
    }

    @Override // a2.AbstractC1346c
    public void b() {
        int i10 = this.f12564j;
        if (i10 == 0) {
            i10 = z();
        }
        if (i10 == 3) {
            q(1);
            this.f12552d[this.f12549a - 1] = 0;
            this.f12564j = 0;
        } else {
            throw new C1344a("Expected BEGIN_ARRAY but was " + p() + " at path " + J());
        }
    }

    @Override // a2.AbstractC1346c
    public void c() {
        int i10 = this.f12564j;
        if (i10 == 0) {
            i10 = z();
        }
        if (i10 == 1) {
            q(3);
            this.f12564j = 0;
            return;
        }
        throw new C1344a("Expected BEGIN_OBJECT but was " + p() + " at path " + J());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12564j = 0;
        this.f12550b[0] = 8;
        this.f12549a = 1;
        this.f12563i.a();
        this.f12562h.close();
    }

    @Override // a2.AbstractC1346c
    public void d() {
        int i10 = this.f12564j;
        if (i10 == 0) {
            i10 = z();
        }
        if (i10 != 4) {
            throw new C1344a("Expected END_ARRAY but was " + p() + " at path " + J());
        }
        int i11 = this.f12549a;
        this.f12549a = i11 - 1;
        int[] iArr = this.f12552d;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f12564j = 0;
    }

    @Override // a2.AbstractC1346c
    public void e() {
        int i10 = this.f12564j;
        if (i10 == 0) {
            i10 = z();
        }
        if (i10 != 2) {
            throw new C1344a("Expected END_OBJECT but was " + p() + " at path " + J());
        }
        int i11 = this.f12549a;
        int i12 = i11 - 1;
        this.f12549a = i12;
        this.f12551c[i12] = null;
        int[] iArr = this.f12552d;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f12564j = 0;
    }

    @Override // a2.AbstractC1346c
    public boolean f() {
        int i10 = this.f12564j;
        if (i10 == 0) {
            i10 = z();
        }
        return (i10 == 2 || i10 == 4 || i10 == 18) ? false : true;
    }

    @Override // a2.AbstractC1346c
    public boolean g() {
        int i10 = this.f12564j;
        if (i10 == 0) {
            i10 = z();
        }
        if (i10 == 5) {
            this.f12564j = 0;
            int[] iArr = this.f12552d;
            int i11 = this.f12549a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f12564j = 0;
            int[] iArr2 = this.f12552d;
            int i12 = this.f12549a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new C1344a("Expected a boolean but was " + p() + " at path " + J());
    }

    @Override // a2.AbstractC1346c
    public double i() {
        int i10 = this.f12564j;
        if (i10 == 0) {
            i10 = z();
        }
        if (i10 == 16) {
            this.f12564j = 0;
            int[] iArr = this.f12552d;
            int i11 = this.f12549a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f12565k;
        }
        if (i10 == 17) {
            this.f12567m = this.f12563i.R(this.f12566l);
        } else if (i10 == 9) {
            this.f12567m = I(f12558o);
        } else if (i10 == 8) {
            this.f12567m = I(f12557n);
        } else if (i10 == 10) {
            this.f12567m = K();
        } else if (i10 != 11) {
            throw new C1344a("Expected a double but was " + p() + " at path " + J());
        }
        this.f12564j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f12567m);
            if (this.f12553e || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                this.f12567m = null;
                this.f12564j = 0;
                int[] iArr2 = this.f12552d;
                int i12 = this.f12549a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseDouble;
            }
            throw new C1345b("JSON forbids NaN and infinities: " + parseDouble + " at path " + J());
        } catch (NumberFormatException unused) {
            throw new C1344a("Expected a double but was " + this.f12567m + " at path " + J());
        }
    }

    @Override // a2.AbstractC1346c
    public int j() {
        int i10 = this.f12564j;
        if (i10 == 0) {
            i10 = z();
        }
        if (i10 == 16) {
            long j10 = this.f12565k;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f12564j = 0;
                int[] iArr = this.f12552d;
                int i12 = this.f12549a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new C1344a("Expected an int but was " + this.f12565k + " at path " + J());
        }
        if (i10 == 17) {
            this.f12567m = this.f12563i.R(this.f12566l);
        } else if (i10 == 9 || i10 == 8) {
            String I10 = i10 == 9 ? I(f12558o) : I(f12557n);
            this.f12567m = I10;
            try {
                int parseInt = Integer.parseInt(I10);
                this.f12564j = 0;
                int[] iArr2 = this.f12552d;
                int i13 = this.f12549a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            throw new C1344a("Expected an int but was " + p() + " at path " + J());
        }
        this.f12564j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f12567m);
            int i14 = (int) parseDouble;
            if (i14 == parseDouble) {
                this.f12567m = null;
                this.f12564j = 0;
                int[] iArr3 = this.f12552d;
                int i15 = this.f12549a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new C1344a("Expected an int but was " + this.f12567m + " at path " + J());
        } catch (NumberFormatException unused2) {
            throw new C1344a("Expected an int but was " + this.f12567m + " at path " + J());
        }
    }

    @Override // a2.AbstractC1346c
    public String l() {
        String str;
        int i10 = this.f12564j;
        if (i10 == 0) {
            i10 = z();
        }
        if (i10 == 14) {
            str = K();
        } else if (i10 == 13) {
            str = I(f12558o);
        } else if (i10 == 12) {
            str = I(f12557n);
        } else {
            if (i10 != 15) {
                throw new C1344a("Expected a name but was " + p() + " at path " + J());
            }
            str = this.f12567m;
        }
        this.f12564j = 0;
        this.f12551c[this.f12549a - 1] = str;
        return str;
    }

    @Override // a2.AbstractC1346c
    public String n() {
        String R10;
        int i10 = this.f12564j;
        if (i10 == 0) {
            i10 = z();
        }
        if (i10 == 10) {
            R10 = K();
        } else if (i10 == 9) {
            R10 = I(f12558o);
        } else if (i10 == 8) {
            R10 = I(f12557n);
        } else if (i10 == 11) {
            R10 = this.f12567m;
            this.f12567m = null;
        } else if (i10 == 16) {
            R10 = Long.toString(this.f12565k);
        } else {
            if (i10 != 17) {
                throw new C1344a("Expected a string but was " + p() + " at path " + J());
            }
            R10 = this.f12563i.R(this.f12566l);
        }
        this.f12564j = 0;
        int[] iArr = this.f12552d;
        int i11 = this.f12549a - 1;
        iArr[i11] = iArr[i11] + 1;
        return R10;
    }

    @Override // a2.AbstractC1346c
    public AbstractC1346c.b p() {
        int i10 = this.f12564j;
        if (i10 == 0) {
            i10 = z();
        }
        switch (i10) {
            case 1:
                return AbstractC1346c.b.BEGIN_OBJECT;
            case 2:
                return AbstractC1346c.b.END_OBJECT;
            case 3:
                return AbstractC1346c.b.BEGIN_ARRAY;
            case 4:
                return AbstractC1346c.b.END_ARRAY;
            case 5:
            case 6:
                return AbstractC1346c.b.BOOLEAN;
            case 7:
                return AbstractC1346c.b.NULL;
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                return AbstractC1346c.b.STRING;
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return AbstractC1346c.b.NAME;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return AbstractC1346c.b.NUMBER;
            case 18:
                return AbstractC1346c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // a2.AbstractC1346c
    public int r(AbstractC1346c.a aVar) {
        int i10 = this.f12564j;
        if (i10 == 0) {
            i10 = z();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return C(this.f12567m, aVar);
        }
        int k12 = this.f12562h.k1(aVar.f12556b);
        if (k12 != -1) {
            this.f12564j = 0;
            this.f12551c[this.f12549a - 1] = aVar.f12555a[k12];
            return k12;
        }
        String str = this.f12551c[this.f12549a - 1];
        String l10 = l();
        int C10 = C(l10, aVar);
        if (C10 == -1) {
            this.f12564j = 15;
            this.f12567m = l10;
            this.f12551c[this.f12549a - 1] = str;
        }
        return C10;
    }

    @Override // a2.AbstractC1346c
    public void s() {
        if (this.f12554f) {
            throw new C1344a("Cannot skip unexpected " + p() + " at " + J());
        }
        int i10 = this.f12564j;
        if (i10 == 0) {
            i10 = z();
        }
        if (i10 == 14) {
            A0();
        } else if (i10 == 13) {
            o0(f12558o);
        } else if (i10 == 12) {
            o0(f12557n);
        } else if (i10 != 15) {
            throw new C1344a("Expected a name but was " + p() + " at path " + J());
        }
        this.f12564j = 0;
        this.f12551c[this.f12549a - 1] = "null";
    }

    @Override // a2.AbstractC1346c
    public void t() {
        if (this.f12554f) {
            throw new C1344a("Cannot skip unexpected " + p() + " at " + J());
        }
        int i10 = 0;
        do {
            int i11 = this.f12564j;
            if (i11 == 0) {
                i11 = z();
            }
            if (i11 == 3) {
                q(1);
            } else if (i11 == 1) {
                q(3);
            } else {
                if (i11 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new C1344a("Expected a value but was " + p() + " at path " + J());
                    }
                    this.f12549a--;
                } else if (i11 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new C1344a("Expected a value but was " + p() + " at path " + J());
                    }
                    this.f12549a--;
                } else if (i11 == 14 || i11 == 10) {
                    A0();
                } else if (i11 == 9 || i11 == 13) {
                    o0(f12558o);
                } else if (i11 == 8 || i11 == 12) {
                    o0(f12557n);
                } else if (i11 == 17) {
                    this.f12563i.skip(this.f12566l);
                } else if (i11 == 18) {
                    throw new C1344a("Expected a value but was " + p() + " at path " + J());
                }
                this.f12564j = 0;
            }
            i10++;
            this.f12564j = 0;
        } while (i10 != 0);
        int[] iArr = this.f12552d;
        int i12 = this.f12549a;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f12551c[i12 - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.f12562h + ")";
    }
}
