package r1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3983a {
    static void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    static void b(Animator animator) {
        animator.pause();
    }

    static void c(Animator animator) {
        animator.resume();
    }
}
