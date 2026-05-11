package t7;

/* loaded from: classes2.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    private EnumC4721l4 f42609a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f42610b;

    /* renamed from: c, reason: collision with root package name */
    private V3 f42611c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f42612d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f42613e;

    public final N0 a(Integer num) {
        this.f42612d = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final N0 b(V3 v32) {
        this.f42611c = v32;
        return this;
    }

    public final N0 c(EnumC4721l4 enumC4721l4) {
        this.f42609a = enumC4721l4;
        return this;
    }

    public final N0 d(Boolean bool) {
        this.f42610b = bool;
        return this;
    }

    public final N0 e(Integer num) {
        this.f42613e = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final P0 f() {
        return new P0(this, null);
    }
}
