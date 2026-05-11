package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1578u {
    private static int a(ComponentCallbacksC1573o componentCallbacksC1573o, boolean z10, boolean z11) {
        return z11 ? z10 ? componentCallbacksC1573o.getPopEnterAnim() : componentCallbacksC1573o.getPopExitAnim() : z10 ? componentCallbacksC1573o.getEnterAnim() : componentCallbacksC1573o.getExitAnim();
    }

    static a b(Context context, ComponentCallbacksC1573o componentCallbacksC1573o, boolean z10, boolean z11) {
        int nextTransition = componentCallbacksC1573o.getNextTransition();
        int a10 = a(componentCallbacksC1573o, z10, z11);
        componentCallbacksC1573o.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = componentCallbacksC1573o.mContainer;
        if (viewGroup != null && viewGroup.getTag(T0.b.f9131c) != null) {
            componentCallbacksC1573o.mContainer.setTag(T0.b.f9131c, null);
        }
        ViewGroup viewGroup2 = componentCallbacksC1573o.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = componentCallbacksC1573o.onCreateAnimation(nextTransition, z10, a10);
        if (onCreateAnimation != null) {
            return new a(onCreateAnimation);
        }
        Animator onCreateAnimator = componentCallbacksC1573o.onCreateAnimator(nextTransition, z10, a10);
        if (onCreateAnimator != null) {
            return new a(onCreateAnimator);
        }
        if (a10 == 0 && nextTransition != 0) {
            a10 = d(context, nextTransition, z10);
        }
        if (a10 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a10));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a10);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, a10);
                if (loadAnimator != null) {
                    return new a(loadAnimator);
                }
            } catch (RuntimeException e11) {
                if (equals) {
                    throw e11;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a10);
                if (loadAnimation2 != null) {
                    return new a(loadAnimation2);
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? T0.a.f9127e : T0.a.f9128f;
        }
        if (i10 == 8194) {
            return z10 ? T0.a.f9123a : T0.a.f9124b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? T0.a.f9125c : T0.a.f9126d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* renamed from: androidx.fragment.app.u$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f17015a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f17016b;

        a(Animation animation) {
            this.f17015a = animation;
            this.f17016b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f17015a = null;
            this.f17016b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.u$b */
    static class b extends AnimationSet implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f17017a;

        /* renamed from: b, reason: collision with root package name */
        private final View f17018b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f17019c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f17020d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f17021e;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f17021e = true;
            this.f17017a = viewGroup;
            this.f17018b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f17021e = true;
            if (this.f17019c) {
                return !this.f17020d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f17019c = true;
                androidx.core.view.L.a(this.f17017a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17019c || !this.f17021e) {
                this.f17017a.endViewTransition(this.f17018b);
                this.f17020d = true;
            } else {
                this.f17021e = false;
                this.f17017a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f17021e = true;
            if (this.f17019c) {
                return !this.f17020d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f17019c = true;
                androidx.core.view.L.a(this.f17017a, this);
            }
            return true;
        }
    }
}
