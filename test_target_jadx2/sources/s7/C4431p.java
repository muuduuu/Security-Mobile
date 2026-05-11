package s7;

/* renamed from: s7.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4431p implements t8.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f41383a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f41384b = false;

    /* renamed from: c, reason: collision with root package name */
    private t8.c f41385c;

    /* renamed from: d, reason: collision with root package name */
    private final C4403l f41386d;

    C4431p(C4403l c4403l) {
        this.f41386d = c4403l;
    }

    private final void b() {
        if (this.f41383a) {
            throw new t8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f41383a = true;
    }

    final void a(t8.c cVar, boolean z10) {
        this.f41383a = false;
        this.f41385c = cVar;
        this.f41384b = z10;
    }

    @Override // t8.g
    public final t8.g c(String str) {
        b();
        this.f41386d.f(this.f41385c, str, this.f41384b);
        return this;
    }

    @Override // t8.g
    public final t8.g d(boolean z10) {
        b();
        this.f41386d.g(this.f41385c, z10 ? 1 : 0, this.f41384b);
        return this;
    }
}
