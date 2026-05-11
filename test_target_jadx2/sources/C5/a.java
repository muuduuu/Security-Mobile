package C5;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f888c = {8000, 8000, 2000, 2000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f889d = {4000, 4000, 200, 200};

    /* renamed from: a, reason: collision with root package name */
    protected final AtomicReferenceArray f890a;

    /* renamed from: b, reason: collision with root package name */
    protected final AtomicReferenceArray f891b;

    public a() {
        this(4, 4);
    }

    public final byte[] a(int i10) {
        return b(i10, 0);
    }

    public byte[] b(int i10, int i11) {
        int f10 = f(i10);
        if (i11 < f10) {
            i11 = f10;
        }
        byte[] bArr = (byte[]) this.f890a.getAndSet(i10, null);
        return (bArr == null || bArr.length < i11) ? e(i11) : bArr;
    }

    public final char[] c(int i10) {
        return d(i10, 0);
    }

    public char[] d(int i10, int i11) {
        int h10 = h(i10);
        if (i11 < h10) {
            i11 = h10;
        }
        char[] cArr = (char[]) this.f891b.getAndSet(i10, null);
        return (cArr == null || cArr.length < i11) ? g(i11) : cArr;
    }

    protected byte[] e(int i10) {
        return new byte[i10];
    }

    protected int f(int i10) {
        return f888c[i10];
    }

    protected char[] g(int i10) {
        return new char[i10];
    }

    protected int h(int i10) {
        return f889d[i10];
    }

    public void i(int i10, byte[] bArr) {
        this.f890a.set(i10, bArr);
    }

    public void j(int i10, char[] cArr) {
        this.f891b.set(i10, cArr);
    }

    protected a(int i10, int i11) {
        this.f890a = new AtomicReferenceArray(i10);
        this.f891b = new AtomicReferenceArray(i11);
    }
}
