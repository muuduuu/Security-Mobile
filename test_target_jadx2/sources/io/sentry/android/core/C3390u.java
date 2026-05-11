package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C3433n0;
import io.sentry.F0;

/* renamed from: io.sentry.android.core.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3390u implements io.sentry.I {
    @Override // io.sentry.I
    public void a(F0 f02) {
        f02.b(new C3433n0(System.currentTimeMillis(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(), Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize()));
    }

    @Override // io.sentry.I
    public void b() {
    }
}
