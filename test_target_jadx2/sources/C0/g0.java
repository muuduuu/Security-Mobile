package c0;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class g0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodecInfo f19241a;

    /* renamed from: b, reason: collision with root package name */
    protected final MediaCodecInfo.CodecCapabilities f19242b;

    g0(MediaCodecInfo mediaCodecInfo, String str) {
        this.f19241a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f19242b = capabilitiesForType;
        } catch (RuntimeException e10) {
            throw new k0("Unable to get CodecCapabilities for mime: " + str, e10);
        }
    }
}
