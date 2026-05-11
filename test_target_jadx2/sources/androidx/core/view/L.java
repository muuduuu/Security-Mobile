package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class L implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f16065a;

    /* renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f16066b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f16067c;

    private L(View view, Runnable runnable) {
        this.f16065a = view;
        this.f16066b = view.getViewTreeObserver();
        this.f16067c = runnable;
    }

    public static L a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        L l10 = new L(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(l10);
        view.addOnAttachStateChangeListener(l10);
        return l10;
    }

    public void b() {
        if (this.f16066b.isAlive()) {
            this.f16066b.removeOnPreDrawListener(this);
        } else {
            this.f16065a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f16065a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f16067c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f16066b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
