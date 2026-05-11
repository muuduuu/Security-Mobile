package io.sentry;

import java.util.UUID;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class e2 implements InterfaceC3421j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e2 f35114b = new e2(new UUID(0, 0));

    /* renamed from: a, reason: collision with root package name */
    private final String f35115a;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e2 a(C3409f0 c3409f0, ILogger iLogger) {
            return new e2(c3409f0.x());
        }
    }

    public e2(String str) {
        this.f35115a = (String) io.sentry.util.n.c(str, "value is required");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e2.class != obj.getClass()) {
            return false;
        }
        return this.f35115a.equals(((e2) obj).f35115a);
    }

    public int hashCode() {
        return this.f35115a.hashCode();
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.b(this.f35115a);
    }

    public String toString() {
        return this.f35115a;
    }

    public e2() {
        this(UUID.randomUUID());
    }

    private e2(UUID uuid) {
        this(io.sentry.util.r.d(uuid.toString()).replace("-", BuildConfig.FLAVOR).substring(0, 16));
    }
}
