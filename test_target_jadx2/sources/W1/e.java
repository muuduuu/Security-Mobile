package W1;

import O1.C1038i;
import android.graphics.Path;

/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final g f11175a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f11176b;

    /* renamed from: c, reason: collision with root package name */
    private final V1.c f11177c;

    /* renamed from: d, reason: collision with root package name */
    private final V1.d f11178d;

    /* renamed from: e, reason: collision with root package name */
    private final V1.f f11179e;

    /* renamed from: f, reason: collision with root package name */
    private final V1.f f11180f;

    /* renamed from: g, reason: collision with root package name */
    private final String f11181g;

    /* renamed from: h, reason: collision with root package name */
    private final V1.b f11182h;

    /* renamed from: i, reason: collision with root package name */
    private final V1.b f11183i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f11184j;

    public e(String str, g gVar, Path.FillType fillType, V1.c cVar, V1.d dVar, V1.f fVar, V1.f fVar2, V1.b bVar, V1.b bVar2, boolean z10) {
        this.f11175a = gVar;
        this.f11176b = fillType;
        this.f11177c = cVar;
        this.f11178d = dVar;
        this.f11179e = fVar;
        this.f11180f = fVar2;
        this.f11181g = str;
        this.f11182h = bVar;
        this.f11183i = bVar2;
        this.f11184j = z10;
    }

    @Override // W1.c
    public Q1.c a(com.airbnb.lottie.o oVar, C1038i c1038i, X1.b bVar) {
        return new Q1.h(oVar, c1038i, bVar, this);
    }

    public V1.f b() {
        return this.f11180f;
    }

    public Path.FillType c() {
        return this.f11176b;
    }

    public V1.c d() {
        return this.f11177c;
    }

    public g e() {
        return this.f11175a;
    }

    public String f() {
        return this.f11181g;
    }

    public V1.d g() {
        return this.f11178d;
    }

    public V1.f h() {
        return this.f11179e;
    }

    public boolean i() {
        return this.f11184j;
    }
}
