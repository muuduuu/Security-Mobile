package W1;

import O1.C1038i;

/* loaded from: classes.dex */
public class m implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f11222a;

    /* renamed from: b, reason: collision with root package name */
    private final V1.b f11223b;

    /* renamed from: c, reason: collision with root package name */
    private final V1.b f11224c;

    /* renamed from: d, reason: collision with root package name */
    private final V1.n f11225d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11226e;

    public m(String str, V1.b bVar, V1.b bVar2, V1.n nVar, boolean z10) {
        this.f11222a = str;
        this.f11223b = bVar;
        this.f11224c = bVar2;
        this.f11225d = nVar;
        this.f11226e = z10;
    }

    @Override // W1.c
    public Q1.c a(com.airbnb.lottie.o oVar, C1038i c1038i, X1.b bVar) {
        return new Q1.p(oVar, bVar, this);
    }

    public V1.b b() {
        return this.f11223b;
    }

    public String c() {
        return this.f11222a;
    }

    public V1.b d() {
        return this.f11224c;
    }

    public V1.n e() {
        return this.f11225d;
    }

    public boolean f() {
        return this.f11226e;
    }
}
