package q7;

/* renamed from: q7.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3948w extends AbstractC3939m {

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f38828d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f38829e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f38830f;

    C3948w(Object[] objArr, int i10, int i11) {
        this.f38828d = objArr;
        this.f38829e = i10;
        this.f38830f = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC3929c.a(i10, this.f38830f, "index");
        Object obj = this.f38828d[i10 + i10 + this.f38829e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38830f;
    }
}
