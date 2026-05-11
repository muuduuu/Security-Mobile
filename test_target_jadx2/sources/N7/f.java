package n7;

/* loaded from: classes2.dex */
final class f extends v {

    /* renamed from: c, reason: collision with root package name */
    private final i f37575c;

    f(i iVar, int i10) {
        super(iVar.size(), i10);
        this.f37575c = iVar;
    }

    @Override // n7.v
    protected final Object a(int i10) {
        return this.f37575c.get(i10);
    }
}
