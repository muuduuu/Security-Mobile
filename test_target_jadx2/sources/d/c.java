package D;

import android.media.EncoderProfiles;
import androidx.camera.core.impl.InterfaceC1441i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
abstract class c {
    public static InterfaceC1441i0 a(EncoderProfiles encoderProfiles) {
        return InterfaceC1441i0.b.h(encoderProfiles.getDefaultDurationSeconds(), encoderProfiles.getRecommendedFileFormat(), b(encoderProfiles.getAudioProfiles()), c(encoderProfiles.getVideoProfiles()));
    }

    private static List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EncoderProfiles.AudioProfile audioProfile = (EncoderProfiles.AudioProfile) it.next();
            arrayList.add(InterfaceC1441i0.a.a(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        return arrayList;
    }

    private static List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EncoderProfiles.VideoProfile videoProfile = (EncoderProfiles.VideoProfile) it.next();
            arrayList.add(InterfaceC1441i0.c.a(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return arrayList;
    }
}
