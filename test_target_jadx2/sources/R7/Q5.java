package r7;

/* loaded from: classes2.dex */
public final class Q5 {

    /* renamed from: a, reason: collision with root package name */
    private Long f39637a;

    /* renamed from: b, reason: collision with root package name */
    private EnumC4076e6 f39638b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f39639c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f39640d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f39641e;

    public final Q5 a(Boolean bool) {
        this.f39640d = bool;
        return this;
    }

    public final Q5 b(Boolean bool) {
        this.f39641e = bool;
        return this;
    }

    public final Q5 c(Long l10) {
        this.f39637a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final Q5 d(EnumC4076e6 enumC4076e6) {
        this.f39638b = enumC4076e6;
        return this;
    }

    public final Q5 e(Boolean bool) {
        this.f39639c = bool;
        return this;
    }

    public final S5 f() {
        return new S5(this, null);
    }
}
