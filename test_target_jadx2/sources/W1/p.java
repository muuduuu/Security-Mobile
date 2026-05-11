package W1;

import O1.C1038i;
import android.graphics.Path;

/* loaded from: classes.dex */
public class p implements c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f11232a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f11233b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11234c;

    /* renamed from: d, reason: collision with root package name */
    private final V1.a f11235d;

    /* renamed from: e, reason: collision with root package name */
    private final V1.d f11236e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f11237f;

    public p(String str, boolean z10, Path.FillType fillType, V1.a aVar, V1.d dVar, boolean z11) {
        this.f11234c = str;
        this.f11232a = z10;
        this.f11233b = fillType;
        this.f11235d = aVar;
        this.f11236e = dVar;
        this.f11237f = z11;
    }

    @Override // W1.c
    public Q1.c a(com.airbnb.lottie.o oVar, C1038i c1038i, X1.b bVar) {
        return new Q1.g(oVar, bVar, this);
    }

    public V1.a b() {
        return this.f11235d;
    }

    public Path.FillType c() {
        return this.f11233b;
    }

    public String d() {
        return this.f11234c;
    }

    public V1.d e() {
        return this.f11236e;
    }

    public boolean f() {
        return this.f11237f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f11232a + '}';
    }
}
