package io.sentry;

import java.security.SecureRandom;

/* loaded from: classes2.dex */
final class m2 {

    /* renamed from: c, reason: collision with root package name */
    private static final Double f35213c = Double.valueOf(1.0d);

    /* renamed from: a, reason: collision with root package name */
    private final P1 f35214a;

    /* renamed from: b, reason: collision with root package name */
    private final SecureRandom f35215b;

    public m2(P1 p12) {
        this((P1) io.sentry.util.n.c(p12, "options are required"), new SecureRandom());
    }

    private boolean b(Double d10) {
        return d10.doubleValue() >= this.f35215b.nextDouble();
    }

    n2 a(N0 n02) {
        n2 g10 = n02.a().g();
        if (g10 != null) {
            return g10;
        }
        this.f35214a.getProfilesSampler();
        Double profilesSampleRate = this.f35214a.getProfilesSampleRate();
        Boolean valueOf = Boolean.valueOf(profilesSampleRate != null && b(profilesSampleRate));
        this.f35214a.getTracesSampler();
        n2 u10 = n02.a().u();
        if (u10 != null) {
            return u10;
        }
        Double tracesSampleRate = this.f35214a.getTracesSampleRate();
        Double d10 = Boolean.TRUE.equals(this.f35214a.getEnableTracing()) ? f35213c : null;
        if (tracesSampleRate == null) {
            tracesSampleRate = d10;
        }
        if (tracesSampleRate != null) {
            return new n2(Boolean.valueOf(b(tracesSampleRate)), tracesSampleRate, valueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new n2(bool, null, bool, null);
    }

    m2(P1 p12, SecureRandom secureRandom) {
        this.f35214a = p12;
        this.f35215b = secureRandom;
    }
}
