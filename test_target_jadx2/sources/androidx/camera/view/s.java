package androidx.camera.view;

import A.AbstractC0700h0;
import A.W;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s extends View {

    /* renamed from: a, reason: collision with root package name */
    private Window f14877a;

    /* renamed from: b, reason: collision with root package name */
    private W.i f14878b;

    class a implements W.i {

        /* renamed from: a, reason: collision with root package name */
        private float f14879a;

        /* renamed from: b, reason: collision with root package name */
        private ValueAnimator f14880b;

        a() {
        }

        @Override // A.W.i
        public void a(long j10, final W.j jVar) {
            AbstractC0700h0.a("ScreenFlashView", "ScreenFlash#apply");
            this.f14879a = s.this.getBrightness();
            s.this.setBrightness(1.0f);
            ValueAnimator valueAnimator = this.f14880b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            s sVar = s.this;
            Objects.requireNonNull(jVar);
            this.f14880b = sVar.e(new Runnable() { // from class: androidx.camera.view.r
                @Override // java.lang.Runnable
                public final void run() {
                    W.j.this.a();
                }
            });
        }

        @Override // A.W.i
        public void clear() {
            AbstractC0700h0.a("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
            ValueAnimator valueAnimator = this.f14880b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f14880b = null;
            }
            s.this.setAlpha(0.0f);
            s.this.setBrightness(this.f14879a);
        }
    }

    class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f14882a;

        b(Runnable runnable) {
            this.f14882a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0700h0.a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
            Runnable runnable = this.f14882a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public s(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ValueAnimator e(Runnable runnable) {
        AbstractC0700h0.a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(getVisibilityRampUpAnimationDurationMillis());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.camera.view.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                s.this.f(valueAnimator);
            }
        });
        ofFloat.addListener(new b(runnable));
        ofFloat.start();
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(ValueAnimator valueAnimator) {
        AbstractC0700h0.a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void g(Window window) {
        if (this.f14877a != window) {
            this.f14878b = window == null ? null : new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f14877a;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        AbstractC0700h0.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f10) {
        if (this.f14877a == null) {
            AbstractC0700h0.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f10)) {
            AbstractC0700h0.c("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f14877a.getAttributes();
        attributes.screenBrightness = f10;
        this.f14877a.setAttributes(attributes);
        AbstractC0700h0.a("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(W.i iVar) {
        AbstractC0700h0.a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public W.i getScreenFlash() {
        return this.f14878b;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(AbstractC1475a abstractC1475a) {
        E.q.a();
    }

    public void setScreenFlashWindow(Window window) {
        E.q.a();
        g(window);
        this.f14877a = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public s(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public s(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }
}
