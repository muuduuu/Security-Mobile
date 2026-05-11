package r1;

import android.view.View;

/* renamed from: r1.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3975I extends AbstractC3973G {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f38961f = true;

    AbstractC3975I() {
    }

    @Override // r1.AbstractC3979M
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f38961f) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f38961f = false;
            }
        }
    }
}
