package androidx.camera.view.internal.compat.quirk;

import androidx.camera.core.impl.L0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {
    static List a(L0 l02) {
        ArrayList arrayList = new ArrayList();
        if (l02.a(SurfaceViewStretchedQuirk.class, SurfaceViewStretchedQuirk.i())) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        if (l02.a(SurfaceViewNotCroppedByParentQuirk.class, SurfaceViewNotCroppedByParentQuirk.f())) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        return arrayList;
    }
}
