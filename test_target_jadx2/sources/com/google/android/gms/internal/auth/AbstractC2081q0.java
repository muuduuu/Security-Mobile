package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.auth.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2081q0 implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2081q0 f23760b = new C2072n0(G0.f23599d);

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f23761c;

    /* renamed from: d, reason: collision with root package name */
    private static final C2078p0 f23762d;

    /* renamed from: a, reason: collision with root package name */
    private int f23763a = 0;

    static {
        int i10 = AbstractC2042d0.f23685a;
        f23762d = new C2078p0(null);
        f23761c = new C2054h0();
    }

    AbstractC2081q0() {
    }

    static int t(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static AbstractC2081q0 v(byte[] bArr, int i10, int i11) {
        t(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C2072n0(bArr2);
    }

    public abstract byte c(int i10);

    abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public abstract int h();

    public final int hashCode() {
        int i10 = this.f23763a;
        if (i10 == 0) {
            int h10 = h();
            i10 = j(h10, 0, h10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f23763a = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C2051g0(this);
    }

    protected abstract int j(int i10, int i11, int i12);

    public abstract AbstractC2081q0 k(int i10, int i11);

    protected abstract String m(Charset charset);

    public abstract boolean r();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(h()), h() <= 50 ? AbstractC2076o1.a(this) : AbstractC2076o1.a(k(0, 47)).concat("..."));
    }

    protected final int u() {
        return this.f23763a;
    }

    public final String w(Charset charset) {
        return h() == 0 ? BuildConfig.FLAVOR : m(charset);
    }
}
