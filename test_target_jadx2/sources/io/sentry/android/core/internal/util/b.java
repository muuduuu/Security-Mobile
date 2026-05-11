package io.sentry.android.core.internal.util;

import android.os.Looper;

/* loaded from: classes2.dex */
public final class b implements io.sentry.util.thread.a {

    /* renamed from: a, reason: collision with root package name */
    private static final b f34911a = new b();

    private b() {
    }

    public static b e() {
        return f34911a;
    }

    @Override // io.sentry.util.thread.a
    public boolean a(long j10) {
        return Looper.getMainLooper().getThread().getId() == j10;
    }
}
