package r1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1484a0;

/* renamed from: r1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3986d extends AbstractC3980N {

    /* renamed from: r1.d$a */
    class a extends AbstractC3995m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f39021a;

        a(View view) {
            this.f39021a = view;
        }

        @Override // r1.AbstractC3994l.f
        public void a(AbstractC3994l abstractC3994l) {
            AbstractC3967A.g(this.f39021a, 1.0f);
            AbstractC3967A.a(this.f39021a);
            abstractC3994l.Y(this);
        }
    }

    /* renamed from: r1.d$b */
    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final View f39023a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f39024b = false;

        b(View view) {
            this.f39023a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3967A.g(this.f39023a, 1.0f);
            if (this.f39024b) {
                this.f39023a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (AbstractC1484a0.Q(this.f39023a) && this.f39023a.getLayerType() == 0) {
                this.f39024b = true;
                this.f39023a.setLayerType(2, null);
            }
        }
    }

    public C3986d(int i10) {
        r0(i10);
    }

    private Animator s0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        AbstractC3967A.g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) AbstractC3967A.f38956b, f11);
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    private static float t0(s sVar, float f10) {
        Float f11;
        return (sVar == null || (f11 = (Float) sVar.f39103a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // r1.AbstractC3980N, r1.AbstractC3994l
    public void n(s sVar) {
        super.n(sVar);
        sVar.f39103a.put("android:fade:transitionAlpha", Float.valueOf(AbstractC3967A.c(sVar.f39104b)));
    }

    @Override // r1.AbstractC3980N
    public Animator n0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float t02 = t0(sVar, 0.0f);
        return s0(view, t02 != 1.0f ? t02 : 0.0f, 1.0f);
    }

    @Override // r1.AbstractC3980N
    public Animator p0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        AbstractC3967A.e(view);
        return s0(view, t0(sVar, 1.0f), 0.0f);
    }

    public C3986d() {
    }
}
