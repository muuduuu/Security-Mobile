package x;

import A.AbstractC0700h0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5092g {
    public static boolean a(InterfaceC5088c interfaceC5088c) {
        return b(false, interfaceC5088c);
    }

    public static boolean b(boolean z10, InterfaceC5088c interfaceC5088c) {
        Boolean bool;
        try {
            bool = (Boolean) interfaceC5088c.a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e10) {
            if (androidx.camera.camera2.internal.compat.quirk.b.b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                AbstractC0700h0.a("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                AbstractC0700h0.d("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e10);
            }
            if (z10) {
                throw e10;
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            AbstractC0700h0.l("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
