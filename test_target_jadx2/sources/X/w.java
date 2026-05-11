package x;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44619a;

    public w() {
        this.f44619a = ((StillCaptureFlashStopRepeatingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    public boolean a(List list, boolean z10) {
        if (this.f44619a && z10) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (intValue == 2 || intValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
