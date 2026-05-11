package r7;

import java.util.Map;

/* loaded from: classes2.dex */
final class Z extends L {

    /* renamed from: a, reason: collision with root package name */
    private final Object f39874a;

    /* renamed from: b, reason: collision with root package name */
    private int f39875b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4040b0 f39876c;

    Z(C4040b0 c4040b0, int i10) {
        this.f39876c = c4040b0;
        Object[] objArr = c4040b0.f39912c;
        objArr.getClass();
        this.f39874a = objArr[i10];
        this.f39875b = i10;
    }

    private final void a() {
        int r10;
        int i10 = this.f39875b;
        if (i10 != -1 && i10 < this.f39876c.size()) {
            Object obj = this.f39874a;
            C4040b0 c4040b0 = this.f39876c;
            int i11 = this.f39875b;
            Object[] objArr = c4040b0.f39912c;
            objArr.getClass();
            if (r.a(obj, objArr[i11])) {
                return;
            }
        }
        r10 = this.f39876c.r(this.f39874a);
        this.f39875b = r10;
    }

    @Override // r7.L, java.util.Map.Entry
    public final Object getKey() {
        return this.f39874a;
    }

    @Override // r7.L, java.util.Map.Entry
    public final Object getValue() {
        Map j10 = this.f39876c.j();
        if (j10 != null) {
            return j10.get(this.f39874a);
        }
        a();
        int i10 = this.f39875b;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = this.f39876c.f39913d;
        objArr.getClass();
        return objArr[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map j10 = this.f39876c.j();
        if (j10 != null) {
            return j10.put(this.f39874a, obj);
        }
        a();
        int i10 = this.f39875b;
        if (i10 == -1) {
            this.f39876c.put(this.f39874a, obj);
            return null;
        }
        Object[] objArr = this.f39876c.f39913d;
        objArr.getClass();
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }
}
