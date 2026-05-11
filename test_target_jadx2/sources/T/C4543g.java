package t;

import A.AbstractC0700h0;
import E.i;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.core.impl.EnumC1456q;
import androidx.camera.core.impl.EnumC1459s;
import androidx.camera.core.impl.EnumC1461t;
import androidx.camera.core.impl.EnumC1463u;
import androidx.camera.core.impl.EnumC1465v;
import androidx.camera.core.impl.EnumC1467w;
import androidx.camera.core.impl.InterfaceC1469x;
import java.nio.BufferUnderflowException;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4543g implements InterfaceC1469x {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.d1 f42069a;

    /* renamed from: b, reason: collision with root package name */
    private final CaptureResult f42070b;

    public C4543g(androidx.camera.core.impl.d1 d1Var, CaptureResult captureResult) {
        this.f42069a = d1Var;
        this.f42070b = captureResult;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public long a() {
        Long l10 = (Long) this.f42070b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public void b(i.b bVar) {
        super.b(bVar);
        try {
            Integer num = (Integer) this.f42070b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            AbstractC0700h0.l("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l10 = (Long) this.f42070b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            bVar.f(l10.longValue());
        }
        Float f10 = (Float) this.f42070b.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.l(f10.floatValue());
        }
        Integer num2 = (Integer) this.f42070b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((Integer) this.f42070b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            bVar.k(num2.intValue());
        }
        Float f11 = (Float) this.f42070b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.h(f11.floatValue());
        }
        Integer num3 = (Integer) this.f42070b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            i.c cVar = i.c.AUTO;
            if (num3.intValue() == 0) {
                cVar = i.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public androidx.camera.core.impl.d1 c() {
        return this.f42069a;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1465v d() {
        Integer num = (Integer) this.f42070b.get(CaptureResult.CONTROL_AWB_STATE);
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
        AbstractC0700h0.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return EnumC1465v.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1467w e() {
        Integer num = (Integer) this.f42070b.get(CaptureResult.FLASH_STATE);
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
        AbstractC0700h0.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return EnumC1467w.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1463u f() {
        Integer num = (Integer) this.f42070b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return EnumC1463u.UNKNOWN;
        }
        switch (num.intValue()) {
        }
        return EnumC1463u.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1459s g() {
        Integer num = (Integer) this.f42070b.get(CaptureResult.CONTROL_AF_MODE);
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
                AbstractC0700h0.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return EnumC1459s.UNKNOWN;
            }
        }
        return EnumC1459s.OFF;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public androidx.camera.core.impl.r h() {
        Integer num = (Integer) this.f42070b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return androidx.camera.core.impl.r.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return androidx.camera.core.impl.r.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return androidx.camera.core.impl.r.CONVERGED;
            }
            if (intValue == 3) {
                return androidx.camera.core.impl.r.LOCKED;
            }
            if (intValue == 4) {
                return androidx.camera.core.impl.r.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                AbstractC0700h0.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return androidx.camera.core.impl.r.UNKNOWN;
            }
        }
        return androidx.camera.core.impl.r.SEARCHING;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public CaptureResult i() {
        return this.f42070b;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1456q j() {
        Integer num = (Integer) this.f42070b.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return EnumC1456q.UNKNOWN;
        }
        int intValue = num.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? EnumC1456q.UNKNOWN : Build.VERSION.SDK_INT >= 28 ? EnumC1456q.ON_EXTERNAL_FLASH : EnumC1456q.UNKNOWN : EnumC1456q.ON_AUTO_FLASH_REDEYE : EnumC1456q.ON_ALWAYS_FLASH : EnumC1456q.ON_AUTO_FLASH : EnumC1456q.ON : EnumC1456q.OFF;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1461t k() {
        Integer num = (Integer) this.f42070b.get(CaptureResult.CONTROL_AF_STATE);
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
                AbstractC0700h0.c("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return EnumC1461t.UNKNOWN;
    }

    public C4543g(CaptureResult captureResult) {
        this(androidx.camera.core.impl.d1.b(), captureResult);
    }
}
