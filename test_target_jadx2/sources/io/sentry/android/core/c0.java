package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f34830a;

    c0() {
        this(Looper.getMainLooper());
    }

    public Thread a() {
        return this.f34830a.getLooper().getThread();
    }

    public void b(Runnable runnable) {
        this.f34830a.post(runnable);
    }

    c0(Looper looper) {
        this.f34830a = new Handler(looper);
    }
}
