package w8;

/* loaded from: classes2.dex */
class i implements t8.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f44359a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f44360b = false;

    /* renamed from: c, reason: collision with root package name */
    private t8.c f44361c;

    /* renamed from: d, reason: collision with root package name */
    private final f f44362d;

    i(f fVar) {
        this.f44362d = fVar;
    }

    private void a() {
        if (this.f44359a) {
            throw new t8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f44359a = true;
    }

    void b(t8.c cVar, boolean z10) {
        this.f44359a = false;
        this.f44361c = cVar;
        this.f44360b = z10;
    }

    @Override // t8.g
    public t8.g c(String str) {
        a();
        this.f44362d.g(this.f44361c, str, this.f44360b);
        return this;
    }

    @Override // t8.g
    public t8.g d(boolean z10) {
        a();
        this.f44362d.l(this.f44361c, z10, this.f44360b);
        return this;
    }
}
