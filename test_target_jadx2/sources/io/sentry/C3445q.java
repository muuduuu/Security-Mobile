package io.sentry;

import java.net.URI;

/* renamed from: io.sentry.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3445q {

    /* renamed from: a, reason: collision with root package name */
    private final String f35473a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35474b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35475c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35476d;

    /* renamed from: e, reason: collision with root package name */
    private final URI f35477e;

    C3445q(String str) {
        try {
            io.sentry.util.n.c(str, "The DSN is required.");
            URI normalize = new URI(str).normalize();
            String userInfo = normalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] split = userInfo.split(":", -1);
            String str2 = split[0];
            this.f35476d = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.f35475c = split.length > 1 ? split[1] : null;
            String path = normalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int lastIndexOf = path.lastIndexOf("/") + 1;
            String substring = path.substring(0, lastIndexOf);
            if (!substring.endsWith("/")) {
                substring = substring + "/";
            }
            this.f35474b = substring;
            String substring2 = path.substring(lastIndexOf);
            this.f35473a = substring2;
            if (substring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            this.f35477e = new URI(normalize.getScheme(), null, normalize.getHost(), normalize.getPort(), substring + "api/" + substring2, null, null);
        } catch (Throwable th) {
            throw new IllegalArgumentException(th);
        }
    }

    public String a() {
        return this.f35476d;
    }

    public String b() {
        return this.f35475c;
    }

    URI c() {
        return this.f35477e;
    }
}
