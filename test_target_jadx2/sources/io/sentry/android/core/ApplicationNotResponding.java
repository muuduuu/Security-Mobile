package io.sentry.android.core;

/* loaded from: classes2.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f34679a;

    ApplicationNotResponding(String str, Thread thread) {
        super(str);
        Thread thread2 = (Thread) io.sentry.util.n.c(thread, "Thread must be provided.");
        this.f34679a = thread2;
        setStackTrace(thread2.getStackTrace());
    }

    public Thread a() {
        return this.f34679a;
    }
}
