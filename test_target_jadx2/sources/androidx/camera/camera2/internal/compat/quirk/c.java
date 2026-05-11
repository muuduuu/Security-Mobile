package androidx.camera.camera2.internal.compat.quirk;

import androidx.camera.core.impl.L0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {
    static List a(L0 l02) {
        ArrayList arrayList = new ArrayList();
        if (l02.a(ImageCapturePixelHDRPlusQuirk.class, ImageCapturePixelHDRPlusQuirk.f())) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        if (l02.a(ExtraCroppingQuirk.class, ExtraCroppingQuirk.h())) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        if (l02.a(Nexus4AndroidLTargetAspectRatioQuirk.class, Nexus4AndroidLTargetAspectRatioQuirk.g())) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (l02.a(ExcludedSupportedSizesQuirk.class, ExcludedSupportedSizesQuirk.s())) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        if (l02.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.f())) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (l02.a(PreviewPixelHDRnetQuirk.class, PreviewPixelHDRnetQuirk.f())) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        if (l02.a(StillCaptureFlashStopRepeatingQuirk.class, StillCaptureFlashStopRepeatingQuirk.f())) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        if (l02.a(ExtraSupportedSurfaceCombinationsQuirk.class, ExtraSupportedSurfaceCombinationsQuirk.k())) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        if (l02.a(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.g())) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if (l02.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, RepeatingStreamConstraintForVideoRecordingQuirk.g())) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (l02.a(TextureViewIsClosedQuirk.class, TextureViewIsClosedQuirk.f())) {
            arrayList.add(new TextureViewIsClosedQuirk());
        }
        if (l02.a(CaptureSessionOnClosedNotCalledQuirk.class, CaptureSessionOnClosedNotCalledQuirk.f())) {
            arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
        }
        if (l02.a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.f())) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        if (l02.a(ZslDisablerQuirk.class, ZslDisablerQuirk.i())) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if (l02.a(ExtraSupportedOutputSizeQuirk.class, ExtraSupportedOutputSizeQuirk.i())) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        if (l02.a(InvalidVideoProfilesQuirk.class, InvalidVideoProfilesQuirk.s())) {
            arrayList.add(new InvalidVideoProfilesQuirk());
        }
        if (l02.a(Preview3AThreadCrashQuirk.class, Preview3AThreadCrashQuirk.f())) {
            arrayList.add(new Preview3AThreadCrashQuirk());
        }
        if (l02.a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.g())) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        if (l02.a(CaptureSessionShouldUseMrirQuirk.class, CaptureSessionShouldUseMrirQuirk.f())) {
            arrayList.add(new CaptureSessionShouldUseMrirQuirk());
        }
        return arrayList;
    }
}
