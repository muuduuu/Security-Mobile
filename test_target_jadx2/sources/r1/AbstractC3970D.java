package r1;

import android.view.View;

/* renamed from: r1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3970D extends AbstractC3979M {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f38958c = true;

    AbstractC3970D() {
    }

    @Override // r1.AbstractC3979M
    public float b(View view) {
        float transitionAlpha;
        if (f38958c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f38958c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // r1.AbstractC3979M
    public void e(View view, float f10) {
        if (f38958c) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f38958c = false;
            }
        }
        view.setAlpha(f10);
    }

    @Override // r1.AbstractC3979M
    public void a(View view) {
    }

    @Override // r1.AbstractC3979M
    public void c(View view) {
    }
}
