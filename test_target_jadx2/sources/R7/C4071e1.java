package r7;

/* renamed from: r7.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4071e1 {

    /* renamed from: a, reason: collision with root package name */
    private C4101h1 f39968a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f39969b;

    /* renamed from: c, reason: collision with root package name */
    private F5 f39970c;

    public final C4071e1 a(Integer num) {
        this.f39969b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C4071e1 b(F5 f52) {
        this.f39970c = f52;
        return this;
    }

    public final C4071e1 c(C4101h1 c4101h1) {
        this.f39968a = c4101h1;
        return this;
    }

    public final C4121j1 e() {
        return new C4121j1(this, null);
    }
}
