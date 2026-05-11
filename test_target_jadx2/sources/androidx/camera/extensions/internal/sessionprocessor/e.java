package androidx.camera.extensions.internal.sessionprocessor;

import A.AbstractC0700h0;
import E.i;
import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.EnumC1456q;
import androidx.camera.core.impl.EnumC1459s;
import androidx.camera.core.impl.EnumC1461t;
import androidx.camera.core.impl.EnumC1463u;
import androidx.camera.core.impl.EnumC1465v;
import androidx.camera.core.impl.EnumC1467w;
import androidx.camera.core.impl.InterfaceC1469x;
import androidx.camera.core.impl.d1;
import androidx.camera.core.impl.r;
import java.nio.BufferUnderflowException;
import java.util.Map;

/* loaded from: classes.dex */
class e implements InterfaceC1469x {

    /* renamed from: a, reason: collision with root package name */
    private final Map f14770a;

    /* renamed from: b, reason: collision with root package name */
    private d1 f14771b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14772c;

    e(long j10, d1 d1Var, Map map) {
        this.f14770a = map;
        this.f14771b = d1Var;
        this.f14772c = j10;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public long a() {
        return this.f14772c;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public void b(i.b bVar) {
        super.b(bVar);
        try {
            Integer num = (Integer) this.f14770a.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            AbstractC0700h0.l("KeyValueMapCameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l10 = (Long) this.f14770a.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            bVar.f(l10.longValue());
        }
        Float f10 = (Float) this.f14770a.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.l(f10.floatValue());
        }
        Integer num2 = (Integer) this.f14770a.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((Integer) this.f14770a.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            bVar.k(num2.intValue());
        }
        Float f11 = (Float) this.f14770a.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.h(f11.floatValue());
        }
        Integer num3 = (Integer) this.f14770a.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            i.c cVar = i.c.AUTO;
            if (num3.intValue() == 0) {
                cVar = i.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public d1 c() {
        return this.f14771b;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1465v d() {
        Integer num = (Integer) this.f14770a.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC1465v.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC1465v.INACTIVE;
        }
        if (intValue == 1) {
            return EnumC1465v.METERING;
        }
        if (intValue == 2) {
            return EnumC1465v.CONVERGED;
        }
        if (intValue == 3) {
            return EnumC1465v.LOCKED;
        }
        AbstractC0700h0.c("KeyValueMapCameraCaptureResult", "Undefined awb state: " + num);
        return EnumC1465v.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1467w e() {
        Integer num = (Integer) this.f14770a.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC1467w.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return EnumC1467w.NONE;
        }
        if (intValue == 2) {
            return EnumC1467w.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return EnumC1467w.FIRED;
        }
        AbstractC0700h0.c("KeyValueMapCameraCaptureResult", "Undefined flash state: " + num);
        return EnumC1467w.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1463u f() {
        Integer num = (Integer) this.f14770a.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return EnumC1463u.UNKNOWN;
        }
        switch (num.intValue()) {
        }
        return EnumC1463u.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1459s g() {
        Integer num = (Integer) this.f14770a.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC1459s.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return EnumC1459s.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return EnumC1459s.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                AbstractC0700h0.c("KeyValueMapCameraCaptureResult", "Undefined af mode: " + num);
                return EnumC1459s.UNKNOWN;
            }
        }
        return EnumC1459s.OFF;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public r h() {
        Integer num = (Integer) this.f14770a.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return r.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return r.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return r.CONVERGED;
            }
            if (intValue == 3) {
                return r.LOCKED;
            }
            if (intValue == 4) {
                return r.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                AbstractC0700h0.c("KeyValueMapCameraCaptureResult", "Undefined ae state: " + num);
                return r.UNKNOWN;
            }
        }
        return r.SEARCHING;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public CaptureResult i() {
        return null;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1456q j() {
        Integer num = (Integer) this.f14770a.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return EnumC1456q.UNKNOWN;
        }
        int intValue = num.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? EnumC1456q.UNKNOWN : EnumC1456q.ON_EXTERNAL_FLASH : EnumC1456q.ON_AUTO_FLASH_REDEYE : EnumC1456q.ON_ALWAYS_FLASH : EnumC1456q.ON_AUTO_FLASH : EnumC1456q.ON : EnumC1456q.OFF;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1461t k() {
        Integer num = (Integer) this.f14770a.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC1461t.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                AbstractC0700h0.c("KeyValueMapCameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return EnumC1461t.UNKNOWN;
    }
}
