package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.K0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import t.C4584u;
import u.C4832C;

/* loaded from: classes.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements K0 {

    /* renamed from: b, reason: collision with root package name */
    private static final List f14337b = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* renamed from: a, reason: collision with root package name */
    private final C4832C f14338a;

    public TorchFlashRequiredFor3aUpdateQuirk(C4832C c4832c) {
        this.f14338a = c4832c;
    }

    private static boolean f(C4832C c4832c) {
        return g() && j(c4832c);
    }

    private static boolean g() {
        Iterator it = f14337b.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).equals((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean h(C4832C c4832c) {
        return Build.VERSION.SDK_INT >= 28 && C4584u.N(c4832c, 5) == 5;
    }

    private static boolean j(C4832C c4832c) {
        return ((Integer) c4832c.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    static boolean k(C4832C c4832c) {
        return f(c4832c);
    }

    public boolean i() {
        return !h(this.f14338a);
    }
}
