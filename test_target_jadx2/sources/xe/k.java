package xe;

import java.io.InputStream;

/* loaded from: classes3.dex */
final class k {

    /* renamed from: A, reason: collision with root package name */
    byte[] f45066A;

    /* renamed from: B, reason: collision with root package name */
    int f45067B;

    /* renamed from: C, reason: collision with root package name */
    int f45068C;

    /* renamed from: D, reason: collision with root package name */
    int f45069D;

    /* renamed from: E, reason: collision with root package name */
    int f45070E;

    /* renamed from: F, reason: collision with root package name */
    int f45071F;

    /* renamed from: G, reason: collision with root package name */
    int f45072G;

    /* renamed from: H, reason: collision with root package name */
    byte[] f45073H;

    /* renamed from: I, reason: collision with root package name */
    int f45074I;

    /* renamed from: J, reason: collision with root package name */
    int f45075J;

    /* renamed from: K, reason: collision with root package name */
    int f45076K;

    /* renamed from: L, reason: collision with root package name */
    int f45077L;

    /* renamed from: M, reason: collision with root package name */
    int f45078M;

    /* renamed from: N, reason: collision with root package name */
    int f45079N;

    /* renamed from: O, reason: collision with root package name */
    int f45080O;

    /* renamed from: P, reason: collision with root package name */
    int f45081P;

    /* renamed from: U, reason: collision with root package name */
    int f45086U;

    /* renamed from: V, reason: collision with root package name */
    int f45087V;

    /* renamed from: W, reason: collision with root package name */
    int f45088W;

    /* renamed from: X, reason: collision with root package name */
    int f45089X;

    /* renamed from: Y, reason: collision with root package name */
    int f45090Y;

    /* renamed from: Z, reason: collision with root package name */
    byte[] f45091Z;

    /* renamed from: b, reason: collision with root package name */
    int f45093b;

    /* renamed from: d, reason: collision with root package name */
    byte[] f45095d;

    /* renamed from: g, reason: collision with root package name */
    int f45098g;

    /* renamed from: h, reason: collision with root package name */
    boolean f45099h;

    /* renamed from: i, reason: collision with root package name */
    boolean f45100i;

    /* renamed from: j, reason: collision with root package name */
    boolean f45101j;

    /* renamed from: w, reason: collision with root package name */
    int f45114w;

    /* renamed from: x, reason: collision with root package name */
    int f45115x;

    /* renamed from: y, reason: collision with root package name */
    int f45116y;

    /* renamed from: z, reason: collision with root package name */
    byte[] f45117z;

    /* renamed from: a, reason: collision with root package name */
    int f45092a = 0;

    /* renamed from: c, reason: collision with root package name */
    final a f45094c = new a();

    /* renamed from: e, reason: collision with root package name */
    final int[] f45096e = new int[3240];

    /* renamed from: f, reason: collision with root package name */
    final int[] f45097f = new int[3240];

    /* renamed from: k, reason: collision with root package name */
    final h f45102k = new h();

    /* renamed from: l, reason: collision with root package name */
    final h f45103l = new h();

    /* renamed from: m, reason: collision with root package name */
    final h f45104m = new h();

    /* renamed from: n, reason: collision with root package name */
    final int[] f45105n = new int[3];

    /* renamed from: o, reason: collision with root package name */
    final int[] f45106o = new int[3];

    /* renamed from: p, reason: collision with root package name */
    final int[] f45107p = new int[6];

    /* renamed from: q, reason: collision with root package name */
    final int[] f45108q = {16, 15, 11, 4};

    /* renamed from: r, reason: collision with root package name */
    int f45109r = 0;

    /* renamed from: s, reason: collision with root package name */
    int f45110s = 0;

    /* renamed from: t, reason: collision with root package name */
    int f45111t = 0;

    /* renamed from: u, reason: collision with root package name */
    boolean f45112u = false;

    /* renamed from: v, reason: collision with root package name */
    int f45113v = 0;

    /* renamed from: Q, reason: collision with root package name */
    int f45082Q = 0;

    /* renamed from: R, reason: collision with root package name */
    long f45083R = 0;

    /* renamed from: S, reason: collision with root package name */
    byte[] f45084S = new byte[0];

    /* renamed from: T, reason: collision with root package name */
    int f45085T = 0;

    k() {
    }

    static void a(k kVar) {
        int i10 = kVar.f45092a;
        if (i10 == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (i10 == 11) {
            return;
        }
        kVar.f45092a = 11;
        a.b(kVar.f45094c);
    }

    private static int b(a aVar) {
        if (a.i(aVar, 1) == 0) {
            return 16;
        }
        int i10 = a.i(aVar, 3);
        if (i10 != 0) {
            return i10 + 17;
        }
        int i11 = a.i(aVar, 3);
        if (i11 != 0) {
            return i11 + 8;
        }
        return 17;
    }

    static void c(k kVar, InputStream inputStream) {
        if (kVar.f45092a != 0) {
            throw new IllegalStateException("State MUST be uninitialized");
        }
        a.e(kVar.f45094c, inputStream);
        int b10 = b(kVar.f45094c);
        if (b10 == 9) {
            throw new c("Invalid 'windowBits' code");
        }
        int i10 = 1 << b10;
        kVar.f45081P = i10;
        kVar.f45080O = i10 - 16;
        kVar.f45092a = 1;
    }
}
