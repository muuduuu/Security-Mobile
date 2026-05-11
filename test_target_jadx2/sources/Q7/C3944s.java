package q7;

/* renamed from: q7.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3944s extends AbstractC3939m {

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC3939m f38819f = new C3944s(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f38820d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f38821e;

    C3944s(Object[] objArr, int i10) {
        this.f38820d = objArr;
        this.f38821e = i10;
    }

    @Override // q7.AbstractC3939m, q7.AbstractC3936j
    final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f38820d, 0, objArr, 0, this.f38821e);
        return this.f38821e;
    }

    @Override // q7.AbstractC3936j
    final int e() {
        return this.f38821e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC3929c.a(i10, this.f38821e, "index");
        Object obj = this.f38820d[i10];
        obj.getClass();
        return obj;
    }

    @Override // q7.AbstractC3936j
    final int h() {
        return 0;
    }

    @Override // q7.AbstractC3936j
    final Object[] j() {
        return this.f38820d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38821e;
    }
}
