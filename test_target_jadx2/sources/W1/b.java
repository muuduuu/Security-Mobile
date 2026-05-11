package W1;

import O1.C1038i;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f11168a;

    /* renamed from: b, reason: collision with root package name */
    private final V1.o f11169b;

    /* renamed from: c, reason: collision with root package name */
    private final V1.f f11170c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f11171d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11172e;

    public b(String str, V1.o oVar, V1.f fVar, boolean z10, boolean z11) {
        this.f11168a = str;
        this.f11169b = oVar;
        this.f11170c = fVar;
        this.f11171d = z10;
        this.f11172e = z11;
    }

    @Override // W1.c
    public Q1.c a(com.airbnb.lottie.o oVar, C1038i c1038i, X1.b bVar) {
        return new Q1.f(oVar, bVar, this);
    }

    public String b() {
        return this.f11168a;
    }

    public V1.o c() {
        return this.f11169b;
    }

    public V1.f d() {
        return this.f11170c;
    }

    public boolean e() {
        return this.f11172e;
    }

    public boolean f() {
        return this.f11171d;
    }
}
