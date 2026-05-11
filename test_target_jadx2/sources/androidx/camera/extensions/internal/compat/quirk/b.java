package androidx.camera.extensions.internal.compat.quirk;

import androidx.camera.core.impl.L0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {
    static List a(L0 l02) {
        ArrayList arrayList = new ArrayList();
        if (l02.a(ExtensionDisabledQuirk.class, ExtensionDisabledQuirk.i())) {
            arrayList.add(new ExtensionDisabledQuirk());
        }
        if (l02.a(CrashWhenOnDisableTooSoon.class, CrashWhenOnDisableTooSoon.f())) {
            arrayList.add(new CrashWhenOnDisableTooSoon());
        }
        if (l02.a(GetAvailableKeysNeedsOnInit.class, GetAvailableKeysNeedsOnInit.f())) {
            arrayList.add(new GetAvailableKeysNeedsOnInit());
        }
        if (l02.a(CaptureOutputSurfaceOccupiedQuirk.class, CaptureOutputSurfaceOccupiedQuirk.f())) {
            arrayList.add(new CaptureOutputSurfaceOccupiedQuirk());
        }
        return arrayList;
    }
}
