package W1;

import O1.C1038i;

/* loaded from: classes.dex */
public class n implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f11227a;

    /* renamed from: b, reason: collision with root package name */
    private final V1.o f11228b;

    public n(String str, V1.o oVar) {
        this.f11227a = str;
        this.f11228b = oVar;
    }

    @Override // W1.c
    public Q1.c a(com.airbnb.lottie.o oVar, C1038i c1038i, X1.b bVar) {
        return new Q1.q(oVar, bVar, this);
    }

    public V1.o b() {
        return this.f11228b;
    }

    public String c() {
        return this.f11227a;
    }
}
