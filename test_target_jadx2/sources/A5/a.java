package A5;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    protected final AtomicReference f323b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f324c;

    /* renamed from: f, reason: collision with root package name */
    protected int[] f327f;

    /* renamed from: g, reason: collision with root package name */
    protected int f328g;

    /* renamed from: h, reason: collision with root package name */
    protected int f329h;

    /* renamed from: i, reason: collision with root package name */
    protected int f330i;

    /* renamed from: k, reason: collision with root package name */
    protected int f332k;

    /* renamed from: a, reason: collision with root package name */
    protected final a f322a = null;

    /* renamed from: j, reason: collision with root package name */
    protected int f331j = 0;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f333l = true;

    /* renamed from: d, reason: collision with root package name */
    protected final boolean f325d = false;

    /* renamed from: e, reason: collision with root package name */
    protected final boolean f326e = true;

    /* renamed from: A5.a$a, reason: collision with other inner class name */
    private static final class C0003a {

        /* renamed from: a, reason: collision with root package name */
        public final int f334a;

        /* renamed from: b, reason: collision with root package name */
        public final int f335b;

        /* renamed from: c, reason: collision with root package name */
        public final int f336c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f337d;

        /* renamed from: e, reason: collision with root package name */
        public final String[] f338e;

        /* renamed from: f, reason: collision with root package name */
        public final int f339f;

        /* renamed from: g, reason: collision with root package name */
        public final int f340g;

        public C0003a(int i10, int i11, int i12, int[] iArr, String[] strArr, int i13, int i14) {
            this.f334a = i10;
            this.f335b = i11;
            this.f336c = i12;
            this.f337d = iArr;
            this.f338e = strArr;
            this.f339f = i13;
            this.f340g = i14;
        }

        public static C0003a a(int i10) {
            int i11 = i10 << 3;
            return new C0003a(i10, 0, a.a(i10), new int[i11], new String[i10 << 1], i11 - i10, i11);
        }
    }

    private a(int i10, int i11) {
        this.f324c = i11;
        int i12 = 16;
        if (i10 >= 16) {
            if (((i10 - 1) & i10) != 0) {
                while (i12 < i10) {
                    i12 += i12;
                }
            }
            this.f323b = new AtomicReference(C0003a.a(i10));
        }
        i10 = i12;
        this.f323b = new AtomicReference(C0003a.a(i10));
    }

    static int a(int i10) {
        int i11 = i10 >> 2;
        if (i11 < 64) {
            return 4;
        }
        if (i11 <= 256) {
            return 5;
        }
        return i11 <= 1024 ? 6 : 7;
    }

    private final int b() {
        int i10 = this.f328g;
        return (i10 << 3) - i10;
    }

    public static a c() {
        long currentTimeMillis = System.currentTimeMillis();
        return d((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    protected static a d(int i10) {
        return new a(64, i10);
    }

    public int e() {
        int i10 = this.f329h;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f327f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int f() {
        int i10 = this.f330i;
        int i11 = 0;
        for (int i12 = this.f329h + 3; i12 < i10; i12 += 4) {
            if (this.f327f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int g() {
        return (this.f332k - b()) >> 2;
    }

    public int h() {
        int i10 = this.f330i + 3;
        int i11 = this.f328g + i10;
        int i12 = 0;
        while (i10 < i11) {
            if (this.f327f[i10] != 0) {
                i12++;
            }
            i10 += 4;
        }
        return i12;
    }

    public int i() {
        int i10 = this.f328g << 3;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f327f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public String toString() {
        int e10 = e();
        int f10 = f();
        int h10 = h();
        int g10 = g();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", a.class.getName(), Integer.valueOf(this.f331j), Integer.valueOf(this.f328g), Integer.valueOf(e10), Integer.valueOf(f10), Integer.valueOf(h10), Integer.valueOf(g10), Integer.valueOf(e10 + f10 + h10 + g10), Integer.valueOf(i()));
    }
}
