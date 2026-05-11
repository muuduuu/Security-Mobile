package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.android.core.N;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class j implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f34920a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f34921b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f34922c;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(j.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private j(View view, Runnable runnable) {
        this.f34921b = new AtomicReference(view);
        this.f34922c = runnable;
    }

    private static boolean b(View view, N n10) {
        return view.getViewTreeObserver().isAlive() && c(view, n10);
    }

    private static boolean c(View view, N n10) {
        return n10.d() >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    public static void e(View view, Runnable runnable, N n10) {
        j jVar = new j(view, runnable);
        if (n10.d() >= 26 || b(view, n10)) {
            view.getViewTreeObserver().addOnDrawListener(jVar);
        } else {
            view.addOnAttachStateChangeListener(jVar.new a());
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View view = (View) this.f34921b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                j.this.d(view);
            }
        });
        this.f34920a.postAtFrontOfQueue(this.f34922c);
    }
}
