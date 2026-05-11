package io.sentry;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* loaded from: classes2.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    private final URL f34511a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f34512b;

    public L0(String str, Map map) {
        io.sentry.util.n.c(str, "url is required");
        io.sentry.util.n.c(map, "headers is required");
        try {
            this.f34511a = URI.create(str).toURL();
            this.f34512b = map;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e10);
        }
    }

    public Map a() {
        return this.f34512b;
    }

    public URL b() {
        return this.f34511a;
    }
}
