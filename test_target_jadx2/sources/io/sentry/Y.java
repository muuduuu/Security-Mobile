package io.sentry;

/* loaded from: classes2.dex */
public final class Y implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Runtime f34594a = Runtime.getRuntime();

    @Override // io.sentry.I
    public void a(F0 f02) {
        f02.b(new C3433n0(System.currentTimeMillis(), this.f34594a.totalMemory() - this.f34594a.freeMemory()));
    }

    @Override // io.sentry.I
    public void b() {
    }
}
