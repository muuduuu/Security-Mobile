package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f27259a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private b f27260b = null;

    /* renamed from: c, reason: collision with root package name */
    ValueAnimator f27261c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f27262d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i iVar = i.this;
            if (iVar.f27261c == animator) {
                iVar.f27261c = null;
            }
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int[] f27264a;

        /* renamed from: b, reason: collision with root package name */
        final ValueAnimator f27265b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f27264a = iArr;
            this.f27265b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f27262d);
        this.f27259a.add(bVar);
    }
}
