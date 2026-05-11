package t7;

/* renamed from: t7.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4675f0 extends P {

    /* renamed from: e, reason: collision with root package name */
    static final P f42914e = new C4675f0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f42915c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f42916d;

    C4675f0(Object[] objArr, int i10) {
        this.f42915c = objArr;
        this.f42916d = i10;
    }

    @Override // t7.P, t7.K
    final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f42915c, 0, objArr, 0, this.f42916d);
        return this.f42916d;
    }

    @Override // t7.K
    final int e() {
        return this.f42916d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC4653c.a(i10, this.f42916d, "index");
        Object obj = this.f42915c[i10];
        obj.getClass();
        return obj;
    }

    @Override // t7.K
    final int h() {
        return 0;
    }

    @Override // t7.K
    final Object[] j() {
        return this.f42915c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42916d;
    }
}
