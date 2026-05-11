package io.sentry.android.core.internal.util;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class a implements io.sentry.transport.o {

    /* renamed from: a, reason: collision with root package name */
    private static final io.sentry.transport.o f34910a = new a();

    private a() {
    }

    public static io.sentry.transport.o b() {
        return f34910a;
    }

    @Override // io.sentry.transport.o
    public long a() {
        return SystemClock.uptimeMillis();
    }
}
