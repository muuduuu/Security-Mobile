package D;

import A.AbstractC0700h0;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.camera.core.impl.InterfaceC1441i0;

/* loaded from: classes.dex */
public abstract class a {
    public static InterfaceC1441i0 a(CamcorderProfile camcorderProfile) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            AbstractC0700h0.l("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i10 + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return d.a(camcorderProfile);
    }

    public static InterfaceC1441i0 b(EncoderProfiles encoderProfiles) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return c.a(encoderProfiles);
        }
        if (i10 >= 31) {
            return b.a(encoderProfiles);
        }
        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i10 + ". Version 31 or higher required.");
    }
}
