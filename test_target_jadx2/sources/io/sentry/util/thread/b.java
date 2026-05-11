package io.sentry.util.thread;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f35566a = Thread.currentThread().getId();

    /* renamed from: b, reason: collision with root package name */
    private static final b f35567b = new b();

    private b() {
    }

    public static b e() {
        return f35567b;
    }

    @Override // io.sentry.util.thread.a
    public boolean a(long j10) {
        return f35566a == j10;
    }
}
