package p7;

/* loaded from: classes2.dex */
final class w0 extends v0 {

    /* renamed from: e, reason: collision with root package name */
    static final v0 f38472e = new w0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f38473c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f38474d;

    w0(Object[] objArr, int i10) {
        this.f38473c = objArr;
        this.f38474d = i10;
    }

    @Override // p7.v0, p7.s0
    final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f38473c, 0, objArr, 0, this.f38474d);
        return this.f38474d;
    }

    @Override // p7.s0
    final int e() {
        return this.f38474d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        p0.a(i10, this.f38474d, "index");
        Object obj = this.f38473c[i10];
        obj.getClass();
        return obj;
    }

    @Override // p7.s0
    final int h() {
        return 0;
    }

    @Override // p7.s0
    final boolean k() {
        return false;
    }

    @Override // p7.s0
    final Object[] m() {
        return this.f38473c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38474d;
    }
}
