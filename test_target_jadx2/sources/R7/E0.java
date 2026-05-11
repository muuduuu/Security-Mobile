package r7;

/* loaded from: classes2.dex */
final class E0 extends AbstractC4140l0 {

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f39344d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f39345e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f39346f;

    E0(Object[] objArr, int i10, int i11) {
        this.f39344d = objArr;
        this.f39345e = i10;
        this.f39346f = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC4248w.a(i10, this.f39346f, "index");
        Object obj = this.f39344d[i10 + i10 + this.f39345e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39346f;
    }
}
