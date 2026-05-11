package x;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.b1;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final ExtraCroppingQuirk f44601a;

    public l() {
        this((ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraCroppingQuirk.class));
    }

    public Size a(Size size) {
        ExtraCroppingQuirk extraCroppingQuirk = this.f44601a;
        if (extraCroppingQuirk == null) {
            return size;
        }
        Size f10 = extraCroppingQuirk.f(b1.b.PRIV);
        return f10 == null ? size : f10.getWidth() * f10.getHeight() > size.getWidth() * size.getHeight() ? f10 : size;
    }

    l(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f44601a = extraCroppingQuirk;
    }
}
