package r1;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
abstract class x {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f39111a = true;

    static v a(ViewGroup viewGroup) {
        return new u(viewGroup);
    }

    private static void b(ViewGroup viewGroup, boolean z10) {
        if (f39111a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f39111a = false;
            }
        }
    }

    static void c(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else {
            b(viewGroup, z10);
        }
    }
}
