package io.sentry;

/* loaded from: classes2.dex */
final class Q1 implements InterfaceC3466x {

    /* renamed from: a, reason: collision with root package name */
    private final String f34548a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34549b;

    public Q1(String str, String str2) {
        this.f34548a = str;
        this.f34549b = str2;
    }

    private AbstractC3370a1 a(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.C().d() == null) {
            abstractC3370a1.C().m(new io.sentry.protocol.t());
        }
        io.sentry.protocol.t d10 = abstractC3370a1.C().d();
        if (d10 != null && d10.d() == null && d10.e() == null) {
            d10.f(this.f34549b);
            d10.h(this.f34548a);
        }
        return abstractC3370a1;
    }

    @Override // io.sentry.InterfaceC3466x
    public A1 b(A1 a12, A a10) {
        return (A1) a(a12);
    }

    @Override // io.sentry.InterfaceC3466x
    public io.sentry.protocol.y e(io.sentry.protocol.y yVar, A a10) {
        return (io.sentry.protocol.y) a(yVar);
    }

    public Q1() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
