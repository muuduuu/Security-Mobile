package d9;

import X8.C1298d;
import X8.C1303i;
import r7.E8;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final h f31298a;

    /* renamed from: b, reason: collision with root package name */
    private final C1298d f31299b;

    /* renamed from: c, reason: collision with root package name */
    private final C1303i f31300c;

    g(h hVar, C1298d c1298d, C1303i c1303i) {
        this.f31298a = hVar;
        this.f31299b = c1298d;
        this.f31300c = c1303i;
    }

    public final C3000a a(Z8.b bVar) {
        return new C3000a(bVar, (k) this.f31298a.b(bVar), this.f31299b.a(bVar.c()), E8.b(c.d()), this.f31300c);
    }
}
