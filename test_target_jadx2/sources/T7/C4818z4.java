package t7;

/* renamed from: t7.z4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4818z4 {

    /* renamed from: a, reason: collision with root package name */
    private C4665d4 f43323a;

    /* renamed from: b, reason: collision with root package name */
    private Z3 f43324b;

    /* renamed from: c, reason: collision with root package name */
    private V3 f43325c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f43326d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f43327e;

    public final C4818z4 d(Integer num) {
        this.f43326d = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C4818z4 e(V3 v32) {
        this.f43325c = v32;
        return this;
    }

    public final C4818z4 f(Z3 z32) {
        this.f43324b = z32;
        return this;
    }

    public final C4818z4 g(C4665d4 c4665d4) {
        this.f43323a = c4665d4;
        return this;
    }

    public final C4818z4 h(Integer num) {
        this.f43327e = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final B4 i() {
        return new B4(this, null);
    }
}
