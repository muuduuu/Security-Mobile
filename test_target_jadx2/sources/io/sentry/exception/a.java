package io.sentry.exception;

import io.sentry.protocol.j;
import io.sentry.util.n;

/* loaded from: classes2.dex */
public final class a extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final j f35116a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f35117b;

    /* renamed from: c, reason: collision with root package name */
    private final Thread f35118c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35119d;

    public a(j jVar, Throwable th, Thread thread, boolean z10) {
        this.f35116a = (j) n.c(jVar, "Mechanism is required.");
        this.f35117b = (Throwable) n.c(th, "Throwable is required.");
        this.f35118c = (Thread) n.c(thread, "Thread is required.");
        this.f35119d = z10;
    }

    public j a() {
        return this.f35116a;
    }

    public Thread b() {
        return this.f35118c;
    }

    public Throwable c() {
        return this.f35117b;
    }

    public boolean d() {
        return this.f35119d;
    }

    public a(j jVar, Throwable th, Thread thread) {
        this(jVar, th, thread, false);
    }
}
