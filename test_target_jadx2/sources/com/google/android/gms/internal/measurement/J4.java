package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class J4 implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final J4 f24246b = new I4(AbstractC2308n5.f24582b);

    /* renamed from: a, reason: collision with root package name */
    private int f24247a = 0;

    static {
        int i10 = AbstractC2387w4.f24680a;
    }

    J4() {
    }

    public static J4 r(byte[] bArr, int i10, int i11) {
        u(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new I4(bArr2);
    }

    static int u(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public abstract byte c(int i10);

    abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public abstract int h();

    public final int hashCode() {
        int i10 = this.f24247a;
        if (i10 == 0) {
            int h10 = h();
            i10 = m(h10, 0, h10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f24247a = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C4(this);
    }

    public abstract J4 j(int i10, int i11);

    abstract void k(A4 a42);

    protected abstract int m(int i10, int i11, int i12);

    protected final int t() {
        return this.f24247a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(h()), h() <= 50 ? AbstractC2201b6.a(this) : AbstractC2201b6.a(j(0, 47)).concat("..."));
    }
}
