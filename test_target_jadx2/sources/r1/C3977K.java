package r1;

import android.os.Build;
import android.view.View;

/* renamed from: r1.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3977K extends AbstractC3975I {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f38962g = true;

    C3977K() {
    }

    @Override // r1.AbstractC3979M
    public void f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f38962g) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f38962g = false;
            }
        }
    }
}
