package t7;

/* renamed from: t7.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4710k0 extends S {

    /* renamed from: f, reason: collision with root package name */
    static final S f43027f = new C4710k0(null, new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f43028d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f43029e;

    private C4710k0(Object obj, Object[] objArr, int i10) {
        this.f43028d = objArr;
        this.f43029e = i10;
    }

    static C4710k0 g(int i10, Object[] objArr, Q q10) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        AbstractC4785v.b(obj, obj2);
        return new C4710k0(null, objArr, 1);
    }

    @Override // t7.S
    final K a() {
        return new C4703j0(this.f43028d, 1, this.f43029e);
    }

    @Override // t7.S
    final T d() {
        return new C4689h0(this, this.f43028d, 0, this.f43029e);
    }

    @Override // t7.S
    final T e() {
        return new C4696i0(this, new C4703j0(this.f43028d, 0, this.f43029e));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020 A[RETURN] */
    @Override // t7.S, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f43028d;
        int i10 = this.f43029e;
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
        return this.f43029e;
    }
}
