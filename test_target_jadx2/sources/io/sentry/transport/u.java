package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* loaded from: classes2.dex */
final class u extends Authenticator {

    /* renamed from: a, reason: collision with root package name */
    private final String f35536a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35537b;

    u(String str, String str2) {
        this.f35536a = (String) io.sentry.util.n.c(str, "user is required");
        this.f35537b = (String) io.sentry.util.n.c(str2, "password is required");
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f35536a, this.f35537b.toCharArray());
        }
        return null;
    }
}
