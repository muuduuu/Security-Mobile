package r7;

/* loaded from: classes2.dex */
final class F0 extends AbstractC4160n0 {

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC4160n0 f39361f = new F0(null, new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f39362d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f39363e;

    private F0(Object obj, Object[] objArr, int i10) {
        this.f39362d = objArr;
        this.f39363e = i10;
    }

    static F0 g(int i10, Object[] objArr, AbstractC4150m0 abstractC4150m0) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        Q.b(obj, obj2);
        return new F0(null, objArr, 1);
    }

    @Override // r7.AbstractC4160n0
    final AbstractC4090g0 a() {
        return new E0(this.f39362d, 1, this.f39363e);
    }

    @Override // r7.AbstractC4160n0
    final AbstractC4170o0 d() {
        return new C0(this, this.f39362d, 0, this.f39363e);
    }

    @Override // r7.AbstractC4160n0
    final AbstractC4170o0 e() {
        return new D0(this, new E0(this.f39362d, 0, this.f39363e));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020 A[RETURN] */
    @Override // r7.AbstractC4160n0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f39362d;
        int i10 = this.f39363e;
        if (obj != null && i10 == 1) {
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
                if (obj2 != null) {
                    return null;
                }
                return obj2;
            }
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f39363e;
    }
}
