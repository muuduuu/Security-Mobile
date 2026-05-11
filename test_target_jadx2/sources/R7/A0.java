package r7;

/* loaded from: classes2.dex */
final class A0 extends AbstractC4140l0 {

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC4140l0 f39259f = new A0(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f39260d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f39261e;

    A0(Object[] objArr, int i10) {
        this.f39260d = objArr;
        this.f39261e = i10;
    }

    @Override // r7.AbstractC4140l0, r7.AbstractC4090g0
    final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f39260d, 0, objArr, i10, this.f39261e);
        return i10 + this.f39261e;
    }

    @Override // r7.AbstractC4090g0
    final int e() {
        return this.f39261e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC4248w.a(i10, this.f39261e, "index");
        Object obj = this.f39260d[i10];
        obj.getClass();
        return obj;
    }

    @Override // r7.AbstractC4090g0
    final int h() {
        return 0;
    }

    @Override // r7.AbstractC4090g0
    final Object[] j() {
        return this.f39260d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39261e;
    }
}
