package io.sentry;

/* loaded from: classes2.dex */
public final class Z0 implements InterfaceC3413g1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3413g1 f34599a;

    public Z0() {
        if (a()) {
            this.f34599a = new H1();
        } else {
            this.f34599a = new O1();
        }
    }

    private static boolean a() {
        return io.sentry.util.p.b() && io.sentry.util.p.a();
    }

    @Override // io.sentry.InterfaceC3413g1
    public AbstractC3410f1 now() {
        return this.f34599a.now();
    }
}
