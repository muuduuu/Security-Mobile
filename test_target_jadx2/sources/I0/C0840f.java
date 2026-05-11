package I0;

/* renamed from: I0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0840f extends D {

    /* renamed from: b, reason: collision with root package name */
    private final Object f4029b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4030c;

    public C0840f(Object obj, int i10, int i11) {
        super(i11, null);
        this.f4029b = obj;
        this.f4030c = i10;
    }

    public final void b() {
        Object obj = this.f4029b;
        if ((obj != null ? obj.hashCode() : 0) != this.f4030c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object c() {
        return this.f4029b;
    }
}
