package Jd;

/* loaded from: classes3.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Q0 f5006a = new Q0();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f5007b = Od.L.a(new Od.D("ThreadLocalEventLoop"));

    private Q0() {
    }

    public final AbstractC0882f0 a() {
        return (AbstractC0882f0) f5007b.get();
    }

    public final AbstractC0882f0 b() {
        ThreadLocal threadLocal = f5007b;
        AbstractC0882f0 abstractC0882f0 = (AbstractC0882f0) threadLocal.get();
        if (abstractC0882f0 != null) {
            return abstractC0882f0;
        }
        AbstractC0882f0 a10 = AbstractC0888i0.a();
        threadLocal.set(a10);
        return a10;
    }

    public final void c() {
        f5007b.set(null);
    }

    public final void d(AbstractC0882f0 abstractC0882f0) {
        f5007b.set(abstractC0882f0);
    }
}
