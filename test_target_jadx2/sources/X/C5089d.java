package x;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5089d {

    /* renamed from: a, reason: collision with root package name */
    private final SmallDisplaySizeQuirk f44594a = (SmallDisplaySizeQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(SmallDisplaySizeQuirk.class);

    public Size a() {
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.f44594a;
        if (smallDisplaySizeQuirk != null) {
            return smallDisplaySizeQuirk.f();
        }
        return null;
    }
}
