package r7;

/* renamed from: r7.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4120j0 extends AbstractC4268y {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4140l0 f40083c;

    C4120j0(AbstractC4140l0 abstractC4140l0, int i10) {
        super(abstractC4140l0.size(), i10);
        this.f40083c = abstractC4140l0;
    }

    @Override // r7.AbstractC4268y
    protected final Object a(int i10) {
        return this.f40083c.get(i10);
    }
}
