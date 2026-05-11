package d5;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: d5.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2990l extends Animation {

    /* renamed from: a, reason: collision with root package name */
    private final View f31218a;

    /* renamed from: b, reason: collision with root package name */
    private final float f31219b;

    /* renamed from: c, reason: collision with root package name */
    private final float f31220c;

    public C2990l(View view, float f10, float f11) {
        this.f31218a = view;
        this.f31219b = f10;
        this.f31220c = f11 - f10;
        setAnimationListener(new a(view));
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, Transformation transformation) {
        this.f31218a.setAlpha(this.f31219b + (this.f31220c * f10));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return false;
    }

    /* renamed from: d5.l$a */
    static class a implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        private final View f31221a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f31222b = false;

        public a(View view) {
            this.f31221a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f31222b) {
                this.f31221a.setLayerType(0, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.f31221a.hasOverlappingRendering() && this.f31221a.getLayerType() == 0) {
                this.f31222b = true;
                this.f31221a.setLayerType(2, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }
}
