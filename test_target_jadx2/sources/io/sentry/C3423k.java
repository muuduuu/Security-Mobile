package io.sentry;

import io.sentry.UncaughtExceptionHandlerIntegration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3423k implements InterfaceC3466x {

    /* renamed from: a, reason: collision with root package name */
    private final Map f35177a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b, reason: collision with root package name */
    private final P1 f35178b;

    public C3423k(P1 p12) {
        this.f35178b = p12;
    }

    @Override // io.sentry.InterfaceC3466x
    public A1 b(A1 a12, A a10) {
        if (!io.sentry.util.j.h(a10, UncaughtExceptionHandlerIntegration.a.class)) {
            return a12;
        }
        io.sentry.protocol.q u02 = a12.u0();
        if (u02 == null) {
            return a12;
        }
        String i10 = u02.i();
        if (i10 == null) {
            return a12;
        }
        Long h10 = u02.h();
        if (h10 == null) {
            return a12;
        }
        Long l10 = (Long) this.f35177a.get(i10);
        if (l10 == null || l10.equals(h10)) {
            this.f35177a.put(i10, h10);
            return a12;
        }
        this.f35178b.getLogger().c(K1.INFO, "Event %s has been dropped due to multi-threaded deduplication", a12.G());
        io.sentry.util.j.r(a10, io.sentry.hints.g.MULTITHREADED_DEDUPLICATION);
        return null;
    }
}
