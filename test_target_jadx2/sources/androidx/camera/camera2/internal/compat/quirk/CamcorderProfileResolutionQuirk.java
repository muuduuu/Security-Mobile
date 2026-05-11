package androidx.camera.camera2.internal.compat.quirk;

import A.AbstractC0700h0;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.core.impl.K0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import u.C4832C;
import u.V;

/* loaded from: classes.dex */
public class CamcorderProfileResolutionQuirk implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private final V f14310a;

    /* renamed from: b, reason: collision with root package name */
    private List f14311b = null;

    public CamcorderProfileResolutionQuirk(C4832C c4832c) {
        this.f14310a = c4832c.b();
    }

    static boolean g(C4832C c4832c) {
        Integer num = (Integer) c4832c.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public List f() {
        if (this.f14311b == null) {
            Size[] c10 = this.f14310a.c(34);
            this.f14311b = c10 != null ? Arrays.asList((Size[]) c10.clone()) : Collections.emptyList();
            AbstractC0700h0.a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f14311b);
        }
        return new ArrayList(this.f14311b);
    }
}
