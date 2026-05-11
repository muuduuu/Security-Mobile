package D;

import android.media.CamcorderProfile;
import androidx.camera.core.impl.InterfaceC1441i0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
abstract class d {
    public static InterfaceC1441i0 a(CamcorderProfile camcorderProfile) {
        return InterfaceC1441i0.b.h(camcorderProfile.duration, camcorderProfile.fileFormat, b(camcorderProfile), c(camcorderProfile));
    }

    private static List b(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i10 = camcorderProfile.audioCodec;
        arrayList.add(InterfaceC1441i0.a.a(i10, InterfaceC1441i0.e(i10), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, InterfaceC1441i0.f(camcorderProfile.audioCodec)));
        return arrayList;
    }

    private static List c(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i10 = camcorderProfile.videoCodec;
        arrayList.add(InterfaceC1441i0.c.a(i10, InterfaceC1441i0.g(i10), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
