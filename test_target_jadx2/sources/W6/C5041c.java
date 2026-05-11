package w6;

/* renamed from: w6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5041c implements InterfaceC5040b {

    /* renamed from: b, reason: collision with root package name */
    private static final C5041c f44334b = new C5041c(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f44335a;

    private C5041c(Object obj) {
        this.f44335a = obj;
    }

    public static InterfaceC5040b a(Object obj) {
        return new C5041c(AbstractC5042d.c(obj, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f44335a;
    }
}
