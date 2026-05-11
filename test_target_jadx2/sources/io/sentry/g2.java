package io.sentry;

import java.util.Locale;

/* loaded from: classes2.dex */
public enum g2 implements InterfaceC3421j0 {
    OK(200, 299),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g2 a(C3409f0 c3409f0, ILogger iLogger) {
            return g2.valueOf(c3409f0.x().toUpperCase(Locale.ROOT));
        }
    }

    g2(int i10) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i10;
    }

    public static g2 fromHttpStatusCode(int i10) {
        for (g2 g2Var : values()) {
            if (g2Var.matches(i10)) {
                return g2Var;
            }
        }
        return null;
    }

    private boolean matches(int i10) {
        return i10 >= this.minHttpStatusCode && i10 <= this.maxHttpStatusCode;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.b(name().toLowerCase(Locale.ROOT));
    }

    public static g2 fromHttpStatusCode(Integer num, g2 g2Var) {
        g2 fromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : g2Var;
        return fromHttpStatusCode != null ? fromHttpStatusCode : g2Var;
    }

    g2(int i10, int i11) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i11;
    }
}
