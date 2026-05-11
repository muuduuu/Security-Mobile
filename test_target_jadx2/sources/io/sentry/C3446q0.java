package io.sentry;

/* renamed from: io.sentry.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3446q0 implements ILogger {

    /* renamed from: a, reason: collision with root package name */
    private static final C3446q0 f35478a = new C3446q0();

    private C3446q0() {
    }

    public static C3446q0 e() {
        return f35478a;
    }

    @Override // io.sentry.ILogger
    public void a(K1 k12, Throwable th, String str, Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public void b(K1 k12, String str, Throwable th) {
    }

    @Override // io.sentry.ILogger
    public void c(K1 k12, String str, Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public boolean d(K1 k12) {
        return false;
    }
}
