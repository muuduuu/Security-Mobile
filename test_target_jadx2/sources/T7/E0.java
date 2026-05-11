package t7;

/* loaded from: classes2.dex */
final class E0 implements t8.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f42465a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f42466b = false;

    /* renamed from: c, reason: collision with root package name */
    private t8.c f42467c;

    /* renamed from: d, reason: collision with root package name */
    private final C4814z0 f42468d;

    E0(C4814z0 c4814z0) {
        this.f42468d = c4814z0;
    }

    private final void b() {
        if (this.f42465a) {
            throw new t8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f42465a = true;
    }

    final void a(t8.c cVar, boolean z10) {
        this.f42465a = false;
        this.f42467c = cVar;
        this.f42466b = z10;
    }

    @Override // t8.g
    public final t8.g c(String str) {
        b();
        this.f42468d.f(this.f42467c, str, this.f42466b);
        return this;
    }

    @Override // t8.g
    public final t8.g d(boolean z10) {
        b();
        this.f42468d.g(this.f42467c, z10 ? 1 : 0, this.f42466b);
        return this;
    }
}
