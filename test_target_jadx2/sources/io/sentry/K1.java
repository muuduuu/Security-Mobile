package io.sentry;

import java.util.Locale;

/* loaded from: classes2.dex */
public enum K1 implements InterfaceC3421j0 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    static final class a implements Z {
        a() {
        }

        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public K1 a(C3409f0 c3409f0, ILogger iLogger) {
            return K1.valueOf(c3409f0.x().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.b(name().toLowerCase(Locale.ROOT));
    }
}
