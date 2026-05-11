package v;

import A.B;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;
import u.C4832C;

/* renamed from: v.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4896g {

    /* renamed from: a, reason: collision with root package name */
    private final a f43785a;

    /* renamed from: v.g$a */
    interface a {
        DynamicRangeProfiles a();

        Set b(B b10);

        Set c();
    }

    C4896g(a aVar) {
        this.f43785a = aVar;
    }

    public static C4896g a(C4832C c4832c) {
        C4896g c4896g;
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 33) {
            key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            c4896g = e(AbstractC4895f.a(c4832c.a(key)));
        } else {
            c4896g = null;
        }
        return c4896g == null ? C4898i.f43787a : c4896g;
    }

    public static C4896g e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        y0.f.j(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new C4896g(new C4897h(dynamicRangeProfiles));
    }

    public Set b(B b10) {
        return this.f43785a.b(b10);
    }

    public Set c() {
        return this.f43785a.c();
    }

    public DynamicRangeProfiles d() {
        y0.f.j(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f43785a.a();
    }
}
