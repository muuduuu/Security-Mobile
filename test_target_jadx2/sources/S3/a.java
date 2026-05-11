package S3;

import S3.c;
import k3.AbstractC3540c;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements c.b {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f8705c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8706d;

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f8707e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8708f;

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f8711i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f8712j;

    /* renamed from: k, reason: collision with root package name */
    private static final byte[] f8713k;

    /* renamed from: l, reason: collision with root package name */
    private static final int f8714l;

    /* renamed from: m, reason: collision with root package name */
    private static final byte[] f8715m;

    /* renamed from: n, reason: collision with root package name */
    private static final byte[][] f8716n;

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f8717o;

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f8718p;

    /* renamed from: q, reason: collision with root package name */
    private static final int f8719q;

    /* renamed from: a, reason: collision with root package name */
    private final int f8720a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0171a f8704b = new C0171a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f8709g = e.a("GIF87a");

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f8710h = e.a("GIF89a");

    /* renamed from: S3.a$a, reason: collision with other inner class name */
    public static final class C0171a {
        public /* synthetic */ C0171a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c i(byte[] bArr, int i10) {
            if (AbstractC3540c.h(bArr, 0, i10)) {
                return AbstractC3540c.g(bArr, 0) ? b.f8727g : AbstractC3540c.f(bArr, 0) ? b.f8728h : AbstractC3540c.c(bArr, 0, i10) ? AbstractC3540c.b(bArr, 0) ? b.f8731k : AbstractC3540c.d(bArr, 0) ? b.f8730j : b.f8729i : c.f8736d;
            }
            throw new IllegalStateException("Check failed.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(byte[] bArr, int i10) {
            if (i10 < a.f8711i.length) {
                return false;
            }
            return e.c(bArr, a.f8711i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(byte[] bArr, int i10) {
            return i10 >= a.f8719q && (e.c(bArr, a.f8717o) || e.c(bArr, a.f8718p));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l(byte[] bArr, int i10) {
            if (i10 < 6) {
                return false;
            }
            return e.c(bArr, a.f8709g) || e.c(bArr, a.f8710h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m(byte[] bArr, int i10) {
            if (i10 < 12 || bArr[3] < 8 || !e.b(bArr, a.f8715m, 4)) {
                return false;
            }
            for (byte[] bArr2 : a.f8716n) {
                if (e.b(bArr, bArr2, 8)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean n(byte[] bArr, int i10) {
            if (i10 < a.f8713k.length) {
                return false;
            }
            return e.c(bArr, a.f8713k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean o(byte[] bArr, int i10) {
            return i10 >= a.f8705c.length && e.c(bArr, a.f8705c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean p(byte[] bArr, int i10) {
            return i10 >= a.f8707e.length && e.c(bArr, a.f8707e);
        }

        private C0171a() {
        }
    }

    static {
        byte[] bArr = {-1, -40, -1};
        f8705c = bArr;
        f8706d = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f8707e = bArr2;
        f8708f = bArr2.length;
        byte[] a10 = e.a("BM");
        f8711i = a10;
        f8712j = a10.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f8713k = bArr3;
        f8714l = bArr3.length;
        f8715m = e.a("ftyp");
        f8716n = new byte[][]{e.a("heic"), e.a("heix"), e.a("hevc"), e.a("hevx"), e.a("mif1"), e.a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        f8717o = bArr4;
        f8718p = new byte[]{77, 77, 0, 42};
        f8719q = bArr4.length;
    }

    public a() {
        Object W10 = AbstractC3574i.W(new Integer[]{21, 20, Integer.valueOf(f8706d), Integer.valueOf(f8708f), 6, Integer.valueOf(f8712j), Integer.valueOf(f8714l), 12});
        if (W10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f8720a = ((Number) W10).intValue();
    }

    @Override // S3.c.b
    public int a() {
        return this.f8720a;
    }

    @Override // S3.c.b
    public c b(byte[] headerBytes, int i10) {
        Intrinsics.checkNotNullParameter(headerBytes, "headerBytes");
        if (AbstractC3540c.h(headerBytes, 0, i10)) {
            return f8704b.i(headerBytes, i10);
        }
        C0171a c0171a = f8704b;
        return c0171a.o(headerBytes, i10) ? b.f8722b : c0171a.p(headerBytes, i10) ? b.f8723c : c0171a.l(headerBytes, i10) ? b.f8724d : c0171a.j(headerBytes, i10) ? b.f8725e : c0171a.n(headerBytes, i10) ? b.f8726f : c0171a.m(headerBytes, i10) ? b.f8732l : c0171a.k(headerBytes, i10) ? b.f8733m : c.f8736d;
    }
}
