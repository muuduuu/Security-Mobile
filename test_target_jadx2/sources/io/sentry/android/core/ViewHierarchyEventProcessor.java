package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.A1;
import io.sentry.C3396b;
import io.sentry.ILogger;
import io.sentry.InterfaceC3466x;
import io.sentry.K1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ViewHierarchyEventProcessor implements InterfaceC3466x, io.sentry.X {

    /* renamed from: a, reason: collision with root package name */
    private final SentryAndroidOptions f34793a;

    /* renamed from: b, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.g f34794b = new io.sentry.android.core.internal.util.g(io.sentry.android.core.internal.util.a.b(), 2000);

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.f34793a = (SentryAndroidOptions) io.sentry.util.n.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            a();
        }
    }

    private static void g(View view, io.sentry.protocol.D d10, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    io.sentry.protocol.D k10 = k(childAt);
                    arrayList.add(k10);
                    g(childAt, k10, list);
                }
            }
            d10.m(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, ILogger iLogger) {
        try {
            atomicReference.set(j(view, list));
            countDownLatch.countDown();
        } catch (Throwable th) {
            iLogger.b(K1.ERROR, "Failed to process view hierarchy.", th);
        }
    }

    public static io.sentry.protocol.C i(Activity activity, final List list, io.sentry.util.thread.a aVar, final ILogger iLogger) {
        if (activity == null) {
            iLogger.c(K1.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.c(K1.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        final View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            iLogger.c(K1.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
        } catch (Throwable th) {
            iLogger.b(K1.ERROR, "Failed to process view hierarchy.", th);
        }
        if (aVar.d()) {
            return j(peekDecorView, list);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference(null);
        activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.m0
            @Override // java.lang.Runnable
            public final void run() {
                ViewHierarchyEventProcessor.h(atomicReference, peekDecorView, list, countDownLatch, iLogger);
            }
        });
        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
            return (io.sentry.protocol.C) atomicReference.get();
        }
        return null;
    }

    public static io.sentry.protocol.C j(View view, List list) {
        ArrayList arrayList = new ArrayList(1);
        io.sentry.protocol.C c10 = new io.sentry.protocol.C("android_view_system", arrayList);
        io.sentry.protocol.D k10 = k(view);
        arrayList.add(k10);
        g(view, k10, list);
        return c10;
    }

    private static io.sentry.protocol.D k(View view) {
        io.sentry.protocol.D d10 = new io.sentry.protocol.D();
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = view.getClass().getSimpleName();
        }
        d10.p(canonicalName);
        try {
            d10.o(io.sentry.android.core.internal.gestures.i.b(view));
        } catch (Throwable unused) {
        }
        d10.t(Double.valueOf(view.getX()));
        d10.u(Double.valueOf(view.getY()));
        d10.s(Double.valueOf(view.getWidth()));
        d10.n(Double.valueOf(view.getHeight()));
        d10.l(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            d10.r("visible");
        } else if (visibility == 4) {
            d10.r("invisible");
        } else if (visibility == 8) {
            d10.r("gone");
        }
        return d10;
    }

    @Override // io.sentry.InterfaceC3466x
    public A1 b(A1 a12, io.sentry.A a10) {
        if (!a12.w0()) {
            return a12;
        }
        if (!this.f34793a.isAttachViewHierarchy()) {
            this.f34793a.getLogger().c(K1.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
            return a12;
        }
        if (io.sentry.util.j.i(a10)) {
            return a12;
        }
        boolean a11 = this.f34794b.a();
        this.f34793a.getBeforeViewHierarchyCaptureCallback();
        if (a11) {
            return a12;
        }
        io.sentry.protocol.C i10 = i(Q.c().b(), this.f34793a.getViewHierarchyExporters(), this.f34793a.getMainThreadChecker(), this.f34793a.getLogger());
        if (i10 != null) {
            a10.n(C3396b.c(i10));
        }
        return a12;
    }
}
