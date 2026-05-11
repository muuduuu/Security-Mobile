package r7;

/* loaded from: classes2.dex */
public final class D5 {

    /* renamed from: a, reason: collision with root package name */
    private Long f39326a;

    /* renamed from: b, reason: collision with root package name */
    private Long f39327b;

    /* renamed from: c, reason: collision with root package name */
    private Long f39328c;

    /* renamed from: d, reason: collision with root package name */
    private Long f39329d;

    /* renamed from: e, reason: collision with root package name */
    private Long f39330e;

    /* renamed from: f, reason: collision with root package name */
    private Long f39331f;

    public final D5 a(Long l10) {
        this.f39328c = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final D5 b(Long l10) {
        this.f39329d = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final D5 c(Long l10) {
        this.f39326a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final D5 d(Long l10) {
        this.f39330e = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final D5 e(Long l10) {
        this.f39327b = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final D5 f(Long l10) {
        this.f39331f = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final F5 g() {
        return new F5(this, null);
    }
}
