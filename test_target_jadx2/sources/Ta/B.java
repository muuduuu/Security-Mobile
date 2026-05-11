package Ta;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final B f9505a = new B();

    /* renamed from: b, reason: collision with root package name */
    private static final String f9506b = "ExpoImage";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9507c = "load new image";

    /* renamed from: d, reason: collision with root package name */
    private static int f9508d;

    private B() {
    }

    public final String a() {
        return f9507c;
    }

    public final int b() {
        int i10;
        synchronized (this) {
            i10 = f9508d;
            f9508d = i10 + 1;
        }
        return i10;
    }

    public final String c() {
        return f9506b;
    }
}
