package c1;

/* renamed from: c1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1717c {

    /* renamed from: e, reason: collision with root package name */
    public static final C1717c f19325e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1717c f19326f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1717c f19327g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1717c f19328h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1717c f19329i;

    /* renamed from: j, reason: collision with root package name */
    public static final C1717c f19330j;

    /* renamed from: a, reason: collision with root package name */
    final float[] f19331a;

    /* renamed from: b, reason: collision with root package name */
    final float[] f19332b;

    /* renamed from: c, reason: collision with root package name */
    final float[] f19333c = new float[3];

    /* renamed from: d, reason: collision with root package name */
    boolean f19334d = true;

    static {
        C1717c c1717c = new C1717c();
        f19325e = c1717c;
        m(c1717c);
        p(c1717c);
        C1717c c1717c2 = new C1717c();
        f19326f = c1717c2;
        o(c1717c2);
        p(c1717c2);
        C1717c c1717c3 = new C1717c();
        f19327g = c1717c3;
        l(c1717c3);
        p(c1717c3);
        C1717c c1717c4 = new C1717c();
        f19328h = c1717c4;
        m(c1717c4);
        n(c1717c4);
        C1717c c1717c5 = new C1717c();
        f19329i = c1717c5;
        o(c1717c5);
        n(c1717c5);
        C1717c c1717c6 = new C1717c();
        f19330j = c1717c6;
        l(c1717c6);
        n(c1717c6);
    }

    C1717c() {
        float[] fArr = new float[3];
        this.f19331a = fArr;
        float[] fArr2 = new float[3];
        this.f19332b = fArr2;
        r(fArr);
        r(fArr2);
        q();
    }

    private static void l(C1717c c1717c) {
        float[] fArr = c1717c.f19332b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void m(C1717c c1717c) {
        float[] fArr = c1717c.f19332b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void n(C1717c c1717c) {
        float[] fArr = c1717c.f19331a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void o(C1717c c1717c) {
        float[] fArr = c1717c.f19332b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void p(C1717c c1717c) {
        float[] fArr = c1717c.f19331a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private void q() {
        float[] fArr = this.f19333c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    private static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.f19333c[1];
    }

    public float b() {
        return this.f19332b[2];
    }

    public float c() {
        return this.f19331a[2];
    }

    public float d() {
        return this.f19332b[0];
    }

    public float e() {
        return this.f19331a[0];
    }

    public float f() {
        return this.f19333c[2];
    }

    public float g() {
        return this.f19333c[0];
    }

    public float h() {
        return this.f19332b[1];
    }

    public float i() {
        return this.f19331a[1];
    }

    public boolean j() {
        return this.f19334d;
    }

    void k() {
        int length = this.f19333c.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = this.f19333c[i10];
            if (f11 > 0.0f) {
                f10 += f11;
            }
        }
        if (f10 != 0.0f) {
            int length2 = this.f19333c.length;
            for (int i11 = 0; i11 < length2; i11++) {
                float[] fArr = this.f19333c;
                float f12 = fArr[i11];
                if (f12 > 0.0f) {
                    fArr[i11] = f12 / f10;
                }
            }
        }
    }
}
