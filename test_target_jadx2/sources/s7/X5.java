package s7;

/* loaded from: classes2.dex */
final class X5 extends P5 {

    /* renamed from: f, reason: collision with root package name */
    static final P5 f41111f = new X5(null, new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f41112d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f41113e;

    private X5(Object obj, Object[] objArr, int i10) {
        this.f41112d = objArr;
        this.f41113e = i10;
    }

    static X5 g(int i10, Object[] objArr, O5 o52) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        AbstractC4393j3.a(obj, obj2);
        return new X5(null, objArr, 1);
    }

    @Override // s7.P5
    final M4 a() {
        return new W5(this.f41112d, 1, this.f41113e);
    }

    @Override // s7.P5
    final Q5 d() {
        return new U5(this, this.f41112d, 0, this.f41113e);
    }

    @Override // s7.P5
    final Q5 e() {
        return new V5(this, new W5(this.f41112d, 0, this.f41113e));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020 A[RETURN] */
    @Override // s7.P5, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f41112d;
        int i10 = this.f41113e;
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
        return this.f41113e;
    }
}
