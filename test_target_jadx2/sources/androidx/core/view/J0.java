package androidx.core.view;

import android.graphics.Insets;
import android.view.WindowInsetsAnimationController;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    private final b f16030a;

    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final WindowInsetsAnimationController f16031a;

        a(WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f16031a = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.J0.b
        void a(boolean z10) {
            this.f16031a.finish(z10);
        }

        @Override // androidx.core.view.J0.b
        public float b() {
            float currentFraction;
            currentFraction = this.f16031a.getCurrentFraction();
            return currentFraction;
        }

        @Override // androidx.core.view.J0.b
        public androidx.core.graphics.e c() {
            Insets currentInsets;
            currentInsets = this.f16031a.getCurrentInsets();
            return androidx.core.graphics.e.e(currentInsets);
        }

        @Override // androidx.core.view.J0.b
        public androidx.core.graphics.e d() {
            Insets hiddenStateInsets;
            hiddenStateInsets = this.f16031a.getHiddenStateInsets();
            return androidx.core.graphics.e.e(hiddenStateInsets);
        }

        @Override // androidx.core.view.J0.b
        public androidx.core.graphics.e e() {
            Insets shownStateInsets;
            shownStateInsets = this.f16031a.getShownStateInsets();
            return androidx.core.graphics.e.e(shownStateInsets);
        }

        @Override // androidx.core.view.J0.b
        public void f(androidx.core.graphics.e eVar, float f10, float f11) {
            this.f16031a.setInsetsAndAlpha(eVar == null ? null : eVar.f(), f10, f11);
        }
    }

    private static class b {
        b() {
        }

        abstract void a(boolean z10);

        public abstract float b();

        public abstract androidx.core.graphics.e c();

        public abstract androidx.core.graphics.e d();

        public abstract androidx.core.graphics.e e();

        public abstract void f(androidx.core.graphics.e eVar, float f10, float f11);
    }

    J0(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f16030a = new a(windowInsetsAnimationController);
    }

    public void a(boolean z10) {
        this.f16030a.a(z10);
    }

    public float b() {
        return this.f16030a.b();
    }

    public androidx.core.graphics.e c() {
        return this.f16030a.c();
    }

    public androidx.core.graphics.e d() {
        return this.f16030a.d();
    }

    public androidx.core.graphics.e e() {
        return this.f16030a.e();
    }

    public void f(androidx.core.graphics.e eVar, float f10, float f11) {
        this.f16030a.f(eVar, f10, f11);
    }
}
