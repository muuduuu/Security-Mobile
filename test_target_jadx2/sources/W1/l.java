package W1;

import O1.C1038i;

/* loaded from: classes.dex */
public class l implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f11217a;

    /* renamed from: b, reason: collision with root package name */
    private final V1.o f11218b;

    /* renamed from: c, reason: collision with root package name */
    private final V1.o f11219c;

    /* renamed from: d, reason: collision with root package name */
    private final V1.b f11220d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11221e;

    public l(String str, V1.o oVar, V1.o oVar2, V1.b bVar, boolean z10) {
        this.f11217a = str;
        this.f11218b = oVar;
        this.f11219c = oVar2;
        this.f11220d = bVar;
        this.f11221e = z10;
    }

    @Override // W1.c
    public Q1.c a(com.airbnb.lottie.o oVar, C1038i c1038i, X1.b bVar) {
        return new Q1.o(oVar, bVar, this);
    }

    public V1.b b() {
        return this.f11220d;
    }

    public String c() {
        return this.f11217a;
    }

    public V1.o d() {
        return this.f11218b;
    }

    public V1.o e() {
        return this.f11219c;
    }

    public boolean f() {
        return this.f11221e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f11218b + ", size=" + this.f11219c + '}';
    }
}
