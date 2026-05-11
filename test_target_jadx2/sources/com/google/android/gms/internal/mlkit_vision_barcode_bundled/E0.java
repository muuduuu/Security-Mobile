package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes2.dex */
public abstract class E0 implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final E0 f24749b = new A0(AbstractC2489o1.f24887d);

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f24750c;

    /* renamed from: d, reason: collision with root package name */
    private static final D0 f24751d;

    /* renamed from: a, reason: collision with root package name */
    private int f24752a = 0;

    static {
        int i10 = AbstractC2498q0.f24908a;
        f24751d = new D0(null);
        f24750c = new C2522v0();
    }

    E0() {
    }

    static int D(int i10, int i11, int i12) {
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

    public static E0 G(byte[] bArr, int i10, int i11) {
        D(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new A0(bArr2);
    }

    public static E0 I(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i10 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        while (true) {
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = inputStream.read(bArr, i11, i10 - i11);
                if (read == -1) {
                    break;
                }
                i11 += read;
            }
            E0 G10 = i11 == 0 ? null : G(bArr, 0, i11);
            if (G10 == null) {
                break;
            }
            arrayList.add(G10);
            i10 = Math.min(i10 + i10, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? f24749b : h(arrayList.iterator(), size);
    }

    static void M(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    private static E0 h(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (E0) it.next();
        }
        int i11 = i10 >>> 1;
        E0 h10 = h(it, i11);
        E0 h11 = h(it, i10 - i11);
        if (Integer.MAX_VALUE - h10.j() >= h11.j()) {
            return C2455h2.V(h10, h11);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + h10.j() + "+" + h11.j());
    }

    abstract void A(AbstractC2512t0 abstractC2512t0);

    public abstract boolean B();

    protected final int E() {
        return this.f24752a;
    }

    @Override // java.lang.Iterable
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public InterfaceC2537y0 iterator() {
        return new C2517u0(this);
    }

    public final String J(Charset charset) {
        return j() == 0 ? BuildConfig.FLAVOR : w(charset);
    }

    public final String L() {
        return J(AbstractC2489o1.f24885b);
    }

    public final void O(byte[] bArr, int i10, int i11, int i12) {
        D(0, i12, j());
        D(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            k(bArr, 0, i11, i12);
        }
    }

    public final byte[] P() {
        int j10 = j();
        if (j10 == 0) {
            return AbstractC2489o1.f24887d;
        }
        byte[] bArr = new byte[j10];
        k(bArr, 0, 0, j10);
        return bArr;
    }

    public abstract byte c(int i10);

    abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f24752a;
        if (i10 == 0) {
            int j10 = j();
            i10 = t(j10, 0, j10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f24752a = i10;
        }
        return i10;
    }

    public abstract int j();

    protected abstract void k(byte[] bArr, int i10, int i11, int i12);

    protected abstract int m();

    protected abstract boolean r();

    protected abstract int t(int i10, int i11, int i12);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(j()), j() <= 50 ? AbstractC2529w2.a(this) : AbstractC2529w2.a(v(0, 47)).concat("..."));
    }

    protected abstract int u(int i10, int i11, int i12);

    public abstract E0 v(int i10, int i11);

    protected abstract String w(Charset charset);
}
