package n7;

import java.util.Objects;

/* loaded from: classes2.dex */
final class k extends i {

    /* renamed from: f, reason: collision with root package name */
    static final i f37582f = new k(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f37583d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f37584e;

    k(Object[] objArr, int i10) {
        this.f37583d = objArr;
        this.f37584e = i10;
    }

    @Override // n7.d
    final Object[] c() {
        return this.f37583d;
    }

    @Override // n7.d
    final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        s.b(i10, this.f37584e, "index");
        Object obj = this.f37583d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // n7.d
    final int h() {
        return this.f37584e;
    }

    @Override // n7.i, n7.d
    final int j(Object[] objArr, int i10) {
        Object[] objArr2 = this.f37583d;
        int i11 = this.f37584e;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37584e;
    }
}
