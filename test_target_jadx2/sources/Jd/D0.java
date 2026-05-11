package Jd;

/* loaded from: classes3.dex */
public abstract class D0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Od.D f4987a = new Od.D("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final Od.D f4988b = new Od.D("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final Od.D f4989c = new Od.D("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final Od.D f4990d = new Od.D("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final Od.D f4991e = new Od.D("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final C0880e0 f4992f = new C0880e0(false);

    /* renamed from: g, reason: collision with root package name */
    private static final C0880e0 f4993g = new C0880e0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC0905r0 ? new C0907s0((InterfaceC0905r0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC0905r0 interfaceC0905r0;
        C0907s0 c0907s0 = obj instanceof C0907s0 ? (C0907s0) obj : null;
        return (c0907s0 == null || (interfaceC0905r0 = c0907s0.f5062a) == null) ? obj : interfaceC0905r0;
    }
}
