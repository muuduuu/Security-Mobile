package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.impl.L0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {
    static List a(L0 l02) {
        ArrayList arrayList = new ArrayList();
        if (l02.a(ImageCaptureRotationOptionQuirk.class, ImageCaptureRotationOptionQuirk.k())) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (l02.a(SurfaceOrderQuirk.class, SurfaceOrderQuirk.f())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (l02.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.g())) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (l02.a(LowMemoryQuirk.class, LowMemoryQuirk.f())) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (l02.a(LargeJpegImageQuirk.class, LargeJpegImageQuirk.i())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (l02.a(IncorrectJpegMetadataQuirk.class, IncorrectJpegMetadataQuirk.j())) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        return arrayList;
    }
}
