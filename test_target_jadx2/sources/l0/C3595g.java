package l0;

/* renamed from: l0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3595g implements InterfaceC3594f {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f36948a;

    /* renamed from: b, reason: collision with root package name */
    private int f36949b;

    C3595g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f36948a = new Object[i10];
    }

    @Override // l0.InterfaceC3594f
    public boolean a(Object obj) {
        int i10 = this.f36949b;
        Object[] objArr = this.f36948a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f36949b = i10 + 1;
        return true;
    }

    @Override // l0.InterfaceC3594f
    public Object b() {
        int i10 = this.f36949b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f36948a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f36949b = i10 - 1;
        return obj;
    }

    @Override // l0.InterfaceC3594f
    public void c(Object[] objArr, int i10) {
        if (i10 > objArr.length) {
            i10 = objArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            int i12 = this.f36949b;
            Object[] objArr2 = this.f36948a;
            if (i12 < objArr2.length) {
                objArr2[i12] = obj;
                this.f36949b = i12 + 1;
            }
        }
    }
}
