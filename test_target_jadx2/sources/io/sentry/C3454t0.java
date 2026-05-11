package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: io.sentry.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3454t0 implements P {

    /* renamed from: a, reason: collision with root package name */
    private static final C3454t0 f35494a = new C3454t0();

    private C3454t0() {
    }

    public static P e() {
        return f35494a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object f() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    @Override // io.sentry.P
    public void a(long j10) {
    }

    @Override // io.sentry.P
    public Future b(Runnable runnable, long j10) {
        return new FutureTask(new Callable() { // from class: io.sentry.s0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object f10;
                f10 = C3454t0.f();
                return f10;
            }
        });
    }

    @Override // io.sentry.P
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.P
    public Future submit(Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.r0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object g10;
                g10 = C3454t0.g();
                return g10;
            }
        });
    }
}
