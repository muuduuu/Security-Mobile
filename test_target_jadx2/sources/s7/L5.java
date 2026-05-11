package s7;

/* loaded from: classes2.dex */
final class L5 extends I2 {

    /* renamed from: c, reason: collision with root package name */
    private final N5 f40962c;

    L5(N5 n52, int i10) {
        super(n52.size(), i10);
        this.f40962c = n52;
    }

    @Override // s7.I2
    protected final Object a(int i10) {
        return this.f40962c.get(i10);
    }
}
