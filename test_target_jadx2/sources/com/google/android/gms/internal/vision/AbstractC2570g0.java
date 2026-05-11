package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.vision.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2570g0 implements Serializable, Iterable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2570g0 f25133b = new C2602r0(R0.f25078c);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC2588m0 f25134c;

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator f25135d;

    /* renamed from: a, reason: collision with root package name */
    private int f25136a = 0;

    static {
        C2567f0 c2567f0 = null;
        f25134c = Z.b() ? new C2600q0(c2567f0) : new C2582k0(c2567f0);
        f25135d = new C2576i0();
    }

    AbstractC2570g0() {
    }

    static int A(int i10, int i11, int i12) {
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

    static C2597p0 D(int i10) {
        return new C2597p0(i10, null);
    }

    public static AbstractC2570g0 m(String str) {
        return new C2602r0(str.getBytes(R0.f25076a));
    }

    public static AbstractC2570g0 r(byte[] bArr, int i10, int i11) {
        A(i10, i10 + i11, bArr.length);
        return new C2602r0(f25134c.a(bArr, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int w(byte b10) {
        return b10 & 255;
    }

    public final String B() {
        return e() == 0 ? BuildConfig.FLAVOR : t(R0.f25076a);
    }

    protected final int E() {
        return this.f25136a;
    }

    public abstract boolean a();

    public abstract byte c(int i10);

    public abstract int e();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f25136a;
        if (i10 == 0) {
            int e10 = e();
            i10 = j(e10, 0, e10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f25136a = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new C2567f0(this);
    }

    protected abstract int j(int i10, int i11, int i12);

    public abstract AbstractC2570g0 k(int i10, int i11);

    protected abstract String t(Charset charset);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(e()), e() <= 50 ? X1.a(this) : String.valueOf(X1.a(k(0, 47))).concat("..."));
    }

    abstract void u(AbstractC2559d0 abstractC2559d0);

    abstract byte v(int i10);
}
