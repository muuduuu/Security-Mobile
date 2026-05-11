package K;

import androidx.camera.core.impl.T;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.n;

/* loaded from: classes.dex */
public class b {
    public boolean a() {
        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) androidx.camera.core.internal.compat.quirk.a.b(ImageCaptureRotationOptionQuirk.class);
        return imageCaptureRotationOptionQuirk == null || imageCaptureRotationOptionQuirk.j(T.f14453i);
    }

    public boolean b(n nVar) {
        return a() && L.b.i(nVar.getFormat());
    }
}
