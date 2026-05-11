package io.sentry;

import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes2.dex */
final class h2 {

    /* renamed from: a, reason: collision with root package name */
    private final Deque f35139a;

    /* renamed from: b, reason: collision with root package name */
    private final ILogger f35140b;

    public h2(ILogger iLogger, a aVar) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.f35139a = linkedBlockingDeque;
        this.f35140b = (ILogger) io.sentry.util.n.c(iLogger, "logger is required");
        linkedBlockingDeque.push((a) io.sentry.util.n.c(aVar, "rootStackItem is required"));
    }

    a a() {
        return (a) this.f35139a.peek();
    }

    void b() {
        synchronized (this.f35139a) {
            try {
                if (this.f35139a.size() != 1) {
                    this.f35139a.pop();
                } else {
                    this.f35140b.c(K1.WARNING, "Attempt to pop the root scope.", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void c(a aVar) {
        this.f35139a.push(aVar);
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final P1 f35141a;

        /* renamed from: b, reason: collision with root package name */
        private volatile O f35142b;

        /* renamed from: c, reason: collision with root package name */
        private volatile O0 f35143c;

        a(P1 p12, O o10, O0 o02) {
            this.f35142b = (O) io.sentry.util.n.c(o10, "ISentryClient is required.");
            this.f35143c = (O0) io.sentry.util.n.c(o02, "Scope is required.");
            this.f35141a = (P1) io.sentry.util.n.c(p12, "Options is required");
        }

        public O a() {
            return this.f35142b;
        }

        public P1 b() {
            return this.f35141a;
        }

        public O0 c() {
            return this.f35143c;
        }

        a(a aVar) {
            this.f35141a = aVar.f35141a;
            this.f35142b = aVar.f35142b;
            this.f35143c = new O0(aVar.f35143c);
        }
    }

    public h2(h2 h2Var) {
        this(h2Var.f35140b, new a((a) h2Var.f35139a.getLast()));
        Iterator descendingIterator = h2Var.f35139a.descendingIterator();
        if (descendingIterator.hasNext()) {
            descendingIterator.next();
        }
        while (descendingIterator.hasNext()) {
            c(new a((a) descendingIterator.next()));
        }
    }
}
