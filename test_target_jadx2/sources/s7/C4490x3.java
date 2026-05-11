package s7;

/* renamed from: s7.x3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4490x3 {

    /* renamed from: a, reason: collision with root package name */
    private Long f41622a;

    /* renamed from: b, reason: collision with root package name */
    private EnumC4497y3 f41623b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC4455s3 f41624c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f41625d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f41626e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f41627f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f41628g;

    public final C4490x3 b(Long l10) {
        this.f41622a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C4490x3 c(Integer num) {
        this.f41625d = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C4490x3 d(EnumC4455s3 enumC4455s3) {
        this.f41624c = enumC4455s3;
        return this;
    }

    public final C4490x3 e(Integer num) {
        this.f41627f = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C4490x3 f(EnumC4497y3 enumC4497y3) {
        this.f41623b = enumC4497y3;
        return this;
    }

    public final C4490x3 g(Integer num) {
        this.f41626e = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C4490x3 h(Integer num) {
        this.f41628g = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final A3 j() {
        return new A3(this, null);
    }
}
