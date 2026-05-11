package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1504k0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f16148a;

    /* renamed from: androidx.core.view.k0$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1506l0 f16149a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f16150b;

        a(InterfaceC1506l0 interfaceC1506l0, View view) {
            this.f16149a = interfaceC1506l0;
            this.f16150b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f16149a.a(this.f16150b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16149a.b(this.f16150b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f16149a.c(this.f16150b);
        }
    }

    C1504k0(View view) {
        this.f16148a = new WeakReference(view);
    }

    private void i(View view, InterfaceC1506l0 interfaceC1506l0) {
        if (interfaceC1506l0 != null) {
            view.animate().setListener(new a(interfaceC1506l0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C1504k0 b(float f10) {
        View view = (View) this.f16148a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f16148a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f16148a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public C1504k0 f(long j10) {
        View view = (View) this.f16148a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public C1504k0 g(Interpolator interpolator) {
        View view = (View) this.f16148a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C1504k0 h(InterfaceC1506l0 interfaceC1506l0) {
        View view = (View) this.f16148a.get();
        if (view != null) {
            i(view, interfaceC1506l0);
        }
        return this;
    }

    public C1504k0 j(long j10) {
        View view = (View) this.f16148a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public C1504k0 k(final InterfaceC1510n0 interfaceC1510n0) {
        final View view = (View) this.f16148a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC1510n0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.j0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    InterfaceC1510n0.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = (View) this.f16148a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C1504k0 m(float f10) {
        View view = (View) this.f16148a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
