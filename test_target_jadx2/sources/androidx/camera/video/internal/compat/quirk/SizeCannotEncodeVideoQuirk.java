package androidx.camera.video.internal.compat.quirk;

import E.r;
import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.K0;
import c0.r0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class SizeCannotEncodeVideoQuirk implements K0 {
    private static Set g() {
        return h() ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.emptySet();
    }

    private static boolean h() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    static boolean j() {
        return h();
    }

    public Rect f(Rect rect, int i10, r0 r0Var) {
        Size p10 = r.p(r.m(rect), i10);
        if (!i(p10)) {
            return rect;
        }
        int g10 = r0Var != null ? r0Var.g() / 2 : 8;
        Rect rect2 = new Rect(rect);
        if (rect.width() == p10.getHeight()) {
            rect2.left += g10;
            rect2.right -= g10;
        } else {
            rect2.top += g10;
            rect2.bottom -= g10;
        }
        return rect2;
    }

    public boolean i(Size size) {
        return g().contains(size);
    }
}
