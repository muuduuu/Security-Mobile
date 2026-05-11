package y5;

import C5.j;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f45333a = AbstractC5174a.c();

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f45334b = AbstractC5174a.b();

    /* renamed from: c, reason: collision with root package name */
    private static final d f45335c = new d();

    private int a(int i10, char[] cArr) {
        cArr[1] = (char) i10;
        return 2;
    }

    private int b(int i10, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = f45333a;
        cArr[4] = cArr2[i10 >> 4];
        cArr[5] = cArr2[i10 & 15];
        return 6;
    }

    static int c(int i10) {
        return Math.min(Math.max(16, i10 + Math.min((i10 >> 3) + 6, 1000)), 32000);
    }

    private char[] d() {
        return new char[]{'\\', 0, '0', '0', 0, 0};
    }

    public static d e() {
        return f45335c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r9 = r7 + 1;
        r7 = r13.charAt(r7);
        r10 = r2[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r10 >= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r7 = b(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r10 = r8 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r10 <= r1.length) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r10 = r1.length - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r10 <= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        java.lang.System.arraycopy(r6, 0, r1, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r5 = C5.j.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        r1 = r5.j();
        r7 = r7 - r10;
        java.lang.System.arraycopy(r6, r10, r1, 0, r7);
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        java.lang.System.arraycopy(r6, 0, r1, r8, r7);
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
    
        r7 = a(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r6 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r6 = d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public char[] f(String str) {
        int i10;
        int length = str.length();
        char[] cArr = new char[c(length)];
        int[] d10 = AbstractC5174a.d();
        int length2 = d10.length;
        j jVar = null;
        int i11 = 0;
        int i12 = 0;
        char[] cArr2 = null;
        loop0: while (true) {
            if (i11 >= length) {
                break;
            }
            while (true) {
                char charAt = str.charAt(i11);
                if (charAt < length2 && d10[charAt] != 0) {
                    break;
                }
                if (i12 >= cArr.length) {
                    if (jVar == null) {
                        jVar = j.k(cArr);
                    }
                    cArr = jVar.j();
                    i12 = 0;
                }
                int i13 = i12 + 1;
                cArr[i12] = charAt;
                i11++;
                if (i11 >= length) {
                    i12 = i13;
                    break loop0;
                }
                i12 = i13;
            }
            i11 = i10;
        }
        if (jVar == null) {
            return Arrays.copyOfRange(cArr, 0, i12);
        }
        jVar.n(i12);
        return jVar.g();
    }
}
