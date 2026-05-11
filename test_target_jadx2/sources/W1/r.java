package W1;

import O1.C1038i;

/* loaded from: classes.dex */
public class r implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f11241a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11242b;

    /* renamed from: c, reason: collision with root package name */
    private final V1.h f11243c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f11244d;

    public r(String str, int i10, V1.h hVar, boolean z10) {
        this.f11241a = str;
        this.f11242b = i10;
        this.f11243c = hVar;
        this.f11244d = z10;
    }

    @Override // W1.c
    public Q1.c a(com.airbnb.lottie.o oVar, C1038i c1038i, X1.b bVar) {
        return new Q1.r(oVar, bVar, this);
    }

    public String b() {
        return this.f11241a;
    }

    public V1.h c() {
        return this.f11243c;
    }

    public boolean d() {
        return this.f11244d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f11241a + ", index=" + this.f11242b + '}';
    }
}
