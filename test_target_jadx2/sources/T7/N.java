package t7;

/* loaded from: classes2.dex */
final class N extends AbstractC4667e {

    /* renamed from: c, reason: collision with root package name */
    private final P f42608c;

    N(P p10, int i10) {
        super(p10.size(), i10);
        this.f42608c = p10;
    }

    @Override // t7.AbstractC4667e
    protected final Object a(int i10) {
        return this.f42608c.get(i10);
    }
}
