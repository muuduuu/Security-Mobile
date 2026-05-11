package x;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.impl.P0;
import androidx.camera.core.impl.V;
import s.C4301a;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5086a {

    /* renamed from: a, reason: collision with root package name */
    private final Range f44591a;

    public C5086a(P0 p02) {
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) p02.b(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.f44591a = null;
        } else {
            this.f44591a = aeFpsRangeLegacyQuirk.g();
        }
    }

    public void a(C4301a.C0609a c0609a) {
        Range range = this.f44591a;
        if (range != null) {
            c0609a.g(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range, V.c.REQUIRED);
        }
    }
}
