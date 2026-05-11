package r7;

/* loaded from: classes2.dex */
public final class J5 {

    /* renamed from: a, reason: collision with root package name */
    private K5 f39463a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f39464b;

    public final J5 a(K5 k52) {
        this.f39463a = k52;
        return this;
    }

    public final J5 b(Integer num) {
        this.f39464b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final M5 d() {
        return new M5(this, null);
    }
}
