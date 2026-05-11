package io.sentry;

/* renamed from: io.sentry.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3368a implements V {
    @Override // io.sentry.V
    public io.sentry.transport.p a(P1 p12, L0 l02) {
        io.sentry.util.n.c(p12, "options is required");
        io.sentry.util.n.c(l02, "requestDetails is required");
        return new io.sentry.transport.d(p12, new io.sentry.transport.y(p12), p12.getTransportGate(), l02);
    }
}
