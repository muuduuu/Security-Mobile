package androidx.camera.video.internal.compat.quirk;

import androidx.camera.core.impl.L0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {
    static List a(L0 l02) {
        ArrayList arrayList = new ArrayList();
        if (l02.a(MediaFormatMustNotUseFrameRateToFindEncoderQuirk.class, MediaFormatMustNotUseFrameRateToFindEncoderQuirk.f())) {
            arrayList.add(new MediaFormatMustNotUseFrameRateToFindEncoderQuirk());
        }
        if (l02.a(MediaCodecInfoReportIncorrectInfoQuirk.class, MediaCodecInfoReportIncorrectInfoQuirk.o())) {
            arrayList.add(new MediaCodecInfoReportIncorrectInfoQuirk());
        }
        if (l02.a(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class, DeactivateEncoderSurfaceBeforeStopEncoderQuirk.f())) {
            arrayList.add(new DeactivateEncoderSurfaceBeforeStopEncoderQuirk());
        }
        if (l02.a(CameraUseInconsistentTimebaseQuirk.class, CameraUseInconsistentTimebaseQuirk.h())) {
            arrayList.add(new CameraUseInconsistentTimebaseQuirk());
        }
        if (l02.a(ReportedVideoQualityNotSupportedQuirk.class, ReportedVideoQualityNotSupportedQuirk.k())) {
            arrayList.add(new ReportedVideoQualityNotSupportedQuirk());
        }
        if (l02.a(EncoderNotUsePersistentInputSurfaceQuirk.class, EncoderNotUsePersistentInputSurfaceQuirk.f())) {
            arrayList.add(new EncoderNotUsePersistentInputSurfaceQuirk());
        }
        if (l02.a(VideoEncoderCrashQuirk.class, VideoEncoderCrashQuirk.g())) {
            arrayList.add(new VideoEncoderCrashQuirk());
        }
        if (l02.a(ExcludeStretchedVideoQualityQuirk.class, ExcludeStretchedVideoQualityQuirk.m())) {
            arrayList.add(new ExcludeStretchedVideoQualityQuirk());
        }
        if (l02.a(MediaStoreVideoCannotWrite.class, MediaStoreVideoCannotWrite.h())) {
            arrayList.add(new MediaStoreVideoCannotWrite());
        }
        if (l02.a(AudioEncoderIgnoresInputTimestampQuirk.class, AudioEncoderIgnoresInputTimestampQuirk.g())) {
            arrayList.add(new AudioEncoderIgnoresInputTimestampQuirk());
        }
        if (l02.a(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class, VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.f())) {
            arrayList.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
        }
        if (l02.a(NegativeLatLongSavesIncorrectlyQuirk.class, NegativeLatLongSavesIncorrectlyQuirk.f())) {
            arrayList.add(new NegativeLatLongSavesIncorrectlyQuirk());
        }
        if (l02.a(AudioTimestampFramePositionIncorrectQuirk.class, AudioTimestampFramePositionIncorrectQuirk.m())) {
            arrayList.add(new AudioTimestampFramePositionIncorrectQuirk());
        }
        if (l02.a(ExtraSupportedResolutionQuirk.class, ExtraSupportedResolutionQuirk.g())) {
            arrayList.add(new ExtraSupportedResolutionQuirk());
        }
        if (l02.a(StretchedVideoResolutionQuirk.class, StretchedVideoResolutionQuirk.h())) {
            arrayList.add(new StretchedVideoResolutionQuirk());
        }
        if (l02.a(CodecStuckOnFlushQuirk.class, CodecStuckOnFlushQuirk.h())) {
            arrayList.add(new CodecStuckOnFlushQuirk());
        }
        if (l02.a(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class, StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.g())) {
            arrayList.add(new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
        }
        if (l02.a(ExtraSupportedQualityQuirk.class, ExtraSupportedQualityQuirk.j())) {
            arrayList.add(new ExtraSupportedQualityQuirk());
        }
        if (l02.a(SignalEosOutputBufferNotComeQuirk.class, SignalEosOutputBufferNotComeQuirk.g())) {
            arrayList.add(new SignalEosOutputBufferNotComeQuirk());
        }
        if (l02.a(SizeCannotEncodeVideoQuirk.class, SizeCannotEncodeVideoQuirk.j())) {
            arrayList.add(new SizeCannotEncodeVideoQuirk());
        }
        return arrayList;
    }
}
