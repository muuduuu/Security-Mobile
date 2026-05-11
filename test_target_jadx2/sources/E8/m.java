package e8;

/* loaded from: classes2.dex */
public final class m implements l {

    /* renamed from: b, reason: collision with root package name */
    private static final m f32287b = new m(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f32288a;

    private m(Object obj) {
        this.f32288a = obj;
    }

    public static l b(Object obj) {
        if (obj != null) {
            return new m(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // e8.o
    public final Object a() {
        return this.f32288a;
    }
}
