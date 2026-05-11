package t7;

/* loaded from: classes2.dex */
public final class W3 {

    /* renamed from: a, reason: collision with root package name */
    private X3 f42758a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f42759b;

    public final W3 a(X3 x32) {
        this.f42758a = x32;
        return this;
    }

    public final W3 b(Integer num) {
        this.f42759b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final Z3 d() {
        return new Z3(this, null);
    }
}
