package io.sentry.android.core;

import io.sentry.A1;
import io.sentry.InterfaceC3430m0;
import io.sentry.InterfaceC3466x;
import io.sentry.c2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class g0 implements InterfaceC3466x {

    /* renamed from: a, reason: collision with root package name */
    private boolean f34843a = false;

    /* renamed from: b, reason: collision with root package name */
    private final C3378h f34844b;

    /* renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f34845c;

    g0(SentryAndroidOptions sentryAndroidOptions, C3378h c3378h) {
        this.f34845c = (SentryAndroidOptions) io.sentry.util.n.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f34844b = (C3378h) io.sentry.util.n.c(c3378h, "ActivityFramesTracker is required");
    }

    private boolean a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            io.sentry.protocol.u uVar = (io.sentry.protocol.u) it.next();
            if (uVar.b().contentEquals("app.start.cold") || uVar.b().contentEquals("app.start.warm")) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.InterfaceC3466x
    public A1 b(A1 a12, io.sentry.A a10) {
        return a12;
    }

    @Override // io.sentry.InterfaceC3466x
    public synchronized io.sentry.protocol.y e(io.sentry.protocol.y yVar, io.sentry.A a10) {
        Map q10;
        Long b10;
        try {
            if (!this.f34845c.isTracingEnabled()) {
                return yVar;
            }
            if (!this.f34843a && a(yVar.o0()) && (b10 = L.e().b()) != null) {
                yVar.m0().put(L.e().f().booleanValue() ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.i(Float.valueOf(b10.longValue()), InterfaceC3430m0.a.MILLISECOND.apiName()));
                this.f34843a = true;
            }
            io.sentry.protocol.r G10 = yVar.G();
            c2 e10 = yVar.C().e();
            if (G10 != null && e10 != null && e10.b().contentEquals("ui.load") && (q10 = this.f34844b.q(G10)) != null) {
                yVar.m0().putAll(q10);
            }
            return yVar;
        } catch (Throwable th) {
            throw th;
        }
    }
}
