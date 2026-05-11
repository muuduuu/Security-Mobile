package x;

import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5091f {

    /* renamed from: a, reason: collision with root package name */
    private final ExtraSupportedSurfaceCombinationsQuirk f44596a = (ExtraSupportedSurfaceCombinationsQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraSupportedSurfaceCombinationsQuirk.class);

    public List a(String str) {
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = this.f44596a;
        return extraSupportedSurfaceCombinationsQuirk == null ? new ArrayList() : extraSupportedSurfaceCombinationsQuirk.h(str);
    }
}
