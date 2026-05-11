package q7;

/* renamed from: q7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3937k extends AbstractC3931e {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3939m f38803c;

    C3937k(AbstractC3939m abstractC3939m, int i10) {
        super(abstractC3939m.size(), i10);
        this.f38803c = abstractC3939m;
    }

    @Override // q7.AbstractC3931e
    protected final Object a(int i10) {
        return this.f38803c.get(i10);
    }
}
