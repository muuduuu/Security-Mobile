package com.fasterxml.jackson.core;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final transient int[] f23114a;

    /* renamed from: b, reason: collision with root package name */
    private final transient char[] f23115b;

    /* renamed from: c, reason: collision with root package name */
    private final transient byte[] f23116c;

    /* renamed from: d, reason: collision with root package name */
    final String f23117d;

    /* renamed from: e, reason: collision with root package name */
    private final char f23118e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23119f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f23120g;

    /* renamed from: h, reason: collision with root package name */
    private final EnumC0391a f23121h;

    /* renamed from: com.fasterxml.jackson.core.a$a, reason: collision with other inner class name */
    public enum EnumC0391a {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public a(String str, String str2, boolean z10, char c10, int i10) {
        int[] iArr = new int[128];
        this.f23114a = iArr;
        char[] cArr = new char[64];
        this.f23115b = cArr;
        this.f23116c = new byte[64];
        this.f23117d = str;
        this.f23120g = z10;
        this.f23118e = c10;
        this.f23119f = i10;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < length; i11++) {
            char c11 = this.f23115b[i11];
            this.f23116c[i11] = (byte) c11;
            this.f23114a[c11] = i11;
        }
        if (z10) {
            this.f23114a[c10] = -2;
        }
        this.f23121h = z10 ? EnumC0391a.PADDING_REQUIRED : EnumC0391a.PADDING_FORBIDDEN;
    }

    public String a(byte[] bArr) {
        return b(bArr, false);
    }

    public String b(byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z10) {
            sb2.append('\"');
        }
        int g10 = g() >> 2;
        int i10 = length - 3;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = i11 + 2;
            int i13 = ((bArr[i11 + 1] & 255) | (bArr[i11] << 8)) << 8;
            i11 += 3;
            d(sb2, i13 | (bArr[i12] & 255));
            g10--;
            if (g10 <= 0) {
                sb2.append('\\');
                sb2.append('n');
                g10 = g() >> 2;
            }
        }
        int i14 = length - i11;
        if (i14 > 0) {
            int i15 = i11 + 1;
            int i16 = bArr[i11] << 16;
            if (i14 == 2) {
                i16 |= (bArr[i15] & 255) << 8;
            }
            f(sb2, i16, i14);
        }
        if (z10) {
            sb2.append('\"');
        }
        return sb2.toString();
    }

    public int c(int i10, char[] cArr, int i11) {
        char[] cArr2 = this.f23115b;
        cArr[i11] = cArr2[(i10 >> 18) & 63];
        cArr[i11 + 1] = cArr2[(i10 >> 12) & 63];
        int i12 = i11 + 3;
        cArr[i11 + 2] = cArr2[(i10 >> 6) & 63];
        int i13 = i11 + 4;
        cArr[i12] = cArr2[i10 & 63];
        return i13;
    }

    public void d(StringBuilder sb2, int i10) {
        sb2.append(this.f23115b[(i10 >> 18) & 63]);
        sb2.append(this.f23115b[(i10 >> 12) & 63]);
        sb2.append(this.f23115b[(i10 >> 6) & 63]);
        sb2.append(this.f23115b[i10 & 63]);
    }

    public int e(int i10, int i11, char[] cArr, int i12) {
        char[] cArr2 = this.f23115b;
        cArr[i12] = cArr2[(i10 >> 18) & 63];
        int i13 = i12 + 2;
        cArr[i12 + 1] = cArr2[(i10 >> 12) & 63];
        if (h()) {
            int i14 = i12 + 3;
            cArr[i13] = i11 == 2 ? this.f23115b[(i10 >> 6) & 63] : this.f23118e;
            int i15 = i12 + 4;
            cArr[i14] = this.f23118e;
            return i15;
        }
        if (i11 != 2) {
            return i13;
        }
        int i16 = i12 + 3;
        cArr[i13] = this.f23115b[(i10 >> 6) & 63];
        return i16;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return aVar.f23118e == this.f23118e && aVar.f23119f == this.f23119f && aVar.f23120g == this.f23120g && aVar.f23121h == this.f23121h && this.f23117d.equals(aVar.f23117d);
    }

    public void f(StringBuilder sb2, int i10, int i11) {
        sb2.append(this.f23115b[(i10 >> 18) & 63]);
        sb2.append(this.f23115b[(i10 >> 12) & 63]);
        if (h()) {
            sb2.append(i11 == 2 ? this.f23115b[(i10 >> 6) & 63] : this.f23118e);
            sb2.append(this.f23118e);
        } else if (i11 == 2) {
            sb2.append(this.f23115b[(i10 >> 6) & 63]);
        }
    }

    public int g() {
        return this.f23119f;
    }

    public boolean h() {
        return this.f23120g;
    }

    public int hashCode() {
        return this.f23117d.hashCode();
    }

    public String toString() {
        return this.f23117d;
    }

    public a(a aVar, String str, int i10) {
        this(aVar, str, aVar.f23120g, aVar.f23118e, i10);
    }

    public a(a aVar, String str, boolean z10, char c10, int i10) {
        this(aVar, str, z10, c10, aVar.f23121h, i10);
    }

    private a(a aVar, String str, boolean z10, char c10, EnumC0391a enumC0391a, int i10) {
        int[] iArr = new int[128];
        this.f23114a = iArr;
        char[] cArr = new char[64];
        this.f23115b = cArr;
        byte[] bArr = new byte[64];
        this.f23116c = bArr;
        this.f23117d = str;
        byte[] bArr2 = aVar.f23116c;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = aVar.f23115b;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = aVar.f23114a;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f23120g = z10;
        this.f23118e = c10;
        this.f23119f = i10;
        this.f23121h = enumC0391a;
    }
}
