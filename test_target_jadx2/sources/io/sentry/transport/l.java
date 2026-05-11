package io.sentry.transport;

import java.net.Authenticator;

/* loaded from: classes2.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final l f35526a = new l();

    private l() {
    }

    public static l a() {
        return f35526a;
    }

    public void b(Authenticator authenticator) {
        Authenticator.setDefault(authenticator);
    }
}
