package t7;

/* renamed from: t7.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4703j0 extends P {

    /* renamed from: c, reason: collision with root package name */
    private final transient Object[] f43012c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f43013d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f43014e;

    C4703j0(Object[] objArr, int i10, int i11) {
        this.f43012c = objArr;
        this.f43013d = i10;
        this.f43014e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC4653c.a(i10, this.f43014e, "index");
        Object obj = this.f43012c[i10 + i10 + this.f43013d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43014e;
    }
}
