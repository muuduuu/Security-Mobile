package W1;

import O1.C1038i;

/* loaded from: classes.dex */
public class t implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f11257a;

    /* renamed from: b, reason: collision with root package name */
    private final a f11258b;

    /* renamed from: c, reason: collision with root package name */
    private final V1.b f11259c;

    /* renamed from: d, reason: collision with root package name */
    private final V1.b f11260d;

    /* renamed from: e, reason: collision with root package name */
    private final V1.b f11261e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f11262f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a forId(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i10);
        }
    }

    public t(String str, a aVar, V1.b bVar, V1.b bVar2, V1.b bVar3, boolean z10) {
        this.f11257a = str;
        this.f11258b = aVar;
        this.f11259c = bVar;
        this.f11260d = bVar2;
        this.f11261e = bVar3;
        this.f11262f = z10;
    }

    @Override // W1.c
    public Q1.c a(com.airbnb.lottie.o oVar, C1038i c1038i, X1.b bVar) {
        return new Q1.u(bVar, this);
    }

    public V1.b b() {
        return this.f11260d;
    }

    public String c() {
        return this.f11257a;
    }

    public V1.b d() {
        return this.f11261e;
    }

    public V1.b e() {
        return this.f11259c;
    }

    public a f() {
        return this.f11258b;
    }

    public boolean g() {
        return this.f11262f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f11259c + ", end: " + this.f11260d + ", offset: " + this.f11261e + "}";
    }
}
