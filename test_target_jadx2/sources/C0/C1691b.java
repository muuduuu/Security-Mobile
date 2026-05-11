package c0;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1691b extends g0 implements f0 {

    /* renamed from: c, reason: collision with root package name */
    private final MediaCodecInfo.AudioCapabilities f19196c;

    C1691b(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.f19242b.getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.f19196c = audioCapabilities;
    }
}
