package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.UUID;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class r implements InterfaceC3421j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final r f35409b = new r(new UUID(0, 0));

    /* renamed from: a, reason: collision with root package name */
    private final UUID f35410a;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a(C3409f0 c3409f0, ILogger iLogger) {
            return new r(c3409f0.x());
        }
    }

    public r() {
        this((UUID) null);
    }

    private UUID a(String str) {
        if (str.length() == 32) {
            str = new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString();
        }
        if (str.length() == 36) {
            return UUID.fromString(str);
        }
        throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && r.class == obj.getClass() && this.f35410a.compareTo(((r) obj).f35410a) == 0;
    }

    public int hashCode() {
        return this.f35410a.hashCode();
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.b(toString());
    }

    public String toString() {
        return io.sentry.util.r.d(this.f35410a.toString()).replace("-", BuildConfig.FLAVOR);
    }

    public r(UUID uuid) {
        this.f35410a = uuid == null ? UUID.randomUUID() : uuid;
    }

    public r(String str) {
        this.f35410a = a(io.sentry.util.r.d(str));
    }
}
