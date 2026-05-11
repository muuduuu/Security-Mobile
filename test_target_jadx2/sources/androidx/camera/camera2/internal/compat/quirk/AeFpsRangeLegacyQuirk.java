package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.core.impl.K0;
import u.C4832C;

/* loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private final Range f14309a;

    public AeFpsRangeLegacyQuirk(C4832C c4832c) {
        this.f14309a = i((Range[]) c4832c.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    private Range f(Range range) {
        int intValue = ((Integer) range.getUpper()).intValue();
        int intValue2 = ((Integer) range.getLower()).intValue();
        if (((Integer) range.getUpper()).intValue() >= 1000) {
            intValue = ((Integer) range.getUpper()).intValue() / 1000;
        }
        if (((Integer) range.getLower()).intValue() >= 1000) {
            intValue2 = ((Integer) range.getLower()).intValue() / 1000;
        }
        return new Range(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    static boolean h(C4832C c4832c) {
        Integer num = (Integer) c4832c.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    private Range i(Range[] rangeArr) {
        Range range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range f10 = f(range2);
                if (((Integer) f10.getUpper()).intValue() == 30 && (range == null || ((Integer) f10.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = f10;
                }
            }
        }
        return range;
    }

    public Range g() {
        return this.f14309a;
    }
}
