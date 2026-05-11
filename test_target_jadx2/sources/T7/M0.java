package t7;

/* loaded from: classes2.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    private P0 f42586a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f42587b;

    /* renamed from: c, reason: collision with root package name */
    private N3 f42588c;

    public final M0 a(Integer num) {
        this.f42587b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final M0 b(N3 n32) {
        this.f42588c = n32;
        return this;
    }

    public final M0 c(P0 p02) {
        this.f42586a = p02;
        return this;
    }

    public final R0 e() {
        return new R0(this, null);
    }
}
