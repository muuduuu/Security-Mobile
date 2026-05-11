package t7;

/* loaded from: classes2.dex */
public final class L3 {

    /* renamed from: a, reason: collision with root package name */
    private Long f42580a;

    /* renamed from: b, reason: collision with root package name */
    private Long f42581b;

    /* renamed from: c, reason: collision with root package name */
    private Long f42582c;

    /* renamed from: d, reason: collision with root package name */
    private Long f42583d;

    /* renamed from: e, reason: collision with root package name */
    private Long f42584e;

    /* renamed from: f, reason: collision with root package name */
    private Long f42585f;

    public final L3 a(Long l10) {
        this.f42582c = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final L3 b(Long l10) {
        this.f42583d = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final L3 c(Long l10) {
        this.f42580a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final L3 d(Long l10) {
        this.f42584e = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final L3 e(Long l10) {
        this.f42581b = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final L3 f(Long l10) {
        this.f42585f = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final N3 g() {
        return new N3(this, null);
    }
}
