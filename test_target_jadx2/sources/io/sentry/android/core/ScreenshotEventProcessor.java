package io.sentry.android.core;

import android.app.Activity;
import io.sentry.A1;
import io.sentry.C3396b;
import io.sentry.InterfaceC3466x;
import io.sentry.K1;

/* loaded from: classes2.dex */
public final class ScreenshotEventProcessor implements InterfaceC3466x, io.sentry.X {

    /* renamed from: a, reason: collision with root package name */
    private final SentryAndroidOptions f34755a;

    /* renamed from: b, reason: collision with root package name */
    private final N f34756b;

    /* renamed from: c, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.g f34757c = new io.sentry.android.core.internal.util.g(io.sentry.android.core.internal.util.a.b(), 2000);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, N n10) {
        this.f34755a = (SentryAndroidOptions) io.sentry.util.n.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f34756b = (N) io.sentry.util.n.c(n10, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            a();
        }
    }

    @Override // io.sentry.InterfaceC3466x
    public A1 b(A1 a12, io.sentry.A a10) {
        if (!a12.w0()) {
            return a12;
        }
        if (!this.f34755a.isAttachScreenshot()) {
            this.f34755a.getLogger().c(K1.DEBUG, "attachScreenshot is disabled.", new Object[0]);
            return a12;
        }
        Activity b10 = Q.c().b();
        if (b10 != null && !io.sentry.util.j.i(a10)) {
            boolean a11 = this.f34757c.a();
            this.f34755a.getBeforeScreenshotCaptureCallback();
            if (a11) {
                return a12;
            }
            byte[] d10 = io.sentry.android.core.internal.util.n.d(b10, this.f34755a.getMainThreadChecker(), this.f34755a.getLogger(), this.f34756b);
            if (d10 == null) {
                return a12;
            }
            a10.l(C3396b.a(d10));
            a10.k("android:activity", b10);
        }
        return a12;
    }
}
