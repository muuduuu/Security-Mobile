package s7;

/* loaded from: classes2.dex */
final class W5 extends N5 {

    /* renamed from: c, reason: collision with root package name */
    private final transient Object[] f41097c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f41098d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f41099e;

    W5(Object[] objArr, int i10, int i11) {
        this.f41097c = objArr;
        this.f41098d = i10;
        this.f41099e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f41099e, "index");
        Object obj = this.f41097c[i10 + i10 + this.f41098d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41099e;
    }
}
