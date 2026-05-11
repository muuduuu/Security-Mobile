package t7;

/* renamed from: t7.b4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4651b4 {

    /* renamed from: a, reason: collision with root package name */
    private Long f42838a;

    /* renamed from: b, reason: collision with root package name */
    private EnumC4721l4 f42839b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f42840c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f42841d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f42842e;

    public final C4651b4 a(Boolean bool) {
        this.f42841d = bool;
        return this;
    }

    public final C4651b4 b(Boolean bool) {
        this.f42842e = bool;
        return this;
    }

    public final C4651b4 c(Long l10) {
        this.f42838a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C4651b4 d(EnumC4721l4 enumC4721l4) {
        this.f42839b = enumC4721l4;
        return this;
    }

    public final C4651b4 e(Boolean bool) {
        this.f42840c = bool;
        return this;
    }

    public final C4665d4 f() {
        return new C4665d4(this, null);
    }
}
