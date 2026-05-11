package com.google.android.gms.internal.clearcut;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.clearcut.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2179y implements Serializable, Iterable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2179y f24108b = new F(AbstractC2115c0.f24020c);

    /* renamed from: c, reason: collision with root package name */
    private static final C f24109c;

    /* renamed from: a, reason: collision with root package name */
    private int f24110a = 0;

    static {
        C2182z c2182z = null;
        f24109c = AbstractC2164t.b() ? new G(c2182z) : new A(c2182z);
    }

    AbstractC2179y() {
    }

    static int r(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(37);
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public static AbstractC2179y t(byte[] bArr, int i10, int i11) {
        return new F(f24109c.a(bArr, i10, i11));
    }

    public static AbstractC2179y u(String str) {
        return new F(str.getBytes(AbstractC2115c0.f24018a));
    }

    static D w(int i10) {
        return new D(i10, null);
    }

    public final String A() {
        return size() == 0 ? BuildConfig.FLAVOR : h(AbstractC2115c0.f24018a);
    }

    protected abstract int c(int i10, int i11, int i12);

    public abstract AbstractC2179y e(int i10, int i11);

    public abstract boolean equals(Object obj);

    protected abstract String h(Charset charset);

    public final int hashCode() {
        int i10 = this.f24110a;
        if (i10 == 0) {
            int size = size();
            i10 = c(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f24110a = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new C2182z(this);
    }

    abstract void j(AbstractC2176x abstractC2176x);

    public abstract boolean k();

    protected final int m() {
        return this.f24110a;
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract byte v(int i10);
}
