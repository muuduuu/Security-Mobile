package r7;

/* loaded from: classes2.dex */
final class Y0 implements t8.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f39853a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39854b = false;

    /* renamed from: c, reason: collision with root package name */
    private t8.c f39855c;

    /* renamed from: d, reason: collision with root package name */
    private final U0 f39856d;

    Y0(U0 u02) {
        this.f39856d = u02;
    }

    private final void b() {
        if (this.f39853a) {
            throw new t8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f39853a = true;
    }

    final void a(t8.c cVar, boolean z10) {
        this.f39853a = false;
        this.f39855c = cVar;
        this.f39854b = z10;
    }

    @Override // t8.g
    public final t8.g c(String str) {
        b();
        this.f39856d.f(this.f39855c, str, this.f39854b);
        return this;
    }

    @Override // t8.g
    public final t8.g d(boolean z10) {
        b();
        this.f39856d.g(this.f39855c, z10 ? 1 : 0, this.f39854b);
        return this;
    }
}
