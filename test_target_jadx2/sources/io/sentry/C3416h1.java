package io.sentry;

import java.util.ArrayList;

/* renamed from: io.sentry.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3416h1 {

    /* renamed from: a, reason: collision with root package name */
    private final C3419i1 f35137a;

    /* renamed from: b, reason: collision with root package name */
    private final Iterable f35138b;

    public C3416h1(C3419i1 c3419i1, Iterable iterable) {
        this.f35137a = (C3419i1) io.sentry.util.n.c(c3419i1, "SentryEnvelopeHeader is required.");
        this.f35138b = (Iterable) io.sentry.util.n.c(iterable, "SentryEnvelope items are required.");
    }

    public static C3416h1 a(Q q10, Z1 z12, io.sentry.protocol.p pVar) {
        io.sentry.util.n.c(q10, "Serializer is required.");
        io.sentry.util.n.c(z12, "session is required.");
        return new C3416h1(null, pVar, C3471y1.u(q10, z12));
    }

    public C3419i1 b() {
        return this.f35137a;
    }

    public Iterable c() {
        return this.f35138b;
    }

    public C3416h1(io.sentry.protocol.r rVar, io.sentry.protocol.p pVar, C3471y1 c3471y1) {
        io.sentry.util.n.c(c3471y1, "SentryEnvelopeItem is required.");
        this.f35137a = new C3419i1(rVar, pVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c3471y1);
        this.f35138b = arrayList;
    }
}
