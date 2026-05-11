package s7;

/* loaded from: classes2.dex */
final class S5 extends N5 {

    /* renamed from: e, reason: collision with root package name */
    static final N5 f41043e = new S5(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f41044c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f41045d;

    S5(Object[] objArr, int i10) {
        this.f41044c = objArr;
        this.f41045d = i10;
    }

    @Override // s7.N5, s7.M4
    final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f41044c, 0, objArr, 0, this.f41045d);
        return this.f41045d;
    }

    @Override // s7.M4
    final int e() {
        return this.f41045d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f41045d, "index");
        Object obj = this.f41044c[i10];
        obj.getClass();
        return obj;
    }

    @Override // s7.M4
    final int h() {
        return 0;
    }

    @Override // s7.M4
    final Object[] j() {
        return this.f41044c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41045d;
    }
}
