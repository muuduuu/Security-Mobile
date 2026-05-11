package androidx.camera.camera2.internal.compat.quirk;

import A.AbstractC0700h0;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.M0;
import androidx.camera.core.impl.P0;
import java.util.ArrayList;
import u.C4832C;

/* loaded from: classes.dex */
public abstract class a {
    public static P0 a(String str, C4832C c4832c) {
        L0 a10 = M0.b().a();
        ArrayList arrayList = new ArrayList();
        if (a10.a(AeFpsRangeLegacyQuirk.class, AeFpsRangeLegacyQuirk.h(c4832c))) {
            arrayList.add(new AeFpsRangeLegacyQuirk(c4832c));
        }
        if (a10.a(AspectRatioLegacyApi21Quirk.class, AspectRatioLegacyApi21Quirk.g(c4832c))) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (a10.a(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.f(c4832c))) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        if (a10.a(JpegCaptureDownsizingQuirk.class, JpegCaptureDownsizingQuirk.f(c4832c))) {
            arrayList.add(new JpegCaptureDownsizingQuirk());
        }
        if (a10.a(CamcorderProfileResolutionQuirk.class, CamcorderProfileResolutionQuirk.g(c4832c))) {
            arrayList.add(new CamcorderProfileResolutionQuirk(c4832c));
        }
        if (a10.a(CaptureNoResponseQuirk.class, CaptureNoResponseQuirk.f(c4832c))) {
            arrayList.add(new CaptureNoResponseQuirk());
        }
        if (a10.a(LegacyCameraOutputConfigNullPointerQuirk.class, LegacyCameraOutputConfigNullPointerQuirk.f(c4832c))) {
            arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
        }
        if (a10.a(LegacyCameraSurfaceCleanupQuirk.class, LegacyCameraSurfaceCleanupQuirk.g(c4832c))) {
            arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
        }
        if (a10.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.f(c4832c))) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        if (a10.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.f(c4832c))) {
            arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        if (a10.a(YuvImageOnePixelShiftQuirk.class, YuvImageOnePixelShiftQuirk.l(c4832c))) {
            arrayList.add(new YuvImageOnePixelShiftQuirk());
        }
        if (a10.a(FlashTooSlowQuirk.class, FlashTooSlowQuirk.g(c4832c))) {
            arrayList.add(new FlashTooSlowQuirk());
        }
        if (a10.a(AfRegionFlipHorizontallyQuirk.class, AfRegionFlipHorizontallyQuirk.f(c4832c))) {
            arrayList.add(new AfRegionFlipHorizontallyQuirk());
        }
        if (a10.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, ConfigureSurfaceToSecondarySessionFailQuirk.f(c4832c))) {
            arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        if (a10.a(PreviewOrientationIncorrectQuirk.class, PreviewOrientationIncorrectQuirk.f(c4832c))) {
            arrayList.add(new PreviewOrientationIncorrectQuirk());
        }
        if (a10.a(CaptureSessionStuckQuirk.class, CaptureSessionStuckQuirk.f(c4832c))) {
            arrayList.add(new CaptureSessionStuckQuirk());
        }
        if (a10.a(ImageCaptureFlashNotFireQuirk.class, ImageCaptureFlashNotFireQuirk.f(c4832c))) {
            arrayList.add(new ImageCaptureFlashNotFireQuirk());
        }
        if (a10.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.f(c4832c))) {
            arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (a10.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.f(c4832c))) {
            arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        if (a10.a(IncorrectCaptureStateQuirk.class, IncorrectCaptureStateQuirk.f(c4832c))) {
            arrayList.add(new IncorrectCaptureStateQuirk());
        }
        if (a10.a(TorchFlashRequiredFor3aUpdateQuirk.class, TorchFlashRequiredFor3aUpdateQuirk.k(c4832c))) {
            arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(c4832c));
        }
        if (a10.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, PreviewStretchWhenVideoCaptureIsBoundQuirk.l())) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (a10.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, PreviewDelayWhenVideoCaptureIsBoundQuirk.f())) {
            arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (a10.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.m())) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (a10.a(TemporalNoiseQuirk.class, TemporalNoiseQuirk.g(c4832c))) {
            arrayList.add(new TemporalNoiseQuirk());
        }
        if (a10.a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.h())) {
            arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        if (a10.a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.g())) {
            arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
        }
        P0 p02 = new P0(arrayList);
        AbstractC0700h0.a("CameraQuirks", "camera2 CameraQuirks = " + P0.d(p02));
        return p02;
    }
}
